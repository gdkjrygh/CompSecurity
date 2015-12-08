// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            m, AbstractMapBasedMultimap

class n
    implements Iterator
{

    final Iterator a;
    final Collection b;
    final m c;

    n(m m1)
    {
        c = m1;
        super();
        b = c.c;
        a = AbstractMapBasedMultimap.access$100(m1.f, m1.c);
    }

    n(m m1, Iterator iterator)
    {
        c = m1;
        super();
        b = c.c;
        a = iterator;
    }

    final void a()
    {
        c.a();
        if (c.c != b)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public boolean hasNext()
    {
        a();
        return a.hasNext();
    }

    public Object next()
    {
        a();
        return a.next();
    }

    public void remove()
    {
        a.remove();
        int _tmp = AbstractMapBasedMultimap.access$210(c.f);
        c.b();
    }
}
