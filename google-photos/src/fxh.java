// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fxh
    implements iwj
{

    private final int a;

    public fxh(int i)
    {
        a = i;
    }

    public final Object a(Object obj)
    {
        Object obj1 = (List)obj;
        obj = new ArrayList();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            fwi fwi1 = (fwi)((Iterator) (obj1)).next();
            ((List) (obj)).add(new fwx(fwi1.a));
            List list = fwi1.b;
            boolean flag;
            int i;
            int j;
            if (list.size() > a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = Math.min(list.size(), a);
            i = 0;
            while (i < j) 
            {
                if (flag && i == a - 1)
                {
                    ((List) (obj)).add(new fxv(fwi1.a, (ekp)list.get(i), i, (fwi1.c - (long)a) + 1L));
                } else
                {
                    ((List) (obj)).add(new frj((ekp)list.get(i), i));
                }
                i++;
            }
        }

        return obj;
    }
}
