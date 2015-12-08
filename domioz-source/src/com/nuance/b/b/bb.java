// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


public final class bb extends Enum
{

    public static final bb a;
    public static final bb b;
    public static final bb c;
    public static final bb d;
    private static final bb e[];

    private bb(String s, int i)
    {
        super(s, i);
    }

    public static bb valueOf(String s)
    {
        return (bb)Enum.valueOf(com/nuance/b/b/bb, s);
    }

    public static bb[] values()
    {
        return (bb[])e.clone();
    }

    static 
    {
        a = new bb("PCM_8k", 0);
        b = new bb("PCM_16k", 1);
        c = new bb("SPEEX_WB", 2);
        d = new bb("SPEEX_NB", 3);
        e = (new bb[] {
            a, b, c, d
        });
    }
}
