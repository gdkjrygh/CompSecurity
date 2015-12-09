// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.util.ap;

public class b extends Drawable
{

    private final boolean a;
    private final String b;
    private final Paint c;
    private float d;
    private final Paint e;
    private final Path f;
    private final Point g;
    private final Point h;
    private final Point i;

    public b(Timeframe timeframe, String s, boolean flag, Paint paint)
    {
        this(timeframe, s, flag, paint, ap.b(22.5F));
    }

    public b(Timeframe timeframe, String s, boolean flag, Paint paint, float f1)
    {
        f = new Path();
        g = new Point();
        h = new Point();
        i = new Point();
        b = s;
        a = flag;
        d = f1;
        c = paint;
        c.setColor(-1);
        e = new Paint();
        e.setAntiAlias(true);
        e.setStrokeWidth(ap.b(2.0F));
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setColor(-1);
    }

    public void draw(Canvas canvas)
    {
        float f1 = ap.b(3F);
        float f2 = d + f1;
        canvas.drawText(b, -c.measureText(b) + ap.b(3F), -ap.b(5F), c);
        if (a)
        {
            f.reset();
            f.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            int j = (int)(f1 * 3F);
            g.set(-j / 2, (int)(-f2 + f1));
            h.set(0, (int)(((double)(-f2) - (double)(j / 2) * 1.7D) + (double)f1));
            i.set(j / 2, (int)(f1 + -f2));
            f.lineTo(h.x, h.y);
            f.lineTo(i.x, i.y);
            f.lineTo(g.x, g.y);
            f.lineTo(h.x, h.y);
            f.close();
            canvas.drawPath(f, e);
            return;
        } else
        {
            canvas.drawCircle(0.0F, -f2, f1, e);
            return;
        }
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int j)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
