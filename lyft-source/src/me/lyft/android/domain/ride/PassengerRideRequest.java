// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import me.lyft.android.common.Objects;
import me.lyft.android.common.Preconditions;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;

public class PassengerRideRequest
{

    private static final float INITIAL_REQUEST_RIDE_ZOOM_LEVEL = 16F;
    private static final float MINIMAL_REQUEST_RIDE_ZOOM_LEVEL = 10F;
    Location dropoffLocation;
    Location pickupLocation;
    Integer pickupOffsetMinutes;
    RequestRideStep requestRideStep;
    String selectedRideTypeId;
    Boolean showCourierPromoBanner;
    RideStep step;
    Long timestamp;
    Float zoomLevel;

    public PassengerRideRequest(String s)
    {
        selectedRideTypeId = s;
    }

    public Location getDropoffLocation()
    {
        return (Location)Objects.firstNonNull(dropoffLocation, NullLocation.getInstance());
    }

    public Location getPickupLocation()
    {
        return (Location)Objects.firstNonNull(pickupLocation, NullLocation.getInstance());
    }

    public Integer getPickupOffsetMinutes()
    {
        return pickupOffsetMinutes;
    }

    public RequestRideStep getRequestRideStep()
    {
        return (RequestRideStep)Objects.firstNonNull(requestRideStep, RequestRideStep.SET_PICKUP);
    }

    public String getSelectedRideTypeId()
    {
        return selectedRideTypeId;
    }

    public Boolean getShowCourierPromoBanner()
    {
        return (Boolean)Objects.firstNonNull(showCourierPromoBanner, Boolean.valueOf(true));
    }

    public RideStep getStep()
    {
        return (RideStep)Objects.firstNonNull(step, RideStep.SET_PICKUP);
    }

    public Long getTimestamp()
    {
        return (Long)Objects.firstNonNull(timestamp, Long.valueOf(0L));
    }

    public Float getZoomLevel()
    {
        Float float2 = (Float)Objects.firstNonNull(zoomLevel, Float.valueOf(16F));
        Float float1 = float2;
        if (float2.floatValue() < 10F)
        {
            float1 = Float.valueOf(16F);
        }
        return float1;
    }

    public void setDropoffLocation(Location location)
    {
        Preconditions.checkNotNull(location);
        if (!location.isNull())
        {
            dropoffLocation = location;
        }
    }

    public void setPickupLocation(Location location)
    {
        Preconditions.checkNotNull(location);
        if (!location.isNull())
        {
            pickupLocation = location;
        }
    }

    public void setPickupOffsetMinutes(Integer integer)
    {
        pickupOffsetMinutes = integer;
    }

    public void setRequestRideStep(RequestRideStep requestridestep)
    {
        requestRideStep = requestridestep;
    }

    public void setShowCourierPromoBanner(boolean flag)
    {
        showCourierPromoBanner = Boolean.valueOf(flag);
    }

    public void setStep(RideStep ridestep)
    {
        step = ridestep;
    }

    public void setTimestamp(Long long1)
    {
        timestamp = long1;
    }

    public void setZoomLevel(Float float1)
    {
        zoomLevel = float1;
    }

    private class RequestRideStep extends Enum
    {

        private static final RequestRideStep $VALUES[];
        public static final RequestRideStep CONFIRM_REQUEST;
        public static final RequestRideStep CONFIRM_REQUEST_WITH_DESTINATION;
        public static final RequestRideStep SET_DROPOFF;
        public static final RequestRideStep SET_PICKUP;

        public static RequestRideStep valueOf(String s)
        {
            return (RequestRideStep)Enum.valueOf(me/lyft/android/domain/ride/PassengerRideRequest$RequestRideStep, s);
        }

        public static RequestRideStep[] values()
        {
            return (RequestRideStep[])$VALUES.clone();
        }

        static 
        {
            SET_PICKUP = new RequestRideStep("SET_PICKUP", 0);
            SET_DROPOFF = new RequestRideStep("SET_DROPOFF", 1);
            CONFIRM_REQUEST = new RequestRideStep("CONFIRM_REQUEST", 2);
            CONFIRM_REQUEST_WITH_DESTINATION = new RequestRideStep("CONFIRM_REQUEST_WITH_DESTINATION", 3);
            $VALUES = (new RequestRideStep[] {
                SET_PICKUP, SET_DROPOFF, CONFIRM_REQUEST, CONFIRM_REQUEST_WITH_DESTINATION
            });
        }

        private RequestRideStep(String s, int i)
        {
            super(s, i);
        }
    }


    private class RideStep extends Enum
    {

        private static final RideStep $VALUES[];
        public static final RideStep CONFIRM_REQUEST;
        public static final RideStep SET_DROPOFF;
        public static final RideStep SET_PICKUP;

        public static RideStep valueOf(String s)
        {
            return (RideStep)Enum.valueOf(me/lyft/android/domain/ride/PassengerRideRequest$RideStep, s);
        }

        public static RideStep[] values()
        {
            return (RideStep[])$VALUES.clone();
        }

        static 
        {
            SET_PICKUP = new RideStep("SET_PICKUP", 0);
            SET_DROPOFF = new RideStep("SET_DROPOFF", 1);
            CONFIRM_REQUEST = new RideStep("CONFIRM_REQUEST", 2);
            $VALUES = (new RideStep[] {
                SET_PICKUP, SET_DROPOFF, CONFIRM_REQUEST
            });
        }

        private RideStep(String s, int i)
        {
            super(s, i);
        }
    }

}
