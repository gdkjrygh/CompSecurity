// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartSeries, j

static final class  extends Vector
{

    final void a(Comparator comparator)
    {
        Arrays.sort(elementData, 0, elementCount, comparator);
    }

    final void a(List list)
    {
        elementCount = list.size();
        if (elementData.length < elementCount)
        {
            elementData = new j[elementCount];
        }
        for (int i = elementCount - 1; i >= 0; i--)
        {
            elementData[i] = list.get(i);
        }

    }

    ()
    {
    }
}
