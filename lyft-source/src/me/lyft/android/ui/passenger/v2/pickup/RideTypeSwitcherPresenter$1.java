// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import java.util.List;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.controls.RideTypeSwitcherMapper;
import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            RideTypeSwitcherPresenter

class this._cls0
    implements Action1
{

    final RideTypeSwitcherPresenter this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        list = RideTypeSwitcherMapper.mapToRideSwitcherItem(list, constantsProvider.getRideTypeMetas());
        ((deTypeSwitcherView)RideTypeSwitcherPresenter.access$000(RideTypeSwitcherPresenter.this)).setRideTypeSwitcherItems(list);
        ((deTypeSwitcherView)RideTypeSwitcherPresenter.access$100(RideTypeSwitcherPresenter.this)).setRideType(requestridetype.getId(), true);
        if (RideTypeSwitcherPresenter.access$200(RideTypeSwitcherPresenter.this, requestridetype, list))
        {
            boolean flag = ((deTypeSwitcherView)RideTypeSwitcherPresenter.access$300(RideTypeSwitcherPresenter.this)).showCourierTooltip();
            list = rideRequestSession;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list.setShouldShowCourierPromoBanner(flag);
        }
    }

    deTypeSwitcherView()
    {
        this$0 = RideTypeSwitcherPresenter.this;
        super();
    }
}
