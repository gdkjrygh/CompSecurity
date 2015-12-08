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
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationStatusCodes;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ly, mw, lp, ie, 
//            lx, me, ma

public class lz extends e
{
    private final class a extends com.google.android.gms.common.internal.e.b
    {

        private final int HF;
        private final String afb[];
        final lz afc;

        protected void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(HF, afb);
            }
        }

        protected void g(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected void gT()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int i, String as[])
        {
            afc = lz.this;
            super(lz.this, onaddgeofencesresultlistener);
            HF = LocationStatusCodes.ef(i);
            afb = as;
        }
    }

    private static final class b extends lw.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener afd;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener afe;
        private lz aff;

        public void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (aff == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                lz lz1 = aff;
                lz lz2 = aff;
                lz2.getClass();
                lz1.a(lz2. new a(afd, i, as));
                aff = null;
                afd = null;
                afe = null;
                return;
            }
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (aff == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                lz lz1 = aff;
                lz lz2 = aff;
                lz2.getClass();
                lz1.a(lz2. new d(1, afe, i, pendingintent));
                aff = null;
                afd = null;
                afe = null;
                return;
            }
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (aff == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                lz lz1 = aff;
                lz lz2 = aff;
                lz2.getClass();
                lz1.a(lz2. new d(2, afe, i, as));
                aff = null;
                afd = null;
                afe = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, lz lz1)
        {
            afd = onaddgeofencesresultlistener;
            afe = null;
            aff = lz1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, lz lz1)
        {
            afe = onremovegeofencesresultlistener;
            afd = null;
            aff = lz1;
        }
    }

    private final class c
        implements me
    {

        final lz afc;

        public void dJ()
        {
            lz.b(afc);
        }

        public IInterface gS()
        {
            return lZ();
        }

        public lx lZ()
        {
            return (lx)afc.gS();
        }

        private c()
        {
            afc = lz.this;
            super();
        }

    }

    private final class d extends com.google.android.gms.common.internal.e.b
    {

        private final int HF;
        private final String afb[];
        final lz afc;
        private final int afg;
        private final PendingIntent mPendingIntent;

        protected void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (afg)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(afg).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(HF, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(HF, afb);
        }

        protected void g(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected void gT()
        {
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int k, PendingIntent pendingintent)
        {
            boolean flag = true;
            afc = lz.this;
            super(lz.this, onremovegeofencesresultlistener);
            if (i != 1)
            {
                flag = false;
            }
            com.google.android.gms.common.internal.a.I(flag);
            afg = i;
            HF = LocationStatusCodes.ef(k);
            mPendingIntent = pendingintent;
            afb = null;
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int k, String as[])
        {
            afc = lz.this;
            super(lz.this, onremovegeofencesresultlistener);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.common.internal.a.I(flag);
            afg = i;
            HF = LocationStatusCodes.ef(k);
            afb = as;
            mPendingIntent = null;
        }
    }


    private final me Dh;
    private final ly aeW;
    private final mw aeX;
    private final lp aeY;
    private final ie aeZ;
    private final String afa;

    public lz(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, null);
    }

    public lz(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, s2, null);
    }

    public lz(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2, 
            String s3)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        Dh = new c();
        aeW = new ly(context, Dh);
        afa = s1;
        aeX = new mw(s, Dh, s2);
        aeY = lp.a(context, s2, s3, Dh);
        aeZ = ie.a(context, Dh);
    }

    public lz(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        Dh = new c();
        aeW = new ly(context, Dh);
        afa = s;
        aeX = new mw(context.getPackageName(), Dh, null);
        aeY = lp.a(context, null, null, Dh);
        aeZ = ie.a(context, Dh);
    }

    static void b(lz lz1)
    {
        lz1.dJ();
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", afa);
        l1.e(e1, 0x5e2978, getContext().getPackageName(), bundle);
    }

    public void a(ma ma, LocationListener locationlistener)
        throws RemoteException
    {
        a(ma, locationlistener, null);
    }

    public void a(ma ma, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (aeW)
        {
            aeW.a(ma, locationlistener, looper);
        }
        return;
        ma;
        ly1;
        JVM INSTR monitorexit ;
        throw ma;
    }

    protected lx aL(IBinder ibinder)
    {
        return lx.a.aK(ibinder);
    }

    public void addGeofences(List list, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        throws RemoteException
    {
        dJ();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "At least one geofence must be specified.");
        o.b(pendingintent, "PendingIntent must be specified.");
        o.b(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener == null)
        {
            onaddgeofencesresultlistener = null;
        } else
        {
            onaddgeofencesresultlistener = new b(onaddgeofencesresultlistener, this);
        }
        ((lx)gS()).a(list, pendingintent, onaddgeofencesresultlistener, getContext().getPackageName());
    }

    public void b(ma ma, PendingIntent pendingintent)
        throws RemoteException
    {
        aeW.b(ma, pendingintent);
    }

    public void disconnect()
    {
        synchronized (aeW)
        {
            if (isConnected())
            {
                aeW.removeAllListeners();
                aeW.lY();
            }
            super.disconnect();
        }
        return;
        exception;
        ly1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location getLastLocation()
    {
        return aeW.getLastLocation();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected IInterface j(IBinder ibinder)
    {
        return aL(ibinder);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        dJ();
        o.i(pendingintent);
        ((lx)gS()).removeActivityUpdates(pendingintent);
    }

    public void removeGeofences(PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        dJ();
        o.b(pendingintent, "PendingIntent must be specified.");
        o.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener == null)
        {
            onremovegeofencesresultlistener = null;
        } else
        {
            onremovegeofencesresultlistener = new b(onremovegeofencesresultlistener, this);
        }
        ((lx)gS()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
    }

    public void removeGeofences(List list, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        throws RemoteException
    {
        dJ();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "geofenceRequestIds can't be null nor empty.");
        o.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (onremovegeofencesresultlistener == null)
        {
            list = null;
        } else
        {
            list = new b(onremovegeofencesresultlistener, this);
        }
        ((lx)gS()).a(as, list, getContext().getPackageName());
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
        throws RemoteException
    {
        aeW.removeLocationUpdates(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
        throws RemoteException
    {
        aeW.removeLocationUpdates(locationlistener);
    }

    public void requestActivityUpdates(long l1, PendingIntent pendingintent)
        throws RemoteException
    {
        dJ();
        o.i(pendingintent);
        boolean flag;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "detectionIntervalMillis must be >= 0");
        ((lx)gS()).a(l1, true, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        aeW.requestLocationUpdates(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized (aeW)
        {
            aeW.requestLocationUpdates(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        ly1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void setMockLocation(Location location)
        throws RemoteException
    {
        aeW.setMockLocation(location);
    }

    public void setMockMode(boolean flag)
        throws RemoteException
    {
        aeW.setMockMode(flag);
    }
}
