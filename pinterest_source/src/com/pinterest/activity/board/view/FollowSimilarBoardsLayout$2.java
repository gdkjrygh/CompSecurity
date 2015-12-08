// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.view:
//            FollowSimilarBoardsLayout

class val.board
    implements android.view.imilarBoardsLayout._cls2
{

    final FollowSimilarBoardsLayout this$0;
    final Board val$board;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SIMILAR_BOARD_OPEN_BUTTON, ComponentType.SIMILAR_BOARDS, val$board.getUid());
        Events.post(new Navigation(Location.BOARD, val$board.getUid()));
    }

    ()
    {
        this$0 = final_followsimilarboardslayout;
        val$board = Board.this;
        super();
    }
}
