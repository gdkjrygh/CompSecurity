// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.WLTrusteer;
import java.util.Locale;
import java.util.ResourceBundle;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class WLTrusteerPlugin extends CordovaPlugin
{

    private static final String ACTION_GET_RISK_ASSESSMENT = "getRiskAssessment";
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";

    public WLTrusteerPlugin()
    {
    }

    private boolean doGetRiskAssessment(CallbackContext callbackcontext)
        throws JSONException
    {
        Object obj;
        if (WLTrusteer.hasTrusteerSDK())
        {
            obj = WLTrusteer.getInstance().getRiskAssessment();
            obj = new PluginResult(org.apache.cordova.PluginResult.Status.OK, ((org.json.JSONObject) (obj)));
        } else
        {
            obj = ResourceBundle.getBundle("com/worklight/wlclient/messages", Locale.getDefault());
            obj = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, ((ResourceBundle) (obj)).getString("WLClient.trusteerSDKError"));
        }
        callbackcontext.sendPluginResult(((PluginResult) (obj)));
        return true;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        if ("getRiskAssessment".equals(s))
        {
            return doGetRiskAssessment(callbackcontext);
        } else
        {
            return false;
        }
    }
}
