// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            av, au, at, as, 
//            ar, aq, ao, aw, 
//            a

public final class an
{

    static final aw a;

    public static void a(View view, int j, int k, int l, int i1)
    {
        a.a(view, j, k, l, i1);
    }

    public static void a(View view, int j, Paint paint)
    {
        a.a(view, j, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static boolean a(View view)
    {
        return a.a(view);
    }

    public static boolean a(View view, int j)
    {
        return a.a(view, j);
    }

    public static int b(View view)
    {
        return a.b(view);
    }

    public static void c(View view)
    {
        a.c(view);
    }

    public static int d(View view)
    {
        return a.d(view);
    }

    public static void e(View view)
    {
        a.e(view);
    }

    public static int f(View view)
    {
        return a.f(view);
    }

    public static int g(View view)
    {
        return a.g(view);
    }

    public static ViewParent h(View view)
    {
        return a.h(view);
    }

    public static boolean i(View view)
    {
        return a.i(view);
    }

    static 
    {
        int j = android.os.Build.VERSION.SDK_INT;
        if (j >= 19)
        {
            a = new av();
        } else
        if (j >= 17)
        {
            a = new au();
        } else
        if (j >= 16)
        {
            a = new at();
        } else
        if (j >= 14)
        {
            a = new as();
        } else
        if (j >= 11)
        {
            a = new ar();
        } else
        if (j >= 9)
        {
            a = new aq();
        } else
        {
            a = new ao();
        }
    }
}
