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

class this._cls1
    implements Action0
{

    final ap this$1;

    public void call()
    {
        rideMap.clearDestinationMarker();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/passenger/PassengerRequestRideView$44

/* anonymous class */
    class PassengerRequestRideView._cls44
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
                PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.centerToLocationWithoutPadding(unit).filter(new PassengerRequestRideView._cls44._cls2()).doOnUnsubscribe(new PassengerRequestRideView._cls44._cls1()), new PassengerRequestRideView._cls44._cls3());
            }
            rideMap.showShortcuts();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/ui/passenger/PassengerRequestRideView$44$2

/* anonymous class */
        class PassengerRequestRideView._cls44._cls2
            implements Func1
        {

            final PassengerRequestRideView._cls44 this$1;

            public Boolean call(Unit unit)
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
        }


        // Unreferenced inner class me/lyft/android/ui/passenger/PassengerRequestRideView$44$3

/* anonymous class */
        class PassengerRequestRideView._cls44._cls3 extends AsyncCall
        {

            final PassengerRequestRideView._cls44 this$1;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                PassengerRequestRideView.access$6900(this$0);
            }

                    
                    {
                        this$1 = PassengerRequestRideView._cls44.this;
                        super();
                    }
        }

    }

}
