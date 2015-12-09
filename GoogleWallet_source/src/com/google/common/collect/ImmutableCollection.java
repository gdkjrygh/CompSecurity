// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            RegularImmutableAsList, ImmutableList, UnmodifiableIterator, ObjectArrays, 
//            CollectPreconditions

public abstract class ImmutableCollection extends AbstractCollection
    implements Serializable
{
    static abstract class ArrayBasedBuilder extends Builder
    {

        Object contents[];
        int size;

        private void ensureCapacity(int i)
        {
            if (contents.length < i)
            {
                contents = ObjectArrays.arraysCopyOf(contents, expandedCapacity(contents.length, i));
            }
        }

        public ArrayBasedBuilder add(Object obj)
        {
            Preconditions.checkNotNull(obj);
            ensureCapacity(size + 1);
            Object aobj[] = contents;
            int i = size;
            size = i + 1;
            aobj[i] = obj;
            return this;
        }

        public volatile Builder add(Object obj)
        {
            return add(obj);
        }

        public Builder addAll(Iterable iterable)
        {
            if (iterable instanceof Collection)
            {
                Collection collection = (Collection)iterable;
                ensureCapacity(size + collection.size());
            }
            super.addAll(iterable);
            return this;
        }

        ArrayBasedBuilder(int i)
        {
            CollectPreconditions.checkNonnegative(i, "initialCapacity");
            contents = new Object[i];
            size = 0;
        }
    }

    public static abstract class Builder
    {

        static int expandedCapacity(int i, int j)
        {
            if (j < 0)
            {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int k = (i >> 1) + i + 1;
            i = k;
            if (k < j)
            {
                i = Integer.highestOneBit(j - 1) << 1;
            }
            j = i;
            if (i < 0)
            {
                j = 0x7fffffff;
            }
            return j;
        }

        public abstract Builder add(Object obj);

        public Builder addAll(Iterable iterable)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); add(iterable.next())) { }
            return this;
        }

        public Builder addAll(Iterator iterator1)
        {
            for (; iterator1.hasNext(); add(iterator1.next())) { }
            return this;
        }

        Builder()
        {
        }
    }


    private transient ImmutableList asList;

    ImmutableCollection()
    {
    }

    public final boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public ImmutableList asList()
    {
        ImmutableList immutablelist1 = asList;
        ImmutableList immutablelist = immutablelist1;
        if (immutablelist1 == null)
        {
            immutablelist = createAsList();
            asList = immutablelist;
        }
        return immutablelist;
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return obj != null && super.contains(obj);
    }

    int copyIntoArray(Object aobj[], int i)
    {
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            aobj[i] = iterator1.next();
            i++;
        }

        return i;
    }

    ImmutableList createAsList()
    {
        switch (size())
        {
        default:
            return new RegularImmutableAsList(this, toArray());

        case 0: // '\0'
            return ImmutableList.of();

        case 1: // '\001'
            return ImmutableList.of(iterator().next());
        }
    }

    abstract boolean isPartialView();

    public abstract UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public final boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray()
    {
        if (size() == 0)
        {
            return ObjectArrays.EMPTY_ARRAY;
        } else
        {
            Object aobj[] = new Object[size()];
            copyIntoArray(aobj, 0);
            return aobj;
        }
    }

    public final Object[] toArray(Object aobj[])
    {
        int i;
        Preconditions.checkNotNull(((Object) (aobj)));
        i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        copyIntoArray(aobj1, 0);
        return aobj1;
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    Object writeReplace()
    {
        return new ImmutableList.SerializedForm(toArray());
    }
}
