// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.churnlockedstate;


public final class ChurnLockedStateRolloutFlag extends Enum
{

    public static final ChurnLockedStateRolloutFlag a;
    public static final ChurnLockedStateRolloutFlag b;
    private static final ChurnLockedStateRolloutFlag c[];

    private ChurnLockedStateRolloutFlag(String s, int i)
    {
        super(s, i);
    }

    public static ChurnLockedStateRolloutFlag valueOf(String s)
    {
        return (ChurnLockedStateRolloutFlag)Enum.valueOf(com/spotify/music/spotlets/churnlockedstate/ChurnLockedStateRolloutFlag, s);
    }

    public static ChurnLockedStateRolloutFlag[] values()
    {
        return (ChurnLockedStateRolloutFlag[])c.clone();
    }

    static 
    {
        a = new ChurnLockedStateRolloutFlag("ENABLED", 0);
        b = new ChurnLockedStateRolloutFlag("DISABLED", 1);
        c = (new ChurnLockedStateRolloutFlag[] {
            a, b
        });
    }
}
