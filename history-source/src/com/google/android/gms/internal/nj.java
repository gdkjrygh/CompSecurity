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
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            jx, np, ni

public class nj
{
    private static class a extends Handler
    {

        private final LocationListener agV;

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
            agV.onLocationChanged(message);
        }

        public a(LocationListener locationlistener)
        {
            agV = locationlistener;
        }

        public a(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            agV = locationlistener;
        }
    }

    private static class b extends com.google.android.gms.location.b.a
    {

        private Handler agW;

        public void onLocationChanged(Location location)
        {
            if (agW == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                agW.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            agW = null;
        }

        b(LocationListener locationlistener, Looper looper)
        {
            if (looper == null)
            {
                locationlistener = new a(locationlistener);
            } else
            {
                locationlistener = new a(locationlistener, looper);
            }
            agW = locationlistener;
        }
    }


    private final np Ee;
    private ContentProviderClient agS;
    private boolean agT;
    private HashMap agU;
    private final Context mContext;

    public nj(Context context, np np1)
    {
        agS = null;
        agT = false;
        agU = new HashMap();
        mContext = context;
        Ee = np1;
    }

    private b a(LocationListener locationlistener, Looper looper)
    {
        if (looper == null)
        {
            jx.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        b b2 = (b)agU.get(locationlistener);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        b1 = new b(locationlistener, looper);
        agU.put(locationlistener, b1);
        hashmap;
        JVM INSTR monitorexit ;
        return b1;
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void S(boolean flag)
        throws RemoteException
    {
        Ee.dS();
        ((ni)Ee.hw()).S(flag);
        agT = flag;
    }

    public void a(LocationListener locationlistener)
        throws RemoteException
    {
        Ee.dS();
        jx.b(locationlistener, "Invalid null listener");
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        locationlistener = (b)agU.remove(locationlistener);
        if (agS != null && agU.isEmpty())
        {
            agS.release();
            agS = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        locationlistener.release();
        ((ni)Ee.hw()).a(locationlistener);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        Ee.dS();
        locationlistener = a(locationlistener, looper);
        ((ni)Ee.hw()).a(locationrequest, locationlistener);
    }

    public void b(Location location)
        throws RemoteException
    {
        Ee.dS();
        ((ni)Ee.hw()).b(location);
    }

    public void b(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        Ee.dS();
        ((ni)Ee.hw()).a(locationrequest, pendingintent);
    }

    public void c(PendingIntent pendingintent)
        throws RemoteException
    {
        Ee.dS();
        ((ni)Ee.hw()).b(pendingintent);
    }

    public Location nl()
    {
        Ee.dS();
        Location location;
        try
        {
            location = ((ni)Ee.hw()).bZ(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void nm()
    {
        if (!agT)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        S(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public void removeAllListeners()
    {
        Object obj = agU;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = agU.values().iterator();
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
        ((ni)Ee.hw()).a(b1);
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
        agU.clear();
        obj;
        JVM INSTR monitorexit ;
    }
}
