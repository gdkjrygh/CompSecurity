// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.util.Log;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class Logger extends Plugin
{

    private String logCat;

    public Logger()
    {
        logCat = "";
    }

    public void debug(String s)
    {
        Log.d(logCat, s);
    }

    public void error(String s)
    {
        Log.e(logCat, s);
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = org.apache.cordova.api.PluginResult.Status.OK;
        if (!s.equals("DEBUG")) goto _L2; else goto _L1
_L1:
        debug(jsonarray.getString(0));
_L4:
        return new PluginResult(s1, "");
_L2:
        if (s.equals("ERROR"))
        {
            error(jsonarray.getString(0));
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION);
    }

    public boolean isSynch(String s)
    {
        return true;
    }

    public void setContext(CordovaInterface cordovainterface)
    {
        logCat = cordovainterface.getClass().getSimpleName();
    }
}
