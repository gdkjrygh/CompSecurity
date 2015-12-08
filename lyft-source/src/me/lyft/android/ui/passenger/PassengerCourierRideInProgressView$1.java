// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideInProgressView, PassengerActiveRideZoomingController, PassengerRideAddressInput

class this._cls0
    implements Action1
{

    final PassengerCourierRideInProgressView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        if (Features.ENABLE_PASSENGER_RIDE_MAP_TRAFFIC.isEnabled())
        {
            rideMap.enableTraffic();
        }
        rideMap.bindPadding(passengerRideTop, passengerRideBottom);
        passengerActiveRideZoomingController.attach(centerToCurrentLocationButton);
        ScreenAnalytics.trackScreenView("passenger_line_ride_in_progress");
        rideMap.setGesturesEnabled(true);
        PassengerCourierRideInProgressView.access$000(PassengerCourierRideInProgressView.this);
        PassengerCourierRideInProgressView.access$100(PassengerCourierRideInProgressView.this);
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(PassengerCourierRideInProgressView.access$300(PassengerCourierRideInProgressView.this), PassengerCourierRideInProgressView.access$400(PassengerCourierRideInProgressView.this));
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(passengerRideProvider.observeStopsChange(), PassengerCourierRideInProgressView.access$500(PassengerCourierRideInProgressView.this));
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(passengerRideAddressInput.observePickupClick(), new Action1() {

            final PassengerCourierRideInProgressView._cls1 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit1)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
            }

            
            {
                this$1 = PassengerCourierRideInProgressView._cls1.this;
                super();
            }
        });
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

            final PassengerCourierRideInProgressView._cls1 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit1)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(false));
            }

            
            {
                this$1 = PassengerCourierRideInProgressView._cls1.this;
                super();
            }
        });
        PassengerCourierRideInProgressView.access$200(PassengerCourierRideInProgressView.this).bind(toolbar.observeItemClick(), PassengerCourierRideInProgressView.access$600(PassengerCourierRideInProgressView.this));
    }

    _cls2.this._cls1()
    {
        this$0 = PassengerCourierRideInProgressView.this;
        super();
    }
}
