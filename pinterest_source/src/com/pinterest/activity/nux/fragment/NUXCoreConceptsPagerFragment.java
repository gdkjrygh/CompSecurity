// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.nux.adapter.NUXCoreConceptsFragmentPagerAdapter;
import com.pinterest.activity.task.fragment.ViewPagerFragment;

public class NUXCoreConceptsPagerFragment extends ViewPagerFragment
{

    private static final int CORE_CONCEPTS_BOARD_FRAG = 2;
    private static final int CORE_CONCEPTS_HOMEFEED_FRAG = 3;
    private static final int CORE_CONCEPTS_SAVE_FRAG = 0;
    private static final long PROGRESS_DOTS_ANIMATION_DURATION = 500L;
    private static final float PROGRESS_DOTS_INTERPOLATOR = 0.6F;
    ImageView _progressDot1;
    ImageView _progressDot2;
    ImageView _progressDot3;
    ImageView _progressDot4;
    LinearLayout _progressDots;
    private int furthestFragViewed;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener onPageChanged;

    public NUXCoreConceptsPagerFragment()
    {
        furthestFragViewed = 0;
        onPageChanged = new _cls2();
    }

    private ObjectAnimator getProgressDotsAnimation(LinearLayout linearlayout, float f, float f1)
    {
        linearlayout = ObjectAnimator.ofFloat(linearlayout, "alpha", new float[] {
            f, f1
        });
        linearlayout.setDuration(500L);
        linearlayout.setInterpolator(new DecelerateInterpolator(0.6F));
        return linearlayout;
    }

    private void setProgressDot(int i)
    {
        ImageView imageview = _progressDot1;
        ImageView imageview1 = _progressDot2;
        ImageView imageview2 = _progressDot3;
        ImageView imageview3 = _progressDot4;
        int j = 0;
        while (j < 4) 
        {
            ImageView imageview4 = (new ImageView[] {
                imageview, imageview1, imageview2, imageview3
            })[j];
            int k;
            if (j == i)
            {
                k = 0x7f020265;
            } else
            {
                k = 0x7f020152;
            }
            imageview4.setImageResource(k);
            j++;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300e0;
        _menuId = 0;
        _viewAdapter = new NUXCoreConceptsFragmentPagerAdapter(getChildFragmentManager());
        _offScreenLimit = _viewAdapter.getCount();
    }

    public void onViewCreated(final View v, Bundle bundle)
    {
        super.onViewCreated(v, bundle);
        ButterKnife.a(this, v);
        v.getViewTreeObserver().addOnGlobalLayoutListener(new _cls1());
    }








/*
    static int access$502(NUXCoreConceptsPagerFragment nuxcoreconceptspagerfragment, int i)
    {
        nuxcoreconceptspagerfragment.furthestFragViewed = i;
        return i;
    }

*/



    private class _cls2
        implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener
    {

        final NUXCoreConceptsPagerFragment this$0;

        public void onPageScrollStateChanged(int i)
        {
        }

        public void onPageScrolled(int i, float f, int j)
        {
        }

        public void onPageSelected(int i)
        {
            setProgressDot(i);
            if (i > furthestFragViewed)
            {
                ((NUXCoreConceptsBaseFragment)start.getItem(i)).applyAnimation();
                furthestFragViewed = i;
            }
            if (i == 3)
            {
                getProgressDotsAnimation(_progressDots, 1.0F, 0.0F).start();
            }
            if (i == 2 && _progressDots.getAlpha() != 1.0F)
            {
                getProgressDotsAnimation(_progressDots, 0.0F, 1.0F).start();
            }
        }

        _cls2()
        {
            this$0 = NUXCoreConceptsPagerFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final NUXCoreConceptsPagerFragment this$0;
        final View val$v;

        public void onGlobalLayout()
        {
            v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            access$200.setCurrentItem(0);
            access$200.setOnPageChangeListener(onPageChanged);
            setProgressDot(0);
            ((NUXCoreConceptsBaseFragment)access$400.getItem(0)).applyAnimation();
        }

        _cls1()
        {
            this$0 = NUXCoreConceptsPagerFragment.this;
            v = view;
            super();
        }
    }

}
