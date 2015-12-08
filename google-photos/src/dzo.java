// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

final class dzo
    implements Comparator
{

    private final List a;

    dzo(List list)
    {
        a = list;
    }

    private static int a(List list, ekp ekp1)
    {
        for (int i = 0; i < list.size(); i++)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = ((hpg)ekp1.a(hpg)).a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                hpk hpk1 = (hpk)iterator.next();
                if (hpk1.a())
                {
                    arraylist.add(hpk1.c);
                }
            } while (true);
            if (arraylist.contains(list.get(i)))
            {
                return i;
            }
        }

        return -1;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (ekp)obj;
        obj1 = (ekp)obj1;
        Object obj3 = (hpg)((ekp) (obj)).a(hpg);
        Object obj2 = (hpg)((ekp) (obj1)).a(hpg);
        obj3 = ((hpg) (obj3)).b();
        obj2 = ((hpg) (obj2)).b();
        if (obj3 == null && obj2 == null)
        {
            return 0;
        }
        if (obj3 == null)
        {
            return -1;
        }
        if (obj2 == null)
        {
            return 1;
        } else
        {
            int i = a(a, ((ekp) (obj)));
            int j = a(a, ((ekp) (obj1)));
            return Double.compare(i, j);
        }
    }
}
