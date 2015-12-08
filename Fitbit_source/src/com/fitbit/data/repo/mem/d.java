// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import com.fitbit.data.domain.n;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class d
{
    public static interface a
    {

        public abstract boolean a(Object obj);
    }


    public d()
    {
    }

    public static List a(List list, a a1)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = list.next();
            if (a1.a(obj))
            {
                arraylist.add(obj);
            }
        } while (true);
        return arraylist;
    }

    public static List a(List list, Comparator comparator, int i)
    {
        list = new ArrayList(list);
        Collections.sort(list, comparator);
        comparator = new ArrayList();
        for (int j = 0; j < i && j < list.size(); j++)
        {
            comparator.add(list.get(j));
        }

        return comparator;
    }

    public static List a(List list, Date date)
    {
        ArrayList arraylist = new ArrayList();
        Date date1 = o.a(date);
        date = o.e(date);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            n n1 = (n)list.next();
            Date date2 = n1.getLogDate();
            boolean flag;
            if (date2.equals(date1) || date2.after(date1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && date2.before(date))
            {
                arraylist.add(n1);
            }
        } while (true);
        return arraylist;
    }
}
