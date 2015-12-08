// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            f, m, e

final class l extends f
    implements SortedMap
{

    SortedSet c;
    final e d;

    l(e e, SortedMap sortedmap)
    {
        d = e;
        super(e, sortedmap);
    }

    private SortedSet c()
    {
        return new m(d, (SortedMap)a);
    }

    final Set b()
    {
        return c();
    }

    public final Comparator comparator()
    {
        return ((SortedMap)a).comparator();
    }

    public final Object firstKey()
    {
        return ((SortedMap)a).firstKey();
    }

    public final SortedMap headMap(Object obj)
    {
        return new l(d, ((SortedMap)a).headMap(obj));
    }

    public final Set keySet()
    {
        SortedSet sortedset1 = c;
        SortedSet sortedset = sortedset1;
        if (sortedset1 == null)
        {
            sortedset = c();
            c = sortedset;
        }
        return sortedset;
    }

    public final Object lastKey()
    {
        return ((SortedMap)a).lastKey();
    }

    public final SortedMap subMap(Object obj, Object obj1)
    {
        return new l(d, ((SortedMap)a).subMap(obj, obj1));
    }

    public final SortedMap tailMap(Object obj)
    {
        return new l(d, ((SortedMap)a).tailMap(obj));
    }
}
