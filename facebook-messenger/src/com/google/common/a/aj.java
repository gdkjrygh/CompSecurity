// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            af, x

class aj extends af
    implements SortedSet
{

    final x c;

    aj(x x, SortedMap sortedmap)
    {
        c = x;
        super(x, sortedmap);
    }

    SortedMap b()
    {
        return (SortedMap)a;
    }

    public Comparator comparator()
    {
        return b().comparator();
    }

    public Object first()
    {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        return new aj(c, b().headMap(obj));
    }

    public Object last()
    {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new aj(c, b().subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new aj(c, b().tailMap(obj));
    }
}
