// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoApiService, DistanceMatrixResponseDTO

final class val.response
    implements rx.
{

    final DistanceMatrixResponseDTO val$response;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            subscriber.onNext(GoogleGeoApiService.access$200(val$response));
            subscriber.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    DTO()
    {
        val$response = distancematrixresponsedto;
        super();
    }
}
