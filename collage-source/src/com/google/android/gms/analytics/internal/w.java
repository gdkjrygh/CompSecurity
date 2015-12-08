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
import com.google.android.gms.common.internal.z;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.zzof;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, k, t, p, 
//            af, ah, c, d

public class w extends r
{
    protected class a
        implements ServiceConnection
    {

        final w a;
        private volatile d b;
        private volatile boolean c;

        public d a()
        {
            Object obj;
            Context context;
            a.m();
            obj = new Intent("com.google.android.gms.analytics.service.START");
            ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            context = a.o();
            ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
            b b1 = com.google.android.gms.common.stats.b.a();
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            b = null;
            c = true;
            flag = b1.a(context, ((Intent) (obj)), w.a(a), 129);
            a.a("Bind to service requested", Boolean.valueOf(flag));
            if (flag)
            {
                break MISSING_BLOCK_LABEL_114;
            }
            c = false;
            this;
            JVM INSTR monitorexit ;
            return null;
            wait(a.q().w());
_L1:
            c = false;
            obj = b;
            b = null;
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_156;
            }
            a.f("Successfully bound to service but never got onServiceConnected callback");
            this;
            JVM INSTR monitorexit ;
            return ((d) (obj));
            Object obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            a.e("Wait for service connect was interrupted");
              goto _L1
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            z.b("AnalyticsServiceConnection.onServiceConnected");
            this;
            JVM INSTR monitorenter ;
            if (ibinder != null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            a.f("Service connected with null binder");
            notifyAll();
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
            if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(s)) goto _L2; else goto _L1
_L1:
            componentname = obj1;
            ibinder = com.google.android.gms.analytics.internal.d.a.a(ibinder);
            componentname = ibinder;
            a.b("Bound to IAnalyticsService interface");
            componentname = ibinder;
_L4:
            {
                if (componentname != null)
                {
                    break; /* Loop/switch isn't completed */
                }
                try
                {
                    com.google.android.gms.common.stats.b.a().a(a.o(), w.a(a));
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
            a.e("Got binder with a wrong descriptor", s);
            componentname = obj;
            continue; /* Loop/switch isn't completed */
            ibinder;
            a.f("Service connect failed to get IAnalyticsService");
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
                a.e("onServiceConnected received after the timeout limit");
                a.r().a(new zzi.zza._cls1(this, componentname));
            }
            break MISSING_BLOCK_LABEL_101;
            b = componentname;
            break MISSING_BLOCK_LABEL_101;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            z.b("AnalyticsServiceConnection.onServiceDisconnected");
            a.r().a(new zzi.zza._cls2(this, componentname));
        }

        protected a()
        {
            a = w.this;
            super();
        }
    }


    private final a a = new a();
    private d b;
    private final ah c;
    private k d;

    protected w(t t1)
    {
        super(t1);
        d = new k(t1.d());
        c = new ah(t1) {

            final w a;

            public void a()
            {
                com.google.android.gms.analytics.internal.w.b(a);
            }

            
            {
                a = w.this;
                super(t1);
            }
        };
    }

    static a a(w w1)
    {
        return w1.a;
    }

    private void a(ComponentName componentname)
    {
        m();
        if (b != null)
        {
            b = null;
            a("Disconnected from device AnalyticsService", componentname);
            h();
        }
    }

    private void a(d d1)
    {
        m();
        b = d1;
        f();
        t().g();
    }

    static void a(w w1, ComponentName componentname)
    {
        w1.a(componentname);
    }

    static void a(w w1, d d1)
    {
        w1.a(d1);
    }

    static void b(w w1)
    {
        w1.g();
    }

    private void f()
    {
        d.a();
        c.a(q().v());
    }

    private void g()
    {
        m();
        if (!b())
        {
            return;
        } else
        {
            b("Inactivity, disconnecting from device AnalyticsService");
            e();
            return;
        }
    }

    private void h()
    {
        t().e();
    }

    protected void a()
    {
    }

    public boolean a(c c1)
    {
        z.a(c1);
        m();
        D();
        d d1 = b;
        if (d1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (c1.f())
        {
            s = q().o();
        } else
        {
            s = q().p();
        }
        list = Collections.emptyList();
        try
        {
            d1.a(c1.b(), c1.d(), s, list);
            f();
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            b("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    public boolean b()
    {
        m();
        D();
        return b != null;
    }

    public boolean c()
    {
        m();
        D();
        d d1 = b;
        if (d1 == null)
        {
            return false;
        }
        try
        {
            d1.a();
            f();
        }
        catch (RemoteException remoteexception)
        {
            b("Failed to clear hits from AnalyticsService");
            return false;
        }
        return true;
    }

    public boolean d()
    {
        m();
        D();
        if (b != null)
        {
            return true;
        }
        d d1 = a.a();
        if (d1 != null)
        {
            b = d1;
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        m();
        D();
        try
        {
            com.google.android.gms.common.stats.b.a().a(o(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            h();
        }
    }

    // Unreferenced inner class com/google/android/gms/analytics/internal/zzi$zza$1

/* anonymous class */
    class zzi.zza._cls1
        implements Runnable
    {

        final d a;
        final a b;

        public void run()
        {
            if (!b.a.b())
            {
                b.a.c("Connected to service after a timeout");
                w.a(b.a, a);
            }
        }

            
            {
                b = a1;
                a = d1;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/analytics/internal/zzi$zza$2

/* anonymous class */
    class zzi.zza._cls2
        implements Runnable
    {

        final ComponentName a;
        final a b;

        public void run()
        {
            w.a(b.a, a);
        }

            
            {
                b = a1;
                a = componentname;
                super();
            }
    }

}
