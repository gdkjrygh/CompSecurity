// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import com.snapchat.android.Timber;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zZ
    implements LocationListener
{

    final String a;
    final LocationManager b;
    Object c;
    boolean d;
    volatile boolean e;
    private final Bus f;
    private final Looper g;
    private List h;
    private Ay i;

    public zZ(String s, LocationManager locationmanager, Looper looper)
    {
        this(s, locationmanager, Mf.a(), looper, Aw.a());
    }

    private zZ(String s, LocationManager locationmanager, Bus bus, Looper looper, Ay ay)
    {
        c = new Object();
        d = false;
        e = false;
        h = new ArrayList();
        a = s;
        b = locationmanager;
        f = bus;
        g = looper;
        i = ay;
    }

    private boolean c()
    {
        boolean flag;
        try
        {
            flag = b.isProviderEnabled(a);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Timber.g("LocationListener", illegalargumentexception.getMessage(), new Object[0]);
            return false;
        }
        return flag;
    }

    public final Location a()
    {
        Exception exception;
        long l;
        PG.b();
        exception = null;
        l = System.currentTimeMillis();
        List list = h;
        list;
        JVM INSTR monitorenter ;
        Iterator iterator = h.iterator();
_L3:
        Location location;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        location = (Location)iterator.next();
        if (l - location.getTime() <= 60000L) goto _L2; else goto _L1
_L1:
        Timber.g("LocationListener", (new StringBuilder()).append(a).append(" removing location because it is stale ").append(location.toString()).toString(), new Object[0]);
        iterator.remove();
          goto _L3
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (exception == null) goto _L5; else goto _L4
_L4:
        if (exception.getAccuracy() <= location.getAccuracy()) goto _L3; else goto _L5
_L5:
        Timber.g("LocationListener", (new StringBuilder()).append(a).append(" new best location ").append(location.toString()).toString(), new Object[0]);
        exception = location;
          goto _L3
        list;
        JVM INSTR monitorexit ;
        StringBuilder stringbuilder = (new StringBuilder()).append(a).append(" has best location of ");
        String s;
        if (exception == null)
        {
            s = "null";
        } else
        {
            s = exception.toString();
        }
        Timber.g("LocationListener", stringbuilder.append(s).toString(), new Object[0]);
        return exception;
    }

    public final void b()
    {
        PG.b();
        e = true;
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (d)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        flag = c();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        b.requestLocationUpdates(a, 1000L, 0.0F, this, g);
        d = true;
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        Object obj1;
        obj1;
        Timber.g("LocationListener", ((IllegalArgumentException) (obj1)).getMessage(), new Object[0]);
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        Timber.g("LocationListener", ((Exception) (obj1)).getMessage(), new Object[0]);
          goto _L1
    }

    public final void onLocationChanged(Location location)
    {
        synchronized (h)
        {
            h.add(location);
        }
        if (location.hasSpeed())
        {
            i.a(location.getSpeed());
            f.a(new Oh());
        }
        Timber.g("LocationListener", (new StringBuilder("New location on: ")).append(a).append(" location: ").append(location.toString()).toString(), new Object[0]);
        return;
        location;
        list;
        JVM INSTR monitorexit ;
        throw location;
    }

    public final void onProviderDisabled(String s)
    {
        synchronized (c)
        {
            d = false;
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onProviderEnabled(String s)
    {
        if (e)
        {
            b();
        }
    }

    public final void onStatusChanged(String s, int j, Bundle bundle)
    {
    }

    // Unreferenced inner class zZ$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        private zZ a;

        public final void run()
        {
            a.b();
        }

            
            {
                a = zZ.this;
                super();
            }
    }

}
