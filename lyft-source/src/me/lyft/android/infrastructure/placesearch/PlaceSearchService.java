// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.placesearch;

import java.util.List;
import me.lyft.android.domain.location.LocationMapper;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.placesearch:
//            IPlaceSearchService, PlaceSearchResponseDTO

public class PlaceSearchService
    implements IPlaceSearchService
{

    private ILocationService locationService;
    private ILyftApi lyftApi;

    public PlaceSearchService(ILyftApi ilyftapi, ILocationService ilocationservice)
    {
        lyftApi = ilyftapi;
        locationService = ilocationservice;
    }

    public Observable placeSearchFallback(String s)
    {
        if (Features.SEARCH_FALLBACK.isEnabled())
        {
            me.lyft.android.infrastructure.lyft.location.LocationDTO locationdto = LocationMapper.fromLocationDomain(locationService.getLastCachedLocation());
            if (locationdto != null)
            {
                return lyftApi.placeSearch(s, locationdto).map(new Func1() {

                    final PlaceSearchService this$0;

                    public volatile Object call(Object obj)
                    {
                        return call((PlaceSearchResponseDTO)obj);
                    }

                    public List call(PlaceSearchResponseDTO placesearchresponsedto)
                    {
                        return placesearchresponsedto.toDomainLocations();
                    }

            
            {
                this$0 = PlaceSearchService.this;
                super();
            }
                });
            }
        }
        return Observable.empty();
    }
}
