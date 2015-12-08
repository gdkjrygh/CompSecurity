// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.pinterest.activity.board.view.BoardHeaderView;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.activity.board.view.FollowSimilarBoardsLayout;
import com.pinterest.activity.library.view.LibraryBoardHeaderView;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BoardApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements com.pinterest.base.ber
{

    final BaseBoardFragment this$0;

    public void onEventMainThread(com.pinterest.activity.board.view.llowBoardButtonClickEvent llowboardbuttonclickevent)
    {
        if (BaseBoardFragment.access$100(BaseBoardFragment.this) && BaseBoardFragment.access$300(BaseBoardFragment.this) != null)
        {
            BaseBoardFragment.access$300(BaseBoardFragment.this).replaceBoardRecommendation(llowboardbuttonclickevent.getFollowedBoard());
            return;
        }
        if (BaseBoardFragment.access$1200(BaseBoardFragment.this) != null)
        {
            BaseBoardFragment.access$1300(BaseBoardFragment.this);
            return;
        } else
        {
            BaseBoardFragment.access$1402(BaseBoardFragment.this, true);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.activity.library.view.ew.TopicSelectedEvent topicselectedevent)
    {
        BaseBoardFragment.access$1502(BaseBoardFragment.this, true);
        BaseBoardFragment.access$1600(BaseBoardFragment.this).setDataSource(null);
        BaseBoardFragment.access$1700(BaseBoardFragment.this).setState(com.pinterest.ui.grid.ate.LOADING);
        if (!TextUtils.isEmpty(topicselectedevent.getQuery()))
        {
            SearchApi.a(_user.getUid(), _boardId, topicselectedevent.getQuery(), BaseBoardFragment.access$1800(BaseBoardFragment.this), getApiTag());
            return;
        } else
        {
            BaseBoardFragment.access$802(BaseBoardFragment.this, -1);
            refresh();
            return;
        }
    }

    public void onEventMainThread(com.pinterest.api.model.vent vent)
    {
        BoardApi.a(String.valueOf(_board.getUid()), BaseBoardFragment.access$1100(BaseBoardFragment.this), getApiTag());
    }

    public void onEventMainThread(com.pinterest.api.model.ardFragment._cls9 _pcls9)
    {
        if (_board != null && _pcls9.tBoard().getUid().equals(_board.getUid()))
        {
            _board = _pcls9.tBoard();
            if (_pcls9.sDeleted())
            {
                getActivity().onBackPressed();
            } else
            {
                BaseBoardFragment.access$600(BaseBoardFragment.this);
                BaseBoardFragment.access$700(BaseBoardFragment.this);
                if (_header != null)
                {
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
                    BaseBoardFragment.access$1000(BaseBoardFragment.this, _board, com.pinterest.ui.actionbar.S);
                }
                if (_pcls9.freshFeed())
                {
                    refresh();
                    return;
                }
            }
        }
    }

    public void onEventMainThread(com.pinterest.api.model.ardFragment._cls9 _pcls9)
    {
        if (_user != null && _pcls9.User().getUid().equals(_user.getUid()))
        {
            _user = _pcls9.User();
            updateEmptyContent();
        }
    }

    .TopicSelectedEvent()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
