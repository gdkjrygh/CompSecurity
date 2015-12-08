// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.premium.offline;


public final class OfflineSyncFeatureOnboarding extends Enum
{

    public static final OfflineSyncFeatureOnboarding a;
    public static final OfflineSyncFeatureOnboarding b;
    public static final OfflineSyncFeatureOnboarding c;
    private static final OfflineSyncFeatureOnboarding d[];

    private OfflineSyncFeatureOnboarding(String s, int i)
    {
        super(s, i);
    }

    public static OfflineSyncFeatureOnboarding valueOf(String s)
    {
        return (OfflineSyncFeatureOnboarding)Enum.valueOf(com/spotify/mobile/android/spotlets/onboarding/premium/offline/OfflineSyncFeatureOnboarding, s);
    }

    public static OfflineSyncFeatureOnboarding[] values()
    {
        return (OfflineSyncFeatureOnboarding[])d.clone();
    }

    static 
    {
        a = new OfflineSyncFeatureOnboarding("CONTROL", 0);
        b = new OfflineSyncFeatureOnboarding("WIFI_ONLY", 1);
        c = new OfflineSyncFeatureOnboarding("ALL_CONNECTIONS", 2);
        d = (new OfflineSyncFeatureOnboarding[] {
            a, b, c
        });
    }
}
