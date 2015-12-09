// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package a.a:
//            fr, gr, ge, eo, 
//            du, fs, ek, gs, 
//            ft

public abstract class fq extends fr
    implements gr, NavigableSet
{

    private static final Comparator c;
    private static final fq d;
    final transient Comparator a;
    transient fq b;

    fq(Comparator comparator1)
    {
        a = comparator1;
    }

    static fq a(Comparator comparator1)
    {
        if (c.equals(comparator1))
        {
            return d;
        } else
        {
            return new eo(comparator1);
        }
    }

    abstract fq a(Object obj, boolean flag);

    abstract fq a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract gs a();

    public abstract gs a_();

    public fq b()
    {
        fq fq2 = b;
        fq fq1 = fq2;
        if (fq2 == null)
        {
            fq1 = d();
            b = fq1;
            fq1.b = this;
        }
        return fq1;
    }

    abstract fq b(Object obj, boolean flag);

    public final fq b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        du.a(obj);
        du.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        du.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final fq c(Object obj, boolean flag)
    {
        return a(du.a(obj), flag);
    }

    public Object ceiling(Object obj)
    {
        return fs.b(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    fq d()
    {
        return new ek(this);
    }

    public final fq d(Object obj, boolean flag)
    {
        return b(du.a(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return a_();
    }

    public NavigableSet descendingSet()
    {
        return b();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return ft.c(c(obj, true).a_());
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
        return fs.b(d(obj, false));
    }

    public Iterator iterator()
    {
        return a();
    }

    public Object last()
    {
        return a_().next();
    }

    public Object lower(Object obj)
    {
        return ft.c(c(obj, false).a_());
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
        c = ge.b();
        d = new eo(c);
    }
}
