// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMePlayerEventType extends Enum
{

    public static final YuMePlayerEventType ACCEPT_INVITATION;
    public static final YuMePlayerEventType CLOSE;
    public static final YuMePlayerEventType COLLAPSE;
    public static final YuMePlayerEventType END;
    public static final YuMePlayerEventType EXPAND;
    public static final YuMePlayerEventType FULL_SCREEN;
    public static final YuMePlayerEventType MUTE;
    public static final YuMePlayerEventType NONE;
    public static final YuMePlayerEventType PAUSE;
    public static final YuMePlayerEventType PERCENTAGE;
    public static final YuMePlayerEventType RESUME;
    public static final YuMePlayerEventType REWIND;
    public static final YuMePlayerEventType UNMUTE;
    private static final YuMePlayerEventType a[];

    private YuMePlayerEventType(String s, int i)
    {
        super(s, i);
    }

    public static YuMePlayerEventType valueOf(String s)
    {
        return (YuMePlayerEventType)Enum.valueOf(com/yume/android/sdk/YuMePlayerEventType, s);
    }

    public static YuMePlayerEventType[] values()
    {
        YuMePlayerEventType ayumeplayereventtype[] = a;
        int i = ayumeplayereventtype.length;
        YuMePlayerEventType ayumeplayereventtype1[] = new YuMePlayerEventType[i];
        System.arraycopy(ayumeplayereventtype, 0, ayumeplayereventtype1, 0, i);
        return ayumeplayereventtype1;
    }

    static 
    {
        NONE = new YuMePlayerEventType("NONE", 0);
        PERCENTAGE = new YuMePlayerEventType("PERCENTAGE", 1);
        PAUSE = new YuMePlayerEventType("PAUSE", 2);
        RESUME = new YuMePlayerEventType("RESUME", 3);
        MUTE = new YuMePlayerEventType("MUTE", 4);
        UNMUTE = new YuMePlayerEventType("UNMUTE", 5);
        REWIND = new YuMePlayerEventType("REWIND", 6);
        FULL_SCREEN = new YuMePlayerEventType("FULL_SCREEN", 7);
        EXPAND = new YuMePlayerEventType("EXPAND", 8);
        ACCEPT_INVITATION = new YuMePlayerEventType("ACCEPT_INVITATION", 9);
        COLLAPSE = new YuMePlayerEventType("COLLAPSE", 10);
        CLOSE = new YuMePlayerEventType("CLOSE", 11);
        END = new YuMePlayerEventType("END", 12);
        a = (new YuMePlayerEventType[] {
            NONE, PERCENTAGE, PAUSE, RESUME, MUTE, UNMUTE, REWIND, FULL_SCREEN, EXPAND, ACCEPT_INVITATION, 
            COLLAPSE, CLOSE, END
        });
    }
}
