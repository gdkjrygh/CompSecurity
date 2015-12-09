// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.charts;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.e;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.v;
import com.fitbit.FitBitApplication;
import com.fitbit.util.ap;
import com.fitbit.util.chart.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.ui.charts:
//            q

public class FadeChartStepAreaType extends v
    implements q
{

    private static final double k = 0.80000000000000004D;
    private final int j = (int)((double)ap.b(2.0F) / 1.5D);
    private float l;
    private m m;
    private Canvas n;
    private ShaderMode o;
    private float p;
    private float q;
    private ChartSeries r;

    public FadeChartStepAreaType(ShaderMode shadermode)
    {
        o = shadermode;
    }

    private Path a(j j1, Path path)
    {
        RectF rectf = new RectF();
        path.computeBounds(rectf, true);
        path = m.l.c().iterator();
        double d = 0.0D;
        do
        {
            if (!path.hasNext())
            {
                break;
            }
            j j2 = com.fitbit.util.chart.a.a(((ChartSeries)path.next()).F(), j1.a());
            if (j2 != null)
            {
                double d1 = j2.a(0);
                if (d <= d1)
                {
                    d = d1;
                }
            }
        } while (true);
        j1 = new PointF();
        m.a(0.0D, d, j1);
        float f = ap.b(2.0F);
        j1 = new RectF(rectf.left, ((PointF) (j1)).y + q, rectf.right, rectf.bottom + f);
        path = new Path();
        path.addRoundRect(j1, f, f, android.graphics.Path.Direction.CW);
        return path;
    }

    private void a(double d, j j1, float f, float f1, float f2, Shader shader)
    {
        Path path = new Path();
        PointF pointf = new PointF();
        m.a((j1.a() - (double)(l / 2.0F)) + (double)f, j1.a(0) + d, pointf);
        if (pointf.x > f2)
        {
            return;
        } else
        {
            a(pointf, f1, f2);
            path.moveTo(pointf.x, pointf.y + q);
            m.a((j1.a() + (double)(l / 2.0F)) - (double)f, j1.a(0) + d, pointf);
            a(pointf, f1, f2);
            path.lineTo(pointf.x, pointf.y + q);
            m.a((j1.a() + (double)(l / 2.0F)) - (double)f, d, pointf);
            a(pointf, f1, f2);
            path.lineTo(pointf.x, pointf.y + q);
            m.a((j1.a() - (double)(l / 2.0F)) + (double)f, d, pointf);
            a(pointf, f1, f2);
            path.lineTo(pointf.x, pointf.y + q);
            path.close();
            j1 = a(j1, path);
            a(path, m.g, shader, ((Path) (j1)));
            return;
        }
    }

    private void a(PointF pointf, float f, float f1)
    {
        if (pointf.x > f1)
        {
            pointf.x = f1;
        }
        if (pointf.x < f)
        {
            pointf.x = f;
        }
    }

    private boolean a(double d)
    {
        for (Iterator iterator = m.l.c().iterator(); iterator.hasNext();)
        {
            j j1 = com.fitbit.util.chart.a.a(((ChartSeries)iterator.next()).F(), d);
            if (j1 != null && j1.a(0) != 0.0D)
            {
                return true;
            }
        }

        return false;
    }

    public final void a(Path path, Rect rect, Shader shader, Path path1)
    {
        int i = r.g();
        rect = new Paint();
        rect.setColor(i);
        rect.setAntiAlias(true);
        rect.setStyle(android.graphics.Paint.Style.FILL);
        rect.setShader(shader);
        n.save(2);
        n.clipPath(path1);
        n.drawPath(path, rect);
        n.restore();
    }

    public void a(m m1)
    {
        r = m1.b;
        List list = m1.b.I();
        if (list.size() > 1)
        {
            int i1 = list.size() - 1;
            double d = m1.e.a().f();
            double d1 = m1.e.a().g();
            int i = a(list, d, d1, 0, i1);
            i1 = b(list, d, d1, i, i1);
    /* block-local class not found */
    class ShaderMode {}

            float f;
            float f2;
            PointF pointf;
            j j1;
            if (o.haveBottomPadding)
            {
                d = com.fitbit.heartrate.charts.a.a(list).a(0) / 20D;
            } else
            {
                d = 0.0D;
            }
            pointf = new PointF();
            j1 = (j)list.get(i);
            if (i1 == 0)
            {
                f = 0.0F;
            } else
            {
                f = (float)(((j)list.get(i + 1)).a() - j1.a());
            }
            l = f;
            f2 = (float)((double)l * 0.19999999999999996D) / 2.0F;
            m1.a(0.0D, 0.0D, pointf);
            p = (float)((double)pointf.y - d);
            m = m1;
            n = m1.a;
            if (o.haveBottomPadding)
            {
                f = 0.0F;
            } else
            {
                f = ap.b(1.0F);
            }
            q = f;
            while (i <= i1) 
            {
                Path path = new Path();
                j1 = (j)list.get(i);
                if (o == ShaderMode.b)
                {
                    Shader shader = com.fitbit.util.chart.a.a(r.g(), Color.alpha(-1) / 8, com.fitbit.heartrate.charts.a.a(), n.getWidth());
                    if (!a(j1.a()))
                    {
                        m1.a(j1.a(), d + j1.a(0), pointf);
                        path.addCircle(pointf.x, pointf.y, j, android.graphics.Path.Direction.CCW);
                        path.close();
                        a(path, m.g, shader, path);
                    } else
                    {
                        a(d, j1, f2, 0.0F, n.getWidth(), shader);
                    }
                } else
                {
                    m.a((j1.a() - (double)(l / 2.0F)) + (double)f2, j1.a(0) + d, pointf);
                    float f1 = pointf.y;
                    int l1 = FitBitApplication.a().getResources().getColor(0x7f0f00d7);
                    int k1 = FitBitApplication.a().getResources().getColor(0x7f0f00d8);
                    LinearGradient lineargradient = new LinearGradient(0.0F, p, 0.0F, f1, l1, k1, android.graphics.Shader.TileMode.CLAMP);
                    a(d, j1, f2, (float)n.getWidth() * com.fitbit.heartrate.charts.a.a(), n.getWidth(), ((Shader) (lineargradient)));
                    l1 = com.fitbit.util.chart.a.a(l1, Color.alpha(-1) / 16);
                    lineargradient = new LinearGradient(0.0F, p, 0.0F, f1, l1, k1, android.graphics.Shader.TileMode.CLAMP);
                    a(d, j1, f2, 0.0F, (float)n.getWidth() * com.fitbit.heartrate.charts.a.a(), ((Shader) (lineargradient)));
                }
                i++;
            }
            n = null;
        }
    }

    public m j()
    {
        return m;
    }
}
