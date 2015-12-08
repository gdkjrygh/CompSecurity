// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gy, hb, ha, ez, 
//            hv, hc, gz, fb, 
//            fa, ey, hw

public final class gx
{

    static final hw a = new gy();
    private static final Iterator b = new hb();

    public static hv a()
    {
        return a;
    }

    public static hv a(Object obj)
    {
        return new ha(obj);
    }

    public static hv a(Iterator iterator)
    {
        ez.a(iterator);
        if (iterator instanceof hv)
        {
            return (hv)iterator;
        } else
        {
            return new hc(iterator);
        }
    }

    public static transient hv a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static hw a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ez.a(flag);
        ez.a(i, i + j, aobj.length);
        ez.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new gz(j, k, aobj, i);
        }
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = fb.a(obj);
        ez.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((fa) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (ey.a(iterator.next(), iterator1.next()));
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
