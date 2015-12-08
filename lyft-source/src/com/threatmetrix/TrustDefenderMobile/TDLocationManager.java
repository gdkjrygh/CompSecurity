// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, TDLocationListener

class TDLocationManager
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/TDLocationManager);
    private Location b;
    private LocationManager c;
    private TDLocationListener d;
    private long e;
    private long f;
    private int g;
    private Context h;
    private boolean i;
    private boolean j;

    TDLocationManager()
    {
        i = false;
        j = false;
    }

    private void e()
    {
        long l = 0L;
        Location location = null;
        Log.d(a, "Attempting to find an existing location to prime things");
        Iterator iterator = c.getAllProviders().iterator();
        float f1 = 3.402823E+38F;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            if (obj == null)
            {
                Log.e(a, "null provider (wut?)");
            } else
            {
                Log.d(a, (new StringBuilder()).append("getLastLocation() : ").append(((String) (obj))).toString());
                obj = c.getLastKnownLocation(((String) (obj)));
                if (obj != null)
                {
                    Log.d(a, (new StringBuilder()).append("getLastLocation() : ").append(((Location) (obj)).getProvider()).append(":").append(((Location) (obj)).getLatitude()).append(":").append(((Location) (obj)).getLongitude()).append(":").append(((Location) (obj)).getAccuracy()).toString());
                    float f2 = ((Location) (obj)).getAccuracy();
                    long l1 = ((Location) (obj)).getTime();
                    if (l1 > e && f2 < f1)
                    {
                        f1 = f2;
                        l = l1;
                        location = ((Location) (obj));
                    } else
                    if (l1 < e && f1 == 3.402823E+38F && l1 > l)
                    {
                        location = ((Location) (obj));
                        l = l1;
                    }
                }
            }
        } while (true);
        if (location != null)
        {
            a(location, false);
        }
    }

    private boolean f()
    {
        boolean flag;
        boolean flag2;
        boolean flag4;
        flag4 = true;
        flag2 = false;
        flag = false;
        Log.d(a, (new StringBuilder()).append("registerLocationServices: low power ").append(e).append(" high power ").append(f).append(" with accuracy ").append(g).toString());
        c = (LocationManager)h.getSystemService("location");
        if (c != null) goto _L2; else goto _L1
_L1:
        Log.e(a, "Insufficient permissions to acquire location manager");
        flag2 = flag;
_L3:
        return flag2;
_L2:
        if (d != null)
        {
            c.removeUpdates(d);
        }
        Criteria criteria1 = new Criteria();
        criteria1.setAccuracy(g);
        criteria1.setAltitudeRequired(false);
        criteria1.setBearingAccuracy(0);
        criteria1.setCostAllowed(false);
        criteria1.setSpeedAccuracy(0);
        criteria1.setSpeedRequired(false);
        criteria1.setVerticalAccuracy(0);
        Criteria criteria = new Criteria();
        criteria.setPowerRequirement(1);
        criteria.setAccuracy(2);
        String s = c.getBestProvider(criteria1, true);
        if (s != null)
        {
            Log.d(a, (new StringBuilder()).append("fine provider: ").append(s).toString());
        }
        String s1 = c.getBestProvider(criteria, true);
        if (s1 != null)
        {
            Log.d(a, (new StringBuilder()).append("course provider: ").append(s1).toString());
        }
        if (s == null && s1 == null)
        {
            d = null;
            c = null;
            Log.e(a, "Unable to find location provider, possibly incorrect permissions. Check that android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION is set");
            return false;
        }
        e();
        SecurityException securityexception;
        boolean flag1;
        boolean flag3;
        if (s != null && s1 != null)
        {
            flag3 = s.equals(s1);
        } else
        {
            flag3 = false;
        }
        d = new TDLocationListener();
        if (b != null)
        {
            d.onLocationChanged(b);
        }
        c.requestLocationUpdates(e, 0L, criteria, d, Looper.getMainLooper());
        Log.d(a, (new StringBuilder()).append("LocationManager created: ").append(c.getBestProvider(criteria, true)).toString());
        flag2 = true;
_L4:
        flag1 = flag2;
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        c.requestLocationUpdates(f, 0L, criteria1, d, null);
        Log.d(a, (new StringBuilder()).append("LocationManager created: ").append(c.getBestProvider(criteria1, true)).toString());
        flag1 = true;
_L5:
        flag2 = flag1;
        if (!flag1)
        {
            d = null;
            c = null;
            return flag1;
        }
          goto _L3
        securityexception;
_L7:
        Log.e(a, (new StringBuilder()).append("Security settings error:").append(securityexception.getLocalizedMessage()).toString());
          goto _L4
        securityexception;
        flag1 = flag2;
_L6:
        Log.e(a, (new StringBuilder()).append("Security settings error:").append(securityexception.getLocalizedMessage()).toString());
          goto _L5
        securityexception;
        flag1 = flag4;
          goto _L6
        securityexception;
        flag2 = true;
          goto _L7
    }

    void a(Location location)
    {
        a(location, true);
    }

    void a(Location location, boolean flag)
    {
        if (location != null)
        {
            b = new Location(location);
            j = flag;
            return;
        } else
        {
            b = null;
            j = false;
            return;
        }
    }

    boolean a()
    {
        return c != null && d != null;
    }

    public boolean a(Context context, long l, long l1, int k)
    {
        h = context;
        e = l;
        f = l1;
        g = k;
        return f();
    }

    public void b()
    {
        if (a())
        {
            c.removeUpdates(d);
        }
    }

    public Location c()
    {
        Location location1 = b;
        Location location = location1;
        if (location1 == null)
        {
            location = location1;
            if (d != null)
            {
                location = d.a();
            }
        }
        return location;
    }

    public boolean d()
    {
        return j;
    }

}
