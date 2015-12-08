// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView, l, d, av, 
//            ag, ai

private final class <init> extends WebViewClient
{

    final AdWebView a;

    public final void onPageFinished(WebView webview, String s)
    {
        if (webview.getId() == -1)
        {
            ((AdWebView)webview).n();
        }
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webview, String s)
    {
        if (android.os.N.SDK_INT < 11)
        {
            return null;
        }
        l l2 = new l();
        l l1 = l2;
        if (AdWebView.o(a) != null)
        {
            l1 = l2;
            if (AdWebView.o(a).p() != null)
            {
                l1 = AdWebView.o(a).p().c();
            }
        }
        try
        {
            av.a("WebResourceUrl", s);
            ag.a().a(null);
            l1.b(s);
        }
        catch (Exception exception)
        {
            av.a("AdWebView", "exception loading resource inside web view", exception);
        }
        return super.shouldInterceptRequest(webview, s);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        a.j().c("OverrideUrlLoading", s);
        av.a("AdWebView");
        AdWebView.a(a, s);
        return true;
    }

    private (AdWebView adwebview)
    {
        a = adwebview;
        super();
    }

    a(AdWebView adwebview, byte byte0)
    {
        this(adwebview);
    }
}
