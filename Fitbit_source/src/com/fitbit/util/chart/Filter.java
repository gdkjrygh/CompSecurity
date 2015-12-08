// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import android.graphics.RectF;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.k;
import com.fitbit.ui.charts.u;
import com.fitbit.ui.charts.y;
import com.fitbit.ui.charts.z;
import com.fitbit.util.al;
import com.fitbit.util.ap;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.text.Format;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.util.chart:
//            TimeIntervalType, a

public class Filter
{
    public static final class Type extends Enum
    {

        public static final Type A;
        public static final Type B;
        public static final Type C;
        public static final Type D;
        public static final Type E;
        public static final Type F;
        public static final Type G;
        public static final Type H;
        private static final Type I[];
        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        public static final Type h;
        public static final Type i;
        public static final Type j;
        public static final Type k;
        public static final Type l;
        public static final Type m;
        public static final Type n;
        public static final Type o;
        public static final Type p;
        public static final Type q;
        public static final Type r;
        public static final Type s;
        public static final Type t;
        public static final Type u;
        public static final Type v;
        public static final Type w;
        public static final Type x;
        public static final Type y;
        public static final Type z;

        public static Type valueOf(String s1)
        {
            return (Type)Enum.valueOf(com/fitbit/util/chart/Filter$Type, s1);
        }

        public static Type[] values()
        {
            return (Type[])I.clone();
        }

        public TimeIntervalType a()
        {
            static class _cls5
            {

                static final int a[];

                static 
                {
                    a = new int[Type.values().length];
                    try
                    {
                        a[Type.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror26) { }
                    try
                    {
                        a[Type.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror25) { }
                    try
                    {
                        a[Type.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror24) { }
                    try
                    {
                        a[com.fitbit.util.chart.Type.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror23) { }
                    try
                    {
                        a[Type.f.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror22) { }
                    try
                    {
                        a[Type.g.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror21) { }
                    try
                    {
                        a[Type.w.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror20) { }
                    try
                    {
                        a[Type.A.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror19) { }
                    try
                    {
                        a[Type.E.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror18) { }
                    try
                    {
                        a[Type.h.ordinal()] = 10;
                    }
                    catch (NoSuchFieldError nosuchfielderror17) { }
                    try
                    {
                        a[Type.i.ordinal()] = 11;
                    }
                    catch (NoSuchFieldError nosuchfielderror16) { }
                    try
                    {
                        a[com.fitbit.util.chart.Type.j.ordinal()] = 12;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        a[com.fitbit.util.chart.Type.k.ordinal()] = 13;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        a[Type.l.ordinal()] = 14;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        a[Type.m.ordinal()] = 15;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    try
                    {
                        a[Type.x.ordinal()] = 16;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        a[com.fitbit.util.chart.Type.y.ordinal()] = 17;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        a[Type.C.ordinal()] = 18;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        a[Type.G.ordinal()] = 19;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        a[Type.n.ordinal()] = 20;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[com.fitbit.util.chart.Type.o.ordinal()] = 21;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[Type.p.ordinal()] = 22;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[Type.D.ordinal()] = 23;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[Type.H.ordinal()] = 24;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[Type.F.ordinal()] = 25;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[Type.t.ordinal()] = 26;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[Type.B.ordinal()] = 27;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls5.a[ordinal()])
            {
            default:
                return TimeIntervalType.g;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
                return com.fitbit.util.chart.TimeIntervalType.e;

            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
                return TimeIntervalType.f;
            }
        }

        static 
        {
            a = new Type("NONE", 0);
            b = new Type("WEEK_WEIGHT", 1);
            c = new Type("WEEK_ACTIVITY", 2);
            d = new Type("WEEK_SLEEP", 3);
            e = new Type("TWO_WEEKS_WEIGHT", 4);
            f = new Type("TWO_WEEKS_ACTIVITY", 5);
            g = new Type("TWO_WEEKS_SLEEP", 6);
            h = new Type("MONTH_WEIGHT", 7);
            i = new Type("MONTH_ACTIVITY", 8);
            j = new Type("MONTH_SLEEP", 9);
            k = new Type("THREE_MONTHS_WEIGHT", 10);
            l = new Type("THREE_MONTHS_ACTIVITY", 11);
            m = new Type("THREE_MONTHS_SLEEP", 12);
            n = new Type("YEAR_WEIGHT", 13);
            o = new Type("YEAR_ACTIVITY", 14);
            p = new Type("YEAR_SLEEP", 15);
            q = new Type("ONE_AND_HALF_YEAR_WEIGHT", 16);
            r = new Type("ONE_AND_HALF_YEAR_ACTIVITY", 17);
            s = new Type("ONE_AND_HALF_YEAR_SLEEP", 18);
            t = new Type("INTRADAY_ACTIVITY", 19);
            u = new Type("INTRADAY_SLEEP", 20);
            v = new Type("DAY_HEART_RATE", 21);
            w = new Type("WEEK_HEART_RATE", 22);
            x = new Type("MONTH_HEART_RATE", 23);
            y = new Type("THREE_MONTHS_HEART_RATE", 24);
            z = new Type("YEAR_HEART_RATE", 25);
            A = new Type("WEEK_EXERCISE_HEART_RATE", 26);
            B = new Type("MONTH_EXERCISE_HEART_RATE", 27);
            C = new Type("THREE_MONTHS_EXERCISE_HEART_RATE", 28);
            D = new Type("YEAR_EXERCISE_HEART_RATE", 29);
            E = new Type("WEEK_RESTING_HEART_RATE", 30);
            F = new Type("MONTH_RESTING_HEART_RATE", 31);
            G = new Type("THREE_MONTHS_RESTING_HEART_RATE", 32);
            H = new Type("YEAR_RESTING_HEART_RATE", 33);
            I = (new Type[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H
            });
        }

        private Type(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static interface a
    {

        public abstract void a(j j1);

        public abstract void a(List list);
    }


    private Type a;

    public Filter(Type type)
    {
        a = type;
    }

    public static com.artfulbits.aiCharts.Base.ChartAxis.b a(Type type, Context context)
    {
        com/fitbit/util/chart/Filter;
        JVM INSTR monitorenter ;
        int i = _cls5.a[type.ordinal()];
        i;
        JVM INSTR tableswitch 1 27: default 136
    //                   1 197
    //                   2 169
    //                   3 169
    //                   4 197
    //                   5 197
    //                   6 197
    //                   7 136
    //                   8 182
    //                   9 182
    //                   10 222
    //                   11 235
    //                   12 235
    //                   13 222
    //                   14 235
    //                   15 235
    //                   16 136
    //                   17 136
    //                   18 248
    //                   19 261
    //                   20 222
    //                   21 300
    //                   22 300
    //                   23 287
    //                   24 274
    //                   25 210
    //                   26 143
    //                   27 210;
           goto _L1 _L2 _L3 _L3 _L2 _L2 _L2 _L1 _L4 _L4 _L5 _L6 _L6 _L5 _L6 _L6 _L1 _L1 _L7 _L8 _L5 _L9 _L9 _L10 _L11 _L12 _L13 _L12
_L9:
        break MISSING_BLOCK_LABEL_300;
_L1:
        type = null;
_L15:
        com/fitbit/util/chart/Filter;
        JVM INSTR monitorexit ;
        return type;
_L13:
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b() {

            Calendar a;

            public void a(ChartAxis chartaxis, List list)
            {
                double d2 = chartaxis.a().f();
                double d3 = chartaxis.a().g();
                a.setTimeInMillis((long)d2);
                a.set(11, 0);
                a.set(12, 0);
                a.set(13, 0);
                a.set(14, 0);
                list.clear();
                for (double d1 = a.getTimeInMillis(); d1 < d3; d1 = a.getTimeInMillis())
                {
                    if (d1 >= d2 + 0.0D && d1 <= d3 - 0.0D)
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                        chartaxis.a(a.getTimeInMillis());
                        chartaxis.a(e.e(a.getTimeInMillis()));
                        list.add(chartaxis);
                    }
                    a.add(11, 2);
                }

            }

            
            {
                a = o.c();
            }
        };
_L16:
        type = new a.c(type);
        if (true) goto _L15; else goto _L14
_L14:
        type;
        throw type;
_L3:
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b(type, context) {

            Calendar a;
            final Type b;
            final Context c;

            public void a(ChartAxis chartaxis, List list)
            {
                chartaxis.a().c();
                chartaxis.a().d();
                double d2 = chartaxis.a().f();
                double d3 = chartaxis.a().g();
                a.setTimeInMillis((long)d2);
                o.b(a);
                list.clear();
                for (double d1 = a.getTimeInMillis(); d1 < d3; d1 = a.getTimeInMillis())
                {
                    if (d1 >= d2 + 0.0D && d1 <= d3 - 0.0D)
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                        chartaxis.a(a.getTimeInMillis());
                        chartaxis.a(b.a().a(c, b, a.getTimeInMillis()));
                        list.add(chartaxis);
                    }
                    a.add(5, 1);
                }

            }

            
            {
                b = type;
                c = context;
                super();
                a = o.c();
            }
        };
          goto _L16
_L4:
        type = new y(context, Timeframe.a);
          goto _L16
_L2:
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b(type, context) {

            Calendar a;
            final Type b;
            final Context c;

            public void a(ChartAxis chartaxis, List list)
            {
                chartaxis.a().c();
                chartaxis.a().d();
                double d2 = chartaxis.a().f();
                double d3 = chartaxis.a().g();
                a.setTimeInMillis((long)d2);
                o.c(a);
                list.clear();
                for (double d1 = a.getTimeInMillis(); d1 < d3; d1 = a.getTimeInMillis())
                {
                    if (d1 >= d2 + 0.0D && d1 <= d3 - 0.0D)
                    {
                        chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                        if (Filter.b(b))
                        {
                            chartaxis.b(chartaxis.f() | 2);
                        }
                        chartaxis.a(a.getTimeInMillis());
                        chartaxis.a(b.a().a(c, b, a.getTimeInMillis()));
                        list.add(chartaxis);
                    }
                    a.add(5, 1);
                }

            }

            
            {
                b = type;
                c = context;
                super();
                a = new GregorianCalendar();
            }
        };
          goto _L16
_L12:
        type = new k(context);
          goto _L16
_L5:
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b(type, context) {

            final Type a;
            final Context b;

            public void a(ChartAxis chartaxis, List list)
            {
                double d1;
                double d2;
                double d3;
                int l;
                chartaxis = chartaxis.a();
                d1 = chartaxis.f();
                d2 = chartaxis.d() - com.fitbit.util.chart.a.a(a, com/artfulbits/aiCharts/Types/ChartLineType);
                d3 = chartaxis.g();
                l = 1;
                if (a != com.fitbit.util.chart.Type.k) goto _L2; else goto _L1
_L1:
                l = 2;
_L4:
                chartaxis = o.b((long)d2);
                Calendar calendar = o.b((long)d3);
                int i1 = (int)((chartaxis.getTimeInMillis() - calendar.getTimeInMillis()) / (0x240c8400L * (long)l));
                if (i1 > 0)
                {
                    chartaxis.add(5, -i1 * (l * 7));
                }
                list.clear();
                do
                {
                    double d4 = chartaxis.getTimeInMillis();
                    if (d4 <= d2 - 0.0D && d4 >= 0.0D + d1)
                    {
                        com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                        if (Filter.b(a))
                        {
                            a1.b(a1.f() | 2);
                        }
                        list.add(a1);
                        a1.a(chartaxis.getTimeInMillis());
                        a1.a(a.a().a(b, a, chartaxis.getTimeInMillis()));
                    }
                    chartaxis.add(5, l * -7);
                } while ((double)chartaxis.getTimeInMillis() > d1);
                return;
_L2:
                if (a == Type.n)
                {
                    l = 6;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = type;
                b = context;
                super();
            }
        };
          goto _L16
_L6:
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b(type, context) {

            Calendar a;
            final Type b;
            final Context c;

            public void a(ChartAxis chartaxis, List list)
            {
                a.setTime(new Date());
                double d1 = chartaxis.a().f();
                if (a.get(5) > 15)
                {
                    a.set(5, 15);
                } else
                {
                    a.set(5, 1);
                }
                list.clear();
                do
                {
                    o.b(a);
                    chartaxis = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                    list.add(chartaxis);
                    chartaxis.a(a.getTimeInMillis());
                    chartaxis.a(b.a().a(c, b, a.getTimeInMillis()));
                    if (a.get(5) == 15)
                    {
                        a.set(5, 1);
                    } else
                    {
                        a.add(6, -1);
                        a.set(5, 15);
                    }
                } while ((double)a.getTimeInMillis() > d1);
            }

            
            {
                b = type;
                c = context;
                super();
                a = new GregorianCalendar(bn.b(), al.a());
            }
        };
          goto _L16
_L7:
        type = new u(context, false);
          goto _L16
_L8:
        type = new u(context, true);
          goto _L16
_L11:
        type = new z(context, true);
          goto _L16
_L10:
        type = new z(context, false);
          goto _L16
        type = new com.artfulbits.aiCharts.Base.ChartAxis.b(type) {

            final Type a;

            public void a(ChartAxis chartaxis, List list)
            {
                chartaxis = chartaxis.a();
                double d1 = chartaxis.f();
                double d2 = chartaxis.d() - com.fitbit.util.chart.a.a(a, com/artfulbits/aiCharts/Types/ChartLineType);
                chartaxis = new GregorianCalendar();
                chartaxis.setTime(new Date((long)d2));
                o.f(chartaxis);
                list.clear();
                do
                {
                    double d3 = chartaxis.getTimeInMillis();
                    if (d3 <= d2 - 0.0D && d3 >= 0.0D + d1)
                    {
                        com.artfulbits.aiCharts.Base.ChartAxis.a a1 = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                        list.add(a1);
                        a1.a(chartaxis.getTimeInMillis());
                        a1.a(e.d(chartaxis.getTimeInMillis()));
                        if (chartaxis.get(2) == 0)
                        {
                            com.artfulbits.aiCharts.Base.ChartAxis.a a2 = new com.artfulbits.aiCharts.Base.ChartAxis.a(null, 0.0D);
                            list.add(a2);
                            a2.a(chartaxis.getTimeInMillis());
                            a2.a((new StringBuilder()).append(chartaxis.get(1)).append("").toString());
                        }
                    }
                    chartaxis.add(2, -1);
                    chartaxis.set(5, chartaxis.getActualMaximum(5));
                } while ((double)chartaxis.getTimeInMillis() > d1);
            }

            
            {
                a = type;
                super();
            }
        };
          goto _L16
    }

    public static Filter a(Type type)
    {
        switch (_cls5.a[type.ordinal()])
        {
        case 7: // '\007'
        case 8: // '\b'
        case 16: // '\020'
        case 17: // '\021'
        default:
            return new Filter(type);

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            return new Filter(type) {

                public List a(List list, a a1)
                {
                    ArrayList arraylist = new ArrayList();
                    GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.b());
                    GregorianCalendar gregoriancalendar1 = new GregorianCalendar(bn.b());
                    int i = 0;
                    while (i < list.size()) 
                    {
                        j j1 = (j)list.get(i);
                        gregoriancalendar1.setTimeInMillis((long)j1.a());
                        gregoriancalendar1.set(11, 0);
                        gregoriancalendar1.set(12, 0);
                        gregoriancalendar1.set(13, 0);
                        gregoriancalendar1.set(14, 0);
                        if (i == 0)
                        {
                            j1 = new j(gregoriancalendar1.getTimeInMillis(), new double[] {
                                j1.a(0)
                            });
                            arraylist.add(j1);
                            if (a1 != null)
                            {
                                a1.a(j1);
                            }
                        } else
                        {
                            gregoriancalendar.setTimeInMillis((long)((j)arraylist.get(arraylist.size() - 1)).a());
                            if (gregoriancalendar.get(1) != gregoriancalendar1.get(1) || gregoriancalendar.get(2) != gregoriancalendar1.get(2) || gregoriancalendar.get(5) != gregoriancalendar1.get(5))
                            {
                                j1 = new j(gregoriancalendar1.getTimeInMillis(), new double[] {
                                    j1.a(0)
                                });
                                arraylist.add(j1);
                                if (a1 != null)
                                {
                                    a1.a(j1);
                                }
                            }
                        }
                        i++;
                    }
                    return arraylist;
                }

            };

        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
            return new Filter(type, type) {

                final Type a;

                public List a(List list, a a1)
                {
                    ArrayList arraylist;
                    GregorianCalendar gregoriancalendar;
                    ArrayList arraylist1;
                    ArrayList arraylist2;
                    int i;
                    arraylist = new ArrayList();
                    gregoriancalendar = new GregorianCalendar(bn.b());
                    if (list.size() > 0)
                    {
                        o.d(gregoriancalendar);
                    }
                    i = list.size() - 1;
                    arraylist1 = new ArrayList();
                    arraylist2 = new ArrayList();
                    if (i < 0) goto _L2; else goto _L1
_L1:
                    j j1;
                    ArrayList arraylist3;
                    j1 = (j)list.get(i);
                    arraylist3 = new ArrayList();
_L5:
                    if (j1.a() < (double)gregoriancalendar.getTimeInMillis())
                    {
                        break MISSING_BLOCK_LABEL_206;
                    }
                    arraylist3.add(j1);
                    i--;
                    if (i >= 0) goto _L4; else goto _L3
_L3:
                    int l = i;
_L6:
                    if (arraylist3.size() > 0)
                    {
                        arraylist1.add(arraylist3);
                        arraylist2.add(gregoriancalendar.getTime());
                    }
                    gregoriancalendar.add(3, -1);
                    i = l;
                    if (l >= 0) goto _L1; else goto _L2
_L2:
                    return Filter.a(a, a1, arraylist, arraylist1, arraylist2);
_L4:
                    j1 = (j)list.get(i);
                      goto _L5
                    l = i;
                      goto _L6
                }

            
            {
                a = type1;
                super(type);
            }
            };

        case 21: // '\025'
        case 22: // '\026'
            return new Filter(type, type) {

                final Type a;

                public List a(List list, a a1)
                {
                    ArrayList arraylist;
                    GregorianCalendar gregoriancalendar;
                    ArrayList arraylist1;
                    ArrayList arraylist2;
                    int i;
                    arraylist = new ArrayList();
                    gregoriancalendar = new GregorianCalendar(bn.b());
                    if (list.size() > 0)
                    {
                        o.f(gregoriancalendar);
                    }
                    i = list.size() - 1;
                    arraylist1 = new ArrayList();
                    arraylist2 = new ArrayList();
                    if (i < 0) goto _L2; else goto _L1
_L1:
                    j j1;
                    ArrayList arraylist3;
                    Date date;
                    j1 = (j)list.get(i);
                    arraylist3 = new ArrayList();
                    date = new Date(gregoriancalendar.getTimeInMillis());
                    gregoriancalendar.add(2, -1);
                    gregoriancalendar.set(5, gregoriancalendar.getActualMaximum(5));
_L5:
                    if (j1.a() <= (double)gregoriancalendar.getTimeInMillis())
                    {
                        break MISSING_BLOCK_LABEL_229;
                    }
                    arraylist3.add(j1);
                    i--;
                    if (i >= 0) goto _L4; else goto _L3
_L3:
                    int l = i;
_L6:
                    if (arraylist3.size() > 0)
                    {
                        arraylist1.add(arraylist3);
                        arraylist2.add(date);
                    }
                    i = l;
                    if (l >= 0) goto _L1; else goto _L2
_L2:
                    return Filter.a(a, a1, arraylist, arraylist1, arraylist2);
_L4:
                    j1 = (j)list.get(i);
                      goto _L5
                    l = i;
                      goto _L6
                }

            
            {
                a = type1;
                super(type);
            }
            };

        case 23: // '\027'
        case 24: // '\030'
            return new Filter(type, type) {

                final Type a;

                public List a(List list, a a1)
                {
                    GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.b());
                    o.g(gregoriancalendar);
                    ArrayList arraylist = new ArrayList();
                    ArrayList arraylist1 = new ArrayList();
                    Object obj = new ArrayList();
                    Object obj1 = new Date(gregoriancalendar.getTimeInMillis());
                    int i = list.size() - 1;
                    while (i >= 0) 
                    {
                        Object obj2 = (j)list.get(i);
                        boolean flag;
                        if ((long)((j) (obj2)).a() >= ((Date) (obj1)).getTime())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            ((List) (obj)).add(obj2);
                            i--;
                            obj2 = obj1;
                            obj1 = obj;
                            obj = obj2;
                        } else
                        {
                            if (((List) (obj)).size() > 0)
                            {
                                arraylist.add(obj);
                                arraylist1.add(obj1);
                            }
                            obj1 = new ArrayList();
                            gregoriancalendar.add(2, -1);
                            gregoriancalendar.set(5, 1);
                            obj = new Date(gregoriancalendar.getTimeInMillis());
                        }
                        obj2 = obj1;
                        obj1 = obj;
                        obj = obj2;
                    }
                    if (((List) (obj)).size() > 0)
                    {
                        arraylist.add(obj);
                        arraylist1.add(obj1);
                    }
                    list = new ArrayList();
                    return Filter.a(a, a1, list, arraylist, arraylist1);
                }

            
            {
                a = type1;
                super(type);
            }
            };

        case 9: // '\t'
        case 25: // '\031'
            return new Filter(type) {

                public List a(List list, a a1)
                {
                    a1 = new ArrayList();
                    list = list.iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        j j1 = (j)list.next();
                        if (j1.a(0) > 0.01D)
                        {
                            a1.add(new j(j1));
                        }
                    } while (true);
                    return a1;
                }

            };
        }
    }

    static List a(Type type, a a1, List list, List list1, List list2)
    {
        return b(type, a1, list, list1, list2);
    }

    public static com.artfulbits.aiCharts.Base.ChartAxis.b b(Type type, Context context)
    {
        com/fitbit/util/chart/Filter;
        JVM INSTR monitorenter ;
        type = new a.b(ChartAxis.b, context) {

            final Context a;

            public void a(ChartAxis chartaxis, List list)
            {
                super.a(chartaxis, list);
                com.artfulbits.aiCharts.Base.ChartAxis.a a1;
                if (list != null && list.size() != 0)
                {
                    a1 = (com.artfulbits.aiCharts.Base.ChartAxis.a)list.get(0);
                    double d1;
                    com.artfulbits.aiCharts.Base.ChartAxis.a a3;
                    if (Math.abs((float)((double)chartaxis.B().bottom - chartaxis.a().h(a1.b()) * (double)chartaxis.B().height()) - (float)((double)chartaxis.B().bottom - chartaxis.a().h(chartaxis.a().f()) * (double)chartaxis.B().height())) < (float)ap.a(a, 14F))
                    {
                        if (chartaxis.x() != null)
                        {
                            a1.a(chartaxis.x().format(Double.valueOf(a1.b())));
                        } else
                        {
                            a1.a(e.e(a1.b()));
                        }
                    }
                }
                if (list != null && list.size() > 2)
                {
                    a1 = (com.artfulbits.aiCharts.Base.ChartAxis.a)list.get(list.size() - 1);
                    com.artfulbits.aiCharts.Base.ChartAxis.a a2 = (com.artfulbits.aiCharts.Base.ChartAxis.a)list.get(list.size() - 2);
                    a3 = (com.artfulbits.aiCharts.Base.ChartAxis.a)list.get(list.size() - 3);
                    if (chartaxis.x() != null)
                    {
                        a1.a(chartaxis.x().format(Double.valueOf(a1.b())));
                        a2.a(chartaxis.x().format(Double.valueOf(a2.b())));
                    } else
                    {
                        a1.a(e.e(a1.b()));
                        a2.a(e.e(a2.b()));
                    }
                    d1 = a1.b() - a2.b();
                    if (d1 != a2.b() - a3.b() && d1 != 0.0D)
                    {
                        list.remove(list.size() - 1);
                    }
                }
            }

            
            {
                a = context;
                super(b1);
            }
        };
        com/fitbit/util/chart/Filter;
        JVM INSTR monitorexit ;
        return type;
        type;
        throw type;
    }

    private static List b(Type type, a a1, List list, List list1, List list2)
    {
        int i = list1.size() - 1;
        while (i >= 0) 
        {
            Object obj = (List)list1.get(i);
            if (a1 != null)
            {
                a1.a(((List) (obj)));
            }
            double d1 = 0.0D;
            double d2 = 0.0D;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                d1 += ((j)((Iterator) (obj)).next()).a(0);
                d2 = 1.0D + d2;
            }

            double d3 = ((Date)list2.get(i)).getTime();
            if (!d(type))
            {
                d1 /= d2;
            }
            obj = new j(d3, new double[] {
                d1
            });
            if (a1 != null)
            {
                a1.a(((j) (obj)));
            }
            list.add(obj);
            i--;
        }
        return list;
    }

    static boolean b(Type type)
    {
        return c(type);
    }

    private static boolean c(Type type)
    {
        return type == Type.b || type == Type.h || type == com.fitbit.util.chart.Type.k || type == Type.n;
    }

    private static boolean d(Type type)
    {
        return type == Type.C || type == Type.D;
    }

    public Type a()
    {
        return a;
    }

    public List a(List list)
    {
        return a(list, ((a) (null)));
    }

    public List a(List list, a a1)
    {
        if (a1 != null)
        {
            for (Iterator iterator = list.iterator(); iterator.hasNext(); a1.a((j)iterator.next())) { }
        }
        return list;
    }

    public boolean b()
    {
        return a != Type.a && a != Type.b && a != com.fitbit.util.chart.Type.e && a != Type.h;
    }
}
