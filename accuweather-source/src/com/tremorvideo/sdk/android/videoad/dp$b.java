// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dp, ct

protected class <init> extends <init>
{

    final dp b;

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        ct.d("SSL Error");
        sslerrorhandler.proceed();
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }

    protected (dp dp1)
    {
        b = dp1;
        super(dp1);
    }
}
