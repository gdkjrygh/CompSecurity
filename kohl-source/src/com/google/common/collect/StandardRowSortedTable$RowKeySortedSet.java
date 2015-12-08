// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            StandardRowSortedTable

private class <init> extends <init>
    implements SortedSet
{

    final StandardRowSortedTable this$0;

    public Comparator comparator()
    {
        return StandardRowSortedTable.access$100(StandardRowSortedTable.this).comparator();
    }

    public Object first()
    {
        return StandardRowSortedTable.access$100(StandardRowSortedTable.this).firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return (new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).headMap(obj), factory)).rowKeySet();
    }

    public Object last()
    {
        return StandardRowSortedTable.access$100(StandardRowSortedTable.this).lastKey();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj1);
        return (new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).subMap(obj, obj1), factory)).rowKeySet();
    }

    public SortedSet tailSet(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return (new StandardRowSortedTable(StandardRowSortedTable.access$100(StandardRowSortedTable.this).tailMap(obj), factory)).rowKeySet();
    }

    private ()
    {
        this$0 = StandardRowSortedTable.this;
        super(StandardRowSortedTable.this);
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
