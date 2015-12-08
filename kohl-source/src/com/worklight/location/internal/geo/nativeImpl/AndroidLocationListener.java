// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.geo.nativeImpl;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.worklight.common.Logger;
import com.worklight.location.api.geo.WLCoordinate;
import com.worklight.location.api.geo.WLGeoAcquisitionPolicy;
import com.worklight.location.api.geo.WLGeoPosition;
import com.worklight.location.internal.geo.LocationHandler;
import com.worklight.location.internal.geo.NativeLocationListener;
import com.worklight.location.internal.nativeImpl.AndroidRunnableExecutor;

public class AndroidLocationListener
    implements NativeLocationListener, LocationListener
{

    private static final Logger logger = Logger.getInstance(com/worklight/location/internal/geo/nativeImpl/AndroidLocationListener.getName());
    private static AndroidRunnableExecutor runExecutor = new AndroidRunnableExecutor();
    private String TAG;
    private LocationHandler handler;
    protected LocationManager locationManager;
    private WLGeoAcquisitionPolicy policy;
    private String provider;

    public AndroidLocationListener(Context context, LocationHandler locationhandler, WLGeoAcquisitionPolicy wlgeoacquisitionpolicy)
    {
        TAG = "[Worklight Android Location Listener]";
        handler = locationhandler;
        policy = wlgeoacquisitionpolicy;
        locationManager = (LocationManager)context.getSystemService("location");
    }

    private String getProvider()
    {
        Object obj = new Criteria();
        int i;
        if (policy.isEnableHighAccuracy())
        {
            i = policy.getDesiredAccuracy();
            if (i < 100)
            {
                i = 3;
            } else
            if (i <= 500)
            {
                i = 2;
            } else
            {
                i = 1;
            }
        } else
        {
            i = 1;
        }
        ((Criteria) (obj)).setHorizontalAccuracy(i);
        obj = locationManager.getBestProvider(((Criteria) (obj)), true);
        if (obj == null)
        {
            handler.sendError(com.worklight.location.api.geo.WLGeoError.WLGeoErrorCodes.PERMISSION_DENIED, (new StringBuilder()).append("Android couldn't find a location provider for accuracy level ").append(getAccuracyCriteriaString(i)).append(" according to permissions in the Manifest and provider enablements in the device settings").toString());
        } else
        if (i == 3 && ((String) (obj)).equals("network"))
        {
            logger.warn((new StringBuilder()).append("Network provider selected for accuracy level ").append(getAccuracyCriteriaString(i)).append(". Check the manifest for the ACCESS_FINE_LOCATION permission").toString());
            return ((String) (obj));
        }
        return ((String) (obj));
    }

    public void cancelNativeAcquisition()
    {
        runExecutor.execute(new Runnable() {

            final AndroidLocationListener this$0;

            public void run()
            {
                locationManager.removeUpdates(AndroidLocationListener.this);
            }

            
            {
                this$0 = AndroidLocationListener.this;
                super();
            }
        });
    }

    protected WLGeoPosition convertToPosition(Location location)
    {
        double d = location.getLatitude();
        double d1 = location.getLongitude();
        double d2;
        Double double1;
        Double double2;
        Double double3;
        if (location.hasAltitude())
        {
            double1 = Double.valueOf(location.getAltitude());
        } else
        {
            double1 = null;
        }
        d2 = location.getAccuracy();
        if (location.hasBearing())
        {
            double2 = Double.valueOf(location.getBearing());
        } else
        {
            double2 = null;
        }
        if (location.hasSpeed())
        {
            double3 = Double.valueOf(location.getSpeed());
        } else
        {
            double3 = null;
        }
        return new WLGeoPosition(new WLCoordinate(d, d1, double1, d2, null, double2, double3), location.getTime());
    }

    protected String getAccuracyCriteriaString(int i)
    {
        if (i == 3)
        {
            return "ACCURACY_HIGH";
        }
        if (i == 2)
        {
            return "ACCURACY_MEDIUM";
        } else
        {
            return "ACCURACY_LOW";
        }
    }

    public WLGeoPosition getCachedPosition()
    {
        Location location;
        Location location1;
        Object obj;
        obj = null;
        location = null;
        location1 = null;
        Location location2 = locationManager.getLastKnownLocation("gps");
        location = location2;
_L4:
        location2 = locationManager.getLastKnownLocation("network");
        location1 = location2;
_L2:
        if (location != null && location1 != null)
        {
            if (location.getTime() < location1.getTime())
            {
                location = location1;
            }
        } else
        if (location == null)
        {
            location = obj;
            if (location1 != null)
            {
                location = location1;
            }
        }
        if (location != null)
        {
            return convertToPosition(location);
        } else
        {
            return null;
        }
        SecurityException securityexception;
        securityexception;
        if (true) goto _L2; else goto _L1
_L1:
        securityexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onLocationChanged(Location location)
    {
        logger.debug("New location acquired");
        handler.sendAndSetTimeoutTimer(convertToPosition(location));
    }

    public void onProviderDisabled(String s)
    {
        logger.debug((new StringBuilder()).append("Location provider '").append(s).append("' disabled.").toString());
        handler.sendError(com.worklight.location.api.geo.WLGeoError.WLGeoErrorCodes.POSITION_UNAVAILABLE, (new StringBuilder()).append(s).append(" provider disabled.").toString());
    }

    public void onProviderEnabled(String s)
    {
        logger.debug((new StringBuilder()).append("Location provider ").append(s).append(" has been enabled").toString());
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        logger.debug((new StringBuilder()).append("The status of the provider ").append(s).append(" has changed").toString());
        if (i == 0)
        {
            logger.debug((new StringBuilder()).append(s).append(" is OUT OF SERVICE").toString());
            handler.sendError(com.worklight.location.api.geo.WLGeoError.WLGeoErrorCodes.POSITION_UNAVAILABLE, (new StringBuilder()).append("Provider ").append(s).append(" is out of service.").toString());
            return;
        }
        if (i == 1)
        {
            logger.debug((new StringBuilder()).append(s).append(" is TEMPORARILY_UNAVAILABLE").toString());
            return;
        } else
        {
            logger.debug((new StringBuilder()).append(s).append(" is AVAILABLE").toString());
            return;
        }
    }

    public void startNativeAcquisition(final boolean singleAcquisition)
    {
        provider = getProvider();
        if (provider != null)
        {
            runExecutor.execute(new Runnable() {

                final AndroidLocationListener this$0;
                final boolean val$singleAcquisition;

                public void run()
                {
                    if (singleAcquisition)
                    {
                        locationManager.requestSingleUpdate(provider, AndroidLocationListener.this, Looper.myLooper());
                        return;
                    } else
                    {
                        locationManager.requestLocationUpdates(provider, policy.getMinChangeTime(), policy.getMinChangeDistance(), AndroidLocationListener.this);
                        return;
                    }
                }

            
            {
                this$0 = AndroidLocationListener.this;
                singleAcquisition = flag;
                super();
            }
            });
        }
    }



}
