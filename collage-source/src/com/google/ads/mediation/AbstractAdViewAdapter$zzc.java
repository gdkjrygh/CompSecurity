// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

// Referenced classes of package com.google.ads.mediation:
//            AbstractAdViewAdapter

static final class b extends AdListener
    implements zza
{

    final AbstractAdViewAdapter a;
    final MediationBannerListener b;

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

    public rListener(AbstractAdViewAdapter abstractadviewadapter, MediationBannerListener mediationbannerlistener)
    {
        a = abstractadviewadapter;
        b = mediationbannerlistener;
    }
}
