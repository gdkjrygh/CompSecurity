// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class zzaP extends AdListener
    implements zza
{

    final AbstractAdViewAdapter zzaN;
    final MediationInterstitialListener zzaP;

    public void onAdClicked()
    {
        zzaP.onAdClicked(zzaN);
    }

    public void onAdClosed()
    {
        zzaP.onAdClosed(zzaN);
    }

    public void onAdFailedToLoad(int i)
    {
        zzaP.onAdFailedToLoad(zzaN, i);
    }

    public void onAdLeftApplication()
    {
        zzaP.onAdLeftApplication(zzaN);
    }

    public void onAdLoaded()
    {
        zzaP.onAdLoaded(zzaN);
    }

    public void onAdOpened()
    {
        zzaP.onAdOpened(zzaN);
    }

    public stitialListener(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        zzaN = abstractadviewadapter;
        zzaP = mediationinterstitiallistener;
    }
}
