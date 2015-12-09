// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;


public final class LiveDataSource extends Enum
{

    public static final LiveDataSource a;
    public static final LiveDataSource b;
    public static final LiveDataSource c;
    private static final LiveDataSource d[];

    private LiveDataSource(String s, int i)
    {
        super(s, i);
    }

    public static LiveDataSource valueOf(String s)
    {
        return (LiveDataSource)Enum.valueOf(com/fitbit/livedata/LiveDataSource, s);
    }

    public static LiveDataSource[] values()
    {
        return (LiveDataSource[])d.clone();
    }

    static 
    {
        a = new LiveDataSource("BLUETOOTH", 0);
        b = new LiveDataSource("PEDOMETER", 1);
        c = new LiveDataSource("EMPTY", 2);
        d = (new LiveDataSource[] {
            a, b, c
        });
    }
}
