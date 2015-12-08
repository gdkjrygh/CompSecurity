// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Method;

public final class jpx
{

    public static final Handler a = new Handler(Looper.getMainLooper());

    public jpx()
    {
    }

    public static int a(DisplayMetrics displaymetrics, int i)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public static boolean a()
    {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean a(Context context)
    {
        if (context.getResources().getConfiguration().orientation == 2)
        {
            if ((int)((float)((DisplayMetrics) (context = context.getResources().getDisplayMetrics())).heightPixels / ((DisplayMetrics) (context)).density) < 600)
            {
                return true;
            }
        }
        return false;
    }

    public static int b(DisplayMetrics displaymetrics, int i)
    {
        return Math.round((float)i / displaymetrics.density);
    }

    public static boolean b(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        int i;
        int j;
        int k;
        int l;
        if (c.a(17))
        {
            context.getRealMetrics(displaymetrics);
            j = displaymetrics.heightPixels;
            i = displaymetrics.widthPixels;
        } else
        {
            try
            {
                j = ((Integer)android/view/Display.getMethod("getRawHeight", new Class[0]).invoke(context, new Object[0])).intValue();
                i = ((Integer)android/view/Display.getMethod("getRawWidth", new Class[0]).invoke(context, new Object[0])).intValue();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
        }
        context.getMetrics(displaymetrics);
        k = displaymetrics.heightPixels;
        l = displaymetrics.widthPixels;
        return k == j && l == i;
    }

    public static int c(Context context)
    {
        int i = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (i > 0)
        {
            return context.getResources().getDimensionPixelSize(i);
        } else
        {
            return 0;
        }
    }

    public final int a(Context context, int i)
    {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public final int b(Context context, int i)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getMetrics(displaymetrics);
        return b(displaymetrics, i);
    }

}
