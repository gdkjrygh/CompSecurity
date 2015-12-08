// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.ui.spring.SpringInterpolator;
import com.pinterest.ui.text.PButton;
import com.pinterest.ui.text.PTextView;
import me.grantland.widget.AutofitTextView;

public class NoFacebookNetworkStoryFragment extends BaseFragment
{

    private static final long ADDRESS_BOOK_ANIM_BEGIN_AFTER = 400L;
    private static final long BTN_ANIM_BEGIN_AFTER = 300L;
    private static final long FEED_ALPHA_DURATION = 2000L;
    private static final long FEED_ANIM_BEGIN_AFTER = 900L;
    private static final long FEED_TRANSLATEY_DURATION = 20000L;
    private static final float FEED_TRANSLATE_Y = -400F;
    private static final long FIND_FRIENDS_ANIM_DURATION = 900L;
    private static final float FIND_FRIENDS_FRICTION = 0.9F;
    private static final float FIND_FRIENDS_TENSION = 0.25F;
    private static final float FIND_FRIENDS_TRANSLATE_Y = 30F;
    private static final long TITLE_ANIM_BEGIN_AFTER = 200L;
    AutofitTextView _addressBook;
    PButton _connectBtn;
    ImageView _feed;
    PTextView _title;

    public NoFacebookNetworkStoryFragment()
    {
        _layoutId = 0x7f0300c1;
    }

    private AnimatorSet animateElementsInFindFriendsBlock(View view)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            0.0F, 1.0F
        });
        view = ObjectAnimator.ofFloat(view, "translationY", new float[] {
            30F, 0.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, view
        });
        animatorset.setDuration(900L);
        animatorset.setInterpolator(new SpringInterpolator(0.9F, 0.25F));
        return animatorset;
    }

    private AnimatorSet animateEmptyNewsFeed()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_feed, "translationY", new float[] {
            0.0F, -400F
        });
        objectanimator.setDuration(20000L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(_feed, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator1.setDuration(2000L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        animatorset.setInterpolator(new LinearInterpolator());
        return animatorset;
    }

    private void animateFragment()
    {
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.play(animateElementsInFindFriendsBlock(_title)).after(200L);
        animatorset.play(animateElementsInFindFriendsBlock(_connectBtn)).after(300L);
        animatorset.play(animateElementsInFindFriendsBlock(_addressBook)).after(400L);
        animatorset.play(animateEmptyNewsFeed()).after(900L);
        animatorset.start();
    }

    private void setup()
    {
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        _connectBtn.setIconTint(0x7f0e00bf);
        _connectBtn.setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(0x7f0201b0), null, null, null);
        _connectBtn.setOnClickListener(new _cls1());
    }

    public void onStart()
    {
        super.onStart();
        animateFragment();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        setup();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final NoFacebookNetworkStoryFragment this$0;

        public void onClick(View view)
        {
            Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK));
        }

        _cls1()
        {
            this$0 = NoFacebookNetworkStoryFragment.this;
            super();
        }
    }

}
