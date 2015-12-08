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
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hb;
import com.google.android.gms.internal.hi;
import com.google.android.gms.internal.hm;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.internal:
//            x, aa, DisconnectRequest, AddEventListenerRequest, 
//            aw, RemoveEventListenerRequest

public class r extends hb
{

    private final String IQ;
    private final Bundle IR;
    private DriveId IS;
    private DriveId IT;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks IU;
    Map IV;
    private final String yQ;

    public r(Context context, Looper looper, gy gy1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], Bundle bundle)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        IV = new HashMap();
        yQ = (String)hm.b(gy1.fj(), "Must call Api.ClientBuilder.setAccountName()");
        IQ = gy1.fn();
        IU = connectioncallbacks;
        IR = bundle;
    }

    protected aa O(IBinder ibinder)
    {
        return aa.a.P(ibinder);
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        hm.b(com.google.android.gms.drive.events.b.a(i, driveid), "id");
        hm.b(listener, "listener");
        hm.a(isConnected(), "Client must be connected");
        Map map1 = IV;
        map1;
        JVM INSTR monitorenter ;
        Map map = (Map)IV.get(driveid);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = new HashMap();
        IV.put(driveid, obj);
        if (!((Map) (obj)).containsKey(listener))
        {
            break MISSING_BLOCK_LABEL_111;
        }
        googleapiclient = new p.k(googleapiclient, Status.En);
        map1;
        JVM INSTR monitorexit ;
        return googleapiclient;
        x x1 = new x(getLooper(), i, listener);
        ((Map) (obj)).put(listener, x1);
        googleapiclient = googleapiclient.b(new p.j(driveid, i, x1) {

            final DriveId IW;
            final int IX;
            final x IY;
            final r IZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gp().a(new AddEventListenerRequest(IW, IX, null), IY, null, new aw(this));
            }

            
            {
                IZ = r.this;
                IW = driveid;
                IX = i;
                IY = x1;
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
            IS = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            IT = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(hi hi1, com.google.android.gms.internal.hb.e e)
        throws RemoteException
    {
        String s = getContext().getPackageName();
        hm.f(e);
        hm.f(s);
        hm.f(fs());
        Bundle bundle = new Bundle();
        bundle.putString("proxy_package_name", IQ);
        bundle.putAll(IR);
        hi1.a(e, 0x4da6e8, s, fs(), yQ, bundle);
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        hm.b(com.google.android.gms.drive.events.b.a(i, driveid), "id");
        hm.a(isConnected(), "Client must be connected");
        hm.b(listener, "listener");
        Map map = IV;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)IV.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        googleapiclient = new p.k(googleapiclient, Status.En);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        listener = (x)map1.remove(listener);
        if (listener != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        googleapiclient = new p.k(googleapiclient, Status.En);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            IV.remove(driveid);
        }
        googleapiclient = googleapiclient.b(new p.j(driveid, i, listener) {

            final DriveId IW;
            final int IX;
            final x IY;
            final r IZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gp().a(new RemoveEventListenerRequest(IW, IX), IY, null, new aw(this));
            }

            
            {
                IZ = r.this;
                IW = driveid;
                IX = i;
                IY = x1;
                super();
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected String bu()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String bv()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    public void disconnect()
    {
        aa aa1 = (aa)ft();
        if (aa1 != null)
        {
            try
            {
                aa1.a(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        IV.clear();
    }

    public aa gp()
    {
        return (aa)ft();
    }

    public DriveId gq()
    {
        return IS;
    }

    public DriveId gr()
    {
        return IT;
    }

    protected IInterface x(IBinder ibinder)
    {
        return O(ibinder);
    }
}
