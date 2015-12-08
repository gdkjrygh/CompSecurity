// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package bo.app:
//            gf, ez

final class gh extends gf
{

    final transient int b;
    final transient int c;
    final gf d;

    gh(gf gf1, int i, int j)
    {
        d = gf1;
        super();
        b = i;
        c = j;
    }

    public final gf a(int i, int j)
    {
        ez.a(i, j, c);
        return d.a(b + i, b + j);
    }

    final boolean e()
    {
        return true;
    }

    public final Object get(int i)
    {
        ez.a(i, c);
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
}
