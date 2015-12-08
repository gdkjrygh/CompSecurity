// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import java.util.Calendar;

// Referenced classes of package android.support.v7.app:
//            TwilightCalculator

class TwilightManager
{
    private static class TwilightState
    {

        boolean isNight;
        long nextUpdate;
        long todaySunrise;
        long todaySunset;
        long tomorrowSunrise;
        long yesterdaySunset;

        private TwilightState()
        {
        }

    }


    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private static final TwilightState sTwilightState = new TwilightState();
    private final Context mContext;
    private final LocationManager mLocationManager;

    TwilightManager(Context context)
    {
        mContext = context;
        mLocationManager = (LocationManager)context.getSystemService("location");
    }

    private Location getLastKnownLocation()
    {
        Location location1 = null;
        Location location;
        if (PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0)
        {
            location = getLastKnownLocationForProvider("network");
        } else
        {
            location = null;
        }
        if (PermissionChecker.checkSelfPermission(mContext, "android.permission.ACCESS_FINE_LOCATION") == 0)
        {
            location1 = getLastKnownLocationForProvider("gps");
        }
        if (location1 != null && location != null)
        {
            Location location2 = location;
            if (location1.getTime() > location.getTime())
            {
                location2 = location1;
            }
            return location2;
        }
        if (location1 == null)
        {
            location1 = location;
        }
        return location1;
    }

    private Location getLastKnownLocationForProvider(String s)
    {
        if (mLocationManager == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!mLocationManager.isProviderEnabled(s))
        {
            break MISSING_BLOCK_LABEL_39;
        }
        s = mLocationManager.getLastKnownLocation(s);
        return s;
        s;
        Log.d("TwilightManager", "Failed to get last known location", s);
        return null;
    }

    private boolean isStateValid(TwilightState twilightstate)
    {
        return twilightstate != null && twilightstate.nextUpdate > System.currentTimeMillis();
    }

    private void updateState(Location location)
    {
        long l;
        long l2;
        long l3;
        long l4;
        TwilightState twilightstate = sTwilightState;
        l = System.currentTimeMillis();
        TwilightCalculator twilightcalculator = TwilightCalculator.getInstance();
        twilightcalculator.calculateTwilight(l - 0x5265c00L, location.getLatitude(), location.getLongitude());
        long l1 = twilightcalculator.sunset;
        twilightcalculator.calculateTwilight(l, location.getLatitude(), location.getLongitude());
        boolean flag;
        if (twilightcalculator.state == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l2 = twilightcalculator.sunrise;
        l3 = twilightcalculator.sunset;
        twilightcalculator.calculateTwilight(0x5265c00L + l, location.getLatitude(), location.getLongitude());
        l4 = twilightcalculator.sunrise;
        if (l2 != -1L && l3 != -1L) goto _L2; else goto _L1
_L1:
        l = 0x2932e00L + l;
_L4:
        twilightstate.isNight = flag;
        twilightstate.yesterdaySunset = l1;
        twilightstate.todaySunrise = l2;
        twilightstate.todaySunset = l3;
        twilightstate.tomorrowSunrise = l4;
        twilightstate.nextUpdate = l;
        return;
_L2:
        if (l <= l3)
        {
            break; /* Loop/switch isn't completed */
        }
        l = 0L + l4;
_L5:
        l += 60000L;
        if (true) goto _L4; else goto _L3
_L3:
        if (l > l2)
        {
            l = 0L + l3;
        } else
        {
            l = 0L + l2;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    boolean isNight()
    {
        TwilightState twilightstate = sTwilightState;
        if (isStateValid(twilightstate))
        {
            return twilightstate.isNight;
        }
        Location location = getLastKnownLocation();
        if (location != null)
        {
            updateState(location);
            return twilightstate.isNight;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

}
