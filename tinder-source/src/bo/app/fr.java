// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package bo.app:
//            gs, gu, ez, gq, 
//            gf, hh, fw

final class fr extends gs
{

    private final transient gu a;

    fr(Comparator comparator)
    {
        a = gu.a(comparator);
    }

    private fr(Comparator comparator, gs gs1)
    {
        super(gs1);
        a = gu.a(comparator);
    }

    public final gs a(Object obj)
    {
        ez.a(obj);
        return this;
    }

    public final gq b()
    {
        return gq.g();
    }

    public final gs b(Object obj)
    {
        ez.a(obj);
        return this;
    }

    final gq c()
    {
        throw new AssertionError("should never be called");
    }

    public final volatile gq d()
    {
        return a;
    }

    public final gu d_()
    {
        return a;
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return gq.g();
    }

    public final fw f()
    {
        return gf.d();
    }

    final gs g()
    {
        return new fr(hh.a(comparator()).a(), this);
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        ez.a(obj);
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
        ez.a(obj);
        return this;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return gf.d();
    }
}
