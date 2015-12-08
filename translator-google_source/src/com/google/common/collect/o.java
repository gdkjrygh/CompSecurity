// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            m, AbstractMapBasedMultimap, p

class o extends m
    implements List
{

    final AbstractMapBasedMultimap g;

    o(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj, List list, m m1)
    {
        g = abstractmapbasedmultimap;
        super(abstractmapbasedmultimap, obj, list, m1);
    }

    public void add(int i, Object obj)
    {
        a();
        boolean flag = super.c.isEmpty();
        ((List)super.c).add(i, obj);
        int _tmp = AbstractMapBasedMultimap.access$208(g);
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
                AbstractMapBasedMultimap.access$212(g, i - j);
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
        return new p(this);
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new p(this, i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = ((List)super.c).remove(i);
        int _tmp = AbstractMapBasedMultimap.access$210(g);
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
        AbstractMapBasedMultimap abstractmapbasedmultimap = g;
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
        return AbstractMapBasedMultimap.access$300(abstractmapbasedmultimap, obj1, list, ((m) (obj)));
    }
}
