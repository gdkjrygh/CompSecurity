// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.leanplum.Var;
import com.lyft.scoop.IHandleBack;
import com.lyft.scoop.Scoop;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.IUserSession;
import me.lyft.android.analytics.ScreenAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IEtaAnalyticService;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.BillingAddressRequiredException;
import me.lyft.android.application.ride.DynamicPricingNotConfirmedException;
import me.lyft.android.application.ride.HasDebtException;
import me.lyft.android.application.ride.IHotspotRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.ride.NoChargeAccountException;
import me.lyft.android.application.ride.NoValidChargeAccountException;
import me.lyft.android.application.ride.NoValidPhoneException;
import me.lyft.android.application.ride.PartySizeNotSetException;
import me.lyft.android.application.ride.PickupLocationMissingException;
import me.lyft.android.application.ride.PickupNotConfirmedException;
import me.lyft.android.application.ride.RouteInvalidException;
import me.lyft.android.application.ride.TermsNotAcceptedException;
import me.lyft.android.application.splitfare.ISplitFareStateRepository;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.RideSwitcherItem;
import me.lyft.android.controls.RideTypeSwitcher;
import me.lyft.android.controls.SwitcherSelection;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.PassengerRideRequest;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.ride.RideType;
import me.lyft.android.domain.system.LyftSystem;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.events.AppStateUpdatedEvent;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.InviteSurfacingDTO;
import me.lyft.android.infrastructure.lyft.constants.Popup;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.infrastructure.lyft.constants.Selector;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.rx.VisibilityBinding;
import me.lyft.android.ui.HeightObservableLayout;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.dialogs.DialogResult;
import me.lyft.android.ui.landing.LandingFlow;
import me.lyft.android.ui.ride.RideMap;
import me.lyft.android.ui.tooltips.TooltipContainerView;
import me.lyft.android.utils.DrawableUtils;
import me.lyft.android.utils.PlayStore;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.subscriptions.Subscriptions;

// Referenced classes of package me.lyft.android.ui.passenger:
//            RequestRideButton, PassengerRideAddressInput, PaymentWidgetContainerView

public class PassengerRequestRideView extends RelativeLayout
    implements IHandleBack
{

    private static final float DROPOFF_TO_PICKUP_DISTANCE_THRESHOLD = 150F;
    private static final int MIN_PICKUP_DROPOFF_DIFFERENCE = 30;
    private static final int PICKUP_TIMER_INTERVAL_MINUTES = 1;
    private static final SimpleDateFormat pickupTimeFormat;
    private static Var requestRideButtonText = Var.define("paxRequestRideButton", "Request Lyft");
    AppFlow appFlow;
    IAppboyService appboyService;
    private Binder binder;
    MessageBus bus;
    IChargeAccountsProvider chargeAccountsProvider;
    private final Action1 clearCourierRidePrice = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Subscription closestDriverETARequest;
    IConstantsProvider constantsProvider;
    IDefaultErrorHandler defaultErrorHandler;
    DialogFlow dialogFlow;
    private final ReactiveProperty dropoffAddressSubject = ReactiveProperty.create();
    private Subscription dropoffGeocodingSubscription;
    IEtaAnalyticService etaAnalyticService;
    IGeoService geoService;
    IHotspotRepository hotspotRepository;
    InAppNotificationService inAppNotificationService;
    LandingFlow landingFlow;
    ImageView locationPin;
    ILocationService locationService;
    ILocationSettingsService locationSettingsService;
    ILocationUpdateService locationUpdateService;
    ILyftSystemRepository lyftSystemRepository;
    private final ReactiveProperty mapDraggingSubject = ReactiveProperty.create(Boolean.valueOf(false));
    private final Action1 onAddressInputClick = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            openPlaceSearch();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onAppStateUpdated = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((AppStateDTO)obj);
        }

        public void call(AppStateDTO appstatedto)
        {
            checkForSplitFareInvite();
            refreshNearbyDriversMarkersAndETA();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onConfirmRequestStepSelected = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            ScreenAnalytics.trackScreenView("passenger_line_request_ride");
            passengerRideAddressInput.unfocusStretchEqually();
            requestRideButton.switchToRequestRide();
            unit = rideRequestSession.getPickupLocation();
            Location location = rideRequestSession.getDropoffLocation();
            rideMap.showPickupMarker(unit);
            rideMap.showDestinationMarker(location);
            rideMap.fitMapTo(new Location[] {
                unit, location
            });
            hidePin();
            rideMap.clearHotspotMarkers();
            rideMap.clearShortcutMarkers();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onCurrentRideTypeChanged;
    private final Action1 onDropoffAddressChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            passengerRideAddressInput.setDropoffAddress(s);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onDropoffLocationChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            geocodeAddressIfNeeded(location, dropoffAddressSubject, dropoffGeocodingSubscription);
            if (isDropoffStep())
            {
                rideMap.centerToLocationWithoutPadding(location);
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onDroppoffFocused = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(View view)
        {
            switchToDropoffStep();
        }

        public volatile void call(Object obj)
        {
            call((View)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onDroppoffStepSelected = new Action1() {

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
            hidePin();
            unit = rideRequestSession.getDropoffLocation();
            if (unit.isNull())
            {
                rideMap.fitMapToShortcuts(rideRequestSession.getPickupLocation());
                showDropoffPin();
                rideMap.clearDestinationMarker();
            } else
            {
                binder.bind(rideMap.centerToLocationWithoutPadding(unit).filter(new Func1() {

                    final _cls44 this$1;

                    public Boolean call(Unit unit)
                    {
                        boolean flag;
                        if (rideRequestSession.getCurrentRideType().isCourier() && isDropoffStep())
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
                this$1 = _cls44.this;
                super();
            }
                }).doOnUnsubscribe(new Action0() {

                    final _cls44 this$1;

                    public void call()
                    {
                        rideMap.clearDestinationMarker();
                    }

            
            {
                this$1 = _cls44.this;
                super();
            }
                }), new AsyncCall() {

                    final _cls44 this$1;

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((Unit)obj);
                    }

                    public void onSuccess(Unit unit)
                    {
                        super.onSuccess(unit);
                        showDropoffPin();
                    }

            
            {
                this$1 = _cls44.this;
                super();
            }
                });
            }
            rideMap.showShortcuts();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onHotspotClick = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            if (isPickupStep())
            {
                rideRequestSession.setPickupLocation(location);
                switchToDropoffStep();
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onHotspotLocationsChange = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            rideMap.showHotspotMarkers(rideRequestSession.getPickupLocation(), list);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onMapDragEnded;
    private final Action1 onMapDragStarted = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            mapDraggingSubject.onNext(Boolean.valueOf(true));
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onMapLoaded = new Action1() {

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
            binder.bind(bus.observe(me/lyft/android/events/AppStateUpdatedEvent), onAppStateUpdated);
            binder.bind(rideRequestSession.observePickupLocationChange(), onPickupLocationChanged);
            binder.bind(rideRequestSession.observeDropoffLocationChange(), onDropoffLocationChanged);
            binder.bind(rideRequestSession.observeCurrentRideType(), onCurrentRideTypeChanged);
            binder.bind(requestRideTypeProvider.observeRideTypes(), onRideTypesChanged);
            binder.bind(rideTypeSwitcher.observeSelectionChanges(), onRideTypeSwitcherItemSelected);
            binder.bind(rideTypeSwitcher.observePreviewChanges(), onRideTypeSwitcherPreviewChanged);
            binder.bind(rideTypeSwitcher.observeThumbClick(), onRideTypeThumbClick);
            binder.bind(rideMap.observeMapDragEnd(), onMapDragEnded);
            binder.bind(rideMap.observeMapDragStart(), onMapDragStarted);
            binder.bind(bus.observe(me/lyft/android/ui/passenger/PassengerRequestRideView$RateAppDialogResultEvent), onRateAppDialogResult);
            binder.bind(passengerRideAddressInput.observePickupClick(), onAddressInputClick);
            binder.bind(passengerRideAddressInput.observeDropoffClick(), onAddressInputClick);
            binder.bind(passengerRideAddressInput.observePickupFocused(), onPickupFocused);
            binder.bind(passengerRideAddressInput.observeDropoffFocused(), onDroppoffFocused);
            binder.bind(pickupAddressSubject, onPickupAddressChanged);
            binder.bind(dropoffAddressSubject, onDropoffAddressChanged);
            binder.bind(rideMap.observeShortcutClick(), onShortcutClick);
            binder.bind(rideMap.observeHotspotClick(), onHotspotClick);
            binder.bind(ReactiveUI.isTrue(getIsPickupAndCourierObservable()), onPickupStepSelectedAndIsCourier);
            binder.bind(ReactiveUI.isTrue(getIsDropoffStepObservable()), onDroppoffStepSelected);
            binder.bind(ReactiveUI.isTrue(getIsConfirmRequestRideStepObservable()), onConfirmRequestStepSelected);
            binder.bind(ReactiveUI.isTrue(getIsPickupStepAndClassicRideTypeObservable()), onPickupStepSelectedAndIsNormalRide);
            binder.bind(getIsRideTypeSwitcherVisibleObservable(), new VisibilityBinding(rideTypeSwitcher));
            binder.bind(requestRideButton.observeSetPickupClick(), onSetPickupClicked);
            binder.bind(requestRideButton.observeSetDropoffClick(), onSetDropoffClicked);
            binder.bind(requestRideButton.observeRequestRideClick(), onRequestRideClicked);
            binder.bind(rideRequestSession.observeRideStepChange(), onRideStepChange);
            binder.bind(rideRequestSession.observeAnyLocationChange(), clearCourierRidePrice);
            binder.bind(rideHintSubject, onRideHintChange);
            binder.bind(toolbar.observeItemClick(), onMenuItemClicked);
            binder.bind(getHotspotMarkerLocationObservable(), onHotspotLocationsChange);
            binder.bind(bus.observe(me/lyft/android/ui/dialogs/PaymentDialogView$RequestRideEvent), onPaymentRideRequest);
            binder.bind(mapDraggingSubject, new Action1() {

                final _cls1 this$1;

                public void call(Boolean boolean1)
                {
                    paymentWidgetContainerView.isMapDragging(boolean1.booleanValue());
                }

                public volatile void call(Object obj)
                {
                    call((Boolean)obj);
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
            binder.bind(bus.observe(me/lyft/android/ui/passenger/ConfirmPickupLocationDialogView$ConfirmPickupLocationDialogResult), onPickupConfirmed);
            binder.bind(bus.observe(me/lyft/android/ui/passenger/PrimeTimeRequestRideDialogView$ConfirmPricingDialogResultEvent), onPrimeTimeConfirmed);
            binder.bind(bus.observe(me/lyft/android/ui/passenger/PartySizePickerDialogView$SelectNumberOfPassengersResultEvent), onPartySizeSelected);
            binder.bind(rideRequestSession.observePickupOffset(), onPickupOffsetChange);
            binder.bind(Observable.interval(1L, TimeUnit.MINUTES).flatMap(new Func1() {

                final _cls1 this$1;

                public volatile Object call(Object obj)
                {
                    return call((Long)obj);
                }

                public Observable call(Long long1)
                {
                    return rideRequestSession.observePickupOffset();
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            }), onPickupOffsetChange);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onMenuItemClicked = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(Integer integer)
        {
            switch (integer.intValue())
            {
            default:
                return;

            case 2131558441: 
                dialogFlow.show(me.lyft.android.ui.splitfare.SplitFareDialogs.SplitInProgressDialog.create(getResources(), splitFareStateRepository));
                return;

            case 2131558401: 
                dialogFlow.show(new PassengerDialogs.CallDriverConfirmationDialog());
                return;

            case 2131558417: 
                binder.bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
                return;

            case 2131558424: 
                appFlow.resetToParent(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
                return;

            case 2131558405: 
                switchToPickupStep();
                return;
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onPartySizeSelected;
    private final Action1 onPaymentRideRequest = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            requestRide(false);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onPickupAddressChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            passengerRideAddressInput.setPickupAddress(s);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onPickupConfirmed;
    private final Action1 onPickupFocused = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(View view)
        {
            switchToPickupStep();
        }

        public volatile void call(Object obj)
        {
            call((View)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onPickupLocationChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            geocodeAddressIfNeeded(location, pickupAddressSubject, pickupGeocodingSubscription);
            if (isPickupStep() || !rideRequestSession.getCurrentRideType().isCourier())
            {
                rideMap.centerToLocationWithoutPadding(location);
            }
            if (rideRequestSession.getPickupLocation().isNull())
            {
                checkIfLocationServicesAreEnabled();
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onPickupOffsetChange;
    private final Action1 onPickupStepSelectedAndIsCourier = new Action1() {

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
            hidePin();
            unit = rideRequestSession.getPickupLocation();
            if (unit.isNull())
            {
                showPickupPin();
                rideMap.clearPickupMarker();
                return;
            } else
            {
                binder.bind(rideMap.centerToLocationWithoutPadding(unit).filter(new Func1() {

                    final _cls43 this$1;

                    public Boolean call(Unit unit)
                    {
                        boolean flag;
                        if (rideRequestSession.getCurrentRideType().isCourier() && isPickupStep())
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
                this$1 = _cls43.this;
                super();
            }
                }), new AsyncCall() {

                    final _cls43 this$1;

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((Unit)obj);
                    }

                    public void onSuccess(Unit unit)
                    {
                        super.onSuccess(unit);
                        showPickupPin();
                        rideMap.clearPickupMarker();
                    }

            
            {
                this$1 = _cls43.this;
                super();
            }
                });
                return;
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onPickupStepSelectedAndIsNormalRide = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            ScreenAnalytics.trackScreenView("passenger_regular_request_ride");
            requestRideButton.switchToRequestRide();
            rideMap.clearPickupMarker();
            rideMap.clearDestinationMarker();
            rideMap.clearHotspotMarkers();
            rideMap.clearShortcutMarkers();
            unit = rideRequestSession.getPickupLocation();
            if (!unit.isNull())
            {
                rideMap.centerToLocationWithoutPadding(unit);
            }
            showPickupPin();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private Action1 onPrimeTimeConfirmed;
    private final Action1 onRateAppDialogResult = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((DialogResult)obj);
        }

        public void call(DialogResult dialogresult)
        {
            if (dialogresult.getButtonId() == 0x7f0d000b)
            {
                PlayStore.openGooglePlay(getContext());
                preferences.setRateAppPromptTimestamp(0x7fffffffffffffffL);
            } else
            {
                if (dialogresult.isCancelled() || dialogresult.getButtonId() == 0x7f0d000a)
                {
                    preferences.setRateAppPromptTimestamp(System.currentTimeMillis());
                    return;
                }
                if (dialogresult.getButtonId() == 0x7f0d0009)
                {
                    preferences.setRateAppPromptTimestamp(0x7fffffffffffffffL);
                    return;
                }
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRequestRideClicked = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(View view)
        {
            RideAnalytics.trackRequestRide();
            requestRide(true);
        }

        public volatile void call(Object obj)
        {
            call((View)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideHintChange = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((String)obj);
        }

        public void call(String s)
        {
            passengerRideAddressInput.setEta(s);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideStepChange = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((me.lyft.android.domain.ride.PassengerRideRequest.RideStep)obj);
        }

        public void call(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep)
        {
            updateToolbar();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideTypeSwitcherItemSelected = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((SwitcherSelection)obj);
        }

        public void call(SwitcherSelection switcherselection)
        {
            switcherselection = (RideSwitcherItem)switcherselection.getSwitcherItem();
            if (Objects.equals(((RideSwitcherItem)rideTypeSwitcher.getSelectedItem()).getId(), "courier"))
            {
                tooltipContainer.hideAll();
            }
            Button button = pickupTime;
            int i;
            if (Objects.equals(((RideSwitcherItem)rideTypeSwitcher.getSelectedItem()).getId(), "chauffeur"))
            {
                i = 0;
            } else
            {
                i = 8;
            }
            button.setVisibility(i);
            RideAnalytics.trackRideTypeSwitch(switcherselection.getId());
            showRideModeDetailsDialogIfForced();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideTypeSwitcherPreviewChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((RideSwitcherItem)obj);
        }

        public void call(RideSwitcherItem rideswitcheritem)
        {
            rideRequestSession.setCurrentRideTypeById(rideswitcheritem.getId());
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideTypeThumbClick = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            openRideModeDetailsDialog();
            RideAnalytics.trackRideTypeInfoTap(rideTypeSwitcher.getSelectedItemId());
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onRideTypesChanged = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            ArrayList arraylist = new ArrayList(list.size());
            RequestRideType requestridetype;
            RideTypeMeta ridetypemeta;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(new RideSwitcherItem(requestridetype.getId(), ridetypemeta.getSelector().getLabel(), ridetypemeta.getSelector().getActiveColor(), requestridetype.getPricing().isPrimeTime())))
            {
                requestridetype = (RequestRideType)iterator.next();
                ridetypemeta = constantsProvider.getRideTypeMetaById(requestridetype.getId());
            }

            if (rideTypeSwitcher.getThumbViewAt(0) != null && !rideRequestSession.getCurrentRideType().isCourier() && preferences.getRideRequest().getShowCourierPromoBanner().booleanValue() && list.size() > 0 && RideType.getInstance(((RequestRideType)list.get(0)).getId()).isCourier() && showHintBanner)
            {
                tooltipContainer.tryToShowAndMarkShown("courierPromo", rideTypeSwitcher.getThumbViewAt(0), 80);
                showHintBanner = false;
            }
            rideTypeSwitcher.setItems(arraylist);
            rideTypeSwitcher.animateThumbToItemId(rideRequestSession.getCurrentRideType().getId());
            if (rideRequestSession.getCurrentRideType().isCourier() && rideRequestSession.getCurrentRideType().isDefault().booleanValue() && !preferences.getShownModeDetails().contains(rideTypeSwitcher.getSelectedItemId()))
            {
                openRideModeDetailsDialog();
            }
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onSetDropoffClicked = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(View view)
        {
            RideAnalytics.trackTapSetDestination();
            switchToConfirmRequestStep();
        }

        public volatile void call(Object obj)
        {
            call((View)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onSetPickupClicked = new Action1() {

        final PassengerRequestRideView this$0;

        public void call(View view)
        {
            RideAnalytics.trackTapSetPickup();
            switchToDropoffStep();
        }

        public volatile void call(Object obj)
        {
            call((View)obj);
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    private final Action1 onShortcutClick = new Action1() {

        final PassengerRequestRideView this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            rideRequestSession.setDropoffLocation(location);
            switchToConfirmRequestStep();
        }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
    };
    PassengerRideAddressInput passengerRideAddressInput;
    HeightObservableLayout passengerRideBottom;
    HeightObservableLayout passengerRideTop;
    PaymentWidgetContainerView paymentWidgetContainerView;
    private final ReactiveProperty pickupAddressSubject = ReactiveProperty.create();
    private Subscription pickupGeocodingSubscription;
    Button pickupTime;
    ILyftPreferences preferences;
    IProgressController progressController;
    RequestRideButton requestRideButton;
    private Subscription requestRideSubscription;
    IRequestRideTypeProvider requestRideTypeProvider;
    private final ReactiveProperty rideHintSubject = ReactiveProperty.create();
    RideMap rideMap;
    IRideRequestService rideRequestService;
    IRideRequestSession rideRequestSession;
    private final me.lyft.android.ui.MainScreens.RideScreen rideScreenParams;
    RideTypeSwitcher rideTypeSwitcher;
    private boolean showHintBanner;
    private Set shownModeDetails;
    SlideMenuController slideMenuController;
    ISplitFareRequestRepository splitFareRequestRepository;
    ISplitFareStateRepository splitFareStateRepository;
    Toolbar toolbar;
    TooltipContainerView tooltipContainer;
    UserModeSwitchFacade userModeSwitchFacade;
    IUserProvider userProvider;
    IUserSession userSession;
    IViewErrorHandler viewErrorHandler;

    public PassengerRequestRideView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        requestRideSubscription = Subscriptions.empty();
        closestDriverETARequest = Subscriptions.empty();
        pickupGeocodingSubscription = Subscriptions.empty();
        dropoffGeocodingSubscription = Subscriptions.empty();
        showHintBanner = true;
        onCurrentRideTypeChanged = new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((RequestRideType)obj);
            }

            public void call(RequestRideType requestridetype)
            {
                requestridetype = requestridetype.getId();
                updateLocation();
                rideTypeSwitcher.animateThumbToItemId(requestridetype);
                rideHintSubject.onNext("");
                if (rideRequestSession.getCurrentRideType().isCourier())
                {
                    passengerRideAddressInput.showPickupAndDropoff();
                } else
                {
                    switchToPickupStep();
                    passengerRideAddressInput.showPickupOnly();
                }
                refreshNearbyDriversMarkersAndETA();
                updateRequestRideButtonForSelectedRideType();
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        onPrimeTimeConfirmed = new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((PrimeTimeRequestRideDialogView.RequestType)obj);
            }

            public void call(PrimeTimeRequestRideDialogView.RequestType requesttype)
            {
                if (PrimeTimeRequestRideDialogView.RequestType.LYFT == requesttype)
                {
                    requestRide(false);
                } else
                if (requesttype == PrimeTimeRequestRideDialogView.RequestType.COURIER)
                {
                    switchToCourier();
                    return;
                }
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        onPickupConfirmed = new Action1() {

            final PassengerRequestRideView this$0;

            public void call(Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    requestRide(false);
                }
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        onPartySizeSelected = new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                requestRide(false);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        onPickupOffsetChange = new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((PickupOffset)obj);
            }

            public void call(PickupOffset pickupoffset)
            {
                displayPickupOffset(pickupoffset);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        onMapDragEnded = new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                location.setSource("map");
                if (!isPickupStep()) goto _L2; else goto _L1
_L1:
                rideRequestSession.setPickupLocation(location);
_L4:
                updateLocation();
                mapDraggingSubject.onNext(Boolean.valueOf(false));
                return;
_L2:
                if (isDropoffStep() && location.distanceTo(rideRequestSession.getPickupLocation()) > 30D)
                {
                    rideRequestSession.setDropoffLocation(location);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        };
        context = Scoop.a(this);
        context.b(this);
        rideScreenParams = (me.lyft.android.ui.MainScreens.RideScreen)context.a();
    }

    private void checkForSplitFareInvite()
    {
        if (splitFareRequestRepository.hasPendingRequest())
        {
            appFlow.goTo(new me.lyft.android.ui.splitfare.SplitScreens.AcceptDeclineSplitFareScreen());
        }
    }

    private void checkIfLocationServicesAreEnabled()
    {
        binder.bind(locationSettingsService.observeLocationSettingsEnabled(), new AsyncCall() {

            final PassengerRequestRideView this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                rideMap.centerToCurrentLocation();
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private void displayDestinationTooCloseToPickupErrorDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("destination_too_close_to_pickup_dialog")).setTitle(getResources().getString(0x7f070162)).setTitleColorResource(0x7f0c0025).setMessage(getResources().getString(0x7f070161)).addNegativeButton(getResources().getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    private void displayPickupOffset(PickupOffset pickupoffset)
    {
        pickupTime.setText(pickupTimeFormat.format(Long.valueOf(pickupoffset.getPickupTime())));
    }

    private void displayRouteInvalidErrorDialog(String s)
    {
        s = (new me.lyft.android.ui.Dialogs.AlertDialog("invalid_route_dialog")).setMessage(s).addNegativeButton(getResources().getString(0x7f070212));
        dialogFlow.show(s);
    }

    private void geocodeAddressIfNeeded(final Location location, final Observer addressObserver, Subscription subscription)
    {
        if (location.isNull())
        {
            return;
        }
        String s = location.getDisplayName();
        subscription.unsubscribe();
        if (Strings.isNullOrEmpty(s))
        {
            addressObserver.onNext(getResources().getString(0x7f070240));
            binder.bind(geoService.reverseGeocode(location), new AsyncCall() {

                final PassengerRequestRideView this$0;
                final Observer val$addressObserver;
                final Location val$location;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    addressObserver.onNext(getResources().getString(0x7f070064));
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Location)obj);
                }

                public void onSuccess(Location location1)
                {
                    location1 = location.getDisplayName();
                    if (!Strings.isNullOrEmpty(location1))
                    {
                        addressObserver.onNext(location1);
                        return;
                    } else
                    {
                        addressObserver.onNext(getResources().getString(0x7f070064));
                        return;
                    }
                }

            
            {
                this$0 = PassengerRequestRideView.this;
                location = location1;
                addressObserver = observer;
                super();
            }
            });
            return;
        } else
        {
            addressObserver.onNext(s);
            return;
        }
    }

    private Observable getHotspotMarkerLocationObservable()
    {
        return Observable.combineLatest(hotspotRepository.observeHotspotLocations(), getIsPickupAndCourierObservable(), new Func2() {

            final PassengerRequestRideView this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((List)obj, (Boolean)obj1);
            }

            public List call(List list, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    return list;
                } else
                {
                    return Collections.emptyList();
                }
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private Observable getIsConfirmRequestRideStepObservable()
    {
        return rideRequestSession.observeRideStepChange().map(new Func1() {

            final PassengerRequestRideView this$0;

            public Boolean call(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep)
            {
                boolean flag;
                if (ridestep == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST)
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
                return call((me.lyft.android.domain.ride.PassengerRideRequest.RideStep)obj);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private Observable getIsDropoffStepObservable()
    {
        return rideRequestSession.observeRideStepChange().map(new Func1() {

            final PassengerRequestRideView this$0;

            public Boolean call(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep)
            {
                boolean flag;
                if (ridestep == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF)
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
                return call((me.lyft.android.domain.ride.PassengerRideRequest.RideStep)obj);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private Observable getIsPickupAndCourierObservable()
    {
        return Observable.combineLatest(rideRequestSession.observeCurrentRideType(), getIsPickupStepObservable(), new Func2() {

            final PassengerRequestRideView this$0;

            public Boolean call(RequestRideType requestridetype, Boolean boolean1)
            {
                boolean flag;
                if (requestridetype.isCourier() && boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((RequestRideType)obj, (Boolean)obj1);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private Observable getIsPickupStepAndClassicRideTypeObservable()
    {
        return Observable.combineLatest(getIsPickupStepObservable(), rideRequestSession.observeCurrentRideType(), new Func2() {

            final PassengerRequestRideView this$0;

            public Boolean call(Boolean boolean1, RequestRideType requestridetype)
            {
                boolean flag;
                if (!requestridetype.isCourier() && boolean1.booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Boolean)obj, (RequestRideType)obj1);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        }).distinctUntilChanged();
    }

    private Observable getIsPickupStepObservable()
    {
        return rideRequestSession.observeRideStepChange().map(new Func1() {

            final PassengerRequestRideView this$0;

            public Boolean call(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep)
            {
                boolean flag;
                if (ridestep == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP)
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
                return call((me.lyft.android.domain.ride.PassengerRideRequest.RideStep)obj);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private Observable getIsRideTypeSwitcherVisibleObservable()
    {
        return Observable.combineLatest(requestRideTypeProvider.observeRideTypes(), getIsPickupStepObservable(), new Func2() {

            final PassengerRequestRideView this$0;

            public Boolean call(List list, Boolean boolean1)
            {
                boolean flag = true;
                if (list.size() <= 1 || !boolean1.booleanValue() || !"passenger".equalsIgnoreCase(userSession.getUser().getMode()))
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj, Object obj1)
            {
                return call((List)obj, (Boolean)obj1);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        }).distinctUntilChanged();
    }

    private Set getShownModeDetails()
    {
        if (shownModeDetails == null)
        {
            shownModeDetails = preferences.getShownModeDetails();
        }
        return shownModeDetails;
    }

    private void handleRideRequestError(Throwable throwable)
    {
        if (throwable instanceof NoValidPhoneException)
        {
            landingFlow.goToNextScreenInSignupFlow();
            return;
        }
        if (throwable instanceof BillingAddressRequiredException)
        {
            appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentFraudScreen());
            return;
        }
        if (throwable instanceof NoChargeAccountException)
        {
            dialogFlow.show(new me.lyft.android.ui.Dialogs.PaymentDialog());
            return;
        }
        if (throwable instanceof HasDebtException)
        {
            appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.DebtScreen());
            return;
        }
        if (throwable instanceof TermsNotAcceptedException)
        {
            appFlow.goTo(new me.lyft.android.ui.MainScreens.AcceptTermsScreen(false));
            return;
        }
        if (throwable instanceof NoValidChargeAccountException)
        {
            showDefaultCardInvalidDialog();
            appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentScreen());
            return;
        }
        if (throwable instanceof PickupNotConfirmedException)
        {
            dialogFlow.show(new PassengerDialogs.ConfirmPickupLocationDialog());
            return;
        }
        if (throwable instanceof RouteInvalidException)
        {
            displayRouteInvalidErrorDialog(throwable.getMessage());
            return;
        }
        if (throwable instanceof PartySizeNotSetException)
        {
            dialogFlow.show(new PassengerDialogs.PartySizePickerDialog());
            return;
        }
        if (throwable instanceof DynamicPricingNotConfirmedException)
        {
            showPrimeTimeConfirmationDialog();
            return;
        }
        if (throwable instanceof PickupLocationMissingException)
        {
            checkIfLocationServicesAreEnabled();
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    private void hidePin()
    {
        locationPin.setVisibility(8);
    }

    private boolean isConfirmRequestStep()
    {
        return rideRequestSession.getRideStep() == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST;
    }

    private boolean isDropoffStep()
    {
        return rideRequestSession.getRideStep() == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF;
    }

    private boolean isPickupStep()
    {
        return rideRequestSession.getRideStep() == me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP;
    }

    private void openRideModeDetailsDialog()
    {
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            dialogFlow.show(new PassengerDialogs.CourierRideTypeInfoDialog());
        } else
        {
            dialogFlow.show(new PassengerDialogs.RideTypeInfoDialog(rideTypeSwitcher.getSelectedItemId()));
        }
        getShownModeDetails().add(rideTypeSwitcher.getSelectedItemId());
        preferences.setShownModeDetails(getShownModeDetails());
    }

    private void promptToRateApp()
    {
        if (((Boolean)Objects.firstNonNull(userSession.getUser().isApprovedDriver(), Boolean.valueOf(false))).booleanValue() && preferences.shouldShowRateAppPrompt() && preferences.getInstallStatus() == 2)
        {
            me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("rate_app_dialog")).setTitle(getResources().getString(0x7f0702e0)).setMessage(getResources().getString(0x7f0702df)).setDialogEventClass(me/lyft/android/ui/passenger/PassengerRequestRideView$RateAppDialogResultEvent).setButtonsOrientation(Integer.valueOf(1)).addPositiveButton(getResources().getString(0x7f0702e3)).addNeutralButton(getResources().getString(0x7f0702e2)).addNegativeButton(getResources().getString(0x7f0702e1));
            dialogFlow.show(alertdialog);
        }
    }

    private void refreshNearbyDriversMarkersAndETA()
    {
        RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        List list = requestridetype.getDrivers();
        refreshNearestDriversETA(rideRequestSession.getPickupLocation(), list);
        rideMap.refreshNearbyDriversMarkers(requestridetype);
    }

    private void requestRide(boolean flag)
    {
        requestRideSubscription.unsubscribe();
        progressController.disableUI();
        requestRideSubscription = binder.bind(rideRequestService.requestRide(flag), new AsyncCall() {

            final PassengerRequestRideView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                handleRideRequestError(throwable);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private boolean shouldForcePopup()
    {
        RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        return ((Boolean)Objects.firstNonNull(constantsProvider.getRideTypeMetaById(requestridetype.getId()).getPopup().getShowOnFirstSelection(), Boolean.valueOf(false))).booleanValue() && !getShownModeDetails().contains(rideTypeSwitcher.getSelectedItemId()) && rideTypeSwitcher.getVisibility() == 0;
    }

    private void showDefaultCardInvalidDialog()
    {
        if (chargeAccountsProvider.getDefaultOrFirstValidChargeAccount() != null)
        {
            me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("default_card_invalid_dialog")).setTitle(getResources().getString(0x7f070222)).setMessage(getResources().getString(0x7f070221)).addPositiveButton(getResources().getString(0x7f070212));
            dialogFlow.show(alertdialog);
        }
    }

    private void showDropoffPin()
    {
        locationPin.setVisibility(0);
        locationPin.setImageResource(0x7f02017d);
    }

    private void showPickupPin()
    {
        locationPin.setVisibility(0);
        locationPin.setImageResource(0x7f020181);
    }

    private void showPrimeTimeConfirmationDialog()
    {
        dialogFlow.show(new PassengerDialogs.PrimeTimeRequestRideDialog());
    }

    private void showRideModeDetailsDialogIfForced()
    {
        if (shouldForcePopup())
        {
            openRideModeDetailsDialog();
        }
    }

    private void switchToConfirmRequestStep()
    {
        Location location = rideRequestSession.getDropoffLocation();
        Location location1 = rideRequestSession.getPickupLocation();
        if (location.isNull())
        {
            openPlaceSearch();
            return;
        }
        if (location.distanceTo(location1) < 150D)
        {
            displayDestinationTooCloseToPickupErrorDialog();
            return;
        } else
        {
            rideRequestSession.setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST);
            return;
        }
    }

    private void switchToCourier()
    {
        rideTypeSwitcher.animateThumbToItemId("courier");
        switchToDropoffStep();
        showRideModeDetailsDialogIfForced();
    }

    private void switchToDropoffStep()
    {
        rideRequestSession.setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF);
    }

    private void switchToPickupStep()
    {
        rideRequestSession.setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP);
    }

    private void updateLocation()
    {
        locationUpdateService.updateLocation().subscribe(new SimpleSubscriber() {

            final PassengerRequestRideView this$0;

            public void onError(Throwable throwable)
            {
                super.onError(throwable);
                defaultErrorHandler.handle(throwable);
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    private void updateRequestRideButtonForSelectedRideType()
    {
        String s1 = getResources().getString(0x7f07023f);
        RideTypeMeta ridetypemeta = constantsProvider.getRideTypeMetaById(rideRequestSession.getCurrentRideType().getId());
        String s;
        RequestRideButton requestridebutton;
        if (rideRequestSession.getCurrentRideType().isStandard())
        {
            s = (String)requestRideButtonText.value();
            RideAnalytics.trackLeanplumAssignment(s);
        } else
        {
            s = ridetypemeta.getButton().getLabel();
        }
        requestridebutton = requestRideButton;
        if (s == null)
        {
            s = s1;
        }
        requestridebutton.setRequestRideText(s);
        requestRideButton.setButtonDrawable(DrawableUtils.getButtonDrawableForHexColors(getContext(), ridetypemeta.getButton().getColor(), ridetypemeta.getButton().getPressedColor()));
        requestRideButton.updateButtonForState();
    }

    private void updateToolbar()
    {
        UserDTO userdto = userSession.getUser();
        dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
        if (rideRequestSession.getCurrentRideType().isCourier() && !isPickupStep())
        {
            toolbar.showItem(0x7f0d0005);
            toolbar.hideDriverModeToggle();
            toolbar.hideItem(0x7f0d0011);
            toolbar.hideItem(0x7f0d0018);
            return;
        }
        toolbar.hideItem(0x7f0d0005);
        if (constantsProvider.getConstants().getInviteSurfacingDTO() != InviteSurfacingDTO.NULL && !((Boolean)Objects.firstNonNull(userdto.isApprovedDriver(), Boolean.valueOf(false))).booleanValue())
        {
            toolbar.showItem(0x7f0d0018);
            toolbar.hideItem(0x7f0d0011);
            toolbar.hideDriverModeToggle();
            return;
        }
        if (!((Boolean)Objects.firstNonNull(userdto.isApprovedDriver(), Boolean.valueOf(false))).booleanValue())
        {
            toolbar.hideItem(0x7f0d0018);
            toolbar.showItem(0x7f0d0011);
            return;
        } else
        {
            toolbar.hideItem(0x7f0d0018);
            toolbar.hideItem(0x7f0d0011);
            toolbar.showDriverModeToggle();
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        rideRequestSession.restoreRideSession();
        binder.bind(rideMap.observeMapLoaded(), onMapLoaded);
        slideMenuController.enableMenu();
        toolbar.addItem(0x7f0d0005, 0x7f02012a).addItem(0x7f0d0011, 0x7f020144).addItem((new me.lyft.android.controls.Toolbar.ToolbarItem(0x7f0d0018, 0x7f02015f)).setLayoutId(0x7f03008a));
        toolbar.hideDivider();
        if (rideScreenParams.isSwitchToDriverMode())
        {
            rideScreenParams.resetSwitchToDriverMode();
            binder.bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
        }
        Object obj = rideScreenParams.getWebDialogParams();
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            rideScreenParams.resetWebDialogUrl();
            dialogFlow.show(new me.lyft.android.ui.Dialogs.InAppNotificationDialog(((String) (obj))));
        }
        passengerRideAddressInput.setInputsFocusable(true);
        rideHintSubject.onNext("");
        updateToolbar();
        obj = userProvider.getUser();
        if (!((User) (obj)).hasFirstAndLastName())
        {
            appFlow.goTo(new me.lyft.android.ui.landing.LandingScreens.LoginEnterInfoScreen());
            return;
        }
        if (!((User) (obj)).isTermsAccepted() && preferences.getShowTermsOfServiceOverRideView())
        {
            if (dialogFlow.hasActiveDialog())
            {
                dialogFlow.dismiss();
            }
            preferences.setShowTermsOfServiceOverRideView(false);
            appFlow.goTo(new me.lyft.android.ui.MainScreens.AcceptTermsScreen(false));
            return;
        } else
        {
            promptToRateApp();
            binder.bind(inAppNotificationService.showNotification("passenger_map_idle"), new AsyncCall());
            updateLocation();
            appboyService.enableInappNoteDisplay();
            return;
        }
    }

    public boolean onBack()
    {
        if (isDropoffStep())
        {
            switchToPickupStep();
            return true;
        }
        if (isConfirmRequestStep())
        {
            switchToDropoffStep();
            return true;
        } else
        {
            return false;
        }
    }

    void onCenterToCurrentLocation()
    {
        binder.bind(locationService.getLastLocation(), new Action1() {

            final PassengerRequestRideView this$0;

            public volatile void call(Object obj)
            {
                call((Location)obj);
            }

            public void call(Location location)
            {
                if (location.isNull())
                {
                    checkIfLocationServicesAreEnabled();
                    return;
                }
                class _cls51
                {

                    static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[];

                    static 
                    {
                        $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep = new int[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.values().length];
                        try
                        {
                            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls51..SwitchMap.me.lyft.android.domain.ride.PassengerRideRequest.RideStep[rideRequestSession.getRideStep().ordinal()])
                {
                default:
                    rideMap.centerToCurrentLocation();
                    return;

                case 1: // '\001'
                    rideRequestSession.setPickupLocation(location);
                    return;

                case 2: // '\002'
                    rideRequestSession.setDropoffLocation(location);
                    break;
                }
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
        binder.bind(locationSettingsService.observeLocationSettingsEnabled(), new AsyncCall() {

            final PassengerRequestRideView this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                rideMap.centerToCurrentLocation();
            }

            
            {
                this$0 = PassengerRequestRideView.this;
                super();
            }
        });
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        appboyService.disableInappNoteDisplay();
        rideRequestSession.setZoomLevel(rideMap.getZoomLevel());
        rideRequestSession.saveRideSession();
        slideMenuController.disableMenu();
        rideMap.centerMapGestures(false);
        rideMap.clearAllMarkers();
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

    void onSelectPickupTime()
    {
        dialogFlow.show(new PassengerDialogs.PickupTimeSelectorScreen());
    }

    public void openPlaceSearch()
    {
        if (isDropoffStep())
        {
            appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.DropoffSearch());
            return;
        } else
        {
            appFlow.goTo(new me.lyft.android.ui.placesearch.PlaceSearchScreens.PickupSearch());
            return;
        }
    }

    void refreshNearestDriversETA(Location location, List list)
    {
        final int nearbyDriversCount = list.size();
        if (nearbyDriversCount > 0)
        {
            closestDriverETARequest.unsubscribe();
            closestDriverETARequest = binder.bind(geoService.getClosestDriverEta(location, rideRequestSession.getCurrentRideType()), new AsyncCall() {

                final PassengerRequestRideView this$0;
                final int val$nearbyDriversCount;

                public void onFail(Throwable throwable)
                {
                    super.onFail(throwable);
                    rideHintSubject.onNext(getResources().getQuantityString(0x7f0f0003, nearbyDriversCount, new Object[] {
                        Integer.valueOf(nearbyDriversCount)
                    }));
                }

                public void onSuccess(Long long1)
                {
                    super.onSuccess(long1);
                    int j = (int)TimeUnit.SECONDS.toMinutes(long1.longValue());
                    int i = j;
                    if (j < 1)
                    {
                        i = 1;
                    }
                    rideHintSubject.onNext(getResources().getString(0x7f07023b, new Object[] {
                        Integer.valueOf(i)
                    }));
                }

                public volatile void onSuccess(Object obj)
                {
                    onSuccess((Long)obj);
                }

            
            {
                this$0 = PassengerRequestRideView.this;
                nearbyDriversCount = i;
                super();
            }
            });
            return;
        }
        etaAnalyticService.clear();
        location = lyftSystemRepository.getSystem().getShortMessage();
        if (!Strings.isNullOrEmpty(location))
        {
            rideHintSubject.onNext(location);
            return;
        } else
        {
            rideHintSubject.onNext(getResources().getString(0x7f07023c));
            return;
        }
    }

    static 
    {
        pickupTimeFormat = new SimpleDateFormat("hh:mm", Locale.US);
    }































































/*
    static boolean access$6302(PassengerRequestRideView passengerrequestrideview, boolean flag)
    {
        passengerrequestrideview.showHintBanner = flag;
        return flag;
    }

*/









}
