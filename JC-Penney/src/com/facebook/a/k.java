// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


final class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    private static final k g[];

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/facebook/a/k, s);
    }

    public static k[] values()
    {
        return (k[])g.clone();
    }

    static 
    {
        a = new k("EXPLICIT", 0);
        b = new k("TIMER", 1);
        c = new k("SESSION_CHANGE", 2);
        d = new k("PERSISTED_EVENTS", 3);
        e = new k("EVENT_THRESHOLD", 4);
        f = new k("EAGER_FLUSHING_EVENT", 5);
        g = (new k[] {
            a, b, c, d, e, f
        });
    }
}
