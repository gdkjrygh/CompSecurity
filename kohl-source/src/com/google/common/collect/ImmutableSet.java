// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Hashing, SingletonImmutableSet, RegularImmutableSet, 
//            Collections2, ImmutableSortedSet, Lists, EmptyImmutableSet, 
//            Sets, UnmodifiableIterator, ImmutableAsList, Iterators, 
//            ObjectArrays, ImmutableList, AbstractIndexedListIterator

public abstract class ImmutableSet extends ImmutableCollection
    implements Set
{
    static abstract class ArrayImmutableSet extends ImmutableSet
    {

        final transient Object elements[];

        public boolean containsAll(Collection collection)
        {
            if (collection != this)
            {
                if (!(collection instanceof ArrayImmutableSet))
                {
                    return containsAll(collection);
                }
                if (collection.size() > size())
                {
                    return false;
                }
                collection = ((Collection) (((ArrayImmutableSet)collection).elements));
                int j = collection.length;
                int i = 0;
                while (i < j) 
                {
                    if (!contains(collection[i]))
                    {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        }

        ImmutableList createAsList()
        {
            return new ImmutableAsList(elements, this);
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

        public Object[] toArray()
        {
            Object aobj[] = new Object[size()];
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), 0, size());
            return aobj;
        }

        public Object[] toArray(Object aobj[])
        {
            int i = size();
            if (aobj.length >= i) goto _L2; else goto _L1
_L1:
            Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
            System.arraycopy(((Object) (elements)), 0, ((Object) (aobj1)), 0, i);
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

        ArrayImmutableSet(Object aobj[])
        {
            elements = aobj;
        }
    }

    public static class Builder extends ImmutableCollection.Builder
    {

        final ArrayList contents = Lists.newArrayList();

        public volatile ImmutableCollection.Builder add(Object obj)
        {
            return add(obj);
        }

        public volatile ImmutableCollection.Builder add(Object aobj[])
        {
            return add(aobj);
        }

        public Builder add(Object obj)
        {
            contents.add(Preconditions.checkNotNull(obj));
            return this;
        }

        public transient Builder add(Object aobj[])
        {
            contents.ensureCapacity(contents.size() + aobj.length);
            super.add(aobj);
            return this;
        }

        public volatile ImmutableCollection.Builder addAll(Iterable iterable)
        {
            return addAll(iterable);
        }

        public volatile ImmutableCollection.Builder addAll(Iterator iterator1)
        {
            return addAll(iterator1);
        }

        public Builder addAll(Iterable iterable)
        {
            if (iterable instanceof Collection)
            {
                Collection collection = (Collection)iterable;
                contents.ensureCapacity(contents.size() + collection.size());
            }
            super.addAll(iterable);
            return this;
        }

        public Builder addAll(Iterator iterator1)
        {
            super.addAll(iterator1);
            return this;
        }

        public volatile ImmutableCollection build()
        {
            return build();
        }

        public ImmutableSet build()
        {
            return ImmutableSet.copyOf(contents);
        }

        public Builder()
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
            return ImmutableSet.copyOf(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }

    static abstract class TransformedImmutableSet extends ImmutableSet
    {

        final int hashCode;
        final Object source[];

        public final int hashCode()
        {
            return hashCode;
        }

        public boolean isEmpty()
        {
            return false;
        }

        boolean isHashCodeFast()
        {
            return true;
        }

        public UnmodifiableIterator iterator()
        {
            return new AbstractIndexedListIterator(source.length) {

                final TransformedImmutableSet this$0;

                protected Object get(int i)
                {
                    return transform(source[i]);
                }

            
            {
                this$0 = TransformedImmutableSet.this;
                super(i);
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return source.length;
        }

        public Object[] toArray()
        {
            return toArray(new Object[size()]);
        }

        public Object[] toArray(Object aobj[])
        {
            int i = size();
            if (aobj.length >= i) goto _L2; else goto _L1
_L1:
            Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
            for (i = 0; i < source.length; i++)
            {
                aobj1[i] = transform(source[i]);
            }

            break; /* Loop/switch isn't completed */
_L2:
            aobj1 = aobj;
            if (aobj.length > i)
            {
                aobj[i] = null;
                aobj1 = aobj;
            }
            if (true) goto _L4; else goto _L3
_L3:
            return aobj1;
        }

        abstract Object transform(Object obj);

        TransformedImmutableSet(Object aobj[], int i)
        {
            source = aobj;
            hashCode = i;
        }
    }


    static final int CUTOFF = 0x20000000;
    static final int MAX_TABLE_SIZE = 0x40000000;

    ImmutableSet()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    static int chooseTableSize(int i)
    {
        if (i < 0x20000000)
        {
            return Integer.highestOneBit(i) << 2;
        }
        boolean flag;
        if (i < 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "collection too large");
        return 0x40000000;
    }

    private static transient ImmutableSet construct(Object aobj[])
    {
        Object obj;
        Object aobj1[];
        int i;
        int j;
        int j1;
        int k1;
        j1 = chooseTableSize(aobj.length);
        aobj1 = new Object[j1];
        k1 = j1 - 1;
        obj = null;
        j = 0;
        i = 0;
_L9:
        if (i >= aobj.length) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k;
        int l;
        obj1 = aobj[i];
        l = obj1.hashCode();
        k = Hashing.smear(l);
_L7:
        Object obj2;
        int l1;
        l1 = k & k1;
        obj2 = aobj1[l1];
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((ArrayList) (obj)).add(obj1);
        }
        aobj1[l1] = obj1;
        k = j + l;
        obj1 = obj;
_L6:
        i++;
        j = k;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L4:
label0:
        {
            if (!obj2.equals(obj1))
            {
                break label0;
            }
            k = j;
            obj1 = obj;
            if (obj == null)
            {
                obj = new ArrayList(aobj.length);
                int i1 = 0;
                do
                {
                    k = j;
                    obj1 = obj;
                    if (i1 >= i)
                    {
                        break;
                    }
                    ((ArrayList) (obj)).add(aobj[i1]);
                    i1++;
                } while (true);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        k++;
        if (true) goto _L7; else goto _L2
_L2:
        if (obj != null)
        {
            aobj = ((ArrayList) (obj)).toArray();
        }
        if (aobj.length == 1)
        {
            return new SingletonImmutableSet(aobj[0], j);
        }
        if (j1 > chooseTableSize(aobj.length) * 2)
        {
            return construct(aobj);
        }
        return new RegularImmutableSet(aobj, j, aobj1, k1);
        if (true) goto _L9; else goto _L8
_L8:
    }

    private static ImmutableSet copyFromCollection(Collection collection)
    {
        collection = ((Collection) (collection.toArray()));
        switch (collection.length)
        {
        default:
            return construct(collection);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(collection[0]);
        }
    }

    public static ImmutableSet copyOf(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return copyOf(Collections2.cast(iterable));
        } else
        {
            return copyOf(iterable.iterator());
        }
    }

    public static ImmutableSet copyOf(Collection collection)
    {
        if ((collection instanceof ImmutableSet) && !(collection instanceof ImmutableSortedSet))
        {
            ImmutableSet immutableset = (ImmutableSet)collection;
            if (!immutableset.isPartialView())
            {
                return immutableset;
            }
        }
        return copyFromCollection(collection);
    }

    public static ImmutableSet copyOf(Iterator iterator1)
    {
        return copyFromCollection(Lists.newArrayList(iterator1));
    }

    public static ImmutableSet copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return construct((Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(aobj[0]);
        }
    }

    public static ImmutableSet of()
    {
        return EmptyImmutableSet.INSTANCE;
    }

    public static ImmutableSet of(Object obj)
    {
        return new SingletonImmutableSet(obj);
    }

    public static ImmutableSet of(Object obj, Object obj1)
    {
        return construct(new Object[] {
            obj, obj1
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2)
    {
        return construct(new Object[] {
            obj, obj1, obj2
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3
        });
    }

    public static ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        return construct(new Object[] {
            obj, obj1, obj2, obj3, obj4
        });
    }

    public static transient ImmutableSet of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object aobj[])
    {
        Object aobj1[] = new Object[aobj.length + 6];
        aobj1[0] = obj;
        aobj1[1] = obj1;
        aobj1[2] = obj2;
        aobj1[3] = obj3;
        aobj1[4] = obj4;
        aobj1[5] = obj5;
        for (int i = 6; i < aobj1.length; i++)
        {
            aobj1[i] = aobj[i - 6];
        }

        return construct(aobj1);
    }

    public static ImmutableSet of(Object aobj[])
    {
        return copyOf(aobj);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet)obj).isHashCodeFast() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return Sets.equalsImpl(this, obj);
        }
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    boolean isHashCodeFast()
    {
        return false;
    }

    public abstract UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }
}
