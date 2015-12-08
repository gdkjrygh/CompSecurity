// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;


public final class StatsType extends Enum
{

    public static final StatsType a;
    public static final StatsType b;
    public static final StatsType c;
    private static final StatsType e[];
    private int d;

    private StatsType(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static StatsType valueOf(String s)
    {
        return (StatsType)Enum.valueOf(com/skype/android/analytics/StatsType, s);
    }

    public static StatsType[] values()
    {
        return (StatsType[])e.clone();
    }

    public final int a()
    {
        return d;
    }

    static 
    {
        a = new StatsType("SKYPE_ACCESS", 0, 35);
        b = new StatsType("HARDWARE", 1, 40);
        c = new StatsType("ANDROID", 2, 41);
        e = (new StatsType[] {
            a, b, c
        });
    }
}
