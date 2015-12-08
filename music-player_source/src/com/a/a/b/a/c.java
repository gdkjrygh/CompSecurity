// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    private static final c f[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/a/a/b/a/c, s);
    }

    public static c[] values()
    {
        return (c[])f.clone();
    }

    static 
    {
        a = new c("IO_ERROR", 0);
        b = new c("DECODING_ERROR", 1);
        c = new c("NETWORK_DENIED", 2);
        d = new c("OUT_OF_MEMORY", 3);
        e = new c("UNKNOWN", 4);
        f = (new c[] {
            a, b, c, d, e
        });
    }
}
