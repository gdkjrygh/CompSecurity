// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Constants;
import com.pinterest.experience.Experiences;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.ObservableImageView;
import com.pinterest.ui.spring.SpringInterpolator;

public class EducationTriggerView extends FrameLayout
{

    private static final float DEFAULT_HIDE_DISTANCE = 185F;
    private final long _defaultSlideDuration;
    private EducationEvent _event;
    private ObjectAnimator _hideAnimator;
    private float _hideDistance;
    private boolean _isEnabled;
    private ObjectAnimator _showAnimator;
    ObservableImageView _triggerIv;

    public EducationTriggerView(Context context)
    {
        this(context, null);
    }

    public EducationTriggerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationTriggerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _defaultSlideDuration = 500L;
        _hideDistance = 185F;
        init(context);
    }

    private void adjustContainerPadding()
    {
        int i = Constants.MARGIN;
        if (Experiences.c.equals(_event.getEducation().getPid()))
        {
            i = Constants.ACTIONBAR_HEIGHT + Constants.MARGIN;
        }
        _hideDistance = 185F + (float)i;
        setPaddingBottom(i);
    }

    private void hide(final com.pinterest.kit.utils.AnimationUtils.AnimationListener listener, boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isEnabled = flag;
        if (_hideAnimator.isRunning())
        {
            return;
        }
        if (listener != null)
        {
            _hideAnimator.addListener(listener);
            _hideAnimator.addListener(new _cls3());
        }
        if (_showAnimator.isRunning())
        {
            _hideAnimator.setDuration(_showAnimator.getCurrentPlayTime());
            _showAnimator.cancel();
        } else
        {
            _hideAnimator.setDuration(500L);
        }
        _hideAnimator.setFloatValues(new float[] {
            _triggerIv.getTranslationY(), _hideDistance
        });
        _hideAnimator.start();
    }

    private void init(Context context)
    {
        setClipToPadding(false);
        LayoutInflater.from(context).inflate(0x7f0301cd, this, true);
        ButterKnife.a(this);
        _isEnabled = false;
        _triggerIv.setClickable(true);
        _triggerIv.setTranslationY(_hideDistance);
        _showAnimator = ObjectAnimator.ofFloat(_triggerIv, "translationY", new float[] {
            0.0F
        });
        _showAnimator.setDuration(500L).setInterpolator(new SpringInterpolator(0.75F, 0.25F));
        _hideAnimator = ObjectAnimator.ofFloat(_triggerIv, "translationY", new float[] {
            0.0F
        });
        _hideAnimator.setDuration(500L).setInterpolator(new SpringInterpolator(0.95F, 0.25F));
    }

    public void hide(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        hide(animationlistener, true);
    }

    void onImageClicked(View view)
    {
        if (!_isEnabled)
        {
            return;
        } else
        {
            Pinalytics.a(ElementType.HELP_BUTTON, ComponentType.CONTEXTUAL_USER_EDUCATION);
            hide(new _cls1(), false);
            return;
        }
    }

    public void setEvent(EducationEvent educationevent)
    {
        _event = educationevent;
    }

    public void setPaddingBottom(int i)
    {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    public void show(final com.pinterest.kit.utils.AnimationUtils.AnimationListener listener)
    {
        if (_isEnabled || _showAnimator.isRunning())
        {
            return;
        }
        _isEnabled = true;
        adjustContainerPadding();
        if (listener != null)
        {
            _showAnimator.addListener(listener);
            _showAnimator.addListener(new _cls2());
        }
        if (_hideAnimator.isRunning())
        {
            _showAnimator.setDuration(_hideAnimator.getCurrentPlayTime());
            _hideAnimator.cancel();
        } else
        {
            _showAnimator.setDuration(500L);
        }
        _showAnimator.setFloatValues(new float[] {
            _hideDistance, 0.0F
        });
        _showAnimator.start();
    }





    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationTriggerView this$0;
        final com.pinterest.kit.utils.AnimationUtils.AnimationListener val$listener;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            _hideAnimator.removeListener(listener);
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls3()
        {
            this$0 = EducationTriggerView.this;
            listener = animationlistener;
            super();
        }
    }


    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationTriggerView this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            if (_isEnabled)
            {
                if (_event != null && _event.getEducation() != null)
                {
                    _event.getEducation().setTriggered(true);
                }
                Events.post(_event);
            }
        }

        _cls1()
        {
            this$0 = EducationTriggerView.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationTriggerView this$0;
        final com.pinterest.kit.utils.AnimationUtils.AnimationListener val$listener;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            _showAnimator.removeListener(listener);
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls2()
        {
            this$0 = EducationTriggerView.this;
            listener = animationlistener;
            super();
        }
    }

}
