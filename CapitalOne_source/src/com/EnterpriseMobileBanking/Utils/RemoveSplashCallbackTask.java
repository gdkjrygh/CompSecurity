// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.os.Handler;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, Log, CallbackTaskFactory

public class RemoveSplashCallbackTask extends CallbackTask
    implements Runnable
{

    private static final String TAG = "RemoveSplashCBT";
    private static final String actions[] = {
        "removeSplash"
    };

    private RemoveSplashCallbackTask()
    {
    }

    private RemoveSplashCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
    }

    public static void load()
    {
        Log.d("RemoveSplashCBT", (new StringBuilder()).append("Adding ").append(actions.toString()).toString());
        CallbackTaskFactory.addCallbackTask(new RemoveSplashCallbackTask(), actions);
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        Log.d("RemoveSplashCBT", (new StringBuilder()).append("Create: ").append(s).toString());
        return new RemoveSplashCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        Log.d("RemoveSplashCBT", "Execute Splash screen removal");
        webview.getHandler().post(this);
    }

    public void run()
    {
        Log.d("RemoveSplashCBT", "Remove the splashscreen");
        AppHelper.removeSplash();
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
    }

}
