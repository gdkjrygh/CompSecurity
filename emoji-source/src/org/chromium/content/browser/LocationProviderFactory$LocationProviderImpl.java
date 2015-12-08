// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            LocationProviderFactory, LocationProviderAdapter

private static class mContext
    implements LocationListener, mContext
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "LocationProvider";
    private Context mContext;
    private boolean mIsRunning;
    private LocationManager mLocationManager;

    private void ensureLocationManagerCreated()
    {
        if (mLocationManager == null)
        {
            mLocationManager = (LocationManager)mContext.getSystemService("location");
            if (mLocationManager == null)
            {
                Log.e("LocationProvider", "Could not get location manager.");
                return;
            }
        }
    }

    private boolean isOnlyPassiveLocationProviderEnabled()
    {
        List list = mLocationManager.getProviders(true);
        return list != null && list.size() == 1 && ((String)list.get(0)).equals("passive");
    }

    private void registerForLocationUpdates(boolean flag)
    {
        ensureLocationManagerCreated();
        if (usePassiveOneShotLocation())
        {
            return;
        }
        if (!$assertionsDisabled && mIsRunning)
        {
            throw new AssertionError();
        }
        mIsRunning = true;
        Criteria criteria;
        try
        {
            criteria = new Criteria();
        }
        catch (SecurityException securityexception)
        {
            Log.e("LocationProvider", "Caught security exception registering for location updates from system. This should only happen in DumpRenderTree.");
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e("LocationProvider", "Caught IllegalArgumentException registering for location updates.");
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        criteria.setAccuracy(1);
        mLocationManager.requestLocationUpdates(0L, 0.0F, criteria, this, ThreadUtils.getUiThreadLooper());
        return;
    }

    private void unregisterFromLocationUpdates()
    {
        if (mIsRunning)
        {
            mIsRunning = false;
            mLocationManager.removeUpdates(this);
        }
    }

    private void updateNewLocation(Location location)
    {
        LocationProviderAdapter.newLocationAvailable(location.getLatitude(), location.getLongitude(), (double)location.getTime() / 1000D, location.hasAltitude(), location.getAltitude(), location.hasAccuracy(), location.getAccuracy(), location.hasBearing(), location.getBearing(), location.hasSpeed(), location.getSpeed());
    }

    private boolean usePassiveOneShotLocation()
    {
        if (!isOnlyPassiveLocationProviderEnabled())
        {
            return false;
        }
        final Location location = mLocationManager.getLastKnownLocation("passive");
        if (location != null)
        {
            ThreadUtils.runOnUiThread(new Runnable() {

                final LocationProviderFactory.LocationProviderImpl this$0;
                final Location val$location;

                public void run()
                {
                    updateNewLocation(location);
                }

            
            {
                this$0 = LocationProviderFactory.LocationProviderImpl.this;
                location = location1;
                super();
            }
            });
        }
        return true;
    }

    public boolean isRunning()
    {
        return mIsRunning;
    }

    public void onLocationChanged(Location location)
    {
        if (mIsRunning)
        {
            updateNewLocation(location);
        }
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

    public void start(boolean flag)
    {
        unregisterFromLocationUpdates();
        registerForLocationUpdates(flag);
    }

    public void stop()
    {
        unregisterFromLocationUpdates();
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/LocationProviderFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


    _cls1.val.location(Context context)
    {
        mContext = context;
    }
}
