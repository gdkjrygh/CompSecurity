// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            f, h, ChartSeries, l, 
//            t

public static final class nit> extends f
{

    final boolean a(int i)
    {
        return (i & 0x20) == 32 || (i & 0x10) == 16;
    }

    protected final List b()
    {
        ArrayList arraylist1 = c();
        ArrayList arraylist;
        if (arraylist1.size() == 1)
        {
            arraylist = ((ChartSeries)arraylist1.get(0)).F().a;
        } else
        {
            arraylist = arraylist1;
            if (arraylist1.size() <= 0)
            {
                return super.b();
            }
        }
        return arraylist;
    }

    public tSeries()
    {
        this(((t) (h.a)));
    }

    public <init>(t t)
    {
        super(t);
    }
}
