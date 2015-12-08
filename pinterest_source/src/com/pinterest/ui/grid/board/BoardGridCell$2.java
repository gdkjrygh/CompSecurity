// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.User;
import com.pinterest.base.Application;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.FollowUtils;
import com.pinterest.events.BoardFollowEvent;
import com.pinterest.events.FollowEvent;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCell

class this._cls0
    implements android.view.ener
{

    final BoardGridCell this$0;

    public void onClick(View view)
    {
        boolean flag = false;
        boolean flag1 = false;
        if (BoardGridCell.access$100(BoardGridCell.this) == null)
        {
            return;
        }
        Pinalytics.a(ElementType.BOARD_FOLLOW, ComponentType.FLOWED_BOARD, BoardGridCell.access$100(BoardGridCell.this).getUid());
        Events.post(new BoardFollowEvent(_followTv, BoardGridCell.access$100(BoardGridCell.this).getUid()));
        if (BoardGridCell.access$000(BoardGridCell.this))
        {
            view = BoardGridCell.access$100(BoardGridCell.this);
            flag = flag1;
            if (!BoardGridCell.access$100(BoardGridCell.this).getFollowing().booleanValue())
            {
                flag = true;
            }
            view.setFollowing(Boolean.valueOf(flag));
            Events.post(new FollowEvent(BoardGridCell.access$100(BoardGridCell.this).getUid(), BoardGridCell.access$100(BoardGridCell.this).getFollowing().booleanValue()));
        } else
        {
            final boolean isCurrentlyFollowing = Constants.isTrue(BoardGridCell.access$100(BoardGridCell.this).getFollowing());
            if (BoardGridCell.access$100(BoardGridCell.this).getUser() != null && !isCurrentlyFollowing && Constants.isTrue(BoardGridCell.access$100(BoardGridCell.this).getUser().getBlocked()))
            {
                Application.showToast(0x7f070079);
                return;
            }
            view = BoardGridCell.access$100(BoardGridCell.this);
            if (!isCurrentlyFollowing)
            {
                flag = true;
            }
            view.setFollowing(Boolean.valueOf(flag));
            class _cls1 extends com.pinterest.api.remote.BoardApi.BoardFollowApiResponse
            {

                final BoardGridCell._cls2 this$1;
                final boolean val$isCurrentlyFollowing;

                public void onFailure()
                {
                    Board board = BoardGridCell.access$100(this$0);
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
                    BoardGridCell.access$102(this$0, board);
                }

            _cls1()
            {
                this$1 = BoardGridCell._cls2.this;
                isCurrentlyFollowing = flag;
                super();
            }
            }

            FollowUtils.getInstance().followBoard(BoardGridCell.access$100(BoardGridCell.this).getUid(), BoardGridCell.access$100(BoardGridCell.this).getFollowing().booleanValue(), new _cls1(), null);
        }
        updateFollowButton(true);
    }

    _cls1()
    {
        this$0 = BoardGridCell.this;
        super();
    }
}
