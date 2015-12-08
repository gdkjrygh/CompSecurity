// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            HtmlWebViewListener, MoPubErrorCode, BaseHtmlWebView

final class s
    implements HtmlWebViewListener
{

    private final CustomEventInterstitial.CustomEventInterstitialListener a;

    public s(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
    {
        a = customeventinterstitiallistener;
    }

    public final void onClicked()
    {
        a.onInterstitialClicked();
    }

    public final void onCollapsed()
    {
    }

    public final void onFailed(MoPubErrorCode mopuberrorcode)
    {
        a.onInterstitialFailed(mopuberrorcode);
    }

    public final void onLoaded(BaseHtmlWebView basehtmlwebview)
    {
        a.onInterstitialLoaded();
    }
}
