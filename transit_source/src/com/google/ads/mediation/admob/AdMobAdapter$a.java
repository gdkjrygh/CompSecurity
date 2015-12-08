// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation.admob;

import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.internal.bb;

// Referenced classes of package com.google.ads.mediation.admob:
//            AdMobAdapter

private static final class k extends AdListener
{

    private final AdMobAdapter j;
    private final MediationBannerListener k;

    public void onAdClosed()
    {
        k.onDismissScreen(j);
    }

    public void onAdFailedToLoad(int i)
    {
        k.onFailedToReceiveAd(j, bb.f(i));
    }

    public void onAdLeftApplication()
    {
        k.onLeaveApplication(j);
    }

    public void onAdLoaded()
    {
        k.onReceivedAd(j);
    }

    public void onAdOpened()
    {
        k.onClick(j);
        k.onPresentScreen(j);
    }

    public er(AdMobAdapter admobadapter, MediationBannerListener mediationbannerlistener)
    {
        j = admobadapter;
        k = mediationbannerlistener;
    }
}
