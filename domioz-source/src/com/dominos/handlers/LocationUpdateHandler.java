// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.handlers;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.ford.syncV4.e.c.s;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.e;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.d;
import com.google.android.gms.location.j;
import com.google.android.gms.location.k;
import java.util.Calendar;
import java.util.List;

public class LocationUpdateHandler
    implements LocationListener, n, o, j
{

    private static final String LOG_TAG = com/dominos/handlers/LocationUpdateHandler.getSimpleName();
    private static final float UPDATE_MIN_DISTANCE = 5F;
    private static final long UPDATE_MIN_INTERVAL = 25000L;
    private final Context mContext;
    private Location mLastLocation;
    private l mLocationClient;
    private OnLocationDataListener mLocationDataListener;
    LocationManager mLocationManager;

    public LocationUpdateHandler(Context context)
    {
        mContext = context;
    }

    private boolean isBetterLocation(Location location)
    {
        boolean flag4 = true;
        this;
        JVM INSTR monitorenter ;
        Location location1 = mLastLocation;
        boolean flag3 = flag4;
        if (location1 == null) goto _L2; else goto _L1
_L1:
        if (location != null) goto _L4; else goto _L3
_L3:
        flag3 = flag4;
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag3;
_L4:
        long l1;
        l1 = location.getTime() - mLastLocation.getTime();
        break MISSING_BLOCK_LABEL_45;
_L15:
        int i = (int)(location.getAccuracy() - mLastLocation.getAccuracy());
        boolean flag2;
        if (i > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L5
_L12:
        flag5 = StringHelper.equals(location.getProvider(), mLastLocation.getProvider());
        flag3 = flag4;
        if (flag2) goto _L2; else goto _L6
_L6:
        if (!flag) goto _L8; else goto _L7
_L7:
        flag3 = flag4;
        if (!flag1) goto _L2; else goto _L8
_L8:
        if (!flag || i != 0) goto _L10; else goto _L9
_L9:
        flag3 = flag4;
        if (flag5) goto _L2; else goto _L10
_L10:
        flag3 = false;
          goto _L2
_L17:
        flag2 = false;
          goto _L11
_L19:
        i = 0;
          goto _L12
        location;
        throw location;
        boolean flag;
        boolean flag1;
        boolean flag5;
        if (l1 > 0x1d4c0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l1 < 0xfffffffffffe2b40L)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = flag4;
        if (flag1) goto _L2; else goto _L13
_L13:
        if (!flag2) goto _L15; else goto _L14
_L14:
        flag3 = false;
          goto _L2
_L5:
        if (i >= 0) goto _L17; else goto _L16
_L16:
        flag2 = true;
_L11:
        if (i <= 200) goto _L19; else goto _L18
_L18:
        i = 1;
          goto _L12
    }

    private boolean isGooglePlayServicesEnabled()
    {
        return e.a(mContext) == 0;
    }

    public boolean canUseLocationServices()
    {
        while (mLocationClient != null && mLocationClient.f() && mLastLocation != null || mLocationManager.isProviderEnabled("gps") || mLocationManager.isProviderEnabled("network")) 
        {
            return true;
        }
        return false;
    }

    public void dispose()
    {
        if (isGooglePlayServicesEnabled() && mLocationClient != null)
        {
            mLocationClient.e();
            return;
        } else
        {
            mLocationManager.removeUpdates(this);
            return;
        }
    }

    public Location getLastLocation()
    {
        return mLastLocation;
    }

    public boolean isConnecting()
    {
        return mLocationClient != null && mLocationClient.g();
    }

    public boolean isLocationProviderAvailable()
    {
        List list = mLocationManager.getAllProviders();
        return list.contains("gps") || list.contains("network");
    }

    public void onConnected(Bundle bundle)
    {
        LogUtil.v(LOG_TAG, "onConnected: %s", new Object[] {
            bundle
        });
        bundle = LocationRequest.a();
        bundle.c();
        bundle.b();
        k.b.a(mLocationClient, bundle, this);
        bundle = k.b.a(mLocationClient);
        if (isBetterLocation(bundle))
        {
            mLastLocation = bundle;
        }
        if (mLocationDataListener != null)
        {
            mLocationDataListener.onLocationCompleted(mLastLocation);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        LogUtil.v(LOG_TAG, "onConnectionFailed: %s", new Object[] {
            connectionresult
        });
    }

    public void onConnectionSuspended(int i)
    {
        LogUtil.v(LOG_TAG, "onConnectionSuspended", new Object[0]);
    }

    public void onLocationChanged(Location location)
    {
        LogUtil.v(LOG_TAG, "onLocationChanged: %s", new Object[] {
            location
        });
        if (isBetterLocation(location))
        {
            mLastLocation = location;
        }
    }

    public void onProviderDisabled(String s1)
    {
        LogUtil.v(LOG_TAG, "onProviderDisabled: %s", new Object[] {
            s1
        });
    }

    public void onProviderEnabled(String s1)
    {
        LogUtil.v(LOG_TAG, "onProviderEnabled: %s", new Object[] {
            s1
        });
    }

    public void onStatusChanged(String s1, int i, Bundle bundle)
    {
        LogUtil.v(LOG_TAG, "onStatusChanged: %s, %d, %s", new Object[] {
            s1, Integer.valueOf(i), bundle
        });
    }

    protected void requestLocationUpdates()
    {
        if (isGooglePlayServicesEnabled())
        {
            mLocationClient = (new m(mContext)).a(k.a).a(this).a(this).c();
            mLocationClient.c();
        } else
        {
            mLastLocation = mLocationManager.getLastKnownLocation("network");
            if (mLastLocation == null)
            {
                mLastLocation = mLocationManager.getLastKnownLocation("gps");
                if (mLastLocation == null)
                {
                    mLastLocation = mLocationManager.getLastKnownLocation("passive");
                }
            }
            if (mLocationManager.getProvider("network") != null)
            {
                mLocationManager.requestLocationUpdates("network", 25000L, 5F, this);
                return;
            }
            if (mLocationManager.getProvider("gps") != null)
            {
                mLocationManager.requestLocationUpdates("gps", 25000L, 5F, this);
                return;
            }
            if (mLocationManager.getProvider("passive") != null)
            {
                mLocationManager.requestLocationUpdates("passive", 25000L, 5F, this);
                return;
            }
        }
    }

    public void setLocationCompletedListener(OnLocationDataListener onlocationdatalistener)
    {
        mLocationDataListener = onlocationdatalistener;
    }

    public void updateLocationViaVehicle(s s1)
    {
        this;
        JVM INSTR monitorenter ;
        Location location = new Location("FORDSYNC");
        location.setLatitude(s1.b().doubleValue());
        location.setLongitude(s1.a().doubleValue());
        location.setAltitude(s1.l().doubleValue());
        location.setAccuracy(s1.k().floatValue() * 5F);
        location.setBearing(s1.m().floatValue());
        location.setSpeed(s1.n().floatValue());
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(s1.c().intValue(), s1.d().intValue() - 1, s1.e().intValue(), s1.f().intValue(), s1.i().intValue(), s1.j().intValue());
        location.setTime(calendar.getTimeInMillis());
        if (isBetterLocation(location))
        {
            mLastLocation = location;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }


    private class OnLocationDataListener
    {

        public abstract void onLocationCompleted(Location location);
    }

}
