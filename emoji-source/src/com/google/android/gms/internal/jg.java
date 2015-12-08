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
//            hb, jf, jz, iz, 
//            hi, hm, je, jj, 
//            gx

public class jg extends hb
{
    private final class a extends hb.b
    {

        private final int CT;
        private final String VT[];
        final jg VU;

        protected void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(CT, VT);
            }
        }

        protected void d(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected void fu()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int i, String as[])
        {
            VU = jg.this;
            super(jg.this, onaddgeofencesresultlistener);
            CT = LocationStatusCodes.cJ(i);
            VT = as;
        }
    }

    private static final class b extends jd.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener VV;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener VW;
        private jg VX;

        public void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (VX == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                jg jg1 = VX;
                jg jg2 = VX;
                jg2.getClass();
                jg1.a(jg2. new a(VV, i, as));
                VX = null;
                VV = null;
                VW = null;
                return;
            }
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (VX == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                jg jg1 = VX;
                jg jg2 = VX;
                jg2.getClass();
                jg1.a(jg2. new d(1, VW, i, pendingintent));
                VX = null;
                VV = null;
                VW = null;
                return;
            }
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (VX == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                jg jg1 = VX;
                jg jg2 = VX;
                jg2.getClass();
                jg1.a(jg2. new d(2, VW, i, as));
                VX = null;
                VV = null;
                VW = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, jg jg1)
        {
            VV = onaddgeofencesresultlistener;
            VW = null;
            VX = jg1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, jg jg1)
        {
            VW = onremovegeofencesresultlistener;
            VV = null;
            VX = jg1;
        }
    }

    private final class c
        implements jj
    {

        final jg VU;

        public void cn()
        {
            jg.b(VU);
        }

        public IInterface ft()
        {
            return iZ();
        }

        public je iZ()
        {
            return (je)VU.ft();
        }

        private c()
        {
            VU = jg.this;
            super();
        }

    }

    private final class d extends hb.b
    {

        private final int CT;
        private final String VT[];
        final jg VU;
        private final int VY;
        private final PendingIntent mPendingIntent;

        protected void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (VY)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(VY).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(CT, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(CT, VT);
        }

        protected void d(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected void fu()
        {
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            VU = jg.this;
            super(jg.this, onremovegeofencesresultlistener);
            if (i != 1)
            {
                flag = false;
            }
            gx.A(flag);
            VY = i;
            CT = LocationStatusCodes.cJ(j);
            mPendingIntent = pendingintent;
            VT = null;
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, String as[])
        {
            VU = jg.this;
            super(jg.this, onremovegeofencesresultlistener);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gx.A(flag);
            VY = i;
            CT = LocationStatusCodes.cJ(j);
            VT = as;
            mPendingIntent = null;
        }
    }


    private final jj VJ;
    private final jf VP;
    private final jz VQ;
    private final iz VR;
    private final String VS;

    public jg(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        this(context, looper, context.getPackageName(), connectioncallbacks, onconnectionfailedlistener, s, null);
    }

    public jg(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        VJ = new c();
        VP = new jf(context, VJ);
        VS = s1;
        VQ = new jz(s, VJ);
        VR = iz.a(context, s2, VJ);
    }

    public jg(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        VJ = new c();
        VP = new jf(context, VJ);
        VS = s;
        VQ = new jz(context.getPackageName(), VJ);
        VR = iz.a(context, null, VJ);
    }

    static void b(jg jg1)
    {
        jg1.cn();
    }

    protected void a(hi hi1, hb.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", VS);
        hi1.e(e, 0x4da6e8, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List list, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        throws RemoteException
    {
        cn();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "At least one geofence must be specified.");
        hm.b(pendingintent, "PendingIntent must be specified.");
        hm.b(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener == null)
        {
            onaddgeofencesresultlistener = null;
        } else
        {
            onaddgeofencesresultlistener = new b(onaddgeofencesresultlistener, this);
        }
        ((je)ft()).a(list, pendingintent, onaddgeofencesresultlistener, getContext().getPackageName());
    }

    protected je at(IBinder ibinder)
    {
        return je.a.as(ibinder);
    }

    protected String bu()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect()
    {
        synchronized (VP)
        {
            if (isConnected())
            {
                VP.removeAllListeners();
                VP.iY();
            }
            super.disconnect();
        }
        return;
        exception;
        jf1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location getLastLocation()
    {
        return VP.getLastLocation();
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        cn();
        hm.f(pendingintent);
        ((je)ft()).removeActivityUpdates(pendingintent);
    }

    public void removeGeofences(PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        cn();
        hm.b(pendingintent, "PendingIntent must be specified.");
        hm.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener == null)
        {
            onremovegeofencesresultlistener = null;
        } else
        {
            onremovegeofencesresultlistener = new b(onremovegeofencesresultlistener, this);
        }
        ((je)ft()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
    }

    public void removeGeofences(List list, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        cn();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "geofenceRequestIds can't be null nor empty.");
        hm.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (onremovegeofencesresultlistener == null)
        {
            list = null;
        } else
        {
            list = new b(onremovegeofencesresultlistener, this);
        }
        ((je)ft()).a(as, list, getContext().getPackageName());
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        VP.removeLocationUpdates(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
        throws RemoteException
    {
        VP.removeLocationUpdates(locationlistener);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
        throws RemoteException
    {
        cn();
        hm.f(pendingintent);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.b(flag, "detectionIntervalMillis must be >= 0");
        ((je)ft()).a(l, true, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        VP.requestLocationUpdates(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener)
        throws RemoteException
    {
        requestLocationUpdates(locationrequest, locationlistener, null);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (VP)
        {
            VP.requestLocationUpdates(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        jf1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void setMockLocation(Location location)
        throws RemoteException
    {
        VP.setMockLocation(location);
    }

    public void setMockMode(boolean flag)
        throws RemoteException
    {
        VP.setMockMode(flag);
    }

    protected IInterface x(IBinder ibinder)
    {
        return at(ibinder);
    }
}
