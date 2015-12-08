// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import java.util.concurrent.TimeUnit;

public class TimedProgressBar extends View
{

    private static final float MAX_PROGRESS_PERCENTAGE = 0.97F;
    private static final float STARTING_PROGRESS_PERCENTAGE = 0.01F;
    private long startTime;
    private long totalWaitTime;

    public TimedProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        totalWaitTime = 60L;
        startTime = 0L;
    }

    private void animateProgress()
    {
        long l = System.currentTimeMillis() - startTime;
        long l1 = TimeUnit.SECONDS.toMillis(totalWaitTime);
        float f = computeProgressPercentage(l, l1);
        l = getRemainingTimeMillis(l, l1);
        clearAnimation();
        ScaleAnimation scaleanimation = new ScaleAnimation(f, 0.97F, 1.0F, 1.0F, 1.0F, 1.0F);
        scaleanimation.setInterpolator(new LinearInterpolator());
        scaleanimation.setDuration(l);
        scaleanimation.setFillAfter(true);
        startAnimation(scaleanimation);
    }

    private float computeProgressPercentage(long l, long l1)
    {
        float f = (float)l / (float)l1 + 0.01F;
        if (f < 0.97F)
        {
            return f;
        } else
        {
            return 0.97F;
        }
    }

    private long getRemainingTimeMillis(long l, long l1)
    {
        return (long)((1.0F - computeProgressPercentage(l, l1)) * (float)l1);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void setStartTime(long l)
    {
        startTime = l;
    }

    public void setTotalWaitTime(long l)
    {
        totalWaitTime = l;
    }

    public void startProgressAnimation()
    {
        animateProgress();
    }
}
