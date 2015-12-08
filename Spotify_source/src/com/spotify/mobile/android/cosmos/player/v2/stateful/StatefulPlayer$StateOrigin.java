// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;


final class  extends Enum
{

    private static final REMOTE $VALUES[];
    public static final REMOTE LOCAL;
    public static final REMOTE REMOTE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/cosmos/player/v2/stateful/StatefulPlayer$StateOrigin, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOCAL = new <init>("LOCAL", 0);
        REMOTE = new <init>("REMOTE", 1);
        $VALUES = (new .VALUES[] {
            LOCAL, REMOTE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
