// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

final class zzaR extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzaP;
    final MediationInterstitialListener zzaR;

    public final void onAdClicked()
    {
        zzaR.onAdClicked(zzaP);
    }

    public final void onAdClosed()
    {
        zzaR.onAdClosed(zzaP);
    }

    public final void onAdFailedToLoad(int i)
    {
        zzaR.onAdFailedToLoad(zzaP, i);
    }

    public final void onAdLeftApplication()
    {
        zzaR.onAdLeftApplication(zzaP);
    }

    public final void onAdLoaded()
    {
        zzaR.onAdLoaded(zzaP);
    }

    public final void onAdOpened()
    {
        zzaR.onAdOpened(zzaP);
    }

    public stitialListener(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzaP = abstractadviewadapter;
        zzaR = mediationinterstitiallistener;
    }
}
