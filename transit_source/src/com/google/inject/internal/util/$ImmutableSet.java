// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection, $Collections2, $Lists, $Hashing, 
//            $UnmodifiableIterator, $Iterators, $ObjectArrays, $Preconditions, 
//            $AbstractIterator

public abstract class $ImmutableSet extends $ImmutableCollection
    implements Set
{
    static abstract class ArrayImmutableSet extends $ImmutableSet
    {

        final Object elements[];

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

        public boolean isEmpty()
        {
            return false;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.forArray(elements);
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
            Object aobj1[] = $ObjectArrays.newArray(aobj, i);
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

    public static class Builder
    {

        final ArrayList contents = $Lists.newArrayList();

        public Builder add(Object obj)
        {
            $Preconditions.checkNotNull(obj, "element cannot be null");
            contents.add(obj);
            return this;
        }

        public transient Builder add(Object aobj[])
        {
            $Preconditions.checkNotNull(((Object) (aobj)), "elements cannot be null");
            aobj = Arrays.asList(aobj);
            $Preconditions.checkContentsNotNull(((Iterable) (aobj)), "elements cannot contain null");
            contents.addAll(((Collection) (aobj)));
            return this;
        }

        public Builder addAll(Iterable iterable)
        {
            if (iterable instanceof Collection)
            {
                Collection collection = (Collection)iterable;
                contents.ensureCapacity(contents.size() + collection.size());
            }
            Object obj;
            for (iterable = iterable.iterator(); iterable.hasNext(); contents.add(obj))
            {
                obj = iterable.next();
                $Preconditions.checkNotNull(obj, "elements contains a null");
            }

            return this;
        }

        public Builder addAll(Iterator iterator1)
        {
            Object obj;
            for (; iterator1.hasNext(); contents.add(obj))
            {
                obj = iterator1.next();
                $Preconditions.checkNotNull(obj, "element cannot be null");
            }

            return this;
        }

        public $ImmutableSet build()
        {
            return $ImmutableSet.copyOf(contents);
        }

        public Builder()
        {
        }
    }

    private static final class EmptyImmutableSet extends $ImmutableSet
    {

        private static final Object EMPTY_ARRAY[] = new Object[0];

        public boolean contains(Object obj)
        {
            return false;
        }

        public boolean containsAll(Collection collection)
        {
            return collection.isEmpty();
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Set)
            {
                return ((Set)obj).isEmpty();
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return 0;
        }

        public boolean isEmpty()
        {
            return true;
        }

        boolean isHashCodeFast()
        {
            return true;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.emptyIterator();
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

        public String toString()
        {
            return "[]";
        }


        private EmptyImmutableSet()
        {
        }

    }

    private static final class RegularImmutableSet extends ArrayImmutableSet
    {

        final int hashCode;
        final int mask;
        final Object table[];

        public boolean contains(Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int i = $Hashing.smear(obj.hashCode());
            do
            {
                Object obj1 = table[mask & i];
                if (obj1 == null)
                {
                    continue;
                }
                if (obj1.equals(obj))
                {
                    return true;
                }
                i++;
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        public int hashCode()
        {
            return hashCode;
        }

        boolean isHashCodeFast()
        {
            return true;
        }

        RegularImmutableSet(Object aobj[], int i, Object aobj1[], int j)
        {
            super(aobj);
            table = aobj1;
            mask = j;
            hashCode = i;
        }
    }

    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object elements[];

        Object readResolve()
        {
            return $ImmutableSet.of(elements);
        }

        SerializedForm(Object aobj[])
        {
            elements = aobj;
        }
    }

    private static final class SingletonImmutableSet extends $ImmutableSet
    {

        final Object element;
        final int hashCode;

        public boolean contains(Object obj)
        {
            return element.equals(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof Set)
                {
                    if (((Set) (obj = (Set)obj)).size() != 1 || !element.equals(((Set) (obj)).iterator().next()))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

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

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.singletonIterator(element);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return 1;
        }

        public Object[] toArray()
        {
            return (new Object[] {
                element
            });
        }

        public Object[] toArray(Object aobj[])
        {
            if (aobj.length != 0) goto _L2; else goto _L1
_L1:
            Object aobj1[] = $ObjectArrays.newArray(aobj, 1);
_L4:
            aobj1[0] = element;
            return aobj1;
_L2:
            aobj1 = aobj;
            if (aobj.length > 1)
            {
                aobj[1] = null;
                aobj1 = aobj;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public String toString()
        {
            String s = element.toString();
            return (new StringBuilder(s.length() + 2)).append('[').append(s).append(']').toString();
        }

        SingletonImmutableSet(Object obj, int i)
        {
            element = obj;
            hashCode = i;
        }
    }

    static abstract class TransformedImmutableSet extends $ImmutableSet
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

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.unmodifiableIterator(new $AbstractIterator() {

                int index;
                final TransformedImmutableSet this$0;

                protected Object computeNext()
                {
                    if (index < source.length)
                    {
                        TransformedImmutableSet transformedimmutableset = TransformedImmutableSet.this;
                        Object aobj[] = source;
                        int i = index;
                        index = i + 1;
                        return transformedimmutableset.transform(aobj[i]);
                    } else
                    {
                        return endOfData();
                    }
                }

            
            {
                this$0 = TransformedImmutableSet.this;
                super();
                index = 0;
            }
            });
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
            Object aobj1[] = $ObjectArrays.newArray(aobj, i);
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


    private static final $ImmutableSet EMPTY_IMMUTABLE_SET = new EmptyImmutableSet();

    $ImmutableSet()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static $ImmutableSet copyOf(Iterable iterable)
    {
        if (iterable instanceof $ImmutableSet)
        {
            return ($ImmutableSet)iterable;
        } else
        {
            return copyOfInternal($Collections2.toCollection(iterable));
        }
    }

    public static $ImmutableSet copyOf(Iterator iterator1)
    {
        return copyOfInternal($Lists.newArrayList(iterator1));
    }

    private static $ImmutableSet copyOfInternal(Collection collection)
    {
        switch (collection.size())
        {
        default:
            return create(collection, collection.size());

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(collection.iterator().next());
        }
    }

    private static $ImmutableSet create(Iterable iterable, int i)
    {
        int j = $Hashing.chooseTableSize(i);
        Object aobj[] = new Object[j];
        int l = j - 1;
        ArrayList arraylist = new ArrayList(i);
        i = 0;
        iterable = iterable.iterator();
label0:
        do
        {
            if (iterable.hasNext())
            {
                Object obj = iterable.next();
                int i1 = obj.hashCode();
                int k = $Hashing.smear(i1);
                do
                {
                    int j1 = k & l;
                    Object obj1 = aobj[j1];
                    if (obj1 == null)
                    {
                        aobj[j1] = obj;
                        arraylist.add(obj);
                        i += i1;
                        continue label0;
                    }
                    if (obj1.equals(obj))
                    {
                        continue label0;
                    }
                    k++;
                } while (true);
            }
            if (arraylist.size() == 1)
            {
                return new SingletonImmutableSet(arraylist.get(0), i);
            }
            return new RegularImmutableSet(arraylist.toArray(), i, aobj, l);
        } while (true);
    }

    public static $ImmutableSet of()
    {
        return EMPTY_IMMUTABLE_SET;
    }

    public static $ImmutableSet of(Object obj)
    {
        return new SingletonImmutableSet(obj, obj.hashCode());
    }

    public static transient $ImmutableSet of(Object aobj[])
    {
        switch (aobj.length)
        {
        default:
            return create(Arrays.asList(aobj), aobj.length);

        case 0: // '\0'
            return of();

        case 1: // '\001'
            return of(aobj[0]);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if ((obj instanceof $ImmutableSet) && isHashCodeFast() && (($ImmutableSet)obj).isHashCodeFast() && hashCode() != obj.hashCode())
        {
            return false;
        } else
        {
            return $Collections2.setEquals(this, obj);
        }
    }

    public int hashCode()
    {
        int i = 0;
        for (Iterator iterator1 = iterator(); iterator1.hasNext();)
        {
            i += iterator1.next().hashCode();
        }

        return i;
    }

    boolean isHashCodeFast()
    {
        return false;
    }

    public abstract $UnmodifiableIterator iterator();

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "[]";
        }
        $UnmodifiableIterator $unmodifiableiterator = iterator();
        StringBuilder stringbuilder = new StringBuilder(size() * 16);
        stringbuilder.append('[').append($unmodifiableiterator.next().toString());
        for (int i = 1; i < size(); i++)
        {
            stringbuilder.append(", ").append($unmodifiableiterator.next().toString());
        }

        return stringbuilder.append(']').toString();
    }

    Object writeReplace()
    {
        return new SerializedForm(toArray());
    }

}
