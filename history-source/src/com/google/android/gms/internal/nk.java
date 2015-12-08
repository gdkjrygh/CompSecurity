// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            nc, nj, mz, ie, 
//            jx, ni, je

public class nk extends nc
{
    private final class a extends jl.b
    {

        private final int Iv;
        private final String aha[];
        final nk ahb;

        protected void a(com.google.android.gms.location.c.a a1)
        {
            if (a1 != null)
            {
                a1.a(Iv, aha);
            }
        }

        protected void g(Object obj)
        {
            a((com.google.android.gms.location.c.a)obj);
        }

        protected void hx()
        {
        }

        public a(com.google.android.gms.location.c.a a1, int i, String as[])
        {
            ahb = nk.this;
            super(nk.this, a1);
            Iv = LocationStatusCodes.eC(i);
            aha = as;
        }
    }

    private static final class b extends nh.a
    {

        private com.google.android.gms.location.c.a ahc;
        private com.google.android.gms.location.c.b ahd;
        private nk ahe;

        public void a(int i, PendingIntent pendingintent)
        {
            if (ahe == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                nk nk1 = ahe;
                nk nk2 = ahe;
                nk2.getClass();
                nk1.a(nk2. new c(1, ahd, i, pendingintent));
                ahe = null;
                ahc = null;
                ahd = null;
                return;
            }
        }

        public void a(int i, String as[])
            throws RemoteException
        {
            if (ahe == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                nk nk1 = ahe;
                nk nk2 = ahe;
                nk2.getClass();
                nk1.a(nk2. new a(ahc, i, as));
                ahe = null;
                ahc = null;
                ahd = null;
                return;
            }
        }

        public void b(int i, String as[])
        {
            if (ahe == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                nk nk1 = ahe;
                nk nk2 = ahe;
                nk2.getClass();
                nk1.a(nk2. new c(2, ahd, i, as));
                ahe = null;
                ahc = null;
                ahd = null;
                return;
            }
        }

        public b(com.google.android.gms.location.c.a a1, nk nk1)
        {
            ahc = a1;
            ahd = null;
            ahe = nk1;
        }

        public b(com.google.android.gms.location.c.b b1, nk nk1)
        {
            ahd = b1;
            ahc = null;
            ahe = nk1;
        }
    }

    private final class c extends jl.b
    {

        private final int Iv;
        private final String aha[];
        final nk ahb;
        private final int ahf;
        private final PendingIntent mPendingIntent;

        protected void a(com.google.android.gms.location.c.b b1)
        {
label0:
            {
label1:
                {
                    if (b1 != null)
                    {
                        switch (ahf)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(ahf).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                b1.a(Iv, mPendingIntent);
                return;
            }
            b1.b(Iv, aha);
        }

        protected void g(Object obj)
        {
            a((com.google.android.gms.location.c.b)obj);
        }

        protected void hx()
        {
        }

        public c(int i, com.google.android.gms.location.c.b b1, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            ahb = nk.this;
            super(nk.this, b1);
            if (i != 1)
            {
                flag = false;
            }
            je.K(flag);
            ahf = i;
            Iv = LocationStatusCodes.eC(j);
            mPendingIntent = pendingintent;
            aha = null;
        }

        public c(int i, com.google.android.gms.location.c.b b1, int j, String as[])
        {
            ahb = nk.this;
            super(nk.this, b1);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            je.K(flag);
            ahf = i;
            Iv = LocationStatusCodes.eC(j);
            aha = as;
            mPendingIntent = null;
        }
    }


    private final nj agX;
    private final mz agY;
    private final ie agZ;

    public nk(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, null);
    }

    public nk(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, s2, null);
    }

    public nk(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2, 
            String s3)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s1);
        agX = new nj(context, Ee);
        agY = mz.a(context, s2, s3, Ee);
        agZ = ie.a(context, Ee);
    }

    public void S(boolean flag)
        throws RemoteException
    {
        agX.S(flag);
    }

    public void a(long l, PendingIntent pendingintent)
        throws RemoteException
    {
        dS();
        jx.i(pendingintent);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "detectionIntervalMillis must be >= 0");
        ((ni)hw()).a(l, true, pendingintent);
    }

    public void a(PendingIntent pendingintent)
        throws RemoteException
    {
        dS();
        jx.i(pendingintent);
        ((ni)hw()).a(pendingintent);
    }

    public void a(PendingIntent pendingintent, com.google.android.gms.location.c.b b1)
        throws RemoteException
    {
        dS();
        jx.b(pendingintent, "PendingIntent must be specified.");
        jx.b(b1, "OnRemoveGeofencesResultListener not provided.");
        if (b1 == null)
        {
            b1 = null;
        } else
        {
            b1 = new b(b1, this);
        }
        ((ni)hw()).a(pendingintent, b1, getContext().getPackageName());
    }

    public void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.location.c.a a1)
        throws RemoteException
    {
        dS();
        jx.b(geofencingrequest, "geofencingRequest can't be null.");
        jx.b(pendingintent, "PendingIntent must be specified.");
        jx.b(a1, "OnAddGeofencesResultListener not provided.");
        if (a1 == null)
        {
            a1 = null;
        } else
        {
            a1 = new b(a1, this);
        }
        ((ni)hw()).a(geofencingrequest, pendingintent, a1);
    }

    public void a(LocationListener locationlistener)
        throws RemoteException
    {
        agX.a(locationlistener);
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (agX)
        {
            agX.a(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        nj1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void a(List list, com.google.android.gms.location.c.b b1)
        throws RemoteException
    {
        dS();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "geofenceRequestIds can't be null nor empty.");
        jx.b(b1, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (b1 == null)
        {
            list = null;
        } else
        {
            list = new b(b1, this);
        }
        ((ni)hw()).a(as, list, getContext().getPackageName());
    }

    public void b(Location location)
        throws RemoteException
    {
        agX.b(location);
    }

    public void b(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        agX.b(locationrequest, pendingintent);
    }

    public void c(PendingIntent pendingintent)
        throws RemoteException
    {
        agX.c(pendingintent);
    }

    public void disconnect()
    {
        nj nj1 = agX;
        nj1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        agX.removeAllListeners();
        agX.nm();
_L1:
        super.disconnect();
        nj1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        nj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Location nl()
    {
        return agX.nl();
    }
}
