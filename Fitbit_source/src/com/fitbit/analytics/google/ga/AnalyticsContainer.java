// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.google.ga;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;

// Referenced classes of package com.fitbit.analytics.google.ga:
//            b, c, d

public class AnalyticsContainer
{
    public static class Timer
    {

        private final int a;
        private final String b;
        private final String c;
        private final long d = SystemClock.elapsedRealtime();
        private boolean e;
        private final AnalyticsContainer f;

        public static Timer a(AnalyticsContainer analyticscontainer, int i, Category category, String s)
        {
            return new Timer(analyticscontainer, i, category.name(), s);
        }

        public void a()
        {
            if (e)
            {
                f.a(a).a(b, c, SystemClock.elapsedRealtime() - d);
                boolean flag;
                if (!e)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e = flag;
            }
        }

        public Timer b()
        {
            return new Timer(f, a, b, c);
        }

        private Timer(AnalyticsContainer analyticscontainer, int i, String s, String s1)
        {
            f = analyticscontainer;
            a = i;
            b = s;
            c = s1;
            e = true;
        }
    }

    public static final class Timer.Category extends Enum
    {

        public static final Timer.Category a;
        public static final Timer.Category b;
        public static final Timer.Category c;
        public static final Timer.Category d;
        public static final Timer.Category e;
        private static final Timer.Category f[];

        public static Timer.Category valueOf(String s)
        {
            return (Timer.Category)Enum.valueOf(com/fitbit/analytics/google/ga/AnalyticsContainer$Timer$Category, s);
        }

        public static Timer.Category[] values()
        {
            return (Timer.Category[])f.clone();
        }

        static 
        {
            a = new Timer.Category("Network", 0);
            b = new Timer.Category("Disk", 1);
            c = new Timer.Category("Bluetooth", 2);
            d = new Timer.Category("Parsing", 3);
            e = new Timer.Category("GeneralCpu", 4);
            f = (new Timer.Category[] {
                a, b, c, d, e
            });
        }

        private Timer.Category(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a = "google_bt_crash";
    private static final String b = com/fitbit/analytics/google/ga/AnalyticsContainer.getSimpleName();
    private static final d e = new d() {

        public void a()
        {
        }

        public void a(b b1)
        {
        }

        public void a(String s)
        {
        }

        public void a(String s, String s1, long l)
        {
        }

        public void a(String s, String s1, String s2, int i)
        {
        }

        public void b(String s)
        {
        }

    };
    private final SparseArray c = new SparseArray();
    private final b d;

    public AnalyticsContainer(b b1)
    {
        d = b1;
        SparseIntArray sparseintarray = b1.c();
        int j = sparseintarray.size();
        int i = 0;
        while (i < j) 
        {
            try
            {
                c.put(sparseintarray.keyAt(i), new c(b1, sparseintarray.valueAt(i)));
            }
            catch (Exception exception)
            {
                Log.e(b, "Unable to initialize Google Analytics.", exception);
            }
            i++;
        }
    }

    public d a(int i)
    {
        return (d)c.get(i, e);
    }

    public void a()
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            Log.i(b, "updating context");
            ((d)c.valueAt(i)).a(d);
        }

    }

    public void b()
    {
        int j = c.size();
        for (int i = 0; i < j; i++)
        {
            d d1 = (d)c.valueAt(i);
            if (d1 != null)
            {
                d1.a();
            }
        }

    }

}
