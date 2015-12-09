// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.EnterpriseMobileBanking;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

public class LeftNavPlugin extends Plugin
{

    public LeftNavPlugin()
    {
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        if (s.equals("setSelectedMenuItem"))
        {
            s = jsonarray.optString(0, "");
            Log.i("LeftNavPlugin", (new StringBuilder()).append("setSelectedMenuItem( ").append(s).append(" )").toString());
            EnterpriseMobileBanking.setSelectedMenuItem(s);
        } else
        if (s.equals("setAuthenticated"))
        {
            EnterpriseMobileBanking.setAuthenticated(jsonarray.optBoolean(0, false));
            return s1;
        }
        return s1;
    }
}
