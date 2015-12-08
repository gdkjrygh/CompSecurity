// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.adapter;

import android.view.View;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.adapter:
//            PinPicksAdapter

class this._cls0
    implements android.view.er
{

    final PinPicksAdapter this$0;

    public void onClick(View view)
    {
        view = (PersonListCell)view;
        if (view.getUser() == null)
        {
            return;
        } else
        {
            view = view.getUserId();
            Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, view);
            Events.post(new Navigation(Location.USER, view));
            return;
        }
    }

    on()
    {
        this$0 = PinPicksAdapter.this;
        super();
    }
}
