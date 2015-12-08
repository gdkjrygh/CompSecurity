// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.u;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.c.a.b:
//            m

final class b extends m
{

    final transient int a;
    final transient int b;
    final m c;

    public final m a(int i, int j)
    {
        u.a(i, j, b);
        return c.a(a + i, a + j);
    }

    final boolean b()
    {
        return true;
    }

    public final Object get(int i)
    {
        u.a(i, b);
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

    (m m1, int i, int j)
    {
        c = m1;
        super();
        a = i;
        b = j;
    }
}
