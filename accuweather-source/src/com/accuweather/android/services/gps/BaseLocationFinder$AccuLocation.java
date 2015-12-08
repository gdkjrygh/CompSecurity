// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.gps;

import android.location.Location;
import java.io.Serializable;

// Referenced classes of package com.accuweather.android.services.gps:
//            BaseLocationFinder

static class setFixTimeMillis
    implements Serializable
{

    private long mFixTimeMillis;
    private double mLatitude;
    private double mLongitude;

    public static setFixTimeMillis fromString(String s)
    {
        s = s.split("_");
        if (s.length != 3)
        {
            return new <init>();
        }
        setFixTimeMillis setfixtimemillis;
        try
        {
            setfixtimemillis = new <init>();
            setfixtimemillis.setLatitude(Double.parseDouble(s[0]));
            setfixtimemillis.setLongitude(Double.parseDouble(s[1]));
            setfixtimemillis.setFixTimeMillis(Long.parseLong(s[2]));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new <init>();
        }
        return setfixtimemillis;
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

    public ()
    {
        mLatitude = 0.0D;
        mLongitude = 0.0D;
        mFixTimeMillis = 0L;
    }

    public mFixTimeMillis(double d, double d1, long l)
    {
        mLatitude = 0.0D;
        mLongitude = 0.0D;
        mFixTimeMillis = 0L;
        setLatitude(d);
        setLongitude(d1);
        setFixTimeMillis(l);
    }
}
