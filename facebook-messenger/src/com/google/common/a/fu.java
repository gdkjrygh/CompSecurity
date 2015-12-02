// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            ew, fp, es, ev

public class fu extends ew
{

    private final Comparator b;

    public fu(Comparator comparator)
    {
        b = (Comparator)Preconditions.checkNotNull(comparator);
    }

    public fp a()
    {
        fp.a(a, b);
        fp.b(a, b);
        return new fp(es.a(a), b);
    }

    public fu a(Object obj, Object obj1)
    {
        a.add(ev.b(obj, obj1));
        return this;
    }

    public fu a(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); a(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }

    public ev b()
    {
        return a();
    }

    public ew b(Object obj, Object obj1)
    {
        return a(obj, obj1);
    }

    public ew b(Map map)
    {
        return a(map);
    }
}
