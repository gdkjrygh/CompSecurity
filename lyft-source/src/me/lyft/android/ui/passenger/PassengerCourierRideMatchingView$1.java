// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.List;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.logging.L;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView

class this._cls0
    implements Action1
{

    final PassengerCourierRideMatchingView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        rideMap.bindPadding(passengerRideTop, passengerRideBottom);
        unit = passengerRideProvider.getPassengerRide();
        rideMap.fitMapTo(new Location[] {
            unit.getPickup(), unit.getDropoff()
        });
        if (!unit.getStatus().isPending())
        {
            L.e(new IllegalStateException("PassengerCourierRideMatchingView expected pending ride"), (new StringBuilder()).append("Ride id:").append(unit.getId()).append(", ride status: ").append(unit.getStatus()).toString(), new Object[0]);
        }
        PassengerCourierRideMatchingView.access$000(PassengerCourierRideMatchingView.this).bind(passengerRideProvider.observeStopsChange(), new Action1() {

            final PassengerCourierRideMatchingView._cls1 this$1;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                rideMap.showCourierRouteMarkers(list);
            }

            
            {
                this$1 = PassengerCourierRideMatchingView._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
