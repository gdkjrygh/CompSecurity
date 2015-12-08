// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.List;
import me.lyft.android.domain.geo.AddressMapper;
import me.lyft.android.infrastructure.googlegeo.GoogleGeoApiException;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleGeocodeResultDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService

class this._cls0
    implements Func1
{

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

    eGeocodeResponseDTO()
    {
        this$0 = GeoService.this;
        super();
    }
}
