// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationServices;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.analytics.studies.LocationServiceAnalytics;
import me.lyft.android.domain.location.NullLocation;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationOnSubscribe, GoogleLocationMapper

public class LastKnownLocationOnSubscribe extends LocationOnSubscribe
{

    private final AsyncActionAnalytics lastKnownLocationAction = LocationServiceAnalytics.lastKnownLocation();

    public LastKnownLocationOnSubscribe(Context context)
    {
        super(context);
    }

    public volatile void call(Subscriber subscriber)
    {
        super.call(subscriber);
    }

    protected void onGoogleApiReady(GoogleApiClient googleapiclient, Subscriber subscriber)
    {
        googleapiclient = LocationServices.b.a(googleapiclient);
        if (googleapiclient == null)
        {
            subscriber.onNext(NullLocation.getInstance());
        } else
        {
            subscriber.onNext(GoogleLocationMapper.toDomainLocation(googleapiclient));
        }
        subscriber.onCompleted();
    }

    protected void onGooglePlayFailed(int i)
    {
        super.onGooglePlayFailed(i);
        lastKnownLocationAction.trackResponseFailure(String.valueOf(i));
    }

    protected void onUnsubscribed(GoogleApiClient googleapiclient)
    {
    }
}
