// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class x
{

    public static int a(View view)
    {
        return view.getLayerType();
    }

    static long a()
    {
        return ValueAnimator.getFrameDelay();
    }

    public static void a(View view, float f)
    {
        view.setScaleX(f);
    }

    public static void a(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public static void a(View view, boolean flag)
    {
        view.setSaveFromParentEnabled(flag);
    }

    public static float b(View view)
    {
        return view.getScaleX();
    }

    public static void b(View view, float f)
    {
        view.setScaleY(f);
    }
}
