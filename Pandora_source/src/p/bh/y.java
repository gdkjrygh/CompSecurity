// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;

import java.util.EnumSet;
import java.util.Iterator;

public final class y extends Enum
{

    public static final y a;
    public static final y b;
    public static final y c;
    public static final y d;
    public static final y e;
    private static final y g[];
    String f;

    private y(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static y a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(p/bh/y).iterator(); iterator.hasNext();)
        {
            y y1 = (y)iterator.next();
            if (y1.toString().equals(s))
            {
                return y1;
            }
        }

        return null;
    }

    public static y valueOf(String s)
    {
        return (y)Enum.valueOf(p/bh/y, s);
    }

    public static y[] values()
    {
        return (y[])g.clone();
    }

    public String toString()
    {
        return f;
    }

    static 
    {
        a = new y("SYSCTXT_MAIN", 0, "MAIN");
        b = new y("SYSCTXT_VRSESSION", 1, "VRSESSION");
        c = new y("SYSCTXT_MENU", 2, "MENU");
        d = new y("SYSCTXT_HMI_OBSCURED", 3, "HMI_OBSCURED");
        e = new y("SYSCTXT_ALERT", 4, "ALERT");
        g = (new y[] {
            a, b, c, d, e
        });
    }
}
