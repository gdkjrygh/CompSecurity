// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import com.EnterpriseMobileBanking.Utils.Log;
import org.apache.cordova.api.PluginResult;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            WebViewLinker

class val.cbId
    implements Runnable
{

    final WebViewLinker this$0;
    final String val$cbId;
    final org.apache.cordova.api.tus val$status;

    public void run()
    {
        PluginResult pluginresult = new PluginResult(val$status);
        pluginresult.setKeepCallback(false);
        if (val$status != org.apache.cordova.api.tus.OK)
        {
            Log.i("WebViewLinker", (new StringBuilder()).append("Error Callback for: ").append(val$cbId).toString());
            error(pluginresult, val$cbId);
            return;
        } else
        {
            Log.i("WebViewLinker", (new StringBuilder()).append("Success Callback for: ").append(val$cbId).toString());
            success(pluginresult, val$cbId);
            return;
        }
    }

    _cls9()
    {
        this$0 = final_webviewlinker;
        val$status = tus;
        val$cbId = String.this;
        super();
    }
}
