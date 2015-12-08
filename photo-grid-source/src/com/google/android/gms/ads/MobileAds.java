// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzab;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MobileAds
{

    private MobileAds()
    {
    }

    public static RewardedVideoAd getRewardedVideoAdInstance(Context context)
    {
        return zzab.zzcV().getRewardedVideoAdInstance(context);
    }

    public static void initialize(Context context)
    {
        zzab.zzcV().initialize(context);
    }

    public static void initialize(Context context, String s)
    {
        initialize(context, s, null);
    }

    public static void initialize(Context context, String s, Settings settings)
    {
        zzab zzab1 = zzab.zzcV();
        if (settings == null)
        {
            settings = null;
        } else
        {
            settings = settings.a();
        }
        zzab1.zza(context, s, settings);
    }

    private class Settings
    {

        private final zzac a = new zzac();

        final zzac a()
        {
            return a;
        }

        public final String getTrackingId()
        {
            return a.getTrackingId();
        }

        public final boolean isGoogleAnalyticsEnabled()
        {
            return a.isGoogleAnalyticsEnabled();
        }

        public final Settings setGoogleAnalyticsEnabled(boolean flag)
        {
            a.zzk(flag);
            return this;
        }

        public final Settings setTrackingId(String s)
        {
            a.zzO(s);
            return this;
        }

        public Settings()
        {
        }
    }

}
