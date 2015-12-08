// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

import android.view.View;
import com.pinterest.activity.board.dialog.BoardShareDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements android.view.
{

    final BaseBoardFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_SHARE_BUTTON, ComponentType.FLOWED_BOARD, _board.getUid());
        Events.post(new DialogEvent(BoardShareDialog.newInstance(_board.getUid())));
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
