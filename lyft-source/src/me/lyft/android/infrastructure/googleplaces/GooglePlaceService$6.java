// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.Places;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService, GooglePlaceMapper, GooglePlaceException

class val.placeId
    implements rx.e
{

    final GooglePlaceService this$0;
    final String val$placeId;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj = null;
        obj1 = null;
        PlaceBuffer placebuffer = (PlaceBuffer)Places.e.a(GooglePlaceService.access$400(GooglePlaceService.this).getApi(), new String[] {
            val$placeId
        }).b();
        if (!placebuffer.a().f()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if (placebuffer.b() > 0)
        {
            obj = GooglePlaceMapper.fromGooglePlayPlace(placebuffer.b(0));
        }
        subscriber.onNext(obj);
        subscriber.onCompleted();
        if (placebuffer != null)
        {
            placebuffer.f_();
        }
_L4:
        return;
_L2:
        throw new GooglePlaceException((new StringBuilder()).append("GeoDataApi.getPlaceById failed with status: ").append(placebuffer.a().c()).toString());
        Throwable throwable;
        throwable;
_L7:
        obj = placebuffer;
        subscriber.onError(throwable);
        if (placebuffer == null) goto _L4; else goto _L3
_L3:
        placebuffer.f_();
        return;
        subscriber;
_L6:
        if (obj != null)
        {
            ((PlaceBuffer) (obj)).f_();
        }
        throw subscriber;
        subscriber;
        obj = placebuffer;
        if (true) goto _L6; else goto _L5
_L5:
        throwable;
        placebuffer = obj2;
          goto _L7
    }

    ()
    {
        this$0 = final_googleplaceservice;
        val$placeId = String.this;
        super();
    }
}
