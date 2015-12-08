// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.location.SphericalUtils;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput, RideInProgressBottomView, PassengerActiveRideZoomingController

public class PassengerClassicRideInProgressView extends RelativeLayout
{

    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    ImageButton centerToCurrentLocationButton;
    private ReactiveProperty destinationChange;
    DialogFlow dialogFlow;
    private ReactiveProperty driverLocationSubject;
    TextView driverNameTextView;
    TextView driverRatingTextView;
    private ReactiveProperty driverSubject;
    IGeoService geoService;
    private ReactiveProperty isAccepted;
    private ReactiveProperty isArrived;
    private ReactiveProperty isPickedup;
    private Action1 onDestinationChange;
    private Action1 onDriverChange;
    private Action1 onDriverLocationChanged;
    private final Action1 onMapLoaded = new Action1() {

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
            binder.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
            binder.bind(driverSubject, onDriverChange);
            binder.bind(destinationChange, onDestinationChange);
            binder.bind(pickupChange, updatePickupMarkerAndLocation);
            binder.bind(passengerRideAddressInput.observePickupClick(), new Action1() {

                final _cls3 this$1;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
                }

            
            {
                this$1 = _cls3.this;
                super();
            }
            });
            binder.bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

                final _cls3 this$1;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.PassengerSetDropoffSearch());
                }

            
            {
                this$1 = _cls3.this;
                super();
            }
            });
            binder.bind(driverLocationSubject, onDriverLocationChanged);
            binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
        }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
    };
    private final Action1 onMenuItemClicked = new Action1() {

        final PassengerClassicRideInProgressView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            default:
                return;

            case 2131558433: 
                dialogFlow.show(new PassengerDialogs.PassengerRideOverflowMenuScreen());
                break;
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
    };
    final Action1 onRideUpdated = new Action1() {

        final PassengerClassicRideInProgressView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            driverSubject.onNext(passengerRideProvider.getPassengerRide().getDriver());
            passengersSubject.onNext(passengerRideProvider.getPassengerRide().getPassengers());
            driverLocationSubject.onNext(passengerRideProvider.getPassengerRide().getDriver().getLocation());
            isPickedup.onNext(passengerRideProvider.getPassengerRide().isPickedUp());
            isAccepted.onNext(passengerRideProvider.getPassengerRide().isAccepted());
            destinationChange.onNext(passengerRideProvider.getPassengerRide().getDropoff());
            pickupChange.onNext(passengerRideProvider.getPassengerRide().getPickup());
            isArrived.onNext(passengerRideProvider.getPassengerRide().isArrived());
            routeChangedSubject.onNext(passengerRideProvider.getPassengerRide().getStops());
            updateRideBannerText(passengerRideProvider.getPassengerRide());
            if (passengerRideProvider.getPassengerRide().shouldHideLocationMarker())
            {
                rideMap.hideLocation();
                return;
            } else
            {
                rideMap.displayLocation();
                return;
            }
        }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
    };
    PassengerActiveRideZoomingController passengerActiveRideZoomingController;
    PassengerRideAddressInput passengerRideAddressInput;
    HeightObservableLayout passengerRideBottom;
    IPassengerRideProvider passengerRideProvider;
    HeightObservableLayout passengerRideTop;
    private ReactiveProperty passengersSubject;
    private ReactiveProperty pickupChange;
    RideInProgressBottomView rideDetailsView;
    RideMap rideMap;
    TextView rideStatusTxt;
    private ReactiveProperty routeChangedSubject;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    private Action1 updatePickupMarkerAndLocation;

    public PassengerClassicRideInProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isAccepted = ReactiveProperty.create();
        isArrived = ReactiveProperty.create();
        isPickedup = ReactiveProperty.create();
        driverLocationSubject = ReactiveProperty.create(NullLocation.getInstance());
        destinationChange = ReactiveProperty.create().setEqualityComparator(new me.lyft.android.rx.ReactiveProperty.EqualityComparator() {

            final PassengerClassicRideInProgressView this$0;

            public volatile boolean equals(Object obj, Object obj1)
            {
                return equals((Location)obj, (Location)obj1);
            }

            public boolean equals(Location location, Location location1)
            {
                return location != null && location1 != null && SphericalUtils.latLngApproximateEquals(location, location1);
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        });
        driverSubject = ReactiveProperty.create().setEqualityComparator(new me.lyft.android.rx.ReactiveProperty.EqualityComparator() {

            final PassengerClassicRideInProgressView this$0;

            public volatile boolean equals(Object obj, Object obj1)
            {
                return equals((Driver)obj, (Driver)obj1);
            }

            public boolean equals(Driver driver, Driver driver1)
            {
                return driver != null && driver1 != null && Objects.equals(driver.getId(), driver1.getId());
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        });
        routeChangedSubject = ReactiveProperty.create();
        pickupChange = ReactiveProperty.create();
        passengersSubject = ReactiveProperty.create();
        onDestinationChange = new Action1() {

            final PassengerClassicRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                rideMap.showDestinationMarker(passengerRideProvider.getPassengerRide().getDropoff());
                if (location.isNull())
                {
                    passengerRideAddressInput.setDropoffAddress("");
                } else
                if (Strings.isNullOrEmpty(location.getDisplayName()))
                {
                    passengerRideAddressInput.setDropoffAddress(getResources().getString(0x7f070064));
                } else
                {
                    passengerRideAddressInput.setDropoffAddress(location.getDisplayName());
                }
                if (location.isNull())
                {
                    passengerRideAddressInput.focusAndStretchDropoffAddress();
                    return;
                } else
                {
                    passengerRideAddressInput.focusAndStretchPickupAddress();
                    return;
                }
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        };
        onDriverChange = new Action1() {

            final PassengerClassicRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Driver)obj);
            }

            public void call(Driver driver)
            {
                rideDetailsView.setDriver(passengerRideProvider.getPassengerRide().getDriver());
                driverNameTextView.setText(passengerRideProvider.getPassengerRide().getDriver().getName());
                driver = passengerRideProvider.getPassengerRide().getDriver().getRating();
                if (driver == null)
                {
                    driver = getResources().getString(0x7f07020c);
                } else
                {
                    driver = driver.toString();
                }
                driverRatingTextView.setText(driver);
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        };
        updatePickupMarkerAndLocation = new Action1() {

            final PassengerClassicRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                rideMap.showPickupMarker(passengerRideProvider.getPassengerRide().getPickup());
                if (Strings.isNullOrEmpty(location.getDisplayName()))
                {
                    passengerRideAddressInput.setPickupAddress(getResources().getString(0x7f07023e));
                    return;
                } else
                {
                    passengerRideAddressInput.setPickupAddress(location.getDisplayName());
                    return;
                }
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        };
        onDriverLocationChanged = new Action1() {

            final PassengerClassicRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                rideMap.refreshDriverMarker();
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void updateDriverETA()
    {
        PassengerRide passengerride = passengerRideProvider.getPassengerRide();
        binder.bind(geoService.getDriverEta(passengerride.getId(), passengerride.getDriver().getLocation(), new Location[] {
            passengerride.getPickup()
        }), new AsyncCall() {

            final PassengerClassicRideInProgressView this$0;

            public void onFail(Throwable throwable)
            {
                rideStatusTxt.setText(getResources().getString(0x7f070225));
            }

            public void onSuccess(Long long1)
            {
                rideStatusTxt.setText(Html.fromHtml(getResources().getString(0x7f070224, new Object[] {
                    long1
                })));
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Long)obj);
            }

            
            {
                this$0 = PassengerClassicRideInProgressView.this;
                super();
            }
        });
    }

    private void updateRideBannerText(PassengerRide passengerride)
    {
        if (passengerride.isAccepted().booleanValue())
        {
            updateDriverETA();
            return;
        }
        if (passengerride.isArrived().booleanValue())
        {
            rideStatusTxt.setText(0x7f070223);
            return;
        }
        if (passengerride.isPickedUp().booleanValue())
        {
            rideStatusTxt.setText(0x7f070239);
            return;
        } else
        {
            rideStatusTxt.setText(0x7f07023a);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            binder = Binder.attach(this);
            slideMenuController.enableMenu();
            toolbar.addItem(0x7f0d0021, 0x7f02018c);
            toolbar.showDivider();
            passengerRideAddressInput.setVisibility(0);
            centerToCurrentLocationButton.setVisibility(0);
            passengerRideAddressInput.showPickupAndDropoff();
            rideDetailsView.setPassengers(passengerRideProvider.getPassengerRide().getPassengers());
            binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        passengerActiveRideZoomingController.detach();
        slideMenuController.disableMenu();
        rideMap.disableTraffic();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.displayLocation();
        rideMap.reset();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }
















}
