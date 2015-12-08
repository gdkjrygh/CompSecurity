// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import java.util.AbstractList;
import java.util.List;

class Partition extends AbstractList
{

    final List list;
    final int size;

    Partition(List list1, int i)
    {
        list = list1;
        size = i;
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public List get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        i = size * i;
        int j = Math.min(size + i, list.size());
        return list.subList(i, j);
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        int i = list.size() / size;
        if (list.size() % size == 0)
        {
            return i;
        } else
        {
            return i + 1;
        }
    }
}
