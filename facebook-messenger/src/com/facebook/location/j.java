// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.location;

import android.location.Location;
import android.location.LocationManager;
import com.facebook.common.w.n;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.g;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import com.google.common.d.a.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.location:
//            m, GetDeviceLocationParams, h, k, 
//            l, r

public class j extends a
{

    final h a;
    private final GetDeviceLocationParams b;
    private final m c = new m(this, null);
    private final fi d;
    private g e;
    private Location f;
    private Location g;
    private boolean h;
    private boolean i;
    private Map j;
    private Map k;
    private boolean l;

    j(h h1, GetDeviceLocationParams getdevicelocationparams, g g1)
    {
        a = h1;
        super();
        j = ik.a();
        k = ik.a();
        b = getdevicelocationparams;
        e = g1;
        g1 = fi.e();
        Iterator iterator = getdevicelocationparams.j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (com.facebook.location.h.a(h1).isProviderEnabled(s))
            {
                g1.b(s);
            }
        } while (true);
        d = g1.b();
        g1 = a();
        if (g1 != null)
        {
            a(g1);
        }
        if (i)
        {
            return;
        }
        if (getdevicelocationparams.a == 0L)
        {
            d(g);
            return;
        }
        if (d.isEmpty())
        {
            com.facebook.debug.log.b.d(com.facebook.location.h.a(), "None of the desired location providers are supported.");
            d(null);
            return;
        } else
        {
            com.facebook.location.h.b(h1).execute(new k(this, h1));
            com.facebook.location.h.b(h1).schedule(new l(this, h1), getdevicelocationparams.a, TimeUnit.MILLISECONDS);
            return;
        }
    }

    private Location a()
    {
        if (!b.k) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((Location) (obj));
_L2:
        obj = com.facebook.location.h.a(a).getProviders(true);
        Location location = com.facebook.location.h.c(a).a(-1L);
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            obj = location;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj = (String)iterator.next();
            obj = com.facebook.location.h.a(a).getLastKnownLocation(((String) (obj)));
            if (a.a(((Location) (obj)), location, b))
            {
                location = ((Location) (obj));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static fi a(j j1)
    {
        return j1.d;
    }

    private void a(Location location)
    {
        if (a.a(location, g, b))
        {
            com.facebook.debug.log.b.b(com.facebook.location.h.a(), "Got better location: %s", new Object[] {
                com.facebook.location.h.a(a, location)
            });
            g = location;
            com.facebook.location.h.c(a).a(location);
            b(location);
        }
    }

    static void a(j j1, Location location)
    {
        j1.a(location);
    }

    static void a(j j1, String s)
    {
        j1.a(s);
    }

    private void a(String s)
    {
        if (i)
        {
            return;
        } else
        {
            e e1 = com.facebook.debug.d.e.a(n.a("tracer for %s provider", new Object[] {
                s
            }));
            j.put(s, e1);
            com.facebook.location.h.a(a).requestLocationUpdates(s, b.d, b.e, c);
            h = true;
            return;
        }
    }

    private void b()
    {
        com.facebook.debug.log.b.b(com.facebook.location.h.a(), "Unregistering location updates");
        com.facebook.location.h.a(a).removeUpdates(c);
        String s;
        long l1;
        for (Iterator iterator = j.entrySet().iterator(); iterator.hasNext(); k.put(s, Long.valueOf(l1)))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            s = (String)entry.getKey();
            l1 = ((e)entry.getValue()).a();
        }

        h = false;
    }

    private void b(Location location)
    {
        if (e(location))
        {
            c(location);
        }
        if (h(location))
        {
            d(location);
        }
    }

    static void b(j j1)
    {
        j1.e();
    }

    private void c(Location location)
    {
        Preconditions.checkNotNull(location);
        if (e == null)
        {
            return;
        } else
        {
            f = location;
            e.a(OperationResult.a(location));
            return;
        }
    }

    private void d(Location location)
    {
        if (h)
        {
            b();
        }
        i = true;
        a_(location);
    }

    private void e()
    {
        l = true;
        d(g);
    }

    private boolean e(Location location)
    {
        return f(location) && g(location);
    }

    private boolean f(Location location)
    {
        while (location == null || b.b != -1L && com.facebook.location.h.b(a, location) > b.b || b.c != -1F && location.hasAccuracy() && location.getAccuracy() > b.c) 
        {
            return false;
        }
        return true;
    }

    private boolean g(Location location)
    {
        return f == null || location.distanceTo(f) >= b.e && location.getTime() - f.getTime() >= b.d;
    }

    private boolean h(Location location)
    {
        while (location == null || b.f != -1L && com.facebook.location.h.b(a, location) > b.f || b.g != -1F && (!location.hasAccuracy() || location.getAccuracy() > b.g)) 
        {
            return false;
        }
        return true;
    }
}
