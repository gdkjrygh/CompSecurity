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
//            ff, hb, hr, fm, 
//            fq, ha, hf, fb

public class hc extends ff
{
    private final class a extends ff.b
    {

        private final int Ah;
        private final String Ot[];
        final hc Ou;

        protected void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(Ah, Ot);
            }
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected void dx()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int i, String as[])
        {
            Ou = hc.this;
            super(hc.this, onaddgeofencesresultlistener);
            Ah = LocationStatusCodes.bz(i);
            Ot = as;
        }
    }

    private static final class b extends gz.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener Ov;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener Ow;
        private hc Ox;

        public void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (Ox == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                hc hc1 = Ox;
                hc hc2 = Ox;
                hc2.getClass();
                hc1.a(hc2. new a(Ov, i, as));
                Ox = null;
                Ov = null;
                Ow = null;
                return;
            }
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (Ox == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                hc hc1 = Ox;
                hc hc2 = Ox;
                hc2.getClass();
                hc1.a(hc2. new d(1, Ow, i, pendingintent));
                Ox = null;
                Ov = null;
                Ow = null;
                return;
            }
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (Ox == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                hc hc1 = Ox;
                hc hc2 = Ox;
                hc2.getClass();
                hc1.a(hc2. new d(2, Ow, i, as));
                Ox = null;
                Ov = null;
                Ow = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, hc hc1)
        {
            Ov = onaddgeofencesresultlistener;
            Ow = null;
            Ox = hc1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, hc hc1)
        {
            Ow = onremovegeofencesresultlistener;
            Ov = null;
            Ox = hc1;
        }
    }

    private final class c
        implements hf
    {

        final hc Ou;

        public void bT()
        {
            hc.a(Ou);
        }

        public IInterface eM()
        {
            return hR();
        }

        public ha hR()
        {
            return (ha)hc.b(Ou);
        }

        private c()
        {
            Ou = hc.this;
            super();
        }

    }

    private final class d extends ff.b
    {

        private final int Ah;
        private final String Ot[];
        final hc Ou;
        private final int Oy;
        private final PendingIntent mPendingIntent;

        protected void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (Oy)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(Oy).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(Ah, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(Ah, Ot);
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected void dx()
        {
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            Ou = hc.this;
            super(hc.this, onremovegeofencesresultlistener);
            if (i != 1)
            {
                flag = false;
            }
            fb.x(flag);
            Oy = i;
            Ah = LocationStatusCodes.bz(j);
            mPendingIntent = pendingintent;
            Ot = null;
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, String as[])
        {
            Ou = hc.this;
            super(hc.this, onremovegeofencesresultlistener);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fb.x(flag);
            Oy = i;
            Ah = LocationStatusCodes.bz(j);
            Ot = as;
            mPendingIntent = null;
        }
    }


    private final hf Ok = new c();
    private final hb Oq;
    private final hr Or;
    private final String Os;
    private final Context mContext;
    private final String wG = null;

    public hc(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        mContext = context;
        Oq = new hb(context, Ok);
        Os = s;
        Or = new hr(getContext(), context.getPackageName(), Ok);
    }

    static void a(hc hc1)
    {
        hc1.bT();
    }

    static IInterface b(hc hc1)
    {
        return hc1.eM();
    }

    protected ha X(IBinder ibinder)
    {
        return ha.a.W(ibinder);
    }

    protected void a(fm fm1, ff.e e)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", Os);
        fm1.e(e, 0x43eea0, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List list, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
    {
        bT();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "At least one geofence must be specified.");
        fq.b(pendingintent, "PendingIntent must be specified.");
        fq.b(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        onaddgeofencesresultlistener = null;
        try
        {
            ((ha)eM()).a(list, pendingintent, onaddgeofencesresultlistener, getContext().getPackageName());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
        onaddgeofencesresultlistener = new b(onaddgeofencesresultlistener, this);
        break MISSING_BLOCK_LABEL_47;
    }

    protected String bg()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect()
    {
        synchronized (Oq)
        {
            if (isConnected())
            {
                Oq.removeAllListeners();
                Oq.hQ();
            }
            super.disconnect();
        }
        return;
        exception;
        hb1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location getLastLocation()
    {
        return Oq.getLastLocation();
    }

    protected IInterface r(IBinder ibinder)
    {
        return X(ibinder);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
    {
        bT();
        fq.f(pendingintent);
        try
        {
            ((ha)eM()).removeActivityUpdates(pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void removeGeofences(PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
    {
        bT();
        fq.b(pendingintent, "PendingIntent must be specified.");
        fq.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        onremovegeofencesresultlistener = null;
_L1:
        try
        {
            ((ha)eM()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
        onremovegeofencesresultlistener = new b(onremovegeofencesresultlistener, this);
          goto _L1
    }

    public void removeGeofences(List list, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
    {
        bT();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "geofenceRequestIds can't be null nor empty.");
        fq.b(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (onremovegeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        list = null;
        try
        {
            ((ha)eM()).a(as, list, getContext().getPackageName());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IllegalStateException(list);
        }
        list = new b(onremovegeofencesresultlistener, this);
        break MISSING_BLOCK_LABEL_54;
    }

    public void removeLocationUpdates(PendingIntent pendingintent)
    {
        Oq.removeLocationUpdates(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
    {
        Oq.removeLocationUpdates(locationlistener);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
    {
        boolean flag = true;
        bT();
        fq.f(pendingintent);
        if (l < 0L)
        {
            flag = false;
        }
        fq.b(flag, "detectionIntervalMillis must be >= 0");
        try
        {
            ((ha)eM()).a(l, true, pendingintent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PendingIntent pendingintent)
        {
            throw new IllegalStateException(pendingintent);
        }
    }

    public void requestLocationUpdates(LocationRequest locationrequest, PendingIntent pendingintent)
    {
        Oq.requestLocationUpdates(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener)
    {
        requestLocationUpdates(locationrequest, locationlistener, null);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        synchronized (Oq)
        {
            Oq.requestLocationUpdates(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        hb1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void setMockLocation(Location location)
    {
        Oq.setMockLocation(location);
    }

    public void setMockMode(boolean flag)
    {
        Oq.setMockMode(flag);
    }
}
