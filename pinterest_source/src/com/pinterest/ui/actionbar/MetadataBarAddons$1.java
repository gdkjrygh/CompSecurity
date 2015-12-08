// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionbar;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.pinterest.activity.sendapin.SendPinActivity;
import com.pinterest.activity.sendshare.util.SendShareUtils;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

final class val.board
    implements android.view.
{

    final Board val$board;

    public final void onClick(View view)
    {
        Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.BOARD_PINS_GRID, val$board.getUid());
        if (Experiments.K())
        {
            SendShareUtils.getInstance().postSendShareNavigation(val$board);
        } else
        {
            view = view.getContext();
            if (view != null)
            {
                Intent intent = new Intent(view, com/pinterest/activity/sendapin/SendPinActivity);
                intent.putExtra("boardId", val$board.getUid());
                view.startActivity(intent);
                return;
            }
        }
    }

    ()
    {
        val$board = board1;
        super();
    }
}
