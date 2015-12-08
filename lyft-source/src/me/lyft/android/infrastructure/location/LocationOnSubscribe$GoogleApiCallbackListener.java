// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationOnSubscribe, FailedToConnectException

class subscriber
    implements com.google.android.gms.common.api.tener, com.google.android.gms.common.api.tener
{

    private GoogleApiClient googleApiClient;
    private LocationOnSubscribe locationLocationOnSubscribe;
    private Subscriber subscriber;

    public void onConnected(Bundle bundle)
    {
        locationLocationOnSubscribe.onGoogleApiReady(googleApiClient, subscriber);
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        locationLocationOnSubscribe.onGooglePlayFailed(connectionresult.c());
        connectionresult = new FailedToConnectException(connectionresult.c());
        subscriber.onError(connectionresult);
    }

    public void onConnectionSuspended(int i)
    {
    }

    public void setGoogleApiClient(GoogleApiClient googleapiclient)
    {
        googleApiClient = googleapiclient;
    }

    public (LocationOnSubscribe locationonsubscribe, Subscriber subscriber1)
    {
        locationLocationOnSubscribe = locationonsubscribe;
        subscriber = subscriber1;
    }
}
