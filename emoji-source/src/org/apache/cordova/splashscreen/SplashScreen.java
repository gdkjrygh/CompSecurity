// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.splashscreen;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;

public class SplashScreen extends CordovaPlugin
{

    public SplashScreen()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        if (s.equals("hide"))
        {
            webView.postMessage("splashscreen", "hide");
        } else
        if (s.equals("show"))
        {
            webView.postMessage("splashscreen", "show");
        } else
        {
            return false;
        }
        callbackcontext.success();
        return true;
    }
}
