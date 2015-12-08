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

public final class cm extends Enum
    implements fr
{

    public static final cm a;
    public static final cm b;
    public static final cm c;
    private static final Map d;
    private static final cm g[];
    private final short e;
    private final String f;

    private cm(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static cm valueOf(String s)
    {
        return (cm)Enum.valueOf(b/a/cm, s);
    }

    public static cm[] values()
    {
        return (cm[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new cm("VALUE", 0, (short)1, "value");
        b = new cm("TS", 1, (short)2, "ts");
        c = new cm("GUID", 2, (short)3, "guid");
        g = (new cm[] {
            a, b, c
        });
        d = new HashMap();
        cm cm1;
        for (Iterator iterator = EnumSet.allOf(b/a/cm).iterator(); iterator.hasNext(); d.put(cm1.f, cm1))
        {
            cm1 = (cm)iterator.next();
        }

    }
}
