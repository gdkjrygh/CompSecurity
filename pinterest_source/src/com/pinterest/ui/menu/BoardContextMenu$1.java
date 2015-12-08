// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

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

// Referenced classes of package com.pinterest.ui.menu:
//            BoardContextMenu

class this._cls0
    implements android.view.r
{

    final BoardContextMenu this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.CONTEXTUAL_MENU, BoardContextMenu.access$000(BoardContextMenu.this).getUid());
        if (Experiments.K())
        {
            SendShareUtils.getInstance().postSendShareNavigation(BoardContextMenu.access$000(BoardContextMenu.this));
            return;
        } else
        {
            view = view.getContext();
            Intent intent = new Intent(view, com/pinterest/activity/sendapin/SendPinActivity);
            intent.putExtra("boardId", BoardContextMenu.access$000(BoardContextMenu.this).getUid());
            view.startActivity(intent);
            return;
        }
    }

    tivity()
    {
        this$0 = BoardContextMenu.this;
        super();
    }
}
