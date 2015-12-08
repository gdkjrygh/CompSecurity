// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

class au
{

    public static int a(Object obj)
    {
        return ((OverScroller)obj).getCurrX();
    }

    public static Object a(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new OverScroller(context, interpolator);
        } else
        {
            return new OverScroller(context);
        }
    }

    public static void a(Object obj, int i, int j, int k, int l, int i1)
    {
        ((OverScroller)obj).startScroll(i, j, k, l, i1);
    }

    public static void a(Object obj, int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        ((OverScroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
    }

    public static int b(Object obj)
    {
        return ((OverScroller)obj).getCurrY();
    }

    public static boolean c(Object obj)
    {
        return ((OverScroller)obj).computeScrollOffset();
    }

    public static void d(Object obj)
    {
        ((OverScroller)obj).abortAnimation();
    }

    public static int e(Object obj)
    {
        return ((OverScroller)obj).getFinalX();
    }

    public static int f(Object obj)
    {
        return ((OverScroller)obj).getFinalY();
    }
}
