// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.a.b:
//            ar

final class au extends ar
{

    final transient int a;
    final transient int b;
    final ar c;

    au(ar ar1, int i, int j)
    {
        c = ar1;
        super();
        a = i;
        b = j;
    }

    public final ar a(int i, int j)
    {
        ad.a(i, j, b);
        return c.a(a + i, a + j);
    }

    final boolean e()
    {
        return true;
    }

    public final Object get(int i)
    {
        ad.a(i, b);
        return c.get(a + i);
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
        return b;
    }

    public final List subList(int i, int j)
    {
        return a(i, j);
    }
}
