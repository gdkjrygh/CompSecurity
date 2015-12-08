// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.base.d;
import com.google.common.base.k;
import com.google.common.base.p;
import com.google.common.base.q;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            bm, bp, bo, ej, 
//            bq, bn, br, bs, 
//            ek, dx

public final class bl
{

    static final ek a = new bm();
    private static final Iterator b = new bp();

    public static ej a()
    {
        return a;
    }

    public static ej a(Object obj)
    {
        return new bo(obj);
    }

    public static ej a(Iterator iterator)
    {
        p.a(iterator);
        if (iterator instanceof ej)
        {
            return (ej)iterator;
        } else
        {
            return new bq(iterator);
        }
    }

    public static transient ej a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static ek a(Object aobj[], int i, int j, int l)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(i, i + j, aobj.length);
        p.b(l, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new bn(j, l, aobj, i);
        }
    }

    public static Iterator a(Iterator iterator, d d1)
    {
        p.a(d1);
        return new br(iterator, d1);
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        p.a(collection);
        p.a(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = Predicates.a(obj);
        p.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((q) (obj)).apply(iterator.next())) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            flag = true;
        }
        return flag;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public static boolean a(Iterator iterator, Collection collection)
    {
        collection = Predicates.a(collection);
        p.a(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (collection.apply(iterator.next()))
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
        } while (k.a(iterator.next(), iterator1.next()));
        return false;
    }

    public static Object b(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("expected one element but was: <")).append(obj).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            stringbuilder.append((new StringBuilder(", ")).append(iterator.next()).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    static Iterator b()
    {
        return b;
    }

    public static Object c(Iterator iterator)
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        } else
        {
            return null;
        }
    }

    static void d(Iterator iterator)
    {
        p.a(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static dx e(Iterator iterator)
    {
        if (iterator instanceof bs)
        {
            return (bs)iterator;
        } else
        {
            return new bs(iterator);
        }
    }

}
