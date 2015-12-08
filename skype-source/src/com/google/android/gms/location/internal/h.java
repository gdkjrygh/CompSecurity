// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.f;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            m, f, LocationRequestUpdateData, LocationRequestInternal

public final class h
{
    private static final class a extends com.google.android.gms.location.l.a
    {

        private Handler a;

        private void a(int i, Object obj)
        {
            if (a == null)
            {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = i;
                message.obj = obj;
                a.sendMessage(message);
                return;
            }
        }

        public final void a(LocationAvailability locationavailability)
        {
            a(1, locationavailability);
        }

        public final void a(LocationResult locationresult)
        {
            a(0, locationresult);
        }
    }

    private static final class b extends Handler
    {

        private final f a;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;

            case 1: // '\001'
                message = new Location((Location)message.obj);
                break;
            }
            a.onLocationChanged(message);
        }

        public b(f f1)
        {
            a = f1;
        }
    }

    private static final class c extends com.google.android.gms.location.m.a
    {

        private Handler a;

        public final void a()
        {
            a = null;
        }

        public final void a(Location location)
        {
            if (a == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                a.sendMessage(message);
                return;
            }
        }

        c(f f1)
        {
            boolean flag;
            if (Looper.myLooper() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            y.a(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            a = new b(f1);
        }
    }


    private final m a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private Map e;
    private Map f;

    public h(Context context, m m1)
    {
        c = null;
        d = false;
        e = new HashMap();
        f = new HashMap();
        b = context;
        a = m1;
    }

    private c b(f f1)
    {
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        c c2 = (c)e.get(f1);
        c c1;
        c1 = c2;
        if (c2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        c1 = new c(f1);
        e.put(f1, c1);
        map;
        JVM INSTR monitorexit ;
        return c1;
        f1;
        map;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public final void a()
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
            obj1 = (c)iterator.next();
        } while (obj1 == null);
        ((com.google.android.gms.location.internal.f)a.b()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.m) (obj1))));
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
            obj1 = (a)exception.next();
        } while (obj1 == null);
        ((com.google.android.gms.location.internal.f)a.b()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.l) (obj1))));
          goto _L3
        f.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(LocationRequest locationrequest, f f1)
        throws RemoteException
    {
        a.a();
        f1 = b(f1);
        ((com.google.android.gms.location.internal.f)a.b()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationrequest), f1));
    }

    public final void a(f f1)
        throws RemoteException
    {
        a.a();
        y.a(f1, "Invalid null listener");
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        f1 = (c)e.remove(f1);
        if (c != null && e.isEmpty())
        {
            c.release();
            c = null;
        }
        if (f1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        f1.a();
        ((com.google.android.gms.location.internal.f)a.b()).a(LocationRequestUpdateData.a(f1));
        map;
        JVM INSTR monitorexit ;
        return;
        f1;
        map;
        JVM INSTR monitorexit ;
        throw f1;
    }

    public final void b()
    {
        if (!d)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a.a();
        ((com.google.android.gms.location.internal.f)a.b()).a(false);
        d = false;
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
