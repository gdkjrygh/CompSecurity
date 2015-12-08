// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class cg
{

    public static void a(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public static int b(View view)
    {
        return view.getImportantForAccessibility();
    }

    public static ViewParent c(View view)
    {
        return view.getParentForAccessibility();
    }

    public static int d(View view)
    {
        return view.getMinimumHeight();
    }

    public static void e(View view)
    {
        view.requestFitSystemWindows();
    }

    public static boolean f(View view)
    {
        return view.getFitsSystemWindows();
    }

    public static boolean g(View view)
    {
        return view.hasOverlappingRendering();
    }
}
