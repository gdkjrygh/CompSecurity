// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.view.CommercePinGridView;
import com.pinterest.activity.task.education.event.EducationEvent;
import com.pinterest.activity.task.education.model.EducationToolTip;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.schemas.experiences.AndroidEducationAnchor;
import com.pinterest.schemas.experiences.ExperienceCompleteAction;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitLayout;
import me.grantland.widget.AutofitTextView;

public class EducationToolTipView extends FrameLayout
{

    private static final int HEIGHT_INDEX = 1;
    public static final float INVERTED_TOOLTIP_TRANSLATEY = -10F;
    public static final long TOOLTIP_ANIM_DURATION = 300L;
    public static final float TOOLTIP_TRANSLATEY = 10F;
    private static final int WIDTH_INDEX = 0;
    private static final int X_INDEX = 0;
    private static final int Y_INDEX = 1;
    private EducationToolTip _toolTip;
    View _tooltipButtonSpacing;
    Button _tooltipCompleteButton;
    AutofitTextView _tooltipDescription;
    Button _tooltipDismissButton;
    private int _tooltipHeight;
    ImageView _tooltipInvertedTriangle;
    LinearLayout _tooltipRectangle;
    PTextView _tooltipTitle;
    AutofitLayout _tooltipTitleWrapper;
    ImageView _tooltipTriangle;

    public EducationToolTipView(Context context)
    {
        this(context, null);
    }

    public EducationToolTipView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationToolTipView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void animateTooltip(boolean flag)
    {
        float f;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        AnimatorSet animatorset;
        if (flag)
        {
            f = -10F;
        } else
        {
            f = 10F;
        }
        objectanimator = ObjectAnimator.ofFloat(this, "translationY", new float[] {
            f, 0.0F
        });
        objectanimator1 = ObjectAnimator.ofFloat(this, "alpha", new float[] {
            0.0F, 1.0F
        });
        animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        animatorset.setDuration(300L);
        animatorset.start();
    }

    private void fixRectangleCorners(boolean flag, float f, boolean flag1)
    {
        GradientDrawable gradientdrawable = (GradientDrawable)_tooltipRectangle.getBackground();
        float f1 = Resources.dimension(0x7f0a00f5);
        float af[] = new float[8];
        af[0] = f1;
        af[1] = f1;
        af[2] = f1;
        af[3] = f1;
        af[4] = f1;
        af[5] = f1;
        af[6] = f1;
        af[7] = f1;
        if (flag1 && !flag)
        {
            af[0] = f;
            af[1] = f;
        } else
        if (!flag1 && !flag)
        {
            af[2] = f;
            af[3] = f;
        } else
        if (flag1 && flag)
        {
            af[6] = f;
            af[7] = f;
        } else
        {
            af[4] = f;
            af[5] = f;
        }
        gradientdrawable.setCornerRadii(af);
        _tooltipRectangle.setBackgroundDrawable(gradientdrawable);
    }

    private void handleToolTipComplete()
    {
        if (_toolTip.anchorPoint != AndroidEducationAnchor.PIN_IT_BUTTON.getValue()) goto _L2; else goto _L1
_L1:
        Events.post(new PinItToolTipEvent());
_L4:
        if (_toolTip.completeAction == ExperienceCompleteAction.COMPLETE.getValue())
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS));
        }
        return;
_L2:
        if (_toolTip.anchorPoint == AndroidEducationAnchor.CLICKTHROUGH_BUTTON.getValue())
        {
            Events.post(new ClickthroughToolTipEvent());
        } else
        if (_toolTip.anchorPoint == AndroidEducationAnchor.PROFILE_TAB.getValue())
        {
            Events.post(new StartLibraryEvent());
        } else
        if (_toolTip.anchorPoint == AndroidEducationAnchor.RICH_ACTION_BUTTON.getValue())
        {
            Events.post(new BuyItToolTipEvent());
        } else
        if (_toolTip.anchorPoint == AndroidEducationAnchor.HOMEFEED_FIRST_PIN.getValue())
        {
            Events.post(new CommerceHomeFeedToolTipEvent());
        } else
        if (_toolTip.anchorPoint == AndroidEducationAnchor.CHECKOUT_ADD_CREDIT_CARD_BUTTON.getValue())
        {
            Navigation navigation = new Navigation(Location.COMMERCE_SETTINGS);
            navigation.putExtra("com.pinterest.EXTRA_COMMERCE_SETTINGS", "VALUE_PAYMENT_METHODS");
            Events.post(navigation);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f0301cc, this, true);
        ButterKnife.a(this);
        setAlpha(0.0F);
    }

    private void positionToolTipRectangle(LinearLayout linearlayout, ImageView imageview, int ai[], int ai1[], boolean flag)
    {
        int i;
        int k;
        int l;
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)linearlayout.getLayoutParams();
        k = (int)Device.getScreenWidth() / 2;
        int j;
        if (flag)
        {
            j = ai1[1] - _tooltipHeight;
        } else
        {
            j = ai1[1] + ai[1] + imageview.getHeight();
        }
        i = ai1[0];
        l = ai[0] / 2 + i;
        i = Constants.MARGIN;
        if (l != k) goto _L2; else goto _L1
_L1:
        i = k - linearlayout.getWidth() / 2;
_L4:
        layoutparams.setMargins(i, j, 0, 0);
        linearlayout.setLayoutParams(layoutparams);
        return;
_L2:
        if (l > k)
        {
            i = (int)Device.getScreenWidth() - linearlayout.getWidth() - Constants.MARGIN;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void positionToolTipTriangle(ImageView imageview, int ai[], int ai1[], boolean flag)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)imageview.getLayoutParams();
        int j = (ai1[0] + ai[0] / 2) - imageview.getWidth() / 2;
        float f = Device.getScreenWidth() / 2.0F;
        int i;
        if ((float)(ai1[0] + ai[0] / 2) > f)
        {
            float f1 = Device.getScreenWidth() - (float)Constants.MARGIN - (float)(imageview.getWidth() + j);
            if (f1 < Resources.dimension(0x7f0a00f5))
            {
                fixRectangleCorners(flag, f1, false);
            }
        } else
        {
            float f2 = j - Constants.MARGIN;
            if (f2 < Resources.dimension(0x7f0a00f5))
            {
                fixRectangleCorners(flag, f2, true);
            }
        }
        if (flag)
        {
            i = ai1[1] - imageview.getHeight();
        } else
        {
            i = ai1[1] + ai[1];
        }
        layoutparams.setMargins(j, i, 0, 0);
        imageview.setLayoutParams(layoutparams);
    }

    private boolean shouldInvertTooltip(int ai[], int ai1[])
    {
        float f = Device.getScreenHeight();
        float f1 = Device.getStatusBarHeight();
        float f2 = Device.getNavBarHeight();
        return (float)(ai[1] + _tooltipHeight + Device.getStatusBarHeight() + ai1[1]) >= f - f1 - f2;
    }

    public boolean onFilterTouchEventForSecurity(MotionEvent motionevent)
    {
        while (_toolTip == null || (motionevent.getFlags() & 1) == 0 || _toolTip.anchorPoint != AndroidEducationAnchor.RICH_ACTION_BUTTON.getValue() || !BuyableProductHelper.isPointInsideView(motionevent.getRawX(), motionevent.getRawY(), _tooltipCompleteButton)) 
        {
            return true;
        }
        Toast.makeText(getContext(), 0x7f070160, 1).show();
        motionevent.setAction(3);
        CrashReporting.a(new IllegalStateException("Buy button tap-jacking prevented."));
        return false;
    }

    public void positionToolTip(AndroidEducationAnchor androideducationanchor)
    {
        int ai[];
        int ai1[];
label0:
        {
            androideducationanchor = EducationHelper.a(getContext(), androideducationanchor);
            if (androideducationanchor != null)
            {
                ai = EducationHelper.a(androideducationanchor);
                ai1 = new int[2];
                ai1[0] = androideducationanchor.getWidth();
                ai1[1] = androideducationanchor.getHeight();
                if (androideducationanchor instanceof CommercePinGridView)
                {
                    int i = ai[1];
                    ai[1] = ((CommercePinGridView)androideducationanchor).getYOffset() + i;
                    ai1[1] = ((CommercePinGridView)androideducationanchor).getPriceHeight();
                }
                if (!shouldInvertTooltip(ai, ai1))
                {
                    break label0;
                }
                _tooltipTriangle.setVisibility(8);
                _tooltipInvertedTriangle.setVisibility(0);
                positionToolTipTriangle(_tooltipInvertedTriangle, ai1, ai, true);
                positionToolTipRectangle(_tooltipRectangle, _tooltipInvertedTriangle, ai1, ai, true);
                animateTooltip(true);
            }
            return;
        }
        _tooltipInvertedTriangle.setVisibility(8);
        _tooltipTriangle.setVisibility(0);
        positionToolTipTriangle(_tooltipTriangle, ai1, ai, false);
        positionToolTipRectangle(_tooltipRectangle, _tooltipTriangle, ai1, ai, false);
        animateTooltip(false);
    }

    public void setToolTip(EducationToolTip educationtooltip)
    {
        if (_toolTip != null && _toolTip.id == educationtooltip.id)
        {
            positionToolTip(AndroidEducationAnchor.findByValue(_toolTip.anchorPoint));
            return;
        }
        _toolTip = educationtooltip;
        if (!TextUtils.isEmpty(_toolTip.titleText))
        {
            _tooltipTitleWrapper.setVisibility(0);
            _tooltipTitle.setText(_toolTip.titleText);
        }
        if (!TextUtils.isEmpty(_toolTip.descriptionText))
        {
            _tooltipDescription.setVisibility(0);
            _tooltipDescription.setText(_toolTip.descriptionText);
        }
        if (!TextUtils.isEmpty(_toolTip.dismissButtonText))
        {
            _tooltipDismissButton.setVisibility(0);
            _tooltipDismissButton.setText(_toolTip.dismissButtonText);
            _tooltipDismissButton.setOnClickListener(new _cls1());
            _tooltipButtonSpacing.setVisibility(0);
        }
        if (!TextUtils.isEmpty(_toolTip.completeButtonText))
        {
            _tooltipCompleteButton.setVisibility(0);
            _tooltipCompleteButton.setText(_toolTip.completeButtonText);
            _tooltipCompleteButton.setOnClickListener(new _cls2());
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new _cls3());
    }



/*
    static int access$102(EducationToolTipView educationtooltipview, int i)
    {
        educationtooltipview._tooltipHeight = i;
        return i;
    }

*/


    private class PinItToolTipEvent
    {

        public PinItToolTipEvent()
        {
        }
    }


    private class ClickthroughToolTipEvent
    {

        public ClickthroughToolTipEvent()
        {
        }
    }


    private class StartLibraryEvent
    {

        public StartLibraryEvent()
        {
        }
    }


    private class BuyItToolTipEvent
    {

        public BuyItToolTipEvent()
        {
        }
    }


    private class CommerceHomeFeedToolTipEvent
    {

        public CommerceHomeFeedToolTipEvent()
        {
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final EducationToolTipView this$0;

        public void onClick(View view)
        {
            Events.post(new EducationEvent(com.pinterest.activity.task.education.event.EducationEvent.Type.DISMISS_UI));
        }

        _cls1()
        {
            this$0 = EducationToolTipView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final EducationToolTipView this$0;

        public void onClick(View view)
        {
            handleToolTipComplete();
        }

        _cls2()
        {
            this$0 = EducationToolTipView.this;
            super();
        }
    }


    private class _cls3
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final EducationToolTipView this$0;

        public void onGlobalLayout()
        {
            getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int i = Math.max(_tooltipTriangle.getHeight(), _tooltipInvertedTriangle.getHeight());
            _tooltipHeight = i + _tooltipRectangle.getHeight();
            positionToolTip(AndroidEducationAnchor.findByValue(_toolTip.anchorPoint));
        }

        _cls3()
        {
            this$0 = EducationToolTipView.this;
            super();
        }
    }

}
