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

public final class bh extends Enum
    implements fr
{

    public static final bh a;
    public static final bh b;
    public static final bh c;
    public static final bh d;
    public static final bh e;
    private static final Map f;
    private static final bh i[];
    private final short g;
    private final String h;

    private bh(String s, int j, short word0, String s1)
    {
        super(s, j);
        g = word0;
        h = s1;
    }

    public static bh valueOf(String s)
    {
        return (bh)Enum.valueOf(b/a/bh, s);
    }

    public static bh[] values()
    {
        return (bh[])i.clone();
    }

    public final short a()
    {
        return g;
    }

    static 
    {
        a = new bh("NAME", 0, (short)1, "name");
        b = new bh("PROPERTIES", 1, (short)2, "properties");
        c = new bh("DURATION", 2, (short)3, "duration");
        d = new bh("ACC", 3, (short)4, "acc");
        e = new bh("TS", 4, (short)5, "ts");
        i = (new bh[] {
            a, b, c, d, e
        });
        f = new HashMap();
        bh bh1;
        for (Iterator iterator = EnumSet.allOf(b/a/bh).iterator(); iterator.hasNext(); f.put(bh1.h, bh1))
        {
            bh1 = (bh)iterator.next();
        }

    }
}
