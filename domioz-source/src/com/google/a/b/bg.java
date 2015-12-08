// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

// Referenced classes of package com.google.a.b:
//            bh, df, cn, af, 
//            bi, ac, di, bl

public abstract class bg extends bh
    implements df, NavigableSet
{

    private static final Comparator c;
    private static final bg d;
    final transient Comparator a;
    transient bg b;

    bg(Comparator comparator1)
    {
        a = comparator1;
    }

    abstract bg a(Object obj, boolean flag);

    abstract bg a(Object obj, boolean flag, Object obj1, boolean flag1);

    public abstract di a();

    abstract bg b(Object obj, boolean flag);

    public final bg b(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        ad.a(obj);
        ad.a(obj1);
        boolean flag2;
        if (a.compare(obj, obj1) <= 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ad.a(flag2);
        return a(obj, flag, obj1, flag1);
    }

    public final bg c(Object obj, boolean flag)
    {
        return a(ad.a(obj), flag);
    }

    public abstract di c();

    public Object ceiling(Object obj)
    {
        return bi.b(d(obj, true));
    }

    public Comparator comparator()
    {
        return a;
    }

    bg d()
    {
        return new ac(this);
    }

    public final bg d(Object obj, boolean flag)
    {
        return b(ad.a(obj), flag);
    }

    public Iterator descendingIterator()
    {
        return c();
    }

    public NavigableSet descendingSet()
    {
        return h_();
    }

    public Object first()
    {
        return a().next();
    }

    public Object floor(Object obj)
    {
        return bl.e(c(obj, true).c());
    }

    public bg h_()
    {
        bg bg2 = b;
        bg bg1 = bg2;
        if (bg2 == null)
        {
            bg1 = d();
            b = bg1;
            bg1.b = this;
        }
        return bg1;
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
        return bi.b(d(obj, false));
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
        return bl.e(c(obj, false).c());
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
        c = cn.b();
        d = new af(c);
    }
}
