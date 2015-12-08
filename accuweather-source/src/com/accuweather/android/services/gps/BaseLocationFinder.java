// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.content.Context;
import android.location.Location;
import com.accuweather.android.utilities.PreferenceUtils;
import java.io.Serializable;

// Referenced classes of package com.accuweather.android.services.gps:
//            ILocationListener

public abstract class BaseLocationFinder
{
    static class AccuLocation
        implements Serializable
    {

        private long mFixTimeMillis;
        private double mLatitude;
        private double mLongitude;

        public static AccuLocation fromString(String s)
        {
            s = s.split("_");
            if (s.length != 3)
            {
                return new AccuLocation();
            }
            AccuLocation acculocation;
            try
            {
                acculocation = new AccuLocation();
                acculocation.setLatitude(Double.parseDouble(s[0]));
                acculocation.setLongitude(Double.parseDouble(s[1]));
                acculocation.setFixTimeMillis(Long.parseLong(s[2]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new AccuLocation();
            }
            return acculocation;
        }

        public long getFixTimeMillis()
        {
            return mFixTimeMillis;
        }

        public Location getLocation()
        {
            Location location = new Location("");
            location.setLatitude(mLatitude);
            location.setLongitude(mLongitude);
            return location;
        }

        public void setFixTimeMillis(long l)
        {
            mFixTimeMillis = l;
        }

        public void setLatitude(double d)
        {
            mLatitude = d;
        }

        public void setLongitude(double d)
        {
            mLongitude = d;
        }

        public String toString()
        {
            return (new StringBuilder()).append(mLatitude).append("_").append(mLongitude).append("_").append(mFixTimeMillis).toString();
        }

        public AccuLocation()
        {
            mLatitude = 0.0D;
            mLongitude = 0.0D;
            mFixTimeMillis = 0L;
        }

        public AccuLocation(double d, double d1, long l)
        {
            mLatitude = 0.0D;
            mLongitude = 0.0D;
            mFixTimeMillis = 0L;
            setLatitude(d);
            setLongitude(d1);
            setFixTimeMillis(l);
        }
    }


    protected static final String LAST_LOCATION_FIX_KEY = "last_fix";
    private static final long LOCATION_FIX_EXPIRE_TIME_MILLIS = 60000L;
    protected Context mContext;

    public BaseLocationFinder(Context context)
    {
        mContext = context;
    }

    public abstract void findLocation();

    public Location getLastFoundLocation()
    {
        String s = PreferenceUtils.get(mContext, "last_fix", "");
        if (s.equals(""))
        {
            return null;
        } else
        {
            return AccuLocation.fromString(s).getLocation();
        }
    }

    public Location getLastFoundUnexpiredLocation()
    {
        Object obj = PreferenceUtils.get(mContext, "last_fix", "");
        if (!((String) (obj)).equals(""))
        {
            if (((AccuLocation) (obj = AccuLocation.fromString(((String) (obj))))).getFixTimeMillis() != 0L && ((AccuLocation) (obj)).getFixTimeMillis() >= System.currentTimeMillis() - 60000L)
            {
                return ((AccuLocation) (obj)).getLocation();
            }
        }
        return null;
    }

    public void saveLastLocationFix(double d, double d1)
    {
        AccuLocation acculocation = new AccuLocation(d, d1, System.currentTimeMillis());
        PreferenceUtils.save(mContext, "last_fix", acculocation.toString());
    }

    public void saveLastLocationFix(Location location)
    {
        saveLastLocationFix(location.getLatitude(), location.getLongitude());
    }

    public abstract void setLocationListener(ILocationListener ilocationlistener);
}
