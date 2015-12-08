// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.Board;
import com.pinterest.base.Colors;
import com.pinterest.base.Constants;
import com.pinterest.offline.OfflineDataInfo;
import com.pinterest.ui.ViewHelper;
import java.util.Set;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCellTitleView, BoardGridCellTitleUserView, BoardGridCellImageView

public class BoardGridCell extends LinearLayout
{

    private Board _board;
    BoardGridCellImageView _cover;
    View _divider;
    TextView _followTv;
    private Listener _listener;
    private boolean _overrideClicks;
    BoardGridCellTitleView _title;
    BoardGridCellTitleUserView _titleUser;
    private android.view.View.OnClickListener onFollowClicked;

    public BoardGridCell(Context context)
    {
        this(context, null);
    }

    public BoardGridCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _overrideClicks = false;
        onFollowClicked = new _cls2();
        init();
    }

    public static BoardGridCell get(View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof BoardGridCell))
        {
            return new BoardGridCell(ViewHelper.getContext(view, viewgroup));
        } else
        {
            return (BoardGridCell)view;
        }
    }

    protected void dispatchSetPressed(boolean flag)
    {
    }

    public void displayFollowButton(boolean flag)
    {
        if (flag)
        {
            showFollowButton();
            return;
        } else
        {
            hideFollowButton();
            return;
        }
    }

    public Board getBoard()
    {
        return _board;
    }

    public void hideFollowButton()
    {
        _followTv.setVisibility(8);
        _divider.setVisibility(8);
    }

    protected void init()
    {
        inflate(getContext(), 0x7f03013e, this);
        ButterKnife.a(this);
        setOnLongClickListener(new _cls1());
    }

    public boolean isOverrideClicks()
    {
        return _overrideClicks;
    }

    public void setBoard(Board board, boolean flag)
    {
        _board = board;
        break MISSING_BLOCK_LABEL_5;
        if (_board != null && !flag)
        {
            updateFollowButton(false);
            _title.setBoard(_board);
            if (_titleUser.getVisibility() == 0)
            {
                _titleUser.setBoard(_board);
            }
            _cover.setBoard(_board, flag);
            OfflineDataInfo.g();
            if (OfflineDataInfo.f())
            {
                Object obj = OfflineDataInfo.g();
                board = _board.getUid();
                boolean flag1;
                if (OfflineDataInfo.f())
                {
                    obj = ((OfflineDataInfo) (obj)).e();
                    if (obj != null && ((Set) (obj)).contains(board))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    _title.setAlpha(1.0F);
                    _cover.usePrimaryColors(false);
                    return;
                } else
                {
                    _title.setAlpha(0.5F);
                    _cover.usePrimaryColors(true);
                    return;
                }
            }
        }
        return;
    }

    public void setListener(Listener listener)
    {
        _listener = listener;
    }

    public void setOverrideClicks(boolean flag)
    {
        _overrideClicks = flag;
    }

    public void showFollowButton()
    {
        _followTv.setVisibility(0);
        _divider.setVisibility(0);
        updateFollowButton(false);
    }

    public void showTitleUser(boolean flag)
    {
        if (flag)
        {
            _titleUser.setVisibility(0);
            _titleUser.setBoard(_board);
            _title.setVisibility(8);
            return;
        } else
        {
            _titleUser.setVisibility(8);
            _title.setVisibility(0);
            return;
        }
    }

    public void updateFollowButton(boolean flag)
    {
        if (_followTv != null && _followTv.getVisibility() == 0)
        {
            _followTv.setOnClickListener(onFollowClicked);
            if (_board != null)
            {
                if (_board.getCollaborator() == Boolean.TRUE)
                {
                    _followTv.setText(0x7f0700ee);
                    _followTv.setTypeface(null, 0);
                    _followTv.setTextColor(Colors.TEXT_LIGHT);
                    _followTv.setEnabled(false);
                } else
                {
                    ViewHelper.updateFollow(_followTv, Constants.isTrue(_board.getFollowing()));
                    _followTv.setTypeface(null, 1);
                    _followTv.setEnabled(true);
                }
                if (flag && _listener != null)
                {
                    _listener.onBoardChanged(_board);
                    return;
                }
            }
        }
    }




/*
    static Board access$102(BoardGridCell boardgridcell, Board board)
    {
        boardgridcell._board = board;
        return board;
    }

*/

    private class _cls2
        implements android.view.View.OnClickListener
    {

        final BoardGridCell this$0;

        public void onClick(View view)
        {
            boolean flag = false;
            boolean flag1 = false;
            if (_board == null)
            {
                return;
            }
            Pinalytics.a(ElementType.BOARD_FOLLOW, ComponentType.FLOWED_BOARD, _board.getUid());
            Events.post(new BoardFollowEvent(_followTv, _board.getUid()));
            if (_overrideClicks)
            {
                view = _board;
                flag = flag1;
                if (!_board.getFollowing().booleanValue())
                {
                    flag = true;
                }
                view.setFollowing(Boolean.valueOf(flag));
                Events.post(new FollowEvent(_board.getUid(), _board.getFollowing().booleanValue()));
            } else
            {
                final boolean isCurrentlyFollowing = Constants.isTrue(_board.getFollowing());
                if (_board.getUser() != null && !isCurrentlyFollowing && Constants.isTrue(_board.getUser().getBlocked()))
                {
                    Application.showToast(0x7f070079);
                    return;
                }
                view = _board;
                if (!isCurrentlyFollowing)
                {
                    flag = true;
                }
                view.setFollowing(Boolean.valueOf(flag));
                class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
                {

                    final _cls2 this$1;
                    final boolean val$isCurrentlyFollowing;

                    public void onFailure()
                    {
                        Board board = _board;
                        boolean flag2;
                        if (!isCurrentlyFollowing)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        board.setFollowing(Boolean.valueOf(flag2));
                        updateFollowButton(true);
                    }

                    public void onSuccess(Board board)
                    {
                        _board = board;
                    }

                _cls1()
                {
                    this$1 = _cls2.this;
                    isCurrentlyFollowing = flag;
                    super();
                }
                }

                FollowUtils.getInstance().followBoard(_board.getUid(), _board.getFollowing().booleanValue(), new _cls1(), null);
            }
            updateFollowButton(true);
        }

        _cls2()
        {
            this$0 = BoardGridCell.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnLongClickListener
    {

        final BoardGridCell this$0;

        public boolean onLongClick(View view)
        {
            while (_overrideClicks || _board == null || _followTv != null && _followTv.getVisibility() == 0 && _followTv.isPressed()) 
            {
                return false;
            }
            if (Constants.isTrue(_board.getSecret()))
            {
                Events.post(new Navigation(Location.BOARD_EDIT, _board));
                return true;
            } else
            {
                Pinalytics.a(EventType.LONG_PRESS, ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, _board.getUid());
                Events.post(new ShowBoardContextMenuEvent(_board));
                return true;
            }
        }

        _cls1()
        {
            this$0 = BoardGridCell.this;
            super();
        }
    }


    private class Listener
    {

        public abstract void onBoardChanged(Board board);
    }

}
