// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg, LocationRequestUpdateData, LocationRequestInternal

public class zzi
{

    private final zzn a;
    private final Context b;
    private ContentProviderClient c;
    private boolean d;
    private Map e;
    private Map f;

    public zzi(Context context, zzn zzn1)
    {
        c = null;
        d = false;
        e = new HashMap();
        f = new HashMap();
        b = context;
        a = zzn1;
    }

    private zzc a(LocationListener locationlistener, Looper looper)
    {
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        zzc zzc2 = (zzc)e.get(locationlistener);
        zzc zzc1;
        zzc1 = zzc2;
        if (zzc2 != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        zzc1 = new zzc(locationlistener, looper);
        e.put(locationlistener, zzc1);
        map;
        JVM INSTR monitorexit ;
        return zzc1;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public Location a()
    {
        a.a();
        Location location;
        try
        {
            location = ((zzg)a.c()).b(b.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void a(LocationListener locationlistener)
    {
        a.a();
        zzu.a(locationlistener, "Invalid null listener");
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        locationlistener = (zzc)e.remove(locationlistener);
        if (c != null && e.isEmpty())
        {
            c.release();
            c = null;
        }
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        locationlistener.a();
        ((zzg)a.c()).a(LocationRequestUpdateData.a(locationlistener));
        map;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        a.a();
        locationlistener = a(locationlistener, looper);
        ((zzg)a.c()).a(LocationRequestUpdateData.a(LocationRequestInternal.a(locationrequest), locationlistener));
    }

    public void a(boolean flag)
    {
        a.a();
        ((zzg)a.c()).a(flag);
        d = flag;
    }

    public void b()
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
            obj1 = (zzc)iterator.next();
        } while (obj1 == null);
        ((zzg)a.c()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.zzd) (obj1))));
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
            obj1 = (zza)exception.next();
        } while (obj1 == null);
        ((zzg)a.c()).a(LocationRequestUpdateData.a(((com.google.android.gms.location.zzc) (obj1))));
          goto _L3
        f.clear();
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

    private class zzc extends com.google.android.gms.location.zzd.zza
    {
        private class zzb extends Handler
        {

            private final LocationListener a;

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
                a.onLocationChanged(message);
            }

            public zzb(LocationListener locationlistener)
            {
                a = locationlistener;
            }

            public zzb(LocationListener locationlistener, Looper looper)
            {
                super(looper);
                a = locationlistener;
            }
        }


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

        zzc(LocationListener locationlistener, Looper looper)
        {
            if (looper == null)
            {
                boolean flag;
                if (Looper.myLooper() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzu.a(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            if (looper == null)
            {
                locationlistener = new zzb(locationlistener);
            } else
            {
                locationlistener = new zzb(locationlistener, looper);
            }
            a = locationlistener;
        }
    }


    private class zza extends com.google.android.gms.location.zzc.zza
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

        public void a(LocationAvailability locationavailability)
        {
            a(1, locationavailability);
        }

        public void a(LocationResult locationresult)
        {
            a(0, locationresult);
        }
    }

}
