// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.offline.flags;


public final class OfflineSyncSwitchVisibility extends Enum
{

    public static final OfflineSyncSwitchVisibility a;
    public static final OfflineSyncSwitchVisibility b;
    private static final OfflineSyncSwitchVisibility c[];

    private OfflineSyncSwitchVisibility(String s, int i)
    {
        super(s, i);
    }

    public static OfflineSyncSwitchVisibility valueOf(String s)
    {
        return (OfflineSyncSwitchVisibility)Enum.valueOf(com/spotify/mobile/android/spotlets/offline/flags/OfflineSyncSwitchVisibility, s);
    }

    public static OfflineSyncSwitchVisibility[] values()
    {
        return (OfflineSyncSwitchVisibility[])c.clone();
    }

    static 
    {
        a = new OfflineSyncSwitchVisibility("CONTROL", 0);
        b = new OfflineSyncSwitchVisibility("ALWAYS_VISIBLE", 1);
        c = (new OfflineSyncSwitchVisibility[] {
            a, b
        });
    }
}
