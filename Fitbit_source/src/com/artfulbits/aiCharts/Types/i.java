// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.k;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartLineType

public class i extends q
{

    public static final d h;
    private ShapeDrawable i;

    public i()
    {
        i = new ShapeDrawable(new OvalShape());
        i.setIntrinsicHeight(20);
        i.setIntrinsicWidth(20);
    }

    protected void a(Canvas canvas, Rect rect, k k)
    {
        a(canvas, rect, k, e, false);
    }

    public void a(m m1)
    {
    }

    protected void a(m m1, j j1, PointF pointf)
    {
        Paint paint = null;
        int k = 0;
        android.graphics.drawable.Drawable drawable1 = j1.o();
        android.graphics.Point point = j1.p();
        float f = 0.0F;
        String s;
        com.artfulbits.aiCharts.Enums.Alignment alignment;
        com.artfulbits.aiCharts.Enums.Alignment alignment1;
        android.graphics.drawable.Drawable drawable;
        Object obj;
        if (j1.w())
        {
            s = j1.f();
            alignment = j1.r();
            alignment1 = j1.s();
            drawable = j1.j();
            k = j1.k().intValue();
            paint = j1.m();
            f = j1.q().floatValue();
        } else
        {
            drawable = null;
            alignment1 = null;
            alignment = null;
            s = null;
        }
        obj = drawable1;
        if (drawable1 == null)
        {
            i.getPaint().setColor(j1.g());
            obj = i;
        }
        a(m1, pointf, s, alignment, alignment1, drawable, k, paint, ((android.graphics.drawable.Drawable) (obj)), point, f);
    }

    public void b(m m1)
    {
        List list = m1.b.I();
        int i1 = list.size() - 1;
        double d = m1.c.a().f();
        double d1 = m1.c.a().g();
        int l = ((Integer)m1.b.a(h)).intValue();
        PointF pointf = new PointF();
        Path path = new Path();
        int k = a(list, d, d1, 0, i1);
        for (i1 = b(list, d, d1, k, i1); k <= i1; k++)
        {
            a(m1, (j)list.get(k), 0, pointf);
            if (!m1.a(pointf.x, pointf.y))
            {
                continue;
            }
            a(m1, (j)list.get(k), pointf);
            if (m1.m)
            {
                path.reset();
                path.addCircle(pointf.x, pointf.y, l, android.graphics.Path.Direction.CW);
                path.close();
                m1.a(path, m1.g, list.get(k));
            }
        }

    }

    static 
    {
        h = com.artfulbits.aiCharts.Types.ChartLineType.k;
    }
}
