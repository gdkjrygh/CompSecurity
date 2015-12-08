// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceLikelihood;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.Places;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService, GooglePlaceMapper, GooglePlaceException

class this._cls0
    implements rx.e
{

    final GooglePlaceService this$0;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        PlaceLikelihoodBuffer placelikelihoodbuffer = (PlaceLikelihoodBuffer)Places.f.a(GooglePlaceService.access$400(GooglePlaceService.this).getApi(), null).b();
        if (!placelikelihoodbuffer.a().f()) goto _L2; else goto _L1
_L1:
        obj = new ArrayList(placelikelihoodbuffer.b());
        for (Iterator iterator = placelikelihoodbuffer.iterator(); iterator.hasNext(); ((List) (obj)).add(GooglePlaceMapper.fromGooglePlayPlace(((PlaceLikelihood)iterator.next()).b()))) { }
          goto _L3
        Throwable throwable;
        throwable;
_L9:
        obj = placelikelihoodbuffer;
        subscriber.onError(throwable);
        if (placelikelihoodbuffer != null)
        {
            placelikelihoodbuffer.f_();
        }
_L5:
        return;
_L3:
        subscriber.onNext(obj);
        subscriber.onCompleted();
        if (placelikelihoodbuffer == null) goto _L5; else goto _L4
_L4:
        placelikelihoodbuffer.f_();
        return;
_L2:
        throw new GooglePlaceException((new StringBuilder()).append("PlaceDetectionApi.getCurrentPlace failed with status: ").append(placelikelihoodbuffer.a().c()).toString());
        subscriber;
        obj = placelikelihoodbuffer;
_L7:
        if (obj != null)
        {
            ((PlaceLikelihoodBuffer) (obj)).f_();
        }
        throw subscriber;
        subscriber;
        if (true) goto _L7; else goto _L6
_L6:
        throwable;
        placelikelihoodbuffer = obj1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    ()
    {
        this$0 = GooglePlaceService.this;
        super();
    }
}
