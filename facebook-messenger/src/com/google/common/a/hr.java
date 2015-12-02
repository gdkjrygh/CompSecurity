// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractList;
import java.util.List;

class hr extends AbstractList
{

    final List a;
    final int b;

    hr(List list, int i)
    {
        a = list;
        b = i;
    }

    public List a(int i)
    {
        Preconditions.checkElementIndex(i, size());
        i = b * i;
        int j = Math.min(b + i, a.size());
        return a.subList(i, j);
    }

    public Object get(int i)
    {
        return a(i);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public int size()
    {
        int j = a.size() / b;
        int i = j;
        if (b * j != a.size())
        {
            i = j + 1;
        }
        return i;
    }
}
