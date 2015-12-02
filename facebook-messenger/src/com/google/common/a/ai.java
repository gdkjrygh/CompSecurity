// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            ab, aj, x

class ai extends ab
    implements SortedMap
{

    SortedSet d;
    final x e;

    ai(x x, SortedMap sortedmap)
    {
        e = x;
        super(x, sortedmap);
    }

    SortedMap a()
    {
        return (SortedMap)a;
    }

    public SortedSet b()
    {
        SortedSet sortedset = d;
        Object obj = sortedset;
        if (sortedset == null)
        {
            obj = new aj(e, a());
            d = ((SortedSet) (obj));
        }
        return ((SortedSet) (obj));
    }

    public Comparator comparator()
    {
        return a().comparator();
    }

    public Object firstKey()
    {
        return a().firstKey();
    }

    public SortedMap headMap(Object obj)
    {
        return new ai(e, a().headMap(obj));
    }

    public Set keySet()
    {
        return b();
    }

    public Object lastKey()
    {
        return a().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return new ai(e, a().subMap(obj, obj1));
    }

    public SortedMap tailMap(Object obj)
    {
        return new ai(e, a().tailMap(obj));
    }
}
