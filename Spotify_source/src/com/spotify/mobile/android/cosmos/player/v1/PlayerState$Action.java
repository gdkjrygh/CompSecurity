// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v1;

import java.util.Locale;

public final class  extends Enum
{

    private static final UPDATE $VALUES[];
    public static final UPDATE PAUSE;
    public static final UPDATE PLAY;
    public static final UPDATE RESUME;
    public static final UPDATE SKIP_NEXT;
    public static final UPDATE SKIP_PREV;
    public static final UPDATE UNKNOWN;
    public static final UPDATE UPDATE;

    public static  fromJson(String s)
    {
        return valueOf(s.toUpperCase(Locale.US));
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/spotify/mobile/android/cosmos/player/v1/PlayerState$Action, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public final String toJson()
    {
        return name().toLowerCase(Locale.US);
    }

    public final String toString()
    {
        switch (chMap.com.spotify.mobile.android.cosmos.player.v1.PlayerState.Action[ordinal()])
        {
        default:
            return name();

        case 1: // '\001'
            return "play";

        case 2: // '\002'
            return "resume";

        case 3: // '\003'
            return "pause";

        case 4: // '\004'
            return "skip_prev";

        case 5: // '\005'
            return "skip_next";

        case 6: // '\006'
            return "update";
        }
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        PLAY = new <init>("PLAY", 1);
        RESUME = new <init>("RESUME", 2);
        PAUSE = new <init>("PAUSE", 3);
        SKIP_PREV = new <init>("SKIP_PREV", 4);
        SKIP_NEXT = new <init>("SKIP_NEXT", 5);
        UPDATE = new <init>("UPDATE", 6);
        $VALUES = (new .VALUES[] {
            UNKNOWN, PLAY, RESUME, PAUSE, SKIP_PREV, SKIP_NEXT, UPDATE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
