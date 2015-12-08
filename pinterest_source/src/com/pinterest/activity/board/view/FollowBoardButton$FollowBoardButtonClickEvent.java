// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowBoardButton

public class _board
{

    private Board _board;
    final FollowBoardButton this$0;

    public Board getFollowedBoard()
    {
        return _board;
    }

    public (Board board)
    {
        this$0 = FollowBoardButton.this;
        super();
        _board = board;
    }
}
