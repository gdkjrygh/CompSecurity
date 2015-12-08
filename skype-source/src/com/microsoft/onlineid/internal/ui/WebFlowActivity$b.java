// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.microsoft.onlineid.internal.c.d;

// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            WebFlowActivity

private final class <init> extends WebViewClient
{

    final WebFlowActivity a;

    public final void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        WebFlowActivity.b(a);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        WebFlowActivity.a(a);
        d.a((new StringBuilder("New page loaded: ")).append(s).toString());
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        WebFlowActivity.a(a, webview, i, s, s1);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        WebFlowActivity.a();
        return super.shouldOverrideUrlLoading(webview, s);
    }

    private (WebFlowActivity webflowactivity)
    {
        a = webflowactivity;
        super();
    }

    a(WebFlowActivity webflowactivity, byte byte0)
    {
        this(webflowactivity);
    }
}
