// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;

import android.app.Activity;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.tune.crosspromo:
//            TuneInterstitial, TuneAdUtils

class a extends WebViewClient
{

    final String a;
    final TuneInterstitial b;

    public void onPageFinished(WebView webview, String s)
    {
        if (!s.equals("about:blank"))
        {
            TuneInterstitial.a(b, a);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        ((ViewGroup)webview.getParent()).removeView(webview);
        TuneInterstitial.a(b, s, a);
        ((Activity)TuneInterstitial.a(b).b()).finish();
        return true;
    }

    (TuneInterstitial tuneinterstitial, String s)
    {
        b = tuneinterstitial;
        a = s;
        super();
    }
}
