// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.location.impl;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.digby.mm.android.library.location.IActivityManager;
import com.digby.mm.android.library.services.impl.GeofenceTransitionsService;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.ActivityRecognitionClient;

public class ActivityManager
    implements IActivityManager
{

    private Runnable mActivityUpdateRunnable;
    private PendingIntent mCallbackIntent;
    private ActivityRecognitionClient mClient;
    private Handler mHandler;
    private Service mService;
    private boolean monitoring;

    public ActivityManager(Service service)
    {
        mHandler = new Handler();
        mActivityUpdateRunnable = new Runnable() {

            final ActivityManager this$0;

            public void run()
            {
                requestActivityUpdates();
            }

            
            {
                this$0 = ActivityManager.this;
                super();
            }
        };
        mService = service;
        mClient = new ActivityRecognitionClient(mService, this, this);
        service = new Intent(mService, com/digby/mm/android/library/services/impl/GeofenceTransitionsService);
        service.setAction("Action_Action_Detected");
        mCallbackIntent = PendingIntent.getService(mService, 0, service, 0x8000000);
    }

    private final void requestActivityUpdates()
    {
        Logger.Debug("ActivityManager_requestActivityUpdates", mService);
        if (mClient == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (mClient.isConnected())
        {
            mClient.removeActivityUpdates(mCallbackIntent);
            mClient.requestActivityUpdates(10000L, mCallbackIntent);
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
            Logger.Error("ActivityManager.Error in requestActivityUpdates", exception);
        }
    }

    public boolean isMonitoring()
    {
        return monitoring;
    }

    public void onConnected(Bundle bundle)
    {
        Logger.Debug("ActivityManager_onConnected", mService);
        try
        {
            Logger.Debug("ActivityManager_requestActivityUpdates: 10000", mService);
            mClient.removeActivityUpdates(mCallbackIntent);
            mClient.requestActivityUpdates(10000L, mCallbackIntent);
            monitoring = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.Error("ActivityManager.Error in onConnected", bundle);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        Logger.Debug("ActivityManager_onDisconnected", mService);
    }

    public void onDisconnected()
    {
        Logger.Debug("ActivityManager_onDisconnected", mService);
    }

    public void startMonitoring()
    {
        Logger.Debug((new StringBuilder()).append("ActivityManager_startMonitoring - instance: ").append(this).toString(), mService);
        try
        {
            requestActivityUpdates();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("ActivityManager.Error in startMonitoring", exception);
        }
    }

    public void stopMontioring()
    {
        Logger.Debug("ActivityManager_stopMontioring", mService);
        if (mClient.isConnected())
        {
            Logger.Debug("ActivityManager - remove activity updates and disconnect from ActivityRecognitionClient", mService);
            mHandler.removeCallbacks(mActivityUpdateRunnable);
            mClient.removeActivityUpdates(mCallbackIntent);
            mClient.disconnect();
            monitoring = false;
            return;
        }
        try
        {
            Logger.Debug("ActivityManager - ActivityRecognitionClient is already disconnected!!!!", mService);
            mClient = new ActivityRecognitionClient(mService, new com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks() {

                final ActivityManager this$0;

                public void onConnected(Bundle bundle)
                {
                    try
                    {
                        if (mClient.isConnected())
                        {
                            mClient.removeActivityUpdates(mCallbackIntent);
                            mClient.disconnect();
                            monitoring = false;
                            Logger.Debug("ActivityManager - Reconnected and stopped monitoring", mService);
                        }
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Bundle bundle)
                    {
                        Logger.Error("ActivityManager.Error in onConnected", bundle);
                    }
                }

                public void onDisconnected()
                {
                    Logger.Debug("ActivityManager_onDisconnected~~", mService);
                }

            
            {
                this$0 = ActivityManager.this;
                super();
            }
            }, this);
            Logger.Debug("ActivityManager - Reconnecting to stop monitoring", mService);
            mClient.connect();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("ActivityManager.Error in stopMontioring", exception);
        }
        return;
    }






/*
    static boolean access$402(ActivityManager activitymanager, boolean flag)
    {
        activitymanager.monitoring = flag;
        return flag;
    }

*/
}
