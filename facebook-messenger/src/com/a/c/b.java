// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;

final class b
{

    private b()
    {
    }

    static float a(View view)
    {
        return view.getTranslationY();
    }

    static void a(View view, float f1)
    {
        view.setAlpha(f1);
    }

    static void b(View view, float f1)
    {
        view.setPivotX(f1);
    }

    static void c(View view, float f1)
    {
        view.setPivotY(f1);
    }

    static void d(View view, float f1)
    {
        view.setRotation(f1);
    }

    static void e(View view, float f1)
    {
        view.setScaleX(f1);
    }

    static void f(View view, float f1)
    {
        view.setScaleY(f1);
    }

    static void g(View view, float f1)
    {
        view.setTranslationX(f1);
    }

    static void h(View view, float f1)
    {
        view.setTranslationY(f1);
    }
}
