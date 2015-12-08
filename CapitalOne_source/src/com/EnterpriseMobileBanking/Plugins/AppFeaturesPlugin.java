// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.AppFeatures;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.api.LegacyContext;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

public class AppFeaturesPlugin extends Plugin
{

    private static final String TAG = "AppFeaturesPlugin";
    public final String ACTION_IS_FEATURE = "isFeatureEnabled";
    public final String ACTION_SET_FEATURE = "setFeatureEnabled";

    public AppFeaturesPlugin()
    {
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        android.app.Activity activity;
        Log.d("AppFeaturesPlugin", "-- Start --");
        activity = ctx.getActivity();
        new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        if (!"isFeatureEnabled".equals(s)) goto _L2; else goto _L1
_L1:
        boolean flag;
        jsonarray = jsonarray.getString(0);
        flag = AppFeatures.getInstance().isFeatureEnabled(activity, jsonarray);
        Log.d("AppFeaturesPlugin", (new StringBuilder()).append("Getting feature: ").append(jsonarray).append(" value: ").append(flag).toString());
        if (flag)
        {
            jsonarray = "true";
        } else
        {
            jsonarray = "false";
        }
        Log.d("AppFeaturesPlugin", (new StringBuilder()).append("action: ").append(s).append(" result: ").append(jsonarray).toString());
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, jsonarray);
        success(s, s1);
_L3:
        Log.d("AppFeaturesPlugin", "-- End --");
        return s;
        s;
_L7:
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, s.toString());
        error(s, s1);
          goto _L3
_L2:
        if (!"setFeatureEnabled".equals(s)) goto _L5; else goto _L4
_L4:
        s = jsonarray.getString(0);
        boolean flag1 = Boolean.parseBoolean(jsonarray.getString(1));
        AppFeatures.getInstance().setFeatureEnabled(activity, s, flag1);
        Log.e("AppFeaturesPlugin", (new StringBuilder()).append("Feature: ").append(s).append(" not enabled").toString());
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, "Feature not enabled.");
        error(s, s1);
          goto _L3
        s;
_L6:
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, s.toString());
        error(s, s1);
          goto _L3
_L5:
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, (new StringBuilder()).append("action: ").append(s).append(" is unsupported").toString());
        error(s, s1);
          goto _L3
        s;
          goto _L6
        s;
          goto _L7
    }
}
