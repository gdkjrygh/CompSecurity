// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.core;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.android.core:
//            ArrayDeque

private class <init>
    implements Iterator
{

    final ArrayDeque a;
    private int b;
    private int c;
    private int d;

    public boolean hasNext()
    {
        return b != c;
    }

    public Object next()
    {
        if (b == c)
        {
            throw new NoSuchElementException();
        }
        b = b - 1 & ArrayDeque.c(a).length - 1;
        Object obj = ArrayDeque.c(a)[b];
        if (ArrayDeque.a(a) != c || obj == null)
        {
            throw new ConcurrentModificationException();
        } else
        {
            d = b;
            return obj;
        }
    }

    public void remove()
    {
        if (d < 0)
        {
            throw new IllegalStateException();
        }
        if (!ArrayDeque.a(a, d))
        {
            b = b + 1 & ArrayDeque.c(a).length - 1;
            c = ArrayDeque.a(a);
        }
        d = -1;
    }

    private n(ArrayDeque arraydeque)
    {
        a = arraydeque;
        super();
        b = ArrayDeque.b(a);
        c = ArrayDeque.a(a);
        d = -1;
    }

    d(ArrayDeque arraydeque, d d1)
    {
        this(arraydeque);
    }
}
