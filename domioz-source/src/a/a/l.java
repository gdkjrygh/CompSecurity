// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class l extends Enum
{

    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    private static final Map g;
    private static final l i[];
    private final String h;

    private l(String s, int j, String s1)
    {
        super(s, j);
        h = s1;
    }

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(a/a/l, s);
    }

    public static l[] values()
    {
        return (l[])i.clone();
    }

    static 
    {
        a = new l("UNKNOWN", 0, "unknown");
        b = new l("NONE", 1, "none");
        c = new l("TWO_G", 2, "2g");
        d = new l("THREE_G", 3, "3g");
        e = new l("FOUR_G", 4, "4g");
        f = new l("WIFI", 5, "wifi");
        i = (new l[] {
            a, b, c, d, e, f
        });
        g = new HashMap();
        l l1;
        for (Iterator iterator = EnumSet.allOf(a/a/l).iterator(); iterator.hasNext(); g.put(l1.h, l1))
        {
            l1 = (l)iterator.next();
        }

    }
}
