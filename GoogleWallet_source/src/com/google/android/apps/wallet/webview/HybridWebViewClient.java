// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView

public final class HybridWebViewClient extends WebViewClient
{

    HybridWebView webView;

    public HybridWebViewClient(HybridWebView hybridwebview)
    {
        webView = hybridwebview;
    }

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webView.handlePageFinished(s);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        webView.handleOnPageStarted(s);
        super.onPageStarted(webview, s, bitmap);
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        webView.handleReceivedError(i, s, s1);
        super.onReceivedError(webview, i, s, s1);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (webView.handleShouldOverrideUrlLoading(s))
        {
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }
}
