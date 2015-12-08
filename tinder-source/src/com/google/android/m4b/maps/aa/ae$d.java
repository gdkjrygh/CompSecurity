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

final class c extends ae
{

    private transient int b;
    private transient int c;
    private ae d;

    public final ae a(int i, int k)
    {
        j.a(i, k, c);
        return d.a(b + i, b + k);
    }

    final boolean d()
    {
        return true;
    }

    public final Object get(int i)
    {
        j.a(i, c);
        return d.get(b + i);
    }

    public final Iterator iterator()
    {
        return super.a();
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
        return c;
    }

    public final List subList(int i, int k)
    {
        return a(i, k);
    }

    (ae ae1, int i, int k)
    {
        d = ae1;
        super();
        b = i;
        c = k;
    }
}
