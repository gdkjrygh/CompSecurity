// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.webkit.WebView;
import android.webkit.WebViewClient;

final class a extends WebViewClient
{

    final stitial.CustomEventInterstitialListener a;

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!s.equals("mopub://finishLoad")) goto _L2; else goto _L1
_L1:
        a.onInterstitialLoaded();
_L4:
        return true;
_L2:
        if (s.equals("mopub://failLoad"))
        {
            a.onInterstitialFailed(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ner(stitial.CustomEventInterstitialListener customeventinterstitiallistener)
    {
        a = customeventinterstitiallistener;
        super();
    }
}
