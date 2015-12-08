// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.t;

// Referenced classes of package com.fitbit.util.chart:
//            a

static final class a
    implements t
{

    final double a;

    public j a(Object obj, j j1)
    {
        obj = (Long)obj;
        if (j1 != null)
        {
            j1.a(((Long) (obj)).longValue(), a);
            return j1;
        } else
        {
            return new j(((Long) (obj)).longValue(), new double[] {
                a
            });
        }
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    se.j(double d)
    {
        a = d;
        super();
    }
}
