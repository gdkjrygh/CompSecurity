// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.common:
//            Preconditions, Objects

public class Iterables
{

    public Iterables()
    {
    }

    public static Object aggregate(Iterable iterable, Object obj, Func2 func2)
    {
        Preconditions.checkNotNull(iterable);
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            obj = func2.call(obj, iterable.next());
        }

        return obj;
    }

    public static Object aggregate(Iterable iterable, Func2 func2)
    {
        Iterator iterator;
        Preconditions.checkNotNull(iterable);
        iterator = iterable.iterator();
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Iterable iterable1 = null;
_L4:
        return iterable1;
_L2:
        iterable = ((Iterable) (iterator.next()));
        do
        {
            iterable1 = iterable;
            if (!iterator.hasNext())
            {
                continue;
            }
            iterable = ((Iterable) (func2.call(iterable, iterator.next())));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean contains(Iterable iterable, Func1 func1)
    {
        return firstOrDefault(iterable, func1, null) != null;
    }

    public static boolean equals(Iterable iterable, Iterable iterable1)
    {
        return equals(iterable, iterable1, new Func2() {

            public Boolean call(Object obj, Object obj1)
            {
                return Boolean.valueOf(Objects.equals(obj, obj1));
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call(obj, obj1);
            }

        });
    }

    public static boolean equals(Iterable iterable, Iterable iterable1, Func2 func2)
    {
        boolean flag = true;
        if (iterable == null || iterable1 == null)
        {
            if (iterable == iterable1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        iterable = iterable.iterator();
        for (iterable1 = iterable1.iterator(); iterable.hasNext() && iterable1.hasNext();)
        {
            if (!((Boolean)func2.call(iterable.next(), iterable1.next())).booleanValue())
            {
                return false;
            }
        }

        if (iterable.hasNext() || iterable1.hasNext())
        {
            flag = false;
        }
        return flag;
    }

    public static Object firstOrDefault(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(iterable.iterator().hasNext());
        return iterable.iterator().next();
    }

    public static Object firstOrDefault(Iterable iterable, Object obj)
    {
        return Iterators.getNext(iterable.iterator(), obj);
    }

    public static Object firstOrDefault(Iterable iterable, Func1 func1, Object obj)
    {
        Preconditions.checkNotNull(iterable);
        Iterator iterator = iterable.iterator();
        do
        {
            iterable = ((Iterable) (obj));
            if (!iterator.hasNext())
            {
                break;
            }
            iterable = ((Iterable) (iterator.next()));
        } while (!((Boolean)func1.call(iterable)).booleanValue());
        return iterable;
    }

    public static Object get(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List)
        {
            return ((List)iterable).get(i);
        } else
        {
            return Iterators.get(iterable.iterator(), i);
        }
    }

    public static Object last(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(iterable.iterator().hasNext());
        Iterator iterator = iterable.iterator();
        for (iterable = null; iterator.hasNext(); iterable = ((Iterable) (iterator.next()))) { }
        return iterable;
    }

    public static List repeat(Iterable iterable, int i)
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); arraylist.add(iterator.next())) { }
        for (int j = 0; j < i; j++)
        {
            for (Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); arraylist.add(iterator1.next())) { }
        }

        return arraylist;
    }

    public static List select(Iterable iterable, Func1 func1)
    {
        Preconditions.checkNotNull(iterable);
        iterable = iterable.iterator();
        ArrayList arraylist = new ArrayList();
        for (; iterable.hasNext(); arraylist.add(func1.call(iterable.next()))) { }
        return arraylist;
    }

    public static List skip(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        iterable = iterable.iterator();
        ArrayList arraylist = new ArrayList();
        for (; i > 0 && iterable.hasNext(); i--)
        {
            iterable.next();
        }

        for (; iterable.hasNext(); arraylist.add(iterable.next())) { }
        return arraylist;
    }

    public static List take(Iterable iterable, int i)
    {
        Preconditions.checkNotNull(iterable);
        iterable = iterable.iterator();
        ArrayList arraylist = new ArrayList();
        for (; i > 0 && iterable.hasNext(); i--)
        {
            arraylist.add(iterable.next());
        }

        return arraylist;
    }

    public static List takeWhile(Iterable iterable, Func1 func1)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(func1);
        ArrayList arraylist = new ArrayList();
        iterable = iterable.iterator();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (((Boolean)func1.call(obj)).booleanValue())
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    public static List where(Iterable iterable, Func1 func1)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(func1);
        iterable = iterable.iterator();
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!iterable.hasNext())
            {
                break;
            }
            Object obj = iterable.next();
            if (((Boolean)func1.call(obj)).booleanValue())
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    public static List zip(Iterable iterable, Iterable iterable1, Func2 func2)
    {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(iterable1);
        iterable = iterable.iterator();
        iterable1 = iterable1.iterator();
        ArrayList arraylist = new ArrayList();
        for (; iterable.hasNext() && iterable1.hasNext(); arraylist.add(func2.call(iterable.next(), iterable1.next()))) { }
        return arraylist;
    }

    private class Iterators
    {

        static int advance(Iterator iterator, int i)
        {
            int j = 0;
            Preconditions.checkNotNull(iterator);
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "numberToAdvance must be nonnegative");
            for (; j < i && iterator.hasNext(); j++)
            {
                iterator.next();
            }

            return j;
        }

        static void checkNonnegative(int i)
        {
            if (i < 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must not be negative").toString());
            } else
            {
                return;
            }
        }

        static Object get(Iterator iterator, int i)
        {
            checkNonnegative(i);
            int j = advance(iterator, i);
            if (!iterator.hasNext())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("position (").append(i).append(") must be less than the number of elements that remained (").append(j).append(")").toString());
            } else
            {
                return iterator.next();
            }
        }

        static Object getNext(Iterator iterator, Object obj)
        {
            if (iterator.hasNext())
            {
                obj = iterator.next();
            }
            return obj;
        }

        Iterators()
        {
        }
    }

}
