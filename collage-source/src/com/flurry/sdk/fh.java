// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            fp, hg, hh, gd, 
//            hk, fy, hj, fx

public class fh
    implements hh.a
{
    class a
        implements LocationListener
    {

        final fh a;

        public void onLocationChanged(Location location)
        {
            if (location != null)
            {
                fh.a(a, location);
            }
            if (fh.c(a) >= 3)
            {
                gd.a(4, fh.f(), "Max location reports reached, stopping");
                fh.b(a);
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
            a = fh.this;
            super();
        }
    }


    private static fh a;
    private static final String b = com/flurry/sdk/fh.getSimpleName();
    private final int c = 3;
    private final long d = 10000L;
    private final long e = 0x15f90L;
    private final long f = 0L;
    private boolean g;
    private Location h;
    private long i;
    private LocationManager j;
    private a k;
    private Location l;
    private boolean m;
    private int n;
    private fy o;

    private fh()
    {
        i = 0L;
        m = false;
        n = 0;
        o = new fy() {

            final fh a;

            public void a(hj hj1)
            {
                if (fh.a(a) > 0L && fh.a(a) < System.currentTimeMillis())
                {
                    gd.a(4, fh.f(), "No location received in 90 seconds , stopping LocationManager");
                    fh.b(a);
                }
            }

            public void notify(fx fx)
            {
                a((hj)fx);
            }

            
            {
                a = fh.this;
                super();
            }
        };
        j = (LocationManager)fp.a().c().getSystemService("location");
        k = new a();
        hg hg1 = hg.a();
        g = ((Boolean)hg1.a("ReportLocation")).booleanValue();
        hg1.a("ReportLocation", this);
        gd.a(4, b, (new StringBuilder()).append("initSettings, ReportLocation = ").append(g).toString());
        h = (Location)hg1.a("ExplicitLocation");
        hg1.a("ExplicitLocation", this);
        gd.a(4, b, (new StringBuilder()).append("initSettings, ExplicitLocation = ").append(h).toString());
    }

    static long a(fh fh1)
    {
        return fh1.i;
    }

    static Location a(fh fh1, Location location)
    {
        fh1.l = location;
        return location;
    }

    public static fh a()
    {
        com/flurry/sdk/fh;
        JVM INSTR monitorenter ;
        fh fh1;
        if (a == null)
        {
            a = new fh();
        }
        fh1 = a;
        com/flurry/sdk/fh;
        JVM INSTR monitorexit ;
        return fh1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            j.requestLocationUpdates(s, 10000L, 0.0F, k, Looper.getMainLooper());
        }
    }

    private boolean a(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    private Location b(String s)
    {
        Location location = null;
        if (!TextUtils.isEmpty(s))
        {
            location = j.getLastKnownLocation(s);
        }
        return location;
    }

    public static void b()
    {
        if (a != null)
        {
            hg.a().b("ReportLocation", a);
            hg.a().b("ExplicitLocation", a);
        }
        a = null;
    }

    static void b(fh fh1)
    {
        fh1.h();
    }

    private boolean b(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    static int c(fh fh1)
    {
        int i1 = fh1.n + 1;
        fh1.n = i1;
        return i1;
    }

    static String f()
    {
        return b;
    }

    private void g()
    {
_L2:
        return;
        if (m || !g || h != null) goto _L2; else goto _L1
_L1:
        Context context = fp.a().c();
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 && context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) goto _L2; else goto _L3
_L3:
        String s;
        n = 0;
        s = null;
        if (!a(context)) goto _L5; else goto _L4
_L4:
        s = i();
_L7:
        a(s);
        l = b(s);
        i = System.currentTimeMillis() + 0x15f90L;
        k();
        m = true;
        gd.a(4, b, "LocationProvider started");
        return;
_L5:
        if (b(context))
        {
            s = j();
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void h()
    {
        if (!m)
        {
            return;
        } else
        {
            j.removeUpdates(k);
            n = 0;
            i = 0L;
            l();
            m = false;
            gd.a(4, b, "LocationProvider stopped");
            return;
        }
    }

    private String i()
    {
        return "passive";
    }

    private String j()
    {
        return "network";
    }

    private void k()
    {
        gd.a(4, b, "Register location timer");
        hk.a().a(o);
    }

    private void l()
    {
        gd.a(4, b, "Unregister location timer");
        hk.a().b(o);
    }

    public void a(String s, Object obj)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   -864112343: 67
    //                   -300729815: 81;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_81;
_L4:
        switch (byte0)
        {
        default:
            gd.a(6, b, "LocationProvider internal error! Had to be LocationCriteria, ReportLocation or ExplicitLocation key.");
            return;

        case 0: // '\0'
            g = ((Boolean)obj).booleanValue();
            gd.a(4, b, (new StringBuilder()).append("onSettingUpdate, ReportLocation = ").append(g).toString());
            return;

        case 1: // '\001'
            h = (Location)obj;
            break;
        }
        break MISSING_BLOCK_LABEL_144;
_L2:
        if (s.equals("ReportLocation"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("ExplicitLocation"))
        {
            byte0 = 1;
        }
          goto _L4
        gd.a(4, b, (new StringBuilder()).append("onSettingUpdate, ExplicitLocation = ").append(h).toString());
        return;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        gd.a(4, b, "Location update requested");
        if (n < 3)
        {
            g();
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
        gd.a(4, b, "Stop update location requested");
        h();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Location e()
    {
        Location location;
        Object obj2;
        obj2 = null;
        location = null;
        if (h == null) goto _L2; else goto _L1
_L1:
        location = h;
_L4:
        return location;
_L2:
        Object obj1 = obj2;
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = fp.a().c();
        if (!a(((Context) (obj1))) && !b(((Context) (obj1))))
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj;
        if (a(((Context) (obj1))))
        {
            obj = i();
        } else
        if (b(((Context) (obj1))))
        {
            obj = j();
        } else
        {
            obj = null;
        }
        obj1 = obj2;
        if (obj != null)
        {
            obj = b(((String) (obj)));
            if (obj != null)
            {
                l = ((Location) (obj));
            }
            obj1 = l;
        }
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        gd.a(4, b, (new StringBuilder()).append("getLocation() = ").append(obj1).toString());
        return ((Location) (obj1));
    }

}
