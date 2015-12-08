// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

// Referenced classes of package com.flurry.sdk:
//            jo

public class ln
{

    public static int a(int l)
    {
        DisplayMetrics displaymetrics = d();
        return Math.round((float)l / displaymetrics.density);
    }

    public static boolean a()
    {
        return ((KeyguardManager)jo.a().c().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    public static int b(int l)
    {
        DisplayMetrics displaymetrics = d();
        float f1 = l;
        return Math.round(displaymetrics.density * f1);
    }

    public static Point b()
    {
        Display display = ((WindowManager)jo.a().c().getSystemService("window")).getDefaultDisplay();
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

    public static DisplayMetrics c()
    {
        Display display = ((WindowManager)jo.a().c().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return displaymetrics;
    }

    public static Pair c(int l)
    {
        int i1 = h();
        int j1 = i();
        switch (l)
        {
        default:
            return Pair.create(Integer.valueOf(i1), Integer.valueOf(j1));

        case 2: // '\002'
            return Pair.create(Integer.valueOf(j1), Integer.valueOf(i1));
        }
    }

    public static DisplayMetrics d()
    {
        Display display;
        display = ((WindowManager)jo.a().c().getSystemService("window")).getDefaultDisplay();
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
        return c();
    }

    public static float e()
    {
        return d().density;
    }

    public static int f()
    {
        return b().x;
    }

    public static int g()
    {
        return b().y;
    }

    public static int h()
    {
        return a(f());
    }

    public static int i()
    {
        return a(g());
    }

    public static int j()
    {
        Point point = b();
        if (point.x == point.y)
        {
            return 3;
        }
        return point.x >= point.y ? 2 : 1;
    }

    public static Pair k()
    {
        return Pair.create(Integer.valueOf(h()), Integer.valueOf(i()));
    }
}
