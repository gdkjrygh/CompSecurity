// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c.a;

import java.util.EnumSet;
import java.util.Iterator;

public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    private static final u g[];
    String f;

    private u(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static u a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/e/c/a/u).iterator(); iterator.hasNext();)
        {
            u u1 = (u)iterator.next();
            if (u1.toString().equals(s))
            {
                return u1;
            }
        }

        return null;
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/ford/syncV4/e/c/a/u, s);
    }

    public static u[] values()
    {
        return (u[])g.clone();
    }

    public final String toString()
    {
        return f;
    }

    static 
    {
        a = new u("SYSCTXT_MAIN", 0, "MAIN");
        b = new u("SYSCTXT_VRSESSION", 1, "VRSESSION");
        c = new u("SYSCTXT_MENU", 2, "MENU");
        d = new u("SYSCTXT_HMI_OBSCURED", 3, "HMI_OBSCURED");
        e = new u("SYSCTXT_ALERT", 4, "ALERT");
        g = (new u[] {
            a, b, c, d, e
        });
    }
}
