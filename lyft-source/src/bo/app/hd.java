// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            he, hh, hg, ff, 
//            ib, hi, hf, fh, 
//            fg, fe, ic

public final class hd
{

    static final ic a = new he();
    private static final Iterator b = new hh();

    public static ib a()
    {
        return a;
    }

    public static ib a(Object obj)
    {
        return new hg(obj);
    }

    public static ib a(Iterator iterator)
    {
        ff.a(iterator);
        if (iterator instanceof ib)
        {
            return (ib)iterator;
        } else
        {
            return new hi(iterator);
        }
    }

    public static transient ib a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static ic a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ff.a(flag);
        ff.a(i, i + j, aobj.length);
        ff.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new hf(j, k, aobj, i);
        }
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = fh.a(obj);
        ff.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((fg) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (fe.a(iterator.next(), iterator1.next()));
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

}
