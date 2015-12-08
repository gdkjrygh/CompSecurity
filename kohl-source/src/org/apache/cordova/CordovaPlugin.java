// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.Intent;
import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            CordovaArgs, CordovaInterface, CordovaPreferences, CordovaWebView, 
//            CallbackContext

public class CordovaPlugin
{

    static final boolean $assertionsDisabled;
    public CordovaInterface cordova;
    public String id;
    protected CordovaPreferences preferences;
    public CordovaWebView webView;

    public CordovaPlugin()
    {
    }

    public boolean execute(String s, String s1, CallbackContext callbackcontext)
        throws JSONException
    {
        return execute(s, new JSONArray(s1), callbackcontext);
    }

    public boolean execute(String s, CordovaArgs cordovaargs, CallbackContext callbackcontext)
        throws JSONException
    {
        return false;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        return execute(s, new CordovaArgs(jsonarray), callbackcontext);
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
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

    protected void pluginInitialize()
    {
    }

    public final void privateInitialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview, CordovaPreferences cordovapreferences)
    {
        if (!$assertionsDisabled && cordova != null)
        {
            throw new AssertionError();
        } else
        {
            cordova = cordovainterface;
            webView = cordovawebview;
            preferences = cordovapreferences;
            initialize(cordovainterface, cordovawebview);
            pluginInitialize();
            return;
        }
    }

    public Uri remapUri(Uri uri)
    {
        return null;
    }

    static 
    {
        boolean flag;
        if (!org/apache/cordova/CordovaPlugin.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
