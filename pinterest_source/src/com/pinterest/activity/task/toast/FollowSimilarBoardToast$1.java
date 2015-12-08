// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.task.toast:
//            FollowSimilarBoardToast

class it> extends com.pinterest.api.remote.ponse
{

    final FollowSimilarBoardToast this$0;

    public void onFailure()
    {
        Board board = FollowSimilarBoardToast.access$000(FollowSimilarBoardToast.this);
        boolean flag;
        if (!Constants.isTrue(FollowSimilarBoardToast.access$000(FollowSimilarBoardToast.this).getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        board.setFollowing(Boolean.valueOf(flag));
    }

    public void onSuccess(Board board)
    {
        FollowSimilarBoardToast.access$002(FollowSimilarBoardToast.this, board);
    }

    A()
    {
        this$0 = FollowSimilarBoardToast.this;
        super();
    }
}
