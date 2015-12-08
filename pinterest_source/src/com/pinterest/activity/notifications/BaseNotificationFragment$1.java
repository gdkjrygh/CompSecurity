// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.notifications:
//            BaseNotificationFragment

class this._cls0
    implements android.support.v4.widget.hListener
{

    final BaseNotificationFragment this$0;

    public void onRefresh()
    {
        if (BaseNotificationFragment.access$000(BaseNotificationFragment.this))
        {
            BaseNotificationFragment.access$100(BaseNotificationFragment.this).setRefreshing(false);
            return;
        } else
        {
            Pinalytics.a(EventType.PULL_TO_REFRESH, null);
            refresh();
            return;
        }
    }

    ()
    {
        this$0 = BaseNotificationFragment.this;
        super();
    }
}
