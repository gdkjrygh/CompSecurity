// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResultDTO;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class val.location
    implements Func1
{

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
            val$location.setAddress(googlegeocoderesponsedto.getShortAddress());
            if (googlegeocoderesponsedto.hasStreetNumber())
            {
                val$location.setRoutableAddress(((GoogleGeocodeResultDTO) (googlegeocoderesponsedto)).formattedAddress);
            }
        }
        return val$location;
    }

    eGeocodeResponseDTO()
    {
        this$0 = final_geoservice;
        val$location = Location.this;
        super();
    }
}
