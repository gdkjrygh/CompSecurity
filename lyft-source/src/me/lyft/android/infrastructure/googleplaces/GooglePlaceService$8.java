// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.AutocompletePrediction;
import com.google.android.gms.location.places.AutocompletePredictionBuffer;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService, GooglePlaceMapper, GooglePlaceException

class val.options
    implements rx.e
{

    final GooglePlaceService this$0;
    final LatLngBounds val$bounds;
    final AutocompleteFilter val$options;
    final String val$query;

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
        AutocompletePredictionBuffer autocompletepredictionbuffer = (AutocompletePredictionBuffer)Places.e.a(GooglePlaceService.access$400(GooglePlaceService.this).getApi(), val$query, val$bounds, val$options).b();
        if (!autocompletepredictionbuffer.a().f()) goto _L2; else goto _L1
_L1:
        obj = new ArrayList(autocompletepredictionbuffer.b());
        for (Iterator iterator = autocompletepredictionbuffer.iterator(); iterator.hasNext(); ((List) (obj)).add(GooglePlaceMapper.fromGooglePlayAutomcomplete((AutocompletePrediction)iterator.next()))) { }
          goto _L3
        Throwable throwable;
        throwable;
_L9:
        obj = autocompletepredictionbuffer;
        subscriber.onError(throwable);
        if (autocompletepredictionbuffer != null)
        {
            autocompletepredictionbuffer.f_();
        }
_L5:
        return;
_L3:
        subscriber.onNext(obj);
        subscriber.onCompleted();
        if (autocompletepredictionbuffer == null) goto _L5; else goto _L4
_L4:
        autocompletepredictionbuffer.f_();
        return;
_L2:
        throw new GooglePlaceException((new StringBuilder()).append("GeoDataApi.getAutocompletePredictions failed with status: ").append(autocompletepredictionbuffer.a().c()).toString());
        subscriber;
        obj = autocompletepredictionbuffer;
_L7:
        if (obj != null)
        {
            ((AutocompletePredictionBuffer) (obj)).f_();
        }
        throw subscriber;
        subscriber;
        if (true) goto _L7; else goto _L6
_L6:
        throwable;
        autocompletepredictionbuffer = obj1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    er()
    {
        this$0 = final_googleplaceservice;
        val$query = s;
        val$bounds = latlngbounds;
        val$options = AutocompleteFilter.this;
        super();
    }
}
