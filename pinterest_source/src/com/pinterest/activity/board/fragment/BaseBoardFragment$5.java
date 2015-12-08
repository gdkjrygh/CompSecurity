// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.fragment;

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

// Referenced classes of package com.pinterest.activity.board.fragment:
//            BaseBoardFragment

class this._cls0
    implements android.view.
{

    final BaseBoardFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.BOARD_PINS_GRID, _board.getUid());
        if (Experiments.K())
        {
            SendShareUtils.getInstance().postSendShareNavigation(_board);
        } else
        {
            view = getContext();
            if (view != null)
            {
                Intent intent = new Intent(view, com/pinterest/activity/sendapin/SendPinActivity);
                intent.putExtra("boardId", _board.getUid());
                view.startActivity(intent);
                return;
            }
        }
    }

    ()
    {
        this$0 = BaseBoardFragment.this;
        super();
    }
}
