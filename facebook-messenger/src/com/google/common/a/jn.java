// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            jg, jf

final class jn
    implements Iterator
{

    private final jf a;
    private final Iterator b;
    private jg c;
    private int d;
    private int e;
    private boolean f;

    jn(jf jf1, Iterator iterator)
    {
        a = jf1;
        b = iterator;
    }

    public boolean hasNext()
    {
        return d > 0 || b.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        if (d == 0)
        {
            c = (jg)b.next();
            int i = c.b();
            d = i;
            e = i;
        }
        d = d - 1;
        f = true;
        return c.a();
    }

    public void remove()
    {
        Preconditions.checkState(f, "no calls to next() since the last call to remove()");
        if (e == 1)
        {
            b.remove();
        } else
        {
            a.remove(c.a());
        }
        e = e - 1;
        f = false;
    }
}
