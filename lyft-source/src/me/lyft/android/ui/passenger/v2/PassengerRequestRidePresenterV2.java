// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.domain.splitfare.SplitFareRequest;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.SimpleSubscriber;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRideRouter

public class PassengerRequestRidePresenterV2 extends Presenter
{

    final IAppboyService appboyService;
    final IDefaultErrorHandler defaultErrorHandler;
    final InAppNotificationService inAppNotificationService;
    final ILocationUpdateService locationUpdateService;
    final BehaviorSubject locationUpdateServiceState = BehaviorSubject.create(Boolean.valueOf(false));
    private final Action1 onMapLoaded = new Action1() {

        final PassengerRequestRidePresenterV2 this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            rideMap.centerMapGestures(true);
            rideMap.clearAllMarkers();
            rideMap.restoreZoom(rideRequestSession.getZoomLevel());
        }

            
            {
                this$0 = PassengerRequestRidePresenterV2.this;
                super();
            }
    };
    private final Action1 onRefreshNearbyDrivers = new Action1() {

        final PassengerRequestRidePresenterV2 this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            unit = rideRequestSession.getCurrentRideType();
            rideMap.refreshNearbyDriversMarkers(unit);
        }

            
            {
                this$0 = PassengerRequestRidePresenterV2.this;
                super();
            }
    };
    private final Action1 onRequestRideStepChange = new Action1() ;
    private final Action1 onRideTypeChange = new Action1() {

        final PassengerRequestRidePresenterV2 this$0;

        public volatile void call(Object obj)
        {
            call((RequestRideType)obj);
        }

        public void call(RequestRideType requestridetype)
        {
            updateLocation();
            rideMap.refreshNearbyDriversMarkers(requestridetype);
        }

            
            {
                this$0 = PassengerRequestRidePresenterV2.this;
                super();
            }
    };
    private final Action1 onSplitFareRequest = new Action1() {

        final PassengerRequestRidePresenterV2 this$0;

        public volatile void call(Object obj)
        {
            call((SplitFareRequest)obj);
        }

        public void call(SplitFareRequest splitfarerequest)
        {
            if (splitFareRequestRepository.hasPendingRequest())
            {
                router.showAcceptDeclineSplitFareScreen();
            }
        }

            
            {
                this$0 = PassengerRequestRidePresenterV2.this;
                super();
            }
    };
    final ILyftPreferences preferences;
    final IRequestRideTypeProvider requestRideTypeProvider;
    final RideMap rideMap;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;
    final SlideMenuController slideMenuController;
    final ISplitFareRequestRepository splitFareRequestRepository;
    final UserModeSwitchFacade userModeSwitchFacade;
    final IUserProvider userProvider;

    public PassengerRequestRidePresenterV2(SlideMenuController slidemenucontroller, IRideRequestSession iriderequestsession, RideMap ridemap, ILocationUpdateService ilocationupdateservice, IDefaultErrorHandler idefaulterrorhandler, IRequestRideTypeProvider irequestridetypeprovider, ISplitFareRequestRepository isplitfarerequestrepository, 
            IUserProvider iuserprovider, ILyftPreferences ilyftpreferences, IAppboyService iappboyservice, InAppNotificationService inappnotificationservice, UserModeSwitchFacade usermodeswitchfacade, PassengerRequestRideRouter passengerrequestriderouter)
    {
        slideMenuController = slidemenucontroller;
        rideRequestSession = iriderequestsession;
        rideMap = ridemap;
        locationUpdateService = ilocationupdateservice;
        defaultErrorHandler = idefaulterrorhandler;
        requestRideTypeProvider = irequestridetypeprovider;
        splitFareRequestRepository = isplitfarerequestrepository;
        userProvider = iuserprovider;
        preferences = ilyftpreferences;
        appboyService = iappboyservice;
        inAppNotificationService = inappnotificationservice;
        userModeSwitchFacade = usermodeswitchfacade;
        router = passengerrequestriderouter;
    }

    private void promptToRateApp()
    {
        if (userProvider.getUser().isApprovedDriver() && preferences.shouldShowRateAppPrompt() && preferences.getInstallStatus() == 2)
        {
            router.showPromptToRateDialog();
        }
    }

    public Observable observeLocationUpdateServiceState()
    {
        return locationUpdateServiceState.asObservable();
    }

    protected void onAttach()
    {
        Object obj = userProvider.getUser();
        if (!((User) (obj)).hasFirstAndLastName())
        {
            router.showLoginEnterInfoScreen();
            return;
        }
        if (!((User) (obj)).isTermsAccepted() && preferences.getShowTermsOfServiceOverRideView())
        {
            router.showAcceptTermsScreenAndDismissActiveDialogs();
            preferences.setShowTermsOfServiceOverRideView(false);
            return;
        }
        if (((RequestRideViewV2)view).isSwitchToDriverMode())
        {
            ((RequestRideViewV2)view).resetSwitchToDriverMode();
            bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
            return;
        }
        obj = ((RequestRideViewV2)view).getWebDialogParams();
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            ((RequestRideViewV2)view).resetWebDialogParams();
            router.showInAppNotificationDialog(((String) (obj)));
        }
        slideMenuController.enableMenu();
        rideRequestSession.restoreRideSession();
        bind(rideRequestSession.observeCurrentRideType(), onRideTypeChange);
        bind(requestRideTypeProvider.observeRideTypes().map(Unit.func1()), onRefreshNearbyDrivers);
        bind(splitFareRequestRepository.observeSplitFareRequest(), onSplitFareRequest);
        bind(rideRequestSession.observeRequestRideStepChange(), onRequestRideStepChange);
        appboyService.enableInappNoteDisplay();
        bind(inAppNotificationService.showNotification("passenger_map_idle"), new AsyncCall());
        bind(rideMap.observeMapLoaded(), onMapLoaded);
        promptToRateApp();
    }

    public boolean onBack()
    {
        if (rideRequestSession.getRequestRideStep() == me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP)
        {
            return false;
        } else
        {
            showPickupStep();
            return true;
        }
    }

    protected void onDetach()
    {
        slideMenuController.disableMenu();
        rideRequestSession.setZoomLevel(rideMap.getZoomLevel());
        rideRequestSession.saveRideSession();
        rideMap.centerMapGestures(false);
        appboyService.disableInappNoteDisplay();
    }

    public void reset()
    {
        rideRequestSession.setDropoffLocation(NullLocation.getInstance());
        rideMap.clearDestinationMarker();
    }

    public void showNextStep()
    {
        me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep = rideRequestSession.getRequestRideStep();
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            if (requestridestep == me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP)
            {
                requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF;
            } else
            {
                requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION;
            }
        } else
        {
            boolean flag;
            if (!rideRequestSession.getDropoffLocation().isNull())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION;
            } else
            {
                requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST;
            }
        }
        rideRequestSession.setRequestRideStep(requestridestep);
    }

    public void showPickupStep()
    {
        rideRequestSession.setRequestRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP);
    }

    public final void updateLocation()
    {
        locationUpdateServiceState.onNext(Boolean.valueOf(true));
        locationUpdateService.updateLocation().subscribe(new SimpleSubscriber() {

            final PassengerRequestRidePresenterV2 this$0;

            public void onCompleted()
            {
                super.onCompleted();
                locationUpdateServiceState.onNext(Boolean.valueOf(false));
            }

            public void onError(Throwable throwable)
            {
                super.onError(throwable);
                defaultErrorHandler.handle(throwable);
                locationUpdateServiceState.onNext(Boolean.valueOf(false));
            }

            
            {
                this$0 = PassengerRequestRidePresenterV2.this;
                super();
            }
        });
    }


    private class RequestRideViewV2
        implements me.lyft.android.ui.Presenter.View
    {

        public abstract String getWebDialogParams();

        public abstract boolean isSwitchToDriverMode();

        public abstract void resetSwitchToDriverMode();

        public abstract void resetWebDialogParams();

        public abstract void showStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep);
    }

}
