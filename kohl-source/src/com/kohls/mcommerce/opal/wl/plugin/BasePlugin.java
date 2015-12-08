// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl.plugin;

import com.kohls.mcommerce.opal.helper.db.DBOperationsHelper;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class BasePlugin extends CordovaPlugin
{

    protected String TAG;
    private CallbackContext callbackContext;
    private DBOperationsHelper helper;

    public BasePlugin()
    {
        TAG = getClass().getSimpleName();
    }

    private void sendPluginResult(org.apache.cordova.PluginResult.Status status, String s)
    {
        status = new PluginResult(status, s);
        callbackContext.sendPluginResult(status);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        callbackContext = callbackcontext;
        return performAction(s, jsonarray);
    }

    protected DBOperationsHelper getHelper()
    {
        if (helper == null)
        {
            helper = new DBOperationsHelper();
        }
        return helper;
    }

    public abstract boolean performAction(String s, JSONArray jsonarray)
        throws JSONException;

    protected void sendError()
    {
        sendError("");
    }

    protected void sendError(String s)
    {
        sendPluginResult(org.apache.cordova.PluginResult.Status.ERROR, s);
    }

    protected void sendSuccess()
    {
        sendSuccess("{}");
    }

    protected void sendSuccess(String s)
    {
        sendPluginResult(org.apache.cordova.PluginResult.Status.OK, s);
    }
}
