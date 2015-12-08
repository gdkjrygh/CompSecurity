// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.reporting.CrashReporting;
import com.pinterest.ui.grid.board.BoardGridCell;

// Referenced classes of package com.pinterest.adapter:
//            PinterestBaseAdapter

public class BoardGridAdapter extends PinterestBaseAdapter
{

    private boolean _overrideClicks;
    private boolean _showTitleUser;
    private User _user;
    protected com.pinterest.ui.grid.board.BoardGridCell.Listener boardCellListener;

    public BoardGridAdapter()
    {
        boardCellListener = new _cls1();
    }

    protected View getGridCell(View view, ViewGroup viewgroup, Board board, boolean flag)
    {
        view = BoardGridCell.get(view, viewgroup);
        boolean flag1;
        if (!MyUser.isUserMe(_user))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.displayFollowButton(flag1);
        view.setBoard(board, flag);
        view.setListener(boardCellListener);
        view.setOverrideClicks(_overrideClicks);
        view.showTitleUser(_showTitleUser);
        return view;
    }

    public User getUser()
    {
        return _user;
    }

    public View getView(int i, View view, ViewGroup viewgroup, boolean flag)
    {
        if (!flag)
        {
            loadMore(i);
        }
        return getGridCell(view, viewgroup, (Board)getItem(i), flag);
    }

    public boolean isOverrideClicks()
    {
        return _overrideClicks;
    }

    public void onStart()
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof BoardFeed)
            {
                ((BoardFeed)_dataSource).registerForUpdateEvents();
            }
            _dataSource.setDataListener(_dataListener);
        }
    }

    public void onStop()
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof BoardFeed)
            {
                ((BoardFeed)_dataSource).unregisterForUpdateEvents();
            }
            _dataSource.setDataListener(null);
        }
        super.onStop();
    }

    public void overrideAllBoardsFollow(User user)
    {
        if (_dataSource == null || user == null)
        {
            return;
        }
        boolean flag = user.getFollowing().booleanValue();
        user = user.getUid();
        int j = getCount();
        for (int i = 0; i < j; i++)
        {
            Board board = (Board)getItem(i);
            if (board != null && board.getUserUid().equals(user))
            {
                board.setFollowing(Boolean.valueOf(flag));
            }
        }

        ModelHelper.setBoards(_dataSource.getItems());
        _dataSource.refresh();
        notifyDataSetChanged();
    }

    public boolean restoreInstanceState(Bundle bundle)
    {
        boolean flag = super.restoreInstanceState(bundle);
        if (flag && !(_dataSource instanceof BoardFeed))
        {
            _dataSource = null;
            bundle = String.format("%s.restoreInstanceState: not a BoardFeed", new Object[] {
                getClass().getSimpleName()
            });
            CrashReporting.b(bundle);
            CrashReporting.a(new RuntimeException(bundle));
        }
        return flag;
    }

    public void setDataSource(Feed feed)
    {
        if (_dataSource != null)
        {
            if (_dataSource instanceof BoardFeed)
            {
                ((BoardFeed)_dataSource).unregisterForUpdateEvents();
            }
            _dataSource.setDataListener(null);
        }
        super.setDataSource(feed);
        if (_dataSource != null)
        {
            if (_dataSource instanceof BoardFeed)
            {
                ((BoardFeed)_dataSource).registerForUpdateEvents();
            }
            _dataSource.setDataListener(_dataListener);
        }
    }

    public void setOverrideClicks(boolean flag)
    {
        _overrideClicks = flag;
    }

    public void setUser(User user)
    {
        _user = user;
    }

    public void showTitleUser(boolean flag)
    {
        _showTitleUser = flag;
    }

    private class _cls1
        implements com.pinterest.ui.grid.board.BoardGridCell.Listener
    {

        final BoardGridAdapter this$0;

        public void onBoardChanged(Board board)
        {
            if (board != null && _dataSource != null && _dataSource.getItems() != null)
            {
                int i = _dataSource.getItems().indexOf(board);
                if (i >= 0)
                {
                    _dataSource.setItem(i, board);
                }
            }
        }

        _cls1()
        {
            this$0 = BoardGridAdapter.this;
            super();
        }
    }

}
