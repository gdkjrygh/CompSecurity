// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class b extends AdListener
    implements zza
{

    final AbstractAdViewAdapter a;
    final MediationInterstitialListener b;

    public void onAdClicked()
    {
        b.onAdClicked(a);
    }

    public void onAdClosed()
    {
        b.onAdClosed(a);
    }

    public void onAdFailedToLoad(int i)
    {
        b.onAdFailedToLoad(a, i);
    }

    public void onAdLeftApplication()
    {
        b.onAdLeftApplication(a);
    }

    public void onAdLoaded()
    {
        b.onAdLoaded(a);
    }

    public void onAdOpened()
    {
        b.onAdOpened(a);
    }

    public stitialListener(AbstractAdViewAdapter abstractadviewadapter, MediationInterstitialListener mediationinterstitiallistener)
    {
        a = abstractadviewadapter;
        b = mediationinterstitiallistener;
    }
}
