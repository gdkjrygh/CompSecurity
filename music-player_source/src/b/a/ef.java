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

public final class ef extends Enum
    implements fr
{

    public static final ef a;
    public static final ef b;
    public static final ef c;
    private static final Map d;
    private static final ef g[];
    private final short e;
    private final String f;

    private ef(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static ef valueOf(String s)
    {
        return (ef)Enum.valueOf(b/a/ef, s);
    }

    public static ef[] values()
    {
        return (ef[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new ef("RESP_CODE", 0, (short)1, "resp_code");
        b = new ef("MSG", 1, (short)2, "msg");
        c = new ef("IMPRINT", 2, (short)3, "imprint");
        g = (new ef[] {
            a, b, c
        });
        d = new HashMap();
        ef ef1;
        for (Iterator iterator = EnumSet.allOf(b/a/ef).iterator(); iterator.hasNext(); d.put(ef1.f, ef1))
        {
            ef1 = (ef)iterator.next();
        }

    }
}
