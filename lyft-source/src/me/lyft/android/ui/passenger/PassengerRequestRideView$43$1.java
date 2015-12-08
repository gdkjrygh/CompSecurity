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
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, PassengerRideAddressInput, RequestRideButton

class this._cls1
    implements Func1
{

    final call this$1;

    public Boolean call(Unit unit)
    {
        boolean flag;
        if (rideRequestSession.getCurrentRideType().isCourier() && PassengerRequestRideView.access$5100(_fld0))
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

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/passenger/PassengerRequestRideView$43

/* anonymous class */
    class PassengerRequestRideView._cls43
        implements Action1
    {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            ScreenAnalytics.trackScreenView("passenger_line_set_pickup");
            passengerRideAddressInput.focusAndStretchPickupAddress();
            requestRideButton.switchToSetPickup();
            rideMap.clearShortcutMarkers();
            rideMap.clearPickupMarker();
            rideMap.showTransparentDestinationMarker(rideRequestSession.getDropoffLocation());
            PassengerRequestRideView.access$6800(PassengerRequestRideView.this);
            unit = rideRequestSession.getPickupLocation();
            if (unit.isNull())
            {
                PassengerRequestRideView.access$6700(PassengerRequestRideView.this);
                rideMap.clearPickupMarker();
                return;
            } else
            {
                PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.centerToLocationWithoutPadding(unit).filter(new PassengerRequestRideView._cls43._cls1()), new PassengerRequestRideView._cls43._cls2());
                return;
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }

        // Unreferenced inner class me/lyft/android/ui/passenger/PassengerRequestRideView$43$2

/* anonymous class */
        class PassengerRequestRideView._cls43._cls2 extends AsyncCall
        {

            final PassengerRequestRideView._cls43 this$1;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                PassengerRequestRideView.access$6700(this$0);
                rideMap.clearPickupMarker();
            }

                    
                    {
                        this$1 = PassengerRequestRideView._cls43.this;
                        super();
                    }
        }

    }

}
