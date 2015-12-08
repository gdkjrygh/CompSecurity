// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardButton

class t> extends com.pinterest.api.remote.onse
{

    final FollowSimilarBoardButton this$0;

    public void onFailure()
    {
        Board board = FollowSimilarBoardButton.access$000(FollowSimilarBoardButton.this);
        boolean flag;
        if (!Constants.isTrue(FollowSimilarBoardButton.access$000(FollowSimilarBoardButton.this).getFollowing()))
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
        setEnabled(true);
    }

    public void onStart()
    {
        super.onStart();
        setEnabled(false);
    }

    public void onSuccess(Board board)
    {
        FollowSimilarBoardButton.access$002(FollowSimilarBoardButton.this, board);
        Events.post(new llowSimilarBoardSuccessEvent(((Integer)getTag()).intValue()));
    }

    llowSimilarBoardSuccessEvent()
    {
        this$0 = FollowSimilarBoardButton.this;
        super();
    }
}
