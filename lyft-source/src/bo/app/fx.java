// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package bo.app:
//            gy, ha, ff, gw, 
//            gl, hn, gc

final class fx extends gy
{

    private final transient ha a;

    fx(Comparator comparator)
    {
        a = ha.a(comparator);
    }

    private fx(Comparator comparator, gy gy1)
    {
        super(gy1);
        a = ha.a(comparator);
    }

    public final gy a(Object obj)
    {
        ff.a(obj);
        return this;
    }

    public final gw b()
    {
        return gw.g();
    }

    public final gy b(Object obj)
    {
        ff.a(obj);
        return this;
    }

    final gw c()
    {
        throw new AssertionError("should never be called");
    }

    public final volatile gw d()
    {
        return a;
    }

    public final ha d_()
    {
        return a;
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return gw.g();
    }

    public final gc f()
    {
        return gl.d();
    }

    final gy g()
    {
        return new fx(hn.a(comparator()).a(), this);
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        ff.a(obj);
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
        ff.a(obj);
        return this;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return gl.d();
    }
}
