// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.t;
import com.c.a.a.u;
import com.c.a.a.v;
import java.util.Iterator;

// Referenced classes of package com.c.a.b:
//            x, aa, z, y, 
//            ap, ao

public final class w
{

    static final ap a = new x();
    private static final Iterator b = new aa();

    public static ao a()
    {
        return a;
    }

    public static ao a(Object obj)
    {
        return new z(obj);
    }

    public static transient ao a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static ap a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag);
        u.a(i, i + j, aobj.length);
        u.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new y(j, k, aobj, i);
        }
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = com.c.a.a.w.a(obj);
        if (obj == null)
        {
            throw new NullPointerException(String.valueOf("predicate"));
        }
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!((v) (obj)).a(iterator.next())) goto _L2; else goto _L1
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
        } while (t.a(iterator.next(), iterator1.next()));
        return false;
    }

}
