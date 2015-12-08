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

public final class ba extends Enum
    implements fr
{

    public static final ba a;
    public static final ba b;
    public static final ba c;
    private static final Map d;
    private static final ba g[];
    private final short e;
    private final String f;

    private ba(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static ba valueOf(String s)
    {
        return (ba)Enum.valueOf(b/a/ba, s);
    }

    public static ba[] values()
    {
        return (ba[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new ba("TS", 0, (short)1, "ts");
        b = new ba("CONTEXT", 1, (short)2, "context");
        c = new ba("SOURCE", 2, (short)3, "source");
        g = (new ba[] {
            a, b, c
        });
        d = new HashMap();
        ba ba1;
        for (Iterator iterator = EnumSet.allOf(b/a/ba).iterator(); iterator.hasNext(); d.put(ba1.f, ba1))
        {
            ba1 = (ba)iterator.next();
        }

    }
}
