// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

class <init> extends <init>
    implements List
{
    final class a extends c.f.a
        implements ListIterator
    {

        private c.g b;

        private ListIterator b()
        {
            a();
            return (ListIterator)super.a;
        }

        public final void add(Object obj)
        {
            boolean flag = b.isEmpty();
            b().add(obj);
            c.c(b.e);
            if (flag)
            {
                b.c();
            }
        }

        public final boolean hasPrevious()
        {
            return b().hasPrevious();
        }

        public final int nextIndex()
        {
            return b().nextIndex();
        }

        public final Object previous()
        {
            return b().previous();
        }

        public final int previousIndex()
        {
            return b().previousIndex();
        }

        public final void set(Object obj)
        {
            b().set(obj);
        }

        a()
        {
            b = c.g.this;
            super(c.g.this);
        }

        public a(int i)
        {
            b = c.g.this;
            super(c.g.this, ((List)c.g.this.b).listIterator(i));
        }
    }


    final c e;

    public void add(int i, Object obj)
    {
        a();
        boolean flag = super.b.isEmpty();
        ((List)super.b).add(i, obj);
        c.c(e);
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
            boolean flag1 = ((List)super.b).addAll(i, collection);
            flag = flag1;
            if (flag1)
            {
                i = super.b.size();
                c.a(e, i - j);
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
        return ((List)super.b).get(i);
    }

    public int indexOf(Object obj)
    {
        a();
        return ((List)super.b).indexOf(obj);
    }

    public int lastIndexOf(Object obj)
    {
        a();
        return ((List)super.b).lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        a();
        return new a();
    }

    public ListIterator listIterator(int i)
    {
        a();
        return new a(i);
    }

    public Object remove(int i)
    {
        a();
        Object obj = ((List)super.b).remove(i);
        c.b(e);
        b();
        return obj;
    }

    public Object set(int i, Object obj)
    {
        a();
        return ((List)super.b).set(i, obj);
    }

    public List subList(int i, int j)
    {
        a();
        c c1 = e;
        Object obj1 = super.a;
        List list = ((List)super.b).subList(i, j);
        Object obj;
        if (super.c == null)
        {
            obj = this;
        } else
        {
            obj = super.c;
        }
        return c.a(c1, obj1, list, ((c) (obj)));
    }

    b(c c1, Object obj, List list, b b)
    {
        e = c1;
        super(c1, obj, list, b);
    }
}
