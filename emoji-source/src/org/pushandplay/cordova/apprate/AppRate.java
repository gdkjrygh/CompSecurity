// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.pushandplay.cordova.apprate;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class AppRate extends CordovaPlugin
{

    public AppRate()
    {
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        boolean flag = false;
        jsonarray = cordova.getActivity().getPackageManager();
        if (!s.equals("getAppVersion"))
        {
            break MISSING_BLOCK_LABEL_51;
        }
        callbackcontext.success(jsonarray.getPackageInfo(cordova.getActivity().getPackageName(), 0).versionName);
        return true;
        if (!s.equals("getAppTitle"))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        s = jsonarray.getApplicationInfo(cordova.getActivity().getApplicationContext().getApplicationInfo().packageName, 0);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s = jsonarray.getApplicationLabel(s);
_L1:
        callbackcontext.success((String)(String)s);
        return true;
        s = "Unknown";
          goto _L1
        s;
        callbackcontext.success("N/A");
        flag = true;
        return flag;
    }
}
