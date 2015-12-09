// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import com.fitbit.util.bn;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class pe extends Filter
{

    public List a(List list, pe pe)
    {
        ArrayList arraylist = new ArrayList();
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.b());
        GregorianCalendar gregoriancalendar1 = new GregorianCalendar(bn.b());
        int i = 0;
        while (i < list.size()) 
        {
            j j1 = (j)list.get(i);
            gregoriancalendar1.setTimeInMillis((long)j1.a());
            gregoriancalendar1.set(11, 0);
            gregoriancalendar1.set(12, 0);
            gregoriancalendar1.set(13, 0);
            gregoriancalendar1.set(14, 0);
            if (i == 0)
            {
                j1 = new j(gregoriancalendar1.getTimeInMillis(), new double[] {
                    j1.a(0)
                });
                arraylist.add(j1);
                if (pe != null)
                {
                    pe.a(j1);
                }
            } else
            {
                gregoriancalendar.setTimeInMillis((long)((j)arraylist.get(arraylist.size() - 1)).a());
                if (gregoriancalendar.get(1) != gregoriancalendar1.get(1) || gregoriancalendar.get(2) != gregoriancalendar1.get(2) || gregoriancalendar.get(5) != gregoriancalendar1.get(5))
                {
                    j1 = new j(gregoriancalendar1.getTimeInMillis(), new double[] {
                        j1.a(0)
                    });
                    arraylist.add(j1);
                    if (pe != null)
                    {
                        pe.a(j1);
                    }
                }
            }
            i++;
        }
        return arraylist;
    }

    pe(pe pe)
    {
        super(pe);
    }
}
