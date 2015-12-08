// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import java.util.ListIterator;

// Referenced classes of package com.c.a.b:
//            i, m, k, ap

final class af extends i
{

    private final k a;
    private final m b;

    private af(k k, m m1)
    {
        a = k;
        b = m1;
    }

    af(k k, Object aobj[])
    {
        this(k, m.a(aobj));
    }

    final int a(Object aobj[], int j)
    {
        return b.a(aobj, j);
    }

    public final ap a(int j)
    {
        return b.a(j);
    }

    final k d()
    {
        return a;
    }

    public final Object get(int j)
    {
        return b.get(j);
    }

    public final ListIterator listIterator(int j)
    {
        return a(j);
    }
}
