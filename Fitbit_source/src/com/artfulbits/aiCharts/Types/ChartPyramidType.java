// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Base.v;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class ChartPyramidType extends q
{
    public static final class Style extends Enum
    {

        public static final Style a;
        public static final Style b;
        private static final Style c[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/artfulbits/aiCharts/Types/ChartPyramidType$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])c.clone();
        }

        static 
        {
            a = new Style("Linear", 0);
            b = new Style("Surface", 1);
            c = (new Style[] {
                a, b
            });
        }

        private Style(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static final d h;
    public static final d i = d.a("pyramid-minimal", com/artfulbits/aiCharts/Types/ChartPyramidType, java/lang/Float, Float.valueOf(0.05F));
    public static final d j = d.a("pyramid-gap_ratio", com/artfulbits/aiCharts/Types/ChartPyramidType, java/lang/Float, Float.valueOf(0.0F));
    private final y k = new y();

    public ChartPyramidType()
    {
    }

    private static double a(double d1, double d2)
    {
        double ad[] = new double[2];
        int i1 = v.a(1.0D, 2D * d1, -d2, ad);
        if (i1 > 0)
        {
            if (i1 > 1)
            {
                return Math.max(ad[0], ad[1]);
            } else
            {
                return ad[0];
            }
        } else
        {
            return 0.0D;
        }
    }

    public void a(m m1)
    {
        int k3 = m1.b.G().b;
        j aj[] = m1.b.F().c();
        Rect rect = m1.g;
        Style style = (Style)m1.b.a(h);
        k.a(m1);
        float f4 = rect.centerX();
        float f5 = rect.height();
        float f6 = 0.5F * (float)rect.width();
        double d5 = ((Float)m1.b.a(j)).floatValue();
        double d6 = ((Float)m1.b.a(i)).floatValue();
        int j3 = 0;
        int i1 = 0;
        if (style == Style.b)
        {
            double d1 = 0.0D;
            float f1 = 0.0F;
            Path path = new Path();
            j3 = aj.length;
            for (int k2 = 0; k2 < j3; k2++)
            {
                d1 += Math.abs(aj[k2].a(k3));
                i1++;
            }

            double d8 = a(0.0D, d1);
            double ad[] = new double[i1];
            double ad1[] = new double[i1];
            double d3 = 0.0D;
            for (int l2 = 0; l2 < i1; l2++)
            {
                double d9 = a(d3, Math.max(d6 * d1, Math.abs(aj[l2].a(k3))));
                ad[l2] = f1;
                ad1[l2] = (double)f1 + d9;
                d3 = (double)f1 + d9;
                f1 = (float)(d9 + d5 * d8 + (double)f1);
            }

            d1 = 1.0D / d3;
            for (int k1 = 0; k1 < aj.length; k1++)
            {
                j j2 = aj[k1];
                float f2 = (float)((double)rect.top + (double)f5 * d1 * ad[k1]);
                float f7 = (float)((double)rect.top + (double)f5 * d1 * ad1[k1]);
                float f9 = (float)((double)f6 * d1 * ad[k1]);
                float f11 = (float)((double)f6 * d1 * ad1[k1]);
                path.moveTo(f4 - f9, f2);
                path.lineTo(f9 + f4, f2);
                path.lineTo(f4 + f11, f7);
                path.lineTo(f4 - f11, f7);
                path.close();
                k.e(path, j2);
                if (m1.m)
                {
                    m1.a(path, rect, j2);
                }
                path.reset();
                if (j2.w() || j2.o() != null)
                {
                    a(m1, j2, new PointF(f4, (f2 + f7) * 0.5F));
                }
            }

        } else
        {
            double d2 = 0.0D;
            float f3 = 0.0F;
            Path path1 = new Path();
            int l3 = aj.length;
            int i3 = 0;
            int l1 = j3;
            for (; i3 < l3; i3++)
            {
                d2 += Math.abs(aj[i3].a(k3));
                l1++;
            }

            double d4 = d6 * d2;
            d2 = 0.0D;
            j3 = aj.length;
            for (i3 = 0; i3 < j3; i3++)
            {
                d2 += Math.max(d4, Math.abs(aj[i3].a(k3)));
            }

            d2 = (1.0D - (double)(l1 - 1) * d5) / d2;
            i3 = aj.length;
            for (int i2 = 0; i2 < i3; i2++)
            {
                j j1 = aj[i2];
                double d7 = Math.max(j1.a(k3), d4) * d2;
                float f8 = (float)rect.top + f5 * f3;
                float f10 = (float)((double)f5 * d7) + f8;
                float f12 = f6 * f3;
                float f13 = (float)((double)f6 * ((double)f3 + d7));
                path1.moveTo(f4 - f12, f8);
                path1.lineTo(f12 + f4, f8);
                path1.lineTo(f4 + f13, f10);
                path1.lineTo(f4 - f13, f10);
                path1.close();
                k.e(path1, j1);
                if (m1.m)
                {
                    m1.a(path1, rect, j1);
                }
                path1.reset();
                f3 = (float)(d7 + d5 + (double)f3);
                if (j1.w() || j1.o() != null)
                {
                    a(m1, j1, new PointF(f4, (f8 + f10) * 0.5F));
                }
            }

        }
        k.a();
    }

    public void b(m m1)
    {
    }

    public boolean f()
    {
        return true;
    }

    public CoordinateSystem g()
    {
        return CoordinateSystem.c;
    }

    static 
    {
        h = d.a("pyramid-style", com/artfulbits/aiCharts/Types/ChartPyramidType, com/artfulbits/aiCharts/Types/ChartPyramidType$Style, Style.b);
    }
}
