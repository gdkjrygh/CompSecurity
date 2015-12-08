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

class b extends WebViewClient
{

    WebCollectorTask a;
    final a b;

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

    a(a a1)
    {
        b = a1;
        super();
        a = b.b;
    }

    // Unreferenced inner class com/devicecollector/collectors/WebCollectorTask$1

/* anonymous class */
    class WebCollectorTask._cls1
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
            websettings.setPluginState(android.webkit.WebSettings.PluginState.ON);
            WebCollectorTask.a(webcollectortask).setWebViewClient(new WebCollectorTask._cls1._cls1(this));
            WebCollectorTask.a(webcollectortask).setWebChromeClient(new WebCollectorTask._cls1._cls2());
            WebCollectorTask.a(webcollectortask).loadUrl(a);
        }

            
            {
                b = webcollectortask;
                a = s;
                super();
            }

        // Unreferenced inner class com/devicecollector/collectors/WebCollectorTask$1$2

/* anonymous class */
        class WebCollectorTask._cls1._cls2 extends WebChromeClient
        {

            final WebCollectorTask._cls1 a;

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                return WebCollectorTask.a(a.b, consolemessage);
            }

                    
                    {
                        a = WebCollectorTask._cls1.this;
                        super();
                    }
        }

    }

}
