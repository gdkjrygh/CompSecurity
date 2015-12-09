// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Types.v;
import com.fitbit.util.ap;
import java.util.List;

public class b extends v
{

    private static final float j = 0.9F;
    private static final float k = 0.6F;
    private static final int l = (int)Math.ceil(ap.b(0.65F));

    public b()
    {
    }

    public void a(m m1)
    {
        float f = m1.a(0.0D, 0.0D).y;
        Paint paint = new Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setColor(m1.b.g());
        List list = m1.b.I();
        int i1 = list.size();
        if (i1 > 1)
        {
            double d = m1.e.a().f();
            double d1 = m1.e.a().g();
            int i = a(list, d, d1, 0, i1 - 1);
            int k1 = b(list, d, d1, i, i1 - 1);
            Object obj = m1.a(((j)list.get(0)).a(), 0.0D, ((j)list.get(1)).a(), 0.0D);
            float f1 = (((RectF) (obj)).right - ((RectF) (obj)).left) * 0.9F;
            float f2 = f1 / 2.0F;
            float f4 = (((RectF) (obj)).right - ((RectF) (obj)).left) * 0.6F;
            float f3 = f4 / 2.0F;
            paint.setStrokeWidth(f4);
            obj = m1.a;
            while (i <= k1) 
            {
                float f5;
                float f7;
                j j1;
                PointF pointf;
                boolean flag;
                if (i == i1 - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j1 = (j)list.get(i);
                pointf = m1.a(j1.a(), j1.a(0));
                f5 = pointf.x;
                f7 = pointf.y;
                if (Math.abs(j1.a(0)) > 0.0001D)
                {
                    float f6 = f - f3;
                    f7 = Math.min(f7 + f3, f6);
                    paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                    if (flag)
                    {
                        paint.setShader(null);
                        paint.setColor(-1);
                    }
                    ((Canvas) (obj)).drawRect(f5 + f3, f7, (f5 + f1) - f3, f6, paint);
                } else
                {
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                    ((Canvas) (obj)).drawCircle(f5 + f2, f - (float)l, l, paint);
                }
                i++;
            }
        }
    }

}
