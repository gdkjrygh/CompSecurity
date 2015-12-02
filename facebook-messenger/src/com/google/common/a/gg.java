// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.a:
//            gh, gl, gk, mh, 
//            gm, go, gi, gj, 
//            gp, gn, gq, jr

public final class gg
{

    static final mh a = new gh();
    private static final Iterator b = new gl();

    private gg()
    {
    }

    public static mh a()
    {
        return a;
    }

    public static mh a(Object obj)
    {
        return new gk(obj);
    }

    public static mh a(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        if (iterator instanceof mh)
        {
            return (mh)iterator;
        } else
        {
            return new gm(iterator);
        }
    }

    public static mh a(Iterator iterator, Predicate predicate)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(predicate);
        return new go(iterator, predicate);
    }

    public static transient mh a(Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        return new gi(aobj.length, aobj);
    }

    static mh a(Object aobj[], int i, int j)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkPositionIndexes(i, i + j, aobj.length);
        return new gj(j, aobj, i);
    }

    public static Object a(Iterator iterator, Predicate predicate, Object obj)
    {
        iterator = a(iterator, predicate);
        if (iterator.hasNext())
        {
            obj = iterator.next();
        }
        return obj;
    }

    public static Iterator a(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(function);
        return new gp(iterator, function);
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        Preconditions.checkNotNull(collection);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
label0:
        {
            if (obj == null)
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (iterator.next() != null);
                return true;
            }
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (!obj.equals(iterator.next()));
            return true;
        }
        return false;
    }

    public static boolean a(Iterator iterator, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (collection.contains(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static boolean a(Iterator iterator, Iterator iterator1)
    {
        do
        {
            if (iterator.hasNext())
            {
                if (iterator1.hasNext())
                {
                    continue;
                }
            } else
            if (!iterator1.hasNext())
            {
                return true;
            }
            return false;
        } while (Objects.equal(iterator.next(), iterator1.next()));
        return false;
    }

    public static int b(Iterator iterator)
    {
        int i;
        for (i = 0; iterator.hasNext(); i++)
        {
            iterator.next();
        }

        return i;
    }

    static Iterator b()
    {
        return b;
    }

    public static Iterator b(Iterator iterator, Iterator iterator1)
    {
        Preconditions.checkNotNull(iterator);
        Preconditions.checkNotNull(iterator1);
        return e(Arrays.asList(new Iterator[] {
            iterator, iterator1
        }).iterator());
    }

    public static boolean b(Iterator iterator, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!collection.contains(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static String c(Iterator iterator)
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

    public static Object d(Iterator iterator)
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
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    public static Iterator e(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        return new gn(iterator);
    }

    static void f(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static jr g(Iterator iterator)
    {
        if (iterator instanceof gq)
        {
            return (gq)iterator;
        } else
        {
            return new gq(iterator);
        }
    }

}
