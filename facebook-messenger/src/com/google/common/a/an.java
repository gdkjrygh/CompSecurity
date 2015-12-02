// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            al, am, x

class an extends al
    implements ListIterator
{

    final am d;

    an(am am1)
    {
        d = am1;
        super(am1);
    }

    public an(am am1, int i)
    {
        d = am1;
        super(am1, am1.g().listIterator(i));
    }

    private ListIterator c()
    {
        return (ListIterator)b();
    }

    public void add(Object obj)
    {
        boolean flag = d.isEmpty();
        c().add(obj);
        x.c(d.g);
        if (flag)
        {
            d.d();
        }
    }

    public boolean hasPrevious()
    {
        return c().hasPrevious();
    }

    public int nextIndex()
    {
        return c().nextIndex();
    }

    public Object previous()
    {
        return c().previous();
    }

    public int previousIndex()
    {
        return c().previousIndex();
    }

    public void set(Object obj)
    {
        c().set(obj);
    }
}
