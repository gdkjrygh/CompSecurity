// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.Collections;
import java.util.List;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.NullLocation;
import me.lyft.android.domain.ride.PassengerRideRequest;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.application.ride:
//            IRideRequestSession, IPreRideInfoRepository, IRequestRideTypeProvider

public class RideRequestSession
    implements IRideRequestSession
{

    private int acceptedDynamicPricing;
    private String chargeToken;
    private Location confirmedPickupLocation;
    private final IConstantsProvider constantsProvider;
    private final BehaviorSubject currentRequestRideStep = BehaviorSubject.create();
    private final ReactiveProperty currentRideTypeObservable = ReactiveProperty.create(RequestRideType.empty());
    private final ReactiveProperty dropoffLocationSubject = ReactiveProperty.create().allowDuplicates();
    private Location dynamicPricingLocation;
    private List fares;
    private final Observable locationChangedObservable;
    private final ILocationService locationService;
    private int partySize;
    private final ReactiveProperty pickupLocationSubject = ReactiveProperty.create().allowDuplicates();
    private final ReactiveProperty pickupOffsetSubject;
    private final ILyftPreferences preferences;
    private final IRequestRideTypeProvider requestRideTypeProvider;
    private final ReactiveProperty rideStepSubject;
    private boolean showCourierPromoBanner;
    private float zoomLevel;

    public RideRequestSession(ILyftPreferences ilyftpreferences, ILocationService ilocationservice, IRequestRideTypeProvider irequestridetypeprovider, IPreRideInfoRepository iprerideinforepository, IConstantsProvider iconstantsprovider)
    {
        rideStepSubject = ReactiveProperty.create(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP).allowDuplicates();
        locationChangedObservable = Observable.combineLatest(pickupLocationSubject, dropoffLocationSubject, Unit.func2());
        showCourierPromoBanner = true;
        fares = Collections.emptyList();
        confirmedPickupLocation = NullLocation.getInstance();
        dynamicPricingLocation = NullLocation.getInstance();
        preferences = ilyftpreferences;
        locationService = ilocationservice;
        requestRideTypeProvider = irequestridetypeprovider;
        pickupOffsetSubject = ReactiveProperty.create(Objects.firstNonNull(iprerideinforepository.getDefaultPickupOffset(), PickupOffset.empty()));
        constantsProvider = iconstantsprovider;
    }

    public void clearConfirmations()
    {
        dynamicPricingLocation = NullLocation.getInstance();
        confirmedPickupLocation = NullLocation.getInstance();
        partySize = 0;
    }

    public void clearPricing()
    {
        fares = Collections.emptyList();
        acceptedDynamicPricing = 0;
    }

    public void clearRideRequest()
    {
        clearConfirmations();
        preferences.clearRideRequest();
        pickupLocationSubject.onNext(NullLocation.getInstance());
        dropoffLocationSubject.onNext(NullLocation.getInstance());
        rideStepSubject.onNext(me.lyft.android.domain.ride.PassengerRideRequest.RideStep.SET_PICKUP);
        currentRequestRideStep.onNext(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP);
    }

    public void confirmDynamicPricing()
    {
        dynamicPricingLocation = getPickupLocation();
    }

    public void confirmPickupLocation()
    {
        confirmedPickupLocation = getPickupLocation();
    }

    public int getAcceptedDynamicPricing()
    {
        return acceptedDynamicPricing;
    }

    public String getChargeToken()
    {
        return chargeToken;
    }

    public RequestRideType getCurrentRideType()
    {
        RequestRideType requestridetype = (RequestRideType)currentRideTypeObservable.get();
        if (requestridetype.isNull())
        {
            return requestRideTypeProvider.getDefaultRideType();
        } else
        {
            return requestRideTypeProvider.getRideTypeById(requestridetype.getId());
        }
    }

    public Location getDropoffLocation()
    {
        return (Location)Objects.firstNonNull(dropoffLocationSubject.get(), NullLocation.getInstance());
    }

    public List getFares()
    {
        return fares;
    }

    public int getPartySize()
    {
        return partySize;
    }

    public Location getPickupLocation()
    {
        return (Location)Objects.firstNonNull(pickupLocationSubject.get(), NullLocation.getInstance());
    }

    public PickupOffset getPickupOffset()
    {
        return (PickupOffset)pickupOffsetSubject.get();
    }

    public me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep getRequestRideStep()
    {
        return (me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep)Objects.firstNonNull(currentRequestRideStep.getValue(), me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.SET_PICKUP);
    }

    public me.lyft.android.domain.ride.PassengerRideRequest.RideStep getRideStep()
    {
        return (me.lyft.android.domain.ride.PassengerRideRequest.RideStep)rideStepSubject.get();
    }

    public boolean getShouldShowCourierPromoBanner()
    {
        return showCourierPromoBanner;
    }

    public float getZoomLevel()
    {
        return zoomLevel;
    }

    public boolean isAcceptedDynamicPricingAboveTheThreshold()
    {
        return getAcceptedDynamicPricing() > constantsProvider.getConstants().getPrimeTimeConfirmationThreshold();
    }

    public boolean isDynamicPricingConfirmed()
    {
        return dynamicPricingLocation.hasSameCoordinates(getPickupLocation()) && !dynamicPricingLocation.isNull();
    }

    public boolean isPartSizeSet()
    {
        return partySize > 0;
    }

    public boolean isPickupConfirmed()
    {
        return confirmedPickupLocation.hasSameCoordinates(getPickupLocation()) && !confirmedPickupLocation.isNull();
    }

    public Observable observeAnyLocationChange()
    {
        return locationChangedObservable.asObservable();
    }

    public Observable observeCurrentRideType()
    {
        return currentRideTypeObservable.asObservable();
    }

    public Observable observeDropoffLocationChange()
    {
        return dropoffLocationSubject.asObservable();
    }

    public Observable observePickupLocationChange()
    {
        return pickupLocationSubject.asObservable();
    }

    public Observable observePickupOffset()
    {
        return pickupOffsetSubject.asObservable();
    }

    public Observable observeRequestRideStepChange()
    {
        return currentRequestRideStep.asObservable();
    }

    public Observable observeRideStepChange()
    {
        return rideStepSubject.asObservable();
    }

    public void resetCurrentRideType()
    {
        currentRideTypeObservable.onNext(requestRideTypeProvider.getDefaultRideType());
    }

    public void restoreRideSession()
    {
        PassengerRideRequest passengerriderequest = preferences.getRideRequest();
        setZoomLevel(passengerriderequest.getZoomLevel().floatValue());
        setShouldShowCourierPromoBanner(passengerriderequest.getShowCourierPromoBanner().booleanValue());
        if (getPickupLocation().isNull())
        {
            Location location = passengerriderequest.getPickupLocation();
            if (location.isNull())
            {
                locationService.getLastLocation().subscribe(new SimpleSubscriber() {

                    final RideRequestSession this$0;

                    public volatile void onNext(Object obj)
                    {
                        onNext((Location)obj);
                    }

                    public void onNext(Location location1)
                    {
                        location1.setSource("defaultLocation");
                        setPickupLocation(location1);
                    }

            
            {
                this$0 = RideRequestSession.this;
                super();
            }
                });
            } else
            {
                setPickupLocation(location);
            }
        }
        if (getDropoffLocation().isNull())
        {
            setDropoffLocation(passengerriderequest.getDropoffLocation());
        }
        if (((RequestRideType)currentRideTypeObservable.get()).isNull())
        {
            setCurrentRideTypeById(passengerriderequest.getSelectedRideTypeId());
            setRideStep(passengerriderequest.getStep());
            setRequestRideStep(passengerriderequest.getRequestRideStep());
        }
        if (passengerriderequest.getPickupOffsetMinutes() != null)
        {
            setPickupOffset(new PickupOffset(passengerriderequest.getPickupOffsetMinutes().intValue()));
        }
    }

    public void saveRideSession()
    {
        PassengerRideRequest passengerriderequest = new PassengerRideRequest(getCurrentRideType().getId());
        passengerriderequest.setPickupLocation(getPickupLocation());
        passengerriderequest.setDropoffLocation(getDropoffLocation());
        passengerriderequest.setStep(getRideStep());
        passengerriderequest.setZoomLevel(Float.valueOf(getZoomLevel()));
        passengerriderequest.setTimestamp(Long.valueOf(System.currentTimeMillis()));
        passengerriderequest.setRequestRideStep(getRequestRideStep());
        passengerriderequest.setPickupOffsetMinutes(Integer.valueOf(((PickupOffset)pickupOffsetSubject.get()).getOffsetMinutes()));
        passengerriderequest.setShowCourierPromoBanner(getShouldShowCourierPromoBanner());
        preferences.setRideRequest(passengerriderequest);
    }

    public void setChargeToken(String s)
    {
        chargeToken = s;
    }

    public void setCurrentRideTypeById(String s)
    {
        currentRideTypeObservable.onNext(requestRideTypeProvider.getRideTypeById(s));
    }

    public void setDropoffLocation(Location location)
    {
        location = (Location)Objects.firstNonNull(location, NullLocation.getInstance());
        dropoffLocationSubject.onNext(location);
    }

    public void setFares(List list)
    {
        fares = list;
    }

    public void setPartySize(int i)
    {
        partySize = i;
    }

    public void setPickupLocation(Location location)
    {
        location = (Location)Objects.firstNonNull(location, NullLocation.getInstance());
        pickupLocationSubject.onNext(location);
    }

    public void setPickupOffset(PickupOffset pickupoffset)
    {
        pickupOffsetSubject.onNext(pickupoffset);
    }

    public void setRequestRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep requestridestep)
    {
        currentRequestRideStep.onNext(requestridestep);
    }

    public void setRideStep(me.lyft.android.domain.ride.PassengerRideRequest.RideStep ridestep)
    {
        rideStepSubject.onNext(ridestep);
    }

    public void setShouldShowCourierPromoBanner(boolean flag)
    {
        showCourierPromoBanner = flag;
    }

    public void setZoomLevel(float f)
    {
        zoomLevel = f;
    }

    public void updateAcceptedDynamicPricing()
    {
        acceptedDynamicPricing = getCurrentRideType().getPricing().getDynamicPricing().intValue();
    }
}
