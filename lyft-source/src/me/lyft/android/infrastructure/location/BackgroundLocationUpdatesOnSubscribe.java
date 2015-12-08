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
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationOnSubscribe, GoogleLocationMapper

public class BackgroundLocationUpdatesOnSubscribe extends LocationOnSubscribe
{

    private static final long FASTEST_INTERVAL_MILLIS;
    private static final float SMALLEST_DISPLACEMENT = 500F;
    private static final long UPDATE_INTERVAL_MILLIS;
    private LocationListener locationListener;

    public BackgroundLocationUpdatesOnSubscribe(Context context)
    {
        super(context);
    }

    private LocationRequest createLocationUpdateRequest()
    {
        LocationRequest locationrequest = LocationRequest.a();
        locationrequest.a(102);
        locationrequest.a(UPDATE_INTERVAL_MILLIS);
        locationrequest.b(FASTEST_INTERVAL_MILLIS);
        locationrequest.a(500F);
        return locationrequest;
    }

    public volatile void call(Subscriber subscriber)
    {
        super.call(subscriber);
    }

    protected void onGoogleApiReady(GoogleApiClient googleapiclient, final Subscriber subscriber)
    {
        locationListener = new LocationListener() {

            final BackgroundLocationUpdatesOnSubscribe this$0;
            final Subscriber val$subscriber;

            public void onLocationChanged(Location location)
            {
                subscriber.onNext(GoogleLocationMapper.toDomainLocation(location));
            }

            
            {
                this$0 = BackgroundLocationUpdatesOnSubscribe.this;
                subscriber = subscriber1;
                super();
            }
        };
        LocationServices.b.a(googleapiclient, createLocationUpdateRequest(), locationListener);
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
        UPDATE_INTERVAL_MILLIS = TimeUnit.MINUTES.toMillis(10L);
        FASTEST_INTERVAL_MILLIS = TimeUnit.MINUTES.toMillis(10L);
    }
}
