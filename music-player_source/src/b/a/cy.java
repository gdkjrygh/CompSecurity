// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package b.a:
//            fr

public final class cy extends Enum
    implements fr
{

    public static final cy a;
    public static final cy b;
    private static final Map c;
    private static final cy f[];
    private final short d;
    private final String e;

    private cy(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static cy valueOf(String s)
    {
        return (cy)Enum.valueOf(b/a/cy, s);
    }

    public static cy[] values()
    {
        return (cy[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new cy("LATENCY", 0, (short)1, "latency");
        b = new cy("INTERVAL", 1, (short)2, "interval");
        f = (new cy[] {
            a, b
        });
        c = new HashMap();
        cy cy1;
        for (Iterator iterator = EnumSet.allOf(b/a/cy).iterator(); iterator.hasNext(); c.put(cy1.e, cy1))
        {
            cy1 = (cy)iterator.next();
        }

    }
}
