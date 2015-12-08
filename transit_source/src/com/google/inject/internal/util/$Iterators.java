// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $Preconditions, $UnmodifiableIterator, $Function

public final class $Iterators
{

    static final Iterator EMPTY_ITERATOR = new $UnmodifiableIterator() {

        public boolean hasNext()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

    };
    private static final ListIterator EMPTY_LIST_ITERATOR = new ListIterator() {

        public void add(Object obj)
        {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext()
        {
            return false;
        }

        public boolean hasPrevious()
        {
            return false;
        }

        public Object next()
        {
            throw new NoSuchElementException();
        }

        public int nextIndex()
        {
            return 0;
        }

        public Object previous()
        {
            throw new NoSuchElementException();
        }

        public int previousIndex()
        {
            return -1;
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj)
        {
            throw new UnsupportedOperationException();
        }

    };

    private $Iterators()
    {
    }

    public static Enumeration asEnumeration(Iterator iterator)
    {
        $Preconditions.checkNotNull(iterator);
        return new Enumeration(iterator) {

            final Iterator val$iterator;

            public boolean hasMoreElements()
            {
                return iterator.hasNext();
            }

            public Object nextElement()
            {
                return iterator.next();
            }

            
            {
                iterator = iterator1;
                super();
            }
        };
    }

    public static Iterator concat(Iterator iterator)
    {
        $Preconditions.checkNotNull(iterator);
        return new Iterator(iterator) {

            Iterator current;
            Iterator removeFrom;
            final Iterator val$inputs;

            public boolean hasNext()
            {
                for (; !current.hasNext() && inputs.hasNext(); current = (Iterator)inputs.next()) { }
                return current.hasNext();
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    removeFrom = current;
                    return current.next();
                }
            }

            public void remove()
            {
                boolean flag;
                if (removeFrom != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $Preconditions.checkState(flag, "no calls to next() since last call to remove()");
                removeFrom.remove();
                removeFrom = null;
            }

            
            {
                inputs = iterator;
                super();
                current = $Iterators.emptyIterator();
            }
        };
    }

    public static $UnmodifiableIterator emptyIterator()
    {
        return ($UnmodifiableIterator)EMPTY_ITERATOR;
    }

    public static ListIterator emptyListIterator()
    {
        return EMPTY_LIST_ITERATOR;
    }

    public static transient $UnmodifiableIterator forArray(Object aobj[])
    {
        return new $UnmodifiableIterator(aobj) {

            int i;
            final int length;
            final Object val$array[];

            public boolean hasNext()
            {
                return i < length;
            }

            public Object next()
            {
                Object obj;
                try
                {
                    obj = array[i];
                    i = i + 1;
                }
                catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
                {
                    throw new NoSuchElementException();
                }
                return obj;
            }

            
            {
                array = aobj;
                super();
                length = array.length;
                i = 0;
            }
        };
    }

    public static $UnmodifiableIterator forArray(Object aobj[], int i, int j)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag);
        j = i + j;
        $Preconditions.checkPositionIndexes(i, j, aobj.length);
        return new $UnmodifiableIterator(i, j, aobj) {

            int i;
            final Object val$array[];
            final int val$end;
            final int val$offset;

            public boolean hasNext()
            {
                return i < end;
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    Object aobj1[] = array;
                    int k = i;
                    i = k + 1;
                    return aobj1[k];
                }
            }

            
            {
                offset = j;
                end = k;
                array = aobj;
                super();
                i = offset;
            }
        };
    }

    public static Object getOnlyElement(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder()).append("expected one element but was: <").append(obj).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            stringbuilder.append((new StringBuilder()).append(", ").append(iterator.next()).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append(">");
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    public static $UnmodifiableIterator singletonIterator(Object obj)
    {
        return new $UnmodifiableIterator(obj) {

            boolean done;
            final Object val$value;

            public boolean hasNext()
            {
                return !done;
            }

            public Object next()
            {
                if (done)
                {
                    throw new NoSuchElementException();
                } else
                {
                    done = true;
                    return value;
                }
            }

            
            {
                value = obj;
                super();
            }
        };
    }

    public static String toString(Iterator iterator)
    {
        if (!iterator.hasNext())
        {
            return "[]";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append('[').append(iterator.next());
        for (; iterator.hasNext(); stringbuilder.append(", ").append(iterator.next())) { }
        return stringbuilder.append(']').toString();
    }

    public static Iterator transform(Iterator iterator, $Function $function)
    {
        $Preconditions.checkNotNull(iterator);
        $Preconditions.checkNotNull($function);
        return new Iterator(iterator, $function) {

            final Iterator val$fromIterator;
            final $Function val$function;

            public boolean hasNext()
            {
                return fromIterator.hasNext();
            }

            public Object next()
            {
                Object obj = fromIterator.next();
                return function.apply(obj);
            }

            public void remove()
            {
                fromIterator.remove();
            }

            
            {
                fromIterator = iterator;
                function = $function;
                super();
            }
        };
    }

    public static $UnmodifiableIterator unmodifiableIterator(Iterator iterator)
    {
        $Preconditions.checkNotNull(iterator);
        return new $UnmodifiableIterator(iterator) {

            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                return iterator.next();
            }

            
            {
                iterator = iterator1;
                super();
            }
        };
    }

}
