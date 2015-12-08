// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class TDLocationListener
    implements LocationListener
{

    private static final String b = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TDLocationListener);
    private Location a;

    public TDLocationListener()
    {
        a = null;
    }

    private boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    public Location a()
    {
        if (a != null)
        {
            return new Location(a);
        } else
        {
            return null;
        }
    }

    boolean a(Location location, Location location1)
    {
        if (location1 != null)
        {
            long l = location.getTime() - location1.getTime();
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (l > 0x1d4c0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (l < 0xfffffffffffe2b40L)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (l > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag1)
            {
                if (flag2)
                {
                    return false;
                }
                int i = (int)(location.getAccuracy() - location1.getAccuracy());
                boolean flag3;
                boolean flag4;
                if (i > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (i < 0)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (i > 200)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                flag4 = a(location.getProvider(), location1.getProvider());
                if (!flag2 && (!flag || flag1) && (!flag || flag3 || !flag4))
                {
                    return false;
                }
            }
        }
        return true;
    }

    public void onLocationChanged(Location location)
    {
        Log.d(b, (new StringBuilder()).append("onLocationChanged() : ").append(location.getProvider()).append(":").append(location.getLatitude()).append(":").append(location.getLongitude()).append(":").append(location.getAccuracy()).toString());
        if (a(location, a))
        {
            a = location;
        }
    }

    public void onProviderDisabled(String s)
    {
        Log.d(b, (new StringBuilder()).append("onProviderDisabled: ").append(s).toString());
    }

    public void onProviderEnabled(String s)
    {
        Log.d(b, (new StringBuilder()).append("onProviderEnabled: ").append(s).toString());
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        bundle = b;
        StringBuilder stringbuilder = (new StringBuilder()).append("onStatusChanged: ").append(s).append(" status: ");
        if (i == 2)
        {
            s = "available ";
        } else
        if (i == 1)
        {
            s = "temporarily unavailable";
        } else
        if (i == 0)
        {
            s = "Out of Service";
        } else
        {
            s = "unknown";
        }
        Log.d(bundle, stringbuilder.append(s).toString());
    }

}
