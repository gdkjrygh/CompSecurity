// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class col
{

    final List a = new ArrayList();
    boolean b;
    List c;

    col(List list, Map map)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            cnq cnq1 = (cnq)list.next();
            if (cnq1.d == cnt.a || cnq1.d == cnt.c)
            {
                cnz cnz1 = (cnz)map.get(cnq1.e);
                if (cnz1 != null)
                {
                    a.add(new com(cnq1, cnz1.b()));
                }
            }
        } while (true);
    }

    final cok a(int i, int j)
    {
label0:
        {
            if (a.isEmpty())
            {
                return new cok(i, j, i, j);
            }
            Iterator iterator;
            int k;
            int l;
            boolean flag;
            if (i < j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
            iterator = a.iterator();
            l = 0;
            k = 0;
            while (iterator.hasNext()) 
            {
                com com1 = (com)iterator.next();
                int i1;
                if (com1.a < com1.b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag == b && com1.a * com1.b > k * l)
                {
                    l = com1.a;
                    k = com1.b;
                } else
                {
                    int j1 = k;
                    k = l;
                    l = j1;
                }
                i1 = l;
                l = k;
                k = i1;
            }
            if (k >= l)
            {
                i1 = k;
                k = l;
                l = i1;
            }
            if (l != 0)
            {
                i1 = k;
                if (k != 0)
                {
                    break label0;
                }
            }
            i1 = j;
            l = i;
        }
        return new cok(i, j, l, i1);
    }

    void a()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = a.iterator();
        long l1 = 0L;
        long l = 0L;
        while (iterator.hasNext()) 
        {
            com com1 = (com)iterator.next();
            if (com1.a < com1.b)
            {
                arraylist.add(com1);
                l = com1.c + l;
            } else
            {
                arraylist1.add(com1);
                l1 = com1.c + l1;
            }
        }
        boolean flag;
        if ((float)l / (float)(l1 + l) > 0.55F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (!b)
        {
            arraylist = arraylist1;
        }
        c = arraylist;
    }
}
