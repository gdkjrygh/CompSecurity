// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package bo.app:
//            gw, hv, hi, ft, 
//            fa, gx, fp, hw, 
//            gy

public abstract class gv extends gw
    implements hv, NavigableSet
{

    private static final Comparator c;
    private static final gv d;
    final transient Comparator a;
    transient gv b;

    gv(Comparator comparator1)
    {
        a = comparator1;
    }

    static gv a(Comparator comparator1)
    {
        if (c.equals(comparator1))
        {
            return d;
        } else
        {
            return new ft(comparator1);
        }
    }

    abstract gv a(Object obj, boolean flag);

    abstract gv a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract hw a();

    public gv a_()
    {
        gv gv2 = b;
        gv gv1 = gv2;
        if (gv2 == null)
        {
            gv1 = d();
            b = gv1;
            gv1.b = this;
        }
        return gv1;
    }

    abstract gv b(Object obj, boolean flag);

    public final gv b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        fa.a(obj);
        fa.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        fa.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final gv c(Object obj, boolean flag)
    {
        return a(fa.a(obj), flag);
    }

    public abstract hw c();

    public Object ceiling(Object obj)
    {
        return gx.b(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    gv d()
    {
        return new fp(this);
    }

    public final gv d(Object obj, boolean flag)
    {
        return b(fa.a(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return a_();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return gy.c(c(obj, true).c());
    }

    public NavigableSet headSet(Object obj, boolean flag)
    {
        return c(obj, flag);
    }

    public SortedSet headSet(Object obj)
    {
        return c(obj, false);
    }

    public Object higher(Object obj)
    {
        return gx.b(d(obj, false));
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return c().next();
    }

    public Object lower(Object obj)
    {
        return gy.c(c(obj, false).c());
    }

    public final Object pollFirst()
    {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast()
    {
        throw new UnsupportedOperationException();
    }

    public NavigableSet subSet(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag, obj1, flag1);
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return b(obj, true, obj1, false);
    }

    public NavigableSet tailSet(Object obj, boolean flag)
    {
        return d(obj, flag);
    }

    public SortedSet tailSet(Object obj)
    {
        return d(obj, true);
    }

    static 
    {
        c = hi.b();
        d = new ft(c);
    }
}
