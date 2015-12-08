// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

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

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryBoardCollabBar

class this._cls0
    implements android.view.ibraryBoardCollabBar._cls2
{

    final LibraryBoardCollabBar this$0;

    public void onClick(View view)
    {
        if (LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this) != null && LibraryBoardCollabBar.access$100(LibraryBoardCollabBar.this) != null)
        {
            Pinalytics.a(ElementType.COLLABORATOR_TEXT, ComponentType.LIST_HEADER, LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getUid());
            if (LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).allowToInviteOthers())
            {
                Events.post(new Navigation(Location.INVITE_BOARD_COLLAB, LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getUid()));
                return;
            }
            if (Constants.isTrue(LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getCollaborative()))
            {
                Events.post(new DialogEvent(BoardBaseDialog.newInstance(com/pinterest/activity/board/dialog/BoardCollaboratorsDialog, LibraryBoardCollabBar.access$000(LibraryBoardCollabBar.this).getUid())));
                return;
            }
        }
    }

    ()
    {
        this$0 = LibraryBoardCollabBar.this;
        super();
    }
}
