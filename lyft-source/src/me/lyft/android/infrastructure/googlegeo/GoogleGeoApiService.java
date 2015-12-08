// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.lyft.android.common.Strings;
import me.lyft.android.infrastructure.api.BaseApi;
import me.lyft.android.infrastructure.api.UrlBuilder;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googlegeo:
//            IGoogleGeoApiService, DistanceMatrixResponseDTO, DistanceMatrixRowDTO, DistanceMatrixElementDTO, 
//            GoogleDurationDTO, GoogleGeoApiException, GoogleGeocodeResponseDTO, GoogleDirectionsResponseDTO, 
//            GoogleLatLngDTO, GoogleGeoResponseDTO

public class GoogleGeoApiService extends BaseApi
    implements IGoogleGeoApiService
{

    private static final String ROOT = "https://maps.googleapis.com/maps/api/";

    public GoogleGeoApiService(OkHttpClient okhttpclient, Gson gson)
    {
        super(okhttpclient, gson);
    }

    private Observable distancematrix(String s, String s1)
    {
        s = (new UrlBuilder("https://maps.googleapis.com/maps/api/distancematrix/json")).addQueryParam("sensor", Boolean.TRUE.toString()).addQueryParam("mode", "driving").addQueryParam("origins", s).addQueryParam("destinations", s1).build();
        return executeGoogleRequest(createRequest().url(s).get(), me/lyft/android/infrastructure/googlegeo/DistanceMatrixResponseDTO);
    }

    private Observable executeGoogleRequest(com.squareup.okhttp.Request.Builder builder, Class class1)
    {
        return executeAsync(builder, class1).flatMap(new Func1() {

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

            
            {
                this$0 = GoogleGeoApiService.this;
                super();
            }
        });
    }

    private static Long getMinimumETA(DistanceMatrixResponseDTO distancematrixresponsedto)
    {
        Object obj;
        obj = null;
        Iterator iterator = distancematrixresponsedto.getRows().iterator();
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                Iterator iterator1 = ((DistanceMatrixRowDTO)iterator.next()).getElements().iterator();
                distancematrixresponsedto = ((DistanceMatrixResponseDTO) (obj));
                do
                {
                    obj = distancematrixresponsedto;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    obj = (DistanceMatrixElementDTO)iterator1.next();
                    if (((DistanceMatrixElementDTO) (obj)).isOk())
                    {
                        obj = ((DistanceMatrixElementDTO) (obj)).duration;
                        if (distancematrixresponsedto == null || distancematrixresponsedto.longValue() > ((GoogleDurationDTO) (obj)).getValue().longValue())
                        {
                            distancematrixresponsedto = ((GoogleDurationDTO) (obj)).getValue();
                        }
                    }
                } while (true);
            }
        } while (true);
        return ((Long) (obj));
    }

    private static Observable getTotalETA(final DistanceMatrixResponseDTO response)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final DistanceMatrixResponseDTO val$response;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    subscriber.onNext(GoogleGeoApiService.getTotalEtaSync(response));
                    subscriber.onCompleted();
                    return;
                }
                catch (Throwable throwable)
                {
                    subscriber.onError(throwable);
                }
            }

            
            {
                response = distancematrixresponsedto;
                super();
            }
        });
    }

    private static Long getTotalEtaSync(DistanceMatrixResponseDTO distancematrixresponsedto)
    {
        String s = "NONE";
        Iterator iterator = distancematrixresponsedto.getRows().iterator();
        long l1 = 0x7fffffffffffffffL;
        distancematrixresponsedto = s;
        long l;
label0:
        for (; iterator.hasNext(); l1 = Math.min(l, l1))
        {
            Object obj = (DistanceMatrixRowDTO)iterator.next();
            l = 0L;
            obj = ((DistanceMatrixRowDTO) (obj)).getElements().iterator();
            DistanceMatrixElementDTO distancematrixelementdto;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    continue label0;
                }
                distancematrixelementdto = (DistanceMatrixElementDTO)((Iterator) (obj)).next();
                if (!distancematrixelementdto.isOk())
                {
                    break;
                }
                l += distancematrixelementdto.duration.getValue().longValue();
            } while (true);
            distancematrixresponsedto = distancematrixelementdto.status;
            l = 0x7fffffffffffffffL;
        }

        if (l1 != 0x7fffffffffffffffL)
        {
            return Long.valueOf(l1);
        } else
        {
            throw new GoogleGeoApiException(distancematrixresponsedto);
        }
    }

    public Observable addressLookupFromZip(String s, String s1)
    {
        s = (new UrlBuilder("https://maps.googleapis.com/maps/api/geocode/json")).addQueryParam("sensor", "true").addQueryParam("address", s).addQueryParam("components", (new StringBuilder()).append("country:").append(s1).toString()).build();
        return executeGoogleRequest(createRequest().url(s).get(), me/lyft/android/infrastructure/googlegeo/GoogleGeocodeResponseDTO);
    }

    protected com.squareup.okhttp.Request.Builder createRequest()
    {
        return new com.squareup.okhttp.Request.Builder();
    }

    public Observable directions(String s, String s1, List list)
    {
        list = Strings.joinWithDelimiter("|", (String[])list.toArray(new String[list.size()]));
        s = (new UrlBuilder("https://maps.googleapis.com/maps/api/directions/json")).addQueryParam("sensor", Boolean.TRUE.toString()).addQueryParam("language", Locale.getDefault().toString()).addQueryParam("mode", "driving").addQueryParam("origin", s).addQueryParam("destination", s1).addQueryParam("waypoints", list).build();
        return executeGoogleRequest(createRequest().url(s).get(), me/lyft/android/infrastructure/googlegeo/GoogleDirectionsResponseDTO).flatMap(new Func1() {

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

            
            {
                this$0 = GoogleGeoApiService.this;
                super();
            }
        });
    }

    public Observable getMinimumEta(String s, List list)
    {
        return distancematrix(Strings.joinWithDelimiter("|", list), s).map(new Func1() {

            final GoogleGeoApiService this$0;

            public Long call(DistanceMatrixResponseDTO distancematrixresponsedto)
            {
                return GoogleGeoApiService.getMinimumETA(distancematrixresponsedto);
            }

            public volatile Object call(Object obj)
            {
                return call((DistanceMatrixResponseDTO)obj);
            }

            
            {
                this$0 = GoogleGeoApiService.this;
                super();
            }
        });
    }

    public Observable getTotalEta(String s, List list)
    {
        return distancematrix(s, Strings.joinWithDelimiter("|", list)).flatMap(new Func1() {

            final GoogleGeoApiService this$0;

            public volatile Object call(Object obj)
            {
                return call((DistanceMatrixResponseDTO)obj);
            }

            public Observable call(DistanceMatrixResponseDTO distancematrixresponsedto)
            {
                return GoogleGeoApiService.getTotalETA(distancematrixresponsedto);
            }

            
            {
                this$0 = GoogleGeoApiService.this;
                super();
            }
        });
    }

    public Observable reverseGeocode(GoogleLatLngDTO googlelatlngdto)
    {
        googlelatlngdto = (new StringBuilder()).append(googlelatlngdto.getLat()).append(",").append(googlelatlngdto.getLng()).toString();
        googlelatlngdto = (new UrlBuilder("https://maps.googleapis.com/maps/api/geocode/json")).addQueryParam("sensor", Boolean.TRUE.toString()).addQueryParam("language", Locale.US.toString()).addQueryParam("latlng", googlelatlngdto).build();
        return executeGoogleRequest(createRequest().url(googlelatlngdto).get(), me/lyft/android/infrastructure/googlegeo/GoogleGeocodeResponseDTO);
    }



}
