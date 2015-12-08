// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.ride.RideRequestDTO;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.ride:
//            IWearRideRequestService, NoValidPhoneException, BillingAddressRequiredException, NoChargeAccountException, 
//            HasDebtException, TermsNotAcceptedException, NoValidChargeAccountException

public class WearRideRequestService
    implements IWearRideRequestService
{

    private IChargeAccountsProvider chargeAccountsProvider;
    private ICheckoutSession checkoutSession;
    private ILyftApi lyftApi;
    private IUserProvider userProvider;

    public WearRideRequestService(IUserProvider iuserprovider, IChargeAccountsProvider ichargeaccountsprovider, ILyftApi ilyftapi, ICheckoutSession icheckoutsession)
    {
        userProvider = iuserprovider;
        chargeAccountsProvider = ichargeaccountsprovider;
        lyftApi = ilyftapi;
        checkoutSession = icheckoutsession;
    }

    private Observable createRideRequest(Location location)
    {
        location = new RideRequestDTO(LocationMapper.fromLocationDomain(location), null, null, null, null, "standard", null, null, null);
        return lyftApi.createRide(location).doOnNext(new Action1() {

            final WearRideRequestService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                checkoutSession.reset();
            }

            
            {
                this$0 = WearRideRequestService.this;
                super();
            }
        }).map(Unit.func1());
    }

    private boolean isBillingAddressRequiredAndHasNoChargeAccounts()
    {
        return userProvider.getUser().isBillingAddressRequired() && chargeAccountsProvider.hasNoChargeAccounts();
    }

    public Observable requestRide(double d, double d1)
    {
        Location location = new Location(d, d1);
        User user = userProvider.getUser();
        if (!user.hasValidPhoneNumber())
        {
            return Observable.error(new NoValidPhoneException());
        }
        if (isBillingAddressRequiredAndHasNoChargeAccounts())
        {
            return Observable.error(new BillingAddressRequiredException());
        }
        if (chargeAccountsProvider.hasNoChargeAccounts())
        {
            return Observable.error(new NoChargeAccountException());
        }
        if (user.hasDebt())
        {
            return Observable.error(new HasDebtException());
        }
        if (!user.isTermsAccepted())
        {
            return Observable.error(new TermsNotAcceptedException());
        }
        if (!chargeAccountsProvider.hasValidChargeAccount())
        {
            return Observable.error(new NoValidChargeAccountException());
        } else
        {
            return createRideRequest(location);
        }
    }

}
