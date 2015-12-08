// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;


public final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    private static final ae d[];
    private final String c;

    private ae(String s, int i, String s1)
    {
        super(s, i);
        c = s1;
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/android/slyce/report/mpmetrics/ae, s);
    }

    public static ae[] values()
    {
        return (ae[])d.clone();
    }

    public String a()
    {
        return c;
    }

    static 
    {
        a = new ae("EVENTS", 0, "events");
        b = new ae("PEOPLE", 1, "people");
        d = (new ae[] {
            a, b
        });
    }
}
