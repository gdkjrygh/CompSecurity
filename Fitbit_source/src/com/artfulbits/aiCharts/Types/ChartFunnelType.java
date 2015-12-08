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
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            y

public class ChartFunnelType extends q
{
    public static final class Style extends Enum
    {

        public static final Style a;
        public static final Style b;
        private static final Style c[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/artfulbits/aiCharts/Types/ChartFunnelType$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])c.clone();
        }

        static 
        {
            a = new Style("YIsHeight", 0);
            b = new Style("YIsWidth", 1);
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
    public static final d i = d.a("funnel-minimal", com/artfulbits/aiCharts/Types/ChartFunnelType, java/lang/Float, Float.valueOf(0.05F));
    public static final d j = d.a("funnel-gap_ratio", com/artfulbits/aiCharts/Types/ChartFunnelType, java/lang/Float, Float.valueOf(0.0F));
    public static final d k = d.a("funnel-neck_width", com/artfulbits/aiCharts/Types/ChartFunnelType, java/lang/Float, Float.valueOf(0.1F));
    public static final d l = d.a("funnel-neck_height", com/artfulbits/aiCharts/Types/ChartFunnelType, java/lang/Float, Float.valueOf(0.1F));
    private final y m = new y();

    public ChartFunnelType()
    {
    }

    public void a(m m1)
    {
        int l2 = m1.b.G().b;
        int i1 = m1.b.I().size();
        j aj[] = (j[])m1.b.I().toArray(new j[i1]);
        Rect rect = m1.g;
        Style style = (Style)m1.b.a(h);
        float f3 = rect.centerX();
        float f4 = rect.height();
        float f5 = 0.5F * (float)rect.width();
        double d5 = ((Float)m1.b.a(j)).floatValue();
        double d6 = ((Float)m1.b.a(i)).floatValue();
        i1 = 0;
        m.a(m1);
        if (style == Style.b)
        {
            Arrays.sort(aj, new Comparator(l2) {

                private int a;

                public final int compare(Object obj, Object obj1)
                {
                    obj = (j)obj;
                    obj1 = (j)obj1;
                    return -Double.compare(((j) (obj)).a(a), ((j) (obj1)).a(a));
                }

            
            {
                a = i1;
                super();
            }
            });
            int i3 = aj.length;
            int k1 = 0;
            double d1 = 0.0D;
            for (i1 = 0; k1 < i3; i1++)
            {
                d1 = Math.max(d1, Math.abs(aj[k1].a(l2)));
                k1++;
            }

            if (i1 > 1)
            {
                Path path1 = new Path();
                double d3 = 0.0D;
                j j1 = aj[0];
                double d8 = 1.0D / d1;
                double d9 = (1.0D - (double)(i1 - 2) * d5) / (double)(i1 - 1);
                i1 = 1;
                d1 = d3;
                while (i1 < aj.length) 
                {
                    j j2 = aj[i1];
                    float f1 = (float)((double)rect.top + (double)f4 * d1);
                    float f6 = (float)((double)f4 * d9) + f1;
                    float f8 = (float)((double)f5 * Math.max(d6, j1.a(l2) * d8));
                    float f10 = (float)((double)f5 * Math.max(d6, j2.a(l2) * d8));
                    path1.moveTo(f3 - f8, f1);
                    path1.lineTo(f8 + f3, f1);
                    path1.lineTo(f3 + f10, f6);
                    path1.lineTo(f3 - f10, f6);
                    path1.close();
                    m.e(path1, j1);
                    if (m1.m)
                    {
                        m1.a(path1, rect, j2);
                    }
                    path1.reset();
                    d1 += d9 + d5;
                    if (j2.w() || j2.o() != null)
                    {
                        a(m1, j2, new PointF(f3, (f1 + f6) * 0.5F));
                    }
                    i1++;
                    j1 = j2;
                }
            }
        } else
        {
            double d2 = 0.0D;
            float f7 = 1.0F - ((Float)m1.b.a(l)).floatValue();
            float f2 = 0.0F;
            float f9 = f4 * f7 + (float)rect.top;
            float f11 = f5 * ((Float)m1.b.a(k)).floatValue();
            Path path = new Path();
            int k3 = aj.length;
            for (int l1 = 0; l1 < k3; l1++)
            {
                d2 += Math.abs(aj[l1].a(l2));
                i1++;
            }

            if (d2 != 0.0D)
            {
                double d4 = d6 * d2;
                d2 = 0.0D;
                int l3 = aj.length;
                for (int i2 = 0; i2 < l3; i2++)
                {
                    d2 += Math.max(d4, Math.abs(aj[i2].a(l2)));
                }

                d2 = (1.0D - (double)(i1 - 1) * d5) / d2;
                int k2 = aj.length;
                i1 = 0;
                while (i1 < k2) 
                {
                    j j3 = aj[i1];
                    double d7 = Math.max(j3.a(l2), d4) * d2;
                    float f12 = (float)rect.top + f4 * f2;
                    float f13 = (float)((double)f4 * d7) + f12;
                    if (f13 < f9)
                    {
                        float f14 = (f5 - f11) * (1.0F - f2 / f7) + f11;
                        float f16 = (float)((double)(f5 - f11) * (1.0D - ((double)f2 + d7) / (double)f7)) + f11;
                        path.moveTo(f3 - f14, f12);
                        path.lineTo(f14 + f3, f12);
                        path.lineTo(f3 + f16, f13);
                        path.lineTo(f3 - f16, f13);
                        path.close();
                    } else
                    if (f12 < f9)
                    {
                        float f15 = (f5 - f11) * (1.0F - f2 / f7) + f11;
                        path.moveTo(f3 - f15, f12);
                        path.lineTo(f15 + f3, f12);
                        path.lineTo(f3 + f11, f9);
                        path.lineTo(f3 + f11, f13);
                        path.lineTo(f3 - f11, f13);
                        path.lineTo(f3 - f11, f9);
                        path.close();
                    } else
                    {
                        path.moveTo(f3 - f11, f12);
                        path.lineTo(f3 + f11, f12);
                        path.lineTo(f3 + f11, f13);
                        path.lineTo(f3 - f11, f13);
                        path.close();
                    }
                    m.e(path, j3);
                    if (m1.m)
                    {
                        m1.a(path, rect, j3);
                    }
                    path.reset();
                    f2 = (float)(d7 + d5 + (double)f2);
                    if (j3.w() || j3.o() != null)
                    {
                        a(m1, j3, new PointF(f3, 0.5F * (f12 + f13)));
                    }
                    i1++;
                }
            }
        }
        m.a();
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
        h = d.a("funnel-style", com/artfulbits/aiCharts/Types/ChartFunnelType, com/artfulbits/aiCharts/Types/ChartFunnelType$Style, Style.a);
    }
}
