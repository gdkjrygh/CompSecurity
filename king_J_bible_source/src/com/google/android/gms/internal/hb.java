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
//            hf, ha, fq

public class hb
{
    private static class a extends Handler
    {

        private final LocationListener Oo;

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
            Oo.onLocationChanged(message);
        }

        public a(LocationListener locationlistener)
        {
            Oo = locationlistener;
        }

        public a(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            Oo = locationlistener;
        }
    }

    private static class b extends com.google.android.gms.location.a.a
    {

        private Handler Op;

        public void onLocationChanged(Location location)
        {
            if (Op == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                Op.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            Op = null;
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
            Op = locationlistener;
        }
    }


    private final hf Ok;
    private ContentProviderClient Ol;
    private boolean Om;
    private HashMap On;
    private final Context mContext;

    public hb(Context context, hf hf1)
    {
        Ol = null;
        Om = false;
        On = new HashMap();
        mContext = context;
        Ok = hf1;
    }

    public Location getLastLocation()
    {
        Ok.bT();
        Location location;
        try
        {
            location = ((ha)Ok.eM()).aW(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void hQ()
    {
        if (Om)
        {
            setMockMode(false);
        }
    }

    public void removeAllListeners()
    {
        Object obj = On;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = On.values().iterator();
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
        ((ha)Ok.eM()).a(b1);
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
        On.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
    {
        Ok.bT();
        try
        {
            ((ha)Ok.eM()).a(pendingintent);
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
        Ok.bT();
        fq.b(locationlistener, "Invalid null listener");
        HashMap hashmap = On;
        hashmap;
        JVM INSTR monitorenter ;
        locationlistener = (b)On.remove(locationlistener);
        if (Ol != null && On.isEmpty())
        {
            Ol.release();
            Ol = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        locationlistener.release();
        ((ha)Ok.eM()).a(locationlistener);
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
        Ok.bT();
        try
        {
            ((ha)Ok.eM()).a(locationrequest, pendingintent);
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
        Ok.bT();
        if (looper == null)
        {
            fq.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
        }
        HashMap hashmap = On;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)On.get(locationlistener);
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        looper = new b(locationlistener, looper);
_L1:
        On.put(locationlistener, looper);
        ((ha)Ok.eM()).a(locationrequest, looper, mContext.getPackageName());
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
        Ok.bT();
        try
        {
            ((ha)Ok.eM()).setMockLocation(location);
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
        Ok.bT();
        try
        {
            ((ha)Ok.eM()).setMockMode(flag);
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        Om = flag;
    }
}
