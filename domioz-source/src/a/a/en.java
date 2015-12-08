// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;

// Referenced classes of package a.a:
//            fo, fq, du, fm, 
//            fb, ge, es

final class en extends fo
{

    private final transient fq a;

    en(Comparator comparator)
    {
        a = fq.a(comparator);
    }

    private en(Comparator comparator, fo fo1)
    {
        super(fo1);
        a = fq.a(comparator);
    }

    public final fo a(Object obj)
    {
        du.a(obj);
        return this;
    }

    public final fm b()
    {
        return fm.g();
    }

    public final fo b(Object obj)
    {
        du.a(obj);
        return this;
    }

    final fm c()
    {
        throw new AssertionError("should never be called");
    }

    public final volatile fm d()
    {
        return a;
    }

    public final fq d_()
    {
        return a;
    }

    final boolean e()
    {
        return false;
    }

    public final Set entrySet()
    {
        return fm.g();
    }

    public final es f()
    {
        return fb.d();
    }

    final fo g()
    {
        return new en(ge.a(comparator()).a(), this);
    }

    public final Object get(Object obj)
    {
        return null;
    }

    public final NavigableMap headMap(Object obj, boolean flag)
    {
        du.a(obj);
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
        du.a(obj);
        return this;
    }

    public final String toString()
    {
        return "{}";
    }

    public final Collection values()
    {
        return fb.d();
    }
}
