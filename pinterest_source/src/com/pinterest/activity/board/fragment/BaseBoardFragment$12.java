// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.app.Activity;
import com.pinterest.activity.board.view.BoardHeaderView;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.library.view.LibraryBoardHeaderView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0 extends com.pinterest.api.remote.onse
{

    final BaseBoardFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (apiresponse.getCode() == 40)
        {
            Events.post(new com.pinterest.api.model.stEvent(apiresponse));
        }
        if (_board == null)
        {
            throwable = getActivity();
            if (throwable != null)
            {
                throwable.onBackPressed();
            }
        }
    }

    public void onSuccess(Board board)
    {
        super.onSuccess(board);
        _board = board;
        _user = _board.getUser();
        if (_header != null)
        {
            _header.setUser(_user);
            _header.setBoard(_board);
        }
        if (_libHeader != null)
        {
            _libHeader.setBoard(_board);
            _libHeader.setTopicSelection(BaseBoardFragment.access$800(BaseBoardFragment.this));
        }
        if (BaseBoardFragment.access$900(BaseBoardFragment.this) != null)
        {
            BaseBoardFragment.access$900(BaseBoardFragment.this).setBoard(_board);
        }
        if (!_useLibraryStyle)
        {
            BaseBoardFragment.access$1000(BaseBoardFragment.this, board, null);
        }
        BaseBoardFragment.access$700(BaseBoardFragment.this);
        BaseBoardFragment.access$600(BaseBoardFragment.this);
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
