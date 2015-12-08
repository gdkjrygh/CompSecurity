// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.analytics.google.ga;

import android.os.SystemClock;

// Referenced classes of package com.fitbit.analytics.google.ga:
//            AnalyticsContainer, d

public static class e
{
    public static final class Category extends Enum
    {

        public static final Category a;
        public static final Category b;
        public static final Category c;
        public static final Category d;
        public static final Category e;
        private static final Category f[];

        public static Category valueOf(String s)
        {
            return (Category)Enum.valueOf(com/fitbit/analytics/google/ga/AnalyticsContainer$Timer$Category, s);
        }

        public static Category[] values()
        {
            return (Category[])f.clone();
        }

        static 
        {
            a = new Category("Network", 0);
            b = new Category("Disk", 1);
            c = new Category("Bluetooth", 2);
            d = new Category("Parsing", 3);
            e = new Category("GeneralCpu", 4);
            f = (new Category[] {
                a, b, c, d, e
            });
        }

        private Category(String s, int i)
        {
            super(s, i);
        }
    }


    private final int a;
    private final String b;
    private final String c;
    private final long d = SystemClock.elapsedRealtime();
    private boolean e;
    private final AnalyticsContainer f;

    public static Category a(AnalyticsContainer analyticscontainer, int i, Category category, String s)
    {
        return new <init>(analyticscontainer, i, category.name(), s);
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

    public e b()
    {
        return new <init>(f, a, b, c);
    }

    private Category(AnalyticsContainer analyticscontainer, int i, String s, String s1)
    {
        f = analyticscontainer;
        a = i;
        b = s;
        c = s1;
        e = true;
    }
}
