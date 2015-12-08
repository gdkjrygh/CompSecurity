// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import android.os.Handler;
import com.mopub.common.AdReport;

// Referenced classes of package com.mopub.mobileads:
//            BaseHtmlWebView, HtmlWebViewClient, s

public class HtmlInterstitialWebView extends BaseHtmlWebView
{

    private Handler b;

    public HtmlInterstitialWebView(Context context, AdReport adreport)
    {
        super(context, adreport);
        b = new Handler();
    }

    public void init(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener, boolean flag, String s1, String s2)
    {
        super.init(flag);
        setWebViewClient(new HtmlWebViewClient(new s(customeventinterstitiallistener), this, s2, s1));
    }
}
