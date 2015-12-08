// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class bws
    implements blg
{

    private static final String c = bws.getSimpleName();
    final HashMap a = new HashMap();
    public final bwu b;
    private final PriorityQueue d = new PriorityQueue();

    public bws(bwu bwu1)
    {
        b = (bwu)b.a(bwu1, "storage", null);
    }

    void a()
    {
        HashSet hashset = new HashSet();
        String s;
        int i;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); hashset.add((new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(",").append(i).toString()))
        {
            bwt bwt1 = (bwt)iterator.next();
            s = String.valueOf(bwt1.a);
            i = bwt1.b;
        }

        b.a(hashset);
    }

    void a(cqc cqc1)
    {
        bwt bwt1 = (bwt)a.get(cqc1);
        if (bwt1 != null)
        {
            d.remove(bwt1);
            a.remove(cqc1);
        }
    }

    public void a(cqc cqc1, int i)
    {
        bwt bwt1 = (bwt)a.get(cqc1);
        if (bwt1 == null)
        {
            bwt1 = new bwt(cqc1);
            a.put(cqc1, bwt1);
            cqc1 = bwt1;
        } else
        {
            c.a(d.remove(bwt1), "found");
            cqc1 = bwt1;
        }
        cqc1.b = ((bwt) (cqc1)).b + i;
        d.add(cqc1);
        a();
    }

    public void a(Set set)
    {
        bwt bwt1;
        for (set = set.iterator(); set.hasNext(); d.add(bwt1))
        {
            String as[] = ((String)set.next()).split(",");
            c.a(as.length, "splitValue.length", 2, null);
            bwt1 = new bwt(cqc.a(as[0], false));
            bwt1.b = Integer.parseInt(as[1]);
            a(bwt1.a);
            a.put(bwt1.a, bwt1);
        }

    }

    public final cqc[] a(int i, cst cst1)
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        do
        {
            if (arraylist.size() >= 8)
            {
                break;
            }
            bwt bwt1 = (bwt)d.poll();
            if (bwt1 == null)
            {
                break;
            }
            if (cst1.a(bwt1.a) != null)
            {
                if (cst1.a(bwt1.a).h)
                {
                    arraylist.add(bwt1);
                } else
                {
                    arraylist1.add(bwt1);
                }
            }
        } while (true);
        cst1 = new cqc[arraylist.size()];
        i = 0;
        int j;
        do
        {
            j = ((flag) ? 1 : 0);
            if (i >= arraylist.size())
            {
                break;
            }
            bwt bwt2 = (bwt)arraylist.get(i);
            cst1[i] = bwt2.a;
            d.add(bwt2);
            i++;
        } while (true);
        for (; j < arraylist1.size(); j++)
        {
            d.add(arraylist1.get(j));
        }

        return cst1;
    }

    public final void d()
    {
        b.b();
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof bws)) 
        {
            return false;
        }
        return b.e(((bws)obj).a, a);
    }

    public int hashCode()
    {
        return a.hashCode();
    }

}
