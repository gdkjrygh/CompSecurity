// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.webview;


// Referenced classes of package com.google.android.apps.wallet.webview:
//            HybridWebViewControl, HybridWebView

final class val.errorCode
    implements Runnable
{

    final HybridWebViewControl this$0;
    final int val$derivedErrorCode;
    final String val$description;
    final int val$errorCode;
    final HybridWebView val$webView;

    public final void run()
    {
        showErrorOnUiThread(val$webView, val$derivedErrorCode, val$description, val$errorCode);
    }

    ()
    {
        this$0 = final_hybridwebviewcontrol;
        val$webView = hybridwebview;
        val$derivedErrorCode = i;
        val$description = s;
        val$errorCode = I.this;
        super();
    }
}
