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

public final class bz extends Enum
    implements fr
{

    public static final bz a;
    public static final bz b;
    public static final bz c;
    private static final Map d;
    private static final bz g[];
    private final short e;
    private final String f;

    private bz(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static bz valueOf(String s)
    {
        return (bz)Enum.valueOf(b/a/bz, s);
    }

    public static bz[] values()
    {
        return (bz[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new bz("SNAPSHOTS", 0, (short)1, "snapshots");
        b = new bz("JOURNALS", 1, (short)2, "journals");
        c = new bz("CHECKSUM", 2, (short)3, "checksum");
        g = (new bz[] {
            a, b, c
        });
        d = new HashMap();
        bz bz1;
        for (Iterator iterator = EnumSet.allOf(b/a/bz).iterator(); iterator.hasNext(); d.put(bz1.f, bz1))
        {
            bz1 = (bz)iterator.next();
        }

    }
}
