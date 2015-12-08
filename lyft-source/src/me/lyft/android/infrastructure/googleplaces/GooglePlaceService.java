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
import com.google.android.gms.location.places.PlaceBuffer;
import com.google.android.gms.location.places.PlaceDetectionApi;
import com.google.android.gms.location.places.PlaceLikelihood;
import com.google.android.gms.location.places.PlaceLikelihoodBuffer;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.analytics.Analytics;
import me.lyft.android.analytics.DeveloperEvent;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.googleplay.IGoogleApiProvider;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            IGooglePlaceService, GooglePlaceMapper, GooglePlaceException

public class GooglePlaceService
    implements IGooglePlaceService
{

    private final IGoogleApiProvider googleApiProvider;

    public GooglePlaceService(IGoogleApiProvider igoogleapiprovider)
    {
        googleApiProvider = igoogleapiprovider;
    }

    private Observable createCurrentPlacesRequest()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

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
                PlaceLikelihoodBuffer placelikelihoodbuffer = (PlaceLikelihoodBuffer)Places.f.a(googleApiProvider.getApi(), null).b();
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

            
            {
                this$0 = GooglePlaceService.this;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    private Observable createPlaceDetailsRequest(final String placeId)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

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
                PlaceBuffer placebuffer = (PlaceBuffer)Places.e.a(googleApiProvider.getApi(), new String[] {
                    placeId
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

            
            {
                this$0 = GooglePlaceService.this;
                placeId = s;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    private Observable createQueryPlacesRequest(final String query, Location location, List list)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

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
                AutocompletePredictionBuffer autocompletepredictionbuffer = (AutocompletePredictionBuffer)Places.e.a(googleApiProvider.getApi(), query, bounds, options).b();
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

            
            {
                this$0 = GooglePlaceService.this;
                query = s;
                bounds = latlngbounds;
                options = autocompletefilter;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    private Observable createReportPlaceRequest(final String placeId, final String tag)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

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
                obj = PlaceReport.a(placeId, tag);
                obj = (Status)Places.f.a(googleApiProvider.getApi(), ((PlaceReport) (obj))).b();
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

            
            {
                this$0 = GooglePlaceService.this;
                placeId = s;
                tag = s1;
                super();
            }
        }).subscribeOn(Schedulers.io());
    }

    public Observable getCurrentPlaces()
    {
        return googleApiProvider.observeReady().flatMap(new Func1() {

            final GooglePlaceService this$0;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return createCurrentPlacesRequest();
            }

            
            {
                this$0 = GooglePlaceService.this;
                super();
            }
        });
    }

    public Observable getPlaceDetails(final String placeId)
    {
        return googleApiProvider.observeReady().flatMap(new Func1() {

            final GooglePlaceService this$0;
            final String val$placeId;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return createPlaceDetailsRequest(placeId);
            }

            
            {
                this$0 = GooglePlaceService.this;
                placeId = s;
                super();
            }
        });
    }

    public Observable queryPlaces(String s, Location location)
    {
        return queryPlaces(s, location, null);
    }

    public Observable queryPlaces(final String query, final Location center, final List placeTypeCodes)
    {
        return googleApiProvider.observeReady().flatMap(new Func1() {

            final GooglePlaceService this$0;
            final Location val$center;
            final List val$placeTypeCodes;
            final String val$query;

            public volatile Object call(Object obj)
            {
                return call((Unit)obj);
            }

            public Observable call(Unit unit)
            {
                return createQueryPlacesRequest(query, center, placeTypeCodes);
            }

            
            {
                this$0 = GooglePlaceService.this;
                query = s;
                center = location;
                placeTypeCodes = list;
                super();
            }
        });
    }

    public Observable reportPlace(final String placeId, final String tag)
    {
        if (Strings.isNullOrEmpty(placeId))
        {
            return Observable.empty();
        } else
        {
            Analytics.track(new DeveloperEvent("report_place_attempt"));
            return googleApiProvider.observeReady().flatMap(new Func1() {

                final GooglePlaceService this$0;
                final String val$placeId;
                final String val$tag;

                public volatile Object call(Object obj)
                {
                    return call((Unit)obj);
                }

                public Observable call(Unit unit)
                {
                    return createReportPlaceRequest(placeId, tag);
                }

            
            {
                this$0 = GooglePlaceService.this;
                placeId = s;
                tag = s1;
                super();
            }
            });
        }
    }





}
