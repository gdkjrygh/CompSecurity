// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoApiService, GoogleGeoResponseDTO, GoogleGeoApiException

class this._cls0
    implements Func1
{

    final GoogleGeoApiService this$0;

    public volatile Object call(Object obj)
    {
        return call((GoogleGeoResponseDTO)obj);
    }

    public Observable call(GoogleGeoResponseDTO googlegeoresponsedto)
    {
        if (googlegeoresponsedto.isOK())
        {
            return Observable.just(googlegeoresponsedto);
        } else
        {
            return Observable.error(new GoogleGeoApiException(googlegeoresponsedto.getStatus()));
        }
    }

    ()
    {
        this$0 = GoogleGeoApiService.this;
        super();
    }
}
