// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class en
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
            int j = size();
            dv.a(i, j);
            return j - 1 - i;
        }

        static int a(b b1, int i)
        {
            return b1.b(i);
        }

        private int b(int i)
        {
            int j = size();
            dv.b(i, j);
            return j - i;
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
                    return b.a(c, b.nextIndex());
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
                    dv.b(a, "no calls to next() since the last call to remove()");
                    b.remove();
                    a = false;
                }

                public final void set(Object obj)
                {
                    dv.b(a);
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

        protected void removeRange(int i, int j)
        {
            subList(i, j).clear();
        }

        public Object set(int i, Object obj)
        {
            return a.set(a(i), obj);
        }

        public int size()
        {
            return a.size();
        }

        public List subList(int i, int j)
        {
            dv.a(i, j, size());
            return en.a(a.subList(b(j), b(i)));
        }

        b(List list)
        {
            a = (List)dv.a(list);
        }
    }


    public static ArrayList a(int i)
    {
        dF.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList a(Iterable iterable)
    {
        dv.a(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(dG.a(iterable));
        } else
        {
            iterable = iterable.iterator();
            ArrayList arraylist = new ArrayList();
            em.a(arraylist, iterable);
            return arraylist;
        }
    }

    public static transient ArrayList a(Object aobj[])
    {
        dv.a(((Object) (aobj)));
        int i = aobj.length;
        dF.a(i, "arraySize");
        long l = i;
        ArrayList arraylist = new ArrayList(eQ.a((long)(i / 10) + (5L + l)));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static List a(List list)
    {
        if (list instanceof ea)
        {
            return ((ea)list).g();
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
}
