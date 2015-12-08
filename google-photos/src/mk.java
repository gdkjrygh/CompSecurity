// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class mk
{

    private static mv a;

    public static boolean A(View view)
    {
        return a.A(view);
    }

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.a(view);
    }

    public static or a(View view, or or)
    {
        return a.a(view, or);
    }

    public static void a(View view, float f1)
    {
        a.a(view, f1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, null);
    }

    public static void a(View view, ColorStateList colorstatelist)
    {
        a.a(view, colorstatelist);
    }

    public static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        a.a(view, mode);
    }

    public static void a(View view, Rect rect)
    {
        a.a(view, rect);
    }

    public static void a(View view, AccessibilityEvent accessibilityevent)
    {
        a.a(view, accessibilityevent);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static void a(View view, kc kc)
    {
        a.a(view, kc);
    }

    public static void a(View view, mc mc)
    {
        a.a(view, mc);
    }

    public static void a(View view, pa pa)
    {
        a.a(view, pa);
    }

    public static void a(View view, boolean flag)
    {
        a.a(view, false);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static boolean a(View view, int i1, Bundle bundle)
    {
        return a.a(view, i1, bundle);
    }

    public static void b(View view, float f1)
    {
        a.b(view, f1);
    }

    public static void b(View view, boolean flag)
    {
        a.b(view, flag);
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

    public static float f(View view)
    {
        return a.f(view);
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

    public static int j(View view)
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

    public static int m(View view)
    {
        return a.m(view);
    }

    public static float n(View view)
    {
        return a.o(view);
    }

    public static float o(View view)
    {
        return a.p(view);
    }

    public static int p(View view)
    {
        return a.q(view);
    }

    public static int q(View view)
    {
        return a.r(view);
    }

    public static ob r(View view)
    {
        return a.s(view);
    }

    public static float s(View view)
    {
        return a.v(view);
    }

    public static int t(View view)
    {
        return a.t(view);
    }

    public static void u(View view)
    {
        a.u(view);
    }

    public static boolean v(View view)
    {
        return a.w(view);
    }

    public static void w(View view)
    {
        a.x(view);
    }

    public static boolean x(View view)
    {
        return a.n(view);
    }

    public static void y(View view)
    {
        a.y(view);
    }

    public static boolean z(View view)
    {
        return a.z(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new mu();
        } else
        if (i1 >= 19)
        {
            a = new mt();
        } else
        if (i1 >= 17)
        {
            a = new mr();
        } else
        if (i1 >= 16)
        {
            a = new mq();
        } else
        if (i1 >= 14)
        {
            a = new mp();
        } else
        if (i1 >= 11)
        {
            a = new mo();
        } else
        if (i1 >= 9)
        {
            a = new mn();
        } else
        if (i1 >= 7)
        {
            a = new mm();
        } else
        {
            a = new ml();
        }
    }
}
