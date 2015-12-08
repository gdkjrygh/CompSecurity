// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.ride;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.DriverAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.infrastructure.googleplaces.IGooglePlaceService;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.CancellationOption;
import me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestBuilder;
import me.lyft.android.infrastructure.lyft.ride.RideUpdateRequestDTO;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.ride:
//            IDriverRouteService, IDriverRideProvider, IRatingSession

public class DriverRouteService
    implements IDriverRouteService
{

    private final IGooglePlaceService googlePlaceService;
    private final ILocationService locationService;
    private final ILyftApi lyftApi;
    private IRatingSession ratingSession;
    private final IDriverRideProvider routeProvider;
    private final IUserProvider userProvider;

    public DriverRouteService(ILyftApi ilyftapi, IDriverRideProvider idriverrideprovider, IUserProvider iuserprovider, ILocationService ilocationservice, IGooglePlaceService igoogleplaceservice, IRatingSession iratingsession)
    {
        lyftApi = ilyftapi;
        routeProvider = idriverrideprovider;
        userProvider = iuserprovider;
        locationService = ilocationservice;
        googlePlaceService = igoogleplaceservice;
        ratingSession = iratingsession;
    }

    private Observable changeRideStatus(final String rideStatus, final String rideId)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final String val$rideId;
            final String val$rideStatus;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.changeRideStatus(rideId, rideStatus, LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                rideId = s;
                rideStatus = s1;
                super();
            }
        }).map(Unit.func1()).first();
    }

    public Observable acceptRoute()
    {
        final AsyncActionAnalytics analytics = DriverAnalytics.trackDriverRideAccept();
        return changeRideStatus("accepted", routeProvider.getDriverRide().getCurrentStop().getRideId()).doOnNext(new Action1() {

            final DriverRouteService this$0;
            final AsyncActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((Unit)obj);
            }

            public void call(Unit unit)
            {
                analytics.trackResponseSuccess();
            }

            
            {
                this$0 = DriverRouteService.this;
                analytics = asyncactionanalytics;
                super();
            }
        }).doOnError(new Action1() {

            final DriverRouteService this$0;
            final AsyncActionAnalytics val$analytics;

            public volatile void call(Object obj)
            {
                call((Throwable)obj);
            }

            public void call(Throwable throwable)
            {
                analytics.trackResponseFailure(throwable);
            }

            
            {
                this$0 = DriverRouteService.this;
                analytics = asyncactionanalytics;
                super();
            }
        });
    }

    public Observable arrive(final Stop stop, final String reason)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final String val$reason;
            final Stop val$stop;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.changeRideStatusToArrived(stop.getRideId(), reason, LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                stop = stop1;
                reason = s;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable cancelRoute(final CancellationOption cancellationOption)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final CancellationOption val$cancellationOption;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.cancelRide(routeProvider.getDriverRide().getCurrentStop().getRideId(), cancellationOption.getId(), cancellationOption.getStatus(), LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                cancellationOption = cancellationoption;
                super();
            }
        }).map(Unit.func1()).first();
    }

    public Observable clearRoute()
    {
        routeProvider.clearRoute();
        return Observable.just(Unit.create());
    }

    public Observable dropoff(final Passenger passenger)
    {
        final String placeId = routeProvider.getDriverRide().getCurrentStop().getLocation().getPlaceId();
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final Passenger val$passenger;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.changeRideStatus(passenger.getRideId(), "droppedOff", LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                passenger = passenger1;
                super();
            }
        }).doOnNext(new Action1() {

            final DriverRouteService this$0;
            final String val$placeId;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                googlePlaceService.reportPlace(placeId, "passenger_dropoff").subscribe(new SimpleSubscriber());
            }

            
            {
                this$0 = DriverRouteService.this;
                placeId = s;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable enterLastRide()
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withDriverLastRide(Boolean.valueOf(true)).build();
        return lyftApi.updateUser(userProvider.getUser().getId(), updateuserrequestdto).map(Unit.func1());
    }

    public Observable exitLastRide()
    {
        me.lyft.android.infrastructure.lyft.profile.UpdateUserRequestDTO updateuserrequestdto = (new UpdateUserRequestBuilder()).withDriverLastRide(Boolean.valueOf(false)).build();
        return lyftApi.updateUser(userProvider.getUser().getId(), updateuserrequestdto).map(Unit.func1());
    }

    public Observable lapseRoute(boolean flag)
    {
        final AsyncActionAnalytics analytics = DriverAnalytics.trackDriverLapseRoute();
        if (flag)
        {
            analytics.trackResponseFailure("driver tried to accept");
            return Observable.just(Unit.create());
        } else
        {
            return changeRideStatus("lapsed", routeProvider.getDriverRide().getCurrentStop().getRideId()).doOnNext(new Action1() {

                final DriverRouteService this$0;
                final AsyncActionAnalytics val$analytics;

                public volatile void call(Object obj)
                {
                    call((Unit)obj);
                }

                public void call(Unit unit)
                {
                    analytics.trackResponseSuccess();
                }

            
            {
                this$0 = DriverRouteService.this;
                analytics = asyncactionanalytics;
                super();
            }
            }).doOnError(new Action1() {

                final DriverRouteService this$0;
                final AsyncActionAnalytics val$analytics;

                public volatile void call(Object obj)
                {
                    call((Throwable)obj);
                }

                public void call(Throwable throwable)
                {
                    analytics.trackResponseFailure(throwable);
                }

            
            {
                this$0 = DriverRouteService.this;
                analytics = asyncactionanalytics;
                super();
            }
            });
        }
    }

    public Observable pickup(final Passenger passenger, final int partySize)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final int val$partySize;
            final Passenger val$passenger;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.changePartySizeAndStatus(passenger.getRideId(), "pickedUp", partySize, LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                passenger = passenger1;
                partySize = i;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable rate(Passenger passenger, int i, String s)
    {
        return lyftApi.ratePassenger(passenger.getRideId(), Integer.valueOf(i), s).doOnNext(new Action1() {

            final DriverRouteService this$0;

            public volatile void call(Object obj)
            {
                call((AppStateDTO)obj);
            }

            public void call(AppStateDTO appstatedto)
            {
                ratingSession.reset();
            }

            
            {
                this$0 = DriverRouteService.this;
                super();
            }
        }).map(Unit.func1());
    }

    public Observable setDropoff(Location location)
    {
        return lyftApi.updateRide(routeProvider.getDriverRide().getCurrentRideId(), new RideUpdateRequestDTO(null, LocationMapper.fromLocationDomain(location), null, null, null, null, null, null, null, null)).map(Unit.func1());
    }

    public Observable skipNoShow(Passenger passenger)
    {
        return changeRideStatus("canceledNoShow", passenger.getRideId());
    }

    public Observable skipWrongPartySize(final Passenger passenger, final int partySize)
    {
        return locationService.getLastLocation().flatMap(new Func1() {

            final DriverRouteService this$0;
            final int val$partySize;
            final Passenger val$passenger;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public Observable call(Location location)
            {
                return lyftApi.changePartySizeAndStatus(passenger.getRideId(), "canceledWrongPartySize", partySize, LocationMapper.fromLocationDomain(location));
            }

            
            {
                this$0 = DriverRouteService.this;
                passenger = passenger1;
                partySize = i;
                super();
            }
        }).map(Unit.func1());
    }




}
