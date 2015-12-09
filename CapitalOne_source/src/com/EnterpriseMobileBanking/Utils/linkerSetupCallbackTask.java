// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.webkit.WebView;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, Log, CallbackTaskFactory

public class linkerSetupCallbackTask extends CallbackTask
{

    private static final String TAG = "linkerSetupCBT";
    private static final String actions[] = {
        "linkerSetup"
    };

    private linkerSetupCallbackTask()
    {
    }

    private linkerSetupCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
    }

    public static void load()
    {
        Log.d("linkerSetupCBT", "Loading");
        CallbackTaskFactory.addCallbackTask(new linkerSetupCallbackTask(), actions);
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        Log.d("linkerSetupCBT", (new StringBuilder()).append("Create: ").append(s).toString());
        return new linkerSetupCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        if (parameters != null && parameters.length() > 0)
        {
            WebViewLinker.setOutsideAppList(parameters);
            appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
            return;
        } else
        {
            appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, this);
            return;
        }
    }

}
