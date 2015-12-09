// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ab;
import com.google.a.a.ad;
import com.google.a.a.ae;
import com.google.a.a.af;
import com.google.a.a.t;
import com.google.a.a.w;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            bm, bp, bo, di, 
//            bq, br, bn, bs, 
//            z, dj

public final class bl
{

    static final dj a = new bm();
    private static final Iterator b = new bp();

    public static di a()
    {
        return a;
    }

    public static di a(Object obj)
    {
        return new bo(obj);
    }

    public static di a(Iterator iterator)
    {
        ad.a(iterator);
        if (iterator instanceof di)
        {
            return (di)iterator;
        } else
        {
            return new bq(iterator);
        }
    }

    public static di a(Iterator iterator, ae ae1)
    {
        ad.a(iterator);
        ad.a(ae1);
        return new br(iterator, ae1);
    }

    public static transient di a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static dj a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.a(flag);
        ad.a(i, i + j, aobj.length);
        ad.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new bn(j, k, aobj, i);
        }
    }

    public static Iterator a(Iterator iterator, t t)
    {
        ad.a(t);
        return new bs(iterator, t);
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        ad.a(collection);
        ad.a(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        return b(iterator, af.a(obj));
    }

    public static boolean a(Iterator iterator, Collection collection)
    {
        collection = af.a(collection);
        ad.a(collection);
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
        } while (ab.a(iterator.next(), iterator1.next()));
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

    public static boolean b(Iterator iterator, ae ae1)
    {
        return d(iterator, ae1) != -1;
    }

    public static String c(Iterator iterator)
    {
        return z.a.a(new StringBuilder("["), iterator).append(']').toString();
    }

    public static boolean c(Iterator iterator, ae ae1)
    {
        ad.a(ae1);
        while (iterator.hasNext()) 
        {
            if (!ae1.apply(iterator.next()))
            {
                return false;
            }
        }
        return true;
    }

    public static int d(Iterator iterator, ae ae1)
    {
        ad.a(ae1, "predicate");
        for (int i = 0; iterator.hasNext(); i++)
        {
            if (ae1.apply(iterator.next()))
            {
                return i;
            }
        }

        return -1;
    }

    public static Object d(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        obj = String.valueOf(String.valueOf(obj));
        stringbuilder.append((new StringBuilder(((String) (obj)).length() + 31)).append("expected one element but was: <").append(((String) (obj))).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            String s = String.valueOf(String.valueOf(iterator.next()));
            stringbuilder.append((new StringBuilder(s.length() + 2)).append(", ").append(s).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    public static Object e(Iterator iterator)
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        } else
        {
            return null;
        }
    }

    static void f(Iterator iterator)
    {
        ad.a(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

}
