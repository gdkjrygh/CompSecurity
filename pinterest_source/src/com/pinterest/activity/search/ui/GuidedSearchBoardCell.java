// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.Board;
import com.pinterest.ui.grid.board.BoardGridCell;

public class GuidedSearchBoardCell extends LinearLayout
{

    private Board _board;
    BoardGridCell _cell;
    private int _columnWidth;
    private boolean _isFirstFilter;
    private boolean _isLastFilter;
    private com.pinterest.ui.grid.board.BoardGridCell.Listener _listener;
    View _paddingLeftView;
    View _paddingRightView;
    private boolean _showFollowButton;

    public GuidedSearchBoardCell(Context context)
    {
        this(context, null);
    }

    public GuidedSearchBoardCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _isFirstFilter = false;
        _isLastFilter = false;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
    }

    public void setBoard(Board board)
    {
        _board = board;
    }

    public void setColumnWidth(int i)
    {
        _columnWidth = i;
    }

    public void setFirstFilter(boolean flag)
    {
        _isFirstFilter = flag;
    }

    public void setLastFilter(boolean flag)
    {
        _isLastFilter = flag;
    }

    public void setListener(com.pinterest.ui.grid.board.BoardGridCell.Listener listener)
    {
        _listener = listener;
    }

    public void setShowFollowButton(boolean flag)
    {
        _showFollowButton = flag;
    }

    public void updateUI()
    {
        boolean flag = false;
        _cell.displayFollowButton(_showFollowButton);
        _cell.setBoard(_board, false);
        _cell.setListener(_listener);
        _cell.setOverrideClicks(false);
        _cell.showTitleUser(false);
        _cell.setLayoutParams(new android.widget.LinearLayout.LayoutParams(_columnWidth, -2));
        _cell.setOnClickListener(new _cls1());
        View view = _paddingLeftView;
        int i;
        if (_isFirstFilter)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = _paddingRightView;
        if (_isLastFilter)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final GuidedSearchBoardCell this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, _board.getUid());
            Events.post(new Navigation(Location.BOARD, _board));
        }

        _cls1()
        {
            this$0 = GuidedSearchBoardCell.this;
            super();
        }
    }

}
