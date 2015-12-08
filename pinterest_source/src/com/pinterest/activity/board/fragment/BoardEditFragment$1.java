// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import com.pinterest.api.model.Board;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BoardEditFragment

class this._cls0 extends com.pinterest.api.remote.ponse
{

    final BoardEditFragment this$0;

    public void onSuccess(Board board)
    {
        BoardEditFragment.access$002(BoardEditFragment.this, board);
        BoardEditFragment.access$100(BoardEditFragment.this);
    }

    ()
    {
        this$0 = BoardEditFragment.this;
        super();
    }
}
