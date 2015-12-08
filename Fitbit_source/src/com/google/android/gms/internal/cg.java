// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            am, ck, cf

public class cg
{
    private static class a extends Handler
    {

        private final k a;

        public void handleMessage(Message message)
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
            a.a(message);
        }

        public a(k k1)
        {
            a = k1;
        }

        public a(k k1, Looper looper)
        {
            super(looper);
            a = k1;
        }
    }

    private static class b extends com.google.android.gms.location.o.a
    {

        private Handler a;

        public void a()
        {
            a = null;
        }

        public void a(Location location)
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

        b(k k, Looper looper)
        {
            if (looper == null)
            {
                k = new a(k);
            } else
            {
                k = new a(k, looper);
            }
            a = k;
        }
    }


    private final ck a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private HashMap e;

    public cg(Context context, ck ck1)
    {
        c = null;
        d = false;
        e = new HashMap();
        b = context;
        a = ck1;
    }

    private b a(k k, Looper looper)
    {
        if (looper == null)
        {
            am.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        HashMap hashmap = e;
        hashmap;
        JVM INSTR monitorenter ;
        b b2 = (b)e.get(k);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        b1 = new b(k, looper);
        e.put(k, b1);
        hashmap;
        JVM INSTR monitorexit ;
        return b1;
        k;
        hashmap;
        JVM INSTR monitorexit ;
        throw k;
    }

    public Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((cf)a.c()).a(b.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void a(PendingIntent pendingintent)
        throws RemoteException
    {
        a.a();
        ((cf)a.c()).b(pendingintent);
    }

    public void a(Location location)
        throws RemoteException
    {
        a.a();
        ((cf)a.c()).a(location);
    }

    public void a(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        a.a();
        ((cf)a.c()).a(locationrequest, pendingintent);
    }

    public void a(LocationRequest locationrequest, k k, Looper looper)
        throws RemoteException
    {
        a.a();
        k = a(k, looper);
        ((cf)a.c()).a(locationrequest, k);
    }

    public void a(k k)
        throws RemoteException
    {
        a.a();
        am.a(k, "Invalid null listener");
        HashMap hashmap = e;
        hashmap;
        JVM INSTR monitorenter ;
        k = (b)e.remove(k);
        if (c != null && e.isEmpty())
        {
            c.release();
            c = null;
        }
        if (k == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        k.a();
        ((cf)a.c()).a(k);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        k;
        hashmap;
        JVM INSTR monitorexit ;
        throw k;
    }

    public void a(boolean flag)
        throws RemoteException
    {
        a.a();
        ((cf)a.c()).a(flag);
        d = flag;
    }

    public void b()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = e.values().iterator();
_L2:
        b b1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_79;
            }
            b1 = (b)iterator.next();
        } while (b1 == null);
        ((cf)a.c()).a(b1);
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
        obj;
        JVM INSTR monitorexit ;
    }

    public void c()
    {
        if (!d)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        a(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }
}
