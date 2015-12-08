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
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;

// Referenced classes of package com.google.android.gms.internal:
//            ow, pd, nz, hv, 
//            kn, pc, ju

public final class pe extends ow
{
    final class a extends kb.b
    {

        private final int Rk;
        private final String avI[];
        final pe avJ;

        private void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(Rk, avI);
            }
        }

        protected final void i(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected final void iQ()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int j, String as[])
        {
            avJ = pe.this;
            super(pe.this, onaddgeofencesresultlistener);
            Rk = LocationStatusCodes.hx(j);
            avI = as;
        }
    }

    static final class b extends pb.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener avK;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener avL;
        private pe avM;

        public final void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (avM == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                pe pe1 = avM;
                pe pe2 = avM;
                pe2.getClass();
                pe1.a(pe2. new a(avK, i, as));
                avM = null;
                avK = null;
                avL = null;
                return;
            }
        }

        public final void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (avM == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                pe pe1 = avM;
                pe pe2 = avM;
                pe2.getClass();
                pe1.a(pe2. new c(1, avL, i, pendingintent));
                avM = null;
                avK = null;
                avL = null;
                return;
            }
        }

        public final void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (avM == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                pe pe1 = avM;
                pe pe2 = avM;
                pe2.getClass();
                pe1.a(pe2. new c(2, avL, i, as));
                avM = null;
                avK = null;
                avL = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, pe pe1)
        {
            avK = onaddgeofencesresultlistener;
            avL = null;
            avM = pe1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, pe pe1)
        {
            avL = onremovegeofencesresultlistener;
            avK = null;
            avM = pe1;
        }
    }

    final class c extends kb.b
    {

        private final int Rk;
        private final String avI[];
        final pe avJ;
        private final int avN;
        private final PendingIntent mPendingIntent;

        private void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (avN)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder("Unsupported action: ")).append(avN).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(Rk, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(Rk, avI);
        }

        protected final void i(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected final void iQ()
        {
        }

        public c(int j, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int k, PendingIntent pendingintent)
        {
            boolean flag = true;
            avJ = pe.this;
            super(pe.this, onremovegeofencesresultlistener);
            if (j != 1)
            {
                flag = false;
            }
            ju.K(flag);
            avN = j;
            Rk = LocationStatusCodes.hx(k);
            mPendingIntent = pendingintent;
            avI = null;
        }

        public c(int j, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int k, String as[])
        {
            avJ = pe.this;
            super(pe.this, onremovegeofencesresultlistener);
            boolean flag;
            if (j == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ju.K(flag);
            avN = j;
            Rk = LocationStatusCodes.hx(k);
            avI = as;
            mPendingIntent = null;
        }
    }


    private final pd avF;
    private final nz avG;
    private final hv avH;

    public pe(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, s2, null);
    }

    private pe(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2, 
            String s3)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s1);
        avF = new pd(context, FU);
        avG = nz.a(context, s2, s3, FU);
        avH = hv.a(context, FU);
    }

    public final void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        throws RemoteException
    {
        dR();
        kn.b(geofencingrequest, "geofencingRequest can't be null.");
        kn.b(pendingintent, "PendingIntent must be specified.");
        kn.b(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener == null)
        {
            onaddgeofencesresultlistener = null;
        } else
        {
            onaddgeofencesresultlistener = new b(onaddgeofencesresultlistener, this);
        }
        ((pc)iP()).a(geofencingrequest, pendingintent, onaddgeofencesresultlistener);
    }

    public final void disconnect()
    {
        pd pd1 = avF;
        pd1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        avF.removeAllListeners();
        avF.pv();
_L1:
        super.disconnect();
        pd1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        pd1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Location getLastLocation()
    {
        return avF.getLastLocation();
    }

    public final void removeGeofences(PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        dR();
        kn.b(pendingintent, "PendingIntent must be specified.");
        kn.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener == null)
        {
            onremovegeofencesresultlistener = null;
        } else
        {
            onremovegeofencesresultlistener = new b(onremovegeofencesresultlistener, this);
        }
        ((pc)iP()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
    }

    public final void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        avF.removeLocationUpdates(pendingintent);
    }

    public final void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        avF.requestLocationUpdates(locationrequest, pendingintent);
    }
}
