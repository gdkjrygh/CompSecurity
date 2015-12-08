// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $ObjectArrays, $UnmodifiableIterator

public abstract class $ImmutableCollection
    implements Collection, Serializable
{
    private static class ArrayImmutableCollection extends $ImmutableCollection
    {

        private final Object elements[];

        public boolean isEmpty()
        {
            return false;
        }

        public $UnmodifiableIterator iterator()
        {
            return new $UnmodifiableIterator() {

                int i;
                final ArrayImmutableCollection this$0;

                public boolean hasNext()
                {
                    return i < elements.length;
                }

                public Object next()
                {
                    if (!hasNext())
                    {
                        throw new NoSuchElementException();
                    } else
                    {
                        Object aobj[] = elements;
                        int j = i;
                        i = j + 1;
                        return aobj[j];
                    }
                }

            
            {
                this$0 = ArrayImmutableCollection.this;
                super();
                i = 0;
            }
            };
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

    private static class EmptyImmutableCollection extends $ImmutableCollection
    {

        public boolean contains(Object obj)
        {
            return false;
        }

        public boolean isEmpty()
        {
            return true;
        }

        public $UnmodifiableIterator iterator()
        {
            return $ImmutableCollection.EMPTY_ITERATOR;
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
            return $ImmutableCollection.EMPTY_ARRAY;
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
                return $ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
            } else
            {
                return new ArrayImmutableCollection((Object[])((Object []) (elements)).clone());
            }
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }


    private static final Object EMPTY_ARRAY[] = new Object[0];
    static final $ImmutableCollection EMPTY_IMMUTABLE_COLLECTION = new EmptyImmutableCollection();
    private static final $UnmodifiableIterator EMPTY_ITERATOR = new $UnmodifiableIterator() {

        public boolean hasNext()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

    };

    $ImmutableCollection()
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

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj)
    {
        if (obj != null)
        {
            Iterator iterator1 = iterator();
            while (iterator1.hasNext()) 
            {
                if (iterator1.next().equals(obj))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public abstract $UnmodifiableIterator iterator();

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
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = $ObjectArrays.newArray(aobj, i);
_L4:
        i = 0;
        for (aobj = iterator(); ((Iterator) (aobj)).hasNext();)
        {
            aobj1[i] = ((Iterator) (aobj)).next();
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

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 16);
        stringbuilder.append('[');
        $UnmodifiableIterator $unmodifiableiterator = iterator();
        if ($unmodifiableiterator.hasNext())
        {
            stringbuilder.append($unmodifiableiterator.next());
        }
        for (; $unmodifiableiterator.hasNext(); stringbuilder.append($unmodifiableiterator.next()))
        {
            stringbuilder.append(", ");
        }

        return stringbuilder.append(']').toString();
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }



}
