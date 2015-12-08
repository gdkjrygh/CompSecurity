// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ModifiedViewPager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pinterest.activity.task.education.adapter.EducationBackgroundViewAdapter;
import com.pinterest.activity.task.education.model.EducationBackground;
import com.pinterest.activity.task.education.model.EducationStep;
import com.pinterest.base.Device;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.schemas.experiences.EducationTransition;
import com.pinterest.ui.spring.SpringInterpolator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.task.education.view:
//            EducationBackgroundPagerAnimation

public class EducationBackgroundView extends RelativeLayout
{

    public static final float SCALE_END = 1F;
    public static final float SCALE_START = 1.28205F;
    private EducationBackgroundViewAdapter _adapter;
    private com.pinterest.kit.utils.AnimationUtils.AnimationListener _defaultScaleForwardListener;
    private FrameLayout _screen;
    private List _steps;
    private ModifiedViewPager _viewPager;

    public EducationBackgroundView(Context context)
    {
        this(context, null);
    }

    public EducationBackgroundView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationBackgroundView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _defaultScaleForwardListener = new _cls1();
        init();
    }

    private void hideScreenView()
    {
        _screen.setClickable(false);
        android.graphics.drawable.Drawable drawable = getBackground();
        if (drawable instanceof BitmapDrawable)
        {
            setBackgroundDrawable(null);
            ((BitmapDrawable)drawable).getBitmap().recycle();
        }
        _screen.setAlpha(0.0F);
    }

    private void init()
    {
        setAlpha(0.0F);
        _screen = new FrameLayout(getContext());
        _screen.setScaleX(1.28205F);
        _screen.setScaleY(1.28205F);
        _screen.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _screen.setClickable(false);
        _screen.setFocusable(false);
        _screen.setFocusableInTouchMode(false);
        addView(_screen);
        hideScreenView();
        SpringInterpolator springinterpolator = new SpringInterpolator(0.28F, 0.028F);
        _viewPager = new ModifiedViewPager(getContext());
        _viewPager.setAnimateBackwardsDuration(800);
        _viewPager.setAnimateForwardsDuration(800);
        _viewPager.setPageTransformer(false, new EducationBackgroundPagerAnimation());
        _viewPager.setDragEnabled(false);
        _viewPager.setId(0x7f0f000d);
        _viewPager.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        _viewPager.setInterpolator(springinterpolator);
        _screen.addView(_viewPager);
    }

    private void scaleBack()
    {
        Object obj = new TypedValue();
        getResources().getValue(0x7f0a0015, ((TypedValue) (obj)), true);
        float f = ((TypedValue) (obj)).getFloat();
        float f1 = Device.getScreenHeight();
        float f2 = Device.getStatusBarHeight();
        _viewPager.setTranslationY((f1 - f2) * f);
        _viewPager.setCurrentItem(0, false);
        _adapter.setSteps(_steps);
        showScreenView();
        setAlpha(1.0F);
        f1 = Math.min(Device.getScreenHeight(), Device.getScreenWidth());
        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_screen, "scaleX", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(_screen, "scaleY", new float[] {
                1.0F
            }), ObjectAnimator.ofFloat(_viewPager, "translationY", new float[] {
                f * f1
            })
        });
        ((AnimatorSet) (obj)).start();
    }

    private void scaleForward(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        AnimatorSet animatorset = new AnimatorSet();
        float f = Device.getScreenHeight();
        float f1 = Device.getStatusBarHeight();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(_screen, "scaleX", new float[] {
                1.28205F
            }), ObjectAnimator.ofFloat(_screen, "scaleY", new float[] {
                1.28205F
            }), ObjectAnimator.ofFloat(_viewPager, "translationY", new float[] {
                (f - f1) * 0.11F
            })
        });
        animatorset.addListener(_defaultScaleForwardListener);
        if (animationlistener != null)
        {
            animatorset.addListener(animationlistener);
        }
        animatorset.start();
    }

    private void showScreenView()
    {
        _screen.setClickable(true);
        if (Device.getDensityDpi() >= 320)
        {
            setBackgroundResource(0x7f020039);
        } else
        {
            setBackgroundResource(0x7f0e0010);
        }
        _screen.setAlpha(1.0F);
    }

    public EducationBackgroundViewAdapter getAdapter()
    {
        return _adapter;
    }

    public void setDefault(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
    {
        if (_viewPager.getScaleX() != 1.28205F || _viewPager.getScaleY() != 1.28205F)
        {
            scaleForward(animationlistener);
            return;
        } else
        {
            animationlistener.onAnimationEnd(null);
            return;
        }
    }

    public void setFragmentManager(FragmentManager fragmentmanager)
    {
        _adapter = new EducationBackgroundViewAdapter(fragmentmanager);
        _viewPager.setAdapter(_adapter);
    }

    public void setSteps(List list)
    {
        _steps = list;
        if (list.isEmpty())
        {
            scaleForward(null);
        }
    }

    public void showNextStep(int i)
    {
        Object obj;
        if (i < _steps.size())
        {
            if ((obj = (EducationStep)_steps.get(i)) != null && ((EducationStep) (obj)).getBackground() != null)
            {
                obj = EducationTransition.findByValue(((EducationStep) (obj)).getBackground().getTransition());
                if (obj == null)
                {
                    hideScreenView();
                    return;
                }
                showScreenView();
                switch (_cls2..SwitchMap.com.pinterest.schemas.experiences.EducationTransition[((EducationTransition) (obj)).ordinal()])
                {
                default:
                    hideScreenView();
                    return;

                case 1: // '\001'
                    _viewPager.setCurrentItem(_viewPager.getCurrentItem() + 1, true);
                    scaleForward(null);
                    return;

                case 2: // '\002'
                    _viewPager.setCurrentItem(_viewPager.getCurrentItem() + 1, true);
                    return;

                case 3: // '\003'
                    scaleForward(null);
                    return;

                case 4: // '\004'
                    _adapter.recycleScreenshot();
                    break;
                }
                obj = (ViewGroup)getParent();
                if (obj != null)
                {
                    obj = (ViewGroup)((ViewGroup) (obj)).getParent();
                } else
                {
                    obj = null;
                }
                obj = ImageUtils.bitmapFromView(((android.view.View) (obj)));
                _adapter.setScreenShot(((Bitmap) (obj)));
                scaleBack();
                return;
            }
        }
    }





    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final EducationBackgroundView this$0;

        public void onAnimationCancel(Animator animator)
        {
            animator = getContext();
            if ((animator instanceof Activity) && !((Activity)animator).isFinishing())
            {
                _viewPager.setCurrentItem(0, false);
                _adapter.setSteps(_steps);
                setAlpha(0.0F);
                hideScreenView();
            }
        }

        public void onAnimationEnd(Animator animator)
        {
            onAnimationCancel(animator);
        }

        _cls1()
        {
            this$0 = EducationBackgroundView.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[];

        static 
        {
            $SwitchMap$com$pinterest$schemas$experiences$EducationTransition = new int[EducationTransition.values().length];
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.CAROUSEL_SCALE_FORWARD.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.CAROUSEL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.SCALE_FORWARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$schemas$experiences$EducationTransition[EducationTransition.SCALE_BACK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
