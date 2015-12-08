// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public class LocationRetriever
{
    private class LocationUpdateListener
        implements LocationListener
    {

        final LocationRetriever this$0;

        public void onLocationChanged(Location location)
        {
            Log.i("LocationRetriever", "onLocationChanged");
            resolveLocation(location);
            if (matchesTerminateConditions(mLastKnownLocation))
            {
                cancelAllRequests();
                stopTimeoutHandler();
                startSilenceHandler();
                mLocationDataStatus = 0;
            }
            putResult();
        }

        public void onProviderDisabled(String s)
        {
        }

        public void onProviderEnabled(String s)
        {
        }

        public void onStatusChanged(String s, int i, Bundle bundle)
        {
        }

        private LocationUpdateListener()
        {
            this$0 = LocationRetriever.this;
            super();
        }

    }

    static interface OnLocationDataChangedListener
    {

        public abstract void onLocationDataChanged();
    }


    private static final int LOCATION_UPDATE_MIN_DISTANCE = 10;
    private static final int LOCATION_UPDATE_MIN_TIME = 30000;
    private static final int MESSAGE_SILENCE_EXPIRED = 1201;
    private static final int MESSAGE_TIMEOUT = 1200;
    private final String TAG = "LocationRetriever";
    private long mBestLocationAge_ms;
    private Context mContext;
    private boolean mGPSDenied;
    private LocationProvider mGPSProvider;
    private Location mLastKnownLocation;
    private OnLocationDataChangedListener mLocationDataListener;
    private int mLocationDataStatus;
    private DeviceInfo.GeoLocationInfo mLocationInfoBuffer;
    private LocationUpdateListener mLocationListener;
    private LocationManager mLocationManager;
    private int mMaxAccuracy;
    private long mMaxLocationAge_ms;
    private long mMaxTimeout_ms;
    private boolean mNetworkDenied;
    private LocationProvider mNetworkProvider;
    private Handler mSilenceExpiredHandler;
    private long mSilentPeriod_ms;
    private Handler mTimeoutHandler;

    public LocationRetriever()
    {
        mLocationManager = null;
        mGPSProvider = null;
        mNetworkProvider = null;
        mContext = null;
        mMaxTimeout_ms = 0L;
        mBestLocationAge_ms = 0L;
        mMaxLocationAge_ms = 0L;
        mMaxAccuracy = 0;
        mSilentPeriod_ms = 0L;
        mLastKnownLocation = null;
        mLocationListener = null;
        mLocationDataStatus = 0;
        mLocationDataListener = null;
        mTimeoutHandler = new Handler() {

            final LocationRetriever this$0;

            public void handleMessage(Message message)
            {
                handleTimeout();
                super.handleMessage(message);
            }

            
            {
                this$0 = LocationRetriever.this;
                super();
            }
        };
        mSilenceExpiredHandler = new Handler() {

            final LocationRetriever this$0;

            public void handleMessage(Message message)
            {
                handleSilenceExpired();
                super.handleMessage(message);
            }

            
            {
                this$0 = LocationRetriever.this;
                super();
            }
        };
    }

    private void cancelAllRequests()
    {
        Log.i("LocationRetriever", "cancelAllRequests");
        if (mLocationManager != null && mLocationListener != null)
        {
            mLocationManager.removeUpdates(mLocationListener);
        }
    }

    private Location getBetterLocation(Location location, Location location1)
    {
        boolean flag;
        boolean flag1;
        flag = isLocationOk(location);
        flag1 = isLocationOk(location1);
        if (flag || flag1) goto _L2; else goto _L1
_L1:
        Location location2 = null;
_L4:
        return location2;
_L2:
        if (!flag || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = System.currentTimeMillis();
        long l = l1 - location.getTime();
        l1 -= location1.getTime();
        if (l < mBestLocationAge_ms && l1 < mBestLocationAge_ms)
        {
            location2 = location;
            if (location.getAccuracy() >= location1.getAccuracy())
            {
                return location1;
            }
        } else
        {
            location2 = location;
            if (l >= mBestLocationAge_ms)
            {
                if (l1 < mBestLocationAge_ms)
                {
                    return location1;
                }
                location2 = location;
                if (l >= l1)
                {
                    return location1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        location2 = location;
        if (!flag)
        {
            return location1;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private LocationUpdateListener getUpdateListener()
    {
        if (mLocationListener == null)
        {
            mLocationListener = new LocationUpdateListener();
        }
        return mLocationListener;
    }

    private void handleSilenceExpired()
    {
        Log.i("LocationRetriever", "handleSilenceExpired");
        stopTimeoutHandler();
        stopSilenceHandler();
        mLocationDataStatus = 0;
        startLocationUpdate();
    }

    private void handleTimeout()
    {
        Log.i("LocationRetriever", "handleTimeout");
        stopTimeoutHandler();
        stopSilenceHandler();
        mLocationDataStatus = 3;
        cancelAllRequests();
        putResult();
        startSilenceHandler();
    }

    private boolean isLocationOk(Location location)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (location != null)
        {
            flag = flag1;
            if (System.currentTimeMillis() - location.getTime() < mMaxLocationAge_ms)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean matchesTerminateConditions(Location location)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (location != null)
        {
            flag = flag1;
            if (System.currentTimeMillis() - location.getTime() < mBestLocationAge_ms)
            {
                flag = flag1;
                if (location.getAccuracy() <= (float)mMaxAccuracy)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    private void putResult()
    {
        Log.i("LocationRetriever", "putResult");
        mLocationInfoBuffer.set(mLastKnownLocation, mLocationDataStatus);
        if (mLocationDataListener != null)
        {
            mLocationDataListener.onLocationDataChanged();
        }
    }

    private void resolveLocation(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        mLastKnownLocation = getBetterLocation(mLastKnownLocation, location);
        this;
        JVM INSTR monitorexit ;
        return;
        location;
        throw location;
    }

    private void startLocationUpdate()
    {
        Log.i("LocationRetriever", "startLocationUpdate");
        boolean flag1 = false;
        mNetworkDenied = false;
        mGPSDenied = false;
        boolean flag;
        try
        {
            mGPSProvider = mLocationManager.getProvider("gps");
        }
        catch (SecurityException securityexception)
        {
            mGPSDenied = true;
        }
        flag = flag1;
        if (mGPSProvider != null)
        {
            if (mLocationManager.isProviderEnabled("gps"))
            {
                mLocationManager.requestLocationUpdates("gps", 30000L, 10F, getUpdateListener(), Looper.getMainLooper());
                flag = true;
            } else
            {
                mGPSDenied = true;
                flag = flag1;
            }
        }
        try
        {
            mNetworkProvider = mLocationManager.getProvider("network");
        }
        catch (SecurityException securityexception1)
        {
            mNetworkDenied = true;
        }
        if (mNetworkProvider != null && mLocationManager.isProviderEnabled("network"))
        {
            mLocationManager.requestLocationUpdates("network", 30000L, 10F, getUpdateListener(), Looper.getMainLooper());
            flag = true;
        } else
        {
            mNetworkDenied = true;
        }
        if (mGPSDenied && mNetworkDenied)
        {
            mLocationDataStatus = 1;
        }
        if (flag)
        {
            startTimeoutHandler();
        }
    }

    private void startSilenceHandler()
    {
        stopSilenceHandler();
        mSilenceExpiredHandler.sendEmptyMessageDelayed(1201, mSilentPeriod_ms);
    }

    private void startTimeoutHandler()
    {
        stopTimeoutHandler();
        mTimeoutHandler.sendEmptyMessageDelayed(1200, mMaxTimeout_ms);
    }

    private void stopSilenceHandler()
    {
        if (mSilenceExpiredHandler.hasMessages(1201))
        {
            mSilenceExpiredHandler.removeMessages(1201);
        }
    }

    private void stopTimeoutHandler()
    {
        if (mTimeoutHandler.hasMessages(1200))
        {
            mTimeoutHandler.removeMessages(1200);
        }
    }

    void queryLocation(Context context, long l, long l1, long l2, 
            long l3, int i, DeviceInfo.GeoLocationInfo geolocationinfo, OnLocationDataChangedListener onlocationdatachangedlistener)
    {
        Log.i("LocationRetriever", "queryLocation");
        if (geolocationinfo == null)
        {
            Log.e("LocationRetriever", "mobile SDK: internal problem, queryLocation, null locationInfoBuffer");
            return;
        }
        mLocationDataStatus = 0;
        mGPSDenied = false;
        mNetworkDenied = false;
        mContext = context;
        mLocationInfoBuffer = geolocationinfo;
        mLocationDataListener = onlocationdatachangedlistener;
        mLocationManager = (LocationManager)mContext.getSystemService("location");
        mMaxTimeout_ms = 60L * l * 1000L;
        mSilentPeriod_ms = 60L * l1 * 1000L;
        mBestLocationAge_ms = 60L * l2 * 1000L;
        mMaxLocationAge_ms = 24L * l3 * 3600L * 1000L;
        mMaxAccuracy = i;
        try
        {
            mGPSProvider = mLocationManager.getProvider("gps");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mGPSDenied = true;
        }
        if (mGPSProvider != null)
        {
            if (!mLocationManager.isProviderEnabled("gps"))
            {
                mGPSDenied = true;
            }
            try
            {
                resolveLocation(mLocationManager.getLastKnownLocation("gps"));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                mGPSDenied = true;
            }
        } else
        {
            mLocationDataStatus = 4;
        }
        try
        {
            mNetworkProvider = mLocationManager.getProvider("network");
            if (!mLocationManager.isProviderEnabled("network"))
            {
                mNetworkDenied = true;
            }
            resolveLocation(mLocationManager.getLastKnownLocation("network"));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            mNetworkDenied = true;
        }
        if (mGPSDenied && mNetworkDenied)
        {
            mLocationDataStatus = 1;
        }
        putResult();
        startLocationUpdate();
    }

    void release()
    {
        stopTimeoutHandler();
        stopSilenceHandler();
        cancelAllRequests();
        mLocationManager = null;
        mGPSProvider = null;
        mNetworkProvider = null;
        mLocationListener = null;
    }











/*
    static int access$902(LocationRetriever locationretriever, int i)
    {
        locationretriever.mLocationDataStatus = i;
        return i;
    }

*/
}
