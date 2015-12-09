// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Types;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.artfulbits.aiCharts.Base.ChartPointDeclaration;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.d;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.k;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.q;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Enums.ChartBorderStyle;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Types:
//            a, y

public class ChartPieType extends q
{
    public static final class LabelStyle extends Enum
    {

        public static final LabelStyle a;
        public static final LabelStyle b;
        public static final LabelStyle c;
        private static final LabelStyle d[];

        public static LabelStyle valueOf(String s)
        {
            return (LabelStyle)Enum.valueOf(com/artfulbits/aiCharts/Types/ChartPieType$LabelStyle, s);
        }

        public static LabelStyle[] values()
        {
            return (LabelStyle[])d.clone();
        }

        static 
        {
            a = new LabelStyle("Inside", 0);
            b = new LabelStyle("Outside", 1);
            c = new LabelStyle("OutsideColumn", 2);
            d = (new LabelStyle[] {
                a, b, c
            });
        }

        private LabelStyle(String s, int i1)
        {
            super(s, i1);
        }
    }

    static final class a
    {

        public final String a;
        public final int b;
        public final int c;

        public a(j j1)
        {
            Rect rect = new Rect();
            int i1 = j1.k().intValue();
            a = j1.f();
            j1.m().getTextBounds(a, 0, a.length(), rect);
            int l1 = rect.width() + i1 * 2;
            int i2 = i1 * 2 + rect.height();
            j1 = j1.j();
            int k1 = l1;
            i1 = i2;
            if (j1 != null)
            {
                j1.getPadding(rect);
                k1 = rect.left;
                int k2 = rect.right;
                i1 = rect.top;
                int j2 = rect.bottom;
                k1 = Math.max(l1 + (k1 + k2), j1.getMinimumWidth());
                i1 = Math.max(i2 + (j2 + i1), j1.getMinimumHeight());
            }
            b = k1;
            c = i1;
        }
    }


    public static final d i = d.a("pie-expand_radius", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Integer, Integer.valueOf(0));
    public static final d j;
    public static final d k = d.a("pie-angle_offset", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Integer, Integer.valueOf(0));
    public static final d l = d.a("pie-labels_offset", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Float, Float.valueOf(0.75F));
    public static final d m = d.a("pie-ticks_size", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Integer, Integer.valueOf(4));
    public static final d n = d.a("pie-minimal_size", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Float, Float.valueOf(0.25F));
    public static final d o = d.a("pie-optimize_points", com/artfulbits/aiCharts/Types/ChartPieType, java/lang/Boolean, Boolean.valueOf(true));
    public static final d p;
    private final y h = new y();
    private final Paint q = new Paint();

    public ChartPieType()
    {
    }

    protected void a(Canvas canvas, Rect rect, k k1)
    {
        a(canvas, rect, k1, e, false);
    }

    protected void a(RectF rectf, float f1, float f2, Path path, Path path1)
    {
        if (path1 != null)
        {
            path1.reset();
            path1.addArc(rectf, f1, f2);
        }
        path.reset();
        path.moveTo(rectf.centerX(), rectf.centerY());
        path.addArc(rectf, f1, f2);
        path.lineTo(rectf.centerX(), rectf.centerY());
        path.close();
    }

    public void a(m m1)
    {
        Object obj1 = m1.b;
        j aj[] = (j[])((ChartSeries) (obj1)).I().toArray(new j[((ChartSeries) (obj1)).I().size()]);
        ChartPointDeclaration chartpointdeclaration = ((ChartSeries) (obj1)).G();
        LabelStyle labelstyle = (LabelStyle)((ChartSeries) (obj1)).a(j);
        float f1;
        float f2;
        float f3;
        j aj1[];
        boolean flag;
        boolean flag1;
        boolean flag2;
        int k3;
        int l3;
        if (labelstyle != LabelStyle.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (labelstyle == LabelStyle.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l3 = ((Integer)((ChartSeries) (obj1)).a(k)).intValue();
        f2 = ((Float)((ChartSeries) (obj1)).a(l)).floatValue();
        f3 = ((Float)((ChartSeries) (obj1)).a(n)).floatValue() / 2.0F;
        k3 = ((Integer)((ChartSeries) (obj1)).a(m)).intValue();
        f1 = l3;
        if (((ChartSeries) (obj1)).a(p) == ChartBorderStyle.a)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        aj1 = aj;
        if (((Boolean)((ChartSeries) (obj1)).a(o)).booleanValue())
        {
            aj = (j[])aj.clone();
            int k1 = 0;
            int k2 = aj.length / 4;
            do
            {
                aj1 = aj;
                if (k1 >= k2)
                {
                    break;
                }
                int i4 = k1 * 2 + 1;
                obj1 = aj[i4];
                aj[i4] = aj[aj.length - i4 - 1];
                aj[aj.length - i4 - 1] = ((j) (obj1));
                k1++;
            } while (true);
        }
        int j4 = m1.g.centerX();
        int k4 = m1.g.centerY();
        obj1 = new Rect(m1.g);
        Rect rect = new Rect();
        Object obj2 = new RectF();
        Object obj = new Point();
        int l4 = (int)((float)Math.min(((Rect) (obj1)).width(), ((Rect) (obj1)).height()) * f3);
        a aa[] = new a[aj1.length];
        double d1 = 0.0D;
        int l2 = 0;
        for (int l1 = 0; l1 < aa.length; l1++)
        {
            j j1 = aj1[l1];
            d1 += j1.a(chartpointdeclaration.b);
            l2 = Math.max(l2, ((Integer)j1.a(i)).intValue());
            if (j1.w() || j1.o() != null)
            {
                aa[l1] = new a(j1);
                obj.x = Math.max(((Point) (obj)).x, aa[l1].b);
                obj.y = Math.max(((Point) (obj)).y, aa[l1].c);
            }
        }

        if (flag)
        {
            ((Rect) (obj1)).inset(((Point) (obj)).x + k3, ((Point) (obj)).y / 2 + k3);
        }
        int i2 = Math.max(l4, Math.min(((Rect) (obj1)).width(), ((Rect) (obj1)).height()) / 2 - l2);
        ((Rect) (obj1)).set(j4 - i2, k4 - i2, j4 + i2, k4 + i2);
        h.a(m1);
        Object obj3 = new Path();
        int i1;
        if (flag2)
        {
            obj = new Path();
        } else
        {
            obj = null;
        }
        i1 = 0;
        while (i1 < aj1.length) 
        {
            j j2 = aj1[i1];
            float f4 = (float)((360D * j2.a(chartpointdeclaration.b)) / d1);
            int i3 = ((Integer)j2.a(i)).intValue();
            rect.set(((Rect) (obj1)));
            if (i3 > 0)
            {
                double d2 = Math.toRadians((double)f1 + 0.5D * (double)f4);
                int i5 = (int)((double)i3 * Math.cos(d2));
                double d4 = i3;
                rect.offset(i5, (int)(Math.sin(d2) * d4));
            }
            ((RectF) (obj2)).set(rect);
            a(((RectF) (obj2)), f1, f4, ((Path) (obj3)), ((Path) (obj)));
            if (m1.m)
            {
                m1.a(((Path) (obj3)), rect, j2);
            }
            if (obj == null)
            {
                h.a(((Path) (obj3)), j2, rect);
            } else
            {
                h.d(((Path) (obj3)), j2);
                h.b(((Path) (obj)), j2);
            }
            f1 += f4;
            i1++;
        }
        PointF pointf;
        if (flag)
        {
            f1 = i2;
        } else
        {
            f1 = (float)i2 * f2;
        }
        d1 = 6.2831853071795862D / d1;
        f2 = (float)Math.toRadians(l3);
        obj2 = new PointF();
        obj3 = new PointF();
        pointf = new PointF();
        i1 = 0;
        do
        {
            while (i1 < aa.length) 
            {
                j j3 = aj1[i1];
                a a1 = aa[i1];
                float f7 = (float)(j3.a(chartpointdeclaration.b) * d1);
                float f6 = (float)((double)(0.5F * f7 + f2) % 6.2831853071795862D);
                float f5 = f6;
                if (f6 < 0.0F)
                {
                    f5 = (float)((double)f6 + 6.2831853071795862D);
                }
                if (a1 != null)
                {
                    double d3 = Math.cos(f5);
                    double d5 = Math.sin(f5);
                    obj2.x = (float)((double)j4 + (double)f1 * d3);
                    obj2.y = (float)((double)k4 + (double)f1 * d5);
                    if (flag)
                    {
                        pointf.set(((PointF) (obj2)).x, ((PointF) (obj2)).y);
                        double d6 = j4;
                        obj2.x = (float)(d3 * (double)((float)k3 + f1) + d6);
                        obj2.y = (float)((double)k4 + d5 * (double)((float)k3 + f1));
                        Alignment alignment3 = Alignment.b;
                        Alignment alignment = Alignment.b;
                        Alignment alignment4;
                        if (flag1)
                        {
                            ((PointF) (obj3)).set(((PointF) (obj2)).x, ((PointF) (obj2)).y);
                            Alignment alignment1;
                            if ((double)f5 < 1.5707963267948966D || (double)f5 > 4.7123889803846897D)
                            {
                                obj2.x = m1.g.right - a1.b;
                                alignment1 = Alignment.c;
                            } else
                            {
                                obj2.x = m1.g.left + a1.b;
                                alignment1 = Alignment.a;
                            }
                            q.setColor(j3.t());
                            q.setStyle(android.graphics.Paint.Style.STROKE);
                            m1.a.drawLine(pointf.x, pointf.y, ((PointF) (obj3)).x, ((PointF) (obj3)).y, q);
                            m1.a.drawLine(((PointF) (obj3)).x, ((PointF) (obj3)).y, ((PointF) (obj2)).x, ((PointF) (obj2)).y, q);
                            alignment4 = alignment3;
                            alignment3 = alignment1;
                        } else
                        {
                            Alignment alignment2;
                            if ((double)f5 < 1.5707963267948966D)
                            {
                                alignment3 = Alignment.c;
                                alignment2 = Alignment.c;
                            } else
                            if ((double)f5 < 3.1415926535897931D)
                            {
                                alignment3 = Alignment.a;
                                alignment2 = Alignment.c;
                            } else
                            if ((double)f5 < 4.7123889803846897D)
                            {
                                alignment3 = Alignment.a;
                                alignment2 = Alignment.a;
                            } else
                            {
                                alignment3 = Alignment.c;
                                alignment2 = Alignment.a;
                            }
                            m1.a.drawLine(pointf.x, pointf.y, ((PointF) (obj2)).x, ((PointF) (obj2)).y, q);
                            alignment4 = alignment2;
                        }
                        a(m1, ((PointF) (obj2)), a1.a, alignment3, alignment4, j3.j(), j3.k().intValue(), j3.m(), j3.o(), j3.p(), 0.0F);
                    } else
                    {
                        a(m1, j3, ((PointF) (obj2)));
                    }
                }
                f2 += f7;
                i1++;
            }
            return;
        } while (true);
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
        j = d.a("pie-label_style", com/artfulbits/aiCharts/Types/ChartPieType, com/artfulbits/aiCharts/Types/ChartPieType$LabelStyle, LabelStyle.a);
        p = com.artfulbits.aiCharts.Types.a.h;
    }
}
