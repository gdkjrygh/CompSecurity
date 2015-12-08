// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.education.model.EducationButton;
import com.pinterest.activity.task.education.model.EducationForeground;
import com.pinterest.activity.task.education.model.EducationStep;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Device;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.experiences.EducationPosition;
import com.pinterest.ui.ViewHelper;

public class EducationCardView extends RelativeLayout
{

    private static final int DEFAULT_EXTENSION_DISTANCE = (int)(25F * Device.getDensity());
    private static final int TRANSLATE_FROM_BOTTOM = 1;
    private static final int TRANSLATE_FROM_TOP = -1;
    ViewGroup _btContainer;
    private int _cardContentCompensation;
    private int _cardDisplacement;
    private int _cardDisplacementOp;
    ImageView _check;
    Button _exitBt;
    Button _forwardBt;
    private boolean _isLastStep;
    LinearLayout _layout;
    private boolean _measured;
    View _shimVw;
    private EducationStep _step;
    TextView _text;

    public EducationCardView(Context context)
    {
        this(context, null);
    }

    public EducationCardView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f0301c7, this, true);
        ButterKnife.a(this);
        _measured = false;
        _isLastStep = false;
        _check.setAlpha(0.0F);
        _check.setScaleX(0.75F);
        _check.setScaleY(0.75F);
    }

    private void slideIn()
    {
        setVisibility(4);
        ObjectAnimator objectanimator = AnimationUtils.springAnimate(this, "translationY", _cardDisplacementOp * _layout.getMeasuredHeight() + _cardDisplacement, _cardDisplacement, 0.28F, 0.028F);
        objectanimator.setDuration(800L);
        objectanimator.addListener(new _cls2());
        objectanimator.start();
    }

    private void slideOut(final com.pinterest.activity.task.education.event.EducationEvent.Type type, com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        float f = _cardDisplacementOp * _layout.getMeasuredHeight() + _cardDisplacement;
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            (float)_cardDisplacement, f
        });
        objectanimator.setDuration(250L);
        objectanimator.addListener(new _cls1());
        if (animationlistener != null)
        {
            objectanimator.addListener(animationlistener);
        }
        objectanimator.start();
    }

    private void updateUi(EducationForeground educationforeground)
    {
        EducationPosition educationposition;
        boolean flag;
        flag = false;
        educationposition = _step.getForeground().getYPosition();
        _cls4..SwitchMap.com.pinterest.schemas.experiences.EducationPosition[educationposition.ordinal()];
        JVM INSTR tableswitch 1 2: default 44
    //                   1 295
    //                   2 326;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_326;
_L1:
        byte byte0;
        _cardDisplacementOp = 1;
        _cardDisplacement = DEFAULT_EXTENSION_DISTANCE;
        _cardContentCompensation = -_cardDisplacement / 2;
        byte0 = 12;
_L4:
        _layout.setTranslationY(_cardContentCompensation);
        _check.setTranslationY(_cardContentCompensation);
        View view = findViewById(0x7f0f046a);
        if (view != null)
        {
            if (educationposition == EducationPosition.BOTTOM)
            {
                android.widget.RelativeLayout.LayoutParams layoutparams;
                int i;
                int j;
                if (byte0 == 10)
                {
                    i = DEFAULT_EXTENSION_DISTANCE;
                } else
                {
                    i = 0;
                }
                if (byte0 == 12)
                {
                    j = DEFAULT_EXTENSION_DISTANCE;
                } else
                {
                    j = 0;
                }
                view.setPadding(0, i, 0, j);
            }
            layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            layoutparams.addRule(byte0);
            view.setLayoutParams(layoutparams);
        }
        if (TextUtils.isEmpty(educationforeground.getText()))
        {
            _text.setVisibility(8);
        } else
        {
            _text.setVisibility(0);
            _text.setText(Html.fromHtml(educationforeground.getText()));
        }
        if (educationforeground.getForward().getLabel() == null)
        {
            _forwardBt.setVisibility(8);
        } else
        {
            setVisibility(0);
            _forwardBt.setText(educationforeground.getForward().getLabel());
        }
        if (educationforeground.getExit().getLabel() == null)
        {
            _exitBt.setVisibility(8);
        } else
        {
            setVisibility(0);
            _exitBt.setText(educationforeground.getExit().getLabel());
        }
        if (_forwardBt.getVisibility() == 8 || _exitBt.getVisibility() == 8)
        {
            _shimVw.setVisibility(8);
        } else
        {
            _shimVw.setVisibility(0);
        }
        educationforeground = _btContainer;
        if (_forwardBt.getVisibility() != 8 || _exitBt.getVisibility() != 8)
        {
            flag = true;
        }
        ViewHelper.setVisibility(educationforeground, flag);
        return;
_L2:
        _cardDisplacementOp = -1;
        _cardDisplacement = -DEFAULT_EXTENSION_DISTANCE;
        _cardContentCompensation = -_cardDisplacement / 2;
        byte0 = 10;
          goto _L4
        _cardDisplacementOp = 1;
        _cardDisplacement = -(int)Resources.dimension(0x7f0a0009);
        _cardContentCompensation = 0;
        byte0 = 12;
          goto _L4
    }

    public EducationStep getStep()
    {
        return _step;
    }

    void onExitClicked(View view)
    {
        Pinalytics.a(ElementType.CLOSE_BUTTON, ComponentType.CONTEXTUAL_USER_EDUCATION);
        slideOut(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS, null);
    }

    void onForwardClicked(View view)
    {
        if (_isLastStep)
        {
            Pinalytics.a(ElementType.DONE_BUTTON, ComponentType.CONTEXTUAL_USER_EDUCATION);
        } else
        {
            Pinalytics.a(ElementType.NEXT_BUTTON, ComponentType.CONTEXTUAL_USER_EDUCATION);
        }
        slideOut(com.pinterest.activity.task.education.event.EducationEvent.Type.NEXT, null);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (_layout.getMeasuredWidth() > 0 && !_measured)
        {
            slideIn();
            _measured = true;
        }
    }

    public void setIsLastStep(boolean flag)
    {
        _isLastStep = flag;
    }

    public void setStep(EducationStep educationstep)
    {
        _step = educationstep;
        updateUi(_step.getForeground());
        EducationHelper.a(_step.getId());
    }

    public void showSuccess(final com.pinterest.kit.utils.AnimationUtils.AnimationListener listener)
    {
        float f = _text.getTranslationY();
        _check.setTranslationY(100 - _cardContentCompensation);
        Object obj = findViewById(0x7f0f046a);
        if (obj == null)
        {
            return;
        } else
        {
            obj = (TransitionDrawable)((View) (obj)).getBackground();
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_text, "alpha", new float[] {
                0.0F
            }).setDuration(700L);
            objectanimator.setStartDelay(500L);
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(_text, "alpha", new float[] {
                    0.0F
                }).setDuration(500L), ObjectAnimator.ofFloat(_text, "translationY", new float[] {
                    f + 100F
                }).setDuration(500L), ObjectAnimator.ofFloat(_check, "alpha", new float[] {
                    1.0F
                }).setDuration(500L), ObjectAnimator.ofFloat(_check, "translationY", new float[] {
                    (float)_cardContentCompensation
                }).setDuration(500L), objectanimator
            });
            animatorset.addListener(new _cls3());
            ((TransitionDrawable) (obj)).startTransition(500);
            animatorset.start();
            return;
        }
    }



    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationCardView this$0;

        public void onAnimationStart(Animator animator)
        {
            super.onAnimationStart(animator);
            setVisibility(0);
        }

        _cls2()
        {
            this$0 = EducationCardView.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationCardView this$0;
        final com.pinterest.activity.task.education.event.EducationEvent.Type val$type;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            setVisibility(4);
            if (type != null)
            {
                Events.post(new EducationEvent(type));
            }
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        public void onAnimationStart(Animator animator)
        {
            super.onAnimationStart(animator);
            if (_forwardBt != null)
            {
                _forwardBt.setOnClickListener(null);
            }
            if (_exitBt != null)
            {
                _exitBt.setOnClickListener(null);
            }
        }

        _cls1()
        {
            this$0 = EducationCardView.this;
            type = type1;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[];

        static 
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationPosition = new int[EducationPosition.values().length];
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.TOP.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.BOTTOM_ABOVE_NAVIGATION.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationPosition[EducationPosition.BOTTOM.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationCardView this$0;
        final com.pinterest.kit.utils.AnimationUtils.AnimationListener val$listener;

        public void onAnimationCancel(Animator animator)
        {
            super.onAnimationCancel(animator);
            slideOut(null, listener);
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls3()
        {
            this$0 = EducationCardView.this;
            listener = animationlistener;
            super();
        }
    }

}
