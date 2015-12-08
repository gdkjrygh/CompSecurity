// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PickupOffset;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.ride.RideRequestDTO;
import rx.Notification;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            IRideRequestService, IRideRequestSession, IPreRideInfoRepository, NoValidPhoneException, 
//            BillingAddressRequiredException, NoChargeAccountException, HasDebtException, TermsNotAcceptedException, 
//            NoValidChargeAccountException, PickupNotConfirmedException, RouteInvalidException, PartySizeNotSetException, 
//            DynamicPricingNotConfirmedException, PickupLocationMissingException

public class RideRequestService
    implements IRideRequestService
{

    private static final float PICKUP_DISTANCE_FROM_CURRENT_LOCATION_THRESHOLD_METERS = 150F;
    private IChargeAccountsProvider chargeAccountsProvider;
    private ICheckoutSession checkoutSession;
    private ILocationService locationService;
    private ILyftApi lyftApi;
    private IPreRideInfoRepository preRideInfoRepository;
    private IRideRequestSession rideRequestSession;
    private IUserProvider userProvider;

    public RideRequestService(IUserProvider iuserprovider, IChargeAccountsProvider ichargeaccountsprovider, ILocationService ilocationservice, IRideRequestSession iriderequestsession, ILyftApi ilyftapi, IPreRideInfoRepository iprerideinforepository, ICheckoutSession icheckoutsession)
    {
        userProvider = iuserprovider;
        chargeAccountsProvider = ichargeaccountsprovider;
        locationService = ilocationservice;
        rideRequestSession = iriderequestsession;
        lyftApi = ilyftapi;
        preRideInfoRepository = iprerideinforepository;
        checkoutSession = icheckoutsession;
    }

    private Observable createRideRequest()
    {
        Location location = rideRequestSession.getPickupLocation();
        Location location1 = rideRequestSession.getDropoffLocation();
        Object obj;
        Object obj1;
        Object obj2;
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            obj = Integer.valueOf(rideRequestSession.getPartySize());
        } else
        {
            obj = null;
        }
        if (rideRequestSession.getCurrentRideType().isCourier())
        {
            obj2 = FixedFare.findFareByPartySize(rideRequestSession.getFares(), ((Integer) (obj)).intValue());
        } else
        {
            obj2 = null;
        }
        if (rideRequestSession.getCurrentRideType().isCourier() && !((FixedFare) (obj2)).isNull())
        {
            obj1 = ((FixedFare) (obj2)).getOriginalJson();
        } else
        {
            obj1 = null;
        }
        if (rideRequestSession.getCurrentRideType().isCourier() && !((FixedFare) (obj2)).isNull())
        {
            obj2 = ((FixedFare) (obj2)).getFixedFareToken();
        } else
        {
            obj2 = null;
        }
        obj = new RideRequestDTO(LocationMapper.fromLocationDomain(location), LocationMapper.fromLocationDomain(location1), ((Integer) (obj)), obj1, ((String) (obj2)), rideRequestSession.getCurrentRideType().getId(), Integer.valueOf(rideRequestSession.getAcceptedDynamicPricing()), rideRequestSession.getChargeToken(), Integer.valueOf(rideRequestSession.getPickupOffset().getOffsetMinutes()));
        rideRequestSession.clearPricing();
        return lyftApi.createRide(((RideRequestDTO) (obj))).doOnNext(new Action1() {

            final RideRequestService this$0;

            public volatile void call(Object obj3)
            {
                call((AppStateDTO)obj3);
            }

            public void call(AppStateDTO appstatedto)
            {
                rideRequestSession.clearConfirmations();
                checkoutSession.reset();
            }

            
            {
                this$0 = RideRequestService.this;
                super();
            }
        }).map(Unit.func1());
    }

    private boolean isBillingAddressRequiredAndHasNoChargeAccounts()
    {
        return userProvider.getUser().isBillingAddressRequired() && chargeAccountsProvider.hasNoChargeAccounts();
    }

    private boolean isCourierAndPartySizeNotSet()
    {
        return rideRequestSession.getCurrentRideType().isCourier() && !rideRequestSession.isPartSizeSet();
    }

    private boolean isDynamicPricingNotConfirmedAndNotCourier()
    {
        while (rideRequestSession.getCurrentRideType().isCourier() || !rideRequestSession.isAcceptedDynamicPricingAboveTheThreshold() || rideRequestSession.isDynamicPricingConfirmed()) 
        {
            return false;
        }
        return true;
    }

    private boolean isPickupTooFarFromCurrentLocationAndNotConfirmed()
    {
        Location location = rideRequestSession.getPickupLocation();
        return locationService.getLastCachedLocation().distanceTo(location) > 150D && !rideRequestSession.isPickupConfirmed();
    }

    private Boolean isRouteInvalid()
    {
        boolean flag;
        if (!preRideInfoRepository.getPreRideInfo().getRouteIsValid())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public Observable requestRide(boolean flag)
    {
        final ActionAnalytics requestRideAction = RideAnalytics.trackRequestRideAction();
        Object obj = userProvider.getUser();
        if (flag)
        {
            rideRequestSession.updateAcceptedDynamicPricing();
            rideRequestSession.setFares(preRideInfoRepository.getPreRideInfo().getFares());
        }
        if (!((User) (obj)).hasValidPhoneNumber())
        {
            obj = Observable.error(new NoValidPhoneException());
        } else
        if (isBillingAddressRequiredAndHasNoChargeAccounts())
        {
            obj = Observable.error(new BillingAddressRequiredException());
        } else
        if (chargeAccountsProvider.hasNoChargeAccounts())
        {
            obj = Observable.error(new NoChargeAccountException());
        } else
        if (((User) (obj)).hasDebt())
        {
            obj = Observable.error(new HasDebtException());
        } else
        if (!((User) (obj)).isTermsAccepted())
        {
            obj = Observable.error(new TermsNotAcceptedException());
        } else
        if (!chargeAccountsProvider.hasValidChargeAccount())
        {
            obj = Observable.error(new NoValidChargeAccountException());
        } else
        if (isPickupTooFarFromCurrentLocationAndNotConfirmed())
        {
            obj = Observable.error(new PickupNotConfirmedException());
        } else
        if (isRouteInvalid().booleanValue())
        {
            obj = Observable.error(new RouteInvalidException(preRideInfoRepository.getPreRideInfo().getErrorMessage()));
        } else
        if (isCourierAndPartySizeNotSet())
        {
            obj = Observable.error(new PartySizeNotSetException());
        } else
        if (isDynamicPricingNotConfirmedAndNotCourier())
        {
            obj = Observable.error(new DynamicPricingNotConfirmedException());
        } else
        if (rideRequestSession.getPickupLocation().isNull())
        {
            obj = Observable.error(new PickupLocationMissingException());
        } else
        {
            obj = createRideRequest();
        }
        return ((Observable) (obj)).doOnEach(new Action1() {

            final RideRequestService this$0;
            final ActionAnalytics val$requestRideAction;

            public volatile void call(Object obj1)
            {
                call((Notification)obj1);
            }

            public void call(Notification notification)
            {
                if (notification.isOnNext())
                {
                    requestRideAction.trackSuccess();
                } else
                if (notification.isOnError())
                {
                    requestRideAction.trackFailure(notification.getThrowable());
                    return;
                }
            }

            
            {
                this$0 = RideRequestService.this;
                requestRideAction = actionanalytics;
                super();
            }
        });
    }


}
