// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public class i
{
    private static class a
        implements b
    {

        private final DisplayMetrics a;

        public int a()
        {
            return a.widthPixels;
        }

        public int b()
        {
            return a.heightPixels;
        }

        public a(DisplayMetrics displaymetrics)
        {
            a = displaymetrics;
        }
    }

    static interface b
    {

        public abstract int a();

        public abstract int b();
    }


    private final int a;
    private final int b;
    private final Context c;

    public i(Context context)
    {
        this(context, (ActivityManager)context.getSystemService("activity"), ((b) (new a(context.getResources().getDisplayMetrics()))));
    }

    i(Context context, ActivityManager activitymanager, b b1)
    {
        c = context;
        int j = a(activitymanager);
        int l = b1.a() * b1.b() * 4;
        int k = l * 4;
        l *= 2;
        if (l + k <= j)
        {
            b = l;
            a = k;
        } else
        {
            int i1 = Math.round((float)j / 6F);
            b = i1 * 2;
            a = i1 * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3))
        {
            context = (new StringBuilder()).append("Calculated memory cache size: ").append(a(b)).append(" pool size: ").append(a(a)).append(" memory class limited? ");
            boolean flag;
            if (l + k > j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.d("MemorySizeCalculator", context.append(flag).append(" max size: ").append(a(j)).append(" memoryClass: ").append(activitymanager.getMemoryClass()).append(" isLowMemoryDevice: ").append(b(activitymanager)).toString());
        }
    }

    private static int a(ActivityManager activitymanager)
    {
        int j = activitymanager.getMemoryClass();
        boolean flag = b(activitymanager);
        float f1 = j * 1024 * 1024;
        float f;
        if (flag)
        {
            f = 0.33F;
        } else
        {
            f = 0.4F;
        }
        return Math.round(f * f1);
    }

    private String a(int j)
    {
        return Formatter.formatFileSize(c, j);
    }

    private static boolean b(ActivityManager activitymanager)
    {
        int j = android.os.Build.VERSION.SDK_INT;
        return j < 11 || j >= 19 && activitymanager.isLowRamDevice();
    }

    public int a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }
}
