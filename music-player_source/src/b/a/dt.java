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

public final class dt extends Enum
    implements fr
{

    public static final dt a;
    public static final dt b;
    private static final Map c;
    private static final dt f[];
    private final short d;
    private final String e;

    private dt(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static dt a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;
        }
    }

    public static dt b(int i)
    {
        dt dt1 = a(i);
        if (dt1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Field ")).append(i).append(" doesn't exist!").toString());
        } else
        {
            return dt1;
        }
    }

    public static dt valueOf(String s)
    {
        return (dt)Enum.valueOf(b/a/dt, s);
    }

    public static dt[] values()
    {
        return (dt[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new dt("STRING_VALUE", 0, (short)1, "string_value");
        b = new dt("LONG_VALUE", 1, (short)2, "long_value");
        f = (new dt[] {
            a, b
        });
        c = new HashMap();
        dt dt1;
        for (Iterator iterator = EnumSet.allOf(b/a/dt).iterator(); iterator.hasNext(); c.put(dt1.e, dt1))
        {
            dt1 = (dt)iterator.next();
        }

    }
}
