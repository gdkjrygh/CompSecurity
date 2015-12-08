// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EvictingPriorityQueue extends PriorityQueue
{

    private int a;

    public EvictingPriorityQueue(int i, Comparator comparator)
    {
        super(i + 1, comparator);
        a = i;
    }

    public boolean add(Object obj)
    {
        boolean flag = super.add(obj);
        if (size() > a)
        {
            poll();
        }
        return flag;
    }
}
