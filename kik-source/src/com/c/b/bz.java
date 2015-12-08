// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.c.b:
//            az, cb, ca, f

public final class bz extends AbstractList
    implements az, RandomAccess
{

    private final az a;

    public bz(az az1)
    {
        a = az1;
    }

    static az a(bz bz1)
    {
        return bz1.a;
    }

    public final f a(int i)
    {
        return a.a(i);
    }

    public final void a(f f)
    {
        throw new UnsupportedOperationException();
    }

    public final List d()
    {
        return a.d();
    }

    public final az e()
    {
        return this;
    }

    public final volatile Object get(int i)
    {
        return (String)a.get(i);
    }

    public final Iterator iterator()
    {
        return new cb(this);
    }

    public final ListIterator listIterator(int i)
    {
        return new ca(this, i);
    }

    public final int size()
    {
        return a.size();
    }
}
