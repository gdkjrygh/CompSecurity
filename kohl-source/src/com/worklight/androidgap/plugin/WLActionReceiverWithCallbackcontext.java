// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.api.WLActionReceiver;
import com.worklight.common.Logger;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONException;
import org.json.JSONObject;

public class WLActionReceiverWithCallbackcontext
    implements WLActionReceiver
{

    private static Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WLActionReceiverWithCallbackcontext.getName());
    private CallbackContext callbackContext;

    public WLActionReceiverWithCallbackcontext(CallbackContext callbackcontext)
    {
        callbackContext = callbackcontext;
    }

    public void onActionReceived(String s, JSONObject jsonobject)
    {
        logger.debug((new StringBuilder()).append("onActionReceived :: action :: ").append(s).append(", data :: ").append(jsonobject).toString());
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            jsonobject1.put("action", s);
            jsonobject1.put("data", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            logger.debug("onActionReceived :: failed to generate JSON response");
        }
        s = new PluginResult(org.apache.cordova.PluginResult.Status.OK, jsonobject1);
        s.setKeepCallback(true);
        callbackContext.sendPluginResult(s);
        logger.debug("onActionReceived :: sent to JS");
    }

    public void releaseCallbackContext()
    {
        logger.debug("releaseCallbackContext");
        callbackContext.error(0);
    }

}
