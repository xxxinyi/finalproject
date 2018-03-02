/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameServer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author macpro
 */
public class transcript {
    private List<String> transcript = Collections.synchronizedList(new ArrayList<String>());
    
    public transcript() {
        
    }

    public void addScore(String score) { transcript.add(score); }
    public String getScore(int n) { return transcript.get(n); }
}

