// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package dagger.a:
//            a

private final class <init>
    implements Iterator
{

    final a a;
    private int b;
    private int c;
    private int d;

    public final boolean hasNext()
    {
        return b != c;
    }

    public final Object next()
    {
        if (b == c)
        {
            throw new NoSuchElementException();
        }
        Object obj = dagger.a.a.c(a)[b];
        if (dagger.a.a.b(a) != c || obj == null)
        {
            throw new ConcurrentModificationException();
        } else
        {
            d = b;
            b = b + 1 & dagger.a.a.c(a).length - 1;
            return obj;
        }
    }

    public final void remove()
    {
        if (d < 0)
        {
            throw new IllegalStateException();
        }
        if (dagger.a.a.a(a, d))
        {
            b = b - 1 & dagger.a.a.c(a).length - 1;
            c = dagger.a.a.b(a);
        }
        d = -1;
    }

    private ect(a a1)
    {
        a = a1;
        super();
        b = dagger.a.a.a(a);
        c = dagger.a.a.b(a);
        d = -1;
    }

    d(a a1, byte byte0)
    {
        this(a1);
    }
}
