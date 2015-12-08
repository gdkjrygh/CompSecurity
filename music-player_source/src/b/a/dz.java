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

public final class dz extends Enum
    implements fr
{

    public static final dz a;
    public static final dz b;
    private static final Map c;
    private static final dz f[];
    private final short d;
    private final String e;

    private dz(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static dz valueOf(String s)
    {
        return (dz)Enum.valueOf(b/a/dz, s);
    }

    public static dz[] values()
    {
        return (dz[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new dz("HEIGHT", 0, (short)1, "height");
        b = new dz("WIDTH", 1, (short)2, "width");
        f = (new dz[] {
            a, b
        });
        c = new HashMap();
        dz dz1;
        for (Iterator iterator = EnumSet.allOf(b/a/dz).iterator(); iterator.hasNext(); c.put(dz1.e, dz1))
        {
            dz1 = (dz)iterator.next();
        }

    }
}
