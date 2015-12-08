// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;

// Referenced classes of package android.support.wearable.view:
//            BackgroundView

public class BackgroundCrossfader extends FrameLayout
{
    private static class ScaledInterpolator
        implements Interpolator
    {

        private float end;
        private float range;
        private float start;

        public float getInterpolation(float f)
        {
            if (f < start)
            {
                return 0.0F;
            }
            if (f > end)
            {
                return 1.0F;
            } else
            {
                return (f - start) / range;
            }
        }

        public ScaledInterpolator(float f, float f1)
        {
            start = f;
            end = f1;
            range = f1 - f;
        }
    }


    private static final float CROSSFADE_AMOUNT = 0.2F;
    private static final Interpolator INTERPOLATOR = new ScaledInterpolator(0.3F, 0.7F);
    private Drawable mBackDrawable;
    private BackgroundView mBackground;
    private Drawable mForeDrawable;
    private BackgroundView mForeground;
    private float mProgress;

    public BackgroundCrossfader(Context context)
    {
        this(context, null, 0);
    }

    public BackgroundCrossfader(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BackgroundCrossfader(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mForeground = new BackgroundView(context);
        mBackground = new BackgroundView(context);
        addView(mBackground, new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(mForeground, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    private void updateProgress()
    {
        if (mForeground != null)
        {
            mForeground.setAlpha(INTERPOLATOR.getInterpolation(mProgress));
        }
    }

    public void setBackgrounds(Drawable drawable, Drawable drawable1)
    {
        if (drawable != mForeDrawable || drawable1 != mBackDrawable)
        {
            mBackground.setDrawable(drawable1);
            mForeground.setDrawable(drawable);
            updateProgress();
        }
    }

    public void setBackgroundsPositionX(float f, float f1)
    {
        mForeground.setBackgroundPositionX(f);
        mBackground.setBackgroundPositionX(f1);
    }

    public void setBackgroundsPositionY(float f, float f1)
    {
        mForeground.setBackgroundPositionY(f);
        mBackground.setBackgroundPositionY(f1);
    }

    public void setProgress(float f)
    {
        mProgress = f;
        updateProgress();
    }

}
