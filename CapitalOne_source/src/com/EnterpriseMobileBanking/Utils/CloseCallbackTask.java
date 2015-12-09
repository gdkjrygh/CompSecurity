// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Utils;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import org.json.JSONArray;

// Referenced classes of package com.EnterpriseMobileBanking.Utils:
//            CallbackTask, Log, CallbackTaskFactory

public class CloseCallbackTask extends CallbackTask
    implements Runnable
{

    public static final int CAPITALONE_360_LOB = 0x7f080081;
    public static final int CAPITALONE_BANK_LOB = 0x7f080080;
    public static final int CAPITALONE_CARD_LOB = 0x7f08007f;
    private static final String TAG = "CloseCBT";
    private static final String actions[] = {
        "closeInnerWebView"
    };
    private WebView view;

    private CloseCallbackTask()
    {
        view = null;
    }

    private CloseCallbackTask(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        super(s, jsonarray, webviewlinker);
        view = null;
    }

    public static void load()
    {
        Log.d("CloseCBT", (new StringBuilder()).append("Adding ").append(actions.toString()).toString());
        CallbackTaskFactory.addCallbackTask(new CloseCallbackTask(), actions);
    }

    public CallbackTask create(String s, JSONArray jsonarray, WebViewLinker webviewlinker)
    {
        Log.d("CloseCBT", (new StringBuilder()).append("Create: ").append(s).toString());
        return new CloseCallbackTask(s, jsonarray, webviewlinker);
    }

    public void execute(WebView webview)
    {
        Log.d("CloseCBT", "Executing");
        if (webview == null || callbackId == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        view = webview;
        WebView webview1 = view;
        webview1;
        JVM INSTR monitorenter ;
        webview.getHandler().post(this);
        Log.d("CloseCBT", (new StringBuilder()).append("Waiting for VIEW: ").append(callbackId).toString());
        webview.wait();
        Log.d("CloseCBT", (new StringBuilder()).append("View done: ").append(callbackId).toString());
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
_L2:
        view = null;
        return;
        webview;
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, this);
        if (true) goto _L2; else goto _L1
_L1:
        webview;
        webview1;
        JVM INSTR monitorexit ;
        throw webview;
        appLink.sendPluginResult(org.apache.cordova.api.PluginResult.Status.OK, this);
        return;
    }

    public void run()
    {
        synchronized (view)
        {
            if (AppHelper.getLastLob() != 0x7f080081)
            {
                Log.d("CloseCBT", "Stopping view  ");
                view.stopLoading();
                view.loadUrl("about:blank");
            }
            view.setVisibility(8);
            view.setEnabled(false);
            Log.d("CloseCBT", "Resetting Touch listener");
            view.setOnTouchListener(new android.view.View.OnTouchListener() {

                final CloseCallbackTask this$0;

                public boolean onTouch(View view1, MotionEvent motionevent)
                {
                    return false;
                }

            
            {
                this$0 = CloseCallbackTask.this;
                super();
            }
            });
            view.clearHistory();
            view.notify();
        }
        return;
        exception;
        webview;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
