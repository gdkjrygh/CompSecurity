// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.a;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.fitbit.util.ap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            e

public class g extends e
{
    public static class a
    {

        public float a;
        public float b;
        public int c;
        public int d;
        private PointF e;
        private PointF f;

        static PointF a(a a1)
        {
            return a1.e;
        }

        static PointF b(a a1)
        {
            return a1.f;
        }

        public a()
        {
            e = new PointF();
            f = new PointF();
        }
    }


    private a k;
    private int l;

    public g()
    {
        l = Color.parseColor("#004D63");
    }

    private Paint a(int i, android.graphics.Paint.Style style)
    {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(style);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeWidth(ap.b(2.0F));
        return paint;
    }

    private Path a(float f, float f1, float f2)
    {
        Path path = new Path();
        path.reset();
        path.addCircle(f1, f2, f, android.graphics.Path.Direction.CW);
        path.close();
        return path;
    }

    public void a(a a1)
    {
        k = a1;
    }

    public void b(m m1)
    {
        if (m1.b != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (((List) (obj = m1.b.I())).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List) (obj)).iterator();
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (j)((Iterator) (obj)).next();
        } while (((j) (obj1)).o() == null);
        if (((j) (obj1)).o().getBounds().height() == 0)
        {
            PointF pointf = new PointF();
            m1.a(((j) (obj1)).a(), ((j) (obj1)).a(0), pointf);
            obj1 = m1.k.e().B();
            m1.a.drawPath(a(ap.b(7F), pointf.x, pointf.y), a(-1, android.graphics.Paint.Style.FILL));
            m1.a.drawPath(a(ap.b(5F), pointf.x, pointf.y), a(l, android.graphics.Paint.Style.FILL));
            Path path = new Path();
            path.reset();
            path.moveTo(pointf.x, pointf.y - ap.b(12F));
            path.lineTo(pointf.x, ((RectF) (obj1)).top);
            path.close();
            m1.a.drawPath(path, a(-1, android.graphics.Paint.Style.FILL_AND_STROKE));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void c(m m1)
    {
        if (k != null)
        {
            m1.a(0.0D, k.a, com.fitbit.ui.charts.a.a(k));
            m1.a(0.0D, k.b, a.b(k));
            m1 = new ComposeShader(new LinearGradient(0.0F, com.fitbit.ui.charts.a.a(k).y, 0.0F, a.b(k).y, k.c, k.d, android.graphics.Shader.TileMode.CLAMP), (LinearGradient)com.fitbit.util.chart.a.a(m1.a, 0xff000000, m1), android.graphics.PorterDuff.Mode.DST_IN);
            k().setShader(m1);
        }
    }
}
