// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.FollowUtils;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.FollowButton;

public class FollowBoardButton extends FollowButton
{

    private Board _board;
    private String _editLbl;
    private String _followingLabel;
    private boolean _myUserIsOwner;
    private boolean _showSimilarBoards;

    public FollowBoardButton(Context context)
    {
        super(context);
        _editLbl = Resources.string(0x7f07020e);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    public FollowBoardButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _editLbl = Resources.string(0x7f07020e);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    public FollowBoardButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _editLbl = Resources.string(0x7f07020e);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    private void clickEdit()
    {
        Events.post(new Navigation(Location.BOARD_EDIT, _board));
    }

    private void clickFollow()
    {
        Pinalytics.a(ElementType.PIN_BOARD_FOLLOW, ComponentType.NAVIGATION, _board.getUid());
        Board board = _board;
        boolean flag;
        if (!Constants.isTrue(_board.getFollowing()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        board.setFollowing(Boolean.valueOf(flag));
        if (_showSimilarBoards && Constants.isTrue(_board.getFollowing()) && Experiments.e(true))
        {
            Events.post(new FollowBoardButtonClickEvent(_board));
        }
        updateDisplay();
        FollowUtils.getInstance().followBoard(String.valueOf(_board.getUid()), _board.getFollowing().booleanValue(), new _cls1(), null);
        updateDisplay();
    }

    public Board getBoard()
    {
        return _board;
    }

    protected boolean isFollowing()
    {
        return _board != null && Constants.isTrue(_board.getFollowing());
    }

    public void onClick(View view)
    {
        if (_board == null)
        {
            return;
        }
        if (_myUserIsOwner)
        {
            clickEdit();
            return;
        } else
        {
            clickFollow();
            return;
        }
    }

    public void setBoard(Board board)
    {
        _board = board;
        boolean flag;
        if (MyUser.isUserMe(_board.getUserUid()) || _board.getCollaborator() == Boolean.TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _myUserIsOwner = flag;
        updateDisplay();
    }

    public void setShowSimilarBoards(boolean flag)
    {
        _showSimilarBoards = flag;
    }

    protected void updateDisplay()
    {
        if (_myUserIsOwner)
        {
            setStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            setText(_editLbl);
            return;
        } else
        {
            super.updateDisplay();
            return;
        }
    }



/*
    static Board access$002(FollowBoardButton followboardbutton, Board board)
    {
        followboardbutton._board = board;
        return board;
    }

*/

    private class FollowBoardButtonClickEvent
    {

        private Board _board;
        final FollowBoardButton this$0;

        public Board getFollowedBoard()
        {
            return _board;
        }

        public FollowBoardButtonClickEvent(Board board)
        {
            this$0 = FollowBoardButton.this;
            super();
            _board = board;
        }
    }


    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
    {

        final FollowBoardButton this$0;

        public void onFailure()
        {
            Board board = _board;
            boolean flag;
            if (!Constants.isTrue(_board.getFollowing()))
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
            setLoading(false);
        }

        public void onStart()
        {
            super.onStart();
            setLoading(true);
        }

        public void onSuccess(Board board)
        {
            _board = board;
        }

        _cls1()
        {
            this$0 = FollowBoardButton.this;
            super();
        }
    }

}
