// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, PassengerRideAddressInput, RequestRideButton

class this._cls0
    implements Action1
{

    final PassengerRequestRideView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        ScreenAnalytics.trackScreenView("passenger_line_set_dropoff");
        passengerRideAddressInput.focusAndStretchDropoffAddress();
        requestRideButton.switchToSetDestination();
        rideMap.clearHotspotMarkers();
        rideMap.clearDestinationMarker();
        rideMap.showTransparentPickupMarker(rideRequestSession.getPickupLocation());
        PassengerRequestRideView.access$6800(PassengerRequestRideView.this);
        unit = rideRequestSession.getDropoffLocation();
        if (unit.isNull())
        {
            rideMap.fitMapToShortcuts(rideRequestSession.getPickupLocation());
            PassengerRequestRideView.access$6900(PassengerRequestRideView.this);
            rideMap.clearDestinationMarker();
        } else
        {
            PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.centerToLocationWithoutPadding(unit).filter(new Func1() {

                final PassengerRequestRideView._cls44 this$1;

                public Boolean call(Unit unit1)
                {
                    boolean flag;
                    if (rideRequestSession.getCurrentRideType().isCourier() && PassengerRequestRideView.access$5400(this$0))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    return Boolean.valueOf(flag);
                }

                public volatile Object call(Object obj)
                {
                    return call((Unit)obj);
                }

            
            {
                this$1 = PassengerRequestRideView._cls44.this;
                super();
            }
            }).doOnUnsubscribe(new Action0() {

                final PassengerRequestRideView._cls44 this$1;

                public void call()
                {
                    rideMap.clearDestinationMarker();
                }

            
            {
                this$1 = PassengerRequestRideView._cls44.this;
                super();
            }
            }), new AsyncCall() {

                final PassengerRequestRideView._cls44 this$1;

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Unit)obj);
                }

                public void onSuccess(Unit unit1)
                {
                    super.onSuccess(unit1);
                    PassengerRequestRideView.access$6900(this$0);
                }

            
            {
                this$1 = PassengerRequestRideView._cls44.this;
                super();
            }
            });
        }
        rideMap.showShortcuts();
    }

    _cls3.this._cls1()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
