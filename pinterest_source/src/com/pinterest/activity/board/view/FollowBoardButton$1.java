// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowBoardButton

class se extends com.pinterest.api.remote.ApiResponse
{

    final FollowBoardButton this$0;

    public void onFailure()
    {
        Board board = FollowBoardButton.access$000(FollowBoardButton.this);
        boolean flag;
        if (!Constants.isTrue(FollowBoardButton.access$000(FollowBoardButton.this).getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        board.setFollowing(Boolean.valueOf(flag));
        updateDisplay();
    }

    public void onFinish()
    {
        super.onFinish();
        setLoading(false);
    }

    public void onStart()
    {
        super.onStart();
        setLoading(true);
    }

    public void onSuccess(Board board)
    {
        FollowBoardButton.access$002(FollowBoardButton.this, board);
    }

    se()
    {
        this$0 = FollowBoardButton.this;
        super();
    }
}
