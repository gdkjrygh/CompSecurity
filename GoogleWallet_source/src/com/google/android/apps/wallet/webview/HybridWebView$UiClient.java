// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;

import android.webkit.WebView;

// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebView

public static interface 
{

    public abstract void closeWindow(WebView webview);

    public abstract WebView handleOpenNewWindow(HybridWebView hybridwebview);

    public abstract void onPageFinished(HybridWebView hybridwebview, String s);

    public abstract void onPageStarted(HybridWebView hybridwebview, String s);

    public abstract boolean shouldOverrideUrlLoading(HybridWebView hybridwebview, String s);

    public abstract void showError(HybridWebView hybridwebview, int i, String s, int j);

    public abstract void updateWebViewLoadingState(HybridWebView hybridwebview, boolean flag, int i, String s);
}
