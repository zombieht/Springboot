package Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/test")
@EnableAutoConfiguration
public class SimpleController {

//    @RequestMapping("/")
//    @ResponseBody
//    public Map<String,String> index(){
//        Map<String,String> resultMap = new HashMap<String,String>();
//        resultMap.put("key","Hello World!!!");
//        return resultMap;
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(SimpleController.class,args);
//    }


    @ResponseBody
    @RequestMapping(value = "/a")
    String home() {   
        return "Hello World!";
    }
 
//    public static void main(String[] args) throws Exception {
//        SpringApplication.run(SimpleController.class, args);
//    }
// 
    
}