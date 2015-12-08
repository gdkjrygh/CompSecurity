// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ah extends Enum
{

    public static final ah a;
    public static final ah b;
    public static final ah c;
    public static final ah d;
    public static final ah e;
    public static final ah f;
    private static final Map g;
    private static final ah i[];
    private final String h;

    private ah(String s, int j, String s1)
    {
        super(s, j);
        h = s1;
    }

    public static ah valueOf(String s)
    {
        return (ah)Enum.valueOf(bo/app/ah, s);
    }

    public static ah[] values()
    {
        return (ah[])i.clone();
    }

    static 
    {
        a = new ah("UNKNOWN", 0, "unknown");
        b = new ah("NONE", 1, "none");
        c = new ah("TWO_G", 2, "2g");
        d = new ah("THREE_G", 3, "3g");
        e = new ah("FOUR_G", 4, "4g");
        f = new ah("WIFI", 5, "wifi");
        i = (new ah[] {
            a, b, c, d, e, f
        });
        g = new HashMap();
        ah ah1;
        for (Iterator iterator = EnumSet.allOf(bo/app/ah).iterator(); iterator.hasNext(); g.put(ah1.h, ah1))
        {
            ah1 = (ah)iterator.next();
        }

    }
}
