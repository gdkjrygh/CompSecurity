// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.ui:
//            WebViewActivity

class init> extends WebChromeClient
{

    final WebViewActivity a;

    public void onConsoleMessage(String s, int i, String s1)
    {
        com.fitbit.e.a.a("WebViewActivity", "string:%s in %s message", new Object[] {
            Integer.valueOf(i), s1
        });
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.dater dater)
    {
        dater.updateQuota(2L * l1);
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        if (b.a.a())
        {
            com.fitbit.e.a.a("Alert", ">> url :%s, msg: %s", new Object[] {
                s, s1
            });
        }
        jsresult.confirm();
        return false;
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        return super.onJsConfirm(webview, s, s1, jsresult);
    }

    public void onProgressChanged(WebView webview, int i)
    {
        webview = a;
        boolean flag;
        if (i >= 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        webview.f = flag;
        a.runOnUiThread(a.e);
    }

    pdater(WebViewActivity webviewactivity)
    {
        a = webviewactivity;
        super();
    }
}
