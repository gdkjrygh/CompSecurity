// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;


public class WLGeoAcquisitionPolicy
    implements Cloneable
{

    private static final long MIN_MAXIMUM_AGE = 100L;
    private int desiredAccuracy;
    private boolean enableHighAccuracy;
    private long maximumAge;
    private int minChangeDistance;
    private int minChangeTime;
    private long timeout;

    public WLGeoAcquisitionPolicy()
    {
        maximumAge = 100L;
        timeout = -1L;
        enableHighAccuracy = false;
        desiredAccuracy = 0;
        minChangeDistance = 0;
        minChangeTime = 0;
    }

    public static WLGeoAcquisitionPolicy getLiveTrackingProfile()
    {
        return (new WLGeoAcquisitionPolicy()).setEnableHighAccuracy(true).setMaximumAge(100L);
    }

    public static WLGeoAcquisitionPolicy getPowerSavingProfile()
    {
        return (new WLGeoAcquisitionPolicy()).setEnableHighAccuracy(false).setMinChangeTime(0x493e0).setMinChangeDistance(1000).setMaximumAge(0x493e0L);
    }

    public static WLGeoAcquisitionPolicy getRoughTrackingProfile()
    {
        return (new WLGeoAcquisitionPolicy()).setEnableHighAccuracy(true).setDesiredAccuracy(200).setMinChangeTime(30000).setMinChangeDistance(50).setMaximumAge(60000L);
    }

    public WLGeoAcquisitionPolicy clone()
    {
        return (new WLGeoAcquisitionPolicy()).setEnableHighAccuracy(enableHighAccuracy).setDesiredAccuracy(desiredAccuracy).setMaximumAge(maximumAge).setMinChangeDistance(minChangeDistance).setMinChangeTime(minChangeTime).setTimeout(timeout);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WLGeoAcquisitionPolicy)obj;
            if (desiredAccuracy != ((WLGeoAcquisitionPolicy) (obj)).desiredAccuracy)
            {
                return false;
            }
            if (enableHighAccuracy != ((WLGeoAcquisitionPolicy) (obj)).enableHighAccuracy)
            {
                return false;
            }
            if (Double.doubleToLongBits(maximumAge) != Double.doubleToLongBits(((WLGeoAcquisitionPolicy) (obj)).maximumAge))
            {
                return false;
            }
            if (minChangeDistance != ((WLGeoAcquisitionPolicy) (obj)).minChangeDistance)
            {
                return false;
            }
            if (minChangeTime != ((WLGeoAcquisitionPolicy) (obj)).minChangeTime)
            {
                return false;
            }
            if (Double.doubleToLongBits(timeout) != Double.doubleToLongBits(((WLGeoAcquisitionPolicy) (obj)).timeout))
            {
                return false;
            }
        }
        return true;
    }

    public int getDesiredAccuracy()
    {
        return desiredAccuracy;
    }

    public double getMaximumAge()
    {
        return (double)maximumAge;
    }

    public int getMinChangeDistance()
    {
        return minChangeDistance;
    }

    public int getMinChangeTime()
    {
        return minChangeTime;
    }

    public long getTimeout()
    {
        return timeout;
    }

    public int hashCode()
    {
        int i = desiredAccuracy;
        char c;
        int j;
        int k;
        int l;
        long l1;
        if (enableHighAccuracy)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        l1 = Double.doubleToLongBits(maximumAge);
        j = (int)(l1 >>> 32 ^ l1);
        k = minChangeDistance;
        l = minChangeTime;
        l1 = Double.doubleToLongBits(timeout);
        return (((((i + 31) * 31 + c) * 31 + j) * 31 + k) * 31 + l) * 31 + (int)(l1 >>> 32 ^ l1);
    }

    public boolean isEnableHighAccuracy()
    {
        return enableHighAccuracy;
    }

    public WLGeoAcquisitionPolicy setDesiredAccuracy(int i)
    {
        desiredAccuracy = i;
        return this;
    }

    public WLGeoAcquisitionPolicy setEnableHighAccuracy(boolean flag)
    {
        enableHighAccuracy = flag;
        return this;
    }

    public WLGeoAcquisitionPolicy setMaximumAge(long l)
    {
        if (l > 100L)
        {
            maximumAge = l;
        }
        return this;
    }

    public WLGeoAcquisitionPolicy setMinChangeDistance(int i)
    {
        if (enableHighAccuracy && i > 0)
        {
            minChangeDistance = i;
        }
        return this;
    }

    public WLGeoAcquisitionPolicy setMinChangeTime(int i)
    {
        if (enableHighAccuracy && i > 0)
        {
            minChangeTime = i;
        }
        return this;
    }

    public WLGeoAcquisitionPolicy setTimeout(long l)
    {
        timeout = l;
        return this;
    }
}
