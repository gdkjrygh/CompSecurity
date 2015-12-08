// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, RegularImmutableList, ObjectArrays, SingletonImmutableList, 
//            Lists, UnmodifiableIterator, UnmodifiableListIterator

public abstract class ImmutableList extends ImmutableCollection
    implements List, RandomAccess
{

    private static final ImmutableList EMPTY;

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
                aobj1 = ObjectArrays.arraysCopyOf(aobj, i);
            }
            return new RegularImmutableList(aobj1);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static transient ImmutableList construct(Object aobj[])
    {
        return asImmutableList(ObjectArrays.checkElementsNotNull(aobj));
    }

    public static ImmutableList copyOf(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
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
            return construct(collection.toArray());
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
            return (new Builder()).add(obj).addAll(iterator1).build();
        }
    }

    public static ImmutableList copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return new RegularImmutableList(ObjectArrays.checkElementsNotNull((Object[])((Object []) (aobj)).clone()));

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static ImmutableList of()
    {
        return EMPTY;
    }

    public static ImmutableList of(Object obj)
    {
        return new SingletonImmutableList(obj);
    }

    public static ImmutableList of(Object obj, Object obj1)
    {
        return construct(new Object[] {
            obj, obj1
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2)
    {
        return construct(new Object[] {
            obj, obj1, obj2
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9
        });
    }

    public static ImmutableList of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9, Object obj10)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10
        });
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
        return construct(aobj1);
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
        int k = size();
        for (int j = 0; j < k; j++)
        {
            aobj[i + j] = get(j);
        }

        return i + k;
    }

    public boolean equals(Object obj)
    {
        return Lists.equalsImpl(this, obj);
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
        if (obj == null)
        {
            return -1;
        } else
        {
            return Lists.indexOfImpl(this, obj);
        }
    }

    public UnmodifiableIterator iterator()
    {
        return listIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int lastIndexOf(Object obj)
    {
        if (obj == null)
        {
            return -1;
        } else
        {
            return Lists.lastIndexOfImpl(this, obj);
        }
    }

    public UnmodifiableListIterator listIterator()
    {
        return listIterator(0);
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return new _cls1(size(), i);
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
        Preconditions.checkPositionIndexes(i, j, size());
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
        EMPTY = new RegularImmutableList(ObjectArrays.EMPTY_ARRAY);
    }

    /* member class not found */
    class Builder {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class ReverseImmutableList {}


    /* member class not found */
    class SubList {}


    /* member class not found */
    class SerializedForm {}

}
