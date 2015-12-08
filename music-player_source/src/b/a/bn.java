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

public final class bn extends Enum
    implements fr
{

    public static final bn a;
    public static final bn b;
    public static final bn c;
    public static final bn d;
    private static final Map e;
    private static final bn h[];
    private final short f;
    private final String g;

    private bn(String s, int i, short word0, String s1)
    {
        super(s, i);
        f = word0;
        g = s1;
    }

    public static bn valueOf(String s)
    {
        return (bn)Enum.valueOf(b/a/bn, s);
    }

    public static bn[] values()
    {
        return (bn[])h.clone();
    }

    public final short a()
    {
        return f;
    }

    static 
    {
        a = new bn("DOMAIN", 0, (short)1, "domain");
        b = new bn("OLD_ID", 1, (short)2, "old_id");
        c = new bn("NEW_ID", 2, (short)3, "new_id");
        d = new bn("TS", 3, (short)4, "ts");
        h = (new bn[] {
            a, b, c, d
        });
        e = new HashMap();
        bn bn1;
        for (Iterator iterator = EnumSet.allOf(b/a/bn).iterator(); iterator.hasNext(); e.put(bn1.g, bn1))
        {
            bn1 = (bn)iterator.next();
        }

    }
}
