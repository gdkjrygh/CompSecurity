// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            f

final class b
    implements ListIterator
{

    private boolean a;
    private ListIterator b;
    private b c;

    public final void add(Object obj)
    {
        b.add(obj);
        b.previous();
        a = false;
    }

    public final boolean hasNext()
    {
        return b.hasPrevious();
    }

    public final boolean hasPrevious()
    {
        return b.hasNext();
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b.previous();
        }
    }

    public final int nextIndex()
    {
        return b(c, b.nextIndex());
    }

    public final Object previous()
    {
        if (!hasPrevious())
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b.next();
        }
    }

    public final int previousIndex()
    {
        return nextIndex() - 1;
    }

    public final void remove()
    {
        j.b(a, "no calls to next() since the last call to remove()");
        b.remove();
        a = false;
    }

    public final void set(Object obj)
    {
        j.b(a);
        b.set(obj);
    }

    ( , ListIterator listiterator)
    {
        c = ;
        b = listiterator;
        super();
    }
}
