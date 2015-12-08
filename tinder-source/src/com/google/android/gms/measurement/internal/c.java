// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.ef;
import com.google.android.gms.measurement.AppMeasurementService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, d, ac, w, 
//            ab, l, j, z, 
//            v, ad, t, u, 
//            h, AppMetadata

public final class c extends af
{
    protected final class a
        implements ServiceConnection, com.google.android.gms.common.api.b, com.google.android.gms.common.api.c
    {

        volatile boolean a;
        volatile v b;
        final c c;

        public final void a(int i1)
        {
            u.b("MeasurementServiceConnection.onConnectionSuspended");
            c.k().a(new Runnable(this) {

                final a a;

                public final void run()
                {
                    c.a(a.c, new ComponentName(a.c.i(), com/google/android/gms/measurement/AppMeasurementService));
                }

            
            {
                a = a1;
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
            c.k().a(new Runnable(this, bundle) {

                final t a;
                final a b;

                public final void run()
                {
                    if (!b.c.b())
                    {
                        b.c.l().f.a("Connected to remote service");
                        c.a(b.c, a);
                    }
                }

            
            {
                b = a1;
                a = t;
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
            ibinder = t.a.a(ibinder);
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
            c.k().a(new Runnable(this, componentname) {

                final t a;
                final a b;

                public final void run()
                {
                    if (!b.c.b())
                    {
                        b.c.l().f.a("Connected to service");
                        c.a(b.c, a);
                    }
                }

            
            {
                b = a1;
                a = t;
                super();
            }
            });
            break MISSING_BLOCK_LABEL_114;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            u.b("MeasurementServiceConnection.onServiceDisconnected");
            c.k().a(new Runnable(this, componentname) {

                final ComponentName a;
                final a b;

                public final void run()
                {
                    c.a(b.c, a);
                }

            
            {
                b = a1;
                a = componentname;
                super();
            }
            });
        }

        protected a()
        {
            c = c.this;
            super();
        }
    }


    final a a = new a();
    t b;
    private Boolean c;
    private final l d;
    private final d e;
    private final List f = new ArrayList();
    private final l g;

    protected c(ac ac1)
    {
        super(ac1);
        e = new d(ac1.d);
        d = new l(ac1) {

            final c a;

            public final void a()
            {
                c.a(a);
            }

            
            {
                a = c.this;
                super(ac1);
            }
        };
        g = new l(ac1) {

            final c a;

            public final void a()
            {
                a.l().b.a("Tasks have been queued for a long time");
            }

            
            {
                a = c.this;
                super(ac1);
            }
        };
    }

    static void a(c c1)
    {
        c1.af.e();
        if (c1.b())
        {
            c1.af.l().g.a("Inactivity, disconnecting from AppMeasurementService");
            c1.af.e();
            c1.t();
            try
            {
                com.google.android.gms.common.stats.b.a().a(c1.af.i(), c1.a);
            }
            catch (IllegalStateException illegalstateexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            if (c1.b != null)
            {
                c1.b = null;
            }
        }
    }

    static void a(c c1, ComponentName componentname)
    {
        c1.af.e();
        if (c1.b != null)
        {
            c1.b = null;
            c1.af.l().g.a("Disconnected from device MeasurementService", componentname);
            c1.af.e();
            c1.q();
        }
    }

    static void a(c c1, t t)
    {
        c1.a(t);
    }

    private void a(t t)
    {
        super.e();
        u.a(t);
        b = t;
        p();
        super.e();
        super.l().g.a("Flushing task queue", Integer.valueOf(f.size()));
        Runnable runnable;
        for (t = f.iterator(); t.hasNext(); super.k().a(runnable))
        {
            runnable = (Runnable)t.next();
        }

        f.clear();
        g.b();
    }

    static void b(c c1)
    {
        c1.p();
    }

    private void p()
    {
        super.e();
        e.a();
        d.a(com.google.android.gms.measurement.internal.j.v());
    }

    private void q()
    {
        Object obj;
        Object obj1;
        boolean flag;
        flag = true;
        super.e();
        t();
        if (b())
        {
            return;
        }
        if (c == null)
        {
            c = super.m().r();
            if (c == null)
            {
                super.l().g.a("State of service unknown");
                super.e();
                t();
                boolean flag1;
                if (com.google.android.gms.measurement.internal.j.z())
                {
                    flag1 = true;
                } else
                {
                    obj = new Intent("com.google.android.gms.measurement.START");
                    ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.measurement.service.MeasurementBrokerService"));
                    obj1 = com.google.android.gms.common.stats.b.a();
                    super.l().g.a("Checking service availability");
                    if (((b) (obj1)).a(super.i(), ((Intent) (obj)), new ServiceConnection() {

        final c a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
        }

            
            {
                a = c.this;
                super();
            }
    }, 0))
                    {
                        super.l().g.a("Service available");
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
                c = Boolean.valueOf(flag1);
                obj = super.m();
                flag1 = c.booleanValue();
                ((z) (obj)).e();
                ((z) (obj)).l().g.a("Setting useService", Boolean.valueOf(flag1));
                obj = ((z) (obj)).q().edit();
                ((android.content.SharedPreferences.Editor) (obj)).putBoolean("use_service", flag1);
                ((android.content.SharedPreferences.Editor) (obj)).apply();
            }
        }
        if (!c.booleanValue())
        {
            break MISSING_BLOCK_LABEL_394;
        }
        super.l().g.a("Using measurement service");
        obj = a;
        ((a) (obj)).c.af.e();
        obj1 = ((a) (obj)).c.af.i();
        obj;
        JVM INSTR monitorenter ;
        if (!((a) (obj)).a)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        ((a) (obj)).c.af.l().g.a("Connection attempt already in progress");
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (((a) (obj)).b == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        ((a) (obj)).c.af.l().g.a("Already awaiting connection attempt");
        obj;
        JVM INSTR monitorexit ;
        return;
        obj.b = new v(((Context) (obj1)), Looper.getMainLooper(), (new com.google.android.gms.common.api.a(((Context) (obj1)))).a(), ((com.google.android.gms.common.api.b) (obj)), ((com.google.android.gms.common.api.c) (obj)));
        ((a) (obj)).c.af.l().g.a("Connecting to remote service");
        obj.a = true;
        ((a) (obj)).b.i();
        obj;
        JVM INSTR monitorexit ;
        return;
        Context context;
        b b1;
        obj = super.i().getPackageManager().queryIntentServices(new Intent(super.i(), com/google/android/gms/measurement/AppMeasurementService), 0x10000);
        if (obj == null || ((List) (obj)).size() <= 0)
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_571;
        }
        super.l().g.a("Using local app measurement service");
        obj1 = new Intent("com.google.android.gms.measurement.START");
        ((Intent) (obj1)).setComponent(new ComponentName(super.i(), com/google/android/gms/measurement/AppMeasurementService));
        obj = a;
        ((a) (obj)).c.af.e();
        context = ((a) (obj)).c.af.i();
        b1 = com.google.android.gms.common.stats.b.a();
        obj;
        JVM INSTR monitorenter ;
        if (!((a) (obj)).a)
        {
            break MISSING_BLOCK_LABEL_545;
        }
        ((a) (obj)).c.af.l().g.a("Connection attempt already in progress");
        obj;
        JVM INSTR monitorexit ;
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj.a = true;
        b1.a(context, ((Intent) (obj1)), ((a) (obj)).c.a, 129);
        obj;
        JVM INSTR monitorexit ;
        return;
        if (super.n().A())
        {
            super.l().g.a("Using direct local measurement implementation");
            a(new ad(h, (byte)0));
            return;
        } else
        {
            super.l().a.a("Not in main process. Unable to use local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
    }

    protected final void a()
    {
    }

    public final boolean b()
    {
        super.e();
        t();
        return b != null;
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile com.google.android.gms.measurement.internal.u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }

    protected final void o()
    {
        super.e();
        t();
        Runnable runnable = new Runnable() {

            final c a;

            public final void run()
            {
                t t1 = a.b;
                if (t1 == null)
                {
                    a.l().a.a("Discarding data. Failed to send app launch");
                    return;
                }
                try
                {
                    com.google.android.gms.measurement.internal.u u1 = a.f();
                    t1.a(new AppMetadata(u1.a, u1.b(), u1.b, u1.c, com.google.android.gms.measurement.internal.j.y(), u1.o()));
                    com.google.android.gms.measurement.internal.c.b(a);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    a.l().a.a("Failed to send app launch to AppMeasurementService", remoteexception);
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
        super.e();
        if (b())
        {
            runnable.run();
            return;
        }
        if ((long)f.size() >= com.google.android.gms.measurement.internal.j.D())
        {
            super.l().a.a("Discarding data. Max runnable queue size reached");
            return;
        } else
        {
            f.add(runnable);
            g.a(60000L);
            q();
            return;
        }
    }
}
