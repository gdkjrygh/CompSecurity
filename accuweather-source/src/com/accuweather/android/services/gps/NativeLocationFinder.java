// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.accuweather.android.utilities.Logger;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.services.gps:
//            BaseLocationFinder, ILocationListener, LocationProviderException

public class NativeLocationFinder extends BaseLocationFinder
{
    protected class GpsTimeoutTask extends TimerTask
    {

        IGpsTimerTaskListener _listener;
        Timer _timer;
        final NativeLocationFinder this$0;

        public void run()
        {
            _timer.cancel();
            _listener.onTimeout();
        }

        void setTimer(Timer timer)
        {
            _timer = timer;
        }

        public GpsTimeoutTask(Timer timer, IGpsTimerTaskListener igpstimertasklistener)
        {
            this$0 = NativeLocationFinder.this;
            super();
            _timer = timer;
            _listener = igpstimertasklistener;
        }
    }

    private static interface IGpsTimerTaskListener
    {

        public abstract void onTimeout();
    }

    private class SingleUpdateListener
        implements LocationListener
    {

        final NativeLocationFinder this$0;

        public void onLocationChanged(Location location)
        {
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

        private SingleUpdateListener()
        {
            this$0 = NativeLocationFinder.this;
            super();
        }

    }


    private static final long GPS_TIMEOUT_MILLIS = 28000L;
    private LocationListener gpsListener;
    private Timer mGpsTimeoutTimer;
    protected ILocationListener mLocationListener;
    protected LocationManager mLocationManager;
    private LocationListener networkListener;

    public NativeLocationFinder(Context context)
    {
        super(context);
        networkListener = new SingleUpdateListener() {

            final NativeLocationFinder this$0;

            public void onLocationChanged(Location location)
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), "In networkListener onLocationChanged().");
                }
                handleLocationChanged(location);
            }

            
            {
                this$0 = NativeLocationFinder.this;
                super();
            }
        };
        gpsListener = new SingleUpdateListener() {

            final NativeLocationFinder this$0;

            public void onLocationChanged(Location location)
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), "In gpsListener onLocationChanged().");
                }
                handleLocationChanged(location);
            }

            
            {
                this$0 = NativeLocationFinder.this;
                super();
            }
        };
        mLocationManager = (LocationManager)context.getSystemService("location");
    }

    private void cancelTimeoutTimer()
    {
        if (mGpsTimeoutTimer != null)
        {
            mGpsTimeoutTimer.cancel();
        }
    }

    private Location getLastKnownLocation()
    {
        Location location;
        Location location1;
        location1 = null;
        location = null;
        LocationManager locationmanager = getLocationManager();
        if (isGpsProviderEnabled(locationmanager))
        {
            location = locationmanager.getLastKnownLocation("gps");
        }
        if (isNetworkProviderEnabled(locationmanager))
        {
            location1 = locationmanager.getLastKnownLocation("network");
        }
        if (location == null || location1 == null) goto _L2; else goto _L1
_L1:
        if (location.getTime() <= location1.getTime()) goto _L4; else goto _L3
_L3:
        return location;
_L4:
        return location1;
_L2:
        if (location == null)
        {
            if (location1 != null)
            {
                return location1;
            } else
            {
                return getLastFoundLocation();
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private LocationManager getLocationManager()
    {
        return (LocationManager)mContext.getSystemService("location");
    }

    private void handleLocationChanged(Location location)
    {
        cancel();
        if (location != null)
        {
            saveLastLocationFix(location);
        }
        if (mLocationListener != null && location != null)
        {
            if (Logger.isDebugEnabled())
            {
                Logger.d(getClass().getName(), "onLocationChanged");
            }
            mLocationListener.onLocationChanged(location);
        }
    }

    private boolean isGpsProviderEnabled(LocationManager locationmanager)
    {
        return locationmanager.isProviderEnabled("gps");
    }

    private boolean isNetworkProviderEnabled(LocationManager locationmanager)
    {
        return locationmanager.isProviderEnabled("network");
    }

    private void requestGpsUpdate(LocationManager locationmanager)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), "About to request gps location update.");
        }
        locationmanager.requestLocationUpdates("gps", 0L, 0.0F, gpsListener);
    }

    private void requestNetworkUpdate(LocationManager locationmanager)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), "About to request network location update.");
        }
        locationmanager.requestLocationUpdates("network", 0L, 0.0F, networkListener);
    }

    private void setGpsTimer()
    {
        cancelTimeoutTimer();
        mGpsTimeoutTimer = new Timer();
        GpsTimeoutTask gpstimeouttask = new GpsTimeoutTask(mGpsTimeoutTimer, new IGpsTimerTaskListener() {

            final NativeLocationFinder this$0;

            public void onTimeout()
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), "in onTimeout().");
                }
                cancel();
                if (mLocationListener != null)
                {
                    Location location = getLastKnownLocation();
                    if (location != null)
                    {
                        mLocationListener.onLocationChanged(location);
                    }
                }
            }

            
            {
                this$0 = NativeLocationFinder.this;
                super();
            }
        });
        mGpsTimeoutTimer.schedule(gpstimeouttask, 28000L);
    }

    public void cancel()
    {
        cancelTimeoutTimer();
        mLocationManager.removeUpdates(networkListener);
        mLocationManager.removeUpdates(gpsListener);
    }

    public void findLocation()
    {
        Object obj = getLastFoundUnexpiredLocation();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (mLocationListener != null)
        {
            mLocationListener.onLocationChanged(((Location) (obj)));
        }
_L4:
        return;
_L2:
        boolean flag;
        boolean flag1;
        obj = getLocationManager();
        flag = isNetworkProviderEnabled(((LocationManager) (obj)));
        flag1 = isGpsProviderEnabled(((LocationManager) (obj)));
        if (flag || flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mLocationListener != null)
        {
            mLocationListener.onLocationFixError(new LocationProviderException());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        setGpsTimer();
        if (flag)
        {
            requestNetworkUpdate(((LocationManager) (obj)));
        }
        if (flag1)
        {
            requestGpsUpdate(((LocationManager) (obj)));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void setLocationListener(ILocationListener ilocationlistener)
    {
        mLocationListener = ilocationlistener;
    }


}
