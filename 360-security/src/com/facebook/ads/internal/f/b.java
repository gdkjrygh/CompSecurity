// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.content.Context;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.adapters.l;
import com.facebook.ads.internal.util.h;
import com.facebook.ads.internal.util.i;

public class com.facebook.ads.internal.f.b extends WebView
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int j);

        public abstract void a(String s);
    }

    private class b extends WebViewClient
    {

        final com.facebook.ads.internal.f.b a;

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            if (h.a())
            {
                sslerrorhandler.proceed();
                return;
            } else
            {
                sslerrorhandler.cancel();
                return;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            com.facebook.ads.internal.f.b.a(a).a(s);
            return true;
        }

        private b()
        {
            a = com.facebook.ads.internal.f.b.this;
            super();
        }

    }

    public class c
    {

        final com.facebook.ads.internal.f.b a;
        private final String b = com/facebook/ads/internal/f/b$c.getSimpleName();

        public c()
        {
            a = com.facebook.ads.internal.f.b.this;
            super();
        }
    }


    private final a a;
    private l b;

    public com.facebook.ads.internal.f.b(Context context, a a1, int j)
    {
        super(context);
        a = a1;
        setWebViewClient(new b());
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        addJavascriptInterface(new c(), "AdControl");
        b = new l(getContext(), this, j, new com.facebook.ads.internal.adapters.l.a(a1) {

            final a a;
            final com.facebook.ads.internal.f.b b;

            public void a()
            {
                a.a();
            }

            
            {
                b = com.facebook.ads.internal.f.b.this;
                a = a1;
                super();
            }
        });
    }

    static a a(com.facebook.ads.internal.f.b b1)
    {
        return b1.a;
    }

    public void destroy()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        i.a(this);
        super.destroy();
    }

    protected void onWindowVisibilityChanged(int j)
    {
        super.onWindowVisibilityChanged(j);
        if (a != null)
        {
            a.a(j);
        }
        if (j == 0)
        {
            if (b != null)
            {
                b.a();
            }
        } else
        if (j == 8 && b != null)
        {
            b.b();
            return;
        }
    }
}
