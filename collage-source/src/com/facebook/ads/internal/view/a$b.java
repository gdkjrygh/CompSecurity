// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.g;

// Referenced classes of package com.facebook.ads.internal.view:
//            a

private class <init> extends WebViewClient
{

    final a a;

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        if (g.a())
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
        com.facebook.ads.internal.view.a.a(a).a(s);
        return true;
    }

    private (a a1)
    {
        a = a1;
        super();
    }

    (a a1,  )
    {
        this(a1);
    }
}
