// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class hss
{

    private Map a;

    hss(int i)
    {
        a = new HashMap(i);
    }

    public hss(hsr hsr1)
    {
        p.a(hsr1);
        a = (Map)p.a(hsr1.a);
    }

    public final hsr a()
    {
        return new hsr(a);
    }

    public final hss a(hsw hsw, List list)
    {
        List list1 = (List)a.get(hsw);
        Object obj = list1;
        if (list1 == null)
        {
            obj = new ArrayList();
            a.put(hsw, obj);
        }
        ((List) (obj)).addAll(list);
        return this;
    }

    public final hss a(hsw hsw, qav qav)
    {
        return a(hsw, Collections.singletonList(new hsi(qav)));
    }
}
