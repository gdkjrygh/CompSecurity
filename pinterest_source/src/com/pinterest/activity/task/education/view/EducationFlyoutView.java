// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.Education;
import com.pinterest.activity.task.education.model.EducationFlyout;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.FontUtils;
import com.pinterest.ui.spring.SpringInterpolator;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationFlyoutPulseAnimation

public class EducationFlyoutView extends FrameLayout
{

    private final int _animationDuration;
    private EducationEvent _event;
    private EducationFlyout _flyout;
    TextView _flyoutTv;
    ViewGroup _flyoutView;
    private AnimatorSet _hideAnimatorSet;
    private float _hideDistance;
    private boolean _isEnabled;
    private int _locationState;
    private Animator _pulseAnimator;
    View _pulseView;
    private final int _rotationDegree;
    private AnimatorSet _showAnimatorSet;
    View _touchView;

    public EducationFlyoutView(Context context)
    {
        this(context, null);
    }

    public EducationFlyoutView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationFlyoutView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _animationDuration = 600;
        _rotationDegree = -45;
        _locationState = 0;
        init(context);
    }

    private void hide(final com.pinterest.kit.utils.AnimationUtils.AnimationListener listener, boolean flag)
    {
        if (_isEnabled || !flag)
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _isEnabled = flag;
            if (!_hideAnimatorSet.isRunning())
            {
                if (_showAnimatorSet.isRunning())
                {
                    _showAnimatorSet.cancel();
                }
                if (_pulseAnimator.isRunning())
                {
                    _pulseAnimator.cancel();
                }
                if (listener != null)
                {
                    _hideAnimatorSet.addListener(listener);
                    _hideAnimatorSet.addListener(new _cls3());
                }
                _hideAnimatorSet.start();
                return;
            }
        }
    }

    public void hide(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        hide(animationlistener, true);
    }

    public void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f0301c8, this, true);
        ButterKnife.a(this);
        FontUtils.setFont(com.pinterest.kit.utils.FontUtils.TypefaceId.MEDIUM, _flyoutTv);
        _hideDistance = (float)((Math.sin(Math.toRadians(Math.abs(-45))) * (double)Math.max(Device.getScreenWidth(), Device.getScreenHeight())) / 2D + 200D);
        _flyoutView.setRotation(-45F);
        _flyoutView.setTranslationY(_hideDistance);
        _flyoutView.setAlpha(0.0F);
        _showAnimatorSet = new AnimatorSet();
        _showAnimatorSet.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_flyoutView, "translationY", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(_flyoutView, "rotation", new float[] {
                0.0F
            }), ObjectAnimator.ofFloat(_flyoutView, "alpha", new float[] {
                1.0F
            })
        });
        _showAnimatorSet.setDuration(600L);
        _showAnimatorSet.setInterpolator(new SpringInterpolator(0.75F, 0.25F));
        _hideAnimatorSet = new AnimatorSet();
        _hideAnimatorSet.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_flyoutView, "translationY", new float[] {
                _hideDistance
            }), ObjectAnimator.ofFloat(_flyoutView, "rotation", new float[] {
                -45F
            }), ObjectAnimator.ofFloat(_flyoutView, "alpha", new float[] {
                0.0F
            })
        });
        _hideAnimatorSet.setDuration(600L);
        _hideAnimatorSet.setInterpolator(new SpringInterpolator(0.95F, 0.25F));
        _pulseAnimator = (new EducationFlyoutPulseAnimation(_pulseView)).getAnimator();
        _touchView.setOnTouchListener(new _cls1());
    }

    void onStartIvClicked(View view)
    {
        if (!_isEnabled)
        {
            return;
        } else
        {
            hide(new _cls2(), false);
            return;
        }
    }

    public void setEvent(EducationEvent educationevent)
    {
        _event = educationevent;
        educationevent = _event.getEducation().getFlyout();
        if (educationevent != null)
        {
            _flyoutTv.setText(educationevent.getText());
        }
    }

    public void show()
    {
        if (_isEnabled || _showAnimatorSet.isRunning())
        {
            return;
        }
        _isEnabled = true;
        if (_hideAnimatorSet.isRunning())
        {
            _hideAnimatorSet.cancel();
        }
        _showAnimatorSet.start();
        _pulseAnimator.start();
    }

    public void updateLocationState()
    {
        _locationState = _locationState + 1;
    }





    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationFlyoutView this$0;
        final com.pinterest.kit.utils.AnimationUtils.AnimationListener val$listener;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            _hideAnimatorSet.removeListener(listener);
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls3()
        {
            this$0 = EducationFlyoutView.this;
            listener = animationlistener;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final EducationFlyoutView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (!_isEnabled)
            {
                return false;
            } else
            {
                final int locationState = _locationState;
                class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
                {

                    final _cls1 this$1;
                    final int val$locationState;

                    public void onAnimationEnd(Animator animator)
                    {
                        if (locationState != _locationState)
                        {
                            return;
                        }
                        if (_event != null && _event.getEducation() != null)
                        {
                            _event.getEducation().setIsFlyout(false);
                        }
                        Events.post(_event);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    locationState = i;
                    super();
                }
                }

                hide(new _cls1());
                return false;
            }
        }

        _cls1()
        {
            this$0 = EducationFlyoutView.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationFlyoutView this$0;

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

        _cls2()
        {
            this$0 = EducationFlyoutView.this;
            super();
        }
    }

}
