// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.browser;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.kik.cards.browser:
//            PopupWindowActivity

private final class <init> extends WebViewClient
{

    final PopupWindowActivity a;

    public final void onPageFinished(WebView webview, String s)
    {
        PopupWindowActivity.a(a, s);
        super.onPageFinished(webview, s);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        PopupWindowActivity.a(a, s);
        if (!PopupWindowActivity.b(a, s))
        {
            super.onPageStarted(webview, s, bitmap);
            return;
        } else
        {
            webview.stopLoading();
            return;
        }
    }

    public final void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        PopupWindowActivity.b(a);
        sslerrorhandler.cancel();
        webview.stopLoading();
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        while (s == null || PopupWindowActivity.b(a, s)) 
        {
            return true;
        }
        PopupWindowActivity.a(a, s);
        return false;
    }

    private (PopupWindowActivity popupwindowactivity)
    {
        a = popupwindowactivity;
        super();
    }

    a(PopupWindowActivity popupwindowactivity, byte byte0)
    {
        this(popupwindowactivity);
    }
}
