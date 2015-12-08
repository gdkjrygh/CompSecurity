// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.charts;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.artfulbits.aiCharts.Base.ChartAxisScale;
import com.artfulbits.aiCharts.Base.ChartCollection;
import com.artfulbits.aiCharts.Base.ChartNamedCollection;
import com.artfulbits.aiCharts.Base.ChartSeries;
import com.artfulbits.aiCharts.Base.j;
import com.artfulbits.aiCharts.Base.l;
import com.artfulbits.aiCharts.ChartView;
import com.artfulbits.aiCharts.Enums.Alignment;
import com.artfulbits.aiCharts.Types.ChartLineType;
import com.artfulbits.aiCharts.Types.x;
import com.artfulbits.aiCharts.a.b;
import com.artfulbits.aiCharts.a.c;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.ui.charts.Timeframe;
import com.fitbit.util.ap;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.format.StartEndWeekDateFormat;
import com.fitbit.util.format.d;
import com.fitbit.util.format.e;
import com.fitbit.util.i.i;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.fitbit.heartrate.charts:
//            c

public final class a
{

    public static final float a = 220F;
    public static final String b = "Fat Burn";
    public static final String c = "Cardio";
    public static final String d = "MAIN_SERIES";
    public static final String e = "Fat Burn Fade";
    public static final int f = 8;
    private static final float g = 50F;
    private static final float h = 0.09F;
    private static final float i = 0.11F;

    public a()
    {
    }

    public static final float a()
    {
        return FitBitApplication.a().getResources().getConfiguration().orientation != 2 ? 0.11F : 0.09F;
    }

    public static float a(Date date)
    {
        return 50F;
    }

    public static int a(int k, int i1)
    {
        if (k > 0)
        {
            return k - k % i1;
        } else
        {
            return 0;
        }
    }

    public static Shader a(Context context, int k, double d1, double d2, double d3, 
            double d4)
    {
        d4 = (double)k / (d3 - d4);
        k = (int)(-(d1 - d3) * d4);
        int i1 = (int)(d4 * (d3 - d2));
        int j1 = context.getResources().getColor(0x7f0f00d4);
        int k1 = context.getResources().getColor(0x7f0f00d2);
        return new LinearGradient(0.0F, k, 0.0F, i1, j1, k1, android.graphics.Shader.TileMode.CLAMP);
    }

    public static j a(List list)
    {
        return (j)Collections.min(list, new Comparator() {

            public int a(j j1, j j2)
            {
                return Double.compare(j1.a(0), j2.a(0));
            }

            public int compare(Object obj, Object obj1)
            {
                return a((j)obj, (j)obj1);
            }

        });
    }

    public static Timeframe a(com.fitbit.util.chart.Filter.Type type)
    {
        static class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.util.chart.Filter.Type.values().length];
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.E.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.A.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.F.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.B.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.G.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.C.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.H.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.D.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.w.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.x.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.y.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.util.chart.Filter.Type.z.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[type.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
        case 2: // '\002'
            return Timeframe.a;

        case 3: // '\003'
        case 4: // '\004'
            return Timeframe.b;

        case 5: // '\005'
        case 6: // '\006'
            return Timeframe.c;

        case 7: // '\007'
        case 8: // '\b'
            return Timeframe.d;
        }
    }

    public static String a(Context context, Date date, com.fitbit.util.chart.Filter.Type type)
    {
        switch (_cls3.a[type.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 9: // '\t'
        case 10: // '\n'
            return com.fitbit.util.format.e.f(context, date);

        case 5: // '\005'
        case 6: // '\006'
        case 11: // '\013'
            return (new StartEndWeekDateFormat()).format(date);

        case 7: // '\007'
        case 8: // '\b'
        case 12: // '\f'
            return com.fitbit.util.format.d.z(context).format(date);
        }
    }

    public static List a(ChartSeries chartseries, Context context, ChartAxis chartaxis)
    {
        boolean flag1 = true;
        ArrayList arraylist = new ArrayList();
        if (chartseries == null || chartseries.I() == null || chartseries.I().size() == 0)
        {
            return arraylist;
        }
        double d1 = chartaxis.a().f();
        double d2 = chartaxis.a().g();
        chartaxis = chartseries.F();
        Object obj = com.fitbit.util.chart.a.b(chartseries.I(), d1, d2);
        chartseries = com.fitbit.util.chart.a.a(chartseries.I(), d1, d2);
        if (obj == null || chartseries == null)
        {
            return arraylist;
        }
        obj = chartaxis.subList(chartaxis.a(((j) (obj))), chartaxis.a(chartseries) + 1);
        if (((List) (obj)).size() == 0)
        {
            return arraylist;
        }
        chartseries = b(((List) (obj)));
        obj = a(((List) (obj)));
        if (((j) (obj)).b() == chartseries.b())
        {
            return arraylist;
        }
        int k;
        int i1;
        boolean flag;
        if (chartaxis.a(((j) (obj))) < chartaxis.a(chartseries))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist.add(com.fitbit.heartrate.charts.c.a(context, "MAIN_SERIES", chartaxis.a(((j) (obj))), (int)((j) (obj)).a(0), flag));
        k = chartaxis.a(chartseries);
        i1 = (int)chartseries.a(0);
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        arraylist.add(com.fitbit.heartrate.charts.c.a(context, "MAIN_SERIES", k, i1, flag));
        return arraylist;
    }

    public static java.util.Map.Entry a(LinkedHashMap linkedhashmap, int k)
    {
        return (java.util.Map.Entry)(new ArrayList(linkedhashmap.entrySet())).get(k - 1);
    }

    public static void a(Context context, Paint paint)
    {
        paint.setColor(com.fitbit.util.i.i.b(context, com.fitbit.util.i.i.a(context, 0x7f010016, -1), 0x7f010003, 0x7f0f0167));
    }

    public static void a(Context context, ChartCollection chartcollection, b b1)
    {
        c c1 = new c(context.getResources().getDrawable(0x7f0203af));
        c1.a(Alignment.b, Alignment.c);
        c1.a((int)ap.b(12F));
        c1.a(b1);
        com.artfulbits.aiCharts.a.d d1 = new com.artfulbits.aiCharts.a.d(context.getResources().getString(0x7f080540));
        d1.a(Alignment.b, Alignment.c);
        d1.a((int)ap.b(11F));
        d1.a(false);
        d1.b(false);
        d1.f().setTextAlign(android.graphics.Paint.Align.CENTER);
        d1.a(b1);
        c(context, d1.f());
        chartcollection.add(c1);
        chartcollection.add(d1);
    }

    public static void a(Context context, ChartNamedCollection chartnamedcollection, l l1, Paint paint)
    {
        int k = 0;
        int i1 = 0;
        while (k < l1.size()) 
        {
label0:
            {
                boolean flag1 = ((Boolean)l1.a(k).a(ChartLineType.j)).booleanValue();
                ChartSeries chartseries;
                l l2;
                int j1;
                boolean flag;
                if (k == l1.size() - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag1)
                {
                    j1 = i1;
                    if (!flag)
                    {
                        break label0;
                    }
                }
                chartseries = new ChartSeries((new StringBuilder()).append("series-").append(String.valueOf(k)).toString(), x.x);
                chartseries.d(Integer.valueOf(context.getResources().getDimensionPixelSize(0x7f0a00e3)));
                chartseries.c(paint);
                l2 = chartseries.F();
                a(((Collection) (l1.subList(i1, k + 1))), ((Collection) (l2)));
                j1 = k + 1;
                chartnamedcollection.add(chartseries);
            }
            k++;
            i1 = j1;
        }
    }

    public static void a(Context context, ChartView chartview, List list, com.fitbit.util.chart.Filter.Type type)
    {
        context = (ChartSeries)chartview.h().a("MAIN_SERIES");
        context.F().clear();
        chartview = list.iterator();
        do
        {
            if (!chartview.hasNext())
            {
                break;
            }
            list = (j)chartview.next();
            if (list.a(0) != 0.0D)
            {
                list = new j(list.a(), new double[] {
                    (double)Math.round(list.a(0))
                });
                context.F().b(list);
            }
        } while (true);
    }

    public static void a(Context context, List list)
    {
        context = context.getResources().getDrawable(0x7f02011c);
        for (int k = 0; k < list.size(); k++)
        {
            ((j)list.get(k)).c(context);
        }

    }

    private static void a(Collection collection, Collection collection1)
    {
        for (collection = collection.iterator(); collection.hasNext(); collection1.add(new j((j)collection.next()))) { }
    }

    public static float b(Date date)
    {
        return (float)(220D - an.a().b().b(new Date()));
    }

    public static int b(int k, int i1)
    {
        int j1 = Math.max(k, i1);
        k = j1;
        if (j1 % i1 != 0)
        {
            k = (j1 / i1 + 1) * i1;
        }
        return k;
    }

    public static j b(List list)
    {
        return (j)Collections.max(list, new Comparator() {

            public int a(j j1, j j2)
            {
                return Double.compare(j1.a(0), j2.a(0));
            }

            public int compare(Object obj, Object obj1)
            {
                return a((j)obj, (j)obj1);
            }

        });
    }

    public static void b(Context context, Paint paint)
    {
        int k = com.fitbit.util.i.i.a(context, 0x7f010016, -1);
        paint.setColor(com.fitbit.util.i.i.b(context, k, 0x7f01000f, 0x7f0f0172));
        paint.setStrokeWidth(com.fitbit.util.i.i.a(context, k, 0x7f010010, 1.0F));
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setAlpha(com.fitbit.util.i.i.a(context, k, 0x7f01000e, 30));
    }

    public static float c(Date date)
    {
        return (float)(220D - an.a().b().b(date));
    }

    public static com.fitbit.weight.ui.b.a c(List list)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        com.fitbit.weight.ui.b.a a1 = new com.fitbit.weight.ui.b.a();
        ArrayList arraylist = new ArrayList();
        for (int k = 1; k <= 3; k++)
        {
            ArrayList arraylist1 = new ArrayList();
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                HeartRateDailySummary heartratedailysummary = (HeartRateDailySummary)iterator.next();
                double d1 = 0.0D;
                Iterator iterator1 = heartratedailysummary.c().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    Object obj = (HeartRateZone)iterator1.next();
                    if (((HeartRateZone) (obj)).c().equals(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.values()[k]))
                    {
                        if (linkedhashmap.size() + 1 == k)
                        {
                            linkedhashmap.put(((HeartRateZone) (obj)).f(), arraylist1);
                        }
                        int i1 = ((HeartRateZone) (obj)).e();
                        obj = new j(heartratedailysummary.a().getTime(), new double[] {
                            (double)i1
                        });
                        arraylist1.add(obj);
                        arraylist.add(obj);
                        a1.f = a1.f + (double)i1;
                        d1 += i1;
                    }
                } while (true);
                double d2 = d1;
                if (a1.d > d1)
                {
                    d2 = a1.d;
                }
                a1.d = d2;
            }

        }

        a1.a = arraylist;
        a1.c = linkedhashmap;
        return a1;
    }

    public static void c(Context context, Paint paint)
    {
        int k = com.fitbit.util.i.i.a(context, 0x7f010016, -1);
        paint.setColor(com.fitbit.util.i.i.b(context, k, 0x7f010013, 0x7f0f0172));
        paint.setTextSize(com.fitbit.util.i.i.a(context, k, 0x7f010015, 1.0F));
        paint.setTypeface(FitbitFont.g.a(context, Typeface.DEFAULT));
    }
}
