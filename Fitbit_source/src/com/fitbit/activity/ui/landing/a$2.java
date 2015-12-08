// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.t;
import com.fitbit.ui.charts.n;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            a

class a
    implements t
{

    final double a;
    final a b;

    public j a(Object obj, j j1)
    {
        obj = (n)obj;
        if (j1 != null)
        {
            j1.a(((n) (obj)).a(), a * ((n) (obj)).b());
            return j1;
        } else
        {
            return new j(((n) (obj)).a(), new double[] {
                a * ((n) (obj)).b()
            });
        }
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a(obj, (j)obj1);
    }

    (a a1, double d)
    {
        b = a1;
        a = d;
        super();
    }
}
