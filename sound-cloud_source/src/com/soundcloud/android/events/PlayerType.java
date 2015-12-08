// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


public final class PlayerType extends Enum
{

    private static final PlayerType $VALUES[];
    public static final PlayerType MEDIA_PLAYER;
    public static final PlayerType SKIPPY;
    private final String value;

    private PlayerType(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static PlayerType valueOf(String s)
    {
        return (PlayerType)Enum.valueOf(com/soundcloud/android/events/PlayerType, s);
    }

    public static PlayerType[] values()
    {
        return (PlayerType[])$VALUES.clone();
    }

    public final String getValue()
    {
        return value;
    }

    static 
    {
        SKIPPY = new PlayerType("SKIPPY", 0, "Skippy");
        MEDIA_PLAYER = new PlayerType("MEDIA_PLAYER", 1, "MediaPlayer");
        $VALUES = (new PlayerType[] {
            SKIPPY, MEDIA_PLAYER
        });
    }
}
