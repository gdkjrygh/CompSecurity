// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.view.View;
import com.pinterest.activity.board.dialog.BoardShareDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

final class val.board
    implements android.view.
{

    final Board val$board;

    public final void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_SHARE_BUTTON, ComponentType.FLOWED_BOARD, val$board.getUid());
        Events.post(new DialogEvent(BoardShareDialog.newInstance(val$board.getUid())));
    }

    ialog()
    {
        val$board = board1;
        super();
    }
}
