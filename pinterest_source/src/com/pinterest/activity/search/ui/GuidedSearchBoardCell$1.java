// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.ui;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.search.ui:
//            GuidedSearchBoardCell

class this._cls0
    implements android.view.edSearchBoardCell._cls1
{

    final GuidedSearchBoardCell this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, GuidedSearchBoardCell.access$000(GuidedSearchBoardCell.this).getUid());
        Events.post(new Navigation(Location.BOARD, GuidedSearchBoardCell.access$000(GuidedSearchBoardCell.this)));
    }

    ()
    {
        this$0 = GuidedSearchBoardCell.this;
        super();
    }
}
