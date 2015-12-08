// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.play.search:
//            PlaySearchListener, ArrowOrBurgerDrawable, BakedBezierInterpolator, PlaySearchController

public class PlaySearchNavigationButton extends ImageView
    implements PlaySearchListener
{

    private static final boolean IS_HONEYCOMB_OR_GREATER;
    private ArrowOrBurgerDrawable mArrowOrBurgerDrawable;
    PlaySearchController mController;
    private int mCurrentMode;

    public PlaySearchNavigationButton(Context context)
    {
        this(context, null);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mArrowOrBurgerDrawable = new ArrowOrBurgerDrawable(context.getResources().getColor(0x7f0b028a));
    }

    private void setMode(int i)
    {
        if (mCurrentMode == i)
        {
            return;
        }
        int j;
        boolean flag;
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (IS_HONEYCOMB_OR_GREATER)
        {
            float f;
            ValueAnimator valueanimator;
            if (flag)
            {
                f = 0.0F;
            } else
            {
                f = 1.0F;
            }
            valueanimator = ValueAnimator.ofFloat(new float[] {
                0.0F, 1.0F
            });
            valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final PlaySearchNavigationButton this$0;

                public final void onAnimationUpdate(ValueAnimator valueanimator1)
                {
                    mArrowOrBurgerDrawable.setHowArrowIsTheBurger(((Float)valueanimator1.getAnimatedValue()).floatValue());
                }

            
            {
                this$0 = PlaySearchNavigationButton.this;
                super();
            }
            });
            valueanimator.setDuration(350L);
            valueanimator.setInterpolator(BakedBezierInterpolator.INSTANCE);
            valueanimator.setFloatValues(new float[] {
                1.0F - f, f
            });
            valueanimator.start();
        } else
        {
            mArrowOrBurgerDrawable.setAsBurger(flag);
        }
        if (flag)
        {
            j = 0x7f100337;
        } else
        {
            j = 0x7f100335;
        }
        setContentDescription(getContext().getText(j));
        mCurrentMode = i;
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        setImageDrawable(mArrowOrBurgerDrawable);
        mArrowOrBurgerDrawable.setAsBurger(true);
        setOnClickListener(new android.view.View.OnClickListener() {

            final PlaySearchNavigationButton this$0;

            public final void onClick(View view)
            {
                if (mController != null)
                {
                    PlaySearchController playsearchcontroller = mController;
                    if (playsearchcontroller.mNavigationClickListener != null)
                    {
                        playsearchcontroller.mNavigationClickListener.onClick(view);
                    }
                    if (mCurrentMode == 2)
                    {
                        mController.switchToSteadyStateMode();
                    }
                }
            }

            
            {
                this$0 = PlaySearchNavigationButton.this;
                super();
            }
        });
        setMode(1);
    }

    public final void onModeChanged(int i)
    {
        if (i == 1)
        {
            setMode(1);
        } else
        if (i == 3 || i == 2)
        {
            setMode(2);
            return;
        }
    }

    public final void onQueryChanged$505cbf4b(String s)
    {
    }

    public final void onSearch$552c4e01()
    {
    }

    public final void onSuggestionClicked$299d808f()
    {
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_HONEYCOMB_OR_GREATER = flag;
    }



}
