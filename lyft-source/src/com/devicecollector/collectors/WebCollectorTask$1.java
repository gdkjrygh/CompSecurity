// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devicecollector.collectors;

import android.app.Activity;
import android.net.http.SslError;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.devicecollector.collectors:
//            WebCollectorTask

class a
    implements Runnable
{

    final String a;
    final WebCollectorTask b;

    public void run()
    {
        WebCollectorTask webcollectortask = b;
        WebCollectorTask.a(webcollectortask, new WebView(b.a.getApplicationContext()));
        WebSettings websettings = WebCollectorTask.a(webcollectortask).getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setDomStorageEnabled(true);
        websettings.setPluginState(android.webkit.tate.ON);
        WebCollectorTask.a(webcollectortask).setWebViewClient(new WebViewClient() {

            WebCollectorTask a;
            final WebCollectorTask._cls1 b;

            public void onLoadResource(WebView webview, String s)
            {
                WebCollectorTask.a(a, webview, s);
            }

            public void onPageFinished(WebView webview, String s)
            {
                WebCollectorTask.b(a, webview, s);
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                WebCollectorTask.a(a, webview, i, s, s1);
            }

            public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                WebCollectorTask.a(a, webview, sslerrorhandler, sslerror);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                return WebCollectorTask.c(a, webview, s);
            }

            
            {
                b = WebCollectorTask._cls1.this;
                super();
                a = b.b;
            }
        });
        WebCollectorTask.a(webcollectortask).setWebChromeClient(new WebChromeClient() {

            final WebCollectorTask._cls1 a;

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                return WebCollectorTask.a(a.b, consolemessage);
            }

            
            {
                a = WebCollectorTask._cls1.this;
                super();
            }
        });
        WebCollectorTask.a(webcollectortask).loadUrl(a);
    }

    _cls2.a(WebCollectorTask webcollectortask, String s)
    {
        b = webcollectortask;
        a = s;
        super();
    }
}
