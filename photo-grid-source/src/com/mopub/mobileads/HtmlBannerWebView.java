// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdReport;

// Referenced classes of package com.mopub.mobileads:
//            BaseHtmlWebView, HtmlWebViewClient, r

public class HtmlBannerWebView extends BaseHtmlWebView
{

    public static final String EXTRA_AD_CLICK_DATA = "com.mopub.intent.extra.AD_CLICK_DATA";

    public HtmlBannerWebView(Context context, AdReport adreport)
    {
        super(context, adreport);
    }

    public void init(CustomEventBanner.CustomEventBannerListener customeventbannerlistener, boolean flag, String s, String s1)
    {
        super.init(flag);
        setWebViewClient(new HtmlWebViewClient(new r(customeventbannerlistener), this, s1, s));
    }
}
