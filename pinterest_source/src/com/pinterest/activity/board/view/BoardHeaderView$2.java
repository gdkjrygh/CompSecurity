// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.board.view:
//            BoardHeaderView

class val.user
    implements android.view.er
{

    final BoardHeaderView this$0;
    final User val$user;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.STORIES_FEED_RELATED_OBJECT, ComponentType.STORIES_FEED, val$user.getUid());
        Events.post(new Navigation(Location.USER, val$user));
    }

    _cls9()
    {
        this$0 = final_boardheaderview;
        val$user = User.this;
        super();
    }
}
