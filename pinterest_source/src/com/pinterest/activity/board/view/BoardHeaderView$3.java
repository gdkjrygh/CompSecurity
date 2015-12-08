// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.view.View;
import com.pinterest.activity.board.dialog.BoardBaseDialog;
import com.pinterest.activity.board.dialog.BoardCollaboratorsDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderView

class this._cls0
    implements android.view.er
{

    final BoardHeaderView this$0;

    public void onClick(View view)
    {
        if (BoardHeaderView.access$000(BoardHeaderView.this) != null && BoardHeaderView.access$200(BoardHeaderView.this) != null)
        {
            Pinalytics.a(ElementType.COLLABORATOR_TEXT, ComponentType.LIST_HEADER, BoardHeaderView.access$000(BoardHeaderView.this).getUid());
            if (BoardHeaderView.access$000(BoardHeaderView.this).allowToInviteOthers())
            {
                Events.post(new Navigation(Location.INVITE_BOARD_COLLAB, BoardHeaderView.access$000(BoardHeaderView.this).getUid()));
                return;
            }
            if (Constants.isTrue(BoardHeaderView.access$000(BoardHeaderView.this).getCollaborative()))
            {
                Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardCollaboratorsDialog, BoardHeaderView.access$000(BoardHeaderView.this).getUid())));
                return;
            }
        }
    }

    rsDialog()
    {
        this$0 = BoardHeaderView.this;
        super();
    }
}
