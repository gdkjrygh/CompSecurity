// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.FloatMath;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Enums.CoordinateSystem;
import com.artfulbits.aiCharts.Types.u;
import com.artfulbits.aiCharts.Types.x;
import java.util.List;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            d, j, ChartSeries, l, 
//            m, r, ChartAxis, k, 
//            ad, ChartPointDeclaration, ChartAxisScale

public abstract class q
{

    protected static final d a = com.artfulbits.aiCharts.Base.d.a("stacked-stack_group", com/artfulbits/aiCharts/Types/u, java/lang/String, "");
    public static final d b = com.artfulbits.aiCharts.Base.d.a("point-width", com/artfulbits/aiCharts/Types/u, java/lang/Float, Float.valueOf(0.8F));
    public static final d c = com.artfulbits.aiCharts.Base.d.a("point-default-width", com/artfulbits/aiCharts/Types/u, java/lang/Float, Float.valueOf(1.0F));
    public static final d d = com.artfulbits.aiCharts.Base.d.a("series-spacing", com/artfulbits/aiCharts/Types/u, java/lang/Float, Float.valueOf(0.0F));
    protected final Paint e = new Paint();
    protected final PointF f = new PointF();
    protected final RectF g = new RectF();

    public q()
    {
        e.setAntiAlias(true);
    }

    protected static int a(List list, double d1, double d2, int i1, int j1)
    {
        int l1 = j1 + i1 >> 1;
        int k1 = i1;
        do
        {
            if (j1 - k1 <= 1)
            {
                return Math.max(i1, k1 - 1);
            }
            if (((j)list.get(k1)).a() >= d1)
            {
                return Math.max(i1, k1 - 1);
            }
            if (((j)list.get(j1)).a() == d1)
            {
                return Math.max(i1, j1 - 1);
            }
            if (((j)list.get(l1)).a() == d1)
            {
                return Math.max(i1, l1 - 1);
            }
            if (((j)list.get(l1)).a() < d1)
            {
                k1 = l1 + 1;
            } else
            {
                j1 = l1 - 1;
            }
            l1 = j1 + k1 >> 1;
        } while (true);
    }

    public static r a(q q1, ChartSeries chartseries)
    {
        l l1 = chartseries.F();
        int j1 = l1.size();
        if (j1 > 0)
        {
            double d2 = -1.7976931348623157E+308D;
            double d1 = 1.7976931348623157E+308D;
            for (int i1 = 0; i1 < j1;)
            {
                double d4 = l1.a(i1).a();
                double d3 = d2;
                if (d4 > d2)
                {
                    d3 = d4;
                }
                if (d4 < d1)
                {
                    d1 = d4;
                }
                i1++;
                d2 = d3;
            }

            if (q1.a())
            {
                q1 = m.a(chartseries, q1, chartseries.O());
                d1 += ((r) (q1)).a;
                d2 = ((r) (q1)).b + d2;
            }
            return new r(d1, d2);
        } else
        {
            return null;
        }
    }

    public static transient r a(q q1, ChartSeries chartseries, int ai[])
    {
        l l1 = chartseries.F();
        int j2 = l1.size();
        if (j2 > 0)
        {
            double d5 = -1.7976931348623157E+308D;
            double d3 = 1.7976931348623157E+308D;
            double d1;
            double d2;
            if (q1.b())
            {
                a a1 = chartseries.O();
                int i1 = 0;
                do
                {
                    d2 = d3;
                    d1 = d5;
                    if (i1 >= j2)
                    {
                        break;
                    }
                    for (int k1 = 0; k1 < ai.length;)
                    {
                        d1 = m.a(a1, chartseries, l1.a(i1), ai[k1], true);
                        d2 = d5;
                        if (d1 > d5)
                        {
                            d2 = d1;
                        }
                        d5 = d3;
                        if (d1 < d3)
                        {
                            d5 = d1;
                        }
                        k1++;
                        d3 = d5;
                        d5 = d2;
                    }

                    i1++;
                } while (true);
            } else
            {
                int j1 = 0;
                do
                {
                    d2 = d3;
                    d1 = d5;
                    if (j1 >= j2)
                    {
                        break;
                    }
                    for (int i2 = 0; i2 < ai.length;)
                    {
                        d1 = l1.a(j1).a(ai[i2]);
                        d2 = d5;
                        if (d1 > d5)
                        {
                            d2 = d1;
                        }
                        d5 = d3;
                        if (d1 < d3)
                        {
                            d5 = d1;
                        }
                        i2++;
                        d3 = d5;
                        d5 = d2;
                    }

                    j1++;
                } while (true);
            }
            double d8 = d2;
            double d7 = d1;
            if (q1.d())
            {
                double d6 = chartseries.C().t();
                double d4 = d1;
                if (d6 > d1)
                {
                    d4 = d6;
                }
                d8 = d2;
                d7 = d4;
                if (d6 < d2)
                {
                    d7 = d4;
                    d8 = d6;
                }
            }
            return new r(d8, d7);
        } else
        {
            return null;
        }
    }

    protected static void a(Canvas canvas, Rect rect, k k1, Paint paint, boolean flag)
    {
        Drawable drawable = k1.i();
        if (drawable != null && flag)
        {
            if (k1.A())
            {
                drawable.setColorFilter(k1.g(), android.graphics.PorterDuff.Mode.MULTIPLY);
            }
            drawable.setBounds(rect);
            drawable.draw(canvas);
            return;
        } else
        {
            paint.setColor(k1.g());
            canvas.drawOval(new RectF(rect), paint);
            return;
        }
    }

    protected static void a(m m1, PointF pointf, String s, Alignment alignment, Alignment alignment1, Drawable drawable, int i1, Paint paint, 
            Drawable drawable1, Point point, float f1)
    {
        float f2;
        float f3;
        float f4;
        float f5;
        int k1;
        pointf = new Rect((int)pointf.x, (int)pointf.y, (int)pointf.x, (int)pointf.y);
        Canvas canvas = m1.a;
        if (drawable1 != null)
        {
            int j2;
            int l2;
            int i3;
            int j3;
            if (point == null)
            {
                int j1 = drawable1.getIntrinsicWidth();
                int i2 = drawable1.getIntrinsicWidth();
                pointf.inset(-j1 / 2, -i2 / 2);
            } else
            {
                pointf.inset(-point.x / 2, -point.y / 2);
            }
            drawable1.setBounds(0, 0, pointf.width(), pointf.height());
            canvas.save(1);
            canvas.translate(((Rect) (pointf)).left, ((Rect) (pointf)).top);
            drawable1.draw(canvas);
            canvas.restore();
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        drawable1 = new Rect();
        point = new PointF();
        f2 = paint.measureText(s);
        f3 = paint.getTextSize();
        if (f1 != 0.0F)
        {
            f5 = 0.01745329F * f1;
            f4 = Math.abs(FloatMath.cos(f5));
            f5 = Math.abs(FloatMath.sin(f5));
            point.x = f4 * f2 + f5 * f3;
            point.y = f3 * f4 + f5 * f2;
        } else
        {
            point.set(f2, f3);
        }
        j2 = (int)FloatMath.ceil(((PointF) (point)).x + (float)(i1 * 2));
        l2 = (int)FloatMath.ceil(((PointF) (point)).y + (float)(i1 * 2));
        k1 = j2;
        i1 = l2;
        if (drawable != null)
        {
            drawable.getPadding(drawable1);
            k1 = ((Rect) (drawable1)).left;
            j3 = ((Rect) (drawable1)).right;
            i1 = ((Rect) (drawable1)).top;
            i3 = ((Rect) (drawable1)).bottom;
            k1 = Math.max(j2 + (k1 + j3), drawable.getMinimumWidth());
            i1 = Math.max(l2 + (i1 + i3), drawable.getMinimumHeight());
        }
        ad.a[alignment.ordinal()];
        JVM INSTR tableswitch 1 3: default 380
    //                   1 559
    //                   2 584
    //                   3 617;
           goto _L3 _L4 _L5 _L6
_L3:
        ad.a[alignment1.ordinal()];
        JVM INSTR tableswitch 1 3: default 416
    //                   1 642
    //                   2 667
    //                   3 700;
           goto _L7 _L8 _L9 _L10
_L7:
        if (drawable != null)
        {
            drawable.setBounds(drawable1);
            drawable.draw(canvas);
        }
        m1 = m1.a;
        f3 = drawable1.centerX();
        f4 = drawable1.centerY();
        f2 = -0.5F * f2;
        f5 = 0.5F * paint.getTextSize() - paint.descent();
        if (f1 == 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        m1.save(1);
        m1.translate(f3, f4);
        m1.rotate(f1);
        m1.drawText(s, f2, f5, paint);
        m1.restore();
_L2:
        return;
_L4:
        drawable1.right = ((Rect) (pointf)).left;
        drawable1.left = ((Rect) (drawable1)).right - k1;
        continue; /* Loop/switch isn't completed */
_L5:
        int k2 = pointf.centerX();
        drawable1.left = k2 - k1 / 2;
        drawable1.right = k1 / 2 + k2;
        continue; /* Loop/switch isn't completed */
_L6:
        drawable1.left = ((Rect) (pointf)).right;
        drawable1.right = k1 + ((Rect) (drawable1)).left;
        continue; /* Loop/switch isn't completed */
_L8:
        drawable1.bottom = ((Rect) (pointf)).top;
        drawable1.top = ((Rect) (drawable1)).bottom - i1;
        continue; /* Loop/switch isn't completed */
_L9:
        int l1 = pointf.centerY();
        drawable1.top = l1 - i1 / 2;
        drawable1.bottom = l1 + i1 / 2;
        continue; /* Loop/switch isn't completed */
_L10:
        drawable1.top = ((Rect) (pointf)).bottom;
        drawable1.bottom = ((Rect) (drawable1)).top + i1;
        if (true) goto _L7; else goto _L11
_L11:
        m1.drawText(s, f3 + f2, f4 + f5, paint);
        return;
        if (true) goto _L3; else goto _L12
_L12:
    }

    public static boolean a(q q1, q q2)
    {
        while (q1.g() == CoordinateSystem.c || q1.g() != q2.g() || q1.e() != q2.e() || q1.c() != q2.c()) 
        {
            return false;
        }
        return true;
    }

    protected static int b(List list, double d1, double d2, int i1, int j1)
    {
        int i2 = j1 + i1 >> 1;
        int l1 = j1;
        int k1 = i1;
        i1 = l1;
        do
        {
            if (i1 - k1 <= 1)
            {
                return Math.min(j1, i1 + 1);
            }
            if (((j)list.get(k1)).a() == d2)
            {
                return Math.min(j1, k1 + 1);
            }
            if (((j)list.get(i1)).a() <= d2)
            {
                return Math.min(j1, i1 + 1);
            }
            if (((j)list.get(i2)).a() == d2)
            {
                return Math.min(j1, i2 + 1);
            }
            if (((j)list.get(i2)).a() < d2)
            {
                k1 = i2 + 1;
            } else
            {
                i1 = i2 - 1;
            }
            i2 = i1 + k1 >> 1;
        } while (true);
    }

    public r a(ChartSeries chartseries)
    {
        return a(this, chartseries);
    }

    protected void a(Canvas canvas, Rect rect, k k1)
    {
        a(canvas, rect, k1, e, true);
    }

    public abstract void a(m m1);

    protected void a(m m1, j j1, int i1, PointF pointf)
    {
        double d3 = j1.a();
        double d1 = j1.a(i1);
        if (b())
        {
            d1 = m1.a(j1, i1, true);
        }
        double d2 = d3;
        if (a())
        {
            d2 = d3 + m1.c().a();
        }
        m1.a(d2, d1, pointf);
    }

    protected void a(m m1, j j1, PointF pointf)
    {
        Paint paint = null;
        int i1 = 0;
        float f1 = 0.0F;
        String s;
        Alignment alignment;
        Alignment alignment1;
        Drawable drawable;
        if (j1.w())
        {
            s = j1.f();
            alignment = j1.r();
            alignment1 = j1.s();
            drawable = j1.j();
            i1 = j1.k().intValue();
            paint = j1.m();
            f1 = j1.q().floatValue();
        } else
        {
            drawable = null;
            alignment1 = null;
            alignment = null;
            s = null;
        }
        a(m1, pointf, s, alignment, alignment1, drawable, i1, paint, j1.o(), j1.p(), f1);
    }

    protected void a(m m1, j j1, PointF pointf, Point point)
    {
        Paint paint = null;
        int i1 = 0;
        float f1 = 0.0F;
        String s;
        Alignment alignment;
        Alignment alignment1;
        Drawable drawable;
        if (j1.w())
        {
            s = j1.f();
            alignment = j1.r();
            alignment1 = j1.s();
            drawable = j1.j();
            i1 = j1.k().intValue();
            paint = j1.m();
            f1 = j1.q().floatValue();
        } else
        {
            drawable = null;
            alignment1 = null;
            alignment = null;
            s = null;
        }
        a(m1, pointf, s, alignment, alignment1, drawable, i1, paint, j1.o(), point, f1);
    }

    protected void a(m m1, j j1, PointF pointf, Alignment alignment, Alignment alignment1, Point point)
    {
        String s = null;
        int i1 = 0;
        Drawable drawable = null;
        Paint paint = null;
        float f1 = 0.0F;
        if (j1.w())
        {
            s = j1.f();
            drawable = j1.j();
            i1 = j1.k().intValue();
            paint = j1.m();
            f1 = j1.q().floatValue();
        }
        a(m1, pointf, s, alignment, alignment1, drawable, i1, paint, j1.o(), point, f1);
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(q q1)
    {
        return a(this, q1);
    }

    public r b(ChartSeries chartseries)
    {
        return a(this, chartseries, new int[] {
            chartseries.G().b
        });
    }

    public void b(m m1)
    {
        List list = m1.b.I();
        int k1 = list.size() - 1;
        double d1 = m1.e.a().f();
        double d2 = m1.e.a().g();
        PointF pointf = f;
        int i1 = a(list, d1, d2, 0, k1);
        k1 = b(list, d1, d2, i1, k1);
        int l1 = m1.b.G().h;
        for (; i1 <= k1; i1++)
        {
            j j1 = (j)list.get(i1);
            if (!j1.w() && j1.o() == null)
            {
                continue;
            }
            a(m1, j1, l1, pointf);
            if (m1.a(pointf.x, pointf.y))
            {
                a(m1, j1, pointf, j1.p());
            }
        }

    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean e()
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }

    public CoordinateSystem g()
    {
        return CoordinateSystem.a;
    }

    public ChartPointDeclaration.Usage[] h()
    {
        return (new ChartPointDeclaration.Usage[] {
            ChartPointDeclaration.Usage.a
        });
    }

    public String i()
    {
        return x.a(getClass());
    }

}
