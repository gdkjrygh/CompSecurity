// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC
{

    ViewCompatHC()
    {
    }

    public static float getAlpha(View view)
    {
        return view.getAlpha();
    }

    static long getFrameTime()
    {
        return ValueAnimator.getFrameDelay();
    }

    public static int getLayerType(View view)
    {
        return view.getLayerType();
    }

    public static int getMeasuredHeightAndState(View view)
    {
        return view.getMeasuredHeightAndState();
    }

    public static int getMeasuredState(View view)
    {
        return view.getMeasuredState();
    }

    public static int getMeasuredWidthAndState(View view)
    {
        return view.getMeasuredWidthAndState();
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
        return View.resolveSizeAndState(i, j, k);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }
}
