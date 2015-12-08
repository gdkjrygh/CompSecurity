// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.views;

import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.v;
import com.fitbit.FitBitApplication;
import com.fitbit.util.ap;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.charts.views:
//            c

public class a extends v
{

    public static d j = com.artfulbits.aiCharts.Base.d.a("near_null_value", com/fitbit/activity/ui/charts/views/c, java/lang/Double, Double.valueOf(0.01D));
    private static final float k = ap.b(40F);
    private static final float l = ap.b(1.0F);
    private static final float m = 3F;
    private static final float n = (float)FitBitApplication.a().getResources().getDimensionPixelSize(0x7f0a006f);
    private static final float o[] = {
        0.0F, 0.95F, 1.0F
    };
    private static final int p;
    private static final int q[];
    private HashMap A;
    private float B;
    private HashMap C;
    private float D;
    private Shader E;
    private float F;
    private float G;
    private Shader H;
    private float I;
    private float J;
    private final Paint r;
    private final int s;
    private final int t;
    private final boolean u;
    private final boolean v;
    private final int w;
    private final int x;
    private final Shader y;
    private int z;

    public a(int i, int i1, boolean flag)
    {
        this(i, i1, flag, false, 0, 0);
    }

    public a(int i, int i1, boolean flag, boolean flag1, int j1, int k1)
    {
        r = new Paint(1);
        y = new LinearGradient(0.0F, 0.0F, k, 0.0F, q, o, android.graphics.Shader.TileMode.CLAMP);
        z = 0;
        A = new HashMap();
        C = new HashMap();
        s = i;
        t = i1;
        u = flag;
        v = flag1;
        w = j1;
        x = k1;
        r.setStyle(android.graphics.Paint.Style.FILL);
        a(n);
    }

    private Shader a(float f, float f1)
    {
        if (Float.compare(D, f) != 0)
        {
            D = f;
            C.clear();
        }
        Shader shader = (Shader)C.get(Float.valueOf(f1));
        Object obj = shader;
        if (shader == null)
        {
            obj = new ComposeShader(y, b(f, f1), android.graphics.PorterDuff.Mode.MULTIPLY);
            C.put(Float.valueOf(f1), obj);
        }
        return ((Shader) (obj));
    }

    private Shader b(float f, float f1)
    {
        if (Float.compare(B, f) != 0)
        {
            B = f;
            A.clear();
        }
        Shader shader = (Shader)A.get(Float.valueOf(f1));
        Object obj = shader;
        if (shader == null)
        {
            obj = new LinearGradient(0.0F, B, 0.0F, f1, s, t, android.graphics.Shader.TileMode.CLAMP);
            A.put(Float.valueOf(f1), obj);
        }
        return ((Shader) (obj));
    }

    private Shader c(float f, float f1)
    {
        if (H == null || Float.compare(I, f) != 0 || Float.compare(J, f1) != 0)
        {
            I = f;
            J = f1;
            H = new ComposeShader(y, d(f, f1), android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        return H;
    }

    private Shader d(float f, float f1)
    {
        if (E == null || Float.compare(F, f) != 0 || Float.compare(G, f1) != 0)
        {
            F = f;
            G = f1;
            E = new LinearGradient(0.0F, F, 0.0F, G, w, x, android.graphics.Shader.TileMode.CLAMP);
        }
        return E;
    }

    public void a(float f)
    {
        BlurMaskFilter blurmaskfilter = new BlurMaskFilter(f, android.graphics.BlurMaskFilter.Blur.NORMAL);
        r.setMaskFilter(blurmaskfilter);
    }

    public void a(int i)
    {
        z = i;
    }

    public void a(m m1)
    {
        float f = m1.a(0.0D, 0.0D).y;
        List list = m1.b.I();
        int i1 = list.size();
        if (i1 > 1)
        {
            double d1 = m1.e.a().f();
            double d2 = m1.e.a().g();
            int i = a(list, d1, d2, 0, i1 - 1);
            int j1 = b(list, d1, d2, i, i1 - 1);
            RectF rectf = m1.a(((j)list.get(0)).a(), 0.0D, ((j)list.get(1)).a(), 0.0D);
            float f1 = rectf.right;
            float f2 = rectf.left;
            f1 = (((Float)m1.b.a(c.k)).floatValue() * (f1 - f2)) / 2.0F;
            d1 = ((Double)m1.b.a(j)).doubleValue();
            Canvas canvas = m1.a;
            while (i <= j1) 
            {
                double d3;
                Object obj;
                boolean flag;
                if (v && i == i1 - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = (j)list.get(i);
                d3 = ((j) (obj)).a(0);
                if (Math.abs(d3) >= d1)
                {
                    obj = m1.a(((j) (obj)).a(), d3);
                    float f3 = ((PointF) (obj)).x;
                    f3 = (float)Math.ceil(z) + f3;
                    float f4 = l + f;
                    float f5 = ((PointF) (obj)).y;
                    if (u)
                    {
                        Paint paint = r;
                        Shader shader;
                        if (flag)
                        {
                            shader = c(f4, f5);
                        } else
                        {
                            shader = a(f4, f5);
                        }
                        paint.setShader(shader);
                    } else
                    {
                        Paint paint1 = r;
                        Shader shader1;
                        if (flag)
                        {
                            shader1 = d(f4, f5);
                        } else
                        {
                            shader1 = b(f4, f5);
                        }
                        paint1.setShader(shader1);
                    }
                    canvas.drawRect(f3 - f1, f4, f3 + f1, f5, r);
                }
                i++;
            }
        }
    }

    static 
    {
        p = com.fitbit.util.chart.a.a(-1, 3F);
        q = (new int[] {
            p, p, Color.argb(255, 255, 255, 255)
        });
    }
}
