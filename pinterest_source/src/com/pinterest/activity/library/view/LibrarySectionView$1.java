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
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibrarySectionView

class this._cls0
    implements android.view.w.LibrarySectionView._cls1
{

    final LibrarySectionView this$0;

    public void onClick(View view)
    {
        if (LibrarySectionView.access$000(LibrarySectionView.this) == null)
        {
            return;
        }
        if (LibrarySectionView.access$000(LibrarySectionView.this).getType().equals("board") && LibrarySectionView.access$000(LibrarySectionView.this).getBoard() != null)
        {
            view = LibrarySectionView.access$000(LibrarySectionView.this).getBoard();
            Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, view.getUid());
            Events.post(new Navigation(Location.BOARD, view));
            return;
        }
        if (LibrarySectionView.access$000(LibrarySectionView.this).getType().equals("likes") && LibrarySectionView.access$000(LibrarySectionView.this).getPinList() != null)
        {
            Pinalytics.a(ElementType.USER_LIKES_BUTTON, ComponentType.NAVIGATION);
            view = new Navigation(Location.USER_LIBRARY_LIKE, LibrarySectionView.access$100(LibrarySectionView.this));
            view.putExtra("com.pinterest.EXTRA_TITLE", Resources.string(0x7f070336));
            Events.post(view);
            return;
        } else
        {
            showAllPinsPage();
            return;
        }
    }

    ()
    {
        this$0 = LibrarySectionView.this;
        super();
    }
}
