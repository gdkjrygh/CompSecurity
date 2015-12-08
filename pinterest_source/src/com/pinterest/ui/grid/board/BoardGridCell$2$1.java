// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCell

class piResponse extends com.pinterest.api.remote.owApiResponse
{

    final is._cls0 this$1;
    final boolean val$isCurrentlyFollowing;

    public void onFailure()
    {
        Board board = BoardGridCell.access$100(_fld0);
        boolean flag;
        if (!val$isCurrentlyFollowing)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        board.setFollowing(Boolean.valueOf(flag));
        updateFollowButton(true);
    }

    public void onSuccess(Board board)
    {
        BoardGridCell.access$102(_fld0, board);
    }

    piResponse()
    {
        this$1 = final_piresponse;
        val$isCurrentlyFollowing = Z.this;
        super();
    }
}
