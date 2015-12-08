// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.util.bn;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.data.bl:
//            c, bs, ez, e

public abstract class SyncDataForLongPeriodOperation extends c
{
    public static final class Ranges extends Enum
    {

        public static final Ranges a;
        public static final Ranges b;
        public static final Ranges c;
        public static final Ranges d;
        public static final Ranges e;
        private static final Ranges f[];
        private com.fitbit.util.chart.Filter.Type chartType;
        private int monthCount;

        public static Ranges valueOf(String s)
        {
            return (Ranges)Enum.valueOf(com/fitbit/data/bl/SyncDataForLongPeriodOperation$Ranges, s);
        }

        public static Ranges[] values()
        {
            return (Ranges[])f.clone();
        }

        public a a()
        {
            return a.b(monthCount);
        }

        public a b()
        {
            return a.a(monthCount);
        }

        public com.fitbit.util.chart.Filter.Type c()
        {
            return chartType;
        }

        static 
        {
            a = new Ranges("MONTH", 0, 2, com.fitbit.util.chart.Filter.Type.i);
            b = new Ranges("THREE_MONTHS", 1, 4, com.fitbit.util.chart.Filter.Type.l);
            c = new Ranges("HALF_YEAR", 2, 7, com.fitbit.util.chart.Filter.Type.o);
            d = new Ranges("YEAR", 3, 13, com.fitbit.util.chart.Filter.Type.o);
            e = new Ranges("ONE_AND_HALF_YEAR", 4, 19, com.fitbit.util.chart.Filter.Type.o);
            f = (new Ranges[] {
                a, b, c, d, e
            });
        }

        private Ranges(String s, int i, int j, com.fitbit.util.chart.Filter.Type type)
        {
            super(s, i);
            monthCount = j;
            chartType = type;
        }
    }

    public static class a
    {

        public final b a;
        public final b b;
        public b c[];

        public static a a(int i)
        {
            return a(i, TimeZone.getDefault());
        }

        public static a a(int i, TimeZone timezone)
        {
            if (i < 1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("month count must be >= 1, was = ").append(i).toString());
            } else
            {
                timezone = Calendar.getInstance(timezone);
                int j = timezone.get(1);
                int k = timezone.get(2);
                timezone.add(2, -(i - 1));
                return new a(new b(timezone.get(1), timezone.get(2)), new b(j, k));
            }
        }

        private void a()
        {
            ArrayList arraylist = new ArrayList();
            for (b b1 = a; !b1.equals(b); b1 = b1.a())
            {
                arraylist.add(b1);
            }

            arraylist.add(b);
            c = new b[arraylist.size()];
            c = (b[])arraylist.toArray(c);
        }

        public static a b(int i)
        {
            return a(i, bn.b());
        }

        public a(b b1, b b2)
        {
            a = b1;
            b = b2;
            a();
        }
    }

    public static class b
    {

        public final int a;
        public final int b;

        public b a()
        {
            int k = a;
            int l = b + 1;
            int j = l;
            int i = k;
            if (l > 11)
            {
                j = 0;
                i = k + 1;
            }
            return new b(i, j);
        }

        public Date a(TimeZone timezone)
        {
            timezone = Calendar.getInstance(timezone);
            timezone.set(a, b, 1, 0, 0, 0);
            timezone.set(14, 0);
            return timezone.getTime();
        }

        public Date b()
        {
            return a(bn.b());
        }

        public Date b(TimeZone timezone)
        {
            timezone = Calendar.getInstance(timezone);
            timezone.set(a, b, 1, 23, 59, 59);
            timezone.set(14, 999);
            timezone.set(5, timezone.getActualMaximum(5));
            return timezone.getTime();
        }

        public Date c()
        {
            return b(bn.b());
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (!(obj instanceof b))
                {
                    return false;
                }
                obj = (b)obj;
                if (b != ((b) (obj)).b)
                {
                    return false;
                }
                if (a != ((b) (obj)).a)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return (b + 31) * 31 + a;
        }

        public b(int i, int j)
        {
            a = i;
            b = j;
        }
    }


    public static final String d = "com.fibit.data.bl.BROADCAST_CHART_UPDATE";
    private static final String e = "SyncDataForLongPeriodOperation";
    private static final long f = 0x1b7740L;
    private final a g;

    public SyncDataForLongPeriodOperation(bs bs1, Ranges ranges, boolean flag)
    {
        this(bs1, ranges.b(), flag);
    }

    public SyncDataForLongPeriodOperation(bs bs1, a a1, boolean flag)
    {
        super(bs1, flag);
        g = a1;
        bs1.c().a(Long.valueOf(0x1b7740L), c());
        a(bs1);
    }

    protected abstract e a(b b1);

    protected void a(bs bs1)
    {
        for (int i = g.c.length - 1; i >= 0; i--)
        {
            e e1 = a(g.c[i]);
            e1.b(false);
            if (e1 != null)
            {
                bs1.c().a(Long.valueOf(0x1b7740L), e1.c());
                a(((com.fitbit.data.bl.a.a) (e1)));
            }
        }

    }

    public String c()
    {
        return (new StringBuilder()).append("SyncDataForLongPeriodOperation-").append(g.a.a).append(".").append(g.a.b).append("-").append(g.b.a).append(".").append(g.b.b).toString();
    }
}
