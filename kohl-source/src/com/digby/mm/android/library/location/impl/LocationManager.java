// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.digby.mm.android.library.location.ILocationManager;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationRequest;

public class LocationManager
    implements ILocationManager
{

    private PendingIntent mCallbackIntent;
    private LocationClient mClient;
    private Context mContext;
    private Handler mHandler;
    private LocationRequest mLocationRequest;
    private Runnable mLocationUpdateRunnable;
    private boolean monitoring;

    public LocationManager(Context context)
    {
        mHandler = new Handler();
        mLocationUpdateRunnable = new Runnable() {

            final LocationManager this$0;

            public void run()
            {
                requestLocationUpdates();
            }

            
            {
                this$0 = LocationManager.this;
                super();
            }
        };
        mContext = context;
        mClient = new LocationClient(mContext, this, this);
        mLocationRequest = new LocationRequest();
        mLocationRequest.setPriority(102);
        mLocationRequest.setInterval(5000L);
        mLocationRequest.setFastestInterval(300L);
        context = new Intent(mContext, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        context.setAction("Action_Location_Updated");
        mCallbackIntent = PendingIntent.getService(mContext, 0, context, 0x8000000);
    }

    private final void requestLocationUpdates()
    {
        if (mClient == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if (mClient.isConnected())
        {
            mClient.removeLocationUpdates(mCallbackIntent);
            mClient.requestLocationUpdates(mLocationRequest, mCallbackIntent);
            monitoring = true;
            return;
        }
        try
        {
            if (!mClient.isConnecting())
            {
                mClient.connect();
                return;
            }
        }
        catch (Exception exception)
        {
            Logger.Error("Error in requestLocationUpdates", exception);
        }
    }

    public boolean isMonitoring()
    {
        return monitoring;
    }

    public void onConnected(Bundle bundle)
    {
        Logger.Debug("LocationManager_onConnected", mContext);
        try
        {
            mClient.removeLocationUpdates(mCallbackIntent);
            mClient.requestLocationUpdates(mLocationRequest, mCallbackIntent);
            monitoring = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.Error("Error in onConnected", bundle);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Logger.Debug("LocationManager_onConnectionFailed", mContext);
        Logger.Debug((new StringBuilder()).append("ConnectionResult: ").append(connectionresult).toString(), mContext);
    }

    public void onDisconnected()
    {
        Logger.Debug("LocationManager_onDisconnected", mContext);
    }

    public void requestLocationUpdates(LocationRequest locationrequest)
    {
        try
        {
            Logger.Debug((new StringBuilder()).append("post handler delayed:").append(locationrequest.getInterval()).append(", request:").append(locationrequest).toString(), mContext);
            mHandler.postDelayed(mLocationUpdateRunnable, locationrequest.getInterval());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequest locationrequest)
        {
            Logger.Error("Error in removeLocationUpdates", locationrequest);
        }
    }

    public void startMonitoring()
    {
        Logger.Debug((new StringBuilder()).append("LocationManager_startMonitoring - instance: ").append(this).toString(), mContext);
        try
        {
            requestLocationUpdates();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in startMonitoring", exception);
        }
    }

    public void stopMontioring()
    {
        Logger.Debug("LocationManager_stopMontioring", mContext);
        if (mClient.isConnected())
        {
            Logger.Debug("LocationManager - remove location updates and disconnect from LocationClient", mContext);
            mHandler.removeCallbacks(mLocationUpdateRunnable);
            mClient.removeLocationUpdates(mCallbackIntent);
            mClient.disconnect();
            monitoring = false;
            return;
        }
        try
        {
            Logger.Debug("LocationManager - LocationClient is already disconnected!!!!", mContext);
            mClient = new LocationClient(mContext, new com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks() {

                final LocationManager this$0;

                public void onConnected(Bundle bundle)
                {
                    try
                    {
                        if (mClient.isConnected())
                        {
                            mClient.removeLocationUpdates(mCallbackIntent);
                            mClient.disconnect();
                            monitoring = false;
                            Logger.Debug("LocationManager - Reconnected and stopped monitoring", mContext);
                        }
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        Logger.Error("Error in onConnected", bundle);
                    }
                }

                public void onDisconnected()
                {
                    Logger.Debug("LocationManager_onDisconnected~~", mContext);
                }

            
            {
                this$0 = LocationManager.this;
                super();
            }
            }, this);
            Logger.Debug("LocationManager - Reconnecting to stop monitoring", mContext);
            mClient.connect();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("Error in stopMontioring", exception);
        }
        return;
    }






/*
    static boolean access$402(LocationManager locationmanager, boolean flag)
    {
        locationmanager.monitoring = flag;
        return flag;
    }

*/
}
