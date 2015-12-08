// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.TopicFollowToast;
import com.pinterest.api.model.Interest;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.BooleanUtils;

// Referenced classes of package com.pinterest.activity.home.view:
//            HomefeedBuilderGridCell

public class HomefeedBuilderOwnTopicGridCell extends HomefeedBuilderGridCell
{

    private static float INTERPOLOATOR_FACTOR = 3F;
    private static float UNFOLLOWED_IMAGE_ALPHA = 0.1F;
    private static float UNFOLLOWED_SCALE = 0.9F;
    private static float UNFOLLOWED_TEXT_ALPHA = 0.15F;

    public HomefeedBuilderOwnTopicGridCell(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderOwnTopicGridCell(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderOwnTopicGridCell(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void afterAnimationEnd()
    {
        Events.post(new HomefeedBuilderInterestFollowButton.InterestFollowEvent(_interest));
    }

    public static HomefeedBuilderOwnTopicGridCell from(View view, ViewGroup viewgroup)
    {
        if (view instanceof HomefeedBuilderOwnTopicGridCell)
        {
            return (HomefeedBuilderOwnTopicGridCell)view;
        } else
        {
            return new HomefeedBuilderOwnTopicGridCell(ViewHelper.getContext(view, viewgroup));
        }
    }

    private AnimatorSet getFollowAnimation()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_image, "scaleX", new float[] {
            1.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_image, "scaleY", new float[] {
            1.0F
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(_image, "alpha", new float[] {
            1.0F
        });
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(_title, "alpha", new float[] {
            1.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2, objectanimator3
        });
        return animatorset;
    }

    private AnimatorSet getUnfollowAnimation()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_image, "scaleX", new float[] {
            UNFOLLOWED_SCALE
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_image, "scaleY", new float[] {
            UNFOLLOWED_SCALE
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(_image, "alpha", new float[] {
            UNFOLLOWED_IMAGE_ALPHA
        });
        ObjectAnimator objectanimator3 = ObjectAnimator.ofFloat(_title, "alpha", new float[] {
            UNFOLLOWED_TEXT_ALPHA
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2, objectanimator3
        });
        return animatorset;
    }

    private void init()
    {
    }

    public void onTopicClick(View view)
    {
        performTapOnlyClick();
    }

    protected void performTapOnlyClick()
    {
        Object obj = _interest;
        boolean flag;
        if (!Constants.isTrue(_interest.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Interest) (obj)).setFollowing(Boolean.valueOf(flag));
        Events.post(new ToastEvent(new TopicFollowToast(_interest)));
        if (_interest.getFollowing() != null && _interest.getFollowing().booleanValue())
        {
            obj = getFollowAnimation();
        } else
        {
            obj = getUnfollowAnimation();
        }
        ((AnimatorSet) (obj)).setDuration(Constants.ANIM_SPEED_FAST);
        ((AnimatorSet) (obj)).setInterpolator(new DecelerateInterpolator(INTERPOLOATOR_FACTOR));
        ((AnimatorSet) (obj)).addListener(new _cls1());
        ((AnimatorSet) (obj)).start();
    }

    protected void updateFollowing()
    {
        if (_showFollowButton)
        {
            super.updateFollowing();
            return;
        } else
        {
            updateTapOnlyFollowing();
            return;
        }
    }

    protected void updateTapOnlyFollowing()
    {
        if (BooleanUtils.isTrue(_interest.getFollowing()))
        {
            _image.setScaleX(1.0F);
            _image.setScaleY(1.0F);
            _image.setAlpha(1.0F);
            _title.setAlpha(1.0F);
            return;
        } else
        {
            _image.setScaleX(UNFOLLOWED_SCALE);
            _image.setScaleY(UNFOLLOWED_SCALE);
            _image.setAlpha(UNFOLLOWED_IMAGE_ALPHA);
            _title.setAlpha(UNFOLLOWED_TEXT_ALPHA);
            return;
        }
    }



    private class _cls1 extends com.pinterest.kit.utils.AnimationUtils.AnimationListener
    {

        final HomefeedBuilderOwnTopicGridCell this$0;

        public void onAnimationCancel(Animator animator)
        {
            afterAnimationEnd();
        }

        public void onAnimationEnd(Animator animator)
        {
            afterAnimationEnd();
        }

        _cls1()
        {
            this$0 = HomefeedBuilderOwnTopicGridCell.this;
            super();
        }
    }

}
