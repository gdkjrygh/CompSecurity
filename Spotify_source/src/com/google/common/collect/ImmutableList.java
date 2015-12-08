// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cty;
import ctz;
import cug;
import cuq;
import cuw;
import cuz;
import cvh;
import cvi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, RegularImmutableList, SingletonImmutableList

public abstract class ImmutableList extends ImmutableCollection
    implements List, RandomAccess
{

    static final ImmutableList a;

    ImmutableList()
    {
    }

    public static ImmutableList a(Object obj)
    {
        return new SingletonImmutableList(obj);
    }

    public static ImmutableList a(Object obj, Object obj1)
    {
        obj = ((Object) (cuz.a(new Object[] {
            obj, obj1
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ImmutableList a(Object obj, Object obj1, Object obj2)
    {
        obj = ((Object) (cuz.a(new Object[] {
            obj, obj1, obj2
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ImmutableList a(Object obj, Object obj1, Object obj2, Object obj3)
    {
        obj = ((Object) (cuz.a(new Object[] {
            obj, obj1, obj2, obj3
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ImmutableList a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        obj = ((Object) (cuz.a(new Object[] {
            obj, obj1, obj2, obj3, obj4
        })));
        return b(((Object []) (obj)), obj.length);
    }

    public static ImmutableList a(Collection collection)
    {
        if (collection instanceof ImmutableCollection)
        {
            ImmutableList immutablelist = ((ImmutableCollection)collection).b();
            collection = immutablelist;
            if (immutablelist.e())
            {
                collection = ((Collection) (immutablelist.toArray()));
                collection = b(collection, collection.length);
            }
            return collection;
        } else
        {
            collection = ((Collection) (cuz.a(collection.toArray())));
            return b(collection, collection.length);
        }
    }

    public static ImmutableList a(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new RegularImmutableList(cuz.a((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static ImmutableList b(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = cuz.b(aobj, i);
            }
            return new RegularImmutableList(aobj1);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static ImmutableList d()
    {
        return a;
    }

    public static cuq h()
    {
        return new cuq();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int a(Object aobj[], int i)
    {
        int k = size();
        for (int j = 0; j < k; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + k;
    }

    public ImmutableList a(int i, int j)
    {
        ctz.a(i, j, size());
        switch (j - i)
        {
        default:
            return b(i, j);

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return a(get(i));
        }
    }

    public cvh a()
    {
        return a(0);
    }

    public cvi a(int i)
    {
        return new cug(size(), i) {

            private ImmutableList a;

            protected final Object a(int j)
            {
                return a.get(j);
            }

            
            {
                a = ImmutableList.this;
                super(i, j);
            }
        };
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final ImmutableList b()
    {
        return this;
    }

    ImmutableList b(int i, int j)
    {
        return new SubList(i, j - i);
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != ctz.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !cuw.a(iterator(), ((List) (obj)).iterator())))
            {
                return false;
            }
        }
        return true;
    }

    public ImmutableList g()
    {
        return new ReverseImmutableList();
    }

    public int hashCode()
    {
        int j = 1;
        int k = size();
        for (int i = 0; i < k; i++)
        {
            j = ~~(j * 31 + get(i).hashCode());
        }

        return j;
    }

    public int indexOf(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                break label0;
            }
            ListIterator listiterator = listIterator();
            do
            {
                if (!listiterator.hasNext())
                {
                    break label0;
                }
            } while (!cty.a(obj, listiterator.next()));
            return listiterator.previousIndex();
        }
        return -1;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int lastIndexOf(Object obj)
    {
label0:
        {
            if (obj == null)
            {
                break label0;
            }
            ListIterator listiterator = listIterator(size());
            do
            {
                if (!listiterator.hasPrevious())
                {
                    break label0;
                }
            } while (!cty.a(obj, listiterator.previous()));
            return listiterator.nextIndex();
        }
        return -1;
    }

    public ListIterator listIterator()
    {
        return a(0);
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public List subList(int i, int j)
    {
        return a(i, j);
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

    static 
    {
        a = new RegularImmutableList(cuz.a);
    }

    private class SubList extends ImmutableList
    {

        private transient int b;
        private transient int c;
        final ImmutableList this$0;

        public final ImmutableList a(int i, int j)
        {
            ctz.a(i, j, c);
            return ImmutableList.this.a(b + i, b + j);
        }

        final boolean e()
        {
            return true;
        }

        public Object get(int i)
        {
            ctz.a(i, c);
            return ImmutableList.this.get(b + i);
        }

        public Iterator iterator()
        {
            return a();
        }

        public ListIterator listIterator()
        {
            return a(0);
        }

        public ListIterator listIterator(int i)
        {
            return a(i);
        }

        public int size()
        {
            return c;
        }

        public List subList(int i, int j)
        {
            return a(i, j);
        }

        SubList(int i, int j)
        {
            this$0 = ImmutableList.this;
            super();
            b = i;
            c = j;
        }
    }


    private class ReverseImmutableList extends ImmutableList
    {

        private final transient ImmutableList b;

        private int b(int i)
        {
            return size() - 1 - i;
        }

        public final ImmutableList a(int i, int j)
        {
            ctz.a(i, j, size());
            return b.a(size() - j, size() - i).g();
        }

        public boolean contains(Object obj)
        {
            return b.contains(obj);
        }

        final boolean e()
        {
            return b.e();
        }

        public final ImmutableList g()
        {
            return b;
        }

        public Object get(int i)
        {
            ctz.a(i, size());
            return b.get(b(i));
        }

        public int indexOf(Object obj)
        {
            int i = b.lastIndexOf(obj);
            if (i >= 0)
            {
                return b(i);
            } else
            {
                return -1;
            }
        }

        public Iterator iterator()
        {
            return a();
        }

        public int lastIndexOf(Object obj)
        {
            int i = b.indexOf(obj);
            if (i >= 0)
            {
                return b(i);
            } else
            {
                return -1;
            }
        }

        public ListIterator listIterator()
        {
            return a(0);
        }

        public ListIterator listIterator(int i)
        {
            return a(i);
        }

        public int size()
        {
            return b.size();
        }

        public List subList(int i, int j)
        {
            return a(i, j);
        }

        ReverseImmutableList()
        {
            b = ImmutableList.this;
        }
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return ImmutableList.a(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }

}
