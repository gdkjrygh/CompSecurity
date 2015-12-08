// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

public class SetDestinationPresenter extends BaseRequestRideStepPresenter
{

    private final Action1 onDestinationLocationChange = new Action1() ;
    private final Action1 onPickupLocationChange = new Action1() ;
    final Action1 onShortcutClicked = new Action1() {

        final SetDestinationPresenter this$0;

        public volatile void call(Object obj)
        {
            call((Location)obj);
        }

        public void call(Location location)
        {
            bind(centerMapToLocation(location), new Action1() {

                final _cls2 this$1;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    showNextStep();
                }

            
            {
                this$1 = _cls2.this;
                super();
            }
            });
        }

            
            {
                this$0 = SetDestinationPresenter.this;
                super();
            }
    };
    final PassengerRequestRidePresenterV2 passengerRequestRidePresenterV2;
    final PassengerRequestRidePresenterV2 requestRidePresenter;
    final RideMap rideMap;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;

    protected SetDestinationPresenter(PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, RideMap ridemap, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, PassengerRequestRideRouter passengerrequestriderouter, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2_1)
    {
        super(ridemap, ilocationservice, igeoservice);
        passengerRequestRidePresenterV2 = passengerrequestridepresenterv2;
        rideMap = ridemap;
        rideRequestSession = iriderequestsession;
        router = passengerrequestriderouter;
        requestRidePresenter = passengerrequestridepresenterv2_1;
    }

    private void initToolbar()
    {
        ((SetDestinationAndConfirmView)view).showCancelToolbarItem(true);
    }

    protected void onAttach()
    {
        super.onAttach();
        rideMap.clearDestinationMarker();
        initToolbar();
    }

    public void onDestinationAddressClick()
    {
        router.showDropoffPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION);
    }

    protected void onDetach()
    {
        super.onDetach();
        rideMap.clearShortcutMarkers();
    }

    public void onLocationUpdate(Location location)
    {
        rideRequestSession.setDropoffLocation(location);
        requestRidePresenter.updateLocation();
    }

    public void onMapLoaded()
    {
        Location location = rideRequestSession.getPickupLocation();
        rideMap.showTransparentPickupMarker(location);
        rideMap.showShortcuts();
        rideMap.fitMapToShortcuts(location);
        bind(rideMap.observeShortcutClick(), onShortcutClicked);
        location = rideRequestSession.getDropoffLocation();
        if (!location.isNull())
        {
            centerMapToLocation(location);
        } else
        {
            centerMapToCurrentLocationAndIgnoreTheResults();
        }
        bind(rideRequestSession.observePickupLocationChange(), onPickupLocationChange);
        bind(rideRequestSession.observeDropoffLocationChange().filter(new Func1() {

            final SetDestinationPresenter this$0;

            public Boolean call(Location location1)
            {
                boolean flag;
                if (!location1.isNull())
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
                return call((Location)obj);
            }

            
            {
                this$0 = SetDestinationPresenter.this;
                super();
            }
        }), onDestinationLocationChange);
    }

    public void showNextStep()
    {
        Location location = rideRequestSession.getDropoffLocation();
        RideAnalytics.trackSetDestination(location);
        if (location.isNull())
        {
            router.showDropoffPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF);
            return;
        } else
        {
            passengerRequestRidePresenterV2.showNextStep();
            return;
        }
    }

    public void showPickupStep()
    {
        RideAnalytics.trackClearRequest();
        passengerRequestRidePresenterV2.showPickupStep();
    }







    // Unreferenced inner class me/lyft/android/ui/passenger/v2/destination/SetDestinationPresenter$3$1

/* anonymous class */

    // Unreferenced inner class me/lyft/android/ui/passenger/v2/destination/SetDestinationPresenter$4$1

/* anonymous class */

    private class SetDestinationAndConfirmView
        implements me.lyft.android.ui.passenger.v2.BaseRequestRideStepPresenter.BaseRequestRideStepView
    {

        public abstract void setDestinationAddress(String s);

        public abstract void setDestinationAddressLoading();

        public abstract void setDestinationAddressUnavailable();

        public abstract void setPickupAddress(String s);

        public abstract void setPickupAddressLoading();

        public abstract void setPickupAddressUnavailable();

        public abstract void showCancelToolbarItem(boolean flag);
    }

}
