// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            u, p, d

static final class <init>
    implements Iterator
{

    private final Stack a;
    private p b;

    private p a(d d1)
    {
        for (; d1 instanceof u; d1 = u.a(d1))
        {
            d1 = (u)d1;
            a.push(d1);
        }

        return (p)d1;
    }

    private p b()
    {
        do
        {
            if (a.isEmpty())
            {
                return null;
            }
            p p1 = a(u.b((u)a.pop()));
            boolean flag;
            if (p1.b() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } while (flag);
        return p1;
    }

    public final p a()
    {
        if (b == null)
        {
            throw new NoSuchElementException();
        } else
        {
            p p1 = b;
            b = b();
            return p1;
        }
    }

    public final boolean hasNext()
    {
        return b != null;
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private tion(d d1)
    {
        a = new Stack();
        b = a(d1);
    }

    a(d d1, byte byte0)
    {
        this(d1);
    }
}
