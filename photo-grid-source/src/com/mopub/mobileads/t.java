// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            MoPubActivity, EventForwardingBroadcastReceiver, n, HtmlInterstitialWebView, 
//            MoPubErrorCode

final class t
    implements CustomEventInterstitial.CustomEventInterstitialListener
{

    final MoPubActivity a;

    t(MoPubActivity mopubactivity)
    {
        a = mopubactivity;
        super();
    }

    public final void onInterstitialClicked()
    {
        EventForwardingBroadcastReceiver.a(a, a.a().longValue(), "com.mopub.action.interstitial.click");
    }

    public final void onInterstitialDismissed()
    {
    }

    public final void onInterstitialFailed(MoPubErrorCode mopuberrorcode)
    {
        EventForwardingBroadcastReceiver.a(a, a.a().longValue(), "com.mopub.action.interstitial.fail");
        a.finish();
    }

    public final void onInterstitialLoaded()
    {
        MoPubActivity.a(a).loadUrl(n.WEB_VIEW_DID_APPEAR.b());
    }

    public final void onInterstitialShown()
    {
    }

    public final void onLeaveApplication()
    {
    }
}
