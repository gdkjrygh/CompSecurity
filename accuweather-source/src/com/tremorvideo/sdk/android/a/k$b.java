// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.a;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;

// Referenced classes of package com.tremorvideo.sdk.android.a:
//            k

private class <init> extends WebViewClient
{

    final k a;

    public void onPageFinished(WebView webview, String s)
    {
        if (!k.a(a))
        {
            a.a();
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (Uri.parse(s).getScheme().equals("tremorvideo"))
        {
            k.a(a, URI.create(s));
            return true;
        } else
        {
            return false;
        }
    }

    private (k k1)
    {
        a = k1;
        super();
    }

    >(k k1, > >)
    {
        this(k1);
    }
}
