// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package bo.app:
//            gv, hu, hh, fs, 
//            ez, gw, fo, hv, 
//            gx

public abstract class gu extends gv
    implements hu, NavigableSet
{

    private static final Comparator c;
    private static final gu d;
    final transient Comparator a;
    transient gu b;

    gu(Comparator comparator1)
    {
        a = comparator1;
    }

    static gu a(Comparator comparator1)
    {
        if (c.equals(comparator1))
        {
            return d;
        } else
        {
            return new fs(comparator1);
        }
    }

    abstract gu a(Object obj, boolean flag);

    abstract gu a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract hv a();

    public gu a_()
    {
        gu gu2 = b;
        gu gu1 = gu2;
        if (gu2 == null)
        {
            gu1 = d();
            b = gu1;
            gu1.b = this;
        }
        return gu1;
    }

    abstract gu b(Object obj, boolean flag);

    public final gu b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        ez.a(obj);
        ez.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ez.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final gu c(Object obj, boolean flag)
    {
        return a(ez.a(obj), flag);
    }

    public abstract hv c();

    public Object ceiling(Object obj)
    {
        return gw.b(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    gu d()
    {
        return new fo(this);
    }

    public final gu d(Object obj, boolean flag)
    {
        return b(ez.a(obj), flag);
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
        return gx.c(c(obj, true).c());
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
        return gw.b(d(obj, false));
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
        return gx.c(c(obj, false).c());
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
        c = hh.b();
        d = new fs(c);
    }
}
