// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hc, jg, ka, ja, 
//            hj, hn, jf, jk, 
//            gy

public class jh extends hc
{
    private final class a extends hc.b
    {

        private final int CQ;
        private final String VQ[];
        final jh VR;

        protected void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(CQ, VQ);
            }
        }

        protected void d(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected void fp()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int i, String as[])
        {
            VR = jh.this;
            super(jh.this, onaddgeofencesresultlistener);
            CQ = LocationStatusCodes.cJ(i);
            VQ = as;
        }
    }

    private static final class b extends je.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener VS;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener VT;
        private jh VU;

        public void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (VU == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                jh jh1 = VU;
                jh jh2 = VU;
                jh2.getClass();
                jh1.a(jh2. new a(VS, i, as));
                VU = null;
                VS = null;
                VT = null;
                return;
            }
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (VU == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                jh jh1 = VU;
                jh jh2 = VU;
                jh2.getClass();
                jh1.a(jh2. new d(1, VT, i, pendingintent));
                VU = null;
                VS = null;
                VT = null;
                return;
            }
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (VU == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                jh jh1 = VU;
                jh jh2 = VU;
                jh2.getClass();
                jh1.a(jh2. new d(2, VT, i, as));
                VU = null;
                VS = null;
                VT = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, jh jh1)
        {
            VS = onaddgeofencesresultlistener;
            VT = null;
            VU = jh1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, jh jh1)
        {
            VT = onremovegeofencesresultlistener;
            VS = null;
            VU = jh1;
        }
    }

    private final class c
        implements jk
    {

        final jh VR;

        public void ci()
        {
            jh.b(VR);
        }

        public IInterface fo()
        {
            return iU();
        }

        public jf iU()
        {
            return (jf)VR.fo();
        }

        private c()
        {
            VR = jh.this;
            super();
        }

    }

    private final class d extends hc.b
    {

        private final int CQ;
        private final String VQ[];
        final jh VR;
        private final int VV;
        private final PendingIntent mPendingIntent;

        protected void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (VV)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(VV).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(CQ, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(CQ, VQ);
        }

        protected void d(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected void fp()
        {
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            VR = jh.this;
            super(jh.this, onremovegeofencesresultlistener);
            if (i != 1)
            {
                flag = false;
            }
            gy.A(flag);
            VV = i;
            CQ = LocationStatusCodes.cJ(j);
            mPendingIntent = pendingintent;
            VQ = null;
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, String as[])
        {
            VR = jh.this;
            super(jh.this, onremovegeofencesresultlistener);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gy.A(flag);
            VV = i;
            CQ = LocationStatusCodes.cJ(j);
            VQ = as;
            mPendingIntent = null;
        }
    }


    private final jk VG;
    private final jg VM;
    private final ka VN;
    private final ja VO;
    private final String VP;

    public jh(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        this(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, s, null);
    }

    public jh(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        VG = new c();
        VM = new jg(context, VG);
        VP = s1;
        VN = new ka(s, VG);
        VO = ja.a(context, s2, VG);
    }

    public jh(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        VG = new c();
        VM = new jg(context, VG);
        VP = s;
        VN = new ka(context.getPackageName(), VG);
        VO = ja.a(context, null, VG);
    }

    static void b(jh jh1)
    {
        jh1.ci();
    }

    protected void a(hj hj1, hc.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", VP);
        hj1.e(e, 0x4d7808, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List list, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        throws RemoteException
    {
        ci();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "At least one geofence must be specified.");
        hn.b(pendingintent, "PendingIntent must be specified.");
        hn.b(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener == null)
        {
            onaddgeofencesresultlistener = null;
        } else
        {
            onaddgeofencesresultlistener = new b(onaddgeofencesresultlistener, this);
        }
        ((jf)fo()).a(list, pendingintent, onaddgeofencesresultlistener, getContext().getPackageName());
    }

    protected jf at(IBinder ibinder)
    {
        return jf.a.as(ibinder);
    }

    protected String bp()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect()
    {
        synchronized (VM)
        {
            if (isConnected())
            {
                VM.removeAllListeners();
                VM.iT();
            }
            super.disconnect();
        }
        return;
        exception;
        jg1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location getLastLocation()
    {
        return VM.getLastLocation();
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        ci();
        hn.f(pendingintent);
        ((jf)fo()).removeActivityUpdates(pendingintent);
    }

    public void removeGeofences(PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        ci();
        hn.b(pendingintent, "PendingIntent must be specified.");
        hn.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener == null)
        {
            onremovegeofencesresultlistener = null;
        } else
        {
            onremovegeofencesresultlistener = new b(onremovegeofencesresultlistener, this);
        }
        ((jf)fo()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
    }

    public void removeGeofences(List list, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        ci();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "geofenceRequestIds can't be null nor empty.");
        hn.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (onremovegeofencesresultlistener == null)
        {
            list = null;
        } else
        {
            list = new b(onremovegeofencesresultlistener, this);
        }
        ((jf)fo()).a(as, list, getContext().getPackageName());
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        VM.removeLocationUpdates(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
        throws RemoteException
    {
        VM.removeLocationUpdates(locationlistener);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
        throws RemoteException
    {
        ci();
        hn.f(pendingintent);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hn.b(flag, "detectionIntervalMillis must be >= 0");
        ((jf)fo()).a(l, true, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        VM.requestLocationUpdates(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener)
        throws RemoteException
    {
        requestLocationUpdates(locationrequest, locationlistener, null);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (VM)
        {
            VM.requestLocationUpdates(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        jg1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void setMockLocation(Location location)
        throws RemoteException
    {
        VM.setMockLocation(location);
    }

    public void setMockMode(boolean flag)
        throws RemoteException
    {
        VM.setMockMode(flag);
    }

    protected IInterface x(IBinder ibinder)
    {
        return at(ibinder);
    }
}
