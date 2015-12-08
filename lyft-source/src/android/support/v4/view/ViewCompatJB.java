// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class ViewCompatJB
{

    public static void a(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, int i, int j, int k, int l)
    {
        view.postInvalidate(i, j, k, l);
    }

    public static void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public static boolean a(View view)
    {
        return view.hasTransientState();
    }

    public static void b(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public static int c(View view)
    {
        return view.getImportantForAccessibility();
    }

    public static ViewParent d(View view)
    {
        return view.getParentForAccessibility();
    }

    public static int e(View view)
    {
        return view.getMinimumWidth();
    }

    public static int f(View view)
    {
        return view.getMinimumHeight();
    }

    public static boolean g(View view)
    {
        return view.getFitsSystemWindows();
    }

    public static boolean h(View view)
    {
        return view.hasOverlappingRendering();
    }
}
