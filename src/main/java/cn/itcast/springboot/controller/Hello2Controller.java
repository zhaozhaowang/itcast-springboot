package cn.itcast.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class Hello2Controller {

    @GetMapping("show2")
    public String test(){
        return "hello springboot 2";
    }

}
