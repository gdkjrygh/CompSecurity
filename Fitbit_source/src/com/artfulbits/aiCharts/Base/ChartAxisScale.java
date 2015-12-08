// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.Calendar;
import java.util.Date;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxis, a, v

public final class ChartAxisScale
{
    public static final class IntervalType extends Enum
    {

        public static final IntervalType a;
        public static final IntervalType b;
        public static final IntervalType c;
        public static final IntervalType d;
        public static final IntervalType e;
        public static final IntervalType f;
        public static final IntervalType g;
        public static final IntervalType h;
        private static final IntervalType i[];
        protected final int Field;

        public static IntervalType valueOf(String s1)
        {
            return (IntervalType)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxisScale$IntervalType, s1);
        }

        public static IntervalType[] values()
        {
            return (IntervalType[])i.clone();
        }

        static 
        {
            a = new IntervalType("Double", 0, -1);
            b = new IntervalType("Milliseconds", 1, 14);
            c = new IntervalType("Seconds", 2, 13);
            d = new IntervalType("Minutes", 3, 12);
            e = new IntervalType("Hours", 4, 10);
            f = new IntervalType("Days", 5, 5);
            g = new IntervalType("Month", 6, 2);
            h = new IntervalType("Years", 7, 1);
            i = (new IntervalType[] {
                a, b, c, d, e, f, g, h
            });
        }

        private IntervalType(String s1, int i1, int j1)
        {
            super(s1, i1);
            Field = j1;
        }
    }

    static final class a
        implements c
    {

        private final Calendar a;
        private final Calendar b = Calendar.getInstance();
        private final int c;
        private final int d;

        public final double a()
        {
            return (double)a.getTimeInMillis();
        }

        public final boolean b()
        {
            a.add(d, c);
            return a.before(b);
        }

        public a(double d1, double d2, int i1, int j1)
        {
            a = ChartAxisScale.a(d1, j1);
            b.setTimeInMillis((long)d2);
            c = i1;
            d = j1;
        }
    }

    static final class b
        implements c
    {

        private double a;
        private final double b;
        private final double c;

        public final double a()
        {
            return a;
        }

        public final boolean b()
        {
            a = a + c;
            return a <= b;
        }

        public b(double d1, double d2, double d3)
        {
            a = com.artfulbits.aiCharts.Base.v.a(d1, d3);
            b = d2;
            c = d3;
        }
    }

    static interface c
    {

        public abstract double a();

        public abstract boolean b();
    }


    public static final double a = 0D;
    public static final double b = -1D;
    public static final double c = -2D;
    private static final double d[] = {
        1.0D, 2D, 2.5D, 5D, 10D
    };
    private static final double e[] = {
        1.0D, 1000D, 60000D, 3600000D, 86400000D, 2592000000D, 946080000000D
    };
    private static final int f[] = {
        14, 13, 12, 10, 5, 2, 1
    };
    private double A;
    private final ChartAxis g;
    private Double h;
    private Double i;
    private Double j;
    private IntervalType k;
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private double s;
    private double t;
    private int u;
    private int v;
    private double w;
    private boolean x;
    private double y;
    private double z;

    protected ChartAxisScale(ChartAxis chartaxis)
    {
        h = null;
        i = null;
        j = null;
        k = null;
        l = (0.0D / 0.0D);
        m = (0.0D / 0.0D);
        n = 0.0D;
        o = 0.0D;
        p = 0.0D;
        q = 0.0D;
        r = 0.0D;
        s = 1.0D;
        t = 1.0D;
        u = 0;
        v = 4;
        w = -2D;
        x = false;
        y = 0.0D;
        z = 1.0D;
        A = 1.0D;
        g = chartaxis;
    }

    static Calendar a(double d1, int i1)
    {
        Calendar calendar;
        Calendar calendar1;
        calendar = Calendar.getInstance();
        calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis((long)d1);
        calendar.setTimeInMillis(0L);
        i1;
        JVM INSTR tableswitch -1 14: default 100
    //                   -1 206
    //                   0 100
    //                   1 192
    //                   2 181
    //                   3 100
    //                   4 100
    //                   5 170
    //                   6 100
    //                   7 100
    //                   8 100
    //                   9 100
    //                   10 157
    //                   11 100
    //                   12 144
    //                   13 131
    //                   14 118;
           goto _L1 _L2 _L1 _L3 _L4 _L1 _L1 _L5 _L1 _L1 _L1 _L1 _L6 _L1 _L7 _L8 _L9
_L1:
        if ((double)calendar.getTimeInMillis() < d1)
        {
            calendar.add(i1, 1);
        }
        return calendar;
_L9:
        calendar.set(14, calendar1.get(14));
_L8:
        calendar.set(13, calendar1.get(13));
_L7:
        calendar.set(12, calendar1.get(12));
_L6:
        calendar.set(10, calendar1.get(10));
_L5:
        calendar.set(5, calendar1.get(5));
_L4:
        calendar.set(2, calendar1.get(2));
_L3:
        calendar.set(1, calendar1.get(1));
          goto _L1
_L2:
        throw new IllegalArgumentException("intervalType");
    }

    private static void a(double d1, int ai[])
    {
        int i1 = e.length - 1;
        do
        {
label0:
            {
                if (i1 >= 0)
                {
                    if (d1 < e[i1])
                    {
                        break label0;
                    }
                    ai[0] = (int)k(d1 / e[i1]);
                    ai[1] = f[i1];
                }
                return;
            }
            i1--;
        } while (true);
    }

    private static double k(double d1)
    {
        double d3 = Math.pow(10D, Math.floor(Math.log10(d1)));
        double d4 = d1 / d3;
        double ad[] = d;
        int j1 = ad.length;
        int i1 = 0;
        do
        {
label0:
            {
                double d2 = d1;
                if (i1 < j1)
                {
                    d2 = ad[i1];
                    if (d4 > d2)
                    {
                        break label0;
                    }
                    d2 *= d3;
                }
                return d2;
            }
            i1++;
        } while (true);
    }

    public final double a()
    {
        return w;
    }

    public final void a(double d1)
    {
        if (w != d1)
        {
            w = d1;
            s();
            g.J();
        }
    }

    public final void a(double d1, double d2)
    {
        h = Double.valueOf(d1);
        i = Double.valueOf(d2);
        s();
        g.J();
    }

    public final void a(int i1)
    {
        if (v != i1)
        {
            v = i1;
            s();
            g.J();
        }
    }

    public final void a(IntervalType intervaltype)
    {
        if (k != intervaltype)
        {
            k = intervaltype;
            s();
            g.J();
        }
    }

    public final void a(Double double1)
    {
        h = double1;
        s();
        g.J();
    }

    public final void a(Double double1, IntervalType intervaltype)
    {
        j = double1;
        k = intervaltype;
        s();
        g.J();
    }

    public final void a(Calendar calendar, Calendar calendar1)
    {
        a(calendar.getTimeInMillis(), calendar1.getTimeInMillis());
    }

    public final void a(Date date, Date date1)
    {
        a(date.getTime(), date1.getTime());
    }

    public final void a(boolean flag)
    {
        if (x != flag)
        {
            x = flag;
            s();
            g.J();
        }
    }

    public final void b(double d1)
    {
        if (!Double.isNaN(l) && m != d1)
        {
            m = d1;
            s();
            g.J();
        }
    }

    public final void b(double d1, double d2)
    {
        if (m != d1 || l != d2)
        {
            m = d1;
            l = d2;
            s();
            g.J();
        }
    }

    public final void b(Double double1)
    {
        i = double1;
        s();
        g.J();
    }

    public final boolean b()
    {
        return x;
    }

    public final double c()
    {
        return p;
    }

    public final void c(double d1)
    {
        double d2 = r;
        double d3 = s;
        d1 = (q - p) * d1;
        b(0.5D * (d2 + d3) - d1 / 2D, d1);
    }

    public final void c(double d1, double d2)
    {
        b(Math.min(d1, d2), Math.abs(d2 - d1));
    }

    public final void c(Double double1)
    {
        j = double1;
        s();
        g.J();
    }

    public final double d()
    {
        return q;
    }

    public final void d(double d1)
    {
        b((0.5D * (r + s)) / 2D - d1 / 2D, d1);
    }

    public final void d(double d1, double d2)
    {
        b(d1, d2);
    }

    public final double e()
    {
        return q - p;
    }

    public final void e(double d1)
    {
        b(d1);
    }

    public final void e(double d1, double d2)
    {
        c(d1, d2);
    }

    public final double f()
    {
        return r;
    }

    public final void f(double d1)
    {
        com.artfulbits.aiCharts.Base.a a1 = g.I();
        if (a1 != null)
        {
            a1.o();
        }
        double d2 = (r + s) / 2D;
        d1 = (s - r) * d1;
        b(d2 - d1 / 2D, d1);
    }

    protected final void f(double d1, double d2)
    {
        n = d1;
        o = d2;
        s();
        g.J();
    }

    public final double g()
    {
        return s;
    }

    public final void g(double d1)
    {
        d(d1);
    }

    public final double h()
    {
        return s - r;
    }

    public final double h(double d1)
    {
        return A * (d1 - y);
    }

    public final double i()
    {
        return t;
    }

    public final double i(double d1)
    {
        return y + z * d1;
    }

    protected final double j()
    {
        if (g.E() != ChartAxis.a) goto _L2; else goto _L1
_L1:
        u;
        JVM INSTR tableswitch 1 14: default 88
    //                   1 143
    //                   2 134
    //                   3 88
    //                   4 88
    //                   5 125
    //                   6 88
    //                   7 88
    //                   8 88
    //                   9 88
    //                   10 116
    //                   11 88
    //                   12 107
    //                   13 98
    //                   14 93;
           goto _L2 _L3 _L4 _L2 _L2 _L5 _L2 _L2 _L2 _L2 _L6 _L2 _L7 _L8 _L9
_L2:
        return t;
_L9:
        return t;
_L8:
        return t * 1000D;
_L7:
        return t * 60000D;
_L6:
        return t * 3600000D;
_L5:
        return t * 86400000D;
_L4:
        return t * 2592000000D;
_L3:
        return t * 946080000000D;
    }

    public final boolean j(double d1)
    {
        return d1 >= r && d1 <= s;
    }

    public final IntervalType k()
    {
        switch (u)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 11: // '\013'
        default:
            return IntervalType.a;

        case 14: // '\016'
            return IntervalType.b;

        case 13: // '\r'
            return IntervalType.c;

        case 12: // '\f'
            return IntervalType.d;

        case 10: // '\n'
            return IntervalType.e;

        case 5: // '\005'
            return IntervalType.f;

        case 2: // '\002'
            return IntervalType.g;

        case 1: // '\001'
            return IntervalType.h;
        }
    }

    public final Double l()
    {
        return j;
    }

    public final int m()
    {
        return v;
    }

    public final IntervalType n()
    {
        return k;
    }

    public final double o()
    {
        return m;
    }

    public final double p()
    {
        return l;
    }

    public final void q()
    {
        if (!Double.isNaN(m) || !Double.isNaN(m))
        {
            m = (0.0D / 0.0D);
            l = (0.0D / 0.0D);
            s();
            g.J();
        }
    }

    protected final boolean r()
    {
        return h == null || i == null;
    }

    protected final void s()
    {
        double d1;
        double d2;
        double d3;
        double d6;
        int ai[];
        boolean flag;
        ai = new int[2];
        int i1;
        if (g.E() == ChartAxis.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (h == null)
        {
            d1 = n;
        } else
        {
            d1 = h.doubleValue();
        }
        if (i == null)
        {
            d2 = o;
        } else
        {
            d2 = i.doubleValue();
        }
        d3 = (d2 - d1) / (double)v;
        i1 = -1;
        if (j != null)
        {
            d3 = j.doubleValue();
            d6 = d3;
            double d4;
            double d7;
            double d8;
            com.artfulbits.aiCharts.Base.a a1;
            if (flag)
            {
                if (k == null)
                {
                    i1 = 14;
                    d6 = d3;
                } else
                {
                    i1 = k.Field;
                    d6 = d3;
                }
            }
        } else
        if (flag)
        {
            a(d3, ai);
            d6 = ai[0];
            i1 = ai[1];
        } else
        {
            d6 = k(d3);
        }
        d3 = d1;
        if (w == 0.0D) goto _L2; else goto _L1
_L1:
        if (h == null) goto _L4; else goto _L3
_L3:
        d3 = d1;
        if (i != null) goto _L2; else goto _L4
_L4:
        a1 = g.I();
        if (w >= 0.0D) goto _L6; else goto _L5
_L5:
        if (w != -2D || !g.L()) goto _L8; else goto _L7
_L7:
        d8 = a1.m();
        d4 = d1;
        d7 = d2;
        if (d8 != 1.7976931348623157E+308D)
        {
            d3 = d1;
            if (h == null)
            {
                d3 = d1 - d8;
            }
            d4 = d3;
            d7 = d2;
            if (i == null)
            {
                d7 = d2 + d8;
                d4 = d3;
            }
        }
        d2 = d7;
        d1 = d4;
_L10:
        p = d1;
        q = d2;
        double d5;
        if (Double.isNaN(l))
        {
            r = d1;
            s = d2;
            t = d6;
            u = i1;
        } else
        {
            d3 = Math.min(d2 - d1, l);
            r = com.artfulbits.aiCharts.Base.v.a(m, d1, d2 - d3);
            s = r + d3;
            if (flag)
            {
                a(d3 / (double)v, ai);
                t = ai[0];
                u = ai[1];
            } else
            {
                t = k(d3 / (double)v);
            }
        }
        if (x)
        {
            y = s;
            z = r - s;
        } else
        {
            y = r;
            z = s - r;
        }
        A = 1.0D / z;
        g.K();
        return;
_L8:
        d5 = d1;
        if (h == null)
        {
            d5 = com.artfulbits.aiCharts.Base.v.b(d1, d6);
        }
        d3 = d5;
        if (i == null)
        {
            d2 = com.artfulbits.aiCharts.Base.v.a(d2, d6);
            d1 = d5;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
_L6:
        d5 = d1;
        if (h == null)
        {
            d5 = d1 - w;
        }
        d3 = d5;
        if (i == null)
        {
            d2 += w;
            d1 = d5;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        d1 = d3;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected final c t()
    {
        if (g.E() == ChartAxis.a)
        {
            return new a(r, s, (int)t, u);
        } else
        {
            return new b(r, s, t);
        }
    }

}
