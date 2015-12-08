// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.ListIterator;

// Referenced classes of package com.c.b:
//            bz, az

final class ca
    implements ListIterator
{

    ListIterator a;
    final int b;
    final bz c;

    ca(bz bz1, int i)
    {
        c = bz1;
        b = i;
        super();
        a = bz.a(c).listIterator(b);
    }

    public final void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final boolean hasPrevious()
    {
        return a.hasPrevious();
    }

    public final volatile Object next()
    {
        return (String)a.next();
    }

    public final int nextIndex()
    {
        return a.nextIndex();
    }

    public final volatile Object previous()
    {
        return (String)a.previous();
    }

    public final int previousIndex()
    {
        return a.previousIndex();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
