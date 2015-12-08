// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class pe extends Filter
{

    final pe a;

    public List a(List list, pe pe)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.b());
        o.g(gregoriancalendar);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Object obj = new ArrayList();
        Object obj1 = new Date(gregoriancalendar.getTimeInMillis());
        int i = list.size() - 1;
        while (i >= 0) 
        {
            Object obj2 = (j)list.get(i);
            boolean flag;
            if ((long)((j) (obj2)).a() >= ((Date) (obj1)).getTime())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ((List) (obj)).add(obj2);
                i--;
                obj2 = obj1;
                obj1 = obj;
                obj = obj2;
            } else
            {
                if (((List) (obj)).size() > 0)
                {
                    arraylist.add(obj);
                    arraylist1.add(obj1);
                }
                obj1 = new ArrayList();
                gregoriancalendar.add(2, -1);
                gregoriancalendar.set(5, 1);
                obj = new Date(gregoriancalendar.getTimeInMillis());
            }
            obj2 = obj1;
            obj1 = obj;
            obj = obj2;
        }
        if (((List) (obj)).size() > 0)
        {
            arraylist.add(obj);
            arraylist1.add(obj1);
        }
        list = new ArrayList();
        return Filter.a(a, pe, list, arraylist, arraylist1);
    }

    pe(pe pe, pe pe1)
    {
        a = pe1;
        super(pe);
    }
}
