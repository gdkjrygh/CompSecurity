// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            dm, dl

final class ds
    implements Iterator
{

    private final dl a;
    private final Iterator b;
    private dm c;
    private int d;
    private int e;
    private boolean f;

    ds(dl dl1, Iterator iterator)
    {
        a = dl1;
        b = iterator;
    }

    public final boolean hasNext()
    {
        return d > 0 || b.hasNext();
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        if (d == 0)
        {
            c = (dm)b.next();
            int i = c.getCount();
            d = i;
            e = i;
        }
        d = d - 1;
        f = true;
        return c.getElement();
    }

    public final void remove()
    {
        p.b(f, "no calls to next() since the last call to remove()");
        if (e == 1)
        {
            b.remove();
        } else
        {
            a.remove(c.getElement());
        }
        e = e - 1;
        f = false;
    }
}
