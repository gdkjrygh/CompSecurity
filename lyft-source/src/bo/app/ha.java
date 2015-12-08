// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package bo.app:
//            hb, ia, hn, fy, 
//            ff, hc, fu, ib, 
//            hd

public abstract class ha extends hb
    implements ia, NavigableSet
{

    private static final Comparator c;
    private static final ha d;
    final transient Comparator a;
    transient ha b;

    ha(Comparator comparator1)
    {
        a = comparator1;
    }

    static ha a(Comparator comparator1)
    {
        if (c.equals(comparator1))
        {
            return d;
        } else
        {
            return new fy(comparator1);
        }
    }

    abstract ha a(Object obj, boolean flag);

    abstract ha a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract ib a();

    public ha a_()
    {
        ha ha2 = b;
        ha ha1 = ha2;
        if (ha2 == null)
        {
            ha1 = d();
            b = ha1;
            ha1.b = this;
        }
        return ha1;
    }

    abstract ha b(Object obj, boolean flag);

    public final ha b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        ff.a(obj);
        ff.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ff.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final ha c(Object obj, boolean flag)
    {
        return a(ff.a(obj), flag);
    }

    public abstract ib c();

    public Object ceiling(Object obj)
    {
        return hc.b(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    ha d()
    {
        return new fu(this);
    }

    public final ha d(Object obj, boolean flag)
    {
        return b(ff.a(obj), flag);
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
        return hd.c(c(obj, true).c());
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
        return hc.b(d(obj, false));
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
        return hd.c(c(obj, false).c());
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
        c = hn.b();
        d = new fy(c);
    }
}
