// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;

public class RemoteWebViewPlugin extends Plugin
{

    private static final String TAG = "RemoteWebViewPlugin";

    public RemoteWebViewPlugin()
    {
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.NO_RESULT);
        if (s.equals("open"))
        {
            s = jsonarray.optString(0, "");
            Log.v("RemoteWebViewPlugin", (new StringBuilder()).append("url: ").append(s).toString());
            jsonarray = AppHelper.getTransiteView();
            AppHelper.getAppView().stopLoading();
            jsonarray.stopLoading();
            jsonarray.loadUrl("about:blank");
            jsonarray.loadUrl(s);
            if (!s.contains("freezeCard=true"))
            {
                jsonarray.setVisibility(0);
            }
            s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        }
        return s1;
    }
}
