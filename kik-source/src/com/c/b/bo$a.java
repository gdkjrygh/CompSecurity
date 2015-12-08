// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

// Referenced classes of package com.c.b:
//            bo, ba, f

private static final class <init>
    implements Iterator
{

    private final Stack a;
    private ba b;

    private ba a(f f)
    {
        for (; f instanceof bo; f = bo.a(f))
        {
            f = (bo)f;
            a.push(f);
        }

        return (ba)f;
    }

    private ba b()
    {
        ba ba1;
        do
        {
            if (a.isEmpty())
            {
                return null;
            }
            ba1 = a(bo.b((bo)a.pop()));
        } while (ba1.d());
        return ba1;
    }

    public final ba a()
    {
        if (b == null)
        {
            throw new NoSuchElementException();
        } else
        {
            ba ba1 = b;
            b = b();
            return ba1;
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

    private ect(f f)
    {
        a = new Stack();
        b = a(f);
    }

    a(f f, byte byte0)
    {
        this(f);
    }
}
