// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.rebound.g;
import com.facebook.rebound.h;
import com.facebook.rebound.j;
import com.facebook.rebound.n;
import com.soundcloud.android.playback.PlaybackProgress;
import com.soundcloud.android.playback.ui.progress.ProgressAware;
import com.soundcloud.android.utils.ScTextUtils;
import java.util.concurrent.TimeUnit;

public class TimestampView extends LinearLayout
    implements ProgressAware, com.soundcloud.android.playback.ui.progress.ScrubController.OnScrubListener
{

    private static final long BUFFERING_ANIMATION_DURATION = 1800L;
    private static final long BUFFERING_RESET_ANIMATION_DURATION = 300L;
    private static final float SCRUB_SCALE = 2.2F;
    private static final long SCRUB_TRANSITION_DURATION = 120L;
    private static final double SPRING_FRICTION = 10D;
    private static final double SPRING_TENSION = 110D;
    private int animatePercentage;
    private final View background;
    private AnimatorSet bufferingAnimationSet;
    private final View dividerView;
    private long duration;
    private final TextView durationText;
    private boolean inBufferingMode;
    private boolean isScrubbing;
    private final TextView progressText;
    private final g springListener;
    private final n springSystem;
    private h springY;
    private AnimatorSet timestampAnimator;
    private final View timestampHolder;
    private final View timestampLayout;
    private final float timestampOriginalHeight;
    private final float waveformBaseline;

    public TimestampView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, n.c());
    }

    public TimestampView(Context context, AttributeSet attributeset, n n1)
    {
        super(context, attributeset);
        springListener = new _cls1();
        springSystem = n1;
        LayoutInflater.from(context).inflate(0x7f0300c2, this, true);
        setOrientation(1);
        setClipChildren(false);
        progressText = (TextView)findViewById(0x7f0f0263);
        durationText = (TextView)findViewById(0x7f0f0264);
        background = findViewById(0x7f0f0262);
        timestampLayout = findViewById(0x7f0f0261);
        timestampHolder = findViewById(0x7f0f0260);
        dividerView = findViewById(0x7f0f0265);
        animatePercentage = getResources().getInteger(0x7f0a0006);
        waveformBaseline = getResources().getDimension(0x7f0b0112);
        timestampOriginalHeight = getResources().getDimension(0x7f0b0105);
        bufferingAnimationSet = createBufferingAnimationSet();
    }

    private void animateFromScrubMode()
    {
        timestampAnimator = new AnimatorSet();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(timestampLayout, "translationY", new float[] {
            timestampLayout.getTranslationY(), 0.0F
        });
        timestampAnimator.playTogether(new Animator[] {
            objectanimator, ObjectAnimator.ofFloat(timestampLayout, "scaleX", new float[] {
                timestampLayout.getScaleX(), 1.0F
            }), ObjectAnimator.ofFloat(timestampLayout, "scaleY", new float[] {
                timestampLayout.getScaleY(), 1.0F
            }), ObjectAnimator.ofFloat(background, "alpha", new float[] {
                background.getAlpha(), 1.0F
            })
        });
        configureHardwareAnimation(timestampAnimator);
        timestampAnimator.setDuration(120L);
        timestampAnimator.start();
    }

    private void animateToScrubMode()
    {
        springY = springSystem.a();
        springY.a(springListener);
        springY.a(j.a(110D, 10D));
        springY.a(timestampLayout.getTranslationY() / (float)getTimestampScrubY());
        springY.b(1.0D);
        background.setAlpha(0.0F);
    }

    private void clearAnimations()
    {
        if (timestampAnimator != null)
        {
            timestampAnimator.cancel();
        }
        if (springY != null)
        {
            springY.c();
            springY.a();
        }
    }

    private void configureHardwareAnimation(AnimatorSet animatorset)
    {
        timestampLayout.setLayerType(2, null);
        animatorset.addListener(new _cls2());
    }

    private ValueAnimator createBufferingAnimation(View view)
    {
        view = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            1.0F, 0.2F, 1.0F
        });
        view.setDuration(1800L);
        view.setInterpolator(new AccelerateDecelerateInterpolator());
        view.setRepeatMode(1);
        view.setRepeatCount(-1);
        return view;
    }

    private AnimatorSet createBufferingAnimationSet()
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            createBufferingAnimation(progressText), createBufferingAnimation(durationText), createBufferingAnimation(dividerView)
        });
        return animatorset;
    }

    private String format(long l)
    {
        return ScTextUtils.formatTimestamp(l, TimeUnit.MILLISECONDS);
    }

    private int getTimestampScrubY()
    {
        return (int)(-(((double)((float)timestampHolder.getTop() - (float)getHeight() * ((float)animatePercentage / 100F)) + (double)waveformBaseline) - (double)timestampOriginalHeight));
    }

    private void resetBufferingStates(View view)
    {
        view = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            view.getAlpha(), 1.0F
        });
        view.setDuration(300L);
        view.start();
    }

    private void selectiveInvalidate(boolean flag)
    {
        int k = background.getLeft();
        int l = timestampLayout.getTop();
        int i1 = background.getTop();
        int j1 = background.getRight();
        float f;
        int i;
        if (flag)
        {
            i = getBottom();
        } else
        {
            i = (int)((float)(timestampLayout.getTop() + background.getBottom()) + (float)background.getHeight() * 2.2F);
        }
        f = ((float)background.getWidth() * 2.2F) / 2.0F;
        j1 = (int)((float)j1 + f);
        invalidate((int)((float)k - f), i1 + l, j1, i);
    }

    public void displayScrubPosition(float f)
    {
        long l = (long)((float)duration * f);
        progressText.setText(format(l));
        selectiveInvalidate(false);
    }

    public boolean isShowingBackground()
    {
        return background.getVisibility() == 0;
    }

    public void scrubStateChanged(int i)
    {
        boolean flag = true;
        if (i != 1)
        {
            flag = false;
        }
        isScrubbing = flag;
        clearAnimations();
        if (isScrubbing)
        {
            animateToScrubMode();
        } else
        if (timestampLayout.getTranslationY() != 0.0F || i == 2)
        {
            animateFromScrubMode();
            return;
        }
    }

    public void setBufferingMode(boolean flag)
    {
label0:
        {
            if (flag != inBufferingMode)
            {
                inBufferingMode = flag;
                if (!inBufferingMode)
                {
                    break label0;
                }
                bufferingAnimationSet.start();
            }
            return;
        }
        bufferingAnimationSet.cancel();
        resetBufferingStates(progressText);
        resetBufferingStates(durationText);
        resetBufferingStates(dividerView);
    }

    public void setInitialProgress(long l)
    {
        duration = l;
        progressText.setText(format(0L));
        durationText.setText(format(l));
    }

    public void setProgress(PlaybackProgress playbackprogress)
    {
        if (playbackprogress.isDurationValid() && playbackprogress.getDuration() != duration)
        {
            duration = playbackprogress.getDuration();
        }
        if (!isScrubbing)
        {
            progressText.setText(format(playbackprogress.getPosition()));
            durationText.setText(format(duration));
        }
    }

    public void showBackground(boolean flag)
    {
        View view = background;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }




    private class _cls1 extends g
    {

        final TimestampView this$0;

        public void onSpringUpdate(h h1)
        {
            float f = (float)h1.d.a;
            timestampLayout.setTranslationY((float)getTimestampScrubY() * f);
            timestampLayout.setScaleX(f * 2.2F);
            timestampLayout.setScaleY(f * 2.2F);
            selectiveInvalidate(true);
        }

        _cls1()
        {
            this$0 = TimestampView.this;
            super();
        }
    }


    private class _cls2 extends AnimatorListenerAdapter
    {

        final TimestampView this$0;

        public void onAnimationCancel(Animator animator)
        {
            timestampLayout.setLayerType(0, null);
        }

        public void onAnimationEnd(Animator animator)
        {
            timestampLayout.setLayerType(0, null);
        }

        _cls2()
        {
            this$0 = TimestampView.this;
            super();
        }
    }

}
