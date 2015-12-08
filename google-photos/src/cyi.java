// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cyi
    implements cyf
{

    public cyi()
    {
    }

    private static long a(cte cte1, int i, int j, long l)
    {
        int k = i + j;
        if (k < cte1.a.length)
        {
            return cte1.a[k] - cte1.a[i];
        } else
        {
            return (long)j * l;
        }
    }

    public final List a(List list, cte cte1, List list1, cyq cyq1)
    {
        if (list1 == null)
        {
            cte1 = new ArrayList();
            for (list = list.iterator(); list.hasNext(); cte1.add(Long.valueOf(((csd)list.next()).b))) { }
            return cte1;
        }
        c.a(list1, "miniThemes", "miniThemeTypes cannot be null for FunFactoryBeatMatcher");
        Iterator iterator = list1.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = ((cyo)iterator.next()).a() + i) { }
        c.a(i, "totalClipsInMiniThemes", list.size(), "Total clips in mini themes should equal the number of clip constraints.");
        long l = cyq1.c;
        if (cte1.a.length >= 2)
        {
            i = cte1.a.length;
            l = (long)((float)(cte1.a[i - 1] - cte1.a[0]) / (float)(cte1.a.length - 1));
        }
        list = new ArrayList();
        i = 0;
        for (int j = 0; j < list1.size(); j++)
        {
            cyq1 = (cyo)list1.get(j);
            boolean flag;
            int k;
            long l1;
            if (j == list1.size() - 1 && cyq1 != cyj.R || j < list1.size() - 1 && list1.get(j + 1) == cyj.Q)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = a(cte1, i, cyq1.b(), l);
            i = cyq1.b() + i;
            k = 0;
            while (k < cyq1.a()) 
            {
                long l2 = (long)(cyq1.a(k) * (double)l1);
                if (flag && k == cyq1.a() - 1)
                {
                    long l3 = a(cte1, i, 1, l);
                    i++;
                    list.add(Long.valueOf(l2 + l3));
                } else
                {
                    list.add(Long.valueOf(l2));
                }
                k++;
            }
        }

        return list;
    }

    static 
    {
        cyi.getSimpleName();
    }
}
