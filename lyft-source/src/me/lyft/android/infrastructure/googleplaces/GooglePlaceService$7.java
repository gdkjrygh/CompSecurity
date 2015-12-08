// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService, GooglePlaceException

class val.tag
    implements rx.e
{

    final GooglePlaceService this$0;
    final String val$placeId;
    final String val$tag;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        Object obj;
        obj = PlaceReport.a(val$placeId, val$tag);
        obj = (Status)Places.f.a(GooglePlaceService.access$400(GooglePlaceService.this).getApi(), ((PlaceReport) (obj))).b();
        if (((Status) (obj)).f())
        {
            subscriber.onNext(Unit.create());
            subscriber.onCompleted();
            Analytics.track(new DeveloperEvent("report_place_success"));
            return;
        }
        try
        {
            throw new GooglePlaceException((new StringBuilder()).append("PlaceDetectionApi.reportDeviceAtPlace failed with status: ").append(((Status) (obj)).a().c()).toString());
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
        return;
    }

    ()
    {
        this$0 = final_googleplaceservice;
        val$placeId = s;
        val$tag = String.this;
        super();
    }
}
