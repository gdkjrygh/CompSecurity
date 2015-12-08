// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowedFragment

class this._cls0
    implements com.pinterest.ui.layout.hildViewClickListener
{

    final UserFollowedFragment this$0;

    public void onChildViewClick(Object obj)
    {
        if (obj == null || !(obj instanceof Board))
        {
            return;
        } else
        {
            obj = (Board)obj;
            Pinalytics.a(ElementType.BOARD_COVER, ComponentType.FLOWED_BOARD, ((Board) (obj)).getUid());
            Events.post(new Navigation(Location.BOARD, ((com.pinterest.api.model.Model) (obj))));
            return;
        }
    }

    Listener()
    {
        this$0 = UserFollowedFragment.this;
        super();
    }
}
