// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeTimelineEventType extends Enum
{

    public static final YuMeTimelineEventType ABSOLUTE_TIME_IN_SECONDS;
    public static final YuMeTimelineEventType NONE;
    public static final YuMeTimelineEventType PLAYBACK_PERCENTAGE;
    private static final YuMeTimelineEventType a[];

    private YuMeTimelineEventType(String s, int i)
    {
        super(s, i);
    }

    public static YuMeTimelineEventType valueOf(String s)
    {
        return (YuMeTimelineEventType)Enum.valueOf(com/yume/android/sdk/YuMeTimelineEventType, s);
    }

    public static YuMeTimelineEventType[] values()
    {
        YuMeTimelineEventType ayumetimelineeventtype[] = a;
        int i = ayumetimelineeventtype.length;
        YuMeTimelineEventType ayumetimelineeventtype1[] = new YuMeTimelineEventType[i];
        System.arraycopy(ayumetimelineeventtype, 0, ayumetimelineeventtype1, 0, i);
        return ayumetimelineeventtype1;
    }

    static 
    {
        NONE = new YuMeTimelineEventType("NONE", 0);
        ABSOLUTE_TIME_IN_SECONDS = new YuMeTimelineEventType("ABSOLUTE_TIME_IN_SECONDS", 1);
        PLAYBACK_PERCENTAGE = new YuMeTimelineEventType("PLAYBACK_PERCENTAGE", 2);
        a = (new YuMeTimelineEventType[] {
            NONE, ABSOLUTE_TIME_IN_SECONDS, PLAYBACK_PERCENTAGE
        });
    }
}
