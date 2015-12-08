// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid.board;

import android.view.View;
import android.widget.TextView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.menu.ShowBoardContextMenuEvent;

// Referenced classes of package com.pinterest.ui.grid.board:
//            BoardGridCell

class this._cls0
    implements android.view.Listener
{

    final BoardGridCell this$0;

    public boolean onLongClick(View view)
    {
        while (BoardGridCell.access$000(BoardGridCell.this) || BoardGridCell.access$100(BoardGridCell.this) == null || _followTv != null && _followTv.getVisibility() == 0 && _followTv.isPressed()) 
        {
            return false;
        }
        if (Constants.isTrue(BoardGridCell.access$100(BoardGridCell.this).getSecret()))
        {
            Events.post(new Navigation(Location.BOARD_EDIT, BoardGridCell.access$100(BoardGridCell.this)));
            return true;
        } else
        {
            Pinalytics.a(EventType.LONG_PRESS, ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, BoardGridCell.access$100(BoardGridCell.this).getUid());
            Events.post(new ShowBoardContextMenuEvent(BoardGridCell.access$100(BoardGridCell.this)));
            return true;
        }
    }

    ent()
    {
        this$0 = BoardGridCell.this;
        super();
    }
}
