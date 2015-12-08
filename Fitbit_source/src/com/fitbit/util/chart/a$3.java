// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import com.artfulbits.aiCharts.Base.j;
import java.util.Comparator;

// Referenced classes of package com.fitbit.util.chart:
//            a

static final class se.j
    implements Comparator
{

    public int a(j j1, j j2)
    {
        return Double.compare(j1.a(), j2.a());
    }

    public int compare(Object obj, Object obj1)
    {
        return a((j)obj, (j)obj1);
    }

    se.j()
    {
    }
}
