// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.connect.flags;


public final class ContextlessMiniPlayerVisibilityFlag extends Enum
{

    public static final ContextlessMiniPlayerVisibilityFlag a;
    public static final ContextlessMiniPlayerVisibilityFlag b;
    private static final ContextlessMiniPlayerVisibilityFlag c[];

    private ContextlessMiniPlayerVisibilityFlag(String s, int i)
    {
        super(s, i);
    }

    public static ContextlessMiniPlayerVisibilityFlag valueOf(String s)
    {
        return (ContextlessMiniPlayerVisibilityFlag)Enum.valueOf(com/spotify/mobile/android/spotlets/connect/flags/ContextlessMiniPlayerVisibilityFlag, s);
    }

    public static ContextlessMiniPlayerVisibilityFlag[] values()
    {
        return (ContextlessMiniPlayerVisibilityFlag[])c.clone();
    }

    static 
    {
        a = new ContextlessMiniPlayerVisibilityFlag("CONTEXTLESS_MINI_PLAYER_INVISIBLE", 0);
        b = new ContextlessMiniPlayerVisibilityFlag("CONTEXTLESS_MINI_PLAYER_VISIBLE", 1);
        c = (new ContextlessMiniPlayerVisibilityFlag[] {
            a, b
        });
    }
}
