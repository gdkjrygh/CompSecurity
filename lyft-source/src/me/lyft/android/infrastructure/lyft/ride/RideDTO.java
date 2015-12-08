// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;
import me.lyft.android.infrastructure.lyft.payment.MoneyDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            NullRideDTO, RouteDTO

public class RideDTO
{

    public static final String ACCEPTED = "accepted";
    public static final String APPROACHING = "approaching";
    public static final String ARRIVED = "arrived";
    public static final String ARRIVED_REASON_OTHER = "other";
    public static final String ARRIVED_REASON_PASSENGER_IN_CAR = "passengerInCar";
    public static final String ARRIVED_REASON_WRONG_ADDRESS_SHOWN = "wrongAddressShown";
    public static final String CANCELED = "canceled";
    public static final String CANCELED_NO_SHOW = "canceledNoShow";
    public static final String CANCELED_WITH_PENALTY = "canceledWithPenalty";
    public static final String CANCELED_WRONG_PARTY_SIZE = "canceledWrongPartySize";
    public static final String COMPLETED = "completed";
    public static final String DROPPEDOFF = "droppedOff";
    public static final String LAPSED = "lapsed";
    public static final String PENDING = "pending";
    public static final String PICKEDUP = "pickedUp";
    public static final String PROCESSED = "processed";
    public final String actor;
    public final Integer cancelPenalty;
    public final List cancelationStatuses;
    public final String chargeToken;
    public final Long clientTimeout;
    public final Boolean concurEnabled;
    public final Boolean driverCanPenalize;
    public final String driverFeedback;
    public final String driverImprovementAreas;
    public final Integer driverRating;
    public final LocationDTO dropoffLocation;
    public final Integer dynamicPricing;
    public final Long eta;
    public final Long etd;
    public final String expenseCode;
    public final String expenseNote;
    public final Object fare;
    public final String fixedFareToken;
    public final Boolean hideCurrentLocationMarker;
    public final String icon;
    public final String id;
    public final Boolean isPassengerRideCancelEnabled;
    public final Boolean isTrainingRide;
    public final List lineItems;
    public final MoneyDTO maximumTotalMoney;
    public final Integer partySize;
    public final String passengerId;
    public final List payments;
    public final LocationDTO pickupLocation;
    public final Integer pickupOffsetMinutes;
    public final MoneyDTO profitMinusTip;
    public final List queuedRoutes;
    public final String region;
    public final String rideTypeId;
    public final RouteDTO route;
    public final Boolean showDriverHints;
    public final Boolean showEndRideConfirmation;
    public final List splitFareContributors;
    public final String status;
    public final Long timestamp;
    public final List tipOptions;
    public final MoneyDTO totalMoney;
    public final List validCoupons;
    public final Integer waitEstimateInSec;

    public RideDTO(String s, String s1, LocationDTO locationdto, LocationDTO locationdto1, String s2, Integer integer, Long long1, 
            Integer integer1, String s3, String s4, String s5, Integer integer2, String s6, String s7, 
            RouteDTO routedto, List list, Integer integer3, Integer integer4, String s8, MoneyDTO moneydto, MoneyDTO moneydto1, 
            List list1, List list2, List list3, List list4, Boolean boolean1, MoneyDTO moneydto2, List list5, 
            Object obj, Long long2, Long long3, Boolean boolean2, String s9, String s10, Boolean boolean3, 
            List list6, Long long4, Boolean boolean4, Boolean boolean5, String s11, String s12, Boolean boolean6, 
            Boolean boolean7, Integer integer5)
    {
        id = s;
        passengerId = s1;
        pickupLocation = locationdto;
        dropoffLocation = locationdto1;
        status = s2;
        cancelPenalty = integer;
        timestamp = long1;
        driverRating = integer1;
        driverFeedback = s3;
        driverImprovementAreas = s4;
        actor = s5;
        dynamicPricing = integer2;
        region = s6;
        rideTypeId = s7;
        route = routedto;
        queuedRoutes = list;
        waitEstimateInSec = integer3;
        partySize = integer4;
        fixedFareToken = s8;
        totalMoney = moneydto;
        maximumTotalMoney = moneydto1;
        lineItems = list1;
        validCoupons = list2;
        tipOptions = list3;
        payments = list4;
        driverCanPenalize = boolean1;
        profitMinusTip = moneydto2;
        splitFareContributors = list5;
        fare = obj;
        eta = long2;
        etd = long3;
        concurEnabled = boolean2;
        expenseNote = s9;
        expenseCode = s10;
        isPassengerRideCancelEnabled = boolean3;
        cancelationStatuses = list6;
        clientTimeout = long4;
        showDriverHints = boolean4;
        isTrainingRide = boolean5;
        icon = s11;
        chargeToken = s12;
        showEndRideConfirmation = boolean6;
        hideCurrentLocationMarker = boolean7;
        pickupOffsetMinutes = integer5;
    }

    public String getActor()
    {
        return actor;
    }

    public Integer getCancelPenalty()
    {
        return cancelPenalty;
    }

    public List getCancellationStatuses()
    {
        return cancelationStatuses;
    }

    public Long getClientTimeout()
    {
        return clientTimeout;
    }

    public Boolean getDriverCanPenalize()
    {
        return driverCanPenalize;
    }

    public LocationDTO getDropoffLocation()
    {
        return dropoffLocation;
    }

    public Integer getDynamicPricing()
    {
        return dynamicPricing;
    }

    public Long getEta()
    {
        return eta;
    }

    public Long getEtd()
    {
        return etd;
    }

    public Object getFare()
    {
        return fare;
    }

    public String getFixedFareToken()
    {
        return fixedFareToken;
    }

    public Boolean getHideCurrentLocationMarker()
    {
        return hideCurrentLocationMarker;
    }

    public String getIcon()
    {
        return icon;
    }

    public String getId()
    {
        return id;
    }

    public Boolean getIsPassengerRideCancelEnabled()
    {
        return isPassengerRideCancelEnabled;
    }

    public Boolean getIsTrainingRide()
    {
        return isTrainingRide;
    }

    public List getLineItems()
    {
        return lineItems;
    }

    public MoneyDTO getMaximumTotalMoney()
    {
        return maximumTotalMoney;
    }

    public Integer getPartySize()
    {
        return partySize;
    }

    public String getPassengerId()
    {
        return passengerId;
    }

    public List getPayments()
    {
        return payments;
    }

    public LocationDTO getPickupLocation()
    {
        return pickupLocation;
    }

    public Integer getPickupOffsetMinutes()
    {
        return pickupOffsetMinutes;
    }

    public MoneyDTO getProfitMinusTip()
    {
        return profitMinusTip;
    }

    public String getRegion()
    {
        return region;
    }

    public String getRideTypeId()
    {
        return rideTypeId;
    }

    public RouteDTO getRoute()
    {
        return route;
    }

    public Boolean getShowEndRideConfirmation()
    {
        return showEndRideConfirmation;
    }

    public List getSplitFareContributors()
    {
        return splitFareContributors;
    }

    public String getStatus()
    {
        return status;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    public List getTipOptions()
    {
        return tipOptions;
    }

    public MoneyDTO getTotalMoney()
    {
        return totalMoney;
    }

    public List getValidCoupons()
    {
        return validCoupons;
    }

    public Integer getWaitEstimateInSec()
    {
        return waitEstimateInSec;
    }

    public boolean isNull()
    {
        return equals(NullRideDTO.getInstance());
    }

    public Boolean showDriverHints()
    {
        return showDriverHints;
    }
}
