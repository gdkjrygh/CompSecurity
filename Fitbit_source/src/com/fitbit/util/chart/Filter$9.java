// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

static final class pe extends Filter
{

    public List a(List list, pe pe)
    {
        pe = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            j j1 = (j)list.next();
            if (j1.a(0) > 0.01D)
            {
                pe.add(new j(j1));
            }
        } while (true);
        return pe;
    }

    pe(pe pe)
    {
        super(pe);
    }
}
