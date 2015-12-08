// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.content.Context;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.grid.board.BoardGridCell;

// Referenced classes of package com.pinterest.adapter:
//            PinPicksAdapter

class this._cls0
    implements android.view.er
{

    final PinPicksAdapter this$0;

    public void onClick(View view)
    {
        Object obj = (BoardGridCell)view;
        if (((BoardGridCell) (obj)).getBoard() == null)
        {
            return;
        } else
        {
            String s = ((BoardGridCell) (obj)).getBoard().getUid();
            Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, s);
            obj = new Navigation(Location.BOARD, ((BoardGridCell) (obj)).getBoard());
            obj = ActivityHelper.getTaskIntent(view.getContext(), ((Navigation) (obj)));
            view.getContext().startActivity(((android.content.Intent) (obj)));
            return;
        }
    }

    on()
    {
        this$0 = PinPicksAdapter.this;
        super();
    }
}
