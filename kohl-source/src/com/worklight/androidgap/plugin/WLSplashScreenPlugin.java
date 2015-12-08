// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.api.WL;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class WLSplashScreenPlugin extends CordovaPlugin
{

    private static final String ACTION_HIDE = "hide";
    private static final String ACTION_SHOW = "show";

    public WLSplashScreenPlugin()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if ("show".equals(s))
        {
            WL.getInstance().showSplashScreen(cordova.getActivity());
            return true;
        }
        if ("hide".equals(s))
        {
            WL.getInstance().hideSplashScreen();
            return true;
        } else
        {
            return false;
        }
    }
}
