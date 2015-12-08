// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;


public class TimeUtils
{

    public static final int HOURS_PER_DAY = 24;
    public static final int MILLISECONDS_PER_HOUR = 0x36ee80;
    public static final int MILLISECONDS_PER_MINUTE = 60000;
    public static final int MILLISECONDS_PER_SECOND = 1000;
    public static final int MINUTES_PER_HOUR = 60;
    public static final int NANOSECONDS_PER_MILLISECOND = 0xf4240;
    public static final int NANOSECONDS_PER_SECOND = 0x3b9aca00;
    public static final int SECONDS_PER_DAY = 0x15180;
    public static final int SECONDS_PER_HOUR = 3600;
    public static final int SECONDS_PER_MINUTE = 60;

    private TimeUtils()
    {
    }

    public static long convertNsToMs(long l)
    {
        return l / 0xf4240L;
    }

    public static int convertSecondsToMinutes(int i)
    {
        return (int)((float)i / 60F + 0.5F);
    }
}
