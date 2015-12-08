// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class c extends ea
{

    private transient int b;
    private transient int c;
    private ea d;

    public final ea a(int i, int j)
    {
        dv.a(i, j, c);
        return d.a(b + i, b + j);
    }

    final boolean e()
    {
        return true;
    }

    public final Object get(int i)
    {
        dv.a(i, c);
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

    public final List subList(int i, int j)
    {
        return a(i, j);
    }

    >(ea ea1, int i, int j)
    {
        d = ea1;
        super();
        b = i;
        c = j;
    }
}
