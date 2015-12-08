// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.menu.ShowBoardContextMenuEvent;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibrarySectionView

class this._cls0
    implements android.view.ner
{

    final LibrarySectionView this$0;

    public boolean onLongClick(View view)
    {
        if (LibrarySectionView.access$000(LibrarySectionView.this) != null && LibrarySectionView.access$000(LibrarySectionView.this).getType().equals("board"))
        {
            view = LibrarySectionView.access$000(LibrarySectionView.this).getBoard();
            if (view != null)
            {
                if (Constants.isTrue(view.getSecret()))
                {
                    Events.post(new Navigation(Location.BOARD_EDIT, view));
                    return true;
                } else
                {
                    Pinalytics.a(EventType.LONG_PRESS, ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, view.getUid());
                    Events.post(new ShowBoardContextMenuEvent(view));
                    return true;
                }
            }
        }
        return false;
    }

    ()
    {
        this$0 = LibrarySectionView.this;
        super();
    }
}
