// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.base.FollowUtils;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowBoardButton

public class FollowSimilarBoardButton extends FollowBoardButton
{

    private Board _board;
    private String _followingLabel;

    public FollowSimilarBoardButton(Context context)
    {
        super(context);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    public FollowSimilarBoardButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    public FollowSimilarBoardButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _followingLabel = Resources.string(0x7f0702ba);
    }

    private void clickFollow()
    {
        Pinalytics.a(ElementType.SIMILAR_BOARD_FOLLOW_BUTTON, ComponentType.SIMILAR_BOARDS, _board.getUid());
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
        if (isFollowing())
        {
            setText(_followingLabel);
        }
        FollowUtils.getInstance().followBoard(String.valueOf(_board.getUid()), _board.getFollowing().booleanValue(), new _cls1(), null);
    }

    public Board getBoard()
    {
        return _board;
    }

    public boolean isFollowing()
    {
        return _board != null && Constants.isTrue(_board.getFollowing());
    }

    public void onClick(View view)
    {
        if (_board == null)
        {
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
        updateDisplay();
    }



/*
    static Board access$002(FollowSimilarBoardButton followsimilarboardbutton, Board board)
    {
        followsimilarboardbutton._board = board;
        return board;
    }

*/

    private class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
    {

        final FollowSimilarBoardButton this$0;

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
            setEnabled(true);
        }

        public void onStart()
        {
            super.onStart();
            setEnabled(false);
        }

        public void onSuccess(Board board)
        {
            _board = board;
            Events.post(new FollowSimilarBoardSuccessEvent(((Integer)getTag()).intValue()));
        }

        _cls1()
        {
            this$0 = FollowSimilarBoardButton.this;
            super();
        }

        private class FollowSimilarBoardSuccessEvent
        {

            private int _viewPositionIndex;

            public int getViewPositionIndex()
            {
                return _viewPositionIndex;
            }

            public FollowSimilarBoardSuccessEvent(int i)
            {
                _viewPositionIndex = i;
            }
        }

    }

}
