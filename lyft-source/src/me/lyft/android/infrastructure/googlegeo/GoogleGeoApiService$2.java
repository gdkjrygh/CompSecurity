// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.List;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoApiService, GoogleDirectionsResponseDTO, GoogleGeoApiException

class this._cls0
    implements Func1
{

    final GoogleGeoApiService this$0;

    public volatile Object call(Object obj)
    {
        return call((GoogleDirectionsResponseDTO)obj);
    }

    public Observable call(GoogleDirectionsResponseDTO googledirectionsresponsedto)
    {
        if (googledirectionsresponsedto.getRoutes().size() > 0)
        {
            return Observable.just(googledirectionsresponsedto);
        } else
        {
            return Observable.error(new GoogleGeoApiException(googledirectionsresponsedto.getStatus(), "No directions found"));
        }
    }

    seDTO()
    {
        this$0 = GoogleGeoApiService.this;
        super();
    }
}
