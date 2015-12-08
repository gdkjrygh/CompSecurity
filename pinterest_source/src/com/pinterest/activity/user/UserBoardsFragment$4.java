// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.user:
//            UserBoardsFragment

class this._cls0
    implements com.pinterest.ui.layout.nChildViewClickListener
{

    final UserBoardsFragment this$0;

    public void onChildViewClick(Object obj)
    {
        if (obj == null || !(obj instanceof User))
        {
            return;
        } else
        {
            obj = (User)obj;
            Pinalytics.a(ElementType.USER_LIST_USER, ComponentType.USER_FEED, ((User) (obj)).getUid());
            Events.post(new Navigation(Location.USER, ((com.pinterest.api.model.Model) (obj))));
            return;
        }
    }

    ldViewClickListener()
    {
        this$0 = UserBoardsFragment.this;
        super();
    }
}
