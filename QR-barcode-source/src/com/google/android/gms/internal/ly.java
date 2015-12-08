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
import com.google.android.gms.common.internal.o;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            me, lx, ma

public class ly
{
    private static class a extends Handler
    {

        private final LocationListener aeU;

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
            aeU.onLocationChanged(message);
        }

        public a(LocationListener locationlistener)
        {
            aeU = locationlistener;
        }

        public a(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            aeU = locationlistener;
        }
    }

    private static class b extends com.google.android.gms.location.a.a
    {

        private Handler aeV;

        public void onLocationChanged(Location location)
        {
            if (aeV == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                aeV.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            aeV = null;
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
            aeV = locationlistener;
        }
    }


    private final me Dh;
    private ContentProviderClient aeR;
    private boolean aeS;
    private HashMap aeT;
    private final Context mContext;

    public ly(Context context, me me1)
    {
        aeR = null;
        aeS = false;
        aeT = new HashMap();
        mContext = context;
        Dh = me1;
    }

    private b a(LocationListener locationlistener, Looper looper)
    {
        if (looper == null)
        {
            o.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        HashMap hashmap = aeT;
        hashmap;
        JVM INSTR monitorenter ;
        b b2 = (b)aeT.get(locationlistener);
        b b1;
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        b1 = new b(locationlistener, looper);
        aeT.put(locationlistener, b1);
        hashmap;
        JVM INSTR monitorexit ;
        return b1;
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void a(ma ma, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        Dh.dJ();
        locationlistener = a(locationlistener, looper);
        ((lx)Dh.gS()).a(ma, locationlistener);
    }

    public void b(ma ma, PendingIntent pendingintent)
        throws RemoteException
    {
        Dh.dJ();
        ((lx)Dh.gS()).a(ma, pendingintent);
    }

    public Location getLastLocation()
    {
        Dh.dJ();
        Location location;
        try
        {
            location = ((lx)Dh.gS()).bW(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void lY()
    {
        if (!aeS)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        setMockMode(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public void removeAllListeners()
    {
        Object obj = aeT;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = aeT.values().iterator();
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
        ((lx)Dh.gS()).a(b1);
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
        aeT.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        Dh.dJ();
        ((lx)Dh.gS()).a(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
        throws RemoteException
    {
        Dh.dJ();
        o.b(locationlistener, "Invalid null listener");
        HashMap hashmap = aeT;
        hashmap;
        JVM INSTR monitorenter ;
        locationlistener = (b)aeT.remove(locationlistener);
        if (aeR != null && aeT.isEmpty())
        {
            aeR.release();
            aeR = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        locationlistener.release();
        ((lx)Dh.gS()).a(locationlistener);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        Dh.dJ();
        ((lx)Dh.gS()).a(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        Dh.dJ();
        locationlistener = a(locationlistener, looper);
        ((lx)Dh.gS()).a(locationrequest, locationlistener);
    }

    public void setMockLocation(Location location)
        throws RemoteException
    {
        Dh.dJ();
        ((lx)Dh.gS()).setMockLocation(location);
    }

    public void setMockMode(boolean flag)
        throws RemoteException
    {
        Dh.dJ();
        ((lx)Dh.gS()).setMockMode(flag);
        aeS = flag;
    }
}
