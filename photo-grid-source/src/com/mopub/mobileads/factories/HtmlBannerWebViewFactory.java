// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.mobileads.HtmlBannerWebView;

public class HtmlBannerWebViewFactory
{

    protected static HtmlBannerWebViewFactory a = new HtmlBannerWebViewFactory();

    public HtmlBannerWebViewFactory()
    {
    }

    public static HtmlBannerWebView create(Context context, AdReport adreport, com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener customeventbannerlistener, boolean flag, String s, String s1)
    {
        return a.internalCreate(context, adreport, customeventbannerlistener, flag, s, s1);
    }

    public static void setInstance(HtmlBannerWebViewFactory htmlbannerwebviewfactory)
    {
        a = htmlbannerwebviewfactory;
    }

    public HtmlBannerWebView internalCreate(Context context, AdReport adreport, com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener customeventbannerlistener, boolean flag, String s, String s1)
    {
        context = new HtmlBannerWebView(context, adreport);
        context.init(customeventbannerlistener, flag, s, s1);
        return context;
    }

}
