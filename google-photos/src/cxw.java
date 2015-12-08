// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class cxw
{

    public final List a;
    public final List b;
    public final long c;
    public final long d;
    public final int e;
    public final cqp f;

    cxw(List list, Map map, List list1, Map map1, long l, long l1, int i, cqp cqp1)
    {
        if (list == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        a = list;
        if (map == null)
        {
            Collections.emptyMap();
        } else
        {
            Collections.unmodifiableMap(map);
        }
        if (list1 == null)
        {
            list = Collections.emptyList();
        } else
        {
            list = Collections.unmodifiableList(list1);
        }
        b = list;
        if (map1 == null)
        {
            Collections.emptyMap();
        } else
        {
            Collections.unmodifiableMap(map1);
        }
        c = l;
        d = l1;
        e = i;
        f = (cqp)b.a(cqp1, "constraints", null);
    }
}
