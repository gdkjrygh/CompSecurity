// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardsLayout

class val.lastSimilarBoardView
    implements android.view.stener
{

    final FollowSimilarBoardsLayout this$0;
    final View val$lastSimilarBoardView;

    public boolean onPreDraw()
    {
        val$lastSimilarBoardView.getViewTreeObserver().removeOnPreDrawListener(this);
        if (getChildAt(2) != null && getChildAt(3) != null && getChildAt(4) != null)
        {
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playSequentially(new Animator[] {
                FollowSimilarBoardsLayout.access$000(FollowSimilarBoardsLayout.this, getChildAt(2)), FollowSimilarBoardsLayout.access$000(FollowSimilarBoardsLayout.this, getChildAt(3)), FollowSimilarBoardsLayout.access$000(FollowSimilarBoardsLayout.this, getChildAt(4))
            });
            animatorset.start();
        }
        return true;
    }

    ()
    {
        this$0 = final_followsimilarboardslayout;
        val$lastSimilarBoardView = View.this;
        super();
    }
}
