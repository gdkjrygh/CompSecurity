// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.measurement.AppMeasurementService;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            c, ab, v, t, 
//            w

protected final class c
    implements ServiceConnection, com.google.android.gms.common.api.ernal.c.a, com.google.android.gms.common.api.l.c.a
{

    volatile boolean a;
    volatile v b;
    final c c;

    public final void a(int i)
    {
        u.b("MeasurementServiceConnection.onConnectionSuspended");
        c.k().a(new Runnable() {

            final c.a a;

            public final void run()
            {
                com.google.android.gms.measurement.internal.c.a(a.c, new ComponentName(a.c.i(), com/google/android/gms/measurement/AppMeasurementService));
            }

            
            {
                a = c.a.this;
                super();
            }
        });
    }

    public final void a(Bundle bundle)
    {
        u.b("MeasurementServiceConnection.onConnected");
        this;
        JVM INSTR monitorenter ;
        a = false;
        bundle = (t)b.m();
        b = null;
        c.k().a(new Runnable(bundle) {

            final t a;
            final c.a b;

            public final void run()
            {
                if (!b.c.b())
                {
                    b.c.l().f.a("Connected to remote service");
                    com.google.android.gms.measurement.internal.c.a(b.c, a);
                }
            }

            
            {
                b = c.a.this;
                a = t1;
                super();
            }
        });
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        b = null;
        if (true) goto _L2; else goto _L1
_L1:
        bundle;
        this;
        JVM INSTR monitorexit ;
        throw bundle;
        bundle;
          goto _L3
        bundle;
          goto _L3
    }

    public final void a(ConnectionResult connectionresult)
    {
        u.b("MeasurementServiceConnection.onConnectionFailed");
        this;
        JVM INSTR monitorenter ;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        connectionresult;
        this;
        JVM INSTR monitorexit ;
        throw connectionresult;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        u.b("MeasurementServiceConnection.onServiceConnected");
        this;
        JVM INSTR monitorenter ;
        a = false;
        if (ibinder != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c.l().a.a("Service connected with null binder");
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        componentname = obj1;
        String s = ibinder.getInterfaceDescriptor();
        componentname = obj1;
        if (!"com.google.android.gms.measurement.internal.IMeasurementService".equals(s)) goto _L2; else goto _L1
_L1:
        componentname = obj1;
        ibinder = a(ibinder);
        componentname = ibinder;
        c.l().g.a("Bound to IMeasurementService interface");
        componentname = ibinder;
_L4:
        if (componentname != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        try
        {
            com.google.android.gms.common.stats.b.a().a(c.i(), c.a);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname) { }
        this;
        JVM INSTR monitorexit ;
        return;
        componentname;
        this;
        JVM INSTR monitorexit ;
        throw componentname;
_L2:
        componentname = obj1;
        c.l().a.a("Got binder with a wrong descriptor", s);
        componentname = obj;
        continue; /* Loop/switch isn't completed */
        ibinder;
        c.l().a.a("Service connect failed to get IMeasurementService");
        if (true) goto _L4; else goto _L3
_L3:
        c.k().a(new Runnable(componentname) {

            final t a;
            final c.a b;

            public final void run()
            {
                if (!b.c.b())
                {
                    b.c.l().f.a("Connected to service");
                    com.google.android.gms.measurement.internal.c.a(b.c, a);
                }
            }

            
            {
                b = c.a.this;
                a = t1;
                super();
            }
        });
        break MISSING_BLOCK_LABEL_114;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        u.b("MeasurementServiceConnection.onServiceDisconnected");
        c.k().a(new Runnable(componentname) {

            final ComponentName a;
            final c.a b;

            public final void run()
            {
                com.google.android.gms.measurement.internal.c.a(b.c, a);
            }

            
            {
                b = c.a.this;
                a = componentname;
                super();
            }
        });
    }

    protected _cls4.a(c c1)
    {
        c = c1;
        super();
    }
}
