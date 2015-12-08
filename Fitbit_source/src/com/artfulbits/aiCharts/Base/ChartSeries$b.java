// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartSeries, j, q, k

public static final class c extends Drawable
{

    private final k a;
    private int b;
    private int c;

    public final void draw(Canvas canvas)
    {
        ChartSeries chartseries = null;
        if (!(a instanceof j)) goto _L2; else goto _L1
_L1:
        chartseries = ((j)a).c();
_L4:
        if (chartseries != null)
        {
            chartseries.H().a(canvas, getBounds(), a);
        }
        return;
_L2:
        if (a instanceof ChartSeries)
        {
            chartseries = (ChartSeries)a;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final int getIntrinsicHeight()
    {
        return c;
    }

    public final int getIntrinsicWidth()
    {
        return b;
    }

    public final int getOpacity()
    {
        return 0;
    }

    public final void setAlpha(int i)
    {
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
    }

    public (k k)
    {
        this(k, 10, 10);
    }

    public <init>(k k, int i, int l)
    {
        if (k == null)
        {
            throw new IllegalArgumentException("attributes");
        } else
        {
            a = k;
            b = i;
            c = l;
            return;
        }
    }
}
