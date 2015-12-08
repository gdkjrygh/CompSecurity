// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view;

import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.auditude.ads.view:
//            BannerView

private class <init> extends WebViewClient
{

    private Boolean pageLoaded;
    final BannerView this$0;

    public void onLoadResource(WebView webview, String s)
    {
        if (pageLoaded.booleanValue())
        {
            webview.stopLoading();
            BannerView.access$0(BannerView.this, s);
        }
    }

    public void onPageFinished(WebView webview, String s)
    {
        pageLoaded = Boolean.valueOf(true);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        pageLoaded = Boolean.valueOf(false);
    }

    public boolean shouldOverrideKeyEvent(WebView webview, KeyEvent keyevent)
    {
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        BannerView.access$0(BannerView.this, s);
        return true;
    }

    private ()
    {
        this$0 = BannerView.this;
        super();
        pageLoaded = Boolean.valueOf(false);
    }

    pageLoaded(pageLoaded pageloaded)
    {
        this();
    }
}
