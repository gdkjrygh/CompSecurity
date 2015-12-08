// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.base.Device;
import com.pinterest.education.EducationHelper;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;

public class EducationPulsarView extends FrameLayout
{

    private static final float DEFAULT_DECELERATE_INTERPOLATOR = 0.6F;
    private static final float INNER_ALPHA_DOWN = 0.8F;
    private static final long INNER_ALPHA_DOWN_DURATION = 282L;
    private static final long INNER_ALPHA_UP_DURATION = 306L;
    private static final long INNER_HOLD_DURATION1 = 162L;
    private static final long INNER_HOLD_DURATION2 = 396L;
    private static final long INNER_HOLD_DURATION3 = 684L;
    private static final float INNER_SCALE_DOWN = 0.68F;
    private static final long INNER_SCALE_DURATION = 180L;
    private static final float INNER_SCALE_UP = 0.85F;
    private static final float OUTER_ALPHA_UP = 0.6F;
    private static final long OUTER_ALPHA_UP_BEGIN_AFTER = 42L;
    private static final long OUTER_ALPHA_UP_DURATION = 180L;
    private static final float OUTER_DECELERATE_INTERPOLATOR = 0.4F;
    private static final long OUTER_HOLD_DURATION = 1440L;
    private static final long OUTER_SCALE_AND_ALPHA_DOWN_BEGIN_AFTER = 210L;
    private static final float OUTER_SCALE_DOWN = 0.7F;
    private static final long OUTER_SCALE_DURATION = 540L;
    private static final float OUTER_SCALE_UP = 1F;
    ImageView _innerCircle;
    ImageView _outerCircle;
    private AnimatorSet pulsarAnim;
    private AnimatorListenerAdapter pulsarAnimListener;
    private int pulsarHeight;
    private int pulsarWidth;

    public EducationPulsarView(Context context)
    {
        this(context, null);
    }

    public EducationPulsarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationPulsarView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        pulsarAnimListener = new _cls1();
        init(context);
    }

    private AnimatorSet animateInnerCircle()
    {
        Object obj = ObjectAnimator.ofFloat(_innerCircle, "scaleX", new float[] {
            0.85F, 0.68F
        });
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_innerCircle, "scaleY", new float[] {
            0.85F, 0.68F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            obj, objectanimator
        });
        animatorset.setDuration(180L);
        animatorset.setInterpolator(new DecelerateInterpolator(0.6F));
        objectanimator = ObjectAnimator.ofFloat(_innerCircle, "scaleX", new float[] {
            0.68F, 0.85F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_innerCircle, "scaleY", new float[] {
            0.68F, 0.85F
        });
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        ((AnimatorSet) (obj)).setDuration(180L);
        ((AnimatorSet) (obj)).setInterpolator(new DecelerateInterpolator(0.6F));
        objectanimator = ObjectAnimator.ofFloat(_innerCircle, "scaleX", new float[] {
            0.85F, 0.85F
        });
        objectanimator.setDuration(162L);
        objectanimator1 = ObjectAnimator.ofFloat(_innerCircle, "alpha", new float[] {
            0.8F, 0.0F
        });
        objectanimator1.setDuration(282L);
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(_innerCircle, "alpha", new float[] {
            0.0F, 0.0F
        });
        objectanimator2.setDuration(396L);
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(_innerCircle, "alpha", new float[] {
            0.0F, 0.8F
        });
        objectanimator3.setDuration(306L);
        objectanimator3.setInterpolator(new DecelerateInterpolator(0.6F));
        ObjectAnimator objectanimator4 = ObjectAnimator.ofFloat(_innerCircle, "alpha", new float[] {
            0.8F, 0.8F
        });
        objectanimator4.setDuration(684L);
        AnimatorSet animatorset1 = new AnimatorSet();
        animatorset1.playSequentially(new Animator[] {
            animatorset, obj, objectanimator, objectanimator1, objectanimator2, objectanimator3, objectanimator4
        });
        return animatorset1;
    }

    private AnimatorSet animateOuterCircle()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_outerCircle, "scaleX", new float[] {
            1.0F, 0.7F
        });
        objectanimator.setDuration(42L);
        Object obj = ObjectAnimator.ofFloat(_outerCircle, "scaleY", new float[] {
            1.0F, 0.7F
        });
        ((ObjectAnimator) (obj)).setDuration(42L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, obj
        });
        objectanimator = ObjectAnimator.ofFloat(_outerCircle, "alpha", new float[] {
            0.0F, 0.6F
        });
        objectanimator.setDuration(180L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_outerCircle, "scaleX", new float[] {
            0.7F, 1.0F
        });
        objectanimator1.setDuration(540L);
        objectanimator1.setInterpolator(new DecelerateInterpolator(0.4F));
        Object obj1 = ObjectAnimator.ofFloat(_outerCircle, "scaleY", new float[] {
            0.7F, 1.0F
        });
        ((ObjectAnimator) (obj1)).setDuration(540L);
        ((ObjectAnimator) (obj1)).setInterpolator(new DecelerateInterpolator(0.4F));
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(_outerCircle, "alpha", new float[] {
            0.6F, 0.0F
        });
        objectanimator2.setInterpolator(new DecelerateInterpolator(0.4F));
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            objectanimator1, obj1, objectanimator2
        });
        ((AnimatorSet) (obj)).setDuration(540L);
        objectanimator1 = ObjectAnimator.ofFloat(_outerCircle, "alpha", new float[] {
            0.0F, 0.0F
        });
        objectanimator1.setDuration(1440L);
        obj1 = new AnimatorSet();
        ((AnimatorSet) (obj1)).play(animatorset);
        ((AnimatorSet) (obj1)).play(objectanimator).after(42L);
        ((AnimatorSet) (obj1)).play(((Animator) (obj))).after(210L);
        ((AnimatorSet) (obj1)).play(objectanimator1).after(((Animator) (obj)));
        return ((AnimatorSet) (obj1));
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f0301cb, this, true);
        ButterKnife.a(this);
        setVisibility(4);
    }

    public void animatePulsar()
    {
        pulsarAnim = new AnimatorSet();
        AnimatorSet animatorset = animateInnerCircle();
        AnimatorSet animatorset1 = animateOuterCircle();
        pulsarAnim.playTogether(new Animator[] {
            animatorset, animatorset1
        });
        pulsarAnim.addListener(pulsarAnimListener);
        pulsarAnim.start();
    }

    public void hidePulsar()
    {
        if (pulsarAnim != null)
        {
            pulsarAnim.removeListener(pulsarAnimListener);
        }
        setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        if (pulsarAnim != null)
        {
            pulsarAnim.removeAllListeners();
        }
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void positionPulsar(AndroidEducationAnchor androideducationanchor)
    {
        int i;
        if (pulsarWidth == 0)
        {
            i = _outerCircle.getWidth();
        } else
        {
            i = pulsarWidth;
        }
        pulsarWidth = i;
        if (pulsarHeight == 0)
        {
            i = _outerCircle.getHeight();
        } else
        {
            i = pulsarHeight;
        }
        pulsarHeight = i;
        androideducationanchor = EducationHelper.a(getContext(), androideducationanchor);
        if (androideducationanchor != null)
        {
            int ai[] = EducationHelper.a(androideducationanchor);
            int k = (ai[0] + androideducationanchor.getWidth() / 2) - pulsarWidth / 2;
            int l = ai[1];
            int i1 = androideducationanchor.getHeight() / 2;
            int j1 = pulsarHeight / 2;
            int j;
            if ((float)(pulsarWidth + k) > Device.getScreenWidth())
            {
                i = (int)Device.getScreenWidth() - (pulsarWidth + k);
            } else
            {
                i = 0;
            }
            if ((float)(ai[1] + pulsarHeight) > Device.getScreenHeight() - (float)Device.getStatusBarHeight())
            {
                j = (int)Device.getScreenHeight() - Device.getStatusBarHeight() - (ai[1] + pulsarHeight);
            } else
            {
                j = 0;
            }
            androideducationanchor = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
            androideducationanchor.setMargins(k, (i1 + l) - j1, i, j);
            setLayoutParams(androideducationanchor);
            if (getVisibility() != 0)
            {
                setVisibility(0);
                animatePulsar();
            }
        }
    }


    private class _cls1 extends AnimatorListenerAdapter
    {

        final EducationPulsarView this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            pulsarAnim.start();
        }

        _cls1()
        {
            this$0 = EducationPulsarView.this;
            super();
        }
    }

}
