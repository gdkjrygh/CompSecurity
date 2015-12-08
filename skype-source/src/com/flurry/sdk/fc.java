// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

// Referenced classes of package com.flurry.sdk:
//            do

public class fc
{

    public static int a(int k)
    {
        DisplayMetrics displaymetrics = c();
        return Math.round((float)k / displaymetrics.density);
    }

    public static Point a()
    {
        Display display = ((WindowManager)com.flurry.sdk.do.a().b().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            display.getRealSize(point);
            return point;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            try
            {
                Method method = android/view/Display.getMethod("getRawHeight", new Class[0]);
                point.x = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(display, new Object[0])).intValue();
                point.y = ((Integer)method.invoke(display, new Object[0])).intValue();
            }
            catch (Throwable throwable)
            {
                display.getSize(point);
                return point;
            }
            return point;
        }
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            display.getSize(point);
            return point;
        } else
        {
            point.x = display.getWidth();
            point.y = display.getHeight();
            return point;
        }
    }

    public static int b(int k)
    {
        DisplayMetrics displaymetrics = c();
        float f1 = k;
        return Math.round(displaymetrics.density * f1);
    }

    public static DisplayMetrics b()
    {
        Display display = ((WindowManager)com.flurry.sdk.do.a().b().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return displaymetrics;
    }

    public static DisplayMetrics c()
    {
        Display display;
        display = ((WindowManager)com.flurry.sdk.do.a().b().getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getRealMetrics(displaymetrics);
            return displaymetrics;
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        DisplayMetrics displaymetrics1;
        displaymetrics1 = new DisplayMetrics();
        android/view/Display.getMethod("getRealMetrics", new Class[0]).invoke(display, new Object[] {
            displaymetrics1
        });
        return displaymetrics1;
        Exception exception;
        exception;
        return b();
    }

    public static Pair c(int k)
    {
        int l = g();
        int i1 = h();
        switch (k)
        {
        default:
            return Pair.create(Integer.valueOf(l), Integer.valueOf(i1));

        case 2: // '\002'
            return Pair.create(Integer.valueOf(i1), Integer.valueOf(l));
        }
    }

    public static float d()
    {
        return c().density;
    }

    public static int e()
    {
        return a().x;
    }

    public static int f()
    {
        return a().y;
    }

    public static int g()
    {
        return a(e());
    }

    public static int h()
    {
        return a(f());
    }

    public static int i()
    {
        Point point = a();
        if (point.x == point.y)
        {
            return 3;
        }
        return point.x >= point.y ? 2 : 1;
    }

    public static Pair j()
    {
        return Pair.create(Integer.valueOf(g()), Integer.valueOf(h()));
    }
}
