// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//            by, bx, bw, bv, 
//            bu, bt, bs, br, 
//            bq, bz, dr, a, 
//            bi, cy

public final class bp
{

    static final bz a;

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static dr a(View view, dr dr)
    {
        return a.a(view, dr);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        a.a(view, i1, j1, k1, l1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, bi bi)
    {
        a.a(view, bi);
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

    public static void a(ViewGroup viewgroup)
    {
        a.a(viewgroup);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static boolean b(View view)
    {
        return a.b(view);
    }

    public static boolean b(View view, int i1)
    {
        return a.b(view, i1);
    }

    public static void c(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void c(View view, int i1)
    {
        a.c(view, i1);
    }

    public static boolean c(View view)
    {
        return a.c(view);
    }

    public static void d(View view)
    {
        a.d(view);
    }

    public static void d(View view, float f1)
    {
        a.d(view, f1);
    }

    public static int e(View view)
    {
        return a.e(view);
    }

    public static void e(View view, float f1)
    {
        a.e(view, f1);
    }

    public static float f(View view)
    {
        return a.f(view);
    }

    public static void f(View view, float f1)
    {
        a.f(view, f1);
    }

    public static int g(View view)
    {
        return a.g(view);
    }

    public static int h(View view)
    {
        return a.h(view);
    }

    public static boolean i(View view)
    {
        return a.i(view);
    }

    public static int j(View view)
    {
        return a.j(view);
    }

    public static float k(View view)
    {
        return a.k(view);
    }

    public static float l(View view)
    {
        return a.l(view);
    }

    public static int m(View view)
    {
        return a.n(view);
    }

    public static int n(View view)
    {
        return a.o(view);
    }

    public static cy o(View view)
    {
        return a.p(view);
    }

    public static float p(View view)
    {
        return a.m(view);
    }

    public static int q(View view)
    {
        return a.q(view);
    }

    public static void r(View view)
    {
        a.r(view);
    }

    public static boolean s(View view)
    {
        return a.s(view);
    }

    public static void t(View view)
    {
        a.t(view);
    }

    public static void u(View view)
    {
        a.u(view);
    }

    public static void v(View view)
    {
        a.v(view);
    }

    public static boolean w(View view)
    {
        return a.w(view);
    }

    public static boolean x(View view)
    {
        return a.x(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new by();
        } else
        if (i1 >= 19)
        {
            a = new bx();
        } else
        if (i1 >= 17)
        {
            a = new bw();
        } else
        if (i1 >= 16)
        {
            a = new bv();
        } else
        if (i1 >= 14)
        {
            a = new bu();
        } else
        if (i1 >= 11)
        {
            a = new bt();
        } else
        if (i1 >= 9)
        {
            a = new bs();
        } else
        if (i1 >= 7)
        {
            a = new br();
        } else
        {
            a = new bq();
        }
    }
}
