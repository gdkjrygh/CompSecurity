// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import com.artfulbits.aiCharts.Base.j;
import java.util.Comparator;

// Referenced classes of package com.fitbit.heartrate.charts:
//            a

static final class 
    implements Comparator
{

    public int a(j j1, j j2)
    {
        return Double.compare(j1.a(0), j2.a(0));
    }

    public int compare(Object obj, Object obj1)
    {
        return a((j)obj, (j)obj1);
    }

    ()
    {
    }
}
