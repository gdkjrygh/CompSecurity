// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;


public final class ac extends Enum
{

    public static final ac a;
    public static final ac b;
    public static final ac c;
    public static final ac d;
    public static final ac e;
    private static final ac f[];

    private ac(String s, int i)
    {
        super(s, i);
    }

    public static ac valueOf(String s)
    {
        return (ac)Enum.valueOf(com/nuance/b/a/ac, s);
    }

    public static ac[] values()
    {
        return (ac[])f.clone();
    }

    static 
    {
        a = new ac("BUSY", 0);
        b = new ac("IDLE", 1);
        c = new ac("EXECUTE_RUNNABLE", 2);
        d = new ac("SPEECH_INTERPRETATION", 3);
        e = new ac("EXIT", 4);
        f = (new ac[] {
            a, b, c, d, e
        });
    }
}
