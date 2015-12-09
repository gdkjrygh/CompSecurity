// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public final class LevelProgressViewHC extends View
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    float mAnimationValue;
    float mLevelProgress;
    Paint mPaint;
    private float mStrokeWidth;

    public LevelProgressViewHC(Context context)
    {
        super(context);
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        mAnimationValue = ((Float)valueanimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    public final void onDraw(Canvas canvas)
    {
        RectF rectf = new RectF(canvas.getClipBounds());
        rectf.left = rectf.left + mStrokeWidth * 0.5F;
        rectf.top = rectf.top + mStrokeWidth * 0.5F;
        rectf.right = rectf.right - mStrokeWidth * 0.5F;
        rectf.bottom = rectf.bottom - mStrokeWidth * 0.5F;
        canvas.drawArc(rectf, 45F, (int)(mAnimationValue * mLevelProgress * 360F), false, mPaint);
    }

    final void setStrokeWidth(int i)
    {
        mStrokeWidth = (float)i * 1.15F;
        mPaint.setStrokeWidth(mStrokeWidth);
        invalidate();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/widget/LevelProgressViewHC$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final LevelProgressViewHC this$0;
        final ValueAnimator val$animator;

        public final void run()
        {
            animator.start();
        }

            
            {
                this$0 = LevelProgressViewHC.this;
                animator = valueanimator;
                super();
            }
    }

}
