// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.dynamicgrid;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.dynamicgrid:
//            BoardStoryCell

class onse extends com.pinterest.api.remote.lowApiResponse
{

    final BoardStoryCell this$0;

    public void onFailure()
    {
        Board board = _board;
        boolean flag;
        if (!_board.getFollowing().booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        board.setFollowing(Boolean.valueOf(flag));
        updateFollowing();
    }

    public void onSuccess(Board board)
    {
        _board = board;
    }

    onse()
    {
        this$0 = BoardStoryCell.this;
        super();
    }
}
