// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tremorvideo.sdk.android.videoad.ct;
import java.net.URI;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            v, o, r, w

private class <init> extends WebViewClient
{

    final v a;

    public void onPageFinished(WebView webview, String s)
    {
        if (!v.a(a))
        {
            v.a(a, true);
            v.b(a).c();
            a.a(r.a(v.c(a)));
            a.r();
            if (a.l() != null)
            {
                a.l().a(a);
            }
            v.b(a, true);
        }
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (Uri.parse(s).getScheme().equals("mraid"))
        {
            v.a(a, URI.create(s));
            return true;
        }
        webview = new Intent();
        webview.setAction("android.intent.action.VIEW");
        webview.setData(Uri.parse(s));
        webview.addFlags(0x10000000);
        try
        {
            a.getContext().startActivity(webview);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            ct.a(webview);
            return false;
        }
        return true;
    }

    private ception(v v1)
    {
        a = v1;
        super();
    }

    >(v v1, w w)
    {
        this(v1);
    }
}
