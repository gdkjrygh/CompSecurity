// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            i, ch, e

final class m extends i
    implements SortedSet
{

    final e b;

    m(e e, SortedMap sortedmap)
    {
        b = e;
        super(e, sortedmap);
    }

    public final Comparator comparator()
    {
        return ((SortedMap)super.c).comparator();
    }

    public final Object first()
    {
        return ((SortedMap)super.c).firstKey();
    }

    public final SortedSet headSet(Object obj)
    {
        return new m(b, ((SortedMap)super.c).headMap(obj));
    }

    public final Object last()
    {
        return ((SortedMap)super.c).lastKey();
    }

    public final SortedSet subSet(Object obj, Object obj1)
    {
        return new m(b, ((SortedMap)super.c).subMap(obj, obj1));
    }

    public final SortedSet tailSet(Object obj)
    {
        return new m(b, ((SortedMap)super.c).tailMap(obj));
    }
}
