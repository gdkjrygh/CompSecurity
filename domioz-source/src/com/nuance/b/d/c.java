// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.d;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    private static final c f[];
    private final String e;

    private c(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/nuance/b/d/c, s);
    }

    public static c[] values()
    {
        return (c[])f.clone();
    }

    public final String toString()
    {
        return e;
    }

    static 
    {
        a = new c("FEMALE", 0, "female");
        b = new c("NEUTRAL", 1, "neutral");
        c = new c("MALE", 2, "male");
        d = new c("EMPTY", 3, "");
        f = (new c[] {
            a, b, c, d
        });
    }
}
