// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class km
{

    private static kz a;

    public static void A(View view)
    {
        a.A(view);
    }

    public static boolean B(View view)
    {
        return a.B(view);
    }

    public static boolean C(View view)
    {
        return a.C(view);
    }

    public static boolean D(View view)
    {
        return a.D(view);
    }

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static mu a(View view, mu mu)
    {
        return a.a(view, mu);
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

    public static void a(View view, ColorStateList colorstatelist)
    {
        a.a(view, colorstatelist);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        a.a(view, mode);
    }

    public static void a(View view, hv hv)
    {
        a.a(view, hv);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, jy jy)
    {
        a.a(view, jy);
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

    public static void d(View view, int i1)
    {
        a.d(view, i1);
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

    public static ViewParent i(View view)
    {
        return a.i(view);
    }

    public static boolean j(View view)
    {
        return a.j(view);
    }

    public static int k(View view)
    {
        return a.k(view);
    }

    public static int l(View view)
    {
        return a.l(view);
    }

    public static float m(View view)
    {
        return a.n(view);
    }

    public static float n(View view)
    {
        return a.o(view);
    }

    public static int o(View view)
    {
        return a.p(view);
    }

    public static int p(View view)
    {
        return a.q(view);
    }

    public static me q(View view)
    {
        return a.r(view);
    }

    public static float r(View view)
    {
        return a.u(view);
    }

    public static int s(View view)
    {
        return a.s(view);
    }

    public static void t(View view)
    {
        a.t(view);
    }

    public static boolean u(View view)
    {
        return a.v(view);
    }

    public static void v(View view)
    {
        a.w(view);
    }

    public static void w(View view)
    {
        a.x(view);
    }

    public static void x(View view)
    {
        a.y(view);
    }

    public static boolean y(View view)
    {
        return a.m(view);
    }

    public static boolean z(View view)
    {
        return a.z(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 23)
        {
            a = new ky();
        } else
        if (i1 >= 21)
        {
            a = new kx();
        } else
        if (i1 >= 19)
        {
            a = new kw();
        } else
        if (i1 >= 17)
        {
            a = new ku();
        } else
        if (i1 >= 16)
        {
            a = new kt();
        } else
        if (i1 >= 15)
        {
            a = new kr();
        } else
        if (i1 >= 14)
        {
            a = new ks();
        } else
        if (i1 >= 11)
        {
            a = new kq();
        } else
        if (i1 >= 9)
        {
            a = new kp();
        } else
        if (i1 >= 7)
        {
            a = new ko();
        } else
        {
            a = new kn();
        }
    }
}
