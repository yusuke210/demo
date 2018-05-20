package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoController {

    @GetMapping("")
    public String hello(Model model) {
        String userName = "yusuke";
        String age = "26";
        model.addAttribute("username", userName);
        model.addAttribute("age", age);
        return "hello";
    }

    @PostMapping("change")
    public String change(Model model) {
        String userName = "no name";
        String age = "no age";
        model.addAttribute("username", userName);
        model.addAttribute("age", age);
        return "change";
    }
}
