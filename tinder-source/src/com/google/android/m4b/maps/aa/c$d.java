// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

public final class <init> extends <init>
    implements SortedMap
{

    private SortedSet c;
    private c d;

    private SortedSet c()
    {
        return new <init>(d, (SortedMap)a);
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
        return new <init>(d, ((SortedMap)a).headMap(obj));
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
        return new <init>(d, ((SortedMap)a).subMap(obj, obj1));
    }

    public final SortedMap tailMap(Object obj)
    {
        return new <init>(d, ((SortedMap)a).tailMap(obj));
    }

    (c c1, SortedMap sortedmap)
    {
        d = c1;
        super(c1, sortedmap);
    }
}
