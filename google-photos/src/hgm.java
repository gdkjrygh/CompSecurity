// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class hgm
{

    private final Map a;

    public hgm(List list)
    {
        a = Collections.unmodifiableMap(a(list));
    }

    private static Map a(List list)
    {
        HashMap hashmap = new HashMap();
        qfu qfu1;
        for (list = list.iterator(); list.hasNext(); hashmap.put(qfu1.a.a, qfu1))
        {
            qfu1 = (qfu)list.next();
        }

        return hashmap;
    }

    public final qfu a(pzd pzd1)
    {
        return (qfu)a.get(pzd1.a);
    }
}
