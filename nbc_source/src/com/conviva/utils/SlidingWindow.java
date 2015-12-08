// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;

import java.util.LinkedList;
import java.util.List;

public class SlidingWindow
{

    private int _capacity;
    private List _slots;

    public SlidingWindow(int i)
    {
        _capacity = 0;
        _slots = null;
        if (i > 0)
        {
            _capacity = i;
            _slots = new LinkedList();
        }
    }

    public void add(Object obj)
    {
        _slots.add(0, obj);
        if (_slots.size() > _capacity)
        {
            _slots.remove(_slots.size() - 1);
        }
    }

    public void clear()
    {
        _slots = new LinkedList();
    }

    public List getSlots()
    {
        return _slots;
    }

    public int size()
    {
        return _slots.size();
    }
}
