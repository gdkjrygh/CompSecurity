// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ca, bz, bx, bw, 
//            bv, bu, bt, bs, 
//            br, cb, a, dn

public class bq
{

    static final cb a;

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, ColorStateList colorstatelist)
    {
        a.a(view, colorstatelist);
    }

    public static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        a.a(view, mode);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, flag);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view)
    {
        a.b(view);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static void b(View view, int i1)
    {
        a.b(view, i1);
    }

    public static void b(View view, boolean flag)
    {
        a.b(view, flag);
    }

    public static int c(View view)
    {
        return a.c(view);
    }

    public static int d(View view)
    {
        return a.d(view);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static ViewParent f(View view)
    {
        return a.f(view);
    }

    public static int g(View view)
    {
        return a.g(view);
    }

    public static float h(View view)
    {
        return a.i(view);
    }

    public static int i(View view)
    {
        return a.j(view);
    }

    public static dn j(View view)
    {
        return a.k(view);
    }

    public static float k(View view)
    {
        return a.n(view);
    }

    public static int l(View view)
    {
        return a.l(view);
    }

    public static void m(View view)
    {
        a.m(view);
    }

    public static boolean n(View view)
    {
        return a.o(view);
    }

    public static void o(View view)
    {
        a.p(view);
    }

    public static boolean p(View view)
    {
        return a.h(view);
    }

    public static boolean q(View view)
    {
        return a.q(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new ca();
        } else
        if (i1 >= 19)
        {
            a = new bz();
        } else
        if (i1 >= 17)
        {
            a = new bx();
        } else
        if (i1 >= 16)
        {
            a = new bw();
        } else
        if (i1 >= 14)
        {
            a = new bv();
        } else
        if (i1 >= 11)
        {
            a = new bu();
        } else
        if (i1 >= 9)
        {
            a = new bt();
        } else
        if (i1 >= 7)
        {
            a = new bs();
        } else
        {
            a = new br();
        }
    }
}
