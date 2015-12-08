// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import java.util.Iterator;
import java.util.Set;
import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.passenger.PassengerRide;
import me.lyft.android.domain.passenger.PassengerRideExpense;
import me.lyft.android.domain.payment.PaymentMapper;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.infrastructure.lyft.ride.RideUpdateRequestDTO;
import me.lyft.android.infrastructure.lyft.ride.ShareRouteDTO;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            IPassengerRideService, IExpenseNoteSession, IRatingSession, IRideRequestSession

public class PassengerRideService
    implements IPassengerRideService
{

    private final ICheckoutSession checkoutSession;
    private final IExpenseNoteSession expenseNoteSession;
    private final ILocationService locationService;
    private final ILyftApi lyftApi;
    private final IPassengerRideProvider passengerRideProvider;
    private final IRatingSession ratingSession;
    private final IRideRequestSession rideRequestSession;

    public PassengerRideService(ILyftApi ilyftapi, IPassengerRideProvider ipassengerrideprovider, ICheckoutSession icheckoutsession, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IRatingSession iratingsession, IExpenseNoteSession iexpensenotesession)
    {
        lyftApi = ilyftapi;
        passengerRideProvider = ipassengerrideprovider;
        checkoutSession = icheckoutsession;
        locationService = ilocationservice;
        rideRequestSession = iriderequestsession;
        ratingSession = iratingsession;
        expenseNoteSession = iexpensenotesession;
    }

    static String marshalImprovementAreas(Set set)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        for (set = set.iterator(); set.hasNext(); stringbuilder.append(s))
        {
            s = (String)set.next();
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(',');
            }
        }

        return stringbuilder.toString();
    }

    public Observable cancelRide(final CancellationOption cancellationOption, int i)
    {
        final PassengerRide passengerRide = passengerRideProvider.getPassengerRide();
        final String cancelStatus;
        final ActionAnalytics analytics;
        if (!Strings.isNullOrEmpty(cancellationOption.getStatus()))
        {
            cancelStatus = cancellationOption.getStatus();
        } else
        if (i != 0)
        {
            cancelStatus = "canceledWithPenalty";
        } else
        {
            cancelStatus = "canceled";
        }
        analytics = RideAnalytics.trackCancelRide(cancelStatus);
        return locationService.getLastLocation().flatMap(new Func1() {

            final PassengerRideService this$0;
            final String val$cancelStatus;
            final CancellationOption val$cancellationOption;
            final PassengerRide val$passengerRide;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.cancelRide(passengerRide.getId(), cancellationOption.getId(), cancelStatus, LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = PassengerRideService.this;
                passengerRide = passengerride;
                cancellationOption = cancellationoption;
                cancelStatus = s;
                super();
            }
        }).doOnNext(new Action1() {

            final PassengerRideService this$0;
            final ActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                analytics.trackSuccess();
            }

            
            {
                this$0 = PassengerRideService.this;
                analytics = actionanalytics;
                super();
            }
        }).doOnError(new Action1() {

            final PassengerRideService this$0;
            final ActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                analytics.trackFailure(throwable);
            }

            
            {
                this$0 = PassengerRideService.this;
                analytics = actionanalytics;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable rateAndDonateDriver(Integer integer, String s, Set set, PassengerRideExpense passengerrideexpense)
    {
        java.util.List list = PaymentMapper.fromPaymentDomain(checkoutSession.getPayments());
        Boolean boolean1;
        String s1;
        if (passengerrideexpense.isNull())
        {
            boolean1 = null;
        } else
        {
            boolean1 = Boolean.valueOf(passengerrideexpense.isConcurEnabled());
        }
        if (passengerrideexpense.isNull())
        {
            s1 = null;
        } else
        {
            s1 = passengerrideexpense.getExpenseNote();
        }
        if (passengerrideexpense.isNull())
        {
            passengerrideexpense = null;
        } else
        {
            passengerrideexpense = passengerrideexpense.getExpenseCode();
        }
        integer = new RideUpdateRequestDTO(list, null, integer, Strings.emptyToNull(s), Strings.emptyToNull(marshalImprovementAreas(set)), boolean1, s1, passengerrideexpense, null, null);
        return lyftApi.rateAndDonateDriver(passengerRideProvider.getPassengerRide().getId(), integer).doOnNext(new Action1() {

            final PassengerRideService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                rideRequestSession.clearRideRequest();
                ratingSession.reset();
                expenseNoteSession.reset();
            }

            
            {
                this$0 = PassengerRideService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable setDropoff(Location location)
    {
        return lyftApi.updateRide(passengerRideProvider.getPassengerRide().getId(), new RideUpdateRequestDTO(null, LocationMapper.fromLocationDomain(location), null, null, null, null, null, null, null, null)).map(Unit.func1());
    }

    public Observable shareRoute()
    {
        return lyftApi.getShareRouteUrl(passengerRideProvider.getPassengerRide().getId()).map(new Func1() {

            final PassengerRideService this$0;

            public volatile Object call(Object obj)
            {
                return call((ShareRouteDTO)obj);
            }

            public String call(ShareRouteDTO shareroutedto)
            {
                return shareroutedto.getShareUrl();
            }

            
            {
                this$0 = PassengerRideService.this;
                super();
            }
        });
    }

    public Observable updateStandby(FixedFare fixedfare)
    {
        fixedfare = new RideUpdateRequestDTO(null, null, null, null, null, null, null, null, fixedfare.getOriginalJson(), fixedfare.getFixedFareToken());
        return lyftApi.updateRide(passengerRideProvider.getPassengerRide().getId(), fixedfare).map(Unit.func1());
    }




}
