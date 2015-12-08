// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.InviteSurfacingDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

public class SetPickupPresenter extends BaseRequestRideStepPresenter
{

    final IConstantsProvider constantsProvider;
    final ILocationService locationService;
    private final Action1 onPickupLocationChange = new Action1() ;
    final PassengerRequestRidePresenterV2 passengerRequestRidePresenter;
    final IRequestRideTypeProvider requestRideTypeProvider;
    final RideMap rideMap;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;
    final UserModeSwitchFacade userModeSwitchFacade;
    final IUserProvider userProvider;

    public SetPickupPresenter(ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, IRequestRideTypeProvider irequestridetypeprovider, IConstantsProvider iconstantsprovider, RideMap ridemap, IUserProvider iuserprovider, 
            UserModeSwitchFacade usermodeswitchfacade, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, PassengerRequestRideRouter passengerrequestriderouter)
    {
        super(ridemap, ilocationservice, igeoservice);
        locationService = ilocationservice;
        rideRequestSession = iriderequestsession;
        requestRideTypeProvider = irequestridetypeprovider;
        constantsProvider = iconstantsprovider;
        rideMap = ridemap;
        userProvider = iuserprovider;
        userModeSwitchFacade = usermodeswitchfacade;
        passengerRequestRidePresenter = passengerrequestridepresenterv2;
        router = passengerrequestriderouter;
    }

    private void initToolbar()
    {
        Constants constants = constantsProvider.getConstants();
        boolean flag = userProvider.getUser().isApprovedDriver();
        if (constants.getInviteSurfacingDTO() != InviteSurfacingDTO.NULL && !flag)
        {
            ((PickupView)view).showInviteFriendsToolbarItem(true);
            ((PickupView)view).showSwitchToDriverToolbarItem(false);
            ((PickupView)view).showDriverModeToggle(false);
            return;
        }
        if (!flag)
        {
            ((PickupView)view).showInviteFriendsToolbarItem(false);
            ((PickupView)view).showSwitchToDriverToolbarItem(true);
            ((PickupView)view).showDriverModeToggle(false);
            return;
        } else
        {
            ((PickupView)view).showInviteFriendsToolbarItem(false);
            ((PickupView)view).showSwitchToDriverToolbarItem(false);
            ((PickupView)view).showDriverModeToggle(true);
            return;
        }
    }

    protected void onAttach()
    {
        super.onAttach();
        rideMap.clearPickupMarker();
        initToolbar();
    }

    public void onDriverModeToolbarItemClick()
    {
        bind(userModeSwitchFacade.switchToDriver(), new AsyncCall());
    }

    public void onInviteFriendsToolbarItemClick()
    {
        router.showInviteScreen();
    }

    public void onLocationUpdate(Location location)
    {
        rideRequestSession.setPickupLocation(location);
        passengerRequestRidePresenter.updateLocation();
    }

    public void onMapLoaded()
    {
        Location location = rideRequestSession.getPickupLocation();
        if (!location.isNull())
        {
            centerMapToLocation(location);
        } else
        {
            centerMapToCurrentLocation();
        }
        location = rideRequestSession.getDropoffLocation();
        if (!location.isNull())
        {
            rideMap.showTransparentDestinationMarker(location);
        }
        bind(rideRequestSession.observePickupLocationChange(), onPickupLocationChange);
        passengerRequestRidePresenter.updateLocation();
    }

    public void onPickupAddressClick()
    {
        me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep;
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF;
        } else
        {
            requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST;
        }
        router.showPickupPlaceSearchAndReturnTo(requestridestep);
    }

    public void onSetPickupClick()
    {
        RideAnalytics.trackSetPickup(rideRequestSession.getPickupLocation());
        passengerRequestRidePresenter.showNextStep();
    }




    // Unreferenced inner class me/lyft/android/ui/passenger/v2/pickup/SetPickupPresenter$1$1

/* anonymous class */

    private class PickupView
        implements me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter.BaseRequestRideStepView
    {

        public abstract void setPickupAddress(String s);

        public abstract void setPickupAddressLoading();

        public abstract void setPickupAddressUnavailable();

        public abstract void showDriverModeToggle(boolean flag);

        public abstract void showInviteFriendsToolbarItem(boolean flag);

        public abstract void showSwitchToDriverToolbarItem(boolean flag);
    }

}
