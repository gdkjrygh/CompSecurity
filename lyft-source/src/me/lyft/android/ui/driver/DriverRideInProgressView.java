// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.RideFlags;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.application.ride.IDriverRouteService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.flows.ProfileFlow;
import me.lyft.android.infrastructure.foreground.IAppForegroundDetector;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.UserImageView;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import me.lyft.android.utils.GoogleMapsUrlBuilder;
import me.lyft.android.utils.Navigator;
import me.lyft.android.utils.Telephony;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.functions.Func0;
import rx.functions.Func1;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverActionsCallback, DriverFollowLocationAndStopButton

public class DriverRideInProgressView extends FrameLayout
{

    private static final int DEFAULT_ZOOM_LEVEL = 16;
    ImageView addressIcon;
    private final android.view.View.OnClickListener addressInformationClickListener = new android.view.View.OnClickListener() {

        final DriverRideInProgressView this$0;

        public void onClick(View view)
        {
            dialogFlow.show(new DriverDialogs.NavigationDialog());
        }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
    };
    TextView addressTextView;
    View addressView;
    AppFlow appFlow;
    IAppForegroundDetector appForegroundDetector;
    private Binder binder;
    View bottomButtonContainer;
    MessageBus bus;
    IConstantsProvider constantsProvider;
    private Passenger currentPassenger;
    private Stop currentStop;
    private ReactiveProperty currentStopChangeSubject;
    private ReactiveProperty destinationSubject;
    DialogFlow dialogFlow;
    private DriverRide driverRide;
    HeightObservableLayout driverRideBottom;
    TextView driverRideButtonTextView;
    HeightObservableLayout driverRideTop;
    IDriverRouteService driverRouteService;
    TextView etaTextView;
    DriverFollowLocationAndStopButton followCurrentLocationButton;
    IGeoService geoService;
    View hotspotIndicatorView;
    ImageLoader imageLoader;
    private ReactiveProperty inGeoFenceChange;
    private ReactiveProperty incompleteStopsSubject;
    private ReactiveProperty isAccepted;
    private ReactiveProperty isAcceptedInsideGeoFence;
    private ReactiveProperty isAcceptedOutsideGeoFence;
    private ReactiveProperty isCourier;
    private Observable isDestinationNullObservable;
    private ReactiveProperty isPassengerDropoff;
    private ReactiveProperty isPickupMapStateChange;
    ILocationService locationService;
    ILyftPreferences lyftPreferences;
    private Subscription mapTransitionSubscription;
    View navigateButton;
    Navigator navigator;
    private Action1 onAddressEditableChanged;
    private Action1 onCallPassengerDialogResult;
    private Action1 onGeofenceChanged;
    private Action1 onLocationIssueDialogResult;
    private Action1 onMapDragStart;
    private Action1 onMapLoaded;
    private Action1 onMenuItemClicked;
    private Action1 onRideArrivalConfirmationResult;
    private Action1 onRideDropoffConfirmationResult;
    private Action1 onRideStatusChanged;
    private Action1 onRouteUpdated;
    private final android.view.View.OnClickListener openPlacesSearchClickListener = new android.view.View.OnClickListener() {

        final DriverRideInProgressView this$0;

        public void onClick(View view)
        {
            openPlacesSearchView();
        }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
    };
    UserImageView passengerPhotoImageView;
    ProfileFlow profileFlow;
    IProgressController progressController;
    private ReactiveProperty rideIdChange;
    RideMap rideMap;
    View rideOverviewMapButton;
    private ReactiveProperty rideStatusChange;
    IDriverRideProvider routeProvider;
    View tapToEditView;
    Telephony telephony;
    Toolbar toolbar;
    TooltipContainerView tooltipContainer;
    private ReactiveProperty userImageChangeSubject;
    IViewErrorHandler viewErrorHandler;

    public DriverRideInProgressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        inGeoFenceChange = ReactiveProperty.create();
        rideStatusChange = ReactiveProperty.create();
        destinationSubject = ReactiveProperty.create();
        rideIdChange = ReactiveProperty.create();
        isPickupMapStateChange = ReactiveProperty.create();
        isAcceptedInsideGeoFence = ReactiveProperty.create();
        isAcceptedOutsideGeoFence = ReactiveProperty.create();
        isAccepted = ReactiveProperty.create();
        isPassengerDropoff = ReactiveProperty.create();
        isCourier = ReactiveProperty.create();
        isDestinationNullObservable = destinationSubject.map(new Func1() {

            final DriverRideInProgressView this$0;

            public Boolean call(Location location)
            {
                return Boolean.valueOf(location.isNull());
            }

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        });
        incompleteStopsSubject = ReactiveProperty.create();
        userImageChangeSubject = ReactiveProperty.create();
        currentStopChangeSubject = ReactiveProperty.create();
        mapTransitionSubscription = Subscriptions.empty();
        onMapLoaded = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                rideMap.clearRoutes();
                rideMap.bindPadding(driverRideTop, driverRideBottom);
                binder.bind(routeProvider.observeRide(), onRouteUpdated);
                binder.bind(ReactiveUI.and(new Observable[] {
                    ReactiveUI.not(isCourier), isPassengerDropoff, ReactiveUI.not(isDestinationNullObservable)
                }), new VisibilityBinding(tapToEditView));
                binder.bind(ReactiveUI.and(new Observable[] {
                    ReactiveUI.not(isCourier), isPassengerDropoff
                }), onAddressEditableChanged);
                binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
                binder.bind(inGeoFenceChange, onGeofenceChanged);
                binder.bind(rideMap.observeMapDragStart(), onMapDragStart);
                binder.bind(bus.observe(me/lyft/android/ui/driver/DriverRideInProgressView$DriverLocationIssueDialogResultEvent), onLocationIssueDialogResult);
                binder.bind(bus.observe(me/lyft/android/ui/driver/DriverRideInProgressView$DriverCallPassengerDialogResultEvent), onCallPassengerDialogResult);
                binder.bind(bus.observe(me/lyft/android/ui/driver/RideArrivalConfirmationDialogView$RideArrivalConfirmationResultEvent), onRideArrivalConfirmationResult);
                binder.bind(bus.observe(me/lyft/android/ui/driver/RideDropoffConfirmationDialogView$RideDropoffConfirmationResultEvent), onRideDropoffConfirmationResult);
                binder.bind(isCourier, new VisibilityBinding(rideOverviewMapButton));
                binder.bind(rideIdChange, new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((String)obj);
                    }

                    public void call(String s)
                    {
                        displayPassengerNameAndRating();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(currentStopChangeSubject, new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Stop)obj);
                    }

                    public void call(Stop stop)
                    {
                        if (stop.isPickup())
                        {
                            displayPickupAddress(currentStop);
                            displayPickupNavigation(currentStop);
                        } else
                        if (stop.isDropOff())
                        {
                            displayDropoffAddress(currentStop);
                            displayDropoffNavigation(currentStop);
                            return;
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(ReactiveUI.any(currentStopChangeSubject, ReactiveUI.isTrue(appForegroundDetector.observeAppForegrounded())), new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        if (currentStop.isPickup())
                        {
                            transitionMapToPassengerPickup(currentStop);
                            return;
                        } else
                        {
                            transitionMapToPassengerDropoff(currentStop);
                            return;
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(rideStatusChange, onRideStatusChanged);
                binder.bind(ReactiveUI.isTrue(isAccepted), new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        ScreenAnalytics.trackScreenView("driver_ride_accepted");
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(ReactiveUI.isTrue(isPassengerDropoff), new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        ScreenAnalytics.trackScreenView("driver_dropoff");
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(updateRoutesObservable(), new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((Unit)obj);
                    }

                    public void call(Unit unit)
                    {
                        if (currentStop.isPickup())
                        {
                            transitionMapToPassengerPickup(currentStop);
                            return;
                        } else
                        {
                            transitionMapToPassengerDropoff(currentStop);
                            return;
                        }
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                binder.bind(userImageChangeSubject, new Action1() {

                    final _cls5 this$1;

                    public volatile void call(Object obj)
                    {
                        call((String)obj);
                    }

                    public void call(String s)
                    {
                        passengerPhotoImageView.loadPhoto(s);
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onRouteUpdated = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((DriverRide)obj);
            }

            public void call(DriverRide driverride)
            {
                boolean flag1 = true;
                driverRide = driverride;
                currentStop = driverride.getCurrentStop();
                currentPassenger = driverride.getCurrentPassenger();
                isPickupMapStateChange.onNext((new Func0() {

                    final _cls7 this$1;

                    public Boolean call()
                    {
                        return Boolean.valueOf(currentStop.isPickup());
                    }

                    public volatile Object call()
                    {
                        return call();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }).call());
                inGeoFenceChange.onNext(Boolean.valueOf(currentStop.isInGeofence()));
                rideStatusChange.onNext(driverride.getStatus().toString());
                if (currentStop.isDropOff())
                {
                    destinationSubject.onNext(currentStop.getLocation());
                }
                rideIdChange.onNext(currentStop.getRideId());
                ReactiveProperty reactiveproperty = isAcceptedInsideGeoFence;
                boolean flag;
                if (driverride.isAccepted() && currentStop.isInGeofence())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                reactiveproperty.onNext(Boolean.valueOf(flag));
                reactiveproperty = isAcceptedOutsideGeoFence;
                if (driverride.isAccepted() && !currentStop.isInGeofence())
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                reactiveproperty.onNext(Boolean.valueOf(flag));
                isAccepted.onNext(Boolean.valueOf(driverride.isAccepted()));
                isCourier.onNext(Boolean.valueOf(driverride.isCourier()));
                isPassengerDropoff.onNext(Boolean.valueOf(currentStop.isDropOff()));
                incompleteStopsSubject.onNext(driverride.getIncompleteStops());
                userImageChangeSubject.onNext(currentPassenger.getPhotoUrl());
                currentStopChangeSubject.onNext(currentStop);
                updateEta();
                updateFollowLocationButton();
                updateToolbarLogo();
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onMenuItemClicked = new Action1() {

            final DriverRideInProgressView this$0;

            public void call(Integer integer)
            {
                switch (integer.intValue())
                {
                default:
                    return;

                case 2131558433: 
                    dialogFlow.show(new DriverDialogs.DriverOverflowMenuScreen());
                    break;
                }
            }

            public volatile void call(Object obj)
            {
                call((Integer)obj);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onAddressEditableChanged = new Action1() {

            final DriverRideInProgressView this$0;

            public void call(Boolean boolean1)
            {
                View view = addressView;
                if (boolean1.booleanValue())
                {
                    boolean1 = openPlacesSearchClickListener;
                } else
                {
                    boolean1 = addressInformationClickListener;
                }
                view.setOnClickListener(boolean1);
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onMapDragStart = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                followCurrentLocationButton.unfollow();
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onRideStatusChanged = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((String)obj);
            }

            public void call(String s)
            {
                resolveButtonColor();
                resolveButtonText();
                showTooltips();
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onGeofenceChanged = new Action1() {

            final DriverRideInProgressView this$0;

            public void call(Boolean boolean1)
            {
                showTooltips();
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onCallPassengerDialogResult = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d000b)
                {
                    telephony.callPhone(currentPassenger.getPhoneNumber());
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onRideArrivalConfirmationResult = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                startRide(null);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onRideDropoffConfirmationResult = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                endRide();
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        onLocationIssueDialogResult = new Action1() {

            final DriverRideInProgressView this$0;

            public volatile void call(Object obj)
            {
                call((DialogResult)obj);
            }

            public void call(DialogResult dialogresult)
            {
                if (dialogresult.getButtonId() == 0x7f0d0009 || dialogresult.isCancelled()) goto _L2; else goto _L1
_L1:
                Object obj = null;
                dialogresult.getButtonId();
                JVM INSTR tableswitch 2131558426 2131558428: default 48
            //                           2131558426 65
            //                           2131558427 71
            //                           2131558428 59;
                   goto _L3 _L4 _L5 _L6
_L3:
                dialogresult = obj;
_L8:
                startRide(dialogresult);
_L2:
                return;
_L6:
                dialogresult = "wrongAddressShown";
                continue; /* Loop/switch isn't completed */
_L4:
                dialogresult = "passengerInCar";
                continue; /* Loop/switch isn't completed */
_L5:
                dialogresult = "other";
                if (true) goto _L8; else goto _L7
_L7:
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void displayDropoffNavigation(Stop stop)
    {
        if (lyftPreferences.getRideFlags().isDropoffMessageShown() || !stop.isDropOff())
        {
            return;
        }
        setDropoffMessageShown();
        if (!driverRide.isCourier() || !lyftPreferences.isAutoNavigationEnabled())
        {
            dialogFlow.queue(new DriverDialogs.NavigationDialog());
            return;
        } else
        {
            tryAutoNavigate(stop.getLocation());
            return;
        }
    }

    private void displayPickupNavigation(Stop stop)
    {
        if (lyftPreferences.getRideFlags().isPickupMessageShown() || !stop.isPickup() || stop.isInGeofence())
        {
            return;
        }
        setPickupMessageShown();
        if (!lyftPreferences.isAutoNavigationEnabled())
        {
            dialogFlow.queue(new DriverDialogs.NavigationDialog());
            return;
        } else
        {
            tryAutoNavigate(stop.getLocation());
            return;
        }
    }

    private void displayRoute(Location location, int i, int j)
    {
        if (driverRide.isCourier())
        {
            rideMap.showDriverDirections(location, i, j);
            return;
        } else
        {
            rideMap.showDriverDirections(location, currentStop.getLocation(), i);
            return;
        }
    }

    private boolean isFirstStop()
    {
        return driverRide.getStopsFromCurrentRoute().indexOf(currentStop) == 0;
    }

    private void openPlacesSearchView()
    {
        appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.DriverSetDropoffSearch(false));
    }

    private void preloadNavigationMaps()
    {
        if (!lyftPreferences.isAutoNavigationEnabled())
        {
            for (Iterator iterator = routeProvider.getDriverRide().getStopsFromCurrentRoute().iterator(); iterator.hasNext(); preloadStaticMap(((Stop)iterator.next()).getLocation())) { }
        }
    }

    private void preloadStaticMap(Location location)
    {
        location = (new GoogleMapsUrlBuilder()).setCenter(location.toQueryString()).setSize(640, 640).setZoom(14).build();
        imageLoader.load(location).fetch();
    }

    private void resolveButtonColor()
    {
        int i;
        if (currentStop.isPickup())
        {
            if (driverRide.isCourier())
            {
                i = 0x7f02005a;
            } else
            if (driverRide.isPlus())
            {
                i = 0x7f02004d;
            } else
            {
                i = 0x7f020050;
            }
        } else
        {
            i = 0x7f020057;
        }
        driverRideButtonTextView.setBackgroundDrawable(getResources().getDrawable(i));
    }

    private void resolveButtonText()
    {
        String s;
        int i;
        i = 0x7f070145;
        s = currentPassenger.getFirstName();
        if (!driverRide.isCourier()) goto _L2; else goto _L1
_L1:
        if (!driverRide.isAccepted())
        {
            if (currentStop.isArrived())
            {
                i = 0x7f070146;
            } else
            {
                i = 0x7f070148;
            }
        }
_L4:
        driverRideButtonTextView.setText(getResources().getString(i, new Object[] {
            s
        }));
        return;
_L2:
        if (!driverRide.isAccepted())
        {
            i = 0x7f070148;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setDropoffMessageShown()
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        rideflags.setDropoffMessageShown(true);
        lyftPreferences.setRideFlags(rideflags);
    }

    private void setPickupMessageShown()
    {
        RideFlags rideflags = lyftPreferences.getRideFlags();
        rideflags.setPickupMessageShown(true);
        lyftPreferences.setRideFlags(rideflags);
    }

    private void showTooltips()
    {
        if (driverRide.showHints())
        {
            tooltipContainer.hideAll();
            if (driverRide.isAccepted())
            {
                if (currentStop.isInGeofence())
                {
                    tooltipContainer.tryToShowAndMarkShown("arrive_button", bottomButtonContainer, 48);
                } else
                {
                    tooltipContainer.tryToShowAndMarkShown("pickup_navigate_button", navigateButton, 80);
                }
            }
            if (currentStop.isDropOff())
            {
                tooltipContainer.tryToShowAndMarkShown("dropoff_button", bottomButtonContainer, 48);
                return;
            }
        }
    }

    private void startRide(String s)
    {
        progressController.disableUI();
        if (driverRide.isCourier())
        {
            if (isFirstStop() && lyftPreferences.decrementCourierDriverOnboardView().intValue() > 0)
            {
                dialogFlow.show(new DriverDialogs.CourierDriverInfoDialog());
            } else
            {
                dialogFlow.show(new Toast(getResources().getString(0x7f07013f)));
            }
        }
        ScreenAnalytics.trackScreenView("driver_arrived");
        binder.bind(driverRouteService.arrive(currentStop, s), new DriverActionsCallback(progressController, viewErrorHandler));
    }

    private void transitionMapToPassengerDropoff(final Stop stop)
    {
        mapTransitionSubscription.unsubscribe();
        if (!driverRide.isCourier())
        {
            rideMap.showPickupMarker(routeProvider.getDriverRide().findPickupStopForPassenger(currentPassenger.getId()).getLocation());
            rideMap.showDestinationMarker(routeProvider.getDriverRide().findDropoffStopForPassenger(currentPassenger.getId()).getLocation());
        }
        rideMap.clearRoutes();
        mapTransitionSubscription = binder.bind(locationService.getLastLocation(), new AsyncCall() {

            final DriverRideInProgressView this$0;
            final Stop val$stop;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                Location location1 = stop.getLocation();
                if (!location1.isNull())
                {
                    displayRoute(location, getResources().getColor(0x7f0c007e), getResources().getColor(0x7f0c0070));
                    TextView textview = addressTextView;
                    Object obj;
                    if (Strings.isNullOrEmpty(location1.getDisplayName()))
                    {
                        obj = getResources().getString(0x7f070064);
                    } else
                    {
                        obj = location1.getDisplayName();
                    }
                    textview.setText(((CharSequence) (obj)));
                } else
                {
                    addressTextView.setText(Html.fromHtml(getResources().getString(0x7f0702ac)));
                    rideMap.clearRoutes();
                }
                if (!location1.isNull())
                {
                    if (!driverRide.isCourier())
                    {
                        obj = Iterables.select(driverRide.getStopsFromCurrentRoute(), Stop.toLocation());
                        ((List) (obj)).add(0, location);
                        rideMap.fitMapTo(((List) (obj)));
                        return;
                    } else
                    {
                        rideMap.fitMapTo(new Location[] {
                            location, stop.getLocation()
                        });
                        return;
                    }
                } else
                {
                    rideMap.centerToCurrentLocation(16F);
                    return;
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                stop = stop1;
                super();
            }
        });
    }

    private void transitionMapToPassengerPickup(final Stop stop)
    {
        mapTransitionSubscription.unsubscribe();
        rideMap.clearPickupMarker();
        rideMap.clearDestinationMarker();
        rideMap.clearRoutes();
        if (!driverRide.isCourier())
        {
            rideMap.showPickupMarker(routeProvider.getDriverRide().findPickupStopForPassenger(currentPassenger.getId()).getLocation());
        }
        mapTransitionSubscription = binder.bind(locationService.getLastLocation(), new AsyncCall() {

            final DriverRideInProgressView this$0;
            final Stop val$stop;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                displayRoute(location, getResources().getColor(0x7f0c000b), getResources().getColor(0x7f0c0070));
                rideMap.fitMapTo(new Location[] {
                    location, stop.getLocation()
                });
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                stop = stop1;
                super();
            }
        });
    }

    private void tryAutoNavigate(final Location location)
    {
        binder.bind(locationService.getLastLocation(), new AsyncCall() {

            final DriverRideInProgressView this$0;
            final Location val$location;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Location)obj);
            }

            public void onSuccess(Location location1)
            {
                super.onSuccess(location1);
                Long long1 = constantsProvider.getConstants().getAutoNavigateDistanceThreshold();
                boolean flag;
                if (location.distanceTo(location1) > (double)long1.longValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    dialogFlow.queue(new DriverDialogs.AutoNavigationToast());
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                location = location1;
                super();
            }
        });
    }

    private void updateEta()
    {
        final Location stopLocation = routeProvider.getDriverRide().getCurrentStop().getLocation();
        if (!stopLocation.isNull())
        {
            binder.bind(locationService.getLastLocation().flatMap(new Func1() {

                final DriverRideInProgressView this$0;
                final Location val$stopLocation;

                public volatile Object call(Object obj)
                {
                    return call((Location)obj);
                }

                public Observable call(Location location)
                {
                    return geoService.getDriverEta(routeProvider.getDriverRide().getCurrentRideId(), location, new Location[] {
                        stopLocation
                    });
                }

            
            {
                this$0 = DriverRideInProgressView.this;
                stopLocation = location;
                super();
            }
            }), new AsyncCall() {

                final DriverRideInProgressView this$0;

                public void onFail(Throwable throwable)
                {
                    etaTextView.setText(0x7f070207);
                }

                public void onSuccess(Long long1)
                {
                    if (long1.longValue() > 0L)
                    {
                        long1 = getResources().getString(0x7f070149, new Object[] {
                            long1
                        });
                    } else
                    {
                        long1 = getResources().getString(0x7f070207);
                    }
                    etaTextView.setText(long1);
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Long)obj);
                }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
            });
            return;
        } else
        {
            etaTextView.setText(0x7f070207);
            return;
        }
    }

    private void updateFollowLocationButton()
    {
        boolean flag = true;
        if (!driverRide.isCourier() || driverRide.getIncompleteStops().size() <= 1)
        {
            flag = false;
        }
        followCurrentLocationButton.setZoomOutEnabled(flag);
    }

    private Observable updateRoutesObservable()
    {
        return Observable.combineLatest(appForegroundDetector.observeAppForegrounded().filter(new Func1() {

            final DriverRideInProgressView this$0;

            public Boolean call(Boolean boolean1)
            {
                return boolean1;
            }

            public volatile Object call(Object obj)
            {
                return call((Boolean)obj);
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        }), incompleteStopsSubject, Unit.func2());
    }

    private void updateToolbarLogo()
    {
        if (driverRide.isCourier())
        {
            toolbar.setLogo(0x7f020101);
            return;
        }
        if (driverRide.isPlus())
        {
            toolbar.setLogo(0x7f020109);
            return;
        } else
        {
            toolbar.setLogo(0x7f020107);
            return;
        }
    }

    void displayDropoffAddress(Stop stop)
    {
        hotspotIndicatorView.setVisibility(8);
        if (!stop.getLocation().isNull()) goto _L2; else goto _L1
_L1:
        addressTextView.setText(Html.fromHtml(getResources().getString(0x7f0702ac)));
_L4:
        addressIcon.setImageDrawable(getResources().getDrawable(0x7f020149));
        return;
_L2:
        if (Strings.isNullOrEmpty(stop.getLocation().getDisplayName()))
        {
            addressTextView.setText(0x7f070064);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void displayPassengerNameAndRating()
    {
        userImageChangeSubject.onNext(currentPassenger.getPhotoUrl());
        passengerPhotoImageView.setUserPartySize(Integer.valueOf(currentPassenger.getPartySize()));
        resolveButtonColor();
        resolveButtonText();
    }

    void displayPickupAddress(Stop stop)
    {
        String s = stop.getLocation().getDisplayName();
        Object obj = hotspotIndicatorView;
        int i;
        if (stop.isInHotspot())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        addressTextView.setBackgroundDrawable(null);
        obj = addressTextView;
        if (Strings.isNullOrEmpty(s))
        {
            s = getResources().getString(0x7f070064);
        }
        ((TextView) (obj)).setText(s);
        addressIcon.setImageDrawable(getResources().getDrawable(0x7f02014a));
        addressTextView.setHint("");
        binder.bind(geoService.reverseGeocode(stop.getLocation()), new AsyncCall() {

            final DriverRideInProgressView this$0;

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((Location)obj1);
            }

            public void onSuccess(Location location)
            {
                super.onSuccess(location);
                if (!Strings.isNullOrEmpty(location.getDisplayName()))
                {
                    addressTextView.setText(location.getDisplayName());
                    return;
                } else
                {
                    addressTextView.setText(0x7f070064);
                    return;
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        });
    }

    public void endRide()
    {
        progressController.disableUI();
        binder.bind(driverRouteService.dropoff(currentPassenger), new DriverActionsCallback(progressController, viewErrorHandler));
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        driverRide = routeProvider.getDriverRide();
        currentStop = driverRide.getCurrentStop();
        currentPassenger = driverRide.getCurrentPassenger();
        toolbar.hideHomeIcon().addItem(0x7f0d0021, 0x7f02018c).showItem(0x7f0d0021);
        if (driverRide.isTrainingRide() || !Features.LAST_RIDE.isEnabled())
        {
            toolbar.hideDriverModeToggle();
        } else
        {
            toolbar.showDriverModeToggle();
        }
        passengerPhotoImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideInProgressView this$0;

            public void onClick(View view)
            {
                profileFlow.openPassengerRideProfile(currentPassenger.getId());
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        });
        driverRideButtonTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideInProgressView this$0;

            public void onClick(View view)
            {
                if (currentStop.isDropOff())
                {
                    if (driverRide.showEndRideConfirmation())
                    {
                        dialogFlow.show(new DriverDialogs.DriverEndRideConfirmationDialog());
                        return;
                    } else
                    {
                        dialogFlow.show(new DriverDialogs.RideDropoffConfirmationDialog());
                        return;
                    }
                }
                if (currentStop.isInGeofence())
                {
                    dialogFlow.show(new DriverDialogs.RideArrivalConfirmationDialog());
                    return;
                } else
                {
                    showTapToArriveConfirmation();
                    return;
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        });
        navigateButton.setOnClickListener(new android.view.View.OnClickListener() {

            final DriverRideInProgressView this$0;

            public void onClick(View view)
            {
                view = currentStop.getLocation();
                if (view.isNull())
                {
                    openPlacesSearchView();
                    return;
                }
                if (driverRide.isTrainingRide())
                {
                    dialogFlow.queue(new DriverDialogs.TrainingRideNavigationDialog());
                    return;
                } else
                {
                    navigator.navigate(view);
                    return;
                }
            }

            
            {
                this$0 = DriverRideInProgressView.this;
                super();
            }
        });
        preloadNavigationMaps();
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        rideMap.clearAllMarkers();
        rideMap.clearRoutes();
        rideMap.reset();
        followCurrentLocationButton.unfollow();
        if (driverRide.isAccepted())
        {
            setPickupMessageShown();
        } else
        if (currentStop.isDropOff())
        {
            setDropoffMessageShown();
            return;
        }
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

    public void showTapToArriveConfirmation()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = new me.lyft.android.ui.Dialogs.AlertDialog("tap_to_arrive_confirmation_dialog");
        alertdialog.setTitle(getResources().getString(0x7f070124)).setTitleColorResource(0x7f0c00b7).setMessage(getResources().getString(0x7f070123)).setMessageFontSize(getResources().getDimension(0x7f08001a)).setDialogEventClass(me/lyft/android/ui/driver/DriverRideInProgressView$DriverLocationIssueDialogResultEvent).setButtonsOrientation(Integer.valueOf(1));
        int i;
        if (driverRide.isCourier())
        {
            i = 0x7f030057;
        } else
        {
            i = 0x7f030058;
        }
        alertdialog.addButton(0x7f0d001a, getResources().getString(0x7f070121), i).addButton(0x7f0d001c, getResources().getString(0x7f070126), i).addButton(0x7f0d001b, getResources().getString(0x7f070125), i);
        alertdialog.addNegativeButton(getResources().getString(0x7f070087));
        dialogFlow.show(alertdialog);
    }



/*
    static Passenger access$002(DriverRideInProgressView driverrideinprogressview, Passenger passenger)
    {
        driverrideinprogressview.currentPassenger = passenger;
        return passenger;
    }

*/




/*
    static Stop access$102(DriverRideInProgressView driverrideinprogressview, Stop stop)
    {
        driverrideinprogressview.currentStop = stop;
        return stop;
    }

*/













/*
    static DriverRide access$202(DriverRideInProgressView driverrideinprogressview, DriverRide driverride)
    {
        driverrideinprogressview.driverRide = driverride;
        return driverride;
    }

*/






























}
