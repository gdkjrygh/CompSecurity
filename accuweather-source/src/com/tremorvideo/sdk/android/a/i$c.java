// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

// Referenced classes of package com.tremorvideo.sdk.android.a:
//            i, j

private class <init> extends WebViewClient
{

    final i a;

    public void onPageFinished(WebView webview, String s)
    {
        if (webview instanceof i)
        {
            ((i)webview).a();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (Uri.parse(s).getScheme().equals("tremorvideo"))
        {
            i.a(a, URI.create(s));
            return true;
        } else
        {
            return false;
        }
    }

    private (i j)
    {
        a = j;
        super();
    }

    >(i j, j j1)
    {
        this(j);
    }
}
