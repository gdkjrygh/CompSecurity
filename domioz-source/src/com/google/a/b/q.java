// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.a.b:
//            o, n, p, e

final class q extends o
    implements ListIterator
{

    final p d;

    q(p p1)
    {
        d = p1;
        super(p1);
    }

    public q(p p1, int i)
    {
        d = p1;
        super(p1, ((List)((n) (p1)).c).listIterator(i));
    }

    private ListIterator b()
    {
        a();
        return (ListIterator)super.a;
    }

    public final void add(Object obj)
    {
        boolean flag = d.isEmpty();
        b().add(obj);
        e.c(d.g);
        if (flag)
        {
            d.c();
        }
    }

    public final boolean hasPrevious()
    {
        return b().hasPrevious();
    }

    public final int nextIndex()
    {
        return b().nextIndex();
    }

    public final Object previous()
    {
        return b().previous();
    }

    public final int previousIndex()
    {
        return b().previousIndex();
    }

    public final void set(Object obj)
    {
        b().set(obj);
    }
}
