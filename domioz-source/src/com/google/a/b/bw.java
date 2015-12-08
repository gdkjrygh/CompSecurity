// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.a.b:
//            bv, bu, y, bx

final class bw
    implements Iterator
{

    bx a;
    bu b;
    int c;
    final bv d;

    bw(bv bv1)
    {
        d = bv1;
        super();
        a = bv.a(d);
        c = bv.b(d);
    }

    private void a()
    {
        if (bv.b(d) != c)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public final boolean hasNext()
    {
        a();
        return a != d;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            bu bu1 = (bu)a;
            Object obj = bu1.getValue();
            b = bu1;
            a = bu1.b();
            return obj;
        }
    }

    public final void remove()
    {
        a();
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(flag);
        d.remove(b.getValue());
        c = bv.b(d);
        b = null;
    }
}
