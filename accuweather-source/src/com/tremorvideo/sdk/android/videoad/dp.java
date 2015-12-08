// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ct

public abstract class dp extends RelativeLayout
{
    protected class a extends WebViewClient
    {

        final dp a;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            ct.d((new StringBuilder()).append("HTML5 error: ").append(s1).toString());
            ct.d((new StringBuilder()).append("HTML5 error: ").append(s).toString());
            if (a.b != null)
            {
                a.b.a((new StringBuilder()).append(s1).append(" - ").append(s).toString());
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            while (a.a == null || !s.startsWith("event://tremorvideo.com/")) 
            {
                return false;
            }
            webview = s.replace("event://tremorvideo.com/", "");
            a.a.a(webview);
            return true;
        }

        protected a()
        {
            a = dp.this;
            super();
        }
    }

    protected class b extends a
    {

        final dp b;

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            ct.d("SSL Error");
            sslerrorhandler.proceed();
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        }

        protected b()
        {
            b = dp.this;
            super();
        }
    }

    public static interface c
    {

        public abstract void a();

        public abstract void a(String s);
    }

    public static interface d
    {

        public abstract boolean a(String s);
    }


    protected d a;
    protected c b;

    public dp(Context context)
    {
        super(context);
    }

    public void a(d d1)
    {
        a = d1;
    }

    public abstract void a(String s);

    public abstract boolean a();

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    protected WebViewClient g()
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 8)
        {
            return new b();
        } else
        {
            return new a();
        }
    }
}
