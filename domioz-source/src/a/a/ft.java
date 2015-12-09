// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

// Referenced classes of package a.a:
//            fu, fx, fw, du, 
//            gs, fy, fv, dw, 
//            dv, dt, gt

public final class ft
{

    static final gt a = new fu();
    private static final Iterator b = new fx();

    public static gs a()
    {
        return a;
    }

    public static gs a(Object obj)
    {
        return new fw(obj);
    }

    public static gs a(Iterator iterator)
    {
        du.a(iterator);
        if (iterator instanceof gs)
        {
            return (gs)iterator;
        } else
        {
            return new fy(iterator);
        }
    }

    public static transient gs a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static gt a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        du.a(flag);
        du.a(i, i + j, aobj.length);
        du.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new fv(j, k, aobj, i);
        }
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = dw.a(obj);
        du.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((dv) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (dt.a(iterator.next(), iterator1.next()));
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
