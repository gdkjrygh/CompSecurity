// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideFare;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideAddressInput, RideInProgressBottomView, PassengerActiveRideZoomingController

public class PassengerCourierRideInProgressView extends RelativeLayout
{

    AppFlow appFlow;
    private Binder binder;
    MessageBus bus;
    ImageButton centerToCurrentLocationButton;
    final android.view.View.OnClickListener courierRideInfoDialogClickListener = new android.view.View.OnClickListener() {

        final PassengerCourierRideInProgressView this$0;

        public void onClick(View view)
        {
            dialogFlow.show(new PassengerDialogs.CourierRideTypeInfoDialog(rideFareRepository.getFare().getTotalMoney(), null, null));
        }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
    };
    DialogFlow dialogFlow;
    IGeoService geoService;
    private ReactiveProperty isAccepted;
    private ReactiveProperty isArrived;
    private ReactiveProperty isPickedup;
    ILocationService locationService;
    ILyftPreferences lyftPreferences;
    private final Action1 onMapLoaded = new Action1() {

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
            setupPickup();
            setupDestination();
            binder.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
            binder.bind(passengerListSubject, updatePassengers);
            binder.bind(passengerRideProvider.observeStopsChange(), onRouteChange);
            binder.bind(passengerRideAddressInput.observePickupClick(), new Action1() {

                final _cls1 this$1;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    dialogFlow.show(new PassengerDialogs.LockAddressDialog(true));
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
            binder.bind(passengerRideAddressInput.observeDropoffClick(), new Action1() {

                final _cls1 this$1;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    dialogFlow.show(new PassengerDialogs.LockAddressDialog(false));
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
            binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
        }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
    };
    private final Action1 onMenuItemClicked = new Action1() {

        final PassengerCourierRideInProgressView this$0;

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
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
    };
    final Action1 onRideUpdated = new Action1() {

        final PassengerCourierRideInProgressView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            passengerListSubject.onNext(passengerRideProvider.getPassengerRide().getPassengers());
            isPickedup.onNext(passengerRideProvider.getPassengerRide().isPickedUp());
            isAccepted.onNext(passengerRideProvider.getPassengerRide().isAccepted());
            isArrived.onNext(passengerRideProvider.getPassengerRide().isArrived());
            unit = getBannerText(passengerRideProvider.getPassengerRide().getCurrentStop().getPassenger());
            rideMap.refreshDriverMarker(unit, getResources().getColor(0x7f0c0071));
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
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
    };
    private Action1 onRouteChange;
    PassengerActiveRideZoomingController passengerActiveRideZoomingController;
    LinearLayout passengerCourierArrivedBannerView;
    LinearLayout passengerCourierDriverAcceptedBannerView;
    private ReactiveProperty passengerListSubject;
    PassengerRideAddressInput passengerRideAddressInput;
    HeightObservableLayout passengerRideBottom;
    IPassengerRideProvider passengerRideProvider;
    HeightObservableLayout passengerRideTop;
    TextView pickupEtaMessage;
    RideInProgressBottomView rideDetailsView;
    IRideFareRepository rideFareRepository;
    RideMap rideMap;
    SlideMenuController slideMenuController;
    Toolbar toolbar;
    private Action1 updatePassengers;

    public PassengerCourierRideInProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isAccepted = ReactiveProperty.create();
        isPickedup = ReactiveProperty.create();
        isArrived = ReactiveProperty.create();
        passengerListSubject = ReactiveProperty.create();
        updatePassengers = new Action1() {

            final PassengerCourierRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                updateDriverDetails();
                rideDetailsView.setPassengers(list);
            }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
        };
        onRouteChange = new Action1() {

            final PassengerCourierRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                rideMap.showCourierRouteMarkers(list);
            }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private String getBannerText(Passenger passenger)
    {
        if (passengerRideProvider.getPassengerRide().getCurrentStop().isPickup())
        {
            if (passenger.isSelf())
            {
                return getResources().getString(0x7f0700df);
            } else
            {
                return getResources().getString(0x7f0700de, new Object[] {
                    passenger.getFirstName()
                });
            }
        }
        if (passenger.isSelf())
        {
            return getResources().getString(0x7f0700cf);
        } else
        {
            return getResources().getString(0x7f0700ce, new Object[] {
                passenger.getFirstName()
            });
        }
    }

    private Observable getCachedDriverETAObservable()
    {
        PassengerRide passengerride = passengerRideProvider.getPassengerRide();
        if (!passengerride.isAccepted().booleanValue())
        {
            return Observable.empty();
        } else
        {
            return geoService.getDriverEta(passengerride.getId(), passengerride.getDriver().getLocation(), getPickupLocationsForCourier());
        }
    }

    private List getPickupLocationsForCourier()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = passengerRideProvider.getPassengerRide().getStops().iterator(); iterator.hasNext();)
        {
            Stop stop = (Stop)iterator.next();
            arraylist.add(stop.getLocation());
            if (stop.getPassenger().isSelf())
            {
                return arraylist;
            }
        }

        return Collections.singletonList(passengerRideProvider.getPassengerRide().getPickup());
    }

    private void setupDestination()
    {
        Location location = passengerRideProvider.getPassengerRide().getDropoff();
        if (Strings.isNullOrEmpty(location.getDisplayName()))
        {
            passengerRideAddressInput.setDropoffAddress(getResources().getString(0x7f070064));
            return;
        } else
        {
            passengerRideAddressInput.setDropoffAddress(location.getDisplayName());
            return;
        }
    }

    private void setupPickup()
    {
        Location location = passengerRideProvider.getPassengerRide().getPickup();
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

    private void updateDriverDetails()
    {
        Driver driver = passengerRideProvider.getPassengerRide().getDriver();
        rideDetailsView.setDriver(driver);
    }

    private void updateDriverEta()
    {
        binder.bind(getCachedDriverETAObservable(), new AsyncCall() {

            final PassengerCourierRideInProgressView this$0;

            public void onFail(Throwable throwable)
            {
                pickupEtaMessage.setText(0x7f0700d8);
                passengerCourierDriverAcceptedBannerView.setVisibility(0);
            }

            public void onSuccess(Long long1)
            {
                pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f0700d9, new Object[] {
                    long1
                })));
                passengerCourierDriverAcceptedBannerView.setVisibility(0);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Long)obj);
            }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
        });
    }

    private void updatePassengerEtd()
    {
        PassengerRide passengerride = passengerRideProvider.getPassengerRide();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = passengerride.getStops().iterator();
        Stop stop;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stop = (Stop)iterator.next();
            if (!stop.isCompleted())
            {
                arraylist.add(stop.getLocation());
            }
        } while (!stop.getPassenger().isSelf() || !stop.isDropOff());
        binder.bind(geoService.getPassengerEtd(passengerride.getId(), locationService.getLastCachedLocation(), arraylist), new AsyncCall() {

            final PassengerCourierRideInProgressView this$0;

            public void onFail(Throwable throwable)
            {
                passengerCourierDriverAcceptedBannerView.setVisibility(8);
            }

            public void onSuccess(Long long1)
            {
                if (long1.longValue() > 0L)
                {
                    pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f07030e, new Object[] {
                        long1
                    })));
                } else
                {
                    pickupEtaMessage.setText(Html.fromHtml(getResources().getString(0x7f07030f)));
                }
                passengerCourierDriverAcceptedBannerView.setVisibility(0);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Long)obj);
            }

            
            {
                this$0 = PassengerCourierRideInProgressView.this;
                super();
            }
        });
    }

    private void updateRideBannerText(PassengerRide passengerride)
    {
        if (passengerride.isArrived().booleanValue())
        {
            passengerCourierArrivedBannerView.setVisibility(0);
            passengerCourierDriverAcceptedBannerView.setVisibility(8);
        } else
        {
            passengerCourierArrivedBannerView.setVisibility(8);
            if (passengerride.isAccepted().booleanValue())
            {
                updateDriverEta();
                return;
            }
            if (passengerride.isPickedUp().booleanValue())
            {
                updatePassengerEtd();
                return;
            }
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
            passengerRideAddressInput.showPickupAndDropoff();
            passengerCourierDriverAcceptedBannerView.setOnClickListener(courierRideInfoDialogClickListener);
            showEnrouteDialogIfNeeded();
            binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        passengerActiveRideZoomingController.detach();
        slideMenuController.disableMenu();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.disableTraffic();
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

    public void showEnrouteDialogIfNeeded()
    {
        if (!lyftPreferences.isCourierEnrouteDialogShown())
        {
            lyftPreferences.setCourierEnrouteDialogShown(true);
            dialogFlow.show(new PassengerDialogs.BeReadyOutsideDialog());
        }
    }













}
