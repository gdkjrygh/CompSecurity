// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

// Referenced classes of package bo.app:
//            gz, hc, hb, fa, 
//            hw, hd, ha, fc, 
//            fb, ez, hx

public final class gy
{

    static final hx a = new gz();
    private static final Iterator b = new hc();

    public static hw a()
    {
        return a;
    }

    public static hw a(Object obj)
    {
        return new hb(obj);
    }

    public static hw a(Iterator iterator)
    {
        fa.a(iterator);
        if (iterator instanceof hw)
        {
            return (hw)iterator;
        } else
        {
            return new hd(iterator);
        }
    }

    public static transient hw a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static hx a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fa.a(flag);
        fa.a(i, i + j, aobj.length);
        fa.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new ha(j, k, aobj, i);
        }
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = fc.a(obj);
        fa.a(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((fb) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (ez.a(iterator.next(), iterator1.next()));
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
