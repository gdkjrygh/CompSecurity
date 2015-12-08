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
import com.google.android.gms.drive.events.b;
import com.google.android.gms.internal.gz;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hj;
import com.google.android.gms.internal.hn;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.internal:
//            x, aa, DisconnectRequest, AddEventListenerRequest, 
//            aw, RemoveEventListenerRequest

public class r extends hc
{

    private final String IN;
    private final Bundle IO;
    private DriveId IP;
    private DriveId IQ;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks IR;
    Map IS;
    private final String yN;

    public r(Context context, Looper looper, gz gz1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], Bundle bundle)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        IS = new HashMap();
        yN = (String)hn.b(gz1.fe(), "Must call Api.ClientBuilder.setAccountName()");
        IN = gz1.fi();
        IR = connectioncallbacks;
        IO = bundle;
    }

    protected aa O(IBinder ibinder)
    {
        return aa.a.P(ibinder);
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        hn.b(com.google.android.gms.drive.events.b.a(i, driveid), "id");
        hn.b(listener, "listener");
        hn.a(isConnected(), "Client must be connected");
        Map map1 = IS;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)IS.get(driveid);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new HashMap();
        IS.put(driveid, obj);
        if (!((Map) (obj)).containsKey(listener))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        googleapiclient = new p.k(googleapiclient, Status.Ek);
        map1;
        JVM INSTR monitorexit ;
        return googleapiclient;
        x x1 = new x(getLooper(), i, listener);
        ((Map) (obj)).put(listener, x1);
        googleapiclient = googleapiclient.b(new p.j(driveid, i, x1) {

            final DriveId IT;
            final int IU;
            final x IV;
            final r IW;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gk().a(new AddEventListenerRequest(IT, IU, null), IV, null, new aw(this));
            }

            
            {
                IW = r.this;
                IT = driveid;
                IU = i;
                IV = x1;
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
            IP = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            IQ = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(hj hj1, com.google.android.gms.internal.hc.e e)
        throws RemoteException
    {
        String s = getContext().getPackageName();
        hn.f(e);
        hn.f(s);
        hn.f(fn());
        Bundle bundle = new Bundle();
        bundle.putString("proxy_package_name", IN);
        bundle.putAll(IO);
        hj1.a(e, 0x4d7808, s, fn(), yN, bundle);
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        hn.b(com.google.android.gms.drive.events.b.a(i, driveid), "id");
        hn.a(isConnected(), "Client must be connected");
        hn.b(listener, "listener");
        Map map = IS;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)IS.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        googleapiclient = new p.k(googleapiclient, Status.Ek);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        listener = (x)map1.remove(listener);
        if (listener != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        googleapiclient = new p.k(googleapiclient, Status.Ek);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            IS.remove(driveid);
        }
        googleapiclient = googleapiclient.b(new p.j(driveid, i, listener) {

            final DriveId IT;
            final int IU;
            final x IV;
            final r IW;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gk().a(new RemoveEventListenerRequest(IT, IU), IV, null, new aw(this));
            }

            
            {
                IW = r.this;
                IT = driveid;
                IU = i;
                IV = x1;
                super();
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected String bp()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String bq()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public void disconnect()
    {
        aa aa1 = (aa)fo();
        if (aa1 != null)
        {
            try
            {
                aa1.a(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        IS.clear();
    }

    public aa gk()
    {
        return (aa)fo();
    }

    public DriveId gl()
    {
        return IP;
    }

    public DriveId gm()
    {
        return IQ;
    }

    protected IInterface x(IBinder ibinder)
    {
        return O(ibinder);
    }
}
