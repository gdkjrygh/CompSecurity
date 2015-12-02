// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.f;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.h;

// Referenced classes of package com.facebook.ads.internal.f:
//            b

private class <init> extends WebViewClient
{

    final b a;

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

    private (b b1)
    {
        a = b1;
        super();
    }

    it>(b b1, it> it>)
    {
        this(b1);
    }
}
