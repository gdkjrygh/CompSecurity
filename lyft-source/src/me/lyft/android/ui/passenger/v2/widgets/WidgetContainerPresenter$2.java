// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import java.util.List;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetContainerPresenter

class this._cls0
    implements Action1
{

    final WidgetContainerPresenter this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        list = preRideInfoRepository.getPreRideInfo();
        me.lyft.android.domain.ride.RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        WidgetContainerPresenter.access$000(WidgetContainerPresenter.this, list, requestridetype);
    }

    ()
    {
        this$0 = WidgetContainerPresenter.this;
        super();
    }
}
