// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import com.fitbit.util.bn;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class pe extends Filter
{

    final pe a;

    public List a(List list, pe pe)
    {
        ArrayList arraylist;
        GregorianCalendar gregoriancalendar;
        ArrayList arraylist1;
        ArrayList arraylist2;
        int i;
        arraylist = new ArrayList();
        gregoriancalendar = new GregorianCalendar(bn.b());
        if (list.size() > 0)
        {
            o.d(gregoriancalendar);
        }
        i = list.size() - 1;
        arraylist1 = new ArrayList();
        arraylist2 = new ArrayList();
        if (i < 0) goto _L2; else goto _L1
_L1:
        j j1;
        ArrayList arraylist3;
        j1 = (j)list.get(i);
        arraylist3 = new ArrayList();
_L5:
        if (j1.a() < (double)gregoriancalendar.getTimeInMillis())
        {
            break MISSING_BLOCK_LABEL_206;
        }
        arraylist3.add(j1);
        i--;
        if (i >= 0) goto _L4; else goto _L3
_L3:
        int k = i;
_L6:
        if (arraylist3.size() > 0)
        {
            arraylist1.add(arraylist3);
            arraylist2.add(gregoriancalendar.getTime());
        }
        gregoriancalendar.add(3, -1);
        i = k;
        if (k >= 0) goto _L1; else goto _L2
_L2:
        return Filter.a(a, pe, arraylist, arraylist1, arraylist2);
_L4:
        j1 = (j)list.get(i);
          goto _L5
        k = i;
          goto _L6
    }

    pe(pe pe, pe pe1)
    {
        a = pe1;
        super(pe);
    }
}
