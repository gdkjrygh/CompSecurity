// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.os.SystemClock;
import com.fitbit.data.domain.PedometerMinuteData;
import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.pedometer:
//            e, j

public class k
{
    public static class a
    {

        private j a;
        private boolean b;
        private ArrayList c;

        private int a(List list)
        {
            list = list.iterator();
            int i1 = 0;
            while (list.hasNext()) 
            {
                j j1 = (j)list.next();
                int k1;
                if (b)
                {
                    c.add(j1);
                    k1 = i1;
                    if (c.size() >= 4)
                    {
                        if (com.fitbit.pedometer.k.a(c))
                        {
                            k1 = i1;
                            if (com.fitbit.pedometer.k.a(j1, a))
                            {
                                k1 = i1 + 1;
                            }
                            b = false;
                            c.clear();
                        } else
                        {
                            c.remove(0);
                            k1 = i1;
                        }
                    }
                } else
                if (((double)(j1.a() - a.a()) * 1.0D) / 1000D <= 2D)
                {
                    k1 = i1;
                    if (com.fitbit.pedometer.k.a(j1, a))
                    {
                        k1 = i1 + 1;
                    }
                } else
                {
                    b = true;
                    k1 = i1;
                }
                a = j1;
                i1 = k1;
            }
            return i1;
        }

        public PedometerMinuteData a(List list, boolean flag)
        {
            int k1 = list.size();
            Object obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.WALKING;
            double d1;
            if (!flag)
            {
                if (com.fitbit.pedometer.k.a(k1, a(list)))
                {
                    obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.RUNNING;
                } else
                {
                    obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.WALKING;
                }
                d1 = com.fitbit.pedometer.k.a(k1, ((com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType) (obj)), 60000L);
            } else
            {
                long l4 = 60000L * (((j)list.get(0)).a() / 60000L);
                obj = list.iterator();
                d1 = 0.0D;
                long l2 = l4;
                long l1 = 0L;
                int i1 = 0;
                while (((Iterator) (obj)).hasNext()) 
                {
                    j j1 = (j)((Iterator) (obj)).next();
                    long l3 = l1;
                    if (l2 + 100L <= j1.a())
                    {
                        l3 = l1 + (j1.a() - l2);
                    }
                    l2 = j1.a() + j1.c();
                    d1 += (((double)j1.c() * 1.0D) / (double)60000L) * j1.b();
                    if (j1.d())
                    {
                        i1++;
                    }
                    l1 = l3;
                }
                d1 = ((double)(l1 + ((l4 + 60000L) - l2)) * 1.0D) / (double)60000L + d1;
                boolean flag1;
                if (i1 > k1 / 2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.RUNNING;
                } else
                {
                    obj = com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.WALKING;
                }
            }
            return new PedometerMinuteData((((j)list.get(0)).a() / 60000L) * 60000L, k1, d1, ((com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType) (obj)));
        }

        public a()
        {
            a = null;
            b = true;
            c = new ArrayList();
        }
    }


    public static final long a = System.currentTimeMillis() - SystemClock.elapsedRealtime();
    public static final int b = 300;
    public static final long c = 0x3b9aca00L;
    public static final int d = 1000;
    public static final int e = 60;
    public static final long f = 0xf4240L;
    private static final double g = 0.310546875D;
    private static final double h = 14D;
    private static final double i = 0.6640625D;
    private static final double j = 0.564453125D;
    private static final int k[] = {
        -1460, 5045, 6585
    };
    private static final int l = 0x7d00000;
    private static final long m;
    private static final long n;

    public k()
    {
    }

    public static double a(int i1, com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType pedometerminutetype, long l1)
    {
        double d1;
        double d2;
        d1 = 0.0D;
        d2 = (double)i1 / ((double)l1 / 60000D);
        if (d2 != 0.0D) goto _L2; else goto _L1
_L1:
        d1 = 10D;
_L4:
        return d1 / 10D;
_L2:
        if (d2 < 69D)
        {
            d1 = 0.310546875D * d2 + 14D + 10D;
        } else
        if (d2 >= 69D)
        {
            d1 = 0.564453125D;
            if (com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType.RUNNING == pedometerminutetype)
            {
                d1 = 0.6640625D;
            }
            d1 = d1 * d2 + 10D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static double a(int i1, com.fitbit.data.domain.PedometerMinuteData.PedometerMinuteType pedometerminutetype, long l1, double d1)
    {
        return a(i1, pedometerminutetype, l1) * ((d1 / 86400000D) * (double)l1);
    }

    public static long a(long l1)
    {
        return a + l1;
    }

    public static boolean a()
    {
        return com.fitbit.pedometer.e.g().a() == PedometerAdapterHelper.PedometerManufacturer.b;
    }

    static boolean a(int i1, int j1)
    {
        return b(i1, j1);
    }

    public static boolean a(long l1, long l2)
    {
        return l1 / 1000L / 60L == l2 / 1000L / 60L;
    }

    static boolean a(j j1, j j2)
    {
        return b(j1, j2);
    }

    static boolean a(ArrayList arraylist)
    {
        return b(arraylist);
    }

    public static long b(long l1)
    {
        l1 = a(l1);
        for (long l2 = System.currentTimeMillis(); l1 < l2 - n;)
        {
            l1 += 0x7d00000L;
            com.fitbit.e.a.a("GoogleStepsService", String.format("sensor clock reset compensation: %s (%d)", new Object[] {
                new Date(l1), Long.valueOf(l1)
            }), new Object[0]);
        }

        return l1;
    }

    public static boolean b()
    {
        return com.fitbit.pedometer.e.g().a() == PedometerAdapterHelper.PedometerManufacturer.c;
    }

    private static boolean b(int i1, int j1)
    {
        int ai[] = new int[2];
        ai[0] = i1 - 132;
        int k1;
        if (i1 > 0)
        {
            ai[1] = (j1 * 100) / i1 - 64;
        } else
        {
            ai[1] = 0;
        }
        i1 = k[0];
        j1 = ai[0];
        k1 = k[1];
        return ai[1] * k[2] + (i1 * 100 + j1 * k1) > 0;
    }

    private static boolean b(j j1, j j2)
    {
        boolean flag = false;
        if (j1.a() - j2.a() < 450L)
        {
            flag = true;
        }
        return flag;
    }

    private static boolean b(ArrayList arraylist)
    {
        return ((double)(((j)arraylist.get(arraylist.size() - 1)).a() - ((j)arraylist.get(0)).a()) * 1.0D) / 1000D <= 2D;
    }

    public static boolean c()
    {
        return com.fitbit.util.b.a.a(21);
    }

    static 
    {
        m = TimeUnit.HOURS.toMillis(1L);
        n = 0x7d00000L - m;
    }
}
