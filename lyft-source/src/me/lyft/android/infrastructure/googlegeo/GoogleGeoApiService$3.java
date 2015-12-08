// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            GoogleGeoApiService, DistanceMatrixResponseDTO

class this._cls0
    implements Func1
{

    final GoogleGeoApiService this$0;

    public Long call(DistanceMatrixResponseDTO distancematrixresponsedto)
    {
        return GoogleGeoApiService.access$000(distancematrixresponsedto);
    }

    public volatile Object call(Object obj)
    {
        return call((DistanceMatrixResponseDTO)obj);
    }

    DTO()
    {
        this$0 = GoogleGeoApiService.this;
        super();
    }
}
