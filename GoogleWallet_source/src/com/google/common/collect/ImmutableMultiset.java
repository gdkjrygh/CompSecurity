// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Multiset, RegularImmutableMultiset, ImmutableMap, 
//            ImmutableSet, Multisets, Sets, UnmodifiableIterator, 
//            ImmutableList, ImmutableAsList

public abstract class ImmutableMultiset extends ImmutableCollection
    implements Multiset
{
    final class EntrySet extends ImmutableSet
    {

        final ImmutableMultiset this$0;

        public final boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                break MISSING_BLOCK_LABEL_12;
            }
            do
            {
                return false;
            } while (((Multiset.Entry) (obj)).getCount() <= 0 || count(((Multiset.Entry) (obj)).getElement()) != ((Multiset.Entry) (obj)).getCount());
            return true;
        }

        final ImmutableList createAsList()
        {
            return new ImmutableAsList() {

                final EntrySet this$1;

                private Multiset.Entry get(int i)
                {
                    return getEntry(i);
                }

                final ImmutableCollection delegateCollection()
                {
                    return EntrySet.this;
                }

                public final volatile Object get(int i)
                {
                    return get(i);
                }

            
            {
                this$1 = EntrySet.this;
                super();
            }
            };
        }

        public final int hashCode()
        {
            return ImmutableMultiset.this.hashCode();
        }

        final boolean isPartialView()
        {
            return ImmutableMultiset.this.isPartialView();
        }

        public final UnmodifiableIterator iterator()
        {
            return asList().iterator();
        }

        public final volatile Iterator iterator()
        {
            return iterator();
        }

        public final int size()
        {
            return elementSet().size();
        }

        final Object writeReplace()
        {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }

        private EntrySet()
        {
            this$0 = ImmutableMultiset.this;
            super();
        }

    }

    static final class EntrySetSerializedForm
        implements Serializable
    {

        final ImmutableMultiset multiset;

        EntrySetSerializedForm(ImmutableMultiset immutablemultiset)
        {
            multiset = immutablemultiset;
        }
    }

    static final class SerializedForm
        implements Serializable
    {

        final int counts[];
        final Object elements[];

        SerializedForm(Multiset multiset)
        {
            int i = multiset.entrySet().size();
            elements = new Object[i];
            counts = new int[i];
            i = 0;
            for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
            {
                Multiset.Entry entry = (Multiset.Entry)multiset.next();
                elements[i] = entry.getElement();
                counts[i] = entry.getCount();
                i++;
            }

        }
    }


    private static final ImmutableMultiset EMPTY = new RegularImmutableMultiset(ImmutableMap.of(), 0);
    private transient ImmutableSet entrySet;

    ImmutableMultiset()
    {
    }

    static ImmutableMultiset copyFromEntries(Collection collection)
    {
        long l = 0L;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        collection = collection.iterator();
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
                builder.put(entry.getElement(), Integer.valueOf(i));
                l += i;
            }
        } while (true);
        if (l == 0L)
        {
            return of();
        } else
        {
            return new RegularImmutableMultiset(builder.build(), Ints.saturatedCast(l));
        }
    }

    private final ImmutableSet createEntrySet()
    {
        if (isEmpty())
        {
            return ImmutableSet.of();
        } else
        {
            return new EntrySet();
        }
    }

    private ImmutableSet entrySet()
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

    private static ImmutableMultiset of()
    {
        return EMPTY;
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

    public final volatile Set entrySet()
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
        return new UnmodifiableIterator() {

            Object element;
            int remaining;
            final ImmutableMultiset this$0;
            final Iterator val$entryIterator;

            public final boolean hasNext()
            {
                return remaining > 0 || entryIterator.hasNext();
            }

            public final Object next()
            {
                if (remaining <= 0)
                {
                    Multiset.Entry entry = (Multiset.Entry)entryIterator.next();
                    element = entry.getElement();
                    remaining = entry.getCount();
                }
                remaining = remaining - 1;
                return element;
            }

            
            {
                this$0 = ImmutableMultiset.this;
                entryIterator = iterator1;
                super();
            }
        };
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
        return new SerializedForm(this);
    }

}
