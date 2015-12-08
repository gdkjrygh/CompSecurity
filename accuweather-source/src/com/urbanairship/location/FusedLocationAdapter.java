// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.urbanairship.location:
//            LocationAdapter, LocationRequestOptions, PendingLocationResult

class FusedLocationAdapter
    implements LocationAdapter
{
    private class SingleLocationRequest extends PendingLocationResult
    {

        private LocationListener fusedLocationListener;
        private LocationRequest locationRequest;
        final FusedLocationAdapter this$0;

        protected void onCancel()
        {
            Logger.verbose("Fused location canceling single location request.");
            locationClient.removeLocationUpdates(fusedLocationListener);
        }

        SingleLocationRequest(LocationRequestOptions locationrequestoptions)
        {
            this$0 = FusedLocationAdapter.this;
            super();
            locationRequest = createLocationRequest(locationrequestoptions);
            locationRequest.setNumUpdates(1);
            fusedLocationListener = new _cls1();
            Logger.verbose("Fused location starting single location request.");
            locationClient.requestLocationUpdates(locationRequest, fusedLocationListener, Looper.myLooper());
        }
    }


    private Context context;
    private LocationClient locationClient;

    FusedLocationAdapter(Context context1)
    {
        context = context1;
    }

    private LocationRequest createLocationRequest(LocationRequestOptions locationrequestoptions)
    {
        LocationRequest locationrequest = LocationRequest.create().setInterval(locationrequestoptions.getMinTime()).setSmallestDisplacement(locationrequestoptions.getMinDistance());
        switch (locationrequestoptions.getPriority())
        {
        default:
            return locationrequest;

        case 1: // '\001'
            locationrequest.setPriority(100);
            return locationrequest;

        case 2: // '\002'
            locationrequest.setPriority(102);
            return locationrequest;

        case 3: // '\003'
            locationrequest.setPriority(104);
            return locationrequest;

        case 4: // '\004'
            locationrequest.setPriority(105);
            break;
        }
        return locationrequest;
    }

    public void cancelLocationUpdates(PendingIntent pendingintent)
    {
        Logger.verbose("Fused location canceling updates.");
        locationClient.removeLocationUpdates(pendingintent);
    }

    public boolean connect()
    {
        final Object semaphore;
label0:
        {
            semaphore = new Semaphore(0);
            try
            {
                if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
                {
                    break label0;
                }
                Logger.debug("Google Play services is currently unavailable, unable to connect for fused location.");
            }
            // Misplaced declaration of an exception variable
            catch (final Object semaphore)
            {
                Logger.debug((new StringBuilder()).append("Google Play services is currently unavailable, unable to connect for fused location. ").append(((IllegalStateException) (semaphore)).getMessage()).toString());
                return false;
            }
            return false;
        }
        locationClient = new LocationClient(context, new com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks() {

            final FusedLocationAdapter this$0;
            final Semaphore val$semaphore;

            public void onConnected(Bundle bundle)
            {
                Logger.verbose("Google Play services connected for fused location.");
                semaphore.release();
            }

            public void onDisconnected()
            {
                Logger.verbose("Google Play services disconnected for fused location.");
            }

            
            {
                this$0 = FusedLocationAdapter.this;
                semaphore = semaphore1;
                super();
            }
        }, new com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener() {

            final FusedLocationAdapter this$0;
            final Semaphore val$semaphore;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                Logger.verbose("Google Play services failed to connect for fused location.");
                locationClient = null;
                semaphore.release();
            }

            
            {
                this$0 = FusedLocationAdapter.this;
                semaphore = semaphore1;
                super();
            }
        });
        locationClient.connect();
        try
        {
            ((Semaphore) (semaphore)).acquire();
        }
        catch (InterruptedException interruptedexception)
        {
            Logger.error("Exception while connecting to fused location", interruptedexception);
            locationClient.disconnect();
            return false;
        }
        return locationClient.isConnected();
    }

    public void disconnect()
    {
        if (locationClient != null)
        {
            locationClient.disconnect();
            locationClient = null;
        }
    }

    public void requestLocationUpdates(LocationRequestOptions locationrequestoptions, PendingIntent pendingintent)
    {
        Logger.verbose("Fused location requesting updates.");
        locationrequestoptions = createLocationRequest(locationrequestoptions);
        locationClient.requestLocationUpdates(locationrequestoptions, pendingintent);
    }

    public PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions)
    {
        return new SingleLocationRequest(locationrequestoptions);
    }



/*
    static LocationClient access$002(FusedLocationAdapter fusedlocationadapter, LocationClient locationclient)
    {
        fusedlocationadapter.locationClient = locationclient;
        return locationclient;
    }

*/


    // Unreferenced inner class com/urbanairship/location/FusedLocationAdapter$SingleLocationRequest$1

/* anonymous class */
    class SingleLocationRequest._cls1
        implements LocationListener
    {

        final SingleLocationRequest this$1;
        final FusedLocationAdapter val$this$0;

        public void onLocationChanged(Location location)
        {
            setResult(location);
        }

            
            {
                this$1 = final_singlelocationrequest;
                this$0 = FusedLocationAdapter.this;
                super();
            }
    }

}
