// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.a.b:
//            w, ad, x

abstract class ac
    implements Iterator
{

    ad b;
    ad c;
    int d;
    final w e;

    private ac(w w1)
    {
        e = w1;
        super();
        b = e.e.d;
        c = null;
        d = e.d;
    }

    ac(w w1, x x)
    {
        this(w1);
    }

    final ad b()
    {
        ad ad1 = b;
        if (ad1 == e.e)
        {
            throw new NoSuchElementException();
        }
        if (e.d != d)
        {
            throw new ConcurrentModificationException();
        } else
        {
            b = ad1.d;
            c = ad1;
            return ad1;
        }
    }

    public final boolean hasNext()
    {
        return b != e.e;
    }

    public final void remove()
    {
        if (c == null)
        {
            throw new IllegalStateException();
        } else
        {
            e.a(c, true);
            c = null;
            d = e.d;
            return;
        }
    }
}
