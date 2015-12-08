// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.ui.grid:
//            PinGridCell, PinGridFeedbackView

public class PinGridFlipContainer extends FrameLayout
{

    private static final int MAX_HEIGHT = (int)Resources.dimension(0x7f0a0121);
    private static final int MIN_HEIGHT = (int)Resources.dimension(0x7f0a0122);
    private AnimatorSet _animSet;
    private Pin _pin;
    private AnimatorSet _rotate180;
    private AnimatorSet _rotate90;
    public PinGridFeedbackView feedbackView;
    public PinGridCell gridCell;

    public PinGridFlipContainer(Context context)
    {
        this(context, null);
    }

    public PinGridFlipContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinGridFlipContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _animSet = new AnimatorSet();
        init();
    }

    public static PinGridFlipContainer from(View view, ViewGroup viewgroup)
    {
        if (view instanceof PinGridFlipContainer)
        {
            return (PinGridFlipContainer)view;
        }
        if (view != null)
        {
            PLog.warn((new StringBuilder("PinGridFlipContainer v: ")).append(view).toString(), new Object[0]);
        }
        return new PinGridFlipContainer(ViewHelper.getContext(view, viewgroup));
    }

    private void init()
    {
        gridCell = new PinGridCell(getContext());
        feedbackView = new PinGridFeedbackView(getContext());
        feedbackView.setRotationY(180F);
        addView(gridCell);
        addView(feedbackView);
        initAnimator();
    }

    private void initAnimator()
    {
        _rotate90 = (AnimatorSet)AnimatorInflater.loadAnimator(getContext(), 0x7f040029);
        _rotate90.setTarget(this);
        _rotate90.addListener(new _cls1());
        _rotate180 = (AnimatorSet)AnimatorInflater.loadAnimator(getContext(), 0x7f04002a);
        _rotate180.setTarget(this);
        _animSet.playSequentially(new Animator[] {
            _rotate90, _rotate180
        });
        _rotate180.addListener(new _cls2());
    }

    private void startAnimation()
    {
        _animSet.start();
    }

    private void updateState(boolean flag)
    {
        if (flag)
        {
            setRotationY(0.0F);
            gridCell.setVisibility(0);
            feedbackView.setVisibility(4);
            return;
        } else
        {
            setRotationY(180F);
            gridCell.setVisibility(4);
            feedbackView.setVisibility(0);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (_pin.getHiddenState().intValue() != 1)
        {
            return;
        }
        j = getMeasuredHeight();
        if (j <= MAX_HEIGHT) goto _L2; else goto _L1
_L1:
        i = MAX_HEIGHT;
_L4:
        setMeasuredDimension(getMeasuredWidth(), i);
        return;
_L2:
        i = j;
        if (j < MIN_HEIGHT)
        {
            i = MIN_HEIGHT;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setPin(Pin pin, boolean flag)
    {
        if (pin != null)
        {
            _pin = pin;
            feedbackView.setPin(pin, flag);
            if (!flag)
            {
                if (_pin.getHiddenState().intValue() == 3)
                {
                    updateState(true);
                    startAnimation();
                } else
                {
                    updateState(false);
                }
                requestLayout();
                return;
            }
        }
    }



    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final PinGridFlipContainer this$0;

        public void onAnimationEnd(Animator animator)
        {
            gridCell.setVisibility(4);
            feedbackView.setVisibility(0);
        }

        _cls1()
        {
            this$0 = PinGridFlipContainer.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final PinGridFlipContainer this$0;

        public void onAnimationEnd(Animator animator)
        {
            _pin.setHiddenState(Integer.valueOf(1));
            Events.postSticky(new com.pinterest.api.model.Pin.EditEvent(_pin));
        }

        _cls2()
        {
            this$0 = PinGridFlipContainer.this;
            super();
        }
    }

}
