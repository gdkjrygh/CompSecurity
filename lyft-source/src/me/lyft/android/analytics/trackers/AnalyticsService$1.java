// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.trackers;

import me.lyft.android.domain.User;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.analytics.trackers:
//            AnalyticsService, AppEventTracker

class this._cls0
    implements Action1
{

    final AnalyticsService this$0;

    public volatile void call(Object obj)
    {
        call((User)obj);
    }

    public void call(User user)
    {
        AnalyticsService.access$000(AnalyticsService.this).updateUserInfo(user);
        AnalyticsService.access$100(AnalyticsService.this, user);
    }

    ()
    {
        this$0 = AnalyticsService.this;
        super();
    }
}
