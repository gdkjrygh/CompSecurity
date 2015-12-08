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

public final class dq extends Enum
    implements fr
{

    public static final dq a;
    public static final dq b;
    private static final Map c;
    private static final dq f[];
    private final short d;
    private final String e;

    private dq(String s, int i, short word0, String s1)
    {
        super(s, i);
        d = word0;
        e = s1;
    }

    public static dq valueOf(String s)
    {
        return (dq)Enum.valueOf(b/a/dq, s);
    }

    public static dq[] values()
    {
        return (dq[])f.clone();
    }

    public final short a()
    {
        return d;
    }

    static 
    {
        a = new dq("PAGE_NAME", 0, (short)1, "page_name");
        b = new dq("DURATION", 1, (short)2, "duration");
        f = (new dq[] {
            a, b
        });
        c = new HashMap();
        dq dq1;
        for (Iterator iterator = EnumSet.allOf(b/a/dq).iterator(); iterator.hasNext(); c.put(dq1.e, dq1))
        {
            dq1 = (dq)iterator.next();
        }

    }
}
