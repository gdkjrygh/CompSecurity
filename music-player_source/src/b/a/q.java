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

public final class q extends Enum
    implements fr
{

    public static final q a;
    private static final Map b;
    private static final q e[];
    private final short c = 1;
    private final String d;

    private q(String s, String s1)
    {
        super(s, 0);
        d = s1;
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(b/a/q, s);
    }

    public static q[] values()
    {
        return (q[])e.clone();
    }

    public final short a()
    {
        return c;
    }

    static 
    {
        a = new q("TS", "ts");
        e = (new q[] {
            a
        });
        b = new HashMap();
        q q1;
        for (Iterator iterator = EnumSet.allOf(b/a/q).iterator(); iterator.hasNext(); b.put(q1.d, q1))
        {
            q1 = (q)iterator.next();
        }

    }
}
