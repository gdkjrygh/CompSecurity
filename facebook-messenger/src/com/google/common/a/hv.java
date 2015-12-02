// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            hu

class hv
    implements ListIterator
{

    boolean a;
    boolean b;
    final ListIterator c;
    final hu d;

    hv(hu hu1, ListIterator listiterator)
    {
        d = hu1;
        c = listiterator;
        super();
    }

    public void add(Object obj)
    {
        c.add(obj);
        c.previous();
        a = false;
        b = false;
    }

    public boolean hasNext()
    {
        return c.hasPrevious();
    }

    public boolean hasPrevious()
    {
        return c.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            b = true;
            return c.previous();
        }
    }

    public int nextIndex()
    {
        return hu.a(d, c.nextIndex());
    }

    public Object previous()
    {
        if (!hasPrevious())
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            b = true;
            return c.next();
        }
    }

    public int previousIndex()
    {
        return nextIndex() - 1;
    }

    public void remove()
    {
        Preconditions.checkState(a);
        c.remove();
        b = false;
        a = false;
    }

    public void set(Object obj)
    {
        Preconditions.checkState(b);
        c.set(obj);
    }
}
