// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.c;
import com.google.android.gms.drive.events.d;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jt;
import com.google.android.gms.internal.jx;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.internal:
//            aa, ae, DisconnectRequest, AddEventListenerRequest, 
//            bg, RemoveEventListenerRequest, CancelPendingActionsRequest

public class r extends jl
{

    private final String DZ;
    private final String JK;
    private final Bundle PK;
    private final boolean PL;
    private DriveId PM;
    private DriveId PN;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks PO;
    final Map PP = new HashMap();

    public r(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], Bundle bundle)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        DZ = (String)jx.b(jg1.hm(), "Must call Api.ClientBuilder.setAccountName()");
        JK = jg1.hq();
        PO = connectioncallbacks;
        PK = bundle;
        looper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        looper.setPackage(context.getPackageName());
        context = context.getPackageManager().queryIntentServices(looper, 0);
        switch (context.size())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("AndroidManifest.xml can only define one service that handles the ").append(looper.getAction()).append(" action").toString());

        case 0: // '\0'
            PL = false;
            return;

        case 1: // '\001'
            context = ((ResolveInfo)context.get(0)).serviceInfo;
            break;
        }
        if (!((ServiceInfo) (context)).exported)
        {
            throw new IllegalStateException((new StringBuilder()).append("Drive event service ").append(((ServiceInfo) (context)).name).append(" must be exported in AndroidManifest.xml").toString());
        } else
        {
            PL = true;
            return;
        }
    }

    protected ae W(IBinder ibinder)
    {
        return ae.a.X(ibinder);
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i)
    {
        jx.b(d.a(i, driveid), "id");
        jx.a(isConnected(), "Client must be connected");
        if (!PL)
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        } else
        {
            return googleapiclient.b(new q.a(googleapiclient, driveid, i) {

                final DriveId PQ;
                final int PR;
                final r PT;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new AddEventListenerRequest(PQ, PR), null, null, new bg(this));
                }

            
            {
                PT = r.this;
                PQ = driveid;
                PR = i;
                super(googleapiclient);
            }
            });
        }
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i, c c)
    {
        jx.b(d.a(i, driveid), "id");
        jx.b(c, "listener");
        jx.a(isConnected(), "Client must be connected");
        Map map = PP;
        map;
        JVM INSTR monitorenter ;
        Object obj = (Map)PP.get(driveid);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = new HashMap();
        PP.put(driveid, obj);
        aa aa1 = (aa)((Map) (obj)).get(c);
        if (aa1 != null) goto _L2; else goto _L1
_L1:
        aa1 = new aa(getLooper(), getContext(), i, c);
        ((Map) (obj)).put(c, aa1);
        c = aa1;
_L4:
        c.bw(i);
        googleapiclient = googleapiclient.b(new q.a(googleapiclient, driveid, i, c) {

            final DriveId PQ;
            final int PR;
            final aa PS;
            final r PT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new AddEventListenerRequest(PQ, PR), PS, null, new bg(this));
            }

            
            {
                PT = r.this;
                PQ = driveid;
                PR = i;
                PS = aa1;
                super(googleapiclient);
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
_L2:
        if (!aa1.bx(i))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        googleapiclient = new p.j(googleapiclient, Status.Kw);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        c = aa1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            PM = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            PN = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(jt jt1, com.google.android.gms.internal.jl.e e)
        throws RemoteException
    {
        String s = getContext().getPackageName();
        jx.i(e);
        jx.i(s);
        jx.i(hv());
        Bundle bundle = new Bundle();
        if (!s.equals(JK))
        {
            bundle.putString("proxy_package_name", JK);
        }
        bundle.putAll(PK);
        jt1.a(e, 0x648278, s, hv(), DZ, bundle);
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i)
    {
        jx.b(d.a(i, driveid), "id");
        jx.a(isConnected(), "Client must be connected");
        return googleapiclient.b(new q.a(googleapiclient, driveid, i) {

            final DriveId PQ;
            final int PR;
            final r PT;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new RemoveEventListenerRequest(PQ, PR), null, null, new bg(this));
            }

            
            {
                PT = r.this;
                PQ = driveid;
                PR = i;
                super(googleapiclient);
            }
        });
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i, c c)
    {
        jx.b(d.a(i, driveid), "id");
        jx.a(isConnected(), "Client must be connected");
        jx.b(c, "listener");
        Map map = PP;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)PP.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        googleapiclient = new p.j(googleapiclient, Status.Kw);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        c = (aa)map1.remove(c);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        googleapiclient = new p.j(googleapiclient, Status.Kw);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            PP.remove(driveid);
        }
        googleapiclient = googleapiclient.b(new q.a(googleapiclient, driveid, i, c) {

            final DriveId PQ;
            final int PR;
            final r PT;
            final aa PU;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new RemoveEventListenerRequest(PQ, PR), PU, null, new bg(this));
            }

            
            {
                PT = r.this;
                PQ = driveid;
                PR = i;
                PU = aa1;
                super(googleapiclient);
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    protected String bK()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    protected String bL()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        boolean flag1 = true;
        boolean flag;
        if (list != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.L(flag);
        if (!list.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.L(flag);
        jx.a(isConnected(), "Client must be connected");
        return googleapiclient.b(new q.a(googleapiclient, list) {

            final r PT;
            final List PV;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new CancelPendingActionsRequest(PV), new bg(this));
            }

            
            {
                PT = r.this;
                PV = list;
                super(googleapiclient);
            }
        });
    }

    public void disconnect()
    {
        if (isConnected())
        {
            try
            {
                ((ae)hw()).a(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        PP.clear();
    }

    public ae iG()
        throws DeadObjectException
    {
        return (ae)hw();
    }

    public DriveId iH()
    {
        return PM;
    }

    public DriveId iI()
    {
        return PN;
    }

    public boolean iJ()
    {
        return PL;
    }

    protected IInterface l(IBinder ibinder)
    {
        return W(ibinder);
    }
}
