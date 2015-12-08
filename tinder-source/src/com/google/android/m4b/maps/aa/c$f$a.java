// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

class a
    implements Iterator
{

    final Iterator a;
    private Collection b;
    private c c;

    final void a()
    {
        c.c();
        if (c.c != b)
        {
            throw new ConcurrentModificationException();
        } else
        {
            return;
        }
    }

    public boolean hasNext()
    {
        a();
        return a.hasNext();
    }

    public Object next()
    {
        a();
        return a.next();
    }

    public void remove()
    {
        a.remove();
        com.google.android.m4b.maps.aa.c.b(c.c);
        c.c();
    }

    tion(tion tion)
    {
        c = tion;
        super();
        b = c.c;
        a = com.google.android.m4b.maps.aa.c.a(tion.a);
    }

    a(a a1, Iterator iterator)
    {
        c = a1;
        super();
        b = c.c;
        a = iterator;
    }
}
