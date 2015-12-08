// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            jw, kf, jo, zzpg, 
//            zzpi, jx

public final class ju
{

    private final kf a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private Map e;
    private Map f;

    public ju(Context context, kf kf1)
    {
        c = null;
        d = false;
        e = new HashMap();
        f = new HashMap();
        b = context;
        a = kf1;
    }

    private jw a(j j)
    {
        ap.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        jw jw2 = (jw)e.get(j);
        jw jw1;
        jw1 = jw2;
        if (jw2 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        jw1 = new jw(j);
        e.put(j, jw1);
        map;
        JVM INSTR monitorexit ;
        return jw1;
        j;
        map;
        JVM INSTR monitorexit ;
        throw j;
    }

    public final Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((jo)a.b()).a(b.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public final void a(LocationRequest locationrequest, j j)
    {
        a.a();
        j = a(j);
        ((jo)a.b()).a(zzpi.a(zzpg.a(locationrequest), j));
    }

    public final void b()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = e.values().iterator();
_L2:
        Object obj1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_84;
            }
            obj1 = (jw)iterator.next();
        } while (obj1 == null);
        ((jo)a.b()).a(zzpi.a(((com.google.android.gms.location.s) (obj1))));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        e.clear();
        exception = f.values().iterator();
_L3:
        do
        {
            if (!exception.hasNext())
            {
                break MISSING_BLOCK_LABEL_155;
            }
            obj1 = (jx)exception.next();
        } while (obj1 == null);
        ((jo)a.b()).a(zzpi.a(((com.google.android.gms.location.v) (obj1))));
          goto _L3
        f.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
        if (!d)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a.a();
        ((jo)a.b()).a(false);
        d = false;
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
