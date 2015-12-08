// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class cuv
{

    public static Iterable a(Iterable iterable, ctv ctv)
    {
        ctz.a(iterable);
        ctz.a(ctv);
        return new cul(iterable, ctv) {

            private Iterable a;
            private ctv b;

            public final Iterator iterator()
            {
                return cuw.a(a.iterator(), b);
            }

            
            {
                a = iterable;
                b = ctv;
                super();
            }
        };
    }

    public static Object a(Iterable iterable)
    {
        return cuw.c(iterable.iterator());
    }

    public static boolean a(Iterable iterable, cua cua1)
    {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List))
        {
            return a((List)iterable, (cua)ctz.a(cua1));
        } else
        {
            return cuw.a(iterable.iterator(), cua1);
        }
    }

    private static boolean a(List list, cua cua1)
    {
        int i;
        int j;
        boolean flag;
        flag = false;
        i = 0;
        j = 0;
_L2:
        Object obj;
        int k;
        if (j >= list.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = list.get(j);
        k = i;
        if (cua1.a(obj))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (j <= i)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        list.set(i, obj);
        k = i + 1;
        j++;
        i = k;
        if (true) goto _L2; else goto _L1
        UnsupportedOperationException unsupportedoperationexception;
        unsupportedoperationexception;
        for (int l = list.size() - 1; l > j; l--)
        {
            if (cua1.a(list.get(l)))
            {
                list.remove(l);
            }
        }

        for (j--; j >= i; j--)
        {
            list.remove(j);
        }

        flag = true;
_L4:
        return flag;
_L1:
        list.subList(i, list.size()).clear();
        if (j != i)
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Iterable b(Iterable iterable, cua cua1)
    {
        ctz.a(iterable);
        ctz.a(cua1);
        return new cul(iterable, cua1) {

            private Iterable a;
            private cua b;

            public final Iterator iterator()
            {
                return cuw.b(a.iterator(), b);
            }

            
            {
                a = iterable;
                b = cua1;
                super();
            }
        };
    }

    public static Collection b(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return (Collection)iterable;
        } else
        {
            return Lists.a(iterable.iterator());
        }
    }

    public static Iterable c(Iterable iterable)
    {
        ctz.a(iterable);
        return new cul(iterable) {

            private Iterable a;

            public final Iterator iterator()
            {
                return cuw.d(new cvf(a.iterator()) {

                    final Object a(Object obj)
                    {
                        return ((Iterable)obj).iterator();
                    }

                });
            }

            
            {
                a = iterable;
                super();
            }
        };
    }

    public static Object d(Iterable iterable)
    {
        return cuw.e(iterable.iterator());
    }

    public static boolean e(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return ((Collection)iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }
}
