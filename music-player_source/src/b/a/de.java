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

public final class de extends Enum
    implements fr
{

    public static final de a;
    public static final de b;
    public static final de c;
    private static final Map d;
    private static final de g[];
    private final short e;
    private final String f;

    private de(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static de valueOf(String s)
    {
        return (de)Enum.valueOf(b/a/de, s);
    }

    public static de[] values()
    {
        return (de[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new de("LAT", 0, (short)1, "lat");
        b = new de("LNG", 1, (short)2, "lng");
        c = new de("TS", 2, (short)3, "ts");
        g = (new de[] {
            a, b, c
        });
        d = new HashMap();
        de de1;
        for (Iterator iterator = EnumSet.allOf(b/a/de).iterator(); iterator.hasNext(); d.put(de1.f, de1))
        {
            de1 = (de)iterator.next();
        }

    }
}
