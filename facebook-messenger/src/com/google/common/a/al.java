// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            ak, x

class al
    implements Iterator
{

    final Iterator a;
    final Collection b;
    final ak c;

    al(ak ak1)
    {
        c = ak1;
        super();
        b = c.c;
        a = x.a(ak1.f, ak1.c);
    }

    al(ak ak1, Iterator iterator)
    {
        c = ak1;
        super();
        b = c.c;
        a = iterator;
    }

    void a()
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

    Iterator b()
    {
        a();
        return a;
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
        x.b(c.f);
        c.b();
    }
}
