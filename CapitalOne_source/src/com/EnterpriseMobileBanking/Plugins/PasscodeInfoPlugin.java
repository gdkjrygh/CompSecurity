// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PasscodeInfoPlugin extends Plugin
{

    public PasscodeInfoPlugin()
    {
    }

    private String resultAsJSONString()
    {
        String s;
        try
        {
            s = (new JSONObject()).put("PasscodeState", "State").put("LockPatternEnabled", "false").put("Quality", "LOW").toString();
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return (new StringBuilder()).append("{ \"Error\" : \"").append(jsonexception.getMessage()).append("\" }").toString();
        }
        return s;
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, resultAsJSONString());
    }
}
