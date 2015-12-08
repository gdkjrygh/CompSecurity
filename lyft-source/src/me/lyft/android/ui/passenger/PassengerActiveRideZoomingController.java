// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.studies.PassengerAnalytics;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.animators.FadeAnimator;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.SphericalUtils;
import me.lyft.android.domain.passenger.Driver;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.RideStatus;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.ride.RideMap;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.BehaviorSubject;
import rx.subscriptions.CompositeSubscription;

public class PassengerActiveRideZoomingController
{

    private static final int CLOSE_DISTANCE = 100;
    private static final float CLOSE_LOCATIONS_ZOOM_LEVEL = 18F;
    private static final double MID_POINT_FRACTION = 0.5D;
    private static final int NO_DESTINATION_ZOOM_LEVEL = 15;
    private ImageButton button;
    private final ILocationService locationService;
    private Action1 onButtonStateChange;
    private Action1 onMapDragStart;
    private Action1 onRideUpdated;
    private final IPassengerRideProvider passengerRideProvider;
    private final RideMap rideMap;
    private CompositeSubscription subscriptions;
    private BehaviorSubject zoomModeSubject;

    public PassengerActiveRideZoomingController(ILocationService ilocationservice, IPassengerRideProvider ipassengerrideprovider, RideMap ridemap)
    {
        subscriptions = new CompositeSubscription();
        zoomModeSubject = BehaviorSubject.create(Mode.FOLLOW);
        onMapDragStart = new Action1() {

            final PassengerActiveRideZoomingController this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                PassengerAnalytics.trackMapMove();
                zoomModeSubject.onNext(Mode.USER_INTERACTION);
            }

            
            {
                this$0 = PassengerActiveRideZoomingController.this;
                super();
            }
        };
        onRideUpdated = new Action1() {

            final PassengerActiveRideZoomingController this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                updateZooming();
            }

            
            {
                this$0 = PassengerActiveRideZoomingController.this;
                super();
            }
        };
        onButtonStateChange = new Action1() {

            final PassengerActiveRideZoomingController this$0;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                if (!passengerRideProvider.getPassengerRide().isPickedUp().booleanValue()) goto _L2; else goto _L1
_L1:
                if (!isFollowing()) goto _L4; else goto _L3
_L3:
                FadeAnimator.fadeOut(button);
_L6:
                return;
_L4:
                button.setImageResource(0x7f020136);
                FadeAnimator.fadeIn(button);
                return;
_L2:
                FadeAnimator.fadeIn(button);
                if (isFollowing())
                {
                    button.setImageResource(0x7f0201d0);
                    return;
                }
                if (isRouteView())
                {
                    button.setImageResource(0x7f020136);
                    return;
                }
                if (isUserInteraction())
                {
                    button.setImageResource(0x7f020136);
                    return;
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                this$0 = PassengerActiveRideZoomingController.this;
                super();
            }
        };
        locationService = ilocationservice;
        passengerRideProvider = ipassengerrideprovider;
        rideMap = ridemap;
    }

    private void fitToCloseLocations(Location location, Location location1)
    {
        location = SphericalUtils.interpolate(location, location1, 0.5D);
        rideMap.centerToLocationWithZoom(location, 18F);
    }

    private void updateZoom(Location location, Location location1, List list)
    {
        if (location1.distanceTo(location) < 100D)
        {
            fitToCloseLocations(location, location1);
            return;
        }
        location1 = new ArrayList();
        for (list = list.iterator(); list.hasNext(); location1.add(((Stop)list.next()).getLocation())) { }
        list = locationService.getLastCachedLocation();
        if (list != null)
        {
            location1.add(list);
        }
        location1.add(location);
        rideMap.fitMapTo(location1);
    }

    private void updateZooming()
    {
        if (zoomModeSubject.getValue() != Mode.FOLLOW)
        {
            return;
        }
        PassengerRide passengerride = passengerRideProvider.getPassengerRide();
        Location location = passengerride.getDriver().getLocation();
        if (passengerride.getStops().isEmpty())
        {
            rideMap.centerToLocationWithZoom(location, 15F);
            return;
        }
        if (passengerride.getStatus().isAccepted() || passengerride.getStatus().isArrived())
        {
            updateZoom(location, passengerride.getPickup(), passengerride.getStopsBeforePickup());
            return;
        } else
        {
            updateZoom(location, passengerride.getDropoff(), passengerride.getStopsBeforeDropoff());
            return;
        }
    }

    public void attach(ImageButton imagebutton)
    {
        button = imagebutton;
        imagebutton.setOnClickListener(new android.view.View.OnClickListener() {

            final PassengerActiveRideZoomingController this$0;

            public void onClick(View view)
            {
                PassengerAnalytics.trackZoomButtonTap();
                if (isFollowing())
                {
                    showRoute();
                    return;
                } else
                {
                    follow();
                    return;
                }
            }

            
            {
                this$0 = PassengerActiveRideZoomingController.this;
                super();
            }
        });
        imagebutton = Binder.attach(imagebutton);
        imagebutton.bind(rideMap.observeMapDragStart(), onMapDragStart);
        imagebutton.bind(passengerRideProvider.observeRideUpdateEvent(), onRideUpdated);
        imagebutton.bind(Observable.combineLatest(passengerRideProvider.observeRideUpdateEvent(), zoomModeSubject, Unit.func2()), onButtonStateChange);
    }

    public void detach()
    {
        subscriptions.unsubscribe();
    }

    public void follow()
    {
        zoomModeSubject.onNext(Mode.FOLLOW);
        updateZooming();
    }

    public boolean isFollowing()
    {
        return zoomModeSubject.getValue() == Mode.FOLLOW;
    }

    public boolean isRouteView()
    {
        return zoomModeSubject.getValue() == Mode.ROUTE_VIEW;
    }

    public boolean isUserInteraction()
    {
        return zoomModeSubject.getValue() == Mode.USER_INTERACTION;
    }

    public void showRoute()
    {
        zoomModeSubject.onNext(Mode.ROUTE_VIEW);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = passengerRideProvider.getPassengerRide().getStops().iterator();
        Stop stop;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stop = (Stop)iterator.next();
            arraylist.add(stop.getLocation());
        } while (!stop.getPassenger().isSelf() || !stop.isDropOff());
        arraylist.add(passengerRideProvider.getPassengerRide().getDriver().getLocation());
        rideMap.fitMapTo(arraylist);
    }





    private class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode FOLLOW;
        public static final Mode ROUTE_VIEW;
        public static final Mode USER_INTERACTION;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(me/lyft/android/ui/passenger/PassengerActiveRideZoomingController$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            FOLLOW = new Mode("FOLLOW", 0);
            ROUTE_VIEW = new Mode("ROUTE_VIEW", 1);
            USER_INTERACTION = new Mode("USER_INTERACTION", 2);
            $VALUES = (new Mode[] {
                FOLLOW, ROUTE_VIEW, USER_INTERACTION
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }

}
