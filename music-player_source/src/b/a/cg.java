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

public final class cg extends Enum
    implements fr
{

    public static final cg a;
    public static final cg b;
    public static final cg c;
    private static final Map d;
    private static final cg g[];
    private final short e;
    private final String f;

    private cg(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static cg valueOf(String s)
    {
        return (cg)Enum.valueOf(b/a/cg, s);
    }

    public static cg[] values()
    {
        return (cg[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new cg("PROPERTY", 0, (short)1, "property");
        b = new cg("VERSION", 1, (short)2, "version");
        c = new cg("CHECKSUM", 2, (short)3, "checksum");
        g = (new cg[] {
            a, b, c
        });
        d = new HashMap();
        cg cg1;
        for (Iterator iterator = EnumSet.allOf(b/a/cg).iterator(); iterator.hasNext(); d.put(cg1.f, cg1))
        {
            cg1 = (cg)iterator.next();
        }

    }
}
