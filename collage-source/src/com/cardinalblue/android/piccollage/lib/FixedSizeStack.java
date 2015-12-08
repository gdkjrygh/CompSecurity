// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FixedSizeStack
    implements IGsonable
{

    private final Deque a = new ArrayDeque();
    private final int b;

    public FixedSizeStack(int i)
    {
        b = i;
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(a);
        return arraylist;
    }

    public void a(Object obj)
    {
        if (a.contains(obj))
        {
            a.remove(obj);
        }
        if (a.size() == b)
        {
            a.removeLast();
        }
        a.push(obj);
    }

    public void b()
    {
        for (; !a.isEmpty(); a.remove()) { }
    }

    public boolean b(Object obj)
    {
        if (a.contains(obj))
        {
            a.remove(obj);
            return true;
        } else
        {
            return false;
        }
    }
}
