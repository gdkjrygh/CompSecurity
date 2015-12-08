// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserFollowersFragment

class this._cls0
    implements android.support.v4.widget.reshListener
{

    final UserFollowersFragment this$0;

    public void onRefresh()
    {
        if (UserFollowersFragment.access$000(UserFollowersFragment.this))
        {
            return;
        } else
        {
            _swipeVw.setRefreshing(true);
            Pinalytics.a(EventType.PULL_TO_REFRESH, null);
            refresh();
            return;
        }
    }

    r()
    {
        this$0 = UserFollowersFragment.this;
        super();
    }
}
