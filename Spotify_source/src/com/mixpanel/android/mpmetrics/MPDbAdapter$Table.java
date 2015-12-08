// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


public final class mTableName extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    public final String mTableName;

    public static mTableName valueOf(String s)
    {
        return (mTableName)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
    }

    public static mTableName[] values()
    {
        return (mTableName[])c.clone();
    }

    static 
    {
        a = new <init>("EVENTS", 0, "events");
        b = new <init>("PEOPLE", 1, "people");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mTableName = s1;
    }
}
