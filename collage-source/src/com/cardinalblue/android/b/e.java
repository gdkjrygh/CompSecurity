// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Build;

public class e
{

    public static boolean a = c();
    public static boolean b = d();
    private static final String c[] = {
        "SC-03E", "c1att", "c1ktt", "c1lgt", "c1skt", "d2att", "d2can", "d2cri", "d2dcm", "d2lteMetroPCS", 
        "d2lterefreshspr", "d2ltetmo", "d2mtr", "d2spi", "d2spr", "d2tfnspr", "d2tfnvzw", "d2tmo", "d2usc", "d2vmu", 
        "d2vzw", "d2xar", "m0", "m0apt", "m0chn", "m0cmcc", "m0ctc", "m0ctcduos", "m0skt", "m3", 
        "m3dcm"
    };
    private static final String d[] = {
        "SC-02E", "t03g", "t03g", "t03gchn", "t03gchnduos", "t03gcmcc", "t03gctc", "t03gcuduos", "t0lte", "t0lteatt", 
        "t0ltecan", "t0ltecmcc", "t0ltedcm", "t0ltektt", "t0ltelgt", "t0lteskt", "t0ltespr", "t0ltetmo", "t0lteusc", "t0ltevzw"
    };

    public e()
    {
    }

    public static boolean a()
    {
        return "Amazon".equals(Build.MANUFACTURER);
    }

    public static boolean b()
    {
        return a() && "SD4930UR".equals(Build.MODEL);
    }

    public static boolean c()
    {
        if (Build.MANUFACTURER.contains("samsung"))
        {
            String s = Build.DEVICE;
            String as[] = c;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (as[i].equals(s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean d()
    {
        if (Build.MANUFACTURER.contains("samsung"))
        {
            String s = Build.DEVICE;
            String as[] = d;
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                if (as[i].equals(s))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

}
