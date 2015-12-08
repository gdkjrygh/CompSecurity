// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.List;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.RequestRideType;
import rx.Observable;

public interface IRideRequestSession
{

    public abstract void clearConfirmations();

    public abstract void clearPricing();

    public abstract void clearRideRequest();

    public abstract void confirmDynamicPricing();

    public abstract void confirmPickupLocation();

    public abstract int getAcceptedDynamicPricing();

    public abstract String getChargeToken();

    public abstract RequestRideType getCurrentRideType();

    public abstract Location getDropoffLocation();

    public abstract List getFares();

    public abstract int getPartySize();

    public abstract Location getPickupLocation();

    public abstract PickupOffset getPickupOffset();

    public abstract me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep getRequestRideStep();

    public abstract me.lyft.android.domain.ride.PassengerRideRequest.RideStep getRideStep();

    public abstract boolean getShouldShowCourierPromoBanner();

    public abstract float getZoomLevel();

    public abstract boolean isAcceptedDynamicPricingAboveTheThreshold();

    public abstract boolean isDynamicPricingConfirmed();

    public abstract boolean isPartSizeSet();

    public abstract boolean isPickupConfirmed();

    public abstract Observable observeAnyLocationChange();

    public abstract Observable observeCurrentRideType();

    public abstract Observable observeDropoffLocationChange();

    public abstract Observable observePickupLocationChange();

    public abstract Observable observePickupOffset();

    public abstract Observable observeRequestRideStepChange();

    public abstract Observable observeRideStepChange();

    public abstract void resetCurrentRideType();

    public abstract void restoreRideSession();

    public abstract void saveRideSession();

    public abstract void setChargeToken(String s);

    public abstract void setCurrentRideTypeById(String s);

    public abstract void setDropoffLocation(Location location);

    public abstract void setFares(List list);

    public abstract void setPartySize(int i);

    public abstract void setPickupLocation(Location location);

    public abstract void setPickupOffset(PickupOffset pickupoffset);

    public abstract void setRequestRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep);

    public abstract void setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep);

    public abstract void setShouldShowCourierPromoBanner(boolean flag);

    public abstract void setZoomLevel(float f);

    public abstract void updateAcceptedDynamicPricing();
}
