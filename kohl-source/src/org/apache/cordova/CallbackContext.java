// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            PluginResult, CordovaWebView

public class CallbackContext
{

    private static final String LOG_TAG = "CordovaPlugin";
    private String callbackId;
    private int changingThreads;
    private boolean finished;
    private CordovaWebView webView;

    public CallbackContext(String s, CordovaWebView cordovawebview)
    {
        callbackId = s;
        webView = cordovawebview;
    }

    public void error(int i)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, i));
    }

    public void error(String s)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, s));
    }

    public void error(JSONObject jsonobject)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.ERROR, jsonobject));
    }

    public String getCallbackId()
    {
        return callbackId;
    }

    public boolean isChangingThreads()
    {
        return changingThreads > 0;
    }

    public boolean isFinished()
    {
        return finished;
    }

    public void sendPluginResult(PluginResult pluginresult)
    {
        this;
        JVM INSTR monitorenter ;
        if (!finished)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        Log.w("CordovaPlugin", (new StringBuilder()).append("Attempted to send a second callback for ID: ").append(callbackId).append("\nResult was: ").append(pluginresult.getMessage()).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag;
        if (!pluginresult.getKeepCallback())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        finished = flag;
        this;
        JVM INSTR monitorexit ;
        webView.sendPluginResult(pluginresult, callbackId);
        return;
        pluginresult;
        this;
        JVM INSTR monitorexit ;
        throw pluginresult;
    }

    public void success()
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK));
    }

    public void success(int i)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, i));
    }

    public void success(String s)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, s));
    }

    public void success(JSONArray jsonarray)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, jsonarray));
    }

    public void success(JSONObject jsonobject)
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, jsonobject));
    }

    public void success(byte abyte0[])
    {
        sendPluginResult(new PluginResult(PluginResult.Status.OK, abyte0));
    }
}
