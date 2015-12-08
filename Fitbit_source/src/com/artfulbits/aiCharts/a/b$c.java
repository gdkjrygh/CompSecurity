// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.a;

import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.p;

// Referenced classes of package com.artfulbits.aiCharts.a:
//            b

static final class b extends b
{

    private String a;
    private int b;

    protected final void a(e e1, PointF pointf)
    {
        e1 = (ChartSeries)e1.c().a(a);
        if (b >= 0 && e1 != null && e1.F().size() > b)
        {
            j j1 = e1.F().a(b);
            int i = e1.G().b;
            p.a(e1).a(j1.a(), j1.a(i), pointf);
        }
    }

    public (String s, int i)
    {
        a = s;
        b = i;
    }
}
