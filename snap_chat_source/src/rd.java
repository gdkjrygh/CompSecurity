// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class rd extends rb
{

    final Ab g;
    Location h;
    alF i;
    protected final Object j;

    public rd()
    {
        JY jy = Ka.GEO_LENSES_METADATA_CACHE;
        LB lb = new LB();
        Ab ab = Ab.a();
        ri ri1 = ri.a();
        Bus bus = Mf.a();
        new PC();
        this(jy, lb, ab, ri1, bus);
    }

    private rd(JY jy, LB lb, Ab ab, ri ri1, Bus bus)
    {
        super(jy, lb, ri1, bus);
        j = new Object();
        g = ab;
    }

    private void f()
    {
        PG.b(new Runnable() {

            private rd a;

            public final void run()
            {
                synchronized (a.j)
                {
                    a.h = a.g.d();
                    a.i = PB.a();
                }
                return;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = rd.this;
                super();
            }
        });
    }

    private Location g()
    {
        f();
        Object obj = j;
        obj;
        JVM INSTR monitorenter ;
        Location location;
        if (i == null || !PB.a().c(i.b(10)))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        location = h;
        return location;
        obj;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(List list)
    {
        for (list = list.iterator(); list.hasNext(); a(((BQ) ((BS)list.next())))) { }
        b.a(new ML());
    }

    protected final void a(Map map)
    {
        super.a(map);
        b.a(new ML());
    }

    protected final long c()
    {
        return TimeUnit.DAYS.toMillis(1L);
    }

    protected final Class d()
    {
        return BS;
    }

    public final List e()
    {
        Object obj1;
        Location location;
        obj1 = new ArrayList();
        if (!f)
        {
            f();
            return ((List) (obj1));
        }
        location = g();
        if (location == null)
        {
            return ((List) (obj1));
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = e.entrySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry;
        BS bs;
        entry = (java.util.Map.Entry)iterator.next();
        bs = (BS)entry.getValue();
        if (bs.mGeofence == null || location == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
          goto _L3
_L6:
        boolean flag;
        if (!flag) goto _L5; else goto _L4
_L4:
        ((List) (obj1)).add(entry.getValue());
          goto _L5
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
_L3:
        flag = bs.mGeofence.a(location);
          goto _L6
_L2:
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
        flag = false;
          goto _L6
    }

    public final void onPrepareLens(Nu nu)
    {
        if (nu.lens instanceof BS)
        {
            PG.b(new Runnable(nu) {

                private Nu a;
                private rd b;

                public final void run()
                {
                    b.a((BS)a.lens, false);
                }

            
            {
                b = rd.this;
                a = nu;
                super();
            }
            });
        }
    }
}
