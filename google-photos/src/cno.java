// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cno
{

    public final cmi a;

    public cno(cmi cmi1)
    {
        a = (cmi)b.a(cmi1, "pointMetrics", null);
    }

    public static Map a(List list)
    {
        java.util.HashMap hashmap = b.l(list.size());
        cqk cqk1;
        for (list = list.iterator(); list.hasNext(); hashmap.put(cqk1.a, cqk1.c.b))
        {
            cqk1 = (cqk)list.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }
}
