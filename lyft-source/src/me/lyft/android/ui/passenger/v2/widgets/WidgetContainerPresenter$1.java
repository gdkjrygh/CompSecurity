// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.ride.PreRideInfo;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetContainerPresenter

class this._cls0
    implements Action1
{

    final WidgetContainerPresenter this$0;

    public volatile void call(Object obj)
    {
        call((PreRideInfo)obj);
    }

    public void call(PreRideInfo prerideinfo)
    {
        me.lyft.android.domain.ride.RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        WidgetContainerPresenter.access$000(WidgetContainerPresenter.this, prerideinfo, requestridetype);
    }

    ()
    {
        this$0 = WidgetContainerPresenter.this;
        super();
    }
}
