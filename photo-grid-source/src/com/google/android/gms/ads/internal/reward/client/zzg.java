// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;

// Referenced classes of package com.google.android.gms.ads.internal.reward.client:
//            zze, zza

public class zzg extends zzd.zza
{

    private final RewardedVideoAdListener a;

    public zzg(RewardedVideoAdListener rewardedvideoadlistener)
    {
        a = rewardedvideoadlistener;
    }

    public void onRewardedVideoAdClosed()
    {
        if (a != null)
        {
            a.onRewardedVideoAdClosed();
        }
    }

    public void onRewardedVideoAdFailedToLoad(int i)
    {
        if (a != null)
        {
            a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    public void onRewardedVideoAdLeftApplication()
    {
        if (a != null)
        {
            a.onRewardedVideoAdLeftApplication();
        }
    }

    public void onRewardedVideoAdLoaded()
    {
        if (a != null)
        {
            a.onRewardedVideoAdLoaded();
        }
    }

    public void onRewardedVideoAdOpened()
    {
        if (a != null)
        {
            a.onRewardedVideoAdOpened();
        }
    }

    public void onRewardedVideoStarted()
    {
        if (a != null)
        {
            a.onRewardedVideoStarted();
        }
    }

    public void zza(zza zza1)
    {
        if (a != null)
        {
            a.onRewarded(new zze(zza1));
        }
    }
}
