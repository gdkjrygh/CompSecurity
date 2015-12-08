// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.m;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            ChartPieType

public class f extends ChartPieType
{

    public static final d h = d.a("doughnut-inner_radius", com/artfulbits/aiCharts/Types/f, java/lang/Float, Float.valueOf(0.2F));
    private float q;

    public f()
    {
        q = 0.0F;
    }

    protected void a(RectF rectf, float f1, float f2, Path path, Path path1)
    {
        if (q == 0.0F)
        {
            super.a(rectf, f1, f2, path, path1);
        } else
        {
            float f3 = 0.5F * (1.0F - q);
            float f4 = rectf.width();
            float f5 = rectf.height();
            if (path1 != null)
            {
                path1.reset();
                path1.arcTo(rectf, f1, f2, true);
            }
            path.reset();
            path.arcTo(rectf, f1, f2, true);
            rectf.inset(f4 * f3, f3 * f5);
            path.arcTo(rectf, f1 + f2, -f2);
            path.close();
            if (path1 != null)
            {
                path1.arcTo(rectf, f1, f2, true);
                return;
            }
        }
    }

    public void a(m m1)
    {
        q = ((Float)m1.b.a(h)).floatValue();
        super.a(m1);
    }

}
