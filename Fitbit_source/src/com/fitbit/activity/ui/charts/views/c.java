// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.charts.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.v;
import com.fitbit.util.ap;
import com.fitbit.util.chart.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c extends v
{

    public static d j = d.a("show-star", com/fitbit/activity/ui/charts/views/c, java/lang/Boolean, Boolean.valueOf(false));
    public static d k = d.a("column-fill-ratio", com/fitbit/activity/ui/charts/views/c, java/lang/Float, Float.valueOf(0.8F));
    public static d l = d.a("with-popup", com/fitbit/activity/ui/charts/views/c, java/lang/Boolean, Boolean.valueOf(false));
    private static final int m = (int)ap.b(40F);
    private static final int n;
    private static final int o;
    private static final int p = (int)Math.ceil(ap.b(1.5F));
    private static final float q = (float)Math.ceil(ap.b(1.0F));
    private static final float r = 3F;
    private static final float s[] = {
        0.0F, 0.95F, 1.0F
    };
    private Shader A;
    private int B;
    private Shader C;
    private HashMap D;
    private HashMap E;
    private final Paint F;
    private final Paint G;
    private final Paint H;
    private final Bitmap t;
    private final Bitmap u;
    private final boolean v;
    private final boolean w;
    private RectF x;
    private Matrix y;
    private int z;

    public c(Context context, boolean flag)
    {
        this(context, flag, -1, false);
    }

    public c(Context context, boolean flag, int i, boolean flag1)
    {
        x = new RectF();
        y = new Matrix();
        D = new HashMap();
        E = new HashMap();
        v = flag;
        w = flag1;
        t = BitmapFactory.decodeResource(context.getResources(), 0x7f0202aa);
        u = BitmapFactory.decodeResource(context.getResources(), 0x7f0202ab).extractAlpha();
        F = new Paint(1);
        F.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        F.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        F.setStrokeWidth(n);
        G = new Paint();
        G.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        G.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        G.setStrokeWidth(n);
        G.setColor(i);
        H = new Paint();
        H.setStyle(android.graphics.Paint.Style.FILL);
    }

    private static Bitmap a(Map map, Bitmap bitmap, float f)
    {
        Integer integer = Integer.valueOf((int)((float)bitmap.getHeight() * f));
        if (integer.intValue() <= 0)
        {
            integer = Integer.valueOf(1);
        }
        Bitmap bitmap2 = (Bitmap)map.get(integer);
        Bitmap bitmap1 = bitmap2;
        if (bitmap2 == null)
        {
            bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), integer.intValue());
            map.put(integer, bitmap1);
        }
        return bitmap1;
    }

    private Shader a(int i)
    {
        if (A == null || z != i)
        {
            z = i;
            int i1 = com.fitbit.util.chart.a.a(i, 3F);
            float f = m;
            float af[] = s;
            android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
            A = new LinearGradient(0.0F, 0.0F, f, 0.0F, new int[] {
                i1, i1, i
            }, af, tilemode);
        }
        return A;
    }

    private Shader b(int i)
    {
        if (C == null || B != i)
        {
            B = i;
            i = com.fitbit.util.chart.a.a(i, 3F);
            float f = m;
            float af[] = s;
            android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
            C = new LinearGradient(0.0F, 0.0F, f, 0.0F, new int[] {
                i, i, -1
            }, af, tilemode);
        }
        return C;
    }

    public void a(m m1)
    {
        float f;
        float f1;
        Object obj;
        f = m1.a(0.0D, 0.0D).y;
        int i = m1.b.g();
        double d1;
        double d2;
        float f2;
        float f6;
        List list;
        j j1;
        PointF pointf;
        int i1;
        int k1;
        if (v)
        {
            F.setShader(a(m1.b.g()));
            H.setShader(b(i));
        } else
        {
            F.setColor(i);
            H.setColor(-1);
        }
        list = m1.b.I();
        i1 = list.size();
        if (i1 <= 1) goto _L2; else goto _L1
_L1:
        d1 = m1.e.a().f();
        d2 = m1.e.a().g();
        i = a(list, d1, d2, 0, i1 - 1);
        k1 = b(list, d1, d2, i, i1 - 1);
        obj = m1.a(((j)list.get(0)).a(), 0.0D, ((j)list.get(1)).a(), 0.0D);
        f1 = ((RectF) (obj)).right;
        f2 = ((RectF) (obj)).left;
        f1 = (((Float)m1.b.a(k)).floatValue() * (f1 - f2)) / 2.0F;
        obj = m1.a;
_L4:
        while (i <= k1) 
        {
            float f3;
            float f4;
            float f5;
            float f7;
            float f8;
            boolean flag;
            boolean flag1;
            if (i == i1 - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j1 = (j)list.get(i);
            flag1 = ((Boolean)j1.a(l)).booleanValue();
            pointf = m1.a(j1.a(), j1.a(0));
            f5 = pointf.x;
            f6 = pointf.y;
            f3 = (f5 - f1) + (float)o;
            f4 = (f5 + f1) - (float)o;
            f7 -= o;
            f8 = f - (float)o;
            if (Math.abs(j1.a(0)) > 0.01D)
            {
                if (flag || flag1)
                {
                    G.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    ((Canvas) (obj)).drawRect(f3, f7, f4, f8, G);
                } else
                {
                    F.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    ((Canvas) (obj)).drawRect(f3, f7, f4, f8, F);
                }
            } else
            {
                float f9 = f5 - f1;
                float f10 = f5 + f1;
                if (flag || flag1)
                {
                    G.setStyle(android.graphics.Paint.Style.FILL);
                    if (w)
                    {
                        ((Canvas) (obj)).drawRect(f9, f, f10, f - q, G);
                    } else
                    {
                        ((Canvas) (obj)).drawCircle(f5, f - (float)p, p, G);
                    }
                } else
                {
                    F.setStyle(android.graphics.Paint.Style.FILL);
                    if (w)
                    {
                        ((Canvas) (obj)).drawRect(f9, f, f10, f - q, F);
                    } else
                    {
                        ((Canvas) (obj)).drawCircle(f5, f - (float)p, p, F);
                    }
                }
            }
            f5 = (f4 - f3) + f7;
            if (((Boolean)j1.a(j)).booleanValue())
            {
                x.set(f3, f7, f4, f5);
                F.setStyle(android.graphics.Paint.Style.FILL);
                f4 = (Math.min(f, f5) - x.top) / (f4 - f3);
                if (flag || flag1)
                {
                    if (f > f5)
                    {
                        ((Canvas) (obj)).drawBitmap(t, null, x, null);
                    } else
                    {
                        Bitmap bitmap = a(((Map) (E)), t, f4);
                        x.bottom = Math.min(f, f5);
                        ((Canvas) (obj)).drawBitmap(bitmap, null, x, H);
                    }
                } else
                {
                    Shader shader = H.getShader();
                    if (shader != null)
                    {
                        y.reset();
                        y.postTranslate((float)(-m1.g.left) - f3, 0.0F);
                        shader.setLocalMatrix(y);
                    }
                    if (f > f5)
                    {
                        ((Canvas) (obj)).drawBitmap(u, null, x, H);
                    } else
                    {
                        Bitmap bitmap1 = a(((Map) (D)), u, f4);
                        x.bottom = Math.min(f, f5);
                        ((Canvas) (obj)).drawBitmap(bitmap1, null, x, H);
                    }
                }
            }
            i++;
        }
_L2:
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        n = (int)Math.ceil(ap.b(3F));
        o = (int)Math.ceil(n / 2);
    }
}
