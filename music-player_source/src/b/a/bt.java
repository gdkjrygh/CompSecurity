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

public final class bt extends Enum
    implements fr
{

    public static final bt a;
    public static final bt b;
    public static final bt c;
    private static final Map d;
    private static final bt g[];
    private final short e;
    private final String f;

    private bt(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static bt valueOf(String s)
    {
        return (bt)Enum.valueOf(b/a/bt, s);
    }

    public static bt[] values()
    {
        return (bt[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new bt("IDENTITY", 0, (short)1, "identity");
        b = new bt("TS", 1, (short)2, "ts");
        c = new bt("VERSION", 2, (short)3, "version");
        g = (new bt[] {
            a, b, c
        });
        d = new HashMap();
        bt bt1;
        for (Iterator iterator = EnumSet.allOf(b/a/bt).iterator(); iterator.hasNext(); d.put(bt1.f, bt1))
        {
            bt1 = (bt)iterator.next();
        }

    }
}
