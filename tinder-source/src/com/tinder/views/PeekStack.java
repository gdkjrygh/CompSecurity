// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.t;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.a.d;
import com.facebook.a.e;
import com.facebook.a.f;
import com.facebook.a.i;
import com.tinder.utils.ad;
import com.tinder.utils.o;

public class PeekStack extends FrameLayout
    implements android.support.v4.view.ViewPager.g, android.view.View.OnLayoutChangeListener
{
    static final class TouchMode extends Enum
    {

        private static final TouchMode $VALUES[];
        public static final TouchMode ANIMATING;
        public static final TouchMode COLLAPSED;
        public static final TouchMode DRAGGING;
        public static final TouchMode EXPANDED;

        public static TouchMode valueOf(String s)
        {
            return (TouchMode)Enum.valueOf(com/tinder/views/PeekStack$TouchMode, s);
        }

        public static TouchMode[] values()
        {
            return (TouchMode[])$VALUES.clone();
        }

        static 
        {
            COLLAPSED = new TouchMode("COLLAPSED", 0);
            EXPANDED = new TouchMode("EXPANDED", 1);
            DRAGGING = new TouchMode("DRAGGING", 2);
            ANIMATING = new TouchMode("ANIMATING", 3);
            $VALUES = (new TouchMode[] {
                COLLAPSED, EXPANDED, DRAGGING, ANIMATING
            });
        }

        private TouchMode(String s, int j)
        {
            super(s, j);
        }
    }


    private static final float CHILD_OFFSET_SCALE = 0.03F;
    private static final float CHILD_OFFSET_Y = 40F;
    private static final float FULL_SIZE_SCALE = 1.15F;
    public static final float HEIGHT_PERCENT_OF_SCREEN = 0.7F;
    private static final int PAGE_LIMIT = 3;
    private boolean mIsInLayout;
    private float mPageDistance;
    private t mPagerAdapter;
    private int mPagerHeight;
    private int mSelectedPage;
    private i mSpringSystem;
    private TextView mTitleTextView;
    private TouchMode mTouchMode;
    private ViewPager mViewPager;

    public PeekStack(Context context)
    {
        super(context);
        mTouchMode = TouchMode.ANIMATING;
        mPageDistance = -1F;
        mIsInLayout = true;
        init();
    }

    public PeekStack(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTouchMode = TouchMode.ANIMATING;
        mPageDistance = -1F;
        mIsInLayout = true;
        init();
    }

    public PeekStack(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        mTouchMode = TouchMode.ANIMATING;
        mPageDistance = -1F;
        mIsInLayout = true;
        init();
    }

    private void calculatePageDistance()
    {
        if (mViewPager.getChildCount() > 1 && mPageDistance == -1F)
        {
            mPageDistance = mViewPager.getChildAt(1).getX();
        }
    }

    private float getCollapsedChildScale(int j)
    {
        if (j == 0)
        {
            return 1.15F;
        } else
        {
            return 1.15F - (float)j * 0.03F;
        }
    }

    private float getCollapsedChildY(int j)
    {
        return 40F * (float)(mViewPager.getChildCount() - j);
    }

    private float getCollapsedPagerY()
    {
        return (float)mViewPager.getHeight();
    }

    private float getPeekingChildY(int j)
    {
        float f1 = getCollapsedPagerY();
        switch (j)
        {
        default:
            return f1 - 300F;

        case 0: // '\0'
            return f1 - 100F;

        case 1: // '\001'
            return f1 - 200F;

        case 2: // '\002'
            return f1 - 300F;
        }
    }

    private float getPeekingPagerY()
    {
        return ad.b(0.3F) / 2.0F;
    }

    private void init()
    {
        mPagerHeight = (int)ad.b(0.7F);
        inflate(getContext(), 0x7f0300a8, this);
        setBackgroundResource(0x7f0d00cd);
        getBackground().setAlpha(0);
        mTitleTextView = (TextView)findViewById(0x7f0e031a);
        mViewPager = (ViewPager)findViewById(0x7f0e0319);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setPageMargin(getResources().getDimensionPixelSize(0x7f0901a0));
        mViewPager.setPageTransformer(true, this);
        mViewPager.addOnLayoutChangeListener(this);
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mViewPager.getLayoutParams();
        layoutparams.height = mPagerHeight;
        mViewPager.setLayoutParams(layoutparams);
        mSpringSystem = i.b();
    }

    public void collapse(boolean flag)
    {
        final int CHILD_COUNT = mViewPager.getChildCount();
        final float newPagerY = getCollapsedPagerY();
        mSelectedPage = mViewPager.getCurrentItem();
        final float unifiedX = mSelectedPage;
        unifiedX = mPageDistance * unifiedX;
        if (flag)
        {
            Object obj = new ValueAnimator();
            ((ValueAnimator) (obj)).setFloatValues(new float[] {
                0.0F, 1.0F
            });
            ((ValueAnimator) (obj)).setDuration(210L);
            ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final PeekStack this$0;
                final float val$newPagerY;

                public void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    float f3 = valueanimator.getAnimatedFraction();
                    getBackground().setAlpha((int)o.a(f3, 0.0F, 1.0F, 1.0F, 0.0F));
                    mTitleTextView.setAlpha(o.a(f3, 0.0F, mTitleTextView.getAlpha(), 1.0F, 0.0F));
                    mViewPager.setTranslationY(o.a(f3, 0.0F, 0.0F, 1.0F, newPagerY));
                }

            
            {
                this$0 = PeekStack.this;
                newPagerY = f1;
                super();
            }
            });
            ((ValueAnimator) (obj)).start();
            obj = mSpringSystem.a();
            ((e) (obj)).c(1.0D);
            ((e) (obj)).a(f.a(5D, 3D));
            ((e) (obj)).a(new d() {

                final PeekStack this$0;
                final int val$CHILD_COUNT;
                final float val$unifiedX;

                public void onSpringActivate(e e1)
                {
                    mTouchMode = TouchMode.ANIMATING;
                }

                public void onSpringAtRest(e e1)
                {
                    mTouchMode = TouchMode.COLLAPSED;
                }

                public void onSpringUpdate(e e1)
                {
                    for (int k = 0; k < CHILD_COUNT; k++)
                    {
                        View view1 = mViewPager.getChildAt(k);
                        float f3 = (float)e1.d.a;
                        if (view1.getTag() == null)
                        {
                            view1.setTag(new Float(view1.getTranslationY()));
                        }
                        ad.c(view1, o.a(f3, 0.0F, view1.getScaleX(), 1.0F, getCollapsedChildScale(k)));
                        view1.setTranslationY(o.a(f3, 0.0F, ((Float)view1.getTag()).floatValue(), 1.0F, getCollapsedChildY(k)));
                        if (k != mSelectedPage)
                        {
                            view1.setX(o.a(f3, 0.0F, view1.getX(), 1.0F, unifiedX));
                        }
                    }

                }

            
            {
                this$0 = PeekStack.this;
                CHILD_COUNT = j;
                unifiedX = f1;
                super();
            }
            });
            ((e) (obj)).a(0.0D);
            ((e) (obj)).b(1.0D);
        } else
        {
            for (int j = 0; j < CHILD_COUNT; j++)
            {
                float f1 = getCollapsedChildScale(j);
                float f2 = getCollapsedChildY(j);
                View view = mViewPager.getChildAt(j);
                ad.c(view, f1);
                view.setTranslationY(f2);
                if (j != mSelectedPage)
                {
                    view.setX(unifiedX);
                }
            }

            mViewPager.setTranslationY(newPagerY);
            mTitleTextView.setAlpha(0.0F);
            getBackground().setAlpha(0);
            mTouchMode = TouchMode.COLLAPSED;
        }
        setClickable(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (!ad.a(motionevent))
        {
            return super.dispatchTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void expand()
    {
        Object obj = new ValueAnimator();
        ((ValueAnimator) (obj)).setIntValues(new int[] {
            0, 255
        });
        ((ValueAnimator) (obj)).setDuration(210L);
        ((ValueAnimator) (obj)).addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final PeekStack this$0;

            public void onAnimationUpdate(ValueAnimator valueanimator)
            {
                mTitleTextView.setAlpha(valueanimator.getAnimatedFraction());
                getBackground().setAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
            }

            
            {
                this$0 = PeekStack.this;
                super();
            }
        });
        ((ValueAnimator) (obj)).start();
        final float pagerY = mViewPager.getTranslationY();
        obj = mSpringSystem.a();
        ((e) (obj)).c(2D);
        ((e) (obj)).a(f.a(6D, 5D));
        ((e) (obj)).a(new d() {

            final PeekStack this$0;
            final float val$pagerY;

            public void onSpringActivate(e e1)
            {
                mViewPager.setCurrentItem(mSelectedPage, false);
                mTouchMode = TouchMode.ANIMATING;
            }

            public void onSpringAtRest(e e1)
            {
                mTouchMode = TouchMode.EXPANDED;
            }

            public void onSpringUpdate(e e1)
            {
                float f1 = (float)e1.d.a;
                mViewPager.setTranslationY(o.a(f1, 0.0F, pagerY, 1.0F, 0.0F));
                for (int j = 0; j < mViewPager.getChildCount(); j++)
                {
                    e1 = mViewPager.getChildAt(j);
                    ad.c(e1, o.a(f1, 0.0F, e1.getScaleX(), 1.0F, 1.0F));
                    e1.setTranslationY(o.a(f1, 0.0F, e1.getTranslationY(), 1.0F, 0.0F));
                    if (j != mSelectedPage)
                    {
                        e1.setX(o.a(f1, 0.0F, (float)mSelectedPage * mPageDistance, 1.0F, (float)j * mPageDistance));
                    }
                }

            }

            
            {
                this$0 = PeekStack.this;
                pagerY = f1;
                super();
            }
        });
        ((e) (obj)).a(0.0D);
        ((e) (obj)).b(1.0D);
        setClickable(true);
    }

    public boolean isExpanded()
    {
        return mTouchMode == TouchMode.EXPANDED;
    }

    public void onLayoutChange(View view, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2)
    {
        if (mViewPager.getChildCount() > 0 && mIsInLayout)
        {
            mIsInLayout = false;
            calculatePageDistance();
            peek();
        }
    }

    public void peek()
    {
        final int childCount = mViewPager.getChildCount();
        final float startingPagerY = getPeekingPagerY();
        final float collapsedPagerY = getCollapsedPagerY();
        mTouchMode = TouchMode.ANIMATING;
        mViewPager.setTranslationY(startingPagerY);
        for (int j = 0; j < childCount; j++)
        {
            View view = mViewPager.getChildAt(j);
            view.setX(0.0F);
            view.setTranslationY(getPeekingChildY(j));
            ad.c(view, 1.155F);
        }

        postDelayed(new Runnable() {

            final PeekStack this$0;
            final int val$childCount;
            final float val$collapsedPagerY;
            final float val$startingPagerY;

            public void run()
            {
                e e1 = mSpringSystem.a();
                e1.a(new d() {

                    final _cls1 this$1;

                    public void onSpringAtRest(e e1)
                    {
                        mTouchMode = TouchMode.COLLAPSED;
                    }

                    public void onSpringUpdate(e e1)
                    {
                        for (int j = 0; j < childCount; j++)
                        {
                            View view = mViewPager.getChildAt(j);
                            float f1 = (float)e1.d.a;
                            view.setTranslationY(o.a(f1, 0.0F, getPeekingChildY(j), 1.0F, getCollapsedChildY(j)));
                            ad.c(view, o.a(f1, 0.0F, view.getScaleY(), 1.0F, getCollapsedChildScale(j)));
                            mViewPager.setTranslationY(o.a(f1, 0.0F, startingPagerY, 1.0F, collapsedPagerY));
                        }

                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                e1.a(0.0D);
                e1.b(1.0D);
            }

            
            {
                this$0 = PeekStack.this;
                childCount = j;
                startingPagerY = f1;
                collapsedPagerY = f2;
                super();
            }
        }, 2000L);
    }

    public void setPagerAdapter(t t)
    {
        mPagerAdapter = t;
        mViewPager.setAdapter(mPagerAdapter);
    }

    public void toggleViewMode()
    {
        if (mTouchMode == TouchMode.EXPANDED)
        {
            collapse(true);
        } else
        if (mTouchMode == TouchMode.COLLAPSED)
        {
            expand();
            return;
        }
    }

    public void transformPage(View view, float f1)
    {
    }







/*
    static TouchMode access$502(PeekStack peekstack, TouchMode touchmode)
    {
        peekstack.mTouchMode = touchmode;
        return touchmode;
    }

*/



}
