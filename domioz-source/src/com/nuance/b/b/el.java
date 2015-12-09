// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


final class el extends Enum
{

    public static final el a;
    public static final el b;
    public static final el c;
    public static final el d;
    public static final el e;
    public static final el f;
    private static final el g[];

    private el(String s, int i)
    {
        super(s, i);
    }

    public static el valueOf(String s)
    {
        return (el)Enum.valueOf(com/nuance/b/b/el, s);
    }

    public static el[] values()
    {
        return (el[])g.clone();
    }

    static 
    {
        a = new el("NOT_STARTED", 0);
        b = new el("STARTING", 1);
        c = new el("LISTENING", 2);
        d = new el("PROCESSING", 3);
        e = new el("CANCELLING", 4);
        f = new el("COMPLETED", 5);
        g = (new el[] {
            a, b, c, d, e, f
        });
    }
}
