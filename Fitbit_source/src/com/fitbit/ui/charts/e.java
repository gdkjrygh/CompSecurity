// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.artfulbits.aiCharts.Types.g;
import com.fitbit.util.ap;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            q

public class e extends g
    implements q
{

    private static final float k = ap.b(2.0F);
    private static final double l = 0.5D;
    private final Paint m = new Paint();
    private final Paint n = new Paint();
    private final Path o = new Path();
    private boolean p;
    private float q;
    private float r;
    private m s;

    public e()
    {
        p = true;
        q = 0.0F;
        r = 0.0F;
        m.setColor(0xffff0000);
        m.setStyle(android.graphics.Paint.Style.STROKE);
        m.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        m.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        n.setColor(0xff000000);
        n.setStyle(android.graphics.Paint.Style.STROKE);
        n.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        n.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        a(k);
    }

    private j a(m m1, List list, int i, int i1, double d, int j1)
    {
        Object obj = (j)list.get(i);
        PointF pointf = new PointF();
        m1.a(((j) (obj)).a(), ((j) (obj)).a(j1), pointf);
        double d1 = pointf.x;
        double d2 = pointf.y;
        list = (j)list.get(i1);
        obj = new PointF();
        m1.a(list.a(), list.a(j1), ((PointF) (obj)));
        return new j(((double)((PointF) (obj)).x - d1) * d + d1, new double[] {
            ((double)((PointF) (obj)).y - d2) * d + d2
        });
    }

    private void a(m m1, Canvas canvas, j j1, int i)
    {
        a(canvas, o);
        o.reset();
        canvas = new PointF();
        m1.a(j1.a(), j1.a(i), canvas);
        o.moveTo(((PointF) (canvas)).x, ((PointF) (canvas)).y);
    }

    private boolean a(boolean flag, j j1, j j2, boolean flag1, double d)
    {
        if (flag)
        {
            return !((Boolean)j1.a(ChartLineType.j)).booleanValue() && (!flag1 || Math.abs(j1.a() - j2.a()) <= d);
        } else
        {
            return true;
        }
    }

    public void a(float f)
    {
        if (f > 0.0F)
        {
            m.setStrokeWidth(f);
            n.setStrokeWidth(f / 2.0F);
            a(0.0F, f);
        }
    }

    public void a(float f, float f1)
    {
        q = f;
        r = f1;
    }

    protected void a(Canvas canvas, Path path)
    {
        if (p)
        {
            canvas.translate(q, r);
            canvas.drawPath(path, n);
            canvas.translate(-q, -r);
        }
        canvas.drawPath(path, m);
    }

    public void a(m m1)
    {
        m.setAntiAlias(m1.l.a());
        Object obj1 = m1.b;
        Canvas canvas = m1.a;
        List list = ((ChartSeries) (obj1)).I();
        int i2 = ((ChartSeries) (obj1)).G().b;
        if (list.size() > 0)
        {
            o.reset();
            c(m1);
            int i1 = list.size() - 1;
            double d = m1.e.a().f();
            double d1 = m1.e.a().g();
            int i = a(list, d, d1, 0, i1);
            int k2 = b(list, d, d1, i, i1);
            Object obj = (j)list.get(i);
            PointF pointf = new PointF();
            obj = (j)list.get(i);
            m1.a(((j) (obj)).a(), ((j) (obj)).a(i2), pointf);
            o.moveTo(pointf.x, pointf.y);
            d = ((Double)((ChartSeries) (obj1)).a(ChartLineType.i)).doubleValue();
            obj1 = (com.artfulbits.aiCharts.Types.ChartLineType.BreakMode)((ChartSeries) (obj1)).a(ChartLineType.h);
            boolean flag;
            boolean flag1;
            if (obj1 != com.artfulbits.aiCharts.Types.ChartLineType.BreakMode.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj1 == com.artfulbits.aiCharts.Types.ChartLineType.BreakMode.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (!Double.isInfinite(d) && !Double.isNaN(d))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            while (i <= k2) 
            {
                j j1;
                j j3;
                j j4;
                int k1;
                int l1;
                if (i + 1 < k2)
                {
                    k1 = i + 1;
                } else
                {
                    k1 = i;
                }
                if (i + 2 < k2)
                {
                    l1 = i + 2;
                } else
                {
                    l1 = k1;
                }
                j1 = (j)list.get(i);
                j4 = (j)list.get(k1);
                j3 = a(m1, list, i, k1, 0.5D, i2);
                if (!a(flag, j1, ((j) (obj)), flag1, d))
                {
                    a(m1, canvas, j4, i2);
                } else
                {
                    m1.a(j4.a(), j4.a(i2), pointf);
                    j j2 = new j(pointf.x, new double[] {
                        (double)pointf.y
                    });
                    if (!a(flag, (j)list.get(k1), (j)list.get(i), flag1, d))
                    {
                        a(m1, canvas, j4, i2);
                    } else
                    {
                        obj = a(m1, list, k1, l1, 0.5D, i2);
                        if (!a(flag, (j)list.get(l1), (j)list.get(k1), flag1, d))
                        {
                            obj = j2;
                        }
                        o.cubicTo((float)j3.a(), (float)j3.a(i2), (float)j2.a(), (float)j2.a(i2), (float)((j) (obj)).a(), (float)((j) (obj)).a(i2));
                    }
                }
                i++;
                obj = j1;
            }
            a(canvas, o);
            obj = (j)list.get(k2);
            m1.a(((j) (obj)).a(), ((j) (obj)).a(i2), pointf);
            obj = new Paint(m);
            ((Paint) (obj)).setStyle(android.graphics.Paint.Style.FILL);
            canvas.drawCircle(pointf.x, pointf.y, ((Paint) (obj)).getStrokeWidth() / 2.0F, ((Paint) (obj)));
            s = m1;
        }
    }

    public void a(boolean flag)
    {
        p = flag;
    }

    protected void c(m m1)
    {
    }

    public m j()
    {
        return s;
    }

    public Paint k()
    {
        return m;
    }

    public Paint l()
    {
        return n;
    }

}
