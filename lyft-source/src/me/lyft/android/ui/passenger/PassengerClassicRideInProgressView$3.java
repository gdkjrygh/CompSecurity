// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerClassicRideInProgressView, PassengerActiveRideZoomingController, PassengerRideAddressInput

class this._cls0
    implements Action1
{

    final PassengerClassicRideInProgressView this$0;

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
        ScreenAnalytics.trackScreenView("passenger_regular_ride_in_progress");
        rideMap.setGesturesEnabled(true);
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(PassengerClassicRideInProgressView.access$100(PassengerClassicRideInProgressView.this), PassengerClassicRideInProgressView.access$200(PassengerClassicRideInProgressView.this));
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(PassengerClassicRideInProgressView.access$300(PassengerClassicRideInProgressView.this), PassengerClassicRideInProgressView.access$400(PassengerClassicRideInProgressView.this));
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(PassengerClassicRideInProgressView.access$500(PassengerClassicRideInProgressView.this), PassengerClassicRideInProgressView.access$600(PassengerClassicRideInProgressView.this));
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(passengerRideAddressInput.observePickupClick(), new Action1() {

            final PassengerClassicRideInProgressView._cls3 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit1)
            {
                dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
            }

            
            {
                this$1 = PassengerClassicRideInProgressView._cls3.this;
                super();
            }
        });
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

            final PassengerClassicRideInProgressView._cls3 this$1;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit1)
            {
                appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.PassengerSetDropoffSearch());
            }

            
            {
                this$1 = PassengerClassicRideInProgressView._cls3.this;
                super();
            }
        });
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(PassengerClassicRideInProgressView.access$700(PassengerClassicRideInProgressView.this), PassengerClassicRideInProgressView.access$800(PassengerClassicRideInProgressView.this));
        PassengerClassicRideInProgressView.access$000(PassengerClassicRideInProgressView.this).bind(toolbar.observeItemClick(), PassengerClassicRideInProgressView.access$900(PassengerClassicRideInProgressView.this));
    }

    _cls2.this._cls1()
    {
        this$0 = PassengerClassicRideInProgressView.this;
        super();
    }
}
