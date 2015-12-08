// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, RegularImmutableList, SingletonImmutableList, Collections2, 
//            Lists, EmptyImmutableList, UnmodifiableIterator, UnmodifiableListIterator

public abstract class ImmutableList extends ImmutableCollection
    implements List, RandomAccess
{
    public static final class Builder extends ImmutableCollection.Builder
    {

        private final ArrayList contents = Lists.newArrayList();

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

        public ImmutableList build()
        {
            return ImmutableList.copyOf(contents);
        }

        public Builder()
        {
        }
    }

    private static class ReverseImmutableList extends ImmutableList
    {

        private final transient ImmutableList forwardList;
        private final transient int size;

        private int reverseIndex(int i)
        {
            return size - 1 - i;
        }

        private int reversePosition(int i)
        {
            return size - i;
        }

        public boolean contains(Object obj)
        {
            return forwardList.contains(obj);
        }

        public boolean containsAll(Collection collection)
        {
            return forwardList.containsAll(collection);
        }

        public Object get(int i)
        {
            Preconditions.checkElementIndex(i, size);
            return forwardList.get(reverseIndex(i));
        }

        public int indexOf(Object obj)
        {
            int i = forwardList.lastIndexOf(obj);
            if (i >= 0)
            {
                return reverseIndex(i);
            } else
            {
                return -1;
            }
        }

        public boolean isEmpty()
        {
            return forwardList.isEmpty();
        }

        boolean isPartialView()
        {
            return forwardList.isPartialView();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int lastIndexOf(Object obj)
        {
            int i = forwardList.indexOf(obj);
            if (i >= 0)
            {
                return reverseIndex(i);
            } else
            {
                return -1;
            }
        }

        public UnmodifiableListIterator listIterator(int i)
        {
            Preconditions.checkPositionIndex(i, size);
            return forwardList.listIterator(reversePosition(i)). new UnmodifiableListIterator() {

                final ReverseImmutableList this$0;
                final UnmodifiableListIterator val$forward;

                public boolean hasNext()
                {
                    return forward.hasPrevious();
                }

                public boolean hasPrevious()
                {
                    return forward.hasNext();
                }

                public Object next()
                {
                    return forward.previous();
                }

                public int nextIndex()
                {
                    return reverseIndex(forward.previousIndex());
                }

                public Object previous()
                {
                    return forward.next();
                }

                public int previousIndex()
                {
                    return reverseIndex(forward.nextIndex());
                }

            
            {
                this$0 = final_reverseimmutablelist;
                forward = UnmodifiableListIterator.this;
                super();
            }
            };
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
            return forwardList;
        }

        public int size()
        {
            return size;
        }

        public ImmutableList subList(int i, int j)
        {
            Preconditions.checkPositionIndexes(i, j, size);
            return forwardList.subList(reversePosition(j), reversePosition(i)).reverse();
        }

        public volatile List subList(int i, int j)
        {
            return subList(i, j);
        }


        ReverseImmutableList(ImmutableList immutablelist)
        {
            forwardList = immutablelist;
            size = immutablelist.size();
        }
    }

    private static class SerializedForm
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


    ImmutableList()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static Object checkElementNotNull(Object obj, int i)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append("at index ").append(i).toString());
        } else
        {
            return obj;
        }
    }

    private static transient ImmutableList construct(Object aobj[])
    {
        for (int i = 0; i < aobj.length; i++)
        {
            checkElementNotNull(aobj[i], i);
        }

        return new RegularImmutableList(aobj);
    }

    private static ImmutableList copyFromCollection(Collection collection)
    {
        collection = ((Collection) (collection.toArray()));
        switch (collection.length)
        {
        default:
            return construct(collection);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(collection[0]);
        }
    }

    public static ImmutableList copyOf(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection)
        {
            return copyOf(Collections2.cast(iterable));
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
                collection = copyFromCollection(immutablelist);
            }
            return collection;
        } else
        {
            return copyFromCollection(collection);
        }
    }

    public static ImmutableList copyOf(Iterator iterator1)
    {
        return copyFromCollection(Lists.newArrayList(iterator1));
    }

    public static ImmutableList copyOf(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return construct((Object[])((Object []) (aobj)).clone());

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return new SingletonImmutableList(aobj[0]);
        }
    }

    public static ImmutableList of()
    {
        return EmptyImmutableList.INSTANCE;
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

    public static ImmutableList of(Object aobj[])
    {
        return copyOf(aobj);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws InvalidObjectException
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

    public ImmutableList asList()
    {
        return this;
    }

    public boolean equals(Object obj)
    {
        return Lists.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return Lists.hashCodeImpl(this);
    }

    public abstract int indexOf(Object obj);

    public UnmodifiableIterator iterator()
    {
        return listIterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public abstract int lastIndexOf(Object obj);

    public UnmodifiableListIterator listIterator()
    {
        return listIterator(0);
    }

    public abstract UnmodifiableListIterator listIterator(int i);

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
        return new ReverseImmutableList(this);
    }

    public final Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableList subList(int i, int j);

    public volatile List subList(int i, int j)
    {
        return subList(i, j);
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }
}
