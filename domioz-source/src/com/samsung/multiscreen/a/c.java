// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    private c(String s, int i)
    {
        super(s, i);
    }

    public static c a(String s)
    {
        if (s != null && !s.equalsIgnoreCase("Not running") && !s.equalsIgnoreCase("not started") && !s.equalsIgnoreCase("stopped"))
        {
            if (s.equalsIgnoreCase("running"))
            {
                return b;
            }
            if (s.equalsIgnoreCase("Starting"))
            {
                return b;
            }
            if (s.contains("installable".toLowerCase()))
            {
                return c;
            }
        }
        return a;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/samsung/multiscreen/a/c, s);
    }

    public static c[] values()
    {
        return (c[])d.clone();
    }

    static 
    {
        a = new c("STOPPED", 0);
        b = new c("RUNNING", 1);
        c = new c("INSTALLABLE", 2);
        d = (new c[] {
            a, b, c
        });
    }
}
