// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import java.util.concurrent.ExecutorService;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.api:
//            CordovaPlugin, PluginResult, CallbackContext, CordovaInterface, 
//            LegacyContext

public abstract class Plugin extends CordovaPlugin
{

    public LegacyContext ctx;

    public Plugin()
    {
    }

    public void error(String s, String s1)
    {
        webView.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, s), s1);
    }

    public void error(PluginResult pluginresult, String s)
    {
        webView.sendPluginResult(pluginresult, s);
    }

    public void error(JSONObject jsonobject, String s)
    {
        webView.sendPluginResult(new PluginResult(PluginResult.Status.ERROR, jsonobject), s);
    }

    public abstract PluginResult execute(String s, JSONArray jsonarray, String s1);

    public boolean execute(final String action, final JSONArray args, CallbackContext callbackcontext)
        throws JSONException
    {
        final String callbackId = callbackcontext.getCallbackId();
        boolean flag;
        if (!isSynch(action))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            cordova.getThreadPool().execute(new Runnable() {

                final Plugin this$0;
                final String val$action;
                final JSONArray val$args;
                final String val$callbackId;

                public void run()
                {
                    PluginResult pluginresult;
                    try
                    {
                        pluginresult = execute(action, args, callbackId);
                    }
                    catch (Throwable throwable)
                    {
                        throwable = new PluginResult(PluginResult.Status.ERROR, throwable.getMessage());
                    }
                    sendPluginResult(pluginresult, callbackId);
                }

            
            {
                this$0 = Plugin.this;
                action = s;
                args = jsonarray;
                callbackId = s1;
                super();
            }
            });
            return true;
        }
        args = execute(action, args, callbackId);
        action = args;
        if (args == null)
        {
            action = new PluginResult(PluginResult.Status.NO_RESULT);
        }
        callbackcontext.sendPluginResult(action);
        return true;
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        setContext(cordovainterface);
        setView(cordovawebview);
    }

    public boolean isSynch(String s)
    {
        return false;
    }

    public void sendJavascript(String s)
    {
        webView.sendJavascript(s);
    }

    public void sendPluginResult(PluginResult pluginresult, String s)
    {
        webView.sendPluginResult(pluginresult, s);
    }

    public void setContext(CordovaInterface cordovainterface)
    {
        cordova = cordovainterface;
        ctx = new LegacyContext(cordova);
    }

    public void setView(CordovaWebView cordovawebview)
    {
        webView = cordovawebview;
    }

    public void success(String s, String s1)
    {
        webView.sendPluginResult(new PluginResult(PluginResult.Status.OK, s), s1);
    }

    public void success(PluginResult pluginresult, String s)
    {
        webView.sendPluginResult(pluginresult, s);
    }

    public void success(JSONObject jsonobject, String s)
    {
        webView.sendPluginResult(new PluginResult(PluginResult.Status.OK, jsonobject), s);
    }
}
