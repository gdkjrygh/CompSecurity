// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.googlegeo.GoogleDirectionsResponseDTO;
import me.lyft.android.infrastructure.googlegeo.GoogleGeoApiException;
import me.lyft.android.infrastructure.googlegeo.GoogleRouteDTO;
import me.lyft.android.infrastructure.lyft.ILyftApi;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.geo:
//            GeoService, CachedDirections

class val.id
    implements Func1
{

    final GeoService this$0;
    final String val$id;

    public volatile Object call(Object obj)
    {
        return call((Throwable)obj);
    }

    public Observable call(Throwable throwable)
    {
        return GeoService.access$300(GeoService.this).fallbackDirections(val$id).map(new Func1() {

            final GeoService._cls9 this$1;

            public volatile Object call(Object obj)
            {
                return call((GoogleDirectionsResponseDTO)obj);
            }

            public List call(GoogleDirectionsResponseDTO googledirectionsresponsedto)
            {
                if (Strings.equalsIgnoreCase(googledirectionsresponsedto.getStatus(), "OVER_QUERY_LIMIT"))
                {
                    if (GeoService.access$200(this$0) != null)
                    {
                        return GeoService.access$200(this$0).getLegs();
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
                this$1 = GeoService._cls9.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_geoservice;
        val$id = String.this;
        super();
    }
}
