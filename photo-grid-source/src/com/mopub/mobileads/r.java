// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            HtmlWebViewListener, MoPubErrorCode, BaseHtmlWebView

final class r
    implements HtmlWebViewListener
{

    private final CustomEventBanner.CustomEventBannerListener a;

    public r(CustomEventBanner.CustomEventBannerListener customeventbannerlistener)
    {
        a = customeventbannerlistener;
    }

    public final void onClicked()
    {
        a.onBannerClicked();
    }

    public final void onCollapsed()
    {
        a.onBannerCollapsed();
    }

    public final void onFailed(MoPubErrorCode mopuberrorcode)
    {
        a.onBannerFailed(mopuberrorcode);
    }

    public final void onLoaded(BaseHtmlWebView basehtmlwebview)
    {
        a.onBannerLoaded(basehtmlwebview);
    }
}
