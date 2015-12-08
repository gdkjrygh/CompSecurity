// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.a;

import java.util.Iterator;

// Referenced classes of package com.cm.a:
//            d

final class e
    implements Iterator
{

    final int a;
    int b;
    int c;
    boolean d;
    final d e;

    e(d d1, int i)
    {
        e = d1;
        super();
        d = false;
        a = i;
        b = d1.a();
    }

    public final boolean hasNext()
    {
        return c < b;
    }

    public final Object next()
    {
        Object obj = e.a(c, a);
        c = c + 1;
        d = true;
        return obj;
    }

    public final void remove()
    {
        if (!d)
        {
            throw new IllegalStateException();
        } else
        {
            c = c - 1;
            b = b - 1;
            d = false;
            e.a(c);
            return;
        }
    }
}
