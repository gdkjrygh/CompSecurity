// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardsLayout

class > extends com.pinterest.kit.utils.ener
{

    final FollowSimilarBoardsLayout this$0;
    final View val$newRecommendationView;
    final View val$oldRecommendationView;
    final int val$viewPositionIndex;

    public void onAnimationEnd(Animator animator)
    {
        val$oldRecommendationView.setVisibility(8);
        removeViewAt(val$viewPositionIndex);
        addView(val$newRecommendationView, val$viewPositionIndex);
        val$newRecommendationView.animate().alpha(1.0F).setDuration(FollowSimilarBoardsLayout.access$100()).setListener(null);
    }

    ()
    {
        this$0 = final_followsimilarboardslayout;
        val$oldRecommendationView = view;
        val$viewPositionIndex = i;
        val$newRecommendationView = View.this;
        super();
    }
}
