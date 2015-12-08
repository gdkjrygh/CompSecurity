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

public final class w extends Enum
    implements fr
{

    public static final w a;
    public static final w b;
    private static final Map c;
    private static final w f[];
    private final short d;
    private final String e;

    private w(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(b/a/w, s);
    }

    public static w[] values()
    {
        return (w[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new w("PROVIDER", 0, (short)1, "provider");
        b = new w("PUID", 1, (short)2, "puid");
        f = (new w[] {
            a, b
        });
        c = new HashMap();
        w w1;
        for (Iterator iterator = EnumSet.allOf(b/a/w).iterator(); iterator.hasNext(); c.put(w1.e, w1))
        {
            w1 = (w)iterator.next();
        }

    }
}
