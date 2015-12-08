// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;


final class l extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    private static final l g[];

    private l(String s, int i)
    {
        super(s, i);
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/facebook/a/l, s);
    }

    public static l[] values()
    {
        return (l[])g.clone();
    }

    static 
    {
        a = new l("EXPLICIT", 0);
        b = new l("TIMER", 1);
        c = new l("SESSION_CHANGE", 2);
        d = new l("PERSISTED_EVENTS", 3);
        e = new l("EVENT_THRESHOLD", 4);
        f = new l("EAGER_FLUSHING_EVENT", 5);
        g = (new l[] {
            a, b, c, d, e, f
        });
    }
}
