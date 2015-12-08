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

public class GoBackCallbackTask extends CallbackTask
    implements Runnable
{

    private static final String TAG = "GoBackCBT";
    private static final String actions[] = {
        "goBack"
    };
    private WebView view;

    private GoBackCallbackTask()
    {
        view = null;
    }

    private GoBackCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
        view = null;
    }

    public static void load()
    {
        Log.d("GoBackCBT", "Loading");
        CallbackTaskFactory.addCallbackTask(new GoBackCallbackTask(), actions);
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        return new GoBackCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        view = webview;
        webview.getHandler().post(this);
    }

    public void run()
    {
        String s = "goBack();";
        if (view.getUrl() == null || !view.getUrl().contains("terms_od")) goto _L2; else goto _L1
_L1:
        appLink.execute("closeInnerWebView", new JSONArray(), "cbInternal");
        s = "Ext.dispatch({controller : 'RDCController',action : 'backtoTAndC'});";
_L4:
        if (s != null)
        {
            appLink.sendJavascript(s);
        }
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
        return;
_L2:
        if (view.getVisibility() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s1 = "goBackFlow( );";
        if (!view.canGoBack())
        {
            s = s1;
            if (!view.getUrl().contains(AppHelper.getAppString(0x7f090121)))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (view.getUrl().endsWith(AppHelper.getAppString(0x7f090113)) || view.getUrl().endsWith(AppHelper.getAppString(0x7f090114)) || view.getUrl().contains(AppHelper.getAppString(0x7f090121)))
        {
            s = "reloadLastFlow();";
            view.setTag(Boolean.valueOf(true));
        } else
        {
            s = s1;
            if (!view.getUrl().contains(AppHelper.getAppString(0x7f0900ee)))
            {
                s = null;
                view.goBack();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
