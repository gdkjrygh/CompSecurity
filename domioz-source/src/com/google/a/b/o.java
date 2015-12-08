// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            n, e

class o
    implements Iterator
{

    final Iterator a;
    final Collection b;
    final n c;

    o(n n1)
    {
        c = n1;
        super();
        b = c.c;
        a = e.a(n1.c);
    }

    o(n n1, Iterator iterator)
    {
        c = n1;
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
        e.b(c.f);
        c.b();
    }
}
