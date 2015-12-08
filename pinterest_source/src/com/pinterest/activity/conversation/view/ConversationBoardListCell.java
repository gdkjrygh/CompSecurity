// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.grid.board.BoardGridCell;

public class ConversationBoardListCell extends BoardGridCell
{

    public ConversationBoardListCell(Context context)
    {
        this(context, null);
    }

    public ConversationBoardListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
    }

    private void adjustLayout()
    {
        int i = (int)Resources.dimension(0x7f0a015f);
        setPadding(i, (int)Resources.dimension(0x7f0a0159), i, 0);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        hideFollowButton();
        adjustLayout();
    }

    public void setBoard(final String board)
    {
        setVisibility(8);
        board = ModelHelper.getBoard(board);
        if (board != null)
        {
            setBoard(((Board) (board)), false);
            setOnClickListener(new _cls1());
            setVisibility(0);
        }
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ConversationBoardListCell this$0;
        final Board val$board;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.BOARD, board));
        }

        _cls1()
        {
            this$0 = ConversationBoardListCell.this;
            board = board1;
            super();
        }
    }

}
