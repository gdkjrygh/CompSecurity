// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventInterstitialListener, CustomEventAdapter

class c
    implements CustomEventInterstitialListener
{

    final CustomEventAdapter a;
    private final CustomEventAdapter b;
    private final MediationInterstitialListener c;

    public void onAdClicked()
    {
        zzb.zzaj("Custom event adapter called onAdClicked.");
        c.onAdClicked(b);
    }

    public void onAdClosed()
    {
        zzb.zzaj("Custom event adapter called onAdClosed.");
        c.onAdClosed(b);
    }

    public void onAdFailedToLoad(int i)
    {
        zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
        c.onAdFailedToLoad(b, i);
    }

    public void onAdLeftApplication()
    {
        zzb.zzaj("Custom event adapter called onAdLeftApplication.");
        c.onAdLeftApplication(b);
    }

    public void onAdLoaded()
    {
        zzb.zzaj("Custom event adapter called onReceivedAd.");
        c.onAdLoaded(a);
    }

    public void onAdOpened()
    {
        zzb.zzaj("Custom event adapter called onAdOpened.");
        c.onAdOpened(b);
    }

    public alListener(CustomEventAdapter customeventadapter, CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
    {
        a = customeventadapter;
        super();
        b = customeventadapter1;
        c = mediationinterstitiallistener;
    }
}
