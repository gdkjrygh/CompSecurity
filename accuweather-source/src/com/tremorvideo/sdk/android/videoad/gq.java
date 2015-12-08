// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.Dialog;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gl, ct, ea, dm, 
//            gr

class gq extends gl
{

    final ea h;
    final String i;
    final gj.a j;
    final Activity k;
    final dm l;
    final Dialog m;
    final gr n;

    gq(ea ea, String s, gj.a a, Activity activity, dm dm, Dialog dialog, gr gr)
    {
        h = ea;
        i = s;
        j = a;
        k = activity;
        l = dm;
        m = dialog;
        n = gr;
        super(gr, dialog, dm, activity, a, s, ea);
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
        ct.d("SSL Error");
        sslerrorhandler.proceed();
        super.onReceivedSslError(webview, sslerrorhandler, sslerror);
    }
}
