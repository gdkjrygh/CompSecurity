// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

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
