// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import rx.Subscriber;
import rx.functions.Action0;
import rx.subscriptions.Subscriptions;

abstract class LocationOnSubscribe
    implements rx.Observable.OnSubscribe
{

    private Context context;

    public LocationOnSubscribe(Context context1)
    {
        context = context1;
    }

    private GoogleApiClient createApiClient(Subscriber subscriber)
    {
        Object obj = new com.google.android.gms.common.api.GoogleApiClient.Builder(context);
        ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).a(LocationServices.a);
        subscriber = new GoogleApiCallbackListener(subscriber);
        ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).a(subscriber);
        ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).a(subscriber);
        obj = ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).b();
        subscriber.setGoogleApiClient(((GoogleApiClient) (obj)));
        return ((GoogleApiClient) (obj));
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        final GoogleApiClient apiClient = createApiClient(subscriber);
        apiClient.b();
        subscriber.add(Subscriptions.create(new Action0() {

            final LocationOnSubscribe this$0;
            final GoogleApiClient val$apiClient;

            public void call()
            {
                if (apiClient.d() || apiClient.e())
                {
                    onUnsubscribed(apiClient);
                    apiClient.c();
                }
            }

            
            {
                this$0 = LocationOnSubscribe.this;
                apiClient = googleapiclient;
                super();
            }
        }));
    }

    protected abstract void onGoogleApiReady(GoogleApiClient googleapiclient, Subscriber subscriber);

    protected void onGooglePlayFailed(int i)
    {
    }

    protected abstract void onUnsubscribed(GoogleApiClient googleapiclient);

    private class GoogleApiCallbackListener
        implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
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

        public GoogleApiCallbackListener(Subscriber subscriber1)
        {
            locationLocationOnSubscribe = LocationOnSubscribe.this;
            subscriber = subscriber1;
        }
    }

}
