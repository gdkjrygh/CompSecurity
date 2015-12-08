// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Multiset, RegularImmutableMultiset, ImmutableMap, 
//            Multisets, LinkedHashMultiset, Iterators, ImmutableSet, 
//            Sets, UnmodifiableIterator

public abstract class ImmutableMultiset extends ImmutableCollection
    implements Multiset
{

    private static final ImmutableMultiset EMPTY = new RegularImmutableMultiset(ImmutableMap.of(), 0);
    private transient ImmutableSet entrySet;

    ImmutableMultiset()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static ImmutableMultiset copyFromEntries(Collection collection)
    {
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        collection = collection.iterator();
        long l = 0L;
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)collection.next();
            int i = entry.getCount();
            if (i > 0)
            {
                builder1.put(entry.getElement(), Integer.valueOf(i));
                l = (long)i + l;
            }
        } while (true);
        if (l == 0L)
        {
            return of();
        } else
        {
            return new RegularImmutableMultiset(builder1.build(), Ints.saturatedCast(l));
        }
    }

    public static ImmutableMultiset copyOf(Iterable iterable)
    {
        if (iterable instanceof ImmutableMultiset)
        {
            ImmutableMultiset immutablemultiset = (ImmutableMultiset)iterable;
            if (!immutablemultiset.isPartialView())
            {
                return immutablemultiset;
            }
        }
        if (iterable instanceof Multiset)
        {
            iterable = Multisets.cast(iterable);
        } else
        {
            iterable = LinkedHashMultiset.create(iterable);
        }
        return copyOfInternal(iterable);
    }

    public static ImmutableMultiset copyOf(Iterator iterator1)
    {
        LinkedHashMultiset linkedhashmultiset = LinkedHashMultiset.create();
        Iterators.addAll(linkedhashmultiset, iterator1);
        return copyOfInternal(linkedhashmultiset);
    }

    public static ImmutableMultiset copyOf(Object aobj[])
    {
        return copyOf(((Iterable) (Arrays.asList(aobj))));
    }

    private static ImmutableMultiset copyOfInternal(Multiset multiset)
    {
        return copyFromEntries(multiset.entrySet());
    }

    private static transient ImmutableMultiset copyOfInternal(Object aobj[])
    {
        return copyOf(Arrays.asList(aobj));
    }

    private final ImmutableSet createEntrySet()
    {
        if (isEmpty())
        {
            return ImmutableSet.of();
        } else
        {
            return new EntrySet(null);
        }
    }

    public static ImmutableMultiset of()
    {
        return EMPTY;
    }

    public static ImmutableMultiset of(Object obj)
    {
        return copyOfInternal(new Object[] {
            obj
        });
    }

    public static ImmutableMultiset of(Object obj, Object obj1)
    {
        return copyOfInternal(new Object[] {
            obj, obj1
        });
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2)
    {
        return copyOfInternal(new Object[] {
            obj, obj1, obj2
        });
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return copyOfInternal(new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return copyOfInternal(new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static transient ImmutableMultiset of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        return (new Builder()).add(obj).add(obj1).add(obj2).add(obj3).add(obj4).add(obj5).add(aobj).build();
    }

    public final int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return count(obj) > 0;
    }

    public boolean containsAll(Collection collection)
    {
        return elementSet().containsAll(collection);
    }

    int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
        {
            Multiset.Entry entry = (Multiset.Entry)iterator1.next();
            Arrays.fill(aobj, i, entry.getCount() + i, entry.getElement());
            i += entry.getCount();
        }

        return i;
    }

    public ImmutableSet entrySet()
    {
        ImmutableSet immutableset1 = entrySet;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = createEntrySet();
            entrySet = immutableset;
        }
        return immutableset;
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        return Multisets.equalsImpl(this, obj);
    }

    abstract Multiset.Entry getEntry(int i);

    public int hashCode()
    {
        return Sets.hashCodeImpl(entrySet());
    }

    public UnmodifiableIterator iterator()
    {
        return new _cls1(entrySet().iterator());
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public final int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public final int setCount(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean setCount(Object obj, int i, int j)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return entrySet().toString();
    }

    Object writeReplace()
    {
        return new SerializedForm();
    }


    /* member class not found */
    class Builder {}


    /* member class not found */
    class EntrySet {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class SerializedForm {}

}
