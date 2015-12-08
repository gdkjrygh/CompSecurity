// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
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
        Pinalytics.a(ElementType.BOARD_EDIT_BUTTON, ComponentType.CONTEXTUAL_MENU, BoardContextMenu.access$000(BoardContextMenu.this).getUid());
        Events.post(new Navigation(Location.BOARD_EDIT, BoardContextMenu.access$000(BoardContextMenu.this)));
    }

    n()
    {
        this$0 = BoardContextMenu.this;
        super();
    }
}
