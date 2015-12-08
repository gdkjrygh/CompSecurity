// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class ae
    implements LocationListener
{

    private static final String b = com/threatmetrix/TrustDefenderMobile/ae.getName();
    private Location a;

    public ae()
    {
        a = null;
    }

    public final Location a()
    {
        if (a != null)
        {
            return new Location(a);
        } else
        {
            return null;
        }
    }

    public void onLocationChanged(Location location)
    {
        Object obj;
        boolean flag4;
        flag4 = true;
        String s = b;
        (new StringBuilder("onLocationChanged() : ")).append(location.getProvider()).append(":").append(location.getLatitude()).append(":").append(location.getLongitude()).append(":").append(location.getAccuracy());
        obj = a;
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i = ((flag4) ? 1 : 0);
_L4:
        if (i != 0)
        {
            a = location;
        }
        return;
_L2:
        long l = location.getTime() - ((Location) (obj)).getTime();
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
        i = ((flag4) ? 1 : 0);
        if (flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag2)
        {
            i = (int)(location.getAccuracy() - ((Location) (obj)).getAccuracy());
            String s1;
            boolean flag3;
            boolean flag5;
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
            s1 = location.getProvider();
            obj = ((Location) (obj)).getProvider();
            if (s1 == null)
            {
                if (obj == null)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
            } else
            {
                flag5 = s1.equals(obj);
            }
            i = ((flag4) ? 1 : 0);
            if (flag2)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (flag)
            {
                i = ((flag4) ? 1 : 0);
                if (!flag1)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            if (flag && !flag3)
            {
                i = ((flag4) ? 1 : 0);
                if (flag5)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
        }
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onProviderDisabled(String s)
    {
        String s1 = b;
        (new StringBuilder("onProviderDisabled: ")).append(s);
    }

    public void onProviderEnabled(String s)
    {
        String s1 = b;
        (new StringBuilder("onProviderEnabled: ")).append(s);
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        bundle = b;
        bundle = (new StringBuilder("onStatusChanged: ")).append(s).append(" status: ");
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
        bundle.append(s);
    }

}
