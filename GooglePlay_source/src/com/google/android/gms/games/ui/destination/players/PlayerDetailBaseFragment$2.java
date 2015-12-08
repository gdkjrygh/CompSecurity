// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import com.google.android.play.transition.BaseTransitionListener;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailBaseFragment

final class val.levelView extends BaseTransitionListener
{

    final PlayerDetailBaseFragment this$0;
    final TextView val$levelView;

    public final void onTransitionEnd(Transition transition)
    {
        if (!PlayerDetailBaseFragment.access$800(PlayerDetailBaseFragment.this))
        {
            return;
        }
        if (PlayerDetailBaseFragment.access$700(PlayerDetailBaseFragment.this))
        {
            val$levelView.setAlpha(1.0F);
            transition = new AnimatorSet();
            transition.playTogether(new Animator[] {
                ObjectAnimator.ofFloat(val$levelView, "scaleX", new float[] {
                    0.0F, 1.0F
                }), ObjectAnimator.ofFloat(val$levelView, "scaleY", new float[] {
                    0.0F, 1.0F
                })
            });
            transition.setInterpolator(new OvershootInterpolator());
            transition.setDuration(PlayerDetailBaseFragment.access$900(PlayerDetailBaseFragment.this));
            transition.start();
        }
        if (!mAnimateLevelProgress)
        {
            PlayerDetailBaseFragment.access$1000(PlayerDetailBaseFragment.this).mAvatarView.startLevelProgressAnimation(getResources().getInteger(0x7f0e001d), false);
            mAnimateLevelProgress = true;
        }
        mLatencyLogger.logEvents(new int[] {
            3, 4
        });
    }

    apter.ProfileBannerViewHolder()
    {
        this$0 = final_playerdetailbasefragment;
        val$levelView = TextView.this;
        super();
    }
}
