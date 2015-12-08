// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package bo.app:
//            gt, gv, fa, gr, 
//            gg, hi, fx

final class fs extends gt
{

    private final transient gv a;

    fs(Comparator comparator)
    {
        a = gv.a(comparator);
    }

    private fs(Comparator comparator, gt gt1)
    {
        super(gt1);
        a = gv.a(comparator);
    }

    public final gt a(Object obj)
    {
        fa.a(obj);
        return this;
    }

    public final gr b()
    {
        return gr.g();
    }

    public final gt b(Object obj)
    {
        fa.a(obj);
        return this;
    }

    final gr c()
    {
        throw new AssertionError("should never be called");
    }

    public final volatile gr d()
    {
        return a;
    }

    public final gv d_()
    {
        return a;
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return gr.g();
    }

    public final fx f()
    {
        return gg.d();
    }

    final gt g()
    {
        return new fs(hi.a(comparator()).a(), this);
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        fa.a(obj);
        return this;
    }

    public final boolean isEmpty()
    {
        return true;
    }

    public final volatile Set keySet()
    {
        return a;
    }

    public final int size()
    {
        return 0;
    }

    public final NavigableMap tailMap(Object obj, boolean flag)
    {
        fa.a(obj);
        return this;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return gg.d();
    }
}
