// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;
import ctz;
import cuj;
import cuk;
import cuw;
import cvl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class Lists
{

    public static ArrayList a(int i)
    {
        cuj.a(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static ArrayList a(Iterable iterable)
    {
        ctz.a(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(cuk.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        cuw.a(arraylist, iterator);
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        ctz.a(((Object) (aobj)));
        ArrayList arraylist = new ArrayList(c(aobj.length));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static List a(List list, ctv ctv)
    {
        if (list instanceof RandomAccess)
        {
            return new TransformingRandomAccessList(list, ctv);
        } else
        {
            return new TransformingSequentialList(list, ctv);
        }
    }

    public static ArrayList b(int i)
    {
        return new ArrayList(c(i));
    }

    private static int c(int i)
    {
        cuj.a(i, "arraySize");
        return cvl.a(5L + (long)i + (long)(i / 10));
    }

    private class TransformingRandomAccessList extends AbstractList
        implements Serializable, RandomAccess
    {

        private static final long serialVersionUID = 0L;
        final List fromList;
        final ctv function;

        public void clear()
        {
            fromList.clear();
        }

        public Object get(int i)
        {
            return function.a(fromList.get(i));
        }

        public boolean isEmpty()
        {
            return fromList.isEmpty();
        }

        public Iterator iterator()
        {
            return listIterator();
        }

        public ListIterator listIterator(int i)
        {
            return new cvg(fromList.listIterator(i)) {

                private TransformingRandomAccessList b;

                final Object a(Object obj)
                {
                    return b.function.a(obj);
                }

                
                {
                    b = TransformingRandomAccessList.this;
                    super(listiterator);
                }
            };
        }

        public Object remove(int i)
        {
            return function.a(fromList.remove(i));
        }

        public int size()
        {
            return fromList.size();
        }

        TransformingRandomAccessList(List list, ctv ctv1)
        {
            fromList = (List)ctz.a(list);
            function = (ctv)ctz.a(ctv1);
        }
    }


    private class TransformingSequentialList extends AbstractSequentialList
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final List fromList;
        final ctv function;

        public void clear()
        {
            fromList.clear();
        }

        public ListIterator listIterator(int i)
        {
            return new cvg(fromList.listIterator(i)) {

                private TransformingSequentialList b;

                final Object a(Object obj)
                {
                    return b.function.a(obj);
                }

                
                {
                    b = TransformingSequentialList.this;
                    super(listiterator);
                }
            };
        }

        public int size()
        {
            return fromList.size();
        }

        TransformingSequentialList(List list, ctv ctv1)
        {
            fromList = (List)ctz.a(list);
            function = (ctv)ctz.a(ctv1);
        }
    }

}
