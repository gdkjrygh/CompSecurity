// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppHelper;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

public class KeyboardPlugin extends Plugin
{

    public KeyboardPlugin()
    {
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        AppHelper.hideKeyboard();
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
    }
}
