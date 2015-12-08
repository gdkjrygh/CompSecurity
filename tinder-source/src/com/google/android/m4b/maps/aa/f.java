// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.n.a;
import com.google.android.m4b.maps.y.j;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bb, bc, e, ae

public final class f
{
    static final class a extends b
        implements RandomAccess
    {

        a(List list)
        {
            super(list);
        }
    }

    static class b extends AbstractList
    {

        final List a;

        private int a(int i)
        {
            int k = size();
            j.a(i, k);
            return k - 1 - i;
        }

        static int a(b b1, int i)
        {
            return b1.b(i);
        }

        private int b(int i)
        {
            int k = size();
            j.b(i, k);
            return k - i;
        }

        public void add(int i, Object obj)
        {
            a.add(b(i), obj);
        }

        public void clear()
        {
            a.clear();
        }

        public Object get(int i)
        {
            return a.get(a(i));
        }

        public Iterator iterator()
        {
            return listIterator();
        }

        public ListIterator listIterator(int i)
        {
            i = b(i);
            return new ListIterator(this, a.listIterator(i)) {

                private boolean a;
                private ListIterator b;
                private b c;

                public final void add(Object obj)
                {
                    b.add(obj);
                    b.previous();
                    a = false;
                }

                public final boolean hasNext()
                {
                    return b.hasPrevious();
                }

                public final boolean hasPrevious()
                {
                    return b.hasNext();
                }

                public final Object next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        a = true;
                        return b.previous();
                    }
                }

                public final int nextIndex()
                {
                    return com.google.android.m4b.maps.aa.b.a(c, b.nextIndex());
                }

                public final Object previous()
                {
                    if (!hasPrevious())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        a = true;
                        return b.next();
                    }
                }

                public final int previousIndex()
                {
                    return nextIndex() - 1;
                }

                public final void remove()
                {
                    j.b(a, "no calls to next() since the last call to remove()");
                    b.remove();
                    a = false;
                }

                public final void set(Object obj)
                {
                    j.b(a);
                    b.set(obj);
                }

            
            {
                c = b1;
                b = listiterator;
                super();
            }
            };
        }

        public Object remove(int i)
        {
            return a.remove(a(i));
        }

        protected void removeRange(int i, int k)
        {
            subList(i, k).clear();
        }

        public Object set(int i, Object obj)
        {
            return a.set(a(i), obj);
        }

        public int size()
        {
            return a.size();
        }

        public List subList(int i, int k)
        {
            j.a(i, k, size());
            return com.google.android.m4b.maps.aa.f.a(a.subList(b(k), b(i)));
        }

        b(List list)
        {
            a = (List)j.a(list);
        }
    }


    public static int a(int i)
    {
        com.google.android.m4b.maps.aa.bb.a(i, "arraySize");
        return com.google.android.m4b.maps.n.a.a(5L + (long)i + (long)(i / 10));
    }

    public static ArrayList a(Iterable iterable)
    {
        j.a(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(com.google.android.m4b.maps.aa.bc.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        com.google.android.m4b.maps.aa.e.a(arraylist, iterator);
        return arraylist;
    }

    public static List a(List list)
    {
        if (list instanceof ae)
        {
            return ((ae)list).f();
        }
        if (list instanceof b)
        {
            return ((b)list).a;
        }
        if (list instanceof RandomAccess)
        {
            return new a(list);
        } else
        {
            return new b(list);
        }
    }

    public static ArrayList b(int i)
    {
        com.google.android.m4b.maps.aa.bb.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static LinkedList b(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        if (iterable instanceof Collection)
        {
            linkedlist.addAll(com.google.android.m4b.maps.aa.bc.a(iterable));
            return linkedlist;
        } else
        {
            com.google.android.m4b.maps.aa.e.a(linkedlist, ((Iterable)j.a(iterable)).iterator());
            return linkedlist;
        }
    }

    public static ArrayList c(int i)
    {
        return new ArrayList(a(i));
    }
}
