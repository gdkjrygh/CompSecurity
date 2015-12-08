// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl.plugin;

import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.wl.WLActivity;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BackButtonPlugin extends CordovaPlugin
{

    private final String ACTION_BACK_LISTENER = "ACTION_BACK_LISTENER";
    private final String ACTION_FINISH = "FINISH";
    private final String TAG = "BackButtonPlugin";
    private CallbackContext listenerCallbackContext;

    public BackButtonPlugin()
    {
        Logger.debug("BackButtonPlugin", "Constructing");
    }

    private boolean bindListener(JSONArray jsonarray, CallbackContext callbackcontext)
    {
        Logger.debug("BackButtonPlugin", "bindListener");
        listenerCallbackContext = callbackcontext;
        (new PluginResult(org.apache.cordova.PluginResult.Status.OK)).setKeepCallback(true);
        return true;
    }

    private void finishActivity()
    {
        WLActivity wlactivity = (WLActivity)cordova.getActivity();
        if (wlactivity != null)
        {
            wlactivity.endActivity();
            return;
        } else
        {
            Logger.error("BackButtonPlugin", "Activity instance is null");
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        Logger.debug("BackButtonPlugin", (new StringBuilder()).append("execute :: ").append(toString()).toString());
        if ("ACTION_BACK_LISTENER".equals(s))
        {
            return bindListener(jsonarray, callbackcontext);
        }
        if ("FINISH".equals(s))
        {
            finishActivity();
            return true;
        } else
        {
            return false;
        }
    }

    public void reportEvent()
    {
        Object obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("eventType", "backClick");
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        Logger.debug("BackButtonPlugin", "reportEvent");
        obj = new PluginResult(org.apache.cordova.PluginResult.Status.OK, ((JSONObject) (obj)));
        ((PluginResult) (obj)).setKeepCallback(true);
        listenerCallbackContext.sendPluginResult(((PluginResult) (obj)));
    }
}
