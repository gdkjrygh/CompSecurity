// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.k;
import com.google.common.base.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, RegularImmutableList, dt, SingletonImmutableList, 
//            au, bl, at, ej, 
//            ek

public abstract class ImmutableList extends ImmutableCollection
    implements List, RandomAccess
{

    private static final ImmutableList a;

    ImmutableList()
    {
    }

    static ImmutableList asImmutableList(Object aobj[])
    {
        return asImmutableList(aobj, aobj.length);
    }

    static ImmutableList asImmutableList(Object aobj[], int i)
    {
        switch (i)
        {
        default:
            Object aobj1[] = aobj;
            if (i < aobj.length)
            {
                aobj1 = dt.b(aobj, i);
            }
            return new RegularImmutableList(aobj1);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static au builder()
    {
        return new au();
    }

    public static ImmutableList copyOf(Iterable iterable)
    {
        p.a(iterable);
        if (iterable instanceof Collection)
        {
            return copyOf((Collection)iterable);
        } else
        {
            return copyOf(iterable.iterator());
        }
    }

    public static ImmutableList copyOf(Collection collection)
    {
        if (collection instanceof ImmutableCollection)
        {
            ImmutableList immutablelist = ((ImmutableCollection)collection).asList();
            collection = immutablelist;
            if (immutablelist.isPartialView())
            {
                collection = asImmutableList(immutablelist.toArray());
            }
            return collection;
        } else
        {
            return asImmutableList(dt.a(collection.toArray()));
        }
    }

    public static ImmutableList copyOf(Iterator iterator1)
    {
        if (!iterator1.hasNext())
        {
            return of();
        }
        Object obj = iterator1.next();
        if (!iterator1.hasNext())
        {
            return of(obj);
        } else
        {
            return (new au()).c(obj).b(iterator1).a();
        }
    }

    public static ImmutableList copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new RegularImmutableList(dt.a((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static ImmutableList of()
    {
        return a;
    }

    public static ImmutableList of(Object obj)
    {
        return new SingletonImmutableList(obj);
    }

    public static ImmutableList of(Object obj, Object obj1)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9
        }));
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9, Object obj10)
    {
        return asImmutableList(dt.a(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10
        }));
    }

    public static transient ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9, Object obj10, Object obj11, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 12];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        aobj1[6] = obj6;
        aobj1[7] = obj7;
        aobj1[8] = obj8;
        aobj1[9] = obj9;
        aobj1[10] = obj10;
        aobj1[11] = obj11;
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 12, aobj.length);
        return asImmutableList(dt.a(aobj1));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final ImmutableList asList()
    {
        return this;
    }

    public boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    int copyIntoArray(Object aobj[], int i)
    {
        int l = size();
        for (int j = 0; j < l; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + l;
    }

    public boolean equals(Object obj)
    {
        if (obj != p.a(this))
        {
            if (!(obj instanceof List) || (size() != ((List) (obj = (List)obj)).size() || !bl.a(iterator(), ((List) (obj)).iterator())))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 1;
        int l = size();
        for (int i = 0; i < l; i++)
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
            } while (!k.a(obj, listiterator.next()));
            return listiterator.previousIndex();
        }
        return -1;
    }

    public ej iterator()
    {
        return listIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
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
            } while (!k.a(obj, listiterator.previous()));
            return listiterator.nextIndex();
        }
        return -1;
    }

    public ek listIterator()
    {
        return listIterator(0);
    }

    public ek listIterator(int i)
    {
        return new at(this, size(), i);
    }

    public volatile ListIterator listIterator()
    {
        return listIterator();
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public final Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableList reverse()
    {
        return new ReverseImmutableList();
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableList subList(int i, int j)
    {
        p.a(i, j, size());
        switch (j - i)
        {
        default:
            return subListUnchecked(i, j);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(get(i));
        }
    }

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    ImmutableList subListUnchecked(int i, int j)
    {
        return new SubList(i, j - i);
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

    static 
    {
        a = new RegularImmutableList(dt.a);
    }

    private class ReverseImmutableList extends ImmutableList
    {

        private final transient ImmutableList a;

        private int a(int i)
        {
            return size() - 1 - i;
        }

        public boolean contains(Object obj)
        {
            return a.contains(obj);
        }

        public Object get(int i)
        {
            p.a(i, size());
            return a.get(a(i));
        }

        public int indexOf(Object obj)
        {
            int i = a.lastIndexOf(obj);
            if (i >= 0)
            {
                return a(i);
            } else
            {
                return -1;
            }
        }

        boolean isPartialView()
        {
            return a.isPartialView();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int lastIndexOf(Object obj)
        {
            int i = a.indexOf(obj);
            if (i >= 0)
            {
                return a(i);
            } else
            {
                return -1;
            }
        }

        public volatile ListIterator listIterator()
        {
            return listIterator();
        }

        public volatile ListIterator listIterator(int i)
        {
            return listIterator(i);
        }

        public ImmutableList reverse()
        {
            return a;
        }

        public int size()
        {
            return a.size();
        }

        public ImmutableList subList(int i, int j)
        {
            p.a(i, j, size());
            return a.subList(size() - j, size() - i).reverse();
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }

        ReverseImmutableList()
        {
            a = ImmutableList.this;
        }
    }


    private class SubList extends ImmutableList
    {

        final transient int length;
        final transient int offset;
        final ImmutableList this$0;

        public Object get(int i)
        {
            p.a(i, length);
            return ImmutableList.this.get(offset + i);
        }

        boolean isPartialView()
        {
            return true;
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public volatile ListIterator listIterator()
        {
            return listIterator();
        }

        public volatile ListIterator listIterator(int i)
        {
            return listIterator(i);
        }

        public int size()
        {
            return length;
        }

        public ImmutableList subList(int i, int j)
        {
            p.a(i, j, length);
            return ImmutableList.this.subList(offset + i, offset + j);
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }

        SubList(int i, int j)
        {
            this$0 = ImmutableList.this;
            super();
            offset = i;
            length = j;
        }
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return ImmutableList.copyOf(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }

}
