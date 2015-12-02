// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            ak, x, an

class am extends ak
    implements List
{

    final x g;

    am(x x1, Object obj, List list, ak ak1)
    {
        g = x1;
        super(x1, obj, list, ak1);
    }

    public void add(int i, Object obj)
    {
        a();
        boolean flag = e().isEmpty();
        g().add(i, obj);
        x.c(g);
        if (flag)
        {
            d();
        }
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int j = size();
            boolean flag1 = g().addAll(i, collection);
            flag = flag1;
            if (flag1)
            {
                i = e().size();
                x.a(g, i - j);
                flag = flag1;
                if (j == 0)
                {
                    d();
                    return flag1;
                }
            }
        }
        return flag;
    }

    List g()
    {
        return (List)e();
    }

    public Object get(int i)
    {
        a();
        return g().get(i);
    }

    public int indexOf(Object obj)
    {
        a();
        return g().indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        a();
        return g().lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        a();
        return new an(this);
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new an(this, i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = g().remove(i);
        x.b(g);
        b();
        return obj;
    }

    public Object set(int i, Object obj)
    {
        a();
        return g().set(i, obj);
    }

    public List subList(int i, int j)
    {
        a();
        x x1 = g;
        Object obj1 = c();
        List list = g().subList(i, j);
        Object obj;
        if (f() == null)
        {
            obj = this;
        } else
        {
            obj = f();
        }
        return x.a(x1, obj1, list, ((ak) (obj)));
    }
}
