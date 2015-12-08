// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.c;
import com.google.android.gms.internal.fc;
import com.google.android.gms.internal.ff;
import com.google.android.gms.internal.fm;
import com.google.android.gms.internal.fq;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.internal:
//            s, u, DisconnectRequest, AddEventListenerRequest, 
//            al, RemoveEventListenerRequest

public class n extends ff
{

    private DriveId Fh;
    private DriveId Fi;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks Fj;
    Map Fk;
    private final String wG;

    public n(Context context, Looper looper, fc fc1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Fk = new HashMap();
        wG = (String)fq.b(fc1.eC(), "Must call Api.ClientBuilder.setAccountName()");
        Fj = connectioncallbacks;
    }

    protected u F(IBinder ibinder)
    {
        return u.a.G(ibinder);
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        fq.b(c.a(i, driveid), "id");
        fq.b(listener, "listener");
        fq.a(isConnected(), "Client must be connected");
        Map map1 = Fk;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)Fk.get(driveid);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new HashMap();
        Fk.put(driveid, obj);
        if (!((Map) (obj)).containsKey(listener))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        googleapiclient = new l.k(googleapiclient, Status.Bv);
        map1;
        JVM INSTR monitorexit ;
        return googleapiclient;
        s s1 = new s(getLooper(), i, listener);
        ((Map) (obj)).put(listener, s1);
        googleapiclient = googleapiclient.b(new l.j(driveid, i, s1) {

            final DriveId Fl;
            final int Fm;
            final s Fn;
            final n Fo;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new AddEventListenerRequest(Fl, Fm, null), Fn, null, new al(this));
            }

            
            {
                Fo = n.this;
                Fl = driveid;
                Fm = i;
                Fn = s1;
                super();
            }
        });
        map1;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map1;
        JVM INSTR monitorexit ;
        throw googleapiclient;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Fh = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            Fi = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(fm fm1, com.google.android.gms.internal.ff.e e)
        throws RemoteException
    {
        String s1 = getContext().getPackageName();
        fq.f(e);
        fq.f(s1);
        fq.f(eL());
        fm1.a(e, 0x43eea0, s1, eL(), wG, new Bundle());
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        fq.b(c.a(i, driveid), "id");
        fq.b(listener, "listener");
        fq.a(isConnected(), "Client must be connected");
        Map map = Fk;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)Fk.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        googleapiclient = new l.k(googleapiclient, Status.Bv);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        listener = (s)map1.remove(listener);
        if (listener != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        googleapiclient = new l.k(googleapiclient, Status.Bv);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            Fk.remove(driveid);
        }
        googleapiclient = googleapiclient.b(new l.j(driveid, i, listener) {

            final DriveId Fl;
            final int Fm;
            final s Fn;
            final n Fo;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new RemoveEventListenerRequest(Fl, Fm), Fn, null, new al(this));
            }

            
            {
                Fo = n.this;
                Fl = driveid;
                Fm = i;
                Fn = s1;
                super();
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected String bg()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String bh()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public void disconnect()
    {
        u u1 = (u)eM();
        if (u1 != null)
        {
            try
            {
                u1.a(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        Fk.clear();
    }

    public u fE()
    {
        return (u)eM();
    }

    public DriveId fF()
    {
        return Fh;
    }

    public DriveId fG()
    {
        return Fi;
    }

    protected IInterface r(IBinder ibinder)
    {
        return F(ibinder);
    }
}
