// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;

// Referenced classes of package com.millennialmedia.android:
//            AdViewOverlayView, MMLog, MMAdImpl, OverlaySettings, 
//            BannerExpandedWebViewClient, InterstitialWebViewClient, MMWebViewClient

class er extends er
{

    final AdViewOverlayView this$0;

    MMWebViewClient getMMWebViewClient()
    {
        MMLog.d("AdViewOverlayView", (new StringBuilder()).append("Returning a client for user: OverlayWebViewClient, adimpl=").append(adImpl).toString());
        if (adImpl.linkForExpansionId != 0L || settings.hasExpandUrl())
        {
            BannerExpandedWebViewClient bannerexpandedwebviewclient = new BannerExpandedWebViewClient(mmWebViewClientListener, new Impl(this));
            mmWebViewClient = bannerexpandedwebviewclient;
            return bannerexpandedwebviewclient;
        } else
        {
            InterstitialWebViewClient interstitialwebviewclient = new InterstitialWebViewClient(mmWebViewClientListener, new Impl(this));
            mmWebViewClient = interstitialwebviewclient;
            return interstitialwebviewclient;
        }
    }

    boolean isExpandingToUrl()
    {
        return settings.hasExpandUrl() && !settings.hasLoadedExpandUrl();
    }

    void removeProgressBar()
    {
        AdViewOverlayView.access$200(AdViewOverlayView.this);
    }

    public Impl(Context context)
    {
        this$0 = AdViewOverlayView.this;
        super(AdViewOverlayView.this, context);
        mmWebViewClientListener = new er(this);
    }
}
