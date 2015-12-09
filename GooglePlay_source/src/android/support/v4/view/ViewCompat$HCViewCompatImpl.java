// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompat

static class _cls9 extends _cls9
{

    public final float getAlpha(View view)
    {
        return view.getAlpha();
    }

    final long getFrameTime()
    {
        return ValueAnimator.getFrameDelay();
    }

    public final int getLayerType(View view)
    {
        return view.getLayerType();
    }

    public final int getMeasuredState(View view)
    {
        return view.getMeasuredState();
    }

    public final int getMeasuredWidthAndState(View view)
    {
        return view.getMeasuredWidthAndState();
    }

    public final float getTranslationX(View view)
    {
        return view.getTranslationX();
    }

    public final float getTranslationY(View view)
    {
        return view.getTranslationY();
    }

    public final void jumpDrawablesToCurrentState(View view)
    {
        view.jumpDrawablesToCurrentState();
    }

    public final int resolveSizeAndState(int i, int j, int k)
    {
        return View.resolveSizeAndState(i, j, k);
    }

    public final void setActivated(View view, boolean flag)
    {
        view.setActivated(flag);
    }

    public final void setAlpha(View view, float f)
    {
        view.setAlpha(f);
    }

    public void setLayerPaint(View view, Paint paint)
    {
        setLayerType(view, view.getLayerType(), paint);
        view.invalidate();
    }

    public final void setLayerType(View view, int i, Paint paint)
    {
        view.setLayerType(i, paint);
    }

    public final void setSaveFromParentEnabled(View view, boolean flag)
    {
        view.setSaveFromParentEnabled(false);
    }

    public final void setScaleX(View view, float f)
    {
        view.setScaleX(f);
    }

    public final void setScaleY(View view, float f)
    {
        view.setScaleY(f);
    }

    public final void setTranslationX(View view, float f)
    {
        view.setTranslationX(f);
    }

    public final void setTranslationY(View view, float f)
    {
        view.setTranslationY(f);
    }

    _cls9()
    {
    }
}
