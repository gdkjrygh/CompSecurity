// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import android.content.Intent;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova.api:
//            CordovaInterface, CallbackContext

public class CordovaPlugin
{

    static final boolean $assertionsDisabled;
    public CordovaInterface cordova;
    public String id;
    public CordovaWebView webView;

    public CordovaPlugin()
    {
    }

    public boolean execute(String s, String s1, CallbackContext callbackcontext)
        throws JSONException
    {
        return execute(s, new JSONArray(s1), callbackcontext);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        return false;
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        if (!$assertionsDisabled && cordova != null)
        {
            throw new AssertionError();
        } else
        {
            cordova = cordovainterface;
            webView = cordovawebview;
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
    }

    public void onDestroy()
    {
    }

    public Object onMessage(String s, Object obj)
    {
        return null;
    }

    public void onNewIntent(Intent intent)
    {
    }

    public boolean onOverrideUrlLoading(String s)
    {
        return false;
    }

    public void onPause(boolean flag)
    {
    }

    public void onReset()
    {
    }

    public void onResume(boolean flag)
    {
    }

    static 
    {
        boolean flag;
        if (!org/apache/cordova/api/CordovaPlugin.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
