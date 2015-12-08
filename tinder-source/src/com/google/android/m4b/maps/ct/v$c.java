// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            v

final class <init>
    implements Iterator
{

    private int a;
    private boolean b;
    private Iterator c;
    private v d;

    private Iterator a()
    {
        if (c == null)
        {
            c = v.c(d).entrySet().iterator();
        }
        return c;
    }

    public final boolean hasNext()
    {
        return a + 1 < v.b(d).size() || a().hasNext();
    }

    public final Object next()
    {
        b = true;
        int i = a + 1;
        a = i;
        if (i < v.b(d).size())
        {
            return (java.util.Entry)v.b(d).get(a);
        } else
        {
            return (java.util.Entry)a().next();
        }
    }

    public final void remove()
    {
        if (!b)
        {
            throw new IllegalStateException("remove() was called before next()");
        }
        b = false;
        v.a(d);
        if (a < v.b(d).size())
        {
            v v1 = d;
            int i = a;
            a = i - 1;
            v.a(v1, i);
            return;
        } else
        {
            a().remove();
            return;
        }
    }

    private (v v1)
    {
        d = v1;
        super();
        a = -1;
    }

    a(v v1, byte byte0)
    {
        this(v1);
    }
}
