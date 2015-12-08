// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;


public final class LiveDataState extends Enum
{

    public static final LiveDataState a;
    public static final LiveDataState b;
    public static final LiveDataState c;
    public static final LiveDataState d;
    private static final LiveDataState e[];

    private LiveDataState(String s, int i)
    {
        super(s, i);
    }

    public static LiveDataState valueOf(String s)
    {
        return (LiveDataState)Enum.valueOf(com/fitbit/livedata/LiveDataState, s);
    }

    public static LiveDataState[] values()
    {
        return (LiveDataState[])e.clone();
    }

    public boolean a()
    {
        return this == d;
    }

    public boolean b()
    {
        return this == a;
    }

    public boolean c()
    {
        return this == b || this == c;
    }

    static 
    {
        a = new LiveDataState("DISCONNECTED", 0);
        b = new LiveDataState("ESTABLISHING_CONNECTION", 1);
        c = new LiveDataState("DISCONNECTING", 2);
        d = new LiveDataState("STREAMING", 3);
        e = (new LiveDataState[] {
            a, b, c, d
        });
    }
}
