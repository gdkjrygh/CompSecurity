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
//            de, ey, dj, dm, 
//            ex, fc, db

public class ez extends de
{
    private final class a extends de.b
    {

        private final int iC;
        private final String oW[];
        final ez oX;

        protected void a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
        {
            if (onaddgeofencesresultlistener != null)
            {
                onaddgeofencesresultlistener.onAddGeofencesResult(iC, oW);
            }
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener)obj);
        }

        protected void aF()
        {
        }

        public a(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, int i, String as[])
        {
            oX = ez.this;
            super(ez.this, onaddgeofencesresultlistener);
            iC = LocationStatusCodes.Z(i);
            oW = as;
        }
    }

    private static final class b extends ew.a
    {

        private com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener oY;
        private com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener oZ;
        private ez pa;

        public void onAddGeofencesResult(int i, String as[])
            throws RemoteException
        {
            if (pa == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                ez ez1 = pa;
                ez ez2 = pa;
                ez2.getClass();
                ez1.a(ez2. new a(oY, i, as));
                pa = null;
                oY = null;
                oZ = null;
                return;
            }
        }

        public void onRemoveGeofencesByPendingIntentResult(int i, PendingIntent pendingintent)
        {
            if (pa == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                ez ez1 = pa;
                ez ez2 = pa;
                ez2.getClass();
                ez1.a(ez2. new d(1, oZ, i, pendingintent));
                pa = null;
                oY = null;
                oZ = null;
                return;
            }
        }

        public void onRemoveGeofencesByRequestIdsResult(int i, String as[])
        {
            if (pa == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                ez ez1 = pa;
                ez ez2 = pa;
                ez2.getClass();
                ez1.a(ez2. new d(2, oZ, i, as));
                pa = null;
                oY = null;
                oZ = null;
                return;
            }
        }

        public b(com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener, ez ez1)
        {
            oY = onaddgeofencesresultlistener;
            oZ = null;
            pa = ez1;
        }

        public b(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, ez ez1)
        {
            oZ = onremovegeofencesresultlistener;
            oY = null;
            pa = ez1;
        }
    }

    private final class c
        implements fc
    {

        final ez oX;

        public void bc()
        {
            ez.a(oX);
        }

        public IInterface bd()
        {
            return cn();
        }

        public ex cn()
        {
            return (ex)ez.b(oX);
        }

        private c()
        {
            oX = ez.this;
            super();
        }

    }

    private final class d extends de.b
    {

        private final int iC;
        private final PendingIntent mPendingIntent;
        private final String oW[];
        final ez oX;
        private final int pb;

        protected void a(com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener)
        {
label0:
            {
label1:
                {
                    if (onremovegeofencesresultlistener != null)
                    {
                        switch (pb)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(pb).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    }
                    return;
                }
                onremovegeofencesresultlistener.onRemoveGeofencesByPendingIntentResult(iC, mPendingIntent);
                return;
            }
            onremovegeofencesresultlistener.onRemoveGeofencesByRequestIdsResult(iC, oW);
        }

        protected volatile void a(Object obj)
        {
            a((com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener)obj);
        }

        protected void aF()
        {
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            oX = ez.this;
            super(ez.this, onremovegeofencesresultlistener);
            if (i != 1)
            {
                flag = false;
            }
            db.k(flag);
            pb = i;
            iC = LocationStatusCodes.Z(j);
            mPendingIntent = pendingintent;
            oW = null;
        }

        public d(int i, com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener onremovegeofencesresultlistener, int j, String as[])
        {
            oX = ez.this;
            super(ez.this, onremovegeofencesresultlistener);
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            db.k(flag);
            pb = i;
            iC = LocationStatusCodes.Z(j);
            oW = as;
            mPendingIntent = null;
        }
    }


    private final fc oO = new c();
    private final ey oU;
    private final String oV;

    public ez(Context context, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        super(context, connectioncallbacks, onconnectionfailedlistener, new String[0]);
        oU = new ey(context, oO);
        oV = s;
    }

    static void a(ez ez1)
    {
        ez1.bc();
    }

    static IInterface b(ez ez1)
    {
        return ez1.bd();
    }

    protected ex G(IBinder ibinder)
    {
        return ex.a.F(ibinder);
    }

    protected void a(dj dj1, de.d d1)
        throws RemoteException
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", oV);
        dj1.e(d1, 0x3d8024, getContext().getPackageName(), bundle);
    }

    public void addGeofences(List list, PendingIntent pendingintent, com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener onaddgeofencesresultlistener)
    {
        bc();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "At least one geofence must be specified.");
        dm.a(pendingintent, "PendingIntent must be specified.");
        dm.a(onaddgeofencesresultlistener, "OnAddGeofencesResultListener not provided.");
        if (onaddgeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        onaddgeofencesresultlistener = null;
        try
        {
            ((ex)bd()).a(list, pendingintent, onaddgeofencesresultlistener, getContext().getPackageName());
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

    protected String ag()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String ah()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public void disconnect()
    {
        synchronized (oU)
        {
            if (isConnected())
            {
                oU.removeAllListeners();
                oU.cm();
            }
            super.disconnect();
        }
        return;
        exception;
        ey1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Location getLastLocation()
    {
        return oU.getLastLocation();
    }

    protected IInterface p(IBinder ibinder)
    {
        return G(ibinder);
    }

    public void removeActivityUpdates(PendingIntent pendingintent)
    {
        bc();
        dm.e(pendingintent);
        try
        {
            ((ex)bd()).removeActivityUpdates(pendingintent);
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
        bc();
        dm.a(pendingintent, "PendingIntent must be specified.");
        dm.a(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        if (onremovegeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        onremovegeofencesresultlistener = null;
_L1:
        try
        {
            ((ex)bd()).a(pendingintent, onremovegeofencesresultlistener, getContext().getPackageName());
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
        bc();
        String as[];
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "geofenceRequestIds can't be null nor empty.");
        dm.a(onremovegeofencesresultlistener, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if (onremovegeofencesresultlistener != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        list = null;
        try
        {
            ((ex)bd()).a(as, list, getContext().getPackageName());
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
        oU.removeLocationUpdates(pendingintent);
    }

    public void removeLocationUpdates(LocationListener locationlistener)
    {
        oU.removeLocationUpdates(locationlistener);
    }

    public void requestActivityUpdates(long l, PendingIntent pendingintent)
    {
        boolean flag = true;
        bc();
        dm.e(pendingintent);
        if (l < 0L)
        {
            flag = false;
        }
        dm.b(flag, "detectionIntervalMillis must be >= 0");
        try
        {
            ((ex)bd()).a(l, true, pendingintent);
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
        oU.requestLocationUpdates(locationrequest, pendingintent);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener)
    {
        requestLocationUpdates(locationrequest, locationlistener, null);
    }

    public void requestLocationUpdates(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        synchronized (oU)
        {
            oU.requestLocationUpdates(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        ey1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void setMockLocation(Location location)
    {
        oU.setMockLocation(location);
    }

    public void setMockMode(boolean flag)
    {
        oU.setMockMode(flag);
    }
}
