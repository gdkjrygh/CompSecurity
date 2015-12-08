// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class ViewCompatHC
{

    public static int combineMeasuredStates(int i, int j)
    {
        return View.combineMeasuredStates(i, j);
    }

    public static float getAlpha(View view)
    {
        return view.getAlpha();
    }

    static long getFrameTime()
    {
        return ValueAnimator.getFrameDelay();
    }

    public static int getMeasuredState(View view)
    {
        return view.getMeasuredState();
    }

    public static int getMeasuredWidthAndState(View view)
    {
        return view.getMeasuredWidthAndState();
    }

    public static float getScaleX(View view)
    {
        return view.getScaleX();
    }

    public static float getTranslationX(View view)
    {
        return view.getTranslationX();
    }

    public static float getTranslationY(View view)
    {
        return view.getTranslationY();
    }

    public static void jumpDrawablesToCurrentState(View view)
    {
        view.jumpDrawablesToCurrentState();
    }

    public static int resolveSizeAndState(int i, int j, int k)
    {
        return View.resolveSizeAndState(i, j, k);
    }

    public static void setActivated(View view, boolean flag)
    {
        view.setActivated(flag);
    }

    public static void setAlpha(View view, float f)
    {
        view.setAlpha(f);
    }

    public static void setLayerType(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public static void setSaveFromParentEnabled(View view, boolean flag)
    {
        view.setSaveFromParentEnabled(flag);
    }

    public static void setScaleX(View view, float f)
    {
        view.setScaleX(f);
    }

    public static void setScaleY(View view, float f)
    {
        view.setScaleY(f);
    }

    public static void setTranslationX(View view, float f)
    {
        view.setTranslationX(f);
    }

    public static void setTranslationY(View view, float f)
    {
        view.setTranslationY(f);
    }
}
