// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.android.slyce.a:
//            a, b

class c
    implements Iterator
{

    final a a;
    private int b;
    private int c;
    private int d;

    private c(a a1)
    {
        a = a1;
        super();
        b = com.android.slyce.a.a.a(a);
        c = com.android.slyce.a.a.b(a);
        d = -1;
    }

    c(a a1, b b1)
    {
        this(a1);
    }

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
        Object obj = com.android.slyce.a.a.c(a)[b];
        if (com.android.slyce.a.a.b(a) != c || obj == null)
        {
            throw new ConcurrentModificationException();
        } else
        {
            d = b;
            b = b + 1 & com.android.slyce.a.a.c(a).length - 1;
            return obj;
        }
    }

    public void remove()
    {
        if (d < 0)
        {
            throw new IllegalStateException();
        }
        if (com.android.slyce.a.a.a(a, d))
        {
            b = b - 1 & com.android.slyce.a.a.c(a).length - 1;
            c = com.android.slyce.a.a.b(a);
        }
        d = -1;
    }
}
