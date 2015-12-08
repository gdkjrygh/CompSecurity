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
//            fc, ex, dm

public class ey
{
    private static class a extends Handler
    {

        private final LocationListener oS;

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
            oS.onLocationChanged(message);
        }

        public a(LocationListener locationlistener)
        {
            oS = locationlistener;
        }

        public a(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            oS = locationlistener;
        }
    }

    private static class b extends com.google.android.gms.location.a.a
    {

        private Handler oT;

        public void onLocationChanged(Location location)
        {
            if (oT == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                oT.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            oT = null;
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
            oT = locationlistener;
        }
    }


    private final Context mContext;
    private final fc oO;
    private ContentProviderClient oP;
    private boolean oQ;
    private HashMap oR;

    public ey(Context context, fc fc1)
    {
        oP = null;
        oQ = false;
        oR = new HashMap();
        mContext = context;
        oO = fc1;
    }

    public void cm()
    {
        if (oQ)
        {
            setMockMode(false);
        }
    }

    public Location getLastLocation()
    {
        oO.bc();
        Location location;
        try
        {
            location = ((ex)oO.bd()).cl();
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void removeAllListeners()
    {
        Object obj = oR;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = oR.values().iterator();
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
        ((ex)oO.bd()).a(b1);
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
        oR.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
    {
        oO.bc();
        try
        {
            ((ex)oO.bd()).a(pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void removeLocationUpdates(LocationListener locationlistener)
    {
        oO.bc();
        dm.a(locationlistener, "Invalid null listener");
        HashMap hashmap = oR;
        hashmap;
        JVM INSTR monitorenter ;
        locationlistener = (b)oR.remove(locationlistener);
        if (oP != null && oR.isEmpty())
        {
            oP.release();
            oP = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        locationlistener.release();
        ((ex)oO.bd()).a(locationlistener);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        throw new IllegalStateException(locationlistener);
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
    {
        oO.bc();
        try
        {
            ((ex)oO.bd()).a(locationrequest, pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (LocationRequest locationrequest)
        {
            throw new IllegalStateException(locationrequest);
        }
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        oO.bc();
        if (looper == null)
        {
            dm.a(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        HashMap hashmap = oR;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)oR.get(locationlistener);
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        looper = new b(locationlistener, looper);
_L1:
        oR.put(locationlistener, looper);
        ((ex)oO.bd()).a(locationrequest, looper, mContext.getPackageName());
        hashmap;
        JVM INSTR monitorexit ;
        return;
        locationrequest;
        throw new IllegalStateException(locationrequest);
        locationrequest;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationrequest;
        looper = b1;
          goto _L1
    }

    public void setMockLocation(Location location)
    {
        oO.bc();
        try
        {
            ((ex)oO.bd()).setMockLocation(location);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Location location)
        {
            throw new IllegalStateException(location);
        }
    }

    public void setMockMode(boolean flag)
    {
        oO.bc();
        try
        {
            ((ex)oO.bd()).setMockMode(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        oQ = flag;
    }
}
