// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import com.leanplum.Var;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Button;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;
import rx.functions.Action1;

public class ConfirmPresenter extends BaseRequestRideStepPresenter
{

    private static final int MAP_ZOOM_LEVEL_FOR_PICKUP_LOCATION_ONLY = 18;
    private static final Var REQUEST_RIDE_BUTTON_TEXT = Var.define("paxRequestRideButton", "Request Lyft");
    final IConstantsProvider constantsProvider;
    private final Action1 onDestinationLocationChange = new Action1() ;
    private final Action1 onPickupLocationChange = new Action1() ;
    final PassengerRequestRidePresenterV2 passengerRequestRidePresenter;
    final RideMap rideMap;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;

    protected ConfirmPresenter(PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, RideMap ridemap, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, PassengerRequestRideRouter passengerrequestriderouter, IConstantsProvider iconstantsprovider)
    {
        super(ridemap, ilocationservice, igeoservice);
        passengerRequestRidePresenter = passengerrequestridepresenterv2;
        rideMap = ridemap;
        rideRequestSession = iriderequestsession;
        router = passengerrequestriderouter;
        constantsProvider = iconstantsprovider;
    }

    private void updateRequestRideButtonBackground(RideTypeMeta ridetypemeta)
    {
        ((ConfirmView)view).setRequestButtonBackground(ridetypemeta.getButton().getColor(), ridetypemeta.getButton().getPressedColor());
    }

    private void updateRequestRideButtonText(RideTypeMeta ridetypemeta)
    {
        if (rideRequestSession.getCurrentRideType().isStandard())
        {
            ridetypemeta = (String)REQUEST_RIDE_BUTTON_TEXT.value();
            RideAnalytics.trackLeanplumAssignment(ridetypemeta);
        } else
        {
            ridetypemeta = ridetypemeta.getButton().getLabel();
        }
        if (!Strings.isNullOrEmpty(ridetypemeta))
        {
            ((ConfirmView)view).setRequestButtonText(ridetypemeta);
        }
    }

    protected void onAttach()
    {
        super.onAttach();
        ((ConfirmView)view).showCancelOption(true);
        RideTypeMeta ridetypemeta = constantsProvider.getRideTypeMetaById(rideRequestSession.getCurrentRideType().getId());
        updateRequestRideButtonText(ridetypemeta);
        updateRequestRideButtonBackground(ridetypemeta);
    }

    public void onDestinationAddressClick()
    {
        me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep;
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF;
        } else
        {
            requestridestep = me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION;
        }
        router.showDropoffPlaceSearchAndReturnTo(requestridestep);
    }

    public void onLocationUpdate(Location location)
    {
    }

    public void onMapLoaded()
    {
        Location location = rideRequestSession.getPickupLocation();
        rideMap.showPickupMarker(location);
        Location location1 = rideRequestSession.getDropoffLocation();
        if (!location1.isNull())
        {
            rideMap.showDestinationMarker(location1);
            rideMap.fitMapTo(new Location[] {
                location, location1
            });
        } else
        {
            rideMap.centerToLocationWithZoom(location, 18F);
        }
        bind(rideRequestSession.observePickupLocationChange(), onPickupLocationChange);
        bind(rideRequestSession.observeDropoffLocationChange(), onDestinationLocationChange);
    }

    public void onPickupAddressClick()
    {
        router.showPickupPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP);
    }

    public void resetToPickupStep()
    {
        RideAnalytics.trackClearRequest();
        passengerRequestRidePresenter.showPickupStep();
    }








    // Unreferenced inner class me/lyft/android/ui/passenger/v2/confirm/ConfirmPresenter$1$1

/* anonymous class */

    // Unreferenced inner class me/lyft/android/ui/passenger/v2/confirm/ConfirmPresenter$2$1

/* anonymous class */

    private class ConfirmView
        implements me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter.BaseRequestRideStepView
    {

        public abstract void setDestinationAddress(String s);

        public abstract void setDestinationAddressLoading();

        public abstract void setDestinationAddressUnavailable();

        public abstract void setPickupAddress(String s);

        public abstract void setPickupAddressLoading();

        public abstract void setPickupAddressUnavailable();

        public abstract void setRequestButtonBackground(String s, String s1);

        public abstract void setRequestButtonText(String s);

        public abstract void showCancelOption(boolean flag);
    }

}
