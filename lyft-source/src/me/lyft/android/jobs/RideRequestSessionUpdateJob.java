// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.jobs;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

// Referenced classes of package me.lyft.android.jobs:
//            Job

public class RideRequestSessionUpdateJob
    implements Job
{

    private static final String DEFAULT_RIDE_TYPE_ID = "standard";
    static final Map RIDE_TYPE_MAP = Collections.unmodifiableMap(new HashMap() {

            
            {
                put("lyft", "standard");
                put("lyft_plus", "plus");
                put("lyft_line", "courier");
            }
    });
    AppFlow appFlow;
    private final Location dropoffLocation;
    ILocationService locationService;
    private final Location pickupLocation;
    IRideRequestSession rideRequestSession;
    private final String rideTypeId;

    public RideRequestSessionUpdateJob(Location location, Location location1, String s)
    {
        pickupLocation = location;
        dropoffLocation = location1;
        rideTypeId = resolveRideTypeId(s);
    }

    private boolean isCourier(String s)
    {
        return "courier".equalsIgnoreCase(s);
    }

    private me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep resolveRequestRideStep()
    {
        if (!isCourier(rideTypeId))
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP;
        }
        if (rideRequestSession.getDropoffLocation().isNull())
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_DROPOFF;
        } else
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION;
        }
    }

    private me.lyft.android.domain.ride.PassengerRideRequest.RideStep resolveRideStep()
    {
        if (!isCourier(rideTypeId))
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP;
        }
        if (rideRequestSession.getDropoffLocation().isNull())
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_DROPOFF;
        } else
        {
            return me.lyft.android.domain.ride.PassengerRideRequest.RideStep.CONFIRM_REQUEST;
        }
    }

    private String resolveRideTypeId(String s)
    {
        return (String)Objects.firstNonNull(new String[] {
            (String)RIDE_TYPE_MAP.get(s), s, "standard"
        });
    }

    public void execute()
    {
        locationService.getLastLocation().subscribe(new SimpleSubscriber() {

            final RideRequestSessionUpdateJob this$0;

            public volatile void onNext(Object obj)
            {
                onNext((Location)obj);
            }

            public void onNext(Location location)
            {
                if (!Strings.isNullOrEmpty(rideTypeId))
                {
                    rideRequestSession.setCurrentRideTypeById(rideTypeId);
                }
                if (pickupLocation.isNull()) goto _L2; else goto _L1
_L1:
                rideRequestSession.setPickupLocation(pickupLocation);
_L4:
                if (!dropoffLocation.isNull())
                {
                    if (rideRequestSession.getPickupLocation().isNull())
                    {
                        rideRequestSession.setPickupLocation(location);
                    }
                    rideRequestSession.setDropoffLocation(dropoffLocation);
                }
                rideRequestSession.setRideStep(resolveRideStep());
                rideRequestSession.setRequestRideStep(resolveRequestRideStep());
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                return;
_L2:
                if (rideRequestSession.getPickupLocation().isNull())
                {
                    rideRequestSession.setPickupLocation(location);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = RideRequestSessionUpdateJob.this;
                super();
            }
        });
    }






}
