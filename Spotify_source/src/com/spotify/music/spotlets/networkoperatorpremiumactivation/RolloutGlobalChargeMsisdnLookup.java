// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.networkoperatorpremiumactivation;


public final class RolloutGlobalChargeMsisdnLookup extends Enum
{

    public static final RolloutGlobalChargeMsisdnLookup a;
    public static final RolloutGlobalChargeMsisdnLookup b;
    private static final RolloutGlobalChargeMsisdnLookup c[];

    private RolloutGlobalChargeMsisdnLookup(String s, int i)
    {
        super(s, i);
    }

    public static RolloutGlobalChargeMsisdnLookup valueOf(String s)
    {
        return (RolloutGlobalChargeMsisdnLookup)Enum.valueOf(com/spotify/music/spotlets/networkoperatorpremiumactivation/RolloutGlobalChargeMsisdnLookup, s);
    }

    public static RolloutGlobalChargeMsisdnLookup[] values()
    {
        return (RolloutGlobalChargeMsisdnLookup[])c.clone();
    }

    static 
    {
        a = new RolloutGlobalChargeMsisdnLookup("DISABLED", 0);
        b = new RolloutGlobalChargeMsisdnLookup("ENABLED", 1);
        c = (new RolloutGlobalChargeMsisdnLookup[] {
            a, b
        });
    }
}
