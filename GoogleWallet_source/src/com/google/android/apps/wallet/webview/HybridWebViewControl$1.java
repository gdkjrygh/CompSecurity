// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewControl, HybridWebView

final class val.url
    implements Runnable
{

    final HybridWebViewControl this$0;
    final int val$progress;
    final String val$url;
    final HybridWebView val$webView;
    final boolean val$webViewFinishedLoading;

    public final void run()
    {
        updateWebViewLoadingStateOnUiThread(val$webView, val$webViewFinishedLoading, val$progress, val$url);
    }

    ()
    {
        this$0 = final_hybridwebviewcontrol;
        val$webView = hybridwebview;
        val$webViewFinishedLoading = flag;
        val$progress = i;
        val$url = String.this;
        super();
    }
}
