// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import com.artfulbits.aiCharts.Base.j;
import java.util.Comparator;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartFunnelType

final class a
    implements Comparator
{

    private int a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (j)obj;
        obj1 = (j)obj1;
        return -Double.compare(((j) (obj)).a(a), ((j) (obj1)).a(a));
    }

    (ChartFunnelType chartfunneltype, int i)
    {
        a = i;
        super();
    }
}
