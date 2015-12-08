// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.progress;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;

public abstract class ProgressAnimator
{

    protected final View progressView;
    protected final ObjectAnimator wrappedAnimator;

    public ProgressAnimator(View view, float f, float f1)
    {
        progressView = view;
        wrappedAnimator = createAnimator(f, f1);
    }

    protected void addListener(AnimatorListenerAdapter animatorlisteneradapter)
    {
        wrappedAnimator.addListener(animatorlisteneradapter);
    }

    public void cancel()
    {
        wrappedAnimator.cancel();
    }

    protected abstract ObjectAnimator createAnimator(float f, float f1);

    public abstract float getDifferenceFromCurrentValue(float f);

    List getWrappedAnimationListeners()
    {
        return wrappedAnimator.getListeners();
    }

    public boolean isRunning()
    {
        return wrappedAnimator.isRunning();
    }

    protected void removeListener(AnimatorListenerAdapter animatorlisteneradapter)
    {
        wrappedAnimator.removeListener(animatorlisteneradapter);
    }

    public void setCurrentPlayTime(long l)
    {
        wrappedAnimator.setCurrentPlayTime(l);
    }

    public void setDuration(long l)
    {
        wrappedAnimator.setDuration(l);
    }

    public void start()
    {
        wrappedAnimator.start();
    }
}
