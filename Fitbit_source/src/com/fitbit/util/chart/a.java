// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.chart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.Base.m;
import com.artfulbits.aiCharts.Base.p;
import com.artfulbits.aiCharts.Base.r;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.artfulbits.aiCharts.Types.e;
import com.artfulbits.aiCharts.Types.x;
import com.artfulbits.aiCharts.a.b;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.ui.charts.FadeChartStepAreaType;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.ui.charts.k;
import com.fitbit.ui.charts.u;
import com.fitbit.ui.charts.y;
import com.fitbit.ui.charts.z;
import com.fitbit.ui.g;
import com.fitbit.util.an;
import com.fitbit.util.ap;
import com.fitbit.util.bn;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.format.StartEndWeekDateFormat;
import com.fitbit.util.format.d;
import com.fitbit.util.i.i;
import com.fitbit.util.o;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

// Referenced classes of package com.fitbit.util.chart:
//            Filter

public class com.fitbit.util.chart.a
{
    public static interface a
    {

        public abstract List a();
    }

    public static class b extends c
    {

        private boolean a;

        public void a(ChartAxis chartaxis, List list)
        {
            if (a)
            {
                list.clear();
                a = false;
            }
            super.a(chartaxis, list);
        }

        public void b()
        {
            a = true;
        }

        public b(com.artfulbits.aiCharts.Base.ChartAxis.b b1)
        {
            super(b1);
        }
    }

    public static class c
        implements com.artfulbits.aiCharts.Base.ChartAxis.b, a
    {

        private com.artfulbits.aiCharts.Base.ChartAxis.b a;
        private List b;

        public List a()
        {
            return b;
        }

        public void a(ChartAxis chartaxis, List list)
        {
            a.a(chartaxis, list);
            b = list;
        }

        public c(com.artfulbits.aiCharts.Base.ChartAxis.b b1)
        {
            a = b1;
        }
    }

    public static class d
    {

        private int a;

        public int a()
        {
            return a;
        }

        public void a(int i1)
        {
            a = i1;
        }

        public d(int i1)
        {
            a = i1;
        }
    }


    public static final int a = 7;
    public static final String b = "MAIN_SERIES";
    public static final String c = "ANNOTATION_SERIES";
    public static final String d = "GOAL_INDICATOR_SERIES";
    public static final long e = 1000L;
    public static final long f = 60000L;
    public static final long g = 0xdbba0L;
    public static final long h = 0x36ee80L;
    public static final long i = 0x5265c00L;
    public static final long j = 0x240c8400L;
    public static final long k = 0x9a7ec800L;
    public static final long l = 0x757b12c00L;
    public static final double m = 18.5D;
    public static final double n = 25D;
    public static final double o = 30D;
    public static final String p = "--";

    public com.fitbit.util.chart.a()
    {
    }

    public static double a(double d1)
    {
        return 1.02D * d1;
    }

    public static double a(float f1, ChartAxis chartaxis)
    {
        RectF rectf = chartaxis.B();
        double d1 = (f1 - rectf.left) / rectf.width();
        return chartaxis.a().i(d1);
    }

    public static double a(float f1, ChartView chartview)
    {
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).e();
        RectF rectf = chartview.B();
        double d1 = (rectf.bottom - f1) / rectf.height();
        return chartview.a().i(d1);
    }

    public static double a(Filter.Type type, Class class1)
    {
        double d3 = 0.0D;
        static class _cls4
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[Filter.Type.values().length];
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    b[Filter.Type.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.i.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.j.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    b[Filter.Type.E.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    b[Filter.Type.F.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    b[Filter.Type.G.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.e.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[Filter.Type.f.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.g.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[Filter.Type.h.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.k.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.l.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.m.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[Filter.Type.n.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.o.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.p.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.t.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[Filter.Type.A.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.x.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[Filter.Type.B.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[Filter.Type.C.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[Filter.Type.D.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[Filter.Type.H.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[Filter.Type.q.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.fitbit.util.chart.Filter.Type.r.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[Filter.Type.s.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[Timeframe.values().length];
                try
                {
                    a[Timeframe.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Timeframe.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Timeframe.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Timeframe.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        double d1;
        double d2;
        if (class1.equals(com/artfulbits/aiCharts/Types/e) || class1.equals(com/fitbit/ui/charts/FadeChartStepAreaType))
        {
            d2 = e(type);
        } else
        {
            d2 = 0.0D;
        }
        d1 = d3;
        com.fitbit.util.chart._cls4.b[type.ordinal()];
        JVM INSTR tableswitch 1 25: default 152
    //                   1 160
    //                   2 160
    //                   3 160
    //                   4 174
    //                   5 174
    //                   6 160
    //                   7 174
    //                   8 181
    //                   9 155
    //                   10 155
    //                   11 155
    //                   12 167
    //                   13 181
    //                   14 155
    //                   15 155
    //                   16 188
    //                   17 188
    //                   18 188
    //                   19 155
    //                   20 160
    //                   21 155
    //                   22 174
    //                   23 181
    //                   24 188
    //                   25 188;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L2 _L3 _L4 _L5 _L5 _L5 _L6 _L4 _L5 _L5 _L7 _L7 _L7 _L5 _L2 _L5 _L3 _L4 _L7 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        d1 = d3;
_L9:
        return d2 + d1;
_L2:
        d1 = 21600000D;
        continue; /* Loop/switch isn't completed */
_L6:
        d1 = 75600000D;
        continue; /* Loop/switch isn't completed */
_L3:
        d1 = 43200000D;
        continue; /* Loop/switch isn't completed */
_L4:
        d1 = 201600000D;
        continue; /* Loop/switch isn't completed */
_L7:
        d1 = 259570815.45064378D;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static float a(double d1, ChartAxis chartaxis)
    {
        RectF rectf = chartaxis.B();
        d1 = chartaxis.a().h(d1);
        double d2 = rectf.width();
        return (float)((double)rectf.left + d1 * d2);
    }

    public static float a(double d1, ChartView chartview)
    {
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d();
        RectF rectf = chartview.B();
        d1 = chartview.a().h(d1);
        double d2 = rectf.width();
        return (float)((double)rectf.left + d1 * d2);
    }

    public static float a(ChartAxisScale chartaxisscale)
    {
        double d1 = chartaxisscale.h(chartaxisscale.f());
        return (float)(chartaxisscale.h(chartaxisscale.g()) - d1);
    }

    public static float a(com.artfulbits.aiCharts.Base.a a1, ChartSeries chartseries)
    {
        PointF pointf = new PointF();
        PointF pointf1 = new PointF();
        a1 = com.artfulbits.aiCharts.Base.m.a(chartseries, chartseries.H(), a1);
        chartseries = com.artfulbits.aiCharts.Base.p.a(chartseries);
        chartseries.a(((r) (a1)).a, 0.0D, pointf);
        chartseries.a(((r) (a1)).b, 0.0D, pointf1);
        return ((pointf1.x - pointf.x) * 3F) / 5F;
    }

    public static float a(ChartView chartview, Filter.Type type, Context context)
    {
        float f1 = c(type);
        int i1 = d(type);
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).g();
        float f2 = ((Rect) (chartview)).right - ((Rect) (chartview)).left;
        if (f2 > 0.0F && i1 > 0)
        {
            f2 = (float)Math.floor((f2 - f1 * f2) / (float)i1);
            f1 = f2;
            if (f2 > 1.0F)
            {
                f1 = f2 - 1.0F;
            }
            return f1;
        } else
        {
            return a(type, context).floatValue();
        }
    }

    public static int a(int i1)
    {
        int j1 = an.a(10, Math.max(an.a(i1) - 2, 0)) * 2;
        if (j1 <= 1)
        {
            return i1;
        } else
        {
            return com.fitbit.heartrate.charts.a.a(j1 / 2 + i1, j1);
        }
    }

    public static int a(int i1, float f1)
    {
        return a(i1, (int)((float)Color.alpha(i1) / f1));
    }

    public static int a(int i1, int j1)
    {
        return Color.argb(j1, Color.red(i1), Color.green(i1), Color.blue(i1));
    }

    public static int a(ActivityType activitytype)
    {
        if (activitytype != ActivityType.a && activitytype != ActivityType.b)
        {
            if (activitytype == ActivityType.c)
            {
                return -1;
            }
            if (activitytype == ActivityType.d)
            {
                return -1;
            }
            if (activitytype == ActivityType.e)
            {
                return -1;
            }
        }
        return 0x7f080576;
    }

    private static int a(List list, double d1)
    {
        if (!(list instanceof RandomAccess))
        {
            throw new IllegalArgumentException("list must be RandomAccess instance");
        }
        int j1 = 0;
        int k1 = list.size() - 1;
        int l1 = -1;
label0:
        do
        {
            int i1;
label1:
            {
label2:
                {
                    if (j1 > k1)
                    {
                        break label0;
                    }
                    i1 = j1 + k1 >>> 1;
                    int i2 = Double.valueOf(((j)list.get(i1)).a()).compareTo(Double.valueOf(d1));
                    if (i2 < 0)
                    {
                        i2 = i1 + 1;
                        j1 = k1;
                        k1 = i2;
                    } else
                    {
                        k1 = i1;
                        if (i2 <= 0)
                        {
                            break label2;
                        }
                        i2 = i1 - 1;
                        k1 = j1;
                        j1 = i2;
                    }
                    if (Math.abs(l1 - i1) > 2)
                    {
                        break label1;
                    }
                    if (((j)list.get(i1)).a() > d1)
                    {
                        double d2 = ((j)list.get(i1)).a() - d1;
                        j1 = i1 - 1;
                        k1 = i1;
                        do
                        {
                            i1 = k1;
                            if (j1 < 0)
                            {
                                break;
                            }
                            double d4 = Math.abs(((j)list.get(j1)).a() - d1);
                            i1 = k1;
                            if (d4 >= d2)
                            {
                                break;
                            }
                            d2 = d4;
                            k1 = j1;
                            j1--;
                        } while (true);
                    } else
                    if (((j)list.get(i1)).a() < d1)
                    {
                        double d3 = d1 - ((j)list.get(i1)).a();
                        j1 = i1 + 1;
                        k1 = i1;
                        do
                        {
                            i1 = k1;
                            if (j1 >= list.size())
                            {
                                break;
                            }
                            double d5 = Math.abs(d1 - ((j)list.get(j1)).a());
                            i1 = k1;
                            if (d5 >= d3)
                            {
                                break;
                            }
                            d3 = d5;
                            k1 = j1;
                            j1++;
                        } while (true);
                    }
                    k1 = i1;
                }
                return k1;
            }
            l1 = k1;
            k1 = j1;
            j1 = l1;
            l1 = i1;
        } while (true);
        return -1;
    }

    public static Shader a(int i1, int j1, float f1, int k1)
    {
        j1 = a(i1, j1);
        float f2 = k1;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(0.0F, 0.0F, f2, 0.0F, new int[] {
            j1, j1, i1
        }, new float[] {
            0.0F, f1, f1
        }, tilemode);
    }

    public static Shader a(Canvas canvas, int i1, int j1, float f1)
    {
        i1 = a(i1, j1 / 5);
        float f2 = canvas.getWidth();
        canvas = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(0.0F, 0.0F, f2, 0.0F, new int[] {
            0, 0, i1
        }, new float[] {
            0.0F, f1, f1
        }, canvas);
    }

    public static Shader a(Canvas canvas, int i1, m m1)
    {
        m1 = m1.e.a();
        double d1 = m1.c();
        double d2 = m1.d();
        double d3 = m1.f();
        double d4 = m1.g();
        double d5 = m1.e();
        float f3 = (float)((d3 - d1) / d5) / 5F;
        float f2 = 1.0F - (float)((d2 - d4) / d5) / 5F;
        Color.argb(88, Color.red(i1), Color.green(i1), Color.blue(i1));
        float f4 = canvas.getWidth();
        float f1 = f3;
        if (f3 > 0.1F)
        {
            f1 = 0.1F;
        }
        if (f2 < 0.9F)
        {
            f2 = 0.9F;
        }
        canvas = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(0.0F, 0.0F, f4, 0.0F, new int[] {
            0xffffff, i1, i1, 0xffffff
        }, new float[] {
            0.0F, f1, f2, 1.0F
        }, canvas);
    }

    public static com.artfulbits.aiCharts.Base.ChartAxis.b a(Context context, Timeframe timeframe)
    {
        switch (_cls4.a[timeframe.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return new y(context, timeframe);

        case 2: // '\002'
            return new k(context);

        case 3: // '\003'
            return new u(context, false);

        case 4: // '\004'
            return new z(context, false);
        }
    }

    public static j a(double d1, double d2, float f1, float f2, List list, boolean flag)
    {
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((j) (obj));
_L2:
        list = new ArrayList(list);
        int l1 = a(list, d1);
        obj = new HashSet();
        if (l1 >= 0)
        {
            for (int i1 = l1; i1 >= 0; i1--)
            {
                j j1 = (j)list.get(i1);
                if (j1.a() >= (double)f1 + d1 || j1.a() <= d1 - (double)f1)
                {
                    break;
                }
                if (flag && d2 < j1.a(0) + (double)f2 && d2 > (double)(-f2) || !flag && j1.a(0) > d2 - (double)f2 && j1.a(0) < (double)f2 + d2)
                {
                    ((Set) (obj)).add(j1);
                }
            }

            if (!flag)
            {
                for (int k1 = l1 + 1; k1 < list.size(); k1++)
                {
                    j j2 = (j)list.get(k1);
                    if (j2.a() >= (double)f1 + d1 || j2.a() <= d1 - (double)f1)
                    {
                        break;
                    }
                    if (j2.a(0) > d2 - (double)f2 && j2.a(0) < (double)f2 + d2)
                    {
                        ((Set) (obj)).add(j2);
                    }
                }

            }
        }
        Iterator iterator = ((Set) (obj)).iterator();
        list = null;
        do
        {
            obj = list;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (j)iterator.next();
            if (list == null)
            {
                list = ((List) (obj));
            } else
            {
                double d3 = Math.abs(list.a() - d1);
                double d4 = Math.abs(((j) (obj)).a() - d1);
                double d5 = Math.abs(list.a(0) - d2);
                double d6 = Math.abs(((j) (obj)).a(0) - d2);
                if (Math.pow(d3, 2D) + Math.pow(d5, 2D) > Math.pow(d4, 2D) + Math.pow(d6, 2D))
                {
                    list = ((List) (obj));
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static j a(l l1, double d1)
    {
        for (l1 = l1.iterator(); l1.hasNext();)
        {
            j j1 = (j)l1.next();
            if (j1.a() == d1)
            {
                return j1;
            }
        }

        return null;
    }

    public static j a(ChartView chartview, String s, MotionEvent motionevent)
    {
label0:
        {
            s = (ChartSeries)chartview.h().a(s);
            if (s == null)
            {
                return null;
            }
            double d1 = b(motionevent.getX(), chartview);
            double d2 = a((com.artfulbits.aiCharts.Base.a)chartview.g().get(0), ((ChartSeries) (s)));
            double d3 = a(motionevent.getY(), chartview);
            double d4 = c((int)ap.b(30F), chartview);
            double d5 = d((int)ap.b(30F), chartview);
            s = a(d1 - d2, d3, (float)d4, (float)d5, s.I(), true);
            if (s != null)
            {
                break label0;
            }
            Object obj = new ArrayList();
            chartview.a(Math.round(motionevent.getX()), Math.round(motionevent.getY()), ((List) (obj)));
            motionevent = ((List) (obj)).iterator();
            do
            {
                if (!motionevent.hasNext())
                {
                    break label0;
                }
                obj = motionevent.next();
            } while (!(obj instanceof j));
            s = (j)obj;
        }
        motionevent = s;
        if (!a(chartview, ((j) (s))))
        {
            motionevent = null;
        }
        return motionevent;
    }

    public static j a(List list, double d1, double d2)
    {
        int i1;
        i1 = a(list, d2);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_93;
        }
_L5:
        j j1;
        j j2;
        int k1;
        k1 = i1 - 1;
        j2 = (j)list.get(i1);
        j1 = j2;
        if (j2.a() <= d2) goto _L2; else goto _L1
_L1:
        if (k1 >= 0) goto _L4; else goto _L3
_L3:
        j1 = j2;
_L2:
label0:
        {
            if (j1 != null && j1.a() <= d2)
            {
                list = j1;
                if (j1.a() >= d1)
                {
                    break label0;
                }
            }
            list = null;
        }
        return list;
_L4:
        i1 = k1;
          goto _L5
        j1 = null;
          goto _L2
    }

    public static transient j a(List alist[])
    {
        Object obj1;
        int i1;
        int k1;
        obj1 = null;
        k1 = alist.length;
        i1 = 0;
_L5:
        Object obj;
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj = alist[i1];
        if (((List) (obj)).size() <= 0) goto _L2; else goto _L1
_L1:
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = (j)((List) (obj)).get(((List) (obj)).size() - 1);
_L6:
        i1++;
        obj1 = obj;
          goto _L5
_L4:
        j j1;
        j1 = (j)((List) (obj)).get(((List) (obj)).size() - 1);
        obj = j1;
        if (j1.a() > ((j) (obj1)).a()) goto _L6; else goto _L2
_L2:
        obj = obj1;
          goto _L6
        return ((j) (obj1));
    }

    public static g a(Context context)
    {
        g g1 = new g(context);
        g1.e().setColor(context.getResources().getColor(0x7f0f004e));
        g1.e().setPathEffect(new DashPathEffect(new float[] {
            15F, 5F
        }, 1.0F));
        g1.e().setStrokeWidth(ap.a(context, 2.0F));
        g1.b(ap.a(context, 12F));
        g1.f().setTypeface(Typeface.DEFAULT);
        g1.f().setTextSize(ap.a(10F));
        g1.f().setColor(context.getResources().getColor(0x7f0f004e));
        g1.c(ap.a(context, 20F));
        g1.c(true);
        return g1;
    }

    public static g a(Context context, int i1)
    {
        g g1 = new g(context);
        g1.a(context.getResources().getDrawable(0x7f02020d));
        g1.e().setColor(context.getResources().getColor(0x7f0f0172));
        g1.e().setPathEffect(null);
        g1.e().setStrokeWidth(ap.a(context, 1.0F));
        g1.b(ap.a(context, 16F));
        g1.f().setColor(context.getResources().getColor(i1));
        g1.c(ap.a(context, 0.0F));
        g1.c(true);
        return g1;
    }

    public static g a(Context context, ActivityType activitytype, double d1)
    {
        if (t.a(activitytype) == null)
        {
            return null;
        }
        int i1 = 0x7f0f015c;
        if (activitytype == ActivityType.f)
        {
            i1 = 0x7f0f016a;
        }
        activitytype = a(context, i1);
        activitytype.a(context.getResources().getDrawable(0x7f02020c));
        activitytype.a(d1);
        if (d1 > 1000D)
        {
            activitytype.c((int)ap.b(10F));
            activitytype.b(context.getResources().getString(0x7f080576, new Object[] {
                com.fitbit.util.format.e.d(d1)
            }));
            return activitytype;
        } else
        {
            activitytype.c((int)ap.b(10F));
            activitytype.b(com.fitbit.util.format.e.a(d1));
            return activitytype;
        }
    }

    public static Float a(Filter.Type type, Context context)
    {
        switch (com.fitbit.util.chart._cls4.b[type.ordinal()])
        {
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 16: // '\020'
        default:
            return Float.valueOf(10F);

        case 19: // '\023'
            return Float.valueOf(context.getResources().getDimension(0x7f0a00a2));

        case 2: // '\002'
        case 3: // '\003'
            return Float.valueOf(context.getResources().getDimension(0x7f0a00a4));

        case 4: // '\004'
        case 5: // '\005'
            return Float.valueOf(context.getResources().getDimension(0x7f0a00a3));

        case 14: // '\016'
        case 15: // '\017'
            return Float.valueOf(context.getResources().getDimension(0x7f0a00a1));

        case 17: // '\021'
        case 18: // '\022'
            return Float.valueOf(context.getResources().getDimension(0x7f0a00a5));
        }
    }

    public static String a(double d1, int i1)
    {
        i1 = an.a(i1);
        return com.fitbit.util.format.e.c(d1, Math.min(Math.max(0, i1 - 1 - an.a((int)d1)), an.b(d1, i1 - 1)));
    }

    public static String a(Context context, Date date, Timeframe timeframe)
    {
        switch (_cls4.a[timeframe.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return com.fitbit.util.format.e.f(context, date);

        case 3: // '\003'
            return (new StartEndWeekDateFormat()).format(date);

        case 4: // '\004'
            return com.fitbit.util.format.d.z(context).format(date);
        }
    }

    public static transient String a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s = as[i1];
            if (s.contains("\n"))
            {
                throw new IllegalArgumentException("Label cannot contain \\n");
            }
            stringbuilder.append(s).append("\n");
        }

        return stringbuilder.toString();
    }

    public static Comparator a(Filter.Type type)
    {
        return new Comparator(type) {

            final Filter.Type a;

            public int a(Calendar calendar, Calendar calendar1)
            {
                int i1;
                int j1;
                i1 = 1;
                j1 = Integer.valueOf(calendar.get(1)).compareTo(Integer.valueOf(calendar1.get(1)));
                com.fitbit.util.chart._cls4.b[a.ordinal()];
                JVM INSTR tableswitch 1 18: default 120
            //                           1 125
            //                           2 125
            //                           3 125
            //                           4 125
            //                           5 125
            //                           6 125
            //                           7 125
            //                           8 125
            //                           9 125
            //                           10 125
            //                           11 125
            //                           12 152
            //                           13 152
            //                           14 152
            //                           15 152
            //                           16 152
            //                           17 194
            //                           18 194;
                   goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L3 _L3 _L3 _L4 _L4
_L1:
                i1 = j1;
_L8:
                return i1;
_L2:
                if (j1 != 0) goto _L1; else goto _L5
_L5:
                return Integer.valueOf(calendar.get(6)).compareTo(Integer.valueOf(calendar1.get(6)));
_L3:
                if (j1 != 0) goto _L1; else goto _L6
_L6:
                long l1;
                l1 = Math.abs(calendar.getTimeInMillis() - calendar1.getTimeInMillis());
                if (Math.abs(l1) < 0x240c8400L)
                {
                    return 0;
                }
                if (l1 >= 0L) goto _L8; else goto _L7
_L7:
                return -1;
_L4:
                return Integer.valueOf(calendar.get(2)).compareTo(Integer.valueOf(calendar1.get(2)));
            }

            public int compare(Object obj, Object obj1)
            {
                return a((Calendar)obj, (Calendar)obj1);
            }

            
            {
                a = type;
                super();
            }
        };
    }

    public static Date a(Filter.Type type, Date date)
    {
        GregorianCalendar gregoriancalendar;
        gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTime(date);
        com.fitbit.util.chart._cls4.b[type.ordinal()];
        JVM INSTR tableswitch 1 28: default 148
    //                   1 193
    //                   2 208
    //                   3 208
    //                   4 248
    //                   5 248
    //                   6 208
    //                   7 248
    //                   8 257
    //                   9 218
    //                   10 228
    //                   11 228
    //                   12 238
    //                   13 257
    //                   14 257
    //                   15 257
    //                   16 277
    //                   17 296
    //                   18 296
    //                   19 182
    //                   20 208
    //                   21 248
    //                   22 248
    //                   23 257
    //                   24 277
    //                   25 277
    //                   26 321
    //                   27 342
    //                   28 342;
           goto _L1 _L2 _L3 _L3 _L4 _L4 _L3 _L4 _L5 _L6 _L7 _L7 _L8 _L5 _L5 _L5 _L9 _L10 _L10 _L11 _L3 _L4 _L4 _L5 _L9 _L9 _L12 _L13 _L13
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Provider invalid type '").append(type).append("'").toString());
_L11:
        gregoriancalendar.add(5, -1);
        return gregoriancalendar.getTime();
_L2:
        gregoriancalendar.add(5, -7);
_L14:
        return com.fitbit.util.o.d(gregoriancalendar.getTime());
_L3:
        gregoriancalendar.add(5, -6);
        continue; /* Loop/switch isn't completed */
_L6:
        gregoriancalendar.add(5, -14);
        continue; /* Loop/switch isn't completed */
_L7:
        gregoriancalendar.add(5, -13);
        continue; /* Loop/switch isn't completed */
_L8:
        gregoriancalendar.add(5, -35);
        continue; /* Loop/switch isn't completed */
_L4:
        gregoriancalendar.add(2, -1);
        continue; /* Loop/switch isn't completed */
_L5:
        gregoriancalendar.add(2, -3);
        gregoriancalendar.set(7, gregoriancalendar.getFirstDayOfWeek());
        continue; /* Loop/switch isn't completed */
_L9:
        gregoriancalendar.add(1, -1);
        gregoriancalendar.set(7, gregoriancalendar.getFirstDayOfWeek());
        continue; /* Loop/switch isn't completed */
_L10:
        gregoriancalendar.add(2, -11);
        gregoriancalendar.set(5, gregoriancalendar.getActualMaximum(5));
        return com.fitbit.util.o.a(gregoriancalendar.getTime());
_L12:
        gregoriancalendar.add(5, -450);
        gregoriancalendar.set(7, gregoriancalendar.getFirstDayOfWeek());
        if (true) goto _L14; else goto _L13
_L13:
        gregoriancalendar.add(2, -17);
        gregoriancalendar.set(5, gregoriancalendar.getActualMaximum(5));
        return com.fitbit.util.o.a(gregoriancalendar.getTime());
    }

    public static void a(Context context, Paint paint)
    {
        int i1 = com.fitbit.util.i.i.a(context, 0x7f010016, -1);
        paint.setColor(com.fitbit.util.i.i.b(context, i1, 0x7f010013, 0x7f0f0172));
        paint.setTextSize(com.fitbit.util.i.i.a(context, i1, 0x7f010015, 1.0F));
        paint.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
    }

    public static void a(Context context, ChartAxis chartaxis)
    {
        Paint paint = chartaxis.s();
        paint.setColor(context.getResources().getColor(0x7f0f008a));
        paint.setStrokeWidth(context.getResources().getDimension(0x7f0a00ac));
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        chartaxis.a(true);
        chartaxis.e(true);
        chartaxis.k().setColor(context.getResources().getColor(0x7f0f007a));
        chartaxis.k().setTextSize(context.getResources().getDimension(0x7f0a00b4));
        chartaxis.k().setTypeface(FitbitFont.h.a(context, Typeface.DEFAULT));
        chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        chartaxis.a(Alignment.c);
    }

    public static void a(Context context, ChartView chartview, int i1, double d1, String s)
    {
        ChartNamedCollection chartnamedcollection = chartview.h();
        ChartSeries chartseries = (ChartSeries)chartnamedcollection.a("GOAL_INDICATOR_SERIES");
        Object obj = chartseries;
        if (chartseries == null)
        {
            obj = new ChartSeries("GOAL_INDICATOR_SERIES", x.h);
            ((ChartSeries) (obj)).a(Integer.valueOf(-1));
            chartnamedcollection.add(obj);
        }
        obj = ((ChartSeries) (obj)).F();
        double d2 = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a().c();
        double d3 = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a().d();
        ((l) (obj)).a();
        ((l) (obj)).clear();
        ((l) (obj)).b(new j(d2, new double[] {
            d1
        }));
        ((l) (obj)).b(new j(d3, new double[] {
            d1
        }));
        ((l) (obj)).b();
        context = com.fitbit.ui.charts.i.a(context, "GOAL_INDICATOR_SERIES", 0, i1, s);
        chartview.k().clear();
        chartview.k().add(context);
    }

    public static void a(Context context, ChartView chartview, List list, double d1)
    {
        chartview.k().clear();
        ChartNamedCollection chartnamedcollection = chartview.h();
        ChartSeries chartseries1 = (ChartSeries)chartnamedcollection.a("ANNOTATION_SERIES");
        ChartSeries chartseries = chartseries1;
        if (chartseries1 == null)
        {
            chartseries = new ChartSeries("ANNOTATION_SERIES", x.p);
            chartseries.a(Integer.valueOf(0));
            chartseries.a(com.artfulbits.aiCharts.Types.i.c, Float.valueOf(0.0F));
            chartnamedcollection.add(chartseries);
        }
        chartseries.F().a(list, new com.artfulbits.aiCharts.Base.t(d1) {

            final double a;

            public j a(Object obj1, j j1)
            {
                obj1 = (Long)obj1;
                if (j1 != null)
                {
                    j1.a(((Long) (obj1)).longValue(), a);
                    return j1;
                } else
                {
                    return new j(((Long) (obj1)).longValue(), new double[] {
                        a
                    });
                }
            }

            public volatile Object a(Object obj1, Object obj2)
            {
                return a(obj1, (j)obj2);
            }

            
            {
                a = d1;
                super();
            }
        });
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            Object obj = com.fitbit.util.o.d(((Long)list.get(i1)).longValue());
            com.artfulbits.aiCharts.a.b b1 = com.artfulbits.aiCharts.a.b.a("ANNOTATION_SERIES", i1);
            obj = new com.artfulbits.aiCharts.a.d(((String) (obj)));
            ((com.artfulbits.aiCharts.a.d) (obj)).a(Alignment.b, Alignment.c);
            ((com.artfulbits.aiCharts.a.d) (obj)).a(b1);
            ((com.artfulbits.aiCharts.a.d) (obj)).a(false);
            com.fitbit.activity.ui.charts.a.a(context, ((com.artfulbits.aiCharts.a.d) (obj)).f());
            chartview.k().add(obj);
        }

    }

    public static void a(ChartAxis chartaxis, Context context, ValueGoal valuegoal)
    {
        if (chartaxis == null || context == null || valuegoal == null)
        {
            throw new IllegalArgumentException("The ChartAxis, context, or goal passed in can not be null");
        } else
        {
            double d1 = valuegoal.p().doubleValue();
            valuegoal = new com.artfulbits.aiCharts.Base.ChartAxis.a(Double.valueOf(d1).toString(), d1);
            valuegoal.a(context.getResources().getDrawable(0x7f02020c));
            valuegoal.a(0x800005);
            context = chartaxis.b();
            context.add(context.size() - 1, valuegoal);
            chartaxis.F().a(chartaxis, context);
            return;
        }
    }

    public static void a(ChartView chartview)
    {
        com.artfulbits.aiCharts.Base.a a1;
        for (chartview = chartview.g().iterator(); chartview.hasNext(); a1.k())
        {
            a1 = (com.artfulbits.aiCharts.Base.a)chartview.next();
            ChartAxis chartaxis = a1.d();
            ChartAxis chartaxis1 = a1.e();
            com.artfulbits.aiCharts.Base.ChartAxis.b b1 = chartaxis.F();
            com.artfulbits.aiCharts.Base.ChartAxis.b b2 = chartaxis1.F();
            if (b1 != null)
            {
                chartaxis.a(null);
                chartaxis.a(b1);
            }
            if (b2 != null)
            {
                chartaxis1.a(null);
                chartaxis1.a(b2);
            }
        }

    }

    public static void a(ChartView chartview, Context context)
    {
        b(chartview, context);
        ChartAxis chartaxis = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d();
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).e();
        float f1 = TypedValue.applyDimension(2, 12F, context.getResources().getDisplayMetrics());
        chartaxis.k().setTextSize(f1);
        chartview.k().setTextSize(f1);
        chartaxis.k().setColor(context.getResources().getColor(0x7f0f0011));
        chartview.k().setColor(context.getResources().getColor(0x7f0f0011));
        chartview.b(new ChartUtils._cls2());
    }

    public static transient void a(ChartView chartview, Date date, Date date1, Filter.Type type, boolean flag, List alist[])
    {
        date = a(type, date1);
        double d1 = date.getTime();
        double d2 = date1.getTime();
        int j1 = alist.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            date1 = alist[i1];
            if (date1.size() <= 0)
            {
                continue;
            }
            date1 = (j)date1.get(0);
            if (date1.a() < d1)
            {
                d1 = date1.a();
            }
        }

        date1 = new GregorianCalendar(bn.b());
        date1.setTimeInMillis((long)d1);
        com.fitbit.util.o.a(date1);
        d1 = date1.getTimeInMillis();
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a();
        chartview.a(Double.valueOf(d1 - 450000D));
        chartview.b(Double.valueOf(450000D + d2));
        if (flag)
        {
            chartview.c(date.getTime() - 0x6ddd0L, 450000D + d2);
        }
    }

    public static void a(String s, List list, ChartView chartview, double d1, int i1, int j1, Integer integer)
    {
        ChartSeries chartseries1 = (ChartSeries)chartview.h().a(s);
        ChartSeries chartseries = (ChartSeries)chartview.h().a((new StringBuilder()).append(s).append("area").toString());
        if (chartseries1 == null)
        {
            chartseries = new ChartSeries();
            chartseries.a(s);
            chartseries.a(x.t);
            chartseries.d(integer);
            chartview.h().add(chartseries);
            chartseries.a(Integer.valueOf(i1));
            chartseries.c(Integer.valueOf(i1));
            chartseries1 = new ChartSeries();
            chartseries1.a((new StringBuilder()).append(s).append("area").toString());
            chartseries1.a(x.h);
            chartseries1.d(integer);
            chartview.h().add(chartseries1);
            chartseries1.a(Integer.valueOf(j1));
            chartseries1.c(Integer.valueOf(j1));
            chartview = chartseries1;
            s = chartseries;
        } else
        {
            chartview = chartseries1;
            s = chartseries;
        }
        chartview.F().clear();
        s.F().clear();
        if (list != null && list.size() > 0)
        {
            chartview.F().b(new j(d1, new double[] {
                ((j)list.get(0)).b()[0]
            }));
            chartview.F().b(new j(((j)list.get(0)).a(), new double[] {
                ((j)list.get(0)).b()[0]
            }));
            s.F().b(new j(d1, new double[] {
                ((j)list.get(0)).b()[0]
            }));
            s.F().b(new j(((j)list.get(0)).a(), new double[] {
                ((j)list.get(0)).b()[0]
            }));
        }
    }

    public static void a(List list)
    {
        Collections.sort(list, new Comparator() {

            public int a(j j1, j j2)
            {
                return Double.compare(j1.a(), j2.a());
            }

            public int compare(Object obj, Object obj1)
            {
                return a((j)obj, (j)obj1);
            }

        });
    }

    public static boolean a(ChartView chartview, j j1)
    {
        if (chartview != null && j1 != null)
        {
            double d1 = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a().f();
            double d2 = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a().g();
            double d3 = j1.a();
            if (d3 >= d1 && d3 <= d2)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean a(List list, List list1)
    {
        j j1;
        j j2;
        int i1;
        boolean flag;
        boolean flag1;
        if (list.size() == list1.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag) goto _L2; else goto _L1
_L1:
        i1 = 0;
_L7:
        flag1 = flag;
        if (i1 >= list.size()) goto _L2; else goto _L3
_L3:
        j1 = (j)list.get(i1);
        j2 = (j)list1.get(i1);
        if (j1.a() == j2.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L5; else goto _L4
_L4:
        flag1 = flag;
_L2:
        return flag1;
_L5:
        if (j1.a(0) == j2.a(0))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return flag;
        }
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String[] a(String s)
    {
        return s.split("\n");
    }

    public static double b(float f1, ChartView chartview)
    {
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d();
        RectF rectf = chartview.B();
        double d1 = (f1 - rectf.left) / rectf.width();
        return chartview.a().i(d1);
    }

    public static float b(double d1, ChartAxis chartaxis)
    {
        RectF rectf = chartaxis.B();
        d1 = chartaxis.a().h(d1);
        return (float)((double)rectf.bottom - (double)rectf.height() * d1);
    }

    public static float b(double d1, ChartView chartview)
    {
        chartview = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).e();
        RectF rectf = chartview.B();
        d1 = chartview.a().h(d1);
        return (float)((double)rectf.bottom - (double)rectf.height() * d1);
    }

    public static Shader b(int i1, int j1, float f1, int k1)
    {
        j1 = a(i1, j1);
        float f2 = k1;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(0.0F, 0.0F, f2, 0.0F, new int[] {
            j1, j1, i1, i1
        }, new float[] {
            0.0F, f1, f1, 1.0F
        }, tilemode);
    }

    public static j b(List list, double d1, double d2)
    {
        int i1;
        i1 = a(list, d1);
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_99;
        }
_L5:
        j j1;
        j j2;
        int k1;
        k1 = i1 + 1;
        j2 = (j)list.get(i1);
        j1 = j2;
        if (j2.a() >= d1) goto _L2; else goto _L1
_L1:
        if (k1 < list.size()) goto _L4; else goto _L3
_L3:
        j1 = j2;
_L2:
label0:
        {
            if (j1 != null && j1.a() >= d1)
            {
                list = j1;
                if (j1.a() <= d2)
                {
                    break label0;
                }
            }
            list = null;
        }
        return list;
_L4:
        i1 = k1;
          goto _L5
        j1 = null;
          goto _L2
    }

    public static g b(Context context)
    {
        g g1 = new g(context);
        Object obj = g1.e();
        ((Paint) (obj)).setColor(context.getResources().getColor(0x7f0f005d));
        ((Paint) (obj)).setPathEffect(new DashPathEffect(new float[] {
            10F, 5F
        }, 1.0F));
        ((Paint) (obj)).setStrokeWidth(ap.a(context, 2.0F));
        obj = g1.f();
        ((TextPaint) (obj)).setColor(context.getResources().getColor(0x7f0f005d));
        ((TextPaint) (obj)).setTypeface(Typeface.DEFAULT_BOLD);
        ((TextPaint) (obj)).setTextSize(ap.a(context, 12F));
        g1.c(ap.a(context, 15F));
        return g1;
    }

    public static String b(Context context, Timeframe timeframe)
    {
        switch (_cls4.a[timeframe.ordinal()])
        {
        default:
            return context.getResources().getString(0x7f080540);

        case 3: // '\003'
            return context.getResources().getString(0x7f08051e);

        case 4: // '\004'
            return context.getResources().getString(0x7f08051d);
        }
    }

    public static DateFormat b(Filter.Type type)
    {
        if (type != com.fitbit.util.chart.Filter.Type.t);
        return null;
    }

    public static void b(ChartView chartview, Context context)
    {
        chartview.setScrollBarStyle(0x1000000);
        com.artfulbits.aiCharts.Base.a a1 = new com.artfulbits.aiCharts.Base.a();
        a1.a(0, ap.a(context, 60F), 0, 0);
        a1.a("area");
        ChartAxis chartaxis = a1.d();
        ChartAxis chartaxis1 = a1.e();
        chartaxis1.a(com.fitbit.util.chart.Filter.b(Filter.Type.a, context));
        chartaxis.a().a(0.0D);
        chartaxis.a(false);
        chartaxis1.a(true);
        chartaxis1.s().setColor(context.getResources().getColor(0x7f0f004f));
        chartaxis1.s().setPathEffect(new DashPathEffect(new float[] {
            2.0F, 1.0F
        }, 1.0F));
        chartaxis.s().setColor(context.getResources().getColor(0x7f0f004f));
        chartaxis.s().setPathEffect(new DashPathEffect(new float[] {
            2.0F, 1.0F
        }, 1.0F));
        chartaxis.b(com.fitbit.util.format.d.y(context));
        chartaxis1.a().a(Double.valueOf(-0.001D));
        chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        chartaxis.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelLayoutMode.c);
        chartaxis1.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelPosition.a);
        chartaxis1.k().setColor(0xff888888);
        chartaxis.k().setColor(0xff888888);
        chartaxis1.k().setTextSize(ap.a(context, 10F));
        chartaxis.k().setTextSize(ap.a(context, 10F));
        chartaxis.b(false);
        chartaxis1.b(false);
        chartaxis1.a(com.artfulbits.aiCharts.Base.ChartAxis.TickMarkMode.b);
        chartaxis1.a(com.artfulbits.aiCharts.Base.ChartAxis.LabelLayoutMode.c);
        chartaxis1.b(new ChartUtils._cls3());
        chartview.g().add(a1);
    }

    public static void b(ChartView chartview, j j1)
    {
        if (j1 == null)
        {
            return;
        } else
        {
            ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a().b(Double.valueOf(j1.a() + 1000D));
            return;
        }
    }

    public static transient void b(ChartView chartview, Date date, Date date1, Filter.Type type, boolean flag, List alist[])
    {
        if (type == com.fitbit.util.chart.Filter.Type.t)
        {
            a(chartview, date, date1, type, flag, alist);
        } else
        {
            ChartAxisScale chartaxisscale = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a();
            Comparator comparator = a(type);
            Date date2 = a(type, date1);
            double d5 = Math.min(date.getTime(), date2.getTime());
            double d6 = date1.getTime();
            GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.b());
            gregoriancalendar.setTime(date1);
            double d1 = 1.7976931348623157E+308D;
            double d3 = 4.9406564584124654E-324D;
            int j1 = alist.length;
            int i1 = 0;
            date = com/artfulbits/aiCharts/Types/ChartLineType;
            while (i1 < j1) 
            {
                Object obj = alist[i1];
                double d4 = d3;
                double d2 = d1;
                if (((List) (obj)).size() > 0)
                {
                    date = (j)((List) (obj)).get(0);
                    d2 = d1;
                    if (date.a() < d1)
                    {
                        d2 = date.a();
                    }
                    date = date.c().H().getClass();
                    obj = (j)((List) (obj)).get(((List) (obj)).size() - 1);
                    if (((j) (obj)).a() > d3)
                    {
                        d4 = ((j) (obj)).a();
                    } else
                    {
                        d4 = d3;
                    }
                }
                i1++;
                d3 = d4;
                d1 = d2;
            }
            d4 = a(type, date);
            if (d1 != 1.7976931348623157E+308D && d3 != 4.9406564584124654E-324D)
            {
                type = new GregorianCalendar(bn.b());
                type.setTimeInMillis((long)d1);
                d2 = Math.min(d1, date2.getTime());
                type.setTimeInMillis((long)d3);
                if (comparator.compare(type, gregoriancalendar) == 0)
                {
                    d1 = type.getTimeInMillis();
                } else
                if (date.equals(com/artfulbits/aiCharts/Types/e))
                {
                    d1 = com.fitbit.util.o.d(date1).getTime();
                } else
                {
                    d1 = com.fitbit.util.o.f(date1).getTime();
                }
            } else
            {
                d1 = d6;
                d2 = d5;
            }
            chartview = chartview.h().iterator();
            do
            {
                if (!chartview.hasNext())
                {
                    break;
                }
                date = (ChartSeries)chartview.next();
                if (date.H() instanceof com.fitbit.ui.a)
                {
                    ((com.fitbit.ui.a)date.H()).a(d1);
                }
            } while (true);
            chartaxisscale.a(Double.valueOf(d2 - d4));
            chartaxisscale.b(Double.valueOf(d1 + d4));
            if (flag)
            {
                chartaxisscale.c((double)date2.getTime() - d4, d1 + d4);
                return;
            }
        }
    }

    public static TimeSeriesObject[] b(List list)
    {
        TimeSeriesObject atimeseriesobject[] = new TimeSeriesObject[7];
        if (list == null)
        {
            return atimeseriesobject;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            TimeSeriesObject timeseriesobject = (TimeSeriesObject)list.next();
            int i1 = 0;
            while (i1 < 7) 
            {
                if (com.fitbit.util.o.j(new Date(System.currentTimeMillis() - (long)((6 - i1) * 24 * 60 * 60 * 1000)), timeseriesobject.a()))
                {
                    atimeseriesobject[i1] = timeseriesobject;
                }
                i1++;
            }
        }

        return atimeseriesobject;
    }

    public static double c(float f1, ChartView chartview)
    {
        return Math.abs(b(0.0F, chartview) - b(f1, chartview));
    }

    public static float c(double d1, ChartView chartview)
    {
        ChartAxisScale chartaxisscale = ((com.artfulbits.aiCharts.Base.a)chartview.g().get(0)).d().a();
        return Math.abs(a(chartaxisscale.f(), chartview) - a(chartaxisscale.f() + d1, chartview));
    }

    private static float c(Filter.Type type)
    {
        switch (com.fitbit.util.chart._cls4.b[type.ordinal()])
        {
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 19: // '\023'
        default:
            return 0.25F;

        case 2: // '\002'
        case 3: // '\003'
            return 0.4F;

        case 17: // '\021'
        case 18: // '\022'
            return 0.4F;
        }
    }

    public static int c(List list, double d1, double d2)
    {
        int k1;
        k1 = a(list, d2);
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
_L5:
        j j1;
        j j2;
        int i1;
        i1 = k1 - 1;
        j2 = (j)list.get(k1);
        j1 = j2;
        k1 = i1;
        if (j2.a() <= d2) goto _L2; else goto _L1
_L1:
        if (i1 >= 0) goto _L4; else goto _L3
_L3:
        k1 = i1;
        j1 = j2;
_L2:
        if (j1 == null || j1.a() > d2 || j1.a() < d1)
        {
            return -1;
        } else
        {
            return k1 + 1;
        }
_L4:
        k1 = i1;
          goto _L5
        j1 = null;
          goto _L2
    }

    public static double d(float f1, ChartView chartview)
    {
        return Math.abs(a(0.0F, chartview) - a(f1, chartview));
    }

    private static int d(Filter.Type type)
    {
        switch (com.fitbit.util.chart._cls4.b[type.ordinal()])
        {
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 16: // '\020'
        default:
            return 0;

        case 19: // '\023'
            return 96;

        case 2: // '\002'
        case 3: // '\003'
            return 7;

        case 4: // '\004'
        case 5: // '\005'
            return 31;

        case 14: // '\016'
        case 15: // '\017'
            return 14;

        case 17: // '\021'
        case 18: // '\022'
            return 12;
        }
    }

    public static int d(List list, double d1, double d2)
    {
        int k1;
        k1 = a(list, d1);
        if (k1 < 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
_L5:
        j j1;
        j j2;
        int i1;
        i1 = k1 + 1;
        j2 = (j)list.get(k1);
        j1 = j2;
        k1 = i1;
        if (j2.a() >= d1) goto _L2; else goto _L1
_L1:
        if (i1 < list.size()) goto _L4; else goto _L3
_L3:
        k1 = i1;
        j1 = j2;
_L2:
        if (j1 == null || j1.a() < d1 || j1.a() > d2)
        {
            return -1;
        } else
        {
            return k1 - 1;
        }
_L4:
        k1 = i1;
          goto _L5
        j1 = null;
          goto _L2
    }

    private static double e(Filter.Type type)
    {
        switch (com.fitbit.util.chart._cls4.b[type.ordinal()])
        {
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 19: // '\023'
        case 21: // '\025'
        default:
            return 0.0D;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return 17280000D;

        case 4: // '\004'
        case 5: // '\005'
        case 12: // '\f'
        case 20: // '\024'
        case 22: // '\026'
            return 10800000D;

        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 23: // '\027'
            return 302400000D;

        case 16: // '\020'
            return 201600000D;

        case 17: // '\021'
        case 18: // '\022'
        case 24: // '\030'
            return 864000000D;
        }
    }

    // Unreferenced inner class com/fitbit/util/chart/ChartUtils$2

/* anonymous class */
    static final class ChartUtils._cls2 extends Format
    {

        private static final long serialVersionUID = 1L;

        public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
        {
            return stringbuffer.append(com.fitbit.util.format.e.e(((Double)obj).doubleValue()));
        }

        public Object parseObject(String s, ParsePosition parseposition)
        {
            return null;
        }

    }


    // Unreferenced inner class com/fitbit/util/chart/ChartUtils$3

/* anonymous class */
    static final class ChartUtils._cls3 extends Format
    {

        private static final long serialVersionUID = 1L;

        public StringBuffer format(Object obj, StringBuffer stringbuffer, FieldPosition fieldposition)
        {
            return stringbuffer.append(com.fitbit.util.format.e.a(((Double)obj).doubleValue()));
        }

        public Object parseObject(String s, ParsePosition parseposition)
        {
            return null;
        }

    }

}
