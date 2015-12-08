// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Iterators, Collections2, ImmutableAsList, ImmutableList, 
//            UnmodifiableIterator, ObjectArrays, SingletonImmutableList, RegularImmutableList, 
//            Platform

public abstract class ImmutableCollection
    implements Collection, Serializable
{
    private static class ArrayImmutableCollection extends ImmutableCollection
    {

        private final Object elements[];

        ImmutableList createAsList()
        {
            if (elements.length == 1)
            {
                return new SingletonImmutableList(elements[0]);
            } else
            {
                return new RegularImmutableList(elements);
            }
        }

        public boolean isEmpty()
        {
            return false;
        }

        boolean isPartialView()
        {
            return false;
        }

        public UnmodifiableIterator iterator()
        {
            return Iterators.forArray(elements);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return elements.length;
        }

        ArrayImmutableCollection(Object aobj[])
        {
            elements = aobj;
        }
    }

    static abstract class Builder
    {

        public abstract Builder add(Object obj);

        public transient Builder add(Object aobj[])
        {
            int j = aobj.length;
            for (int i = 0; i < j; i++)
            {
                add(aobj[i]);
            }

            return this;
        }

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

        public abstract ImmutableCollection build();

        Builder()
        {
        }
    }

    private static class EmptyImmutableCollection extends ImmutableCollection
    {

        private static final Object EMPTY_ARRAY[] = new Object[0];

        public boolean contains(Object obj)
        {
            return false;
        }

        ImmutableList createAsList()
        {
            return ImmutableList.of();
        }

        public boolean isEmpty()
        {
            return true;
        }

        boolean isPartialView()
        {
            return false;
        }

        public UnmodifiableIterator iterator()
        {
            return Iterators.EMPTY_ITERATOR;
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return 0;
        }

        public Object[] toArray()
        {
            return EMPTY_ARRAY;
        }

        public Object[] toArray(Object aobj[])
        {
            if (aobj.length > 0)
            {
                aobj[0] = null;
            }
            return aobj;
        }


        private EmptyImmutableCollection()
        {
        }

    }

    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            if (elements.length == 0)
            {
                return ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
            } else
            {
                return new ArrayImmutableCollection(Platform.clone(elements));
            }
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }


    static final ImmutableCollection EMPTY_IMMUTABLE_COLLECTION = new EmptyImmutableCollection();
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
        return obj != null && Iterators.contains(iterator(), obj);
    }

    public boolean containsAll(Collection collection)
    {
        return Collections2.containsAllImpl(this, collection);
    }

    ImmutableList createAsList()
    {
        switch (size())
        {
        default:
            return new ImmutableAsList(toArray(), this);

        case 0: // '\0'
            return ImmutableList.of();

        case 1: // '\001'
            return ImmutableList.of(iterator().next());
        }
    }

    public boolean isEmpty()
    {
        return size() == 0;
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

    public Object[] toArray()
    {
        return ObjectArrays.toArrayImpl(this);
    }

    public Object[] toArray(Object aobj[])
    {
        return ObjectArrays.toArrayImpl(this, aobj);
    }

    public String toString()
    {
        return Collections2.toStringImpl(this);
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

}
