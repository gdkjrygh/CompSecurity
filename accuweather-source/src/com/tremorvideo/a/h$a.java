// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.a;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

// Referenced classes of package com.tremorvideo.a:
//            h, a

private class <init> extends <init>
{

    final h b;

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
        b.d.a(new a("An SSL Error Occured.", -1, ""));
        super.a();
    }

    private ror(h h1)
    {
        b = h1;
        super(h1);
    }

    <init>(h h1, <init> <init>1)
    {
        this(h1);
    }
}
