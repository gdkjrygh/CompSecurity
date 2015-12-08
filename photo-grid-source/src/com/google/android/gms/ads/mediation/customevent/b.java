// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

final class b
    implements CustomEventInterstitialListener
{

    final CustomEventAdapter a;
    private final CustomEventAdapter b;
    private final MediationInterstitialListener c;

    public b(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        a = customeventadapter;
        super();
        b = customeventadapter1;
        c = mediationinterstitiallistener;
    }

    public final void onAdClicked()
    {
        zzb.zzaF("Custom event adapter called onAdClicked.");
        c.onAdClicked(b);
    }

    public final void onAdClosed()
    {
        zzb.zzaF("Custom event adapter called onAdClosed.");
        c.onAdClosed(b);
    }

    public final void onAdFailedToLoad(int i)
    {
        zzb.zzaF("Custom event adapter called onFailedToReceiveAd.");
        c.onAdFailedToLoad(b, i);
    }

    public final void onAdLeftApplication()
    {
        zzb.zzaF("Custom event adapter called onAdLeftApplication.");
        c.onAdLeftApplication(b);
    }

    public final void onAdLoaded()
    {
        zzb.zzaF("Custom event adapter called onReceivedAd.");
        c.onAdLoaded(a);
    }

    public final void onAdOpened()
    {
        zzb.zzaF("Custom event adapter called onAdOpened.");
        c.onAdOpened(b);
    }
}
