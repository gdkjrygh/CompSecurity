// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.TimeUnit;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.LocationServiceAnalytics;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationOnSubscribe, GoogleLocationMapper

public class LocationUpdatesOnSubscribe extends LocationOnSubscribe
{

    private static final long FASTEST_INTERVAL;
    private static final float SMALLEST_DISPLACEMENT = 0F;
    private static final long UPDATE_INTERVAL;
    private LocationListener locationListener;
    private final AsyncActionAnalytics requestUpdatesAction = LocationServiceAnalytics.requestUpdates();

    public LocationUpdatesOnSubscribe(Context context)
    {
        super(context);
    }

    private LocationRequest createLocationUpdateRequest()
    {
        LocationRequest locationrequest = LocationRequest.a();
        locationrequest.a(100);
        locationrequest.a(UPDATE_INTERVAL);
        locationrequest.b(FASTEST_INTERVAL);
        locationrequest.a(0.0F);
        return locationrequest;
    }

    public volatile void call(Subscriber subscriber)
    {
        super.call(subscriber);
    }

    protected void onGoogleApiReady(GoogleApiClient googleapiclient, final Subscriber subscriber)
    {
        locationListener = new LocationListener() {

            final LocationUpdatesOnSubscribe this$0;
            final Subscriber val$subscriber;

            public void onLocationChanged(Location location)
            {
                subscriber.onNext(GoogleLocationMapper.toDomainLocation(location));
            }

            
            {
                this$0 = LocationUpdatesOnSubscribe.this;
                subscriber = subscriber1;
                super();
            }
        };
        LocationServices.b.a(googleapiclient, createLocationUpdateRequest(), locationListener);
    }

    protected void onGooglePlayFailed(int i)
    {
        requestUpdatesAction.trackResponseFailure(String.valueOf(i));
    }

    protected void onUnsubscribed(GoogleApiClient googleapiclient)
    {
        if (googleapiclient.d())
        {
            LocationServices.b.a(googleapiclient, locationListener);
        }
    }

    static 
    {
        UPDATE_INTERVAL = TimeUnit.SECONDS.toMillis(1L);
        FASTEST_INTERVAL = TimeUnit.SECONDS.toMillis(1L);
    }
}
