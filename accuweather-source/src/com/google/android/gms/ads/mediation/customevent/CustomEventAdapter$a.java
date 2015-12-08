// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.ev;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

private static final class l
    implements CustomEventBannerListener
{

    private final MediationBannerListener l;
    private final CustomEventAdapter sV;

    public void onAdClicked()
    {
        ev.z("Custom event adapter called onAdClicked.");
        l.onAdClicked(sV);
    }

    public void onAdClosed()
    {
        ev.z("Custom event adapter called onAdClosed.");
        l.onAdClosed(sV);
    }

    public void onAdFailedToLoad(int i)
    {
        ev.z("Custom event adapter called onAdFailedToLoad.");
        l.onAdFailedToLoad(sV, i);
    }

    public void onAdLeftApplication()
    {
        ev.z("Custom event adapter called onAdLeftApplication.");
        l.onAdLeftApplication(sV);
    }

    public void onAdLoaded(View view)
    {
        ev.z("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(sV, view);
        l.onAdLoaded(sV);
    }

    public void onAdOpened()
    {
        ev.z("Custom event adapter called onAdOpened.");
        l.onAdOpened(sV);
    }

    public ener(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        sV = customeventadapter;
        l = mediationbannerlistener;
    }
}
