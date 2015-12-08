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
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.c;
import com.google.android.gms.drive.events.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y, ab, DisconnectRequest, AddEventListenerRequest, 
//            bb, RemoveEventListenerRequest

public class q extends e
{

    private final String Dd;
    private final String IM;
    private final Bundle OA;
    private final boolean OB;
    private DriveId OC;
    private DriveId OD;
    final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks OE;
    final Map OF = new HashMap();

    public q(Context context, Looper looper, ClientSettings clientsettings, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[], Bundle bundle)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, as);
        Dd = (String)o.b(clientsettings.getAccountNameOrDefault(), "Must call Api.ClientBuilder.setAccountName()");
        IM = clientsettings.getRealClientPackageName();
        OE = connectioncallbacks;
        OA = bundle;
        looper = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        looper.setPackage(context.getPackageName());
        context = context.getPackageManager().queryIntentServices(looper, 0);
        switch (context.size())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("AndroidManifest.xml can only define one service that handles the ").append(looper.getAction()).append(" action").toString());

        case 0: // '\0'
            OB = false;
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
            OB = true;
            return;
        }
    }

    protected ab T(IBinder ibinder)
    {
        return ab.a.U(ibinder);
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i)
    {
        o.b(d.a(i, driveid), "id");
        o.i("eventService");
        o.a(isConnected(), "Client must be connected");
        if (!OB)
        {
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to add event subscriptions");
        } else
        {
            return googleapiclient.b(new p.a(driveid, i) {

                final DriveId OG;
                final int OH;
                final q OJ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new AddEventListenerRequest(OG, OH), null, null, new bb(this));
                }

            
            {
                OJ = q.this;
                OG = driveid;
                OH = i;
                super();
            }
            });
        }
    }

    PendingResult a(GoogleApiClient googleapiclient, DriveId driveid, int i, c c)
    {
        o.b(d.a(i, driveid), "id");
        o.b(c, "listener");
        o.a(isConnected(), "Client must be connected");
        Map map = OF;
        map;
        JVM INSTR monitorenter ;
        Object obj = (Map)OF.get(driveid);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj = new HashMap();
        OF.put(driveid, obj);
        y y1 = (y)((Map) (obj)).get(c);
        if (y1 != null) goto _L2; else goto _L1
_L1:
        y1 = new y(getLooper(), getContext(), i, c);
        ((Map) (obj)).put(c, y1);
        c = y1;
_L4:
        c.bq(i);
        googleapiclient = googleapiclient.b(new p.a(driveid, i, c) {

            final DriveId OG;
            final int OH;
            final y OI;
            final q OJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new AddEventListenerRequest(OG, OH), OI, null, new bb(this));
            }

            
            {
                OJ = q.this;
                OG = driveid;
                OH = i;
                OI = y1;
                super();
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
_L2:
        c = y1;
        if (!y1.br(i)) goto _L4; else goto _L3
_L3:
        googleapiclient = new o.m(googleapiclient, Status.Jv);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            OC = (DriveId)bundle.getParcelable("com.google.android.gms.drive.root_id");
            OD = (DriveId)bundle.getParcelable("com.google.android.gms.drive.appdata_id");
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(l l1, com.google.android.gms.common.internal.e.e e1)
        throws RemoteException
    {
        String s = getContext().getPackageName();
        o.i(e1);
        o.i(s);
        o.i(gR());
        Bundle bundle = new Bundle();
        if (!s.equals(IM))
        {
            bundle.putString("proxy_package_name", IM);
        }
        bundle.putAll(OA);
        l1.a(e1, 0x5e2978, s, gR(), Dd, bundle);
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i)
    {
        o.b(d.a(i, driveid), "id");
        o.i("eventService");
        o.a(isConnected(), "Client must be connected");
        return googleapiclient.b(new p.a(driveid, i) {

            final DriveId OG;
            final int OH;
            final q OJ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new RemoveEventListenerRequest(OG, OH), null, null, new bb(this));
            }

            
            {
                OJ = q.this;
                OG = driveid;
                OH = i;
                super();
            }
        });
    }

    PendingResult b(GoogleApiClient googleapiclient, DriveId driveid, int i, c c)
    {
        o.b(d.a(i, driveid), "id");
        o.a(isConnected(), "Client must be connected");
        o.b(c, "listener");
        Map map = OF;
        map;
        JVM INSTR monitorenter ;
        Map map1 = (Map)OF.get(driveid);
        if (map1 != null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        googleapiclient = new o.m(googleapiclient, Status.Jv);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        c = (y)map1.remove(c);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        googleapiclient = new o.m(googleapiclient, Status.Jv);
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
        googleapiclient;
        map;
        JVM INSTR monitorexit ;
        throw googleapiclient;
        if (map1.isEmpty())
        {
            OF.remove(driveid);
        }
        googleapiclient = googleapiclient.b(new p.a(driveid, i, c) {

            final DriveId OG;
            final int OH;
            final q OJ;
            final y OK;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new RemoveEventListenerRequest(OG, OH), OK, null, new bb(this));
            }

            
            {
                OJ = q.this;
                OG = driveid;
                OH = i;
                OK = y1;
                super();
            }
        });
        map;
        JVM INSTR monitorexit ;
        return googleapiclient;
    }

    public void disconnect()
    {
        ab ab1 = (ab)gS();
        if (ab1 != null)
        {
            try
            {
                ab1.a(new DisconnectRequest());
            }
            catch (RemoteException remoteexception) { }
        }
        super.disconnect();
        OF.clear();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.drive.internal.IDriveService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.drive.ApiService.START";
    }

    public ab hY()
    {
        return (ab)gS();
    }

    public DriveId hZ()
    {
        return OC;
    }

    public DriveId ia()
    {
        return OD;
    }

    public boolean ib()
    {
        return OB;
    }

    protected IInterface j(IBinder ibinder)
    {
        return T(ibinder);
    }
}
