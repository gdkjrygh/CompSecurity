// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.a;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import se.emilsjolander.stickylistheaders.h;

public abstract class com.fitbit.ui.a.c extends BaseAdapter
    implements ListAdapter, List, h
{
    public static class a
        implements d
    {

        private final View a;

        public View a(int i, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = a;
            }
            return new View(viewgroup.getContext());
        }

        public a(View view)
        {
            a = view;
        }
    }

    private static class b
        implements Comparable
    {

        private final d a;
        private final int b;

        static int b(b b1)
        {
            return b1.b;
        }

        static d c(b b1)
        {
            return b1.a;
        }

        public int a(b b1)
        {
            return b - b1.b;
        }

        public int compareTo(Object obj)
        {
            return a((b)obj);
        }

        public boolean equals(Object obj)
        {
            return (obj instanceof b) && ((b)obj).b == b;
        }

        public b(d d1, int i)
        {
            a = d1;
            b = i;
        }
    }

    private final class c
        implements ListIterator
    {

        final com.fitbit.ui.a.c a;
        private final ListIterator b;

        public void add(Object obj)
        {
            b.add(obj);
            a.notifyDataSetChanged();
        }

        public boolean hasNext()
        {
            return b.hasNext();
        }

        public boolean hasPrevious()
        {
            return b.hasPrevious();
        }

        public Object next()
        {
            return b.next();
        }

        public int nextIndex()
        {
            return b.nextIndex();
        }

        public Object previous()
        {
            return b.previous();
        }

        public int previousIndex()
        {
            return b.previousIndex();
        }

        public void remove()
        {
            b.remove();
            a.notifyDataSetChanged();
        }

        public void set(Object obj)
        {
            b.set(obj);
            a.notifyDataSetChanged();
        }

        public c(ListIterator listiterator)
        {
            a = com.fitbit.ui.a.c.this;
            super();
            b = listiterator;
        }
    }

    public static interface d
    {

        public abstract View a(int i, View view, ViewGroup viewgroup);
    }


    private final List a;
    private final List b;
    private final boolean c;
    private d d;

    public com.fitbit.ui.a.c()
    {
        this(((List) (new ArrayList())), true);
    }

    public com.fitbit.ui.a.c(List list, boolean flag)
    {
        a = list;
        b = new ArrayList();
        c = flag;
    }

    private b b(int i)
    {
        Iterator iterator1 = b.iterator();
        b b1 = null;
        do
        {
            b b2;
label0:
            {
                if (iterator1.hasNext())
                {
                    b2 = (b)iterator1.next();
                    if (b.b(b2) <= i)
                    {
                        break label0;
                    }
                }
                return b1;
            }
            b1 = b2;
        } while (true);
    }

    public long a(int i)
    {
        b b1 = b(i);
        if (b1 == null)
        {
            return 0x8000000000000000L;
        } else
        {
            return (long)b.b(b1);
        }
    }

    public View a(int i, View view, ViewGroup viewgroup)
    {
        Object obj = b(i);
        if (obj == null)
        {
            if (d == null)
            {
                obj = new a(new View(viewgroup.getContext()));
            } else
            {
                obj = d;
            }
            d = ((d) (obj));
            return d.a(i, view, viewgroup);
        } else
        {
            return b.c(((b) (obj))).a(i, view, viewgroup);
        }
    }

    public void a(d d1, int i)
    {
        d1 = new b(d1, i);
        b.remove(d1);
        b.add(d1);
        Collections.sort(b);
        if (c)
        {
            notifyDataSetChanged();
        }
    }

    public boolean a(View view, Collection collection)
    {
        return a(((d) (new a(view))), collection);
    }

    public boolean a(d d1, Collection collection)
    {
        a(d1, a.size());
        return a.addAll(collection);
    }

    public void add(int i, Object obj)
    {
        a.add(i, obj);
        if (c)
        {
            notifyDataSetChanged();
        }
    }

    public boolean add(Object obj)
    {
        boolean flag = a.add(obj);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public boolean addAll(int i, Collection collection)
    {
        boolean flag = a.addAll(i, collection);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        boolean flag = a.addAll(collection);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public void clear()
    {
        a.clear();
        e();
        if (c)
        {
            notifyDataSetChanged();
        }
    }

    public boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    public int[] d()
    {
        int ai[] = new int[b.size()];
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            ai[i] = b.b((b)b.get(i));
        }

        return ai;
    }

    public void e()
    {
        b.clear();
    }

    public Object get(int i)
    {
        return a.get(i);
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public abstract View getView(int i, View view, ViewGroup viewgroup);

    public boolean hasStableIds()
    {
        return false;
    }

    public int indexOf(Object obj)
    {
        return a.indexOf(obj);
    }

    public Iterator iterator()
    {
        ListIterator listiterator = a.listIterator();
        if (c)
        {
            return new c(listiterator);
        } else
        {
            return listiterator;
        }
    }

    public int lastIndexOf(Object obj)
    {
        return a.lastIndexOf(obj);
    }

    public ListIterator listIterator()
    {
        ListIterator listiterator = a.listIterator();
        if (c)
        {
            return new c(listiterator);
        } else
        {
            return listiterator;
        }
    }

    public ListIterator listIterator(int i)
    {
        ListIterator listiterator = a.listIterator(i);
        if (c)
        {
            return new c(listiterator);
        } else
        {
            return listiterator;
        }
    }

    public Object remove(int i)
    {
        Object obj = a.remove(i);
        if (c)
        {
            notifyDataSetChanged();
        }
        return obj;
    }

    public boolean remove(Object obj)
    {
        boolean flag = a.remove(obj);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag = a.removeAll(collection);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag = a.retainAll(collection);
        if (flag && c)
        {
            notifyDataSetChanged();
        }
        return flag;
    }

    public Object set(int i, Object obj)
    {
        obj = a.set(i, obj);
        if (c)
        {
            notifyDataSetChanged();
        }
        return obj;
    }

    public int size()
    {
        return a.size();
    }

    public List subList(int i, int j)
    {
        com.fitbit.ui.a.c c1 = new com.fitbit.ui.a.c(a.subList(i, j), c) {

            final com.fitbit.ui.a.c a;

            public View getView(int k, View view, ViewGroup viewgroup)
            {
                throw new UnsupportedOperationException("Temp sublist cannot be used as ListAdapter");
            }

            
            {
                a = com.fitbit.ui.a.c.this;
                super(list, flag);
            }
        };
        c1.registerDataSetObserver(new DataSetObserver() {

            final com.fitbit.ui.a.c a;

            public void onChanged()
            {
                super.onChanged();
                a.notifyDataSetChanged();
            }

            public void onInvalidated()
            {
                super.onInvalidated();
                a.notifyDataSetInvalidated();
            }

            
            {
                a = com.fitbit.ui.a.c.this;
                super();
            }
        });
        return c1;
    }

    public Object[] toArray()
    {
        return a.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return a.toArray(aobj);
    }
}
