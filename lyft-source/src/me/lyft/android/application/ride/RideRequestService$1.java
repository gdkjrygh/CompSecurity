// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.analytics.ActionAnalytics;
import rx.Notification;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            RideRequestService

class val.requestRideAction
    implements Action1
{

    final RideRequestService this$0;
    final ActionAnalytics val$requestRideAction;

    public volatile void call(Object obj)
    {
        call((Notification)obj);
    }

    public void call(Notification notification)
    {
        if (notification.isOnNext())
        {
            val$requestRideAction.trackSuccess();
        } else
        if (notification.isOnError())
        {
            val$requestRideAction.trackFailure(notification.getThrowable());
            return;
        }
    }

    ()
    {
        this$0 = final_riderequestservice;
        val$requestRideAction = ActionAnalytics.this;
        super();
    }
}
