// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ae

static final class b extends ae
{

    private final transient ae b;

    private int b(int i)
    {
        return size() - 1 - i;
    }

    public final ae a(int i, int k)
    {
        j.a(i, k, size());
        return b.a(size() - k, size() - i).f();
    }

    public final boolean contains(Object obj)
    {
        return b.contains(obj);
    }

    final boolean d()
    {
        return b.d();
    }

    public final ae f()
    {
        return b;
    }

    public final Object get(int i)
    {
        j.a(i, size());
        return b.get(b(i));
    }

    public final int indexOf(Object obj)
    {
        int i = b.lastIndexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public final Iterator iterator()
    {
        return super.a();
    }

    public final int lastIndexOf(Object obj)
    {
        int i = b.indexOf(obj);
        if (i >= 0)
        {
            return b(i);
        } else
        {
            return -1;
        }
    }

    public final ListIterator listIterator()
    {
        return a(0);
    }

    public final ListIterator listIterator(int i)
    {
        return super.a(i);
    }

    public final int size()
    {
        return b.size();
    }

    public final List subList(int i, int k)
    {
        return a(i, k);
    }

    (ae ae1)
    {
        b = ae1;
    }
}
