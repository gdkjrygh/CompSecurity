// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;


public final class PlaybackType extends Enum
{

    private static final PlaybackType $VALUES[];
    public static final PlaybackType DEFAULT;
    public static final PlaybackType OFFLINE;
    public static final PlaybackType UNINTERRUPTED;

    private PlaybackType(String s, int i)
    {
        super(s, i);
    }

    public static PlaybackType valueOf(String s)
    {
        return (PlaybackType)Enum.valueOf(com/soundcloud/android/playback/PlaybackType, s);
    }

    public static PlaybackType[] values()
    {
        return (PlaybackType[])$VALUES.clone();
    }

    static 
    {
        DEFAULT = new PlaybackType("DEFAULT", 0);
        OFFLINE = new PlaybackType("OFFLINE", 1);
        UNINTERRUPTED = new PlaybackType("UNINTERRUPTED", 2);
        $VALUES = (new PlaybackType[] {
            DEFAULT, OFFLINE, UNINTERRUPTED
        });
    }
}
