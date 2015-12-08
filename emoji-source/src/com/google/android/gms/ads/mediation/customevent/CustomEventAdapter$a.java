// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.eu;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

private static final class l
    implements CustomEventBannerListener
{

    private final MediationBannerListener l;
    private final CustomEventAdapter sY;

    public void onAdClicked()
    {
        eu.z("Custom event adapter called onAdClicked.");
        l.onAdClicked(sY);
    }

    public void onAdClosed()
    {
        eu.z("Custom event adapter called onAdClosed.");
        l.onAdClosed(sY);
    }

    public void onAdFailedToLoad(int i)
    {
        eu.z("Custom event adapter called onAdFailedToLoad.");
        l.onAdFailedToLoad(sY, i);
    }

    public void onAdLeftApplication()
    {
        eu.z("Custom event adapter called onAdLeftApplication.");
        l.onAdLeftApplication(sY);
    }

    public void onAdLoaded(View view)
    {
        eu.z("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(sY, view);
        l.onAdLoaded(sY);
    }

    public void onAdOpened()
    {
        eu.z("Custom event adapter called onAdOpened.");
        l.onAdOpened(sY);
    }

    public ener(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        sY = customeventadapter;
        l = mediationbannerlistener;
    }
}
