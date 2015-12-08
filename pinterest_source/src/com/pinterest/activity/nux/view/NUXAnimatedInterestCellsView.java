// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.pinterest.api.model.Interest;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.InterestGridCell;
import com.pinterest.ui.layout.NoLimitLinearLayout;
import com.pinterest.ui.spring.SpringInterpolator;
import java.util.ArrayList;

public class NUXAnimatedInterestCellsView extends NoLimitLinearLayout
{

    private static final long ANIM_PAUSE_DURATION = 1000L;
    private static final float GRID_CELL_ALPHA = 0.5F;
    private static final int PAGE_SIZE = -1;
    private static final long SPRING_ANIM_DURATION = 700L;
    private static final float SPRING_ANIM_FRICTION = 0.9F;
    private static final float SPRING_ANIM_TENSION = 0.4F;
    private Runnable _animateSelectedInterestsRunnable;
    private int _cellSize;
    public FeedApiResponseHandler _followedInterestsHandler;
    private Handler _handler;
    private ArrayList _interestsFollowed;
    private int _pickedInterestsAnimationCounter;
    private Runnable finishSubmitInterestsRunnable;

    public NUXAnimatedInterestCellsView(Context context)
    {
        this(context, null);
    }

    public NUXAnimatedInterestCellsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        finishSubmitInterestsRunnable = new _cls1();
        _followedInterestsHandler = new _cls2();
        _animateSelectedInterestsRunnable = new _cls3();
        init();
    }

    private void animateSelectedInterests()
    {
        _pickedInterestsAnimationCounter = _pickedInterestsAnimationCounter + 1;
        Object obj = (InterestGridCell)getChildAt(_pickedInterestsAnimationCounter);
        Object obj1 = (InterestGridCell)getChildAt(_pickedInterestsAnimationCounter + 1);
        Object obj2 = (InterestGridCell)getChildAt(_pickedInterestsAnimationCounter + 2);
        obj = ObjectAnimator.ofFloat(obj, "alpha", new float[] {
            1.0F, 0.5F
        });
        obj2 = ObjectAnimator.ofFloat(obj2, "alpha", new float[] {
            1.0F, 0.5F
        });
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(obj1, "alpha", new float[] {
            0.5F, 1.0F
        });
        obj1 = new AnimatorSet();
        ((AnimatorSet) (obj1)).playTogether(new Animator[] {
            obj, obj2, objectanimator
        });
        ((AnimatorSet) (obj1)).setDuration(700L);
        float f = getX();
        int i = (int)Resources.dimension(0x7f0a0163);
        obj = ObjectAnimator.ofFloat(this, "translationX", new float[] {
            f, f - (float)_cellSize - (float)(i * 2)
        });
        ((ObjectAnimator) (obj)).setDuration(700L);
        obj2 = new AnimatorSet();
        ((AnimatorSet) (obj2)).playTogether(new Animator[] {
            obj, obj1
        });
        ((AnimatorSet) (obj2)).setInterpolator(new SpringInterpolator(0.9F, 0.4F));
        ((AnimatorSet) (obj2)).start();
        ((AnimatorSet) (obj2)).addListener(new _cls4());
    }

    private InterestGridCell formatGridCell(Interest interest)
    {
        InterestGridCell interestgridcell = new InterestGridCell(getContext());
        interestgridcell.setInterest(interest, Integer.valueOf(_cellSize), false);
        interestgridcell.setImageDimensions(_cellSize, _cellSize);
        interest = new android.widget.FrameLayout.LayoutParams(_cellSize, _cellSize);
        int i = (int)Resources.dimension(0x7f0a0163);
        interest.setMargins(i, i, i, i);
        interestgridcell.setWrapperLayoutParams(interest);
        interestgridcell.setImageCornerRadius((int)Resources.dimension(0x7f0a00f6));
        interestgridcell.setForegroundVisibility(8);
        return interestgridcell;
    }

    private void init()
    {
        _pickedInterestsAnimationCounter = 0;
        _cellSize = (int)Resources.dimension(0x7f0a0174);
        _handler = new Handler();
        pollInterestsSubmitted();
    }

    public void pollInterestsSubmitted()
    {
        _handler.post(finishSubmitInterestsRunnable);
    }

    public void stopAnimation()
    {
        _handler.removeCallbacksAndMessages(finishSubmitInterestsRunnable);
        _handler.removeCallbacksAndMessages(_animateSelectedInterestsRunnable);
        finishSubmitInterestsRunnable = null;
        _animateSelectedInterestsRunnable = null;
    }



/*
    static ArrayList access$002(NUXAnimatedInterestCellsView nuxanimatedinterestcellsview, ArrayList arraylist)
    {
        nuxanimatedinterestcellsview._interestsFollowed = arraylist;
        return arraylist;
    }

*/






    private class _cls1
        implements Runnable
    {

        final NUXAnimatedInterestCellsView this$0;

        public void run()
        {
            InterestsApi.a(MyUser.getUid(), -1, new com.pinterest.api.remote.InterestsApi.InterestsFeedApiResponse(_followedInterestsHandler), com/pinterest/activity/nux/fragment/NUXEndScreenFragment.getName());
        }

        _cls1()
        {
            this$0 = NUXAnimatedInterestCellsView.this;
            super();
        }
    }


    private class _cls2 extends FeedApiResponseHandler
    {

        final NUXAnimatedInterestCellsView this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            pollInterestsSubmitted();
        }

        public void onSuccess(Feed feed)
        {
            _interestsFollowed = (ArrayList)feed.getItems();
            if (_interestsFollowed.size() <= 0)
            {
                pollInterestsSubmitted();
                return;
            }
            Interest interest;
            for (Iterator iterator = _interestsFollowed.iterator(); iterator.hasNext(); addView(formatGridCell(interest)))
            {
                interest = (Interest)iterator.next();
            }

            if (_interestsFollowed.size() > 3)
            {
                animateSelectedInterests();
            } else
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)getLayoutParams();
                layoutparams.gravity = 17;
                setLayoutParams(layoutparams);
            }
            super.onSuccess(feed);
        }

        _cls2()
        {
            this$0 = NUXAnimatedInterestCellsView.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final NUXAnimatedInterestCellsView this$0;

        public void run()
        {
            Interest interest = (Interest)_interestsFollowed.get(_pickedInterestsAnimationCounter % _interestsFollowed.size());
            addView(formatGridCell(interest));
            animateSelectedInterests();
        }

        _cls3()
        {
            this$0 = NUXAnimatedInterestCellsView.this;
            super();
        }
    }


    private class _cls4 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final NUXAnimatedInterestCellsView this$0;

        public void onAnimationEnd(Animator animator)
        {
            super.onAnimationEnd(animator);
            _handler.postDelayed(_animateSelectedInterestsRunnable, 1000L);
        }

        _cls4()
        {
            this$0 = NUXAnimatedInterestCellsView.this;
            super();
        }
    }

}
