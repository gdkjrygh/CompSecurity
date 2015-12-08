// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.base.Constants;
import com.pinterest.kit.view.PinCollectionBaseView;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;

public class PlaceModulePinGridView extends PinCollectionBaseView
{

    private static final int IMAGE_VIEW_IDS[] = {
        0x7f0f00a6, 0x7f0f00a9, 0x7f0f00ac, 0x7f0f00a7
    };
    private static final int MAX_PINS = 4;
    private static int WEIGHTS_FOUR_PINS[] = {
        1, 1, 3, 1
    };
    private static int WEIGHTS_ONE_PIN[] = {
        1
    };
    private static int WEIGHTS_THREE_PINS[] = {
        1, 1, 1
    };
    private static int WEIGHTS_TWO_PINS[] = {
        1, 1
    };
    ImageView _dimmingLayer;
    LinearLayout _leftColumn;
    TextView _numPinsText;
    LinearLayout _numPinsView;
    FrameLayout _wrapperLayout;

    public PlaceModulePinGridView(Context context)
    {
        super(context);
    }

    protected void fadeInImageAt(int i)
    {
        if (i == 0)
        {
            _numPinsView.setVisibility(0);
            final WebImageView pinImageView = (WebImageView)_pinImageViews.get(i);
            ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.addUpdateListener(new _cls1());
            valueanimator.setDuration((long)((double)Constants.ANIM_SPEED_FAST * Math.random()));
            valueanimator.start();
            return;
        } else
        {
            super.fadeInImageAt(i);
            return;
        }
    }

    protected int[] getImageViewIds()
    {
        return IMAGE_VIEW_IDS;
    }

    protected int getLayoutId()
    {
        return 0x7f03018e;
    }

    protected int getMaxNumPins()
    {
        return 4;
    }

    protected void init()
    {
        super.init();
        setWeights(WEIGHTS_FOUR_PINS);
        _clearCurrentBeforeSet = false;
        _fadeInImages = true;
    }

    protected void onPinsSet()
    {
        int i = getNumPins();
        if (i > 0)
        {
            _numPinsText.setText(String.valueOf(getNumPins()));
            if (i <= 2)
            {
                _leftColumn.setVisibility(8);
            }
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    protected void setLayoutWeightAt(int i, int j)
    {
        if (i == 0)
        {
            ((android.widget.LinearLayout.LayoutParams)_wrapperLayout.getLayoutParams()).weight = j;
            return;
        } else
        {
            super.setLayoutWeightAt(i, j);
            return;
        }
    }

    public void setPins(List list)
    {
        list.size();
        JVM INSTR tableswitch 1 3: default 32
    //                   1 45
    //                   2 55
    //                   3 65;
           goto _L1 _L2 _L3 _L4
_L1:
        setWeights(WEIGHTS_FOUR_PINS);
_L6:
        setContent(list);
        return;
_L2:
        setWeights(WEIGHTS_ONE_PIN);
        continue; /* Loop/switch isn't completed */
_L3:
        setWeights(WEIGHTS_TWO_PINS);
        continue; /* Loop/switch isn't completed */
_L4:
        setWeights(WEIGHTS_THREE_PINS);
        if (true) goto _L6; else goto _L5
_L5:
    }


    private class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final PlaceModulePinGridView this$0;
        final WebImageView val$pinImageView;

        public void onAnimationUpdate(ValueAnimator valueanimator)
        {
            float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
            pinImageView.setAlpha(f);
            _numPinsView.setAlpha(f);
            _dimmingLayer.setAlpha(f);
        }

        _cls1()
        {
            this$0 = PlaceModulePinGridView.this;
            pinImageView = webimageview;
            super();
        }
    }

}
