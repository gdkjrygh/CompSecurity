// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dq

private class <init> extends WebChromeClient
{

    final dq a;

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i == 100 && a.b != null)
        {
            a.b.a();
        }
    }

    private (dq dq1)
    {
        a = dq1;
        super();
    }

    a(dq dq1, a a1)
    {
        this(dq1);
    }
}
