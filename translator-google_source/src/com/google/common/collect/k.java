// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            d, l, AbstractMapBasedMultimap

final class k extends d
    implements SortedMap
{

    SortedSet c;
    final AbstractMapBasedMultimap d;

    k(AbstractMapBasedMultimap abstractmapbasedmultimap, SortedMap sortedmap)
    {
        d = abstractmapbasedmultimap;
        super(abstractmapbasedmultimap, sortedmap);
    }

    private SortedSet c()
    {
        return new l(d, (SortedMap)a);
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
        return new k(d, ((SortedMap)a).headMap(obj));
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
        return new k(d, ((SortedMap)a).subMap(obj, obj1));
    }

    public final SortedMap tailMap(Object obj)
    {
        return new k(d, ((SortedMap)a).tailMap(obj));
    }
}
