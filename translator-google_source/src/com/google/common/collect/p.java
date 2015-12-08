// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            n, m, o, AbstractMapBasedMultimap

final class p extends n
    implements ListIterator
{

    final o d;

    p(o o1)
    {
        d = o1;
        super(o1);
    }

    public p(o o1, int i)
    {
        d = o1;
        super(o1, ((List)((m) (o1)).c).listIterator(i));
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
        int _tmp = AbstractMapBasedMultimap.access$208(d.g);
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
