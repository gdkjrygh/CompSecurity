// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.gr;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBannerListener, CustomEventAdapter

private static final class l
    implements CustomEventBannerListener
{

    private final MediationBannerListener l;
    private final CustomEventAdapter xw;

    public void onAdClicked()
    {
        gr.S("Custom event adapter called onAdClicked.");
        l.onAdClicked(xw);
    }

    public void onAdClosed()
    {
        gr.S("Custom event adapter called onAdClosed.");
        l.onAdClosed(xw);
    }

    public void onAdFailedToLoad(int i)
    {
        gr.S("Custom event adapter called onAdFailedToLoad.");
        l.onAdFailedToLoad(xw, i);
    }

    public void onAdLeftApplication()
    {
        gr.S("Custom event adapter called onAdLeftApplication.");
        l.onAdLeftApplication(xw);
    }

    public void onAdLoaded(View view)
    {
        gr.S("Custom event adapter called onAdLoaded.");
        CustomEventAdapter.a(xw, view);
        l.onAdLoaded(xw);
    }

    public void onAdOpened()
    {
        gr.S("Custom event adapter called onAdOpened.");
        l.onAdOpened(xw);
    }

    public ener(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
    {
        xw = customeventadapter;
        l = mediationbannerlistener;
    }
}
