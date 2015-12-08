// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.common.Iterables;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.geo.AddressMapper;
import me.lyft.android.domain.geo.Leg;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.location.SphericalUtils;
import me.lyft.android.domain.ride.NearbyDriver;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.infrastructure.googlegeo.GoogleDirectionsResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleGeoApiException;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResultDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleLatLngDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO;
import me.lyft.android.infrastructure.googlegeo.IGoogleGeoApiService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;

// Referenced classes of package me.lyft.android.application.geo:
//            IGeoService, CachedDirections, CachedEta, IEtaRepository, 
//            UnavailableEtdException, IEtaAnalyticService

public class GeoService
    implements IGeoService
{

    private static final long DEFAULT_ROUTE_DRECTIONS_REFRESH_INTERVAL_SEC = 15L;
    private static final Func1 mapToMinutes = new Func1() {

        public Long call(Long long1)
        {
            long l = 1L;
            if (long1.longValue() > 0L)
            {
                long l1 = TimeUnit.SECONDS.toMinutes(long1.longValue());
                if (l1 >= 1L)
                {
                    l = l1;
                }
                return Long.valueOf(l);
            } else
            {
                return Long.valueOf(0L);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((Long)obj);
        }

    };
    private CachedDirections cachedDirections;
    private CachedEta cachedEta;
    private final IConstantsProvider constantsProvider;
    private final IEtaAnalyticService etaAnalyticService;
    private final IEtaRepository etaRepository;
    private final IGoogleGeoApiService googleApiService;
    private final ILyftApi lyftApi;

    public GeoService(ILyftApi ilyftapi, IConstantsProvider iconstantsprovider, IGoogleGeoApiService igooglegeoapiservice, IEtaRepository ietarepository, IEtaAnalyticService ietaanalyticservice)
    {
        cachedEta = null;
        cachedDirections = null;
        lyftApi = ilyftapi;
        constantsProvider = iconstantsprovider;
        googleApiService = igooglegeoapiservice;
        etaRepository = ietarepository;
        etaAnalyticService = ietaanalyticservice;
    }

    private List constructLegsFromSteps(List list)
    {
        return (List)Iterables.aggregate(list, new ArrayList(), new Func2() {

            final GeoService this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((ArrayList)obj, (List)obj1);
            }

            public ArrayList call(ArrayList arraylist, List list1)
            {
                arraylist.add(convertStepToLeg(list1));
                return arraylist;
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
    }

    private Leg convertStepToLeg(List list)
    {
        return (Leg)Iterables.aggregate(list, new Leg(), new Func2() {

            final GeoService this$0;

            public volatile Object call(Object obj, Object obj1)
            {
                return call((Leg)obj, (me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO.Leg.Step)obj1);
            }

            public Leg call(Leg leg, me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO.Leg.Step step)
            {
                leg.addPositions(SphericalUtils.decodeOverviewPolyLineToLatLngs(step.getPolyline()));
                return leg;
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
    }

    private List flattenToListOfSteps(List list)
    {
        return Iterables.select(list, new Func1() {

            final GeoService this$0;

            public volatile Object call(Object obj)
            {
                return call((me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO.Leg)obj);
            }

            public List call(me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO.Leg leg)
            {
                return leg.getSteps();
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
    }

    private Observable googleDirections(List list)
    {
        if (list.isEmpty())
        {
            return Observable.empty();
        }
        Location location = (Location)Iterables.firstOrDefault(list);
        Location location1 = (Location)Iterables.last(list);
        ArrayList arraylist = new ArrayList();
        for (int i = 1; i < list.size() - 1; i++)
        {
            arraylist.add(list.get(i));
        }

        list = Iterables.select(arraylist, new Func1() {

            final GeoService this$0;

            public volatile Object call(Object obj)
            {
                return call((Location)obj);
            }

            public String call(Location location2)
            {
                return location2.toQueryString();
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
        return googleApiService.directions(location.toQueryString(), location1.toQueryString(), list).map(new Func1() {

            final GeoService this$0;

            public volatile Object call(Object obj)
            {
                return call((GoogleDirectionsResponseDTO)obj);
            }

            public List call(GoogleDirectionsResponseDTO googledirectionsresponsedto)
            {
                return translateToLegs(((GoogleRouteDTO)googledirectionsresponsedto.getRoutes().get(0)).getLegs());
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
    }

    private boolean isDirectionsCacheStale(String s, List list)
    {
        long l = ((Long)Objects.firstNonNull(constantsProvider.getConstants().getRouteDirectionsRefreshInterval(), Long.valueOf(15L))).longValue();
        return cachedDirections == null || System.currentTimeMillis() - cachedDirections.getTimestamp() > TimeUnit.SECONDS.toMillis(l) || !isSameRoute(cachedDirections.getRoute(), list) || !Objects.equals(s, cachedDirections.getId());
    }

    private boolean isSameRoute(List list, List list1)
    {
        if (list.size() == list1.size()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= list.size())
                {
                    break label1;
                }
                if (!((Location)list.get(i)).hasSameCoordinates((Location)list1.get(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public Observable addressLookupFromZip(String s, String s1)
    {
        return googleApiService.addressLookupFromZip(s, s1).flatMap(new Func1() {

            final GeoService this$0;

            public volatile Object call(Object obj)
            {
                return call((GoogleGeocodeResponseDTO)obj);
            }

            public Observable call(GoogleGeocodeResponseDTO googlegeocoderesponsedto)
            {
                googlegeocoderesponsedto = googlegeocoderesponsedto.getResults();
                if (googlegeocoderesponsedto != null && !googlegeocoderesponsedto.isEmpty())
                {
                    return Observable.just(AddressMapper.fromGoogleAddressComponentsDTO(((GoogleGeocodeResultDTO)googlegeocoderesponsedto.get(0)).addressComponents));
                } else
                {
                    return Observable.error(new GoogleGeoApiException("No address components returned"));
                }
            }

            
            {
                this$0 = GeoService.this;
                super();
            }
        });
    }

    public Observable directions(final String id, final List route)
    {
        if (isDirectionsCacheStale(id, route))
        {
            return googleDirections(route).doOnNext(new Action1() {

                final GeoService this$0;
                final String val$id;
                final List val$route;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    cachedDirections = new CachedDirections(System.currentTimeMillis(), id, route, list);
                }

            
            {
                this$0 = GeoService.this;
                id = s;
                route = list;
                super();
            }
            });
        } else
        {
            return Observable.just(cachedDirections.getLegs());
        }
    }

    public transient Observable directions(String s, Location alocation[])
    {
        return directions(s, Arrays.asList(alocation));
    }

    public Observable directionsWithDriverLocation(final String id, Location location, final List route)
    {
        if (isDirectionsCacheStale(id, route))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(location);
            arraylist.addAll(route);
            return googleDirections(arraylist).onErrorResumeNext(new Func1() {

                final GeoService this$0;
                final String val$id;

                public volatile Object call(Object obj)
                {
                    return call((Throwable)obj);
                }

                public Observable call(Throwable throwable)
                {
                    return lyftApi.fallbackDirections(id).map(new Func1() {

                        final _cls9 this$1;

                        public volatile Object call(Object obj)
                        {
                            return call((GoogleDirectionsResponseDTO)obj);
                        }

                        public List call(GoogleDirectionsResponseDTO googledirectionsresponsedto)
                        {
                            if (Strings.equalsIgnoreCase(googledirectionsresponsedto.getStatus(), "OVER_QUERY_LIMIT"))
                            {
                                if (cachedDirections != null)
                                {
                                    return cachedDirections.getLegs();
                                } else
                                {
                                    return Collections.emptyList();
                                }
                            }
                            if (!googledirectionsresponsedto.getRoutes().isEmpty())
                            {
                                return translateToLegs(((GoogleRouteDTO)googledirectionsresponsedto.getRoutes().get(0)).getLegs());
                            } else
                            {
                                throw new GoogleGeoApiException("Unable to get response from google api fallback");
                            }
                        }

            
            {
                this$1 = _cls9.this;
                super();
            }
                    });
                }

            
            {
                this$0 = GeoService.this;
                id = s;
                super();
            }
            }).doOnNext(new Action1() {

                final GeoService this$0;
                final String val$id;
                final List val$route;

                public volatile void call(Object obj)
                {
                    call((List)obj);
                }

                public void call(List list)
                {
                    cachedDirections = new CachedDirections(System.currentTimeMillis(), id, route, list);
                }

            
            {
                this$0 = GeoService.this;
                id = s;
                route = list;
                super();
            }
            });
        } else
        {
            return Observable.just(cachedDirections.getLegs());
        }
    }

    public void expireCache()
    {
        cachedEta = new CachedEta(Long.valueOf(0L), Long.valueOf(0L), "");
        cachedDirections = new CachedDirections(0L, "", Collections.emptyList(), Collections.emptyList());
    }

    public Observable getClosestDriverEta(Location location, RequestRideType requestridetype)
    {
        Long long1 = etaRepository.getClosestDriverEta(requestridetype.getId());
        requestridetype = requestridetype.getDrivers();
        if (long1 != null)
        {
            return Observable.just(long1).doOnNext(new Action1() {

                final GeoService this$0;

                public void call(Long long2)
                {
                    etaAnalyticService.record(Boolean.valueOf(true), long2);
                }

                public volatile void call(Object obj)
                {
                    call((Long)obj);
                }

            
            {
                this$0 = GeoService.this;
                super();
            }
            });
        } else
        {
            requestridetype = Iterables.select(requestridetype, new Func1() {

                final GeoService this$0;

                public volatile Object call(Object obj)
                {
                    return call((NearbyDriver)obj);
                }

                public String call(NearbyDriver nearbydriver)
                {
                    return nearbydriver.getLocation().toQueryString();
                }

            
            {
                this$0 = GeoService.this;
                super();
            }
            });
            return googleApiService.getMinimumEta(location.toQueryString(), requestridetype).doOnNext(new Action1() {

                final GeoService this$0;

                public void call(Long long2)
                {
                    etaAnalyticService.record(Boolean.valueOf(false), long2);
                }

                public volatile void call(Object obj)
                {
                    call((Long)obj);
                }

            
            {
                this$0 = GeoService.this;
                super();
            }
            });
        }
    }

    public Observable getDriverEta(final String currentRideId, Location location, List list)
    {
        Long long1 = etaRepository.getEta();
        if (long1 != null)
        {
            currentRideId = Observable.just(long1).doOnNext(new Action1() {

                final GeoService this$0;

                public void call(Long long2)
                {
                    etaAnalyticService.record(Boolean.valueOf(true), long2);
                }

                public volatile void call(Object obj)
                {
                    call((Long)obj);
                }

            
            {
                this$0 = GeoService.this;
                super();
            }
            });
        } else
        if (cachedEta != null && System.currentTimeMillis() - cachedEta.getTimestamp().longValue() < CachedEta.CACHE_TTL.longValue() && Objects.equals(currentRideId, cachedEta.getRideId()))
        {
            currentRideId = Observable.just(cachedEta.getEta());
        } else
        {
            cachedEta = null;
            list = Iterables.select(list, new Func1() {

                final GeoService this$0;

                public volatile Object call(Object obj)
                {
                    return call((Location)obj);
                }

                public String call(Location location1)
                {
                    return location1.toQueryString();
                }

            
            {
                this$0 = GeoService.this;
                super();
            }
            });
            currentRideId = googleApiService.getTotalEta(location.toQueryString(), list).doOnNext(new Action1() {

                final GeoService this$0;
                final String val$currentRideId;

                public void call(Long long2)
                {
                    cachedEta = new CachedEta(Long.valueOf(System.currentTimeMillis()), long2, currentRideId);
                    etaAnalyticService.record(Boolean.valueOf(false), long2);
                }

                public volatile void call(Object obj)
                {
                    call((Long)obj);
                }

            
            {
                this$0 = GeoService.this;
                currentRideId = s;
                super();
            }
            });
        }
        return currentRideId.map(mapToMinutes);
    }

    public transient Observable getDriverEta(String s, Location location, Location alocation[])
    {
        return getDriverEta(s, location, Arrays.asList(alocation));
    }

    public Observable getPassengerEtd(String s, Location location, List list)
    {
        s = etaRepository.getEtd();
        if (s != null)
        {
            return Observable.just(s).map(mapToMinutes);
        } else
        {
            return Observable.error(new UnavailableEtdException("Unable to get etd. No fallback option implemented"));
        }
    }

    public Observable reverseGeocode(final Location location)
    {
        if (!Strings.isNullOrEmpty(location.getAddress()) || location.isNull())
        {
            return Observable.just(location);
        } else
        {
            GoogleLatLngDTO googlelatlngdto = new GoogleLatLngDTO(location.getLat(), location.getLng());
            return googleApiService.reverseGeocode(googlelatlngdto).map(new Func1() {

                final GeoService this$0;
                final Location val$location;

                public volatile Object call(Object obj)
                {
                    return call((GoogleGeocodeResponseDTO)obj);
                }

                public Location call(GoogleGeocodeResponseDTO googlegeocoderesponsedto)
                {
                    googlegeocoderesponsedto = googlegeocoderesponsedto.getBestAddress();
                    if (googlegeocoderesponsedto != null)
                    {
                        location.setAddress(googlegeocoderesponsedto.getShortAddress());
                        if (googlegeocoderesponsedto.hasStreetNumber())
                        {
                            location.setRoutableAddress(((GoogleGeocodeResultDTO) (googlegeocoderesponsedto)).formattedAddress);
                        }
                    }
                    return location;
                }

            
            {
                this$0 = GeoService.this;
                location = location1;
                super();
            }
            });
        }
    }

    public List translateToLegs(List list)
    {
        return constructLegsFromSteps(flattenToListOfSteps(list));
    }




/*
    static CachedEta access$102(GeoService geoservice, CachedEta cachedeta)
    {
        geoservice.cachedEta = cachedeta;
        return cachedeta;
    }

*/



/*
    static CachedDirections access$202(GeoService geoservice, CachedDirections cacheddirections)
    {
        geoservice.cachedDirections = cacheddirections;
        return cacheddirections;
    }

*/


}
