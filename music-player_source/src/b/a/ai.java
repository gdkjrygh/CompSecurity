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

public final class ai extends Enum
    implements fr
{

    public static final ai a;
    public static final ai b;
    public static final ai c;
    private static final Map d;
    private static final ai g[];
    private final short e;
    private final String f;

    private ai(String s, int i, short word0, String s1)
    {
        super(s, i);
        e = word0;
        f = s1;
    }

    public static ai valueOf(String s)
    {
        return (ai)Enum.valueOf(b/a/ai, s);
    }

    public static ai[] values()
    {
        return (ai[])g.clone();
    }

    public final short a()
    {
        return e;
    }

    static 
    {
        a = new ai("SUCCESSFUL_REQUESTS", 0, (short)1, "successful_requests");
        b = new ai("FAILED_REQUESTS", 1, (short)2, "failed_requests");
        c = new ai("LAST_REQUEST_SPENT_MS", 2, (short)3, "last_request_spent_ms");
        g = (new ai[] {
            a, b, c
        });
        d = new HashMap();
        ai ai1;
        for (Iterator iterator = EnumSet.allOf(b/a/ai).iterator(); iterator.hasNext(); d.put(ai1.f, ai1))
        {
            ai1 = (ai)iterator.next();
        }

    }
}
