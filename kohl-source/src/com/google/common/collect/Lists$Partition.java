// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Lists

private static class size extends AbstractList
{

    final List list;
    final int size;

    public volatile Object get(int i)
    {
        return get(i);
    }

    public List get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        i *= size;
        int j = Math.min(size + i, list.size());
        return list.subList(i, j);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return ((list.size() + size) - 1) / size;
    }

    (List list1, int i)
    {
        list = list1;
        size = i;
    }
}
