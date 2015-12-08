// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout

class PlayHeaderStatusBarUnderlay extends View
    implements android.animation.Animator.AnimatorListener
{

    private ObjectAnimator mAlphaAnimator;
    private int mDrawHeight;
    int mFadeDirection;
    int mOverlayColor;
    private final Paint mPaint;
    int mStatusBarHeight;
    int mUnderlayColor;

    public PlayHeaderStatusBarUnderlay(Context context)
    {
        this(context, null);
    }

    public PlayHeaderStatusBarUnderlay(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (PlayHeaderListLayout.SUPPORT_DRAW_STATUS_BAR)
        {
            mPaint = new Paint();
            mPaint.setAntiAlias(false);
            setAlpha(0.0F);
            return;
        } else
        {
            mPaint = null;
            return;
        }
    }

    public void onAnimationCancel(Animator animator)
    {
        if (animator == mAlphaAnimator)
        {
            mFadeDirection = 0;
            mAlphaAnimator = null;
        }
    }

    public void onAnimationEnd(Animator animator)
    {
        if (animator == mAlphaAnimator)
        {
            boolean flag;
            if (mFadeDirection == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mFadeDirection = 0;
            mAlphaAnimator = null;
            if (flag)
            {
                setMinimumHeight(0);
            }
            setLayerType(0, null);
        }
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        setLayerType(2, null);
    }

    protected void onDraw(Canvas canvas)
    {
        if (PlayHeaderListLayout.SUPPORT_DRAW_STATUS_BAR)
        {
            int i = getWidth();
            mPaint.setColor(mUnderlayColor);
            canvas.drawRect(0.0F, 0.0F, i, mDrawHeight, mPaint);
            if (mDrawHeight > mStatusBarHeight)
            {
                mPaint.setColor(mOverlayColor);
                canvas.drawRect(0.0F, mStatusBarHeight, i, mDrawHeight, mPaint);
                return;
            }
        }
    }
}
