// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Lists

private static class backingList extends AbstractList
{

    final List backingList;

    public void add(int i, Object obj)
    {
        backingList.add(i, obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        return backingList.addAll(i, collection);
    }

    public boolean contains(Object obj)
    {
        return backingList.contains(obj);
    }

    public Object get(int i)
    {
        return backingList.get(i);
    }

    public Object remove(int i)
    {
        return backingList.remove(i);
    }

    public Object set(int i, Object obj)
    {
        return backingList.set(i, obj);
    }

    public int size()
    {
        return backingList.size();
    }

    _cls9(List list)
    {
        backingList = (List)Preconditions.checkNotNull(list);
    }
}
