// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            dp, dq, el, do, 
//            ex, ey

public class dz
    implements dq.a, ey.a
{
    class a
        implements LocationListener
    {

        final dz a;

        public void onLocationChanged(Location location)
        {
            if (location != null)
            {
                dz.a(a, location);
            }
            el.a(4, dz.h(), "Location received");
            if (dz.a(a) >= 3)
            {
                el.a(4, dz.h(), "Max location reports reached, stopping");
                dz.b(a);
            }
        }

        public void onProviderDisabled(String s)
        {
        }

        public void onProviderEnabled(String s)
        {
        }

        public void onStatusChanged(String s, int i1, Bundle bundle)
        {
        }

        public a()
        {
            a = dz.this;
            super();
        }
    }


    private static final String c = com/flurry/sdk/dz.getSimpleName();
    private static dz q;
    boolean a;
    boolean b;
    private final int d = 3;
    private final long e = 10000L;
    private final long f = 0x15f90L;
    private final long g = 0L;
    private long h;
    private LocationManager i;
    private Criteria j;
    private Location k;
    private a l;
    private String m;
    private int n;
    private int o;
    private volatile Location p;

    private dz()
    {
        h = 0L;
        a = false;
        n = 0;
        o = 0;
        l = new a();
        dq dq1 = dp.a();
        j = (Criteria)dq1.a("LocationCriteria");
        dq1.a("LocationCriteria", this);
        el.a(4, c, (new StringBuilder("initSettings, LocationCriteria = ")).append(j).toString());
        b = ((Boolean)dq1.a("ReportLocation")).booleanValue();
        dq1.a("ReportLocation", this);
        el.a(4, c, (new StringBuilder("initSettings, ReportLocation = ")).append(b).toString());
    }

    static int a(dz dz1)
    {
        int i1 = dz1.o + 1;
        dz1.o = i1;
        return i1;
    }

    static Location a(dz dz1, Location location)
    {
        dz1.k = location;
        return location;
    }

    public static dz a()
    {
        com/flurry/sdk/dz;
        JVM INSTR monitorenter ;
        dz dz1;
        if (q == null)
        {
            q = new dz();
        }
        dz1 = q;
        com/flurry/sdk/dz;
        JVM INSTR monitorexit ;
        return dz1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            i.requestLocationUpdates(s, 10000L, 0.0F, l, Looper.getMainLooper());
        }
    }

    private Location b(String s)
    {
        Location location = null;
        if (!TextUtils.isEmpty(s))
        {
            location = i.getLastKnownLocation(s);
        }
        return location;
    }

    static void b(dz dz1)
    {
        dz1.i();
    }

    static String h()
    {
        return c;
    }

    private void i()
    {
        i.removeUpdates(l);
        a = false;
        o = 0;
        h = 0L;
        m();
        el.a(4, c, "LocationProvider stopped");
    }

    private void j()
    {
        if (b && p == null)
        {
            Context context = com.flurry.sdk.do.a().b();
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0)
            {
                i();
                String s = k();
                a(s);
                k = b(s);
                h = System.currentTimeMillis() + 0x15f90L;
                l();
                a = true;
                el.a(4, c, "LocationProvider started");
                return;
            }
        }
    }

    private String k()
    {
        Criteria criteria = j;
        Object obj = criteria;
        if (criteria == null)
        {
            obj = new Criteria();
        }
        if (TextUtils.isEmpty(m))
        {
            obj = i.getBestProvider(((Criteria) (obj)), true);
        } else
        {
            obj = m;
        }
        el.a(4, c, (new StringBuilder("provider = ")).append(((String) (obj))).toString());
        return ((String) (obj));
    }

    private void l()
    {
        el.a(4, c, "Register location timer");
        ex.a().a(this);
    }

    private void m()
    {
        el.a(4, c, "Unregister location timer");
        ex.a().b(this);
    }

    public void a(ey ey)
    {
        if (h > 0L && h < System.currentTimeMillis())
        {
            el.a(4, c, "No location received in 90 seconds , stopping LocationManager");
            i();
        }
    }

    public void a(String s, Object obj)
    {
        if (s.equals("LocationCriteria"))
        {
            j = (Criteria)obj;
            el.a(4, c, (new StringBuilder("onSettingUpdate, LocationCriteria = ")).append(j).toString());
            if (a)
            {
                j();
            }
        } else
        if (s.equals("ReportLocation"))
        {
            b = ((Boolean)obj).booleanValue();
            el.a(4, c, (new StringBuilder("onSettingUpdate, ReportLocation = ")).append(b).toString());
            if (b)
            {
                if (!a && n > 0)
                {
                    j();
                    return;
                }
            } else
            {
                i();
                return;
            }
        } else
        {
            el.a(6, c, "LocationProvider internal error! Had to be LocationCriteria or ReportLocation key.");
            return;
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        LocationManager locationmanager = i;
        if (locationmanager == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = (LocationManager)com.flurry.sdk.do.a().b().getSystemService("location");
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        el.a(4, c, "Location provider subscribed");
        n = n + 1;
        if (!a && o < 3)
        {
            j();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        el.a(4, c, "Location provider unsubscribed");
        if (n > 0) goto _L2; else goto _L1
_L1:
        el.a(6, c, "Error! Unsubscribed too many times!");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        n = n - 1;
        if (n == 0)
        {
            i();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public Location f()
    {
        Location location = null;
        if (p != null)
        {
            return p;
        }
        if (b)
        {
            location = b(k());
            if (location != null)
            {
                k = location;
            }
            location = k;
        }
        el.a(4, c, (new StringBuilder("getLocation() = ")).append(location).toString());
        return location;
    }

    public void g()
    {
        n = 0;
        i();
    }

}
