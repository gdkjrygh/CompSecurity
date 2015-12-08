// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.a.b:
//            v, aa

abstract class ab
    implements Iterator
{

    aa b;
    aa c;
    final v d;

    private ab(v v1)
    {
        d = v1;
        super();
        b = v.a(d).e;
        c = null;
    }

    ab(v v1, byte byte0)
    {
        this(v1);
    }

    final aa a()
    {
        aa aa1 = b;
        if (aa1 == v.a(d))
        {
            throw new NoSuchElementException();
        } else
        {
            b = aa1.e;
            c = aa1;
            return aa1;
        }
    }

    public final boolean hasNext()
    {
        return b != v.a(d);
    }

    public final void remove()
    {
        if (c == null)
        {
            throw new IllegalStateException();
        } else
        {
            d.remove(c.a);
            c = null;
            return;
        }
    }
}
