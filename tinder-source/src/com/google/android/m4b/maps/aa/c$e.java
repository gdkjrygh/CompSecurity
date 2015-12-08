// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

public final class <init> extends <init>
    implements SortedSet
{

    private c c;

    public final Comparator comparator()
    {
        return ((SortedMap)super.a).comparator();
    }

    public final Object first()
    {
        return ((SortedMap)super.a).firstKey();
    }

    public final SortedSet headSet(Object obj)
    {
        return new <init>(c, ((SortedMap)super.a).headMap(obj));
    }

    public final Object last()
    {
        return ((SortedMap)super.a).lastKey();
    }

    public final SortedSet subSet(Object obj, Object obj1)
    {
        return new <init>(c, ((SortedMap)super.a).subMap(obj, obj1));
    }

    public final SortedSet tailSet(Object obj)
    {
        return new <init>(c, ((SortedMap)super.a).tailMap(obj));
    }

    (c c1, SortedMap sortedmap)
    {
        c = c1;
        super(c1, sortedmap);
    }
}
