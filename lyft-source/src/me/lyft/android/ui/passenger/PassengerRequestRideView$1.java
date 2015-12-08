// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import java.util.concurrent.TimeUnit;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView, PassengerRideAddressInput, RequestRideButton, PaymentWidgetContainerView

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
        rideMap.bindPadding(passengerRideTop, passengerRideBottom);
        rideMap.centerMapGestures(true);
        rideMap.clearAllMarkers();
        rideMap.restoreZoom(rideRequestSession.getZoomLevel());
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), PassengerRequestRideView.access$000(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observePickupLocationChange(), PassengerRequestRideView.access$200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observeDropoffLocationChange(), PassengerRequestRideView.access$300(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observeCurrentRideType(), PassengerRequestRideView.access$400(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(requestRideTypeProvider.observeRideTypes(), PassengerRequestRideView.access$500(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideTypeSwitcher.observeSelectionChanges(), PassengerRequestRideView.access$600(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideTypeSwitcher.observePreviewChanges(), PassengerRequestRideView.access$700(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideTypeSwitcher.observeThumbClick(), PassengerRequestRideView.access$800(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.observeMapDragEnd(), PassengerRequestRideView.access$900(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.observeMapDragStart(), PassengerRequestRideView.access$1000(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/ui/passenger/PassengerRequestRideView$RateAppDialogResultEvent), PassengerRequestRideView.access$1100(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(passengerRideAddressInput.observePickupClick(), PassengerRequestRideView.access$1200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(passengerRideAddressInput.observeDropoffClick(), PassengerRequestRideView.access$1200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(passengerRideAddressInput.observePickupFocused(), PassengerRequestRideView.access$1300(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(passengerRideAddressInput.observeDropoffFocused(), PassengerRequestRideView.access$1400(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$1500(PassengerRequestRideView.this), PassengerRequestRideView.access$1600(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$1700(PassengerRequestRideView.this), PassengerRequestRideView.access$1800(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.observeShortcutClick(), PassengerRequestRideView.access$1900(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideMap.observeHotspotClick(), PassengerRequestRideView.access$2000(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(ReactiveUI.isTrue(PassengerRequestRideView.access$2100(PassengerRequestRideView.this)), PassengerRequestRideView.access$2200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(ReactiveUI.isTrue(PassengerRequestRideView.access$2300(PassengerRequestRideView.this)), PassengerRequestRideView.access$2400(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(ReactiveUI.isTrue(PassengerRequestRideView.access$2500(PassengerRequestRideView.this)), PassengerRequestRideView.access$2600(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(ReactiveUI.isTrue(PassengerRequestRideView.access$2700(PassengerRequestRideView.this)), PassengerRequestRideView.access$2800(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$2900(PassengerRequestRideView.this), new VisibilityBinding(rideTypeSwitcher));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(requestRideButton.observeSetPickupClick(), PassengerRequestRideView.access$3000(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(requestRideButton.observeSetDropoffClick(), PassengerRequestRideView.access$3100(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(requestRideButton.observeRequestRideClick(), PassengerRequestRideView.access$3200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observeRideStepChange(), PassengerRequestRideView.access$3300(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observeAnyLocationChange(), PassengerRequestRideView.access$3400(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$3500(PassengerRequestRideView.this), PassengerRequestRideView.access$3600(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(toolbar.observeItemClick(), PassengerRequestRideView.access$3700(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$3800(PassengerRequestRideView.this), PassengerRequestRideView.access$3900(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent), PassengerRequestRideView.access$4000(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(PassengerRequestRideView.access$4100(PassengerRequestRideView.this), new Action1() {

            final PassengerRequestRideView._cls1 this$1;

            public void call(Boolean boolean1)
            {
                paymentWidgetContainerView.isMapDragging(boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$1 = PassengerRequestRideView._cls1.this;
                super();
            }
        });
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult), PassengerRequestRideView.access$4200(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$ConfirmPricingDialogResultEvent), PassengerRequestRideView.access$4300(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(bus.observe(me/lyft/android/ui/passenger/PartySizePickerDialogView$SelectNumberOfPassengersResultEvent), PassengerRequestRideView.access$4400(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(rideRequestSession.observePickupOffset(), PassengerRequestRideView.access$4500(PassengerRequestRideView.this));
        PassengerRequestRideView.access$100(PassengerRequestRideView.this).bind(Observable.interval(1L, TimeUnit.MINUTES).flatMap(new Func1() {

            final PassengerRequestRideView._cls1 this$1;

            public volatile Object call(Object obj)
            {
                return call((Long)obj);
            }

            public Observable call(Long long1)
            {
                return rideRequestSession.observePickupOffset();
            }

            
            {
                this$1 = PassengerRequestRideView._cls1.this;
                super();
            }
        }), PassengerRequestRideView.access$4500(PassengerRequestRideView.this));
    }

    _cls2.this._cls1()
    {
        this$0 = PassengerRequestRideView.this;
        super();
    }
}
