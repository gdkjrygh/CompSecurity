// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            jo, lg, lh, kc, 
//            lk, jx

public class jg
    implements lh.a
{

    private static jg a;
    private static final String b = com/flurry/sdk/jg.getSimpleName();
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
    private jx o;

    private jg()
    {
        i = 0L;
        m = false;
        n = 0;
        o = new _cls1();
        j = (LocationManager)jo.a().c().getSystemService("location");
        k = new a();
        lg lg1 = lg.a();
        g = ((Boolean)lg1.a("ReportLocation")).booleanValue();
        lg1.a("ReportLocation", this);
        kc.a(4, b, (new StringBuilder("initSettings, ReportLocation = ")).append(g).toString());
        h = (Location)lg1.a("ExplicitLocation");
        lg1.a("ExplicitLocation", this);
        kc.a(4, b, (new StringBuilder("initSettings, ExplicitLocation = ")).append(h).toString());
    }

    static long a(jg jg1)
    {
        return jg1.i;
    }

    static Location a(jg jg1, Location location)
    {
        jg1.l = location;
        return location;
    }

    public static jg a()
    {
        com/flurry/sdk/jg;
        JVM INSTR monitorenter ;
        jg jg1;
        if (a == null)
        {
            a = new jg();
        }
        jg1 = a;
        com/flurry/sdk/jg;
        JVM INSTR monitorexit ;
        return jg1;
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
            lg.a().b("ReportLocation", a);
            lg.a().b("ExplicitLocation", a);
        }
        a = null;
    }

    static void b(jg jg1)
    {
        jg1.h();
    }

    private boolean b(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    static int c(jg jg1)
    {
        int i1 = jg1.n + 1;
        jg1.n = i1;
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
        Context context = jo.a().c();
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
        kc.a(4, b, "LocationProvider started");
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
            kc.a(4, b, "LocationProvider stopped");
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
        kc.a(4, b, "Register location timer");
        lk.a().a(o);
    }

    private void l()
    {
        kc.a(4, b, "Unregister location timer");
        lk.a().b(o);
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
            kc.a(6, b, "LocationProvider internal error! Had to be LocationCriteria, ReportLocation or ExplicitLocation key.");
            return;

        case 0: // '\0'
            g = ((Boolean)obj).booleanValue();
            kc.a(4, b, (new StringBuilder("onSettingUpdate, ReportLocation = ")).append(g).toString());
            return;

        case 1: // '\001'
            h = (Location)obj;
            break;
        }
        break MISSING_BLOCK_LABEL_141;
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
        kc.a(4, b, (new StringBuilder("onSettingUpdate, ExplicitLocation = ")).append(h).toString());
        return;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        kc.a(4, b, "Location update requested");
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
        kc.a(4, b, "Stop update location requested");
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
        obj1 = jo.a().c();
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
        kc.a(4, b, (new StringBuilder("getLocation() = ")).append(obj1).toString());
        return ((Location) (obj1));
    }


    private class _cls1
        implements jx
    {

        final jg a;

        public volatile void a(jw jw)
        {
            a((lj)jw);
        }

        public void a(lj lj1)
        {
            if (jg.a(a) > 0L && jg.a(a) < System.currentTimeMillis())
            {
                kc.a(4, jg.f(), "No location received in 90 seconds , stopping LocationManager");
                jg.b(a);
            }
        }

        _cls1()
        {
            a = jg.this;
            super();
        }
    }


    private class a
        implements LocationListener
    {

        final jg a;

        public void onLocationChanged(Location location)
        {
            if (location != null)
            {
                jg.a(a, location);
            }
            if (jg.c(a) >= 3)
            {
                kc.a(4, jg.f(), "Max location reports reached, stopping");
                jg.b(a);
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
            a = jg.this;
            super();
        }
    }

}
