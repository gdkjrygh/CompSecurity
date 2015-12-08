// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class am extends Enum
{

    public static final am a;
    public static final am b;
    public static final am c;
    public static final am d;
    public static final am e;
    public static final am f;
    private static final Map g;
    private static final am i[];
    private final String h;

    private am(String s, int j, String s1)
    {
        super(s, j);
        h = s1;
    }

    public static am valueOf(String s)
    {
        return (am)Enum.valueOf(bo/app/am, s);
    }

    public static am[] values()
    {
        return (am[])i.clone();
    }

    static 
    {
        a = new am("UNKNOWN", 0, "unknown");
        b = new am("NONE", 1, "none");
        c = new am("TWO_G", 2, "2g");
        d = new am("THREE_G", 3, "3g");
        e = new am("FOUR_G", 4, "4g");
        f = new am("WIFI", 5, "wifi");
        i = (new am[] {
            a, b, c, d, e, f
        });
        g = new HashMap();
        am am1;
        for (Iterator iterator = EnumSet.allOf(bo/app/am).iterator(); iterator.hasNext(); g.put(am1.h, am1))
        {
            am1 = (am)iterator.next();
        }

    }
}
