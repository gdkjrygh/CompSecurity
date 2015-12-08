// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.je;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            q, k, s, o, 
//            al, ag, c, ae, 
//            d

public final class v extends q
{
    protected final class a
        implements ServiceConnection
    {

        final v a;
        private volatile d b;
        private volatile boolean c;

        public final d a()
        {
            Object obj;
            Context context;
            s.r();
            obj = new Intent("com.google.android.gms.analytics.service.START");
            ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            context = a.m();
            ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
            b b1 = com.google.android.gms.common.stats.b.a();
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            b = null;
            c = true;
            flag = b1.a(context, ((Intent) (obj)), v.a(a), 129);
            a.a("Bind to service requested", Boolean.valueOf(flag));
            if (flag)
            {
                break MISSING_BLOCK_LABEL_110;
            }
            c = false;
            this;
            JVM INSTR monitorexit ;
            return null;
            wait(((Long)al.L.a()).longValue());
_L1:
            c = false;
            obj = b;
            b = null;
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_154;
            }
            a.g("Successfully bound to service but never got onServiceConnected callback");
            this;
            JVM INSTR monitorexit ;
            return ((d) (obj));
            Object obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            a.f("Wait for service connect was interrupted");
              goto _L1
        }

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            y.b("AnalyticsServiceConnection.onServiceConnected");
            this;
            JVM INSTR monitorenter ;
            if (ibinder != null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            a.g("Service connected with null binder");
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            Object obj1;
            obj1 = null;
            obj = null;
            componentname = obj1;
            String s1 = ibinder.getInterfaceDescriptor();
            componentname = obj1;
            if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(s1)) goto _L2; else goto _L1
_L1:
            componentname = obj1;
            ibinder = com.google.android.gms.analytics.internal.d.a.a(ibinder);
            componentname = ibinder;
            a.c("Bound to IAnalyticsService interface");
            componentname = ibinder;
_L4:
            {
                if (componentname != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                try
                {
                    com.google.android.gms.common.stats.b.a().a(a.m(), v.a(a));
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
                finally { }
            }
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            componentname;
            this;
            JVM INSTR monitorexit ;
            throw componentname;
_L2:
            componentname = obj1;
            a.e("Got binder with a wrong descriptor", s1);
            componentname = obj;
            continue; /* Loop/switch isn't completed */
            ibinder;
            a.g("Service connect failed to get IAnalyticsService");
            if (true) goto _L4; else goto _L3
            notifyAll();
            throw componentname;
_L3:
label0:
            {
                if (c)
                {
                    break label0;
                }
                a.f("onServiceConnected received after the timeout limit");
                a.p().a(new Runnable(this, componentname) {

                    final d a;
                    final a b;

                    public final void run()
                    {
                        if (!b.a.b())
                        {
                            b.a.d("Connected to service after a timeout");
                            v.a(b.a, a);
                        }
                    }

            
            {
                b = a1;
                a = d1;
                super();
            }
                });
            }
            break MISSING_BLOCK_LABEL_101;
            b = componentname;
            break MISSING_BLOCK_LABEL_101;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            y.b("AnalyticsServiceConnection.onServiceDisconnected");
            a.p().a(new Runnable(this, componentname) {

                final ComponentName a;
                final a b;

                public final void run()
                {
                    v.a(b.a, a);
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
            a = v.this;
            super();
        }
    }


    private final a a = new a();
    private d b;
    private final ag c;
    private k d;

    protected v(s s1)
    {
        super(s1);
        d = new k(s1.c());
        c = new ag(s1) {

            final v a;

            public final void a()
            {
                com.google.android.gms.analytics.internal.v.b(a);
            }

            
            {
                a = v.this;
                super(s1);
            }
        };
    }

    static a a(v v1)
    {
        return v1.a;
    }

    static void a(v v1, ComponentName componentname)
    {
        s.r();
        if (v1.b != null)
        {
            v1.b = null;
            v1.a("Disconnected from device AnalyticsService", componentname);
            v1.r().f();
        }
    }

    static void a(v v1, d d1)
    {
        s.r();
        v1.b = d1;
        v1.e();
        v1.r().g();
    }

    static void b(v v1)
    {
        s.r();
        if (v1.b())
        {
            v1.c("Inactivity, disconnecting from device AnalyticsService");
            v1.d();
        }
    }

    private void e()
    {
        d.a();
        c.a(((Long)al.K.a()).longValue());
    }

    protected final void a()
    {
    }

    public final boolean a(c c1)
    {
        y.a(c1);
        s.r();
        B();
        d d1 = b;
        if (d1 == null)
        {
            return false;
        }
        String s1;
        java.util.List list;
        if (c1.e())
        {
            s1 = ae.h();
        } else
        {
            s1 = ae.i();
        }
        list = Collections.emptyList();
        try
        {
            d1.a(c1.b(), c1.d(), s1, list);
            e();
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            c("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    public final boolean b()
    {
        s.r();
        B();
        return b != null;
    }

    public final boolean c()
    {
        s.r();
        B();
        if (b != null)
        {
            return true;
        }
        d d1 = a.a();
        if (d1 != null)
        {
            b = d1;
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public final void d()
    {
        s.r();
        B();
        try
        {
            com.google.android.gms.common.stats.b.a().a(m(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            r().f();
        }
    }
}
