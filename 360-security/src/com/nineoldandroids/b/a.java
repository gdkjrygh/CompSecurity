// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.b;

import android.view.View;

public final class com.nineoldandroids.b.a
{
    private static final class a
    {

        static float a(View view)
        {
            return view.getX();
        }

        static void a(View view, float f)
        {
            view.setAlpha(f);
        }

        static float b(View view)
        {
            return view.getY();
        }

        static void b(View view, float f)
        {
            view.setScaleX(f);
        }

        static void c(View view, float f)
        {
            view.setScaleY(f);
        }

        static void d(View view, float f)
        {
            view.setTranslationX(f);
        }

        static void e(View view, float f)
        {
            view.setTranslationY(f);
        }
    }


    public static float a(View view)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            return com.nineoldandroids.b.a.a.a(view).m();
        } else
        {
            return a.a(view);
        }
    }

    public static void a(View view, float f)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            com.nineoldandroids.b.a.a.a(view).a(f);
            return;
        } else
        {
            a.a(view, f);
            return;
        }
    }

    public static float b(View view)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            return com.nineoldandroids.b.a.a.a(view).n();
        } else
        {
            return a.b(view);
        }
    }

    public static void b(View view, float f)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            com.nineoldandroids.b.a.a.a(view).g(f);
            return;
        } else
        {
            a.b(view, f);
            return;
        }
    }

    public static void c(View view, float f)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            com.nineoldandroids.b.a.a.a(view).h(f);
            return;
        } else
        {
            a.c(view, f);
            return;
        }
    }

    public static void d(View view, float f)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            com.nineoldandroids.b.a.a.a(view).i(f);
            return;
        } else
        {
            a.d(view, f);
            return;
        }
    }

    public static void e(View view, float f)
    {
        if (com.nineoldandroids.b.a.a.a)
        {
            com.nineoldandroids.b.a.a.a(view).j(f);
            return;
        } else
        {
            a.e(view, f);
            return;
        }
    }
}
