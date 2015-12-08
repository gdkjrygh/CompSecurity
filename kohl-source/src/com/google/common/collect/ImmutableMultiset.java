// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, Multiset, Multisets, LinkedHashMultiset, 
//            Iterators, ImmutableMap, EmptyImmutableMultiset, Serialization, 
//            ImmutableSet, UnmodifiableIterator, ObjectArrays

public class ImmutableMultiset extends ImmutableCollection
    implements Multiset
{
    public static final class Builder extends ImmutableCollection.Builder
    {

        private final Multiset contents = LinkedHashMultiset.create();

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
            if (iterable instanceof Multiset)
            {
                Multiset.Entry entry;
                for (iterable = Multisets.cast(iterable).entrySet().iterator(); iterable.hasNext(); addCopies(entry.getElement(), entry.getCount()))
                {
                    entry = (Multiset.Entry)iterable.next();
                }

            } else
            {
                super.addAll(iterable);
            }
            return this;
        }

        public Builder addAll(Iterator iterator1)
        {
            super.addAll(iterator1);
            return this;
        }

        public Builder addCopies(Object obj, int i)
        {
            contents.add(Preconditions.checkNotNull(obj), i);
            return this;
        }

        public volatile ImmutableCollection build()
        {
            return build();
        }

        public ImmutableMultiset build()
        {
            return ImmutableMultiset.copyOf(contents);
        }

        public Builder setCount(Object obj, int i)
        {
            contents.setCount(Preconditions.checkNotNull(obj), i);
            return this;
        }

        public Builder()
        {
        }
    }

    private static class EntrySet extends ImmutableSet
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMultiset multiset;

        public boolean contains(Object obj)
        {
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                break MISSING_BLOCK_LABEL_12;
            }
            do
            {
                return false;
            } while (((Multiset.Entry) (obj)).getCount() <= 0 || multiset.count(((Multiset.Entry) (obj)).getElement()) != ((Multiset.Entry) (obj)).getCount());
            return true;
        }

        public int hashCode()
        {
            return multiset.map.hashCode();
        }

        boolean isPartialView()
        {
            return multiset.isPartialView();
        }

        public UnmodifiableIterator iterator()
        {
            return multiset.map.entrySet().iterator(). new UnmodifiableIterator() {

                final EntrySet this$0;
                final Iterator val$mapIterator;

                public boolean hasNext()
                {
                    return mapIterator.hasNext();
                }

                public Multiset.Entry next()
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)mapIterator.next();
                    return Multisets.immutableEntry(entry.getKey(), ((Integer)entry.getValue()).intValue());
                }

                public volatile Object next()
                {
                    return next();
                }

            
            {
                this$0 = final_entryset;
                mapIterator = Iterator.this;
                super();
            }
            };
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return multiset.map.size();
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
            i = 0;
            for (aobj = iterator(); ((Iterator) (aobj)).hasNext();)
            {
                aobj1[i] = (Multiset.Entry)((Iterator) (aobj)).next();
                i++;
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

        Object writeReplace()
        {
            return this;
        }

        public EntrySet(ImmutableMultiset immutablemultiset)
        {
            multiset = immutablemultiset;
        }
    }

    private static class FieldSettersHolder
    {

        static final Serialization.FieldSetter MAP_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultiset, "map");
        static final Serialization.FieldSetter SIZE_FIELD_SETTER = Serialization.getFieldSetter(com/google/common/collect/ImmutableMultiset, "size");


        private FieldSettersHolder()
        {
        }
    }


    private static final long serialVersionUID = 0L;
    private transient ImmutableSet entrySet;
    private final transient ImmutableMap map;
    private final transient int size;

    ImmutableMultiset(ImmutableMap immutablemap, int i)
    {
        map = immutablemap;
        size = i;
    }

    public static Builder builder()
    {
        return new Builder();
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
        long l = 0L;
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        multiset = multiset.entrySet().iterator();
        do
        {
            if (!multiset.hasNext())
            {
                break;
            }
            Multiset.Entry entry = (Multiset.Entry)multiset.next();
            int i = entry.getCount();
            if (i > 0)
            {
                builder1.put(entry.getElement(), Integer.valueOf(i));
                l += i;
            }
        } while (true);
        if (l == 0L)
        {
            return of();
        } else
        {
            return new ImmutableMultiset(builder1.build(), Ints.saturatedCast(l));
        }
    }

    private static transient ImmutableMultiset copyOfInternal(Object aobj[])
    {
        return copyOf(Arrays.asList(aobj));
    }

    public static ImmutableMultiset of()
    {
        return EmptyImmutableMultiset.INSTANCE;
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
        ArrayList arraylist = new ArrayList(aobj.length + 6);
        Collections.addAll(arraylist, new Object[] {
            obj, obj1, obj2, obj3, obj4, obj5
        });
        Collections.addAll(arraylist, aobj);
        return copyOf(arraylist);
    }

    public static ImmutableMultiset of(Object aobj[])
    {
        return copyOf(Arrays.asList(aobj));
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        int j = objectinputstream.readInt();
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        long l = 0L;
        for (int i = 0; i < j; i++)
        {
            Object obj = objectinputstream.readObject();
            int k = objectinputstream.readInt();
            if (k <= 0)
            {
                throw new InvalidObjectException((new StringBuilder()).append("Invalid count ").append(k).toString());
            }
            builder1.put(obj, Integer.valueOf(k));
            l += k;
        }

        FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder1.build());
        FieldSettersHolder.SIZE_FIELD_SETTER.set(this, Ints.saturatedCast(l));
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        Serialization.writeMultiset(this, objectoutputstream);
    }

    public int add(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    public int count(Object obj)
    {
        obj = (Integer)map.get(obj);
        if (obj == null)
        {
            return 0;
        } else
        {
            return ((Integer) (obj)).intValue();
        }
    }

    public Set elementSet()
    {
        return map.keySet();
    }

    public Set entrySet()
    {
        ImmutableSet immutableset = entrySet;
        Object obj = immutableset;
        if (immutableset == null)
        {
            obj = new EntrySet(this);
            entrySet = ((ImmutableSet) (obj));
        }
        return ((Set) (obj));
    }

    public boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj instanceof Multiset)
        {
            obj = (Multiset)obj;
            if (size() != ((Multiset) (obj)).size())
            {
                return false;
            }
            obj = ((Multiset) (obj)).entrySet().iterator();
            Multiset.Entry entry;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                entry = (Multiset.Entry)((Iterator) (obj)).next();
            } while (count(entry.getElement()) == entry.getCount());
            break; /* Loop/switch isn't completed */
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    boolean isPartialView()
    {
        return map.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            Object element;
            int remaining;
            final ImmutableMultiset this$0;
            final Iterator val$mapIterator;

            public boolean hasNext()
            {
                return remaining > 0 || mapIterator.hasNext();
            }

            public Object next()
            {
                if (remaining <= 0)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)mapIterator.next();
                    element = entry.getKey();
                    remaining = ((Integer)entry.getValue()).intValue();
                }
                remaining = remaining - 1;
                return element;
            }

            
            {
                this$0 = ImmutableMultiset.this;
                mapIterator = iterator1;
                super();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int remove(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public int setCount(Object obj, int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(Object obj, int i, int j)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return size;
    }

    public String toString()
    {
        return entrySet().toString();
    }

    Object writeReplace()
    {
        return this;
    }

}
