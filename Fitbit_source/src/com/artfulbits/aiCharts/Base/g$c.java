// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import com.artfulbits.aiCharts.Enums.Alignment;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            g, aa, ChartLegend, v

public final class  extends 
{

    private final aa c = new aa();
    private g d;

    public final String a()
    {
        return c.a;
    }

    protected final void a(Canvas canvas, Rect rect)
    {
        c.a(rect.left, rect.top, rect.right, rect.bottom, g.a(d).m());
        c.a(canvas, g.a(d).m());
    }

    protected final void a(Point point)
    {
        aa aa1 = c;
        int i = point.x;
        i = point.y;
        aa1.a(g.a(d).m());
        point.set((int)c.i, (int)c.j);
    }

    public final void a(Alignment alignment, Alignment alignment1)
    {
        c.e = a(alignment, alignment1);
        d.a(false);
    }

    public final void a(String s)
    {
        if (!v.a(c.a, s))
        {
            c.a = s;
            d.a(true);
        }
    }

    public final Alignment b()
    {
        return b(c.e);
    }

    public final Alignment c()
    {
        return c(c.e);
    }

    protected gnment(g g1, String s)
    {
        d = g1;
        super();
        c.a = s;
    }
}
