// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.view.View;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.user:
//            UserBoardsFragment

class this._cls0
    implements android.view.ardsFragment._cls7
{

    final UserBoardsFragment this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_CREATE, ComponentType.FLOWED_BOARD);
        Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
    }

    ialog()
    {
        this$0 = UserBoardsFragment.this;
        super();
    }
}
