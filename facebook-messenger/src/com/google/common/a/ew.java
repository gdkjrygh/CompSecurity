// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            hq, jw, ev, ks, 
//            gb

public class ew
{

    final ArrayList a = hq.a();

    public ew()
    {
    }

    private static ev a(List list)
    {
        switch (list.size())
        {
        default:
            return new jw((java.util.Map.Entry[])list.toArray(new java.util.Map.Entry[list.size()]));

        case 0: // '\0'
            return ev.j();

        case 1: // '\001'
            return new ks((java.util.Map.Entry)gb.b(list));
        }
    }

    public ev b()
    {
        return a(a);
    }

    public ew b(Object obj, Object obj1)
    {
        a.add(ev.b(obj, obj1));
        return this;
    }

    public ew b(Map map)
    {
        a.ensureCapacity(a.size() + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); b(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return this;
    }
}
