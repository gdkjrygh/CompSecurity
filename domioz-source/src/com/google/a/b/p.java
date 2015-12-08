// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.a.b:
//            n, e, q

class p extends n
    implements List
{

    final e g;

    p(e e1, Object obj, List list, n n1)
    {
        g = e1;
        super(e1, obj, list, n1);
    }

    public void add(int i, Object obj)
    {
        a();
        boolean flag = super.c.isEmpty();
        ((List)super.c).add(i, obj);
        e.c(g);
        if (flag)
        {
            c();
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
            boolean flag1 = ((List)super.c).addAll(i, collection);
            flag = flag1;
            if (flag1)
            {
                i = super.c.size();
                e.a(g, i - j);
                flag = flag1;
                if (j == 0)
                {
                    c();
                    return flag1;
                }
            }
        }
        return flag;
    }

    public Object get(int i)
    {
        a();
        return ((List)super.c).get(i);
    }

    public int indexOf(Object obj)
    {
        a();
        return ((List)super.c).indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        a();
        return ((List)super.c).lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        a();
        return new q(this);
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new q(this, i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = ((List)super.c).remove(i);
        e.b(g);
        b();
        return obj;
    }

    public Object set(int i, Object obj)
    {
        a();
        return ((List)super.c).set(i, obj);
    }

    public List subList(int i, int j)
    {
        a();
        e e1 = g;
        Object obj1 = super.b;
        List list = ((List)super.c).subList(i, j);
        Object obj;
        if (super.d == null)
        {
            obj = this;
        } else
        {
            obj = super.d;
        }
        return e.a(e1, obj1, list, ((n) (obj)));
    }
}
