// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.gs;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

private static final class l
    implements CustomEventBannerListener
{

    private final MediationBannerListener l;
    private final CustomEventAdapter xh;

    public void onAdClicked()
    {
        gs.S("Custom event adapter called onAdClicked.");
        l.onAdClicked(xh);
    }

    public void onAdClosed()
    {
        gs.S("Custom event adapter called onAdClosed.");
        l.onAdClosed(xh);
    }

    public void onAdFailedToLoad(int i)
    {
        gs.S("Custom event adapter called onAdFailedToLoad.");
        l.onAdFailedToLoad(xh, i);
    }

    public void onAdLeftApplication()
    {
        gs.S("Custom event adapter called onAdLeftApplication.");
        l.onAdLeftApplication(xh);
    }

    public void onAdLoaded(View view)
    {
        gs.S("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(xh, view);
        l.onAdLoaded(xh);
    }

    public void onAdOpened()
    {
        gs.S("Custom event adapter called onAdOpened.");
        l.onAdOpened(xh);
    }

    public ener(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        xh = customeventadapter;
        l = mediationbannerlistener;
    }
}
