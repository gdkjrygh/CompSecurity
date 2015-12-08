// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzaj, zzf, zzb, 
//            zzr, zzt, zzab, zzac

public class zzi extends zzd
{

    private final zza a = new zza();
    private zzac b;
    private final zzt c;
    private zzaj d;

    protected zzi(zzf zzf1)
    {
        super(zzf1);
        d = new zzaj(zzf1.d());
        c = new zzt(zzf1) {

            final zzi a;

            public void a()
            {
                zzi.b(a);
            }

            
            {
                a = zzi.this;
                super(zzf1);
            }
        };
    }

    static zza a(zzi zzi1)
    {
        return zzi1.a;
    }

    private void a(ComponentName componentname)
    {
        m();
        if (b != null)
        {
            b = null;
            a("Disconnected from device AnalyticsService", componentname);
            g();
        }
    }

    private void a(zzac zzac1)
    {
        m();
        b = zzac1;
        e();
        t().g();
    }

    static void a(zzi zzi1, ComponentName componentname)
    {
        zzi1.a(componentname);
    }

    static void a(zzi zzi1, zzac zzac1)
    {
        zzi1.a(zzac1);
    }

    static void b(zzi zzi1)
    {
        zzi1.f();
    }

    private void e()
    {
        d.a();
        c.a(q().v());
    }

    private void f()
    {
        m();
        if (!b())
        {
            return;
        } else
        {
            b("Inactivity, disconnecting from device AnalyticsService");
            d();
            return;
        }
    }

    private void g()
    {
        t().e();
    }

    protected void a()
    {
    }

    public boolean a(zzab zzab1)
    {
        zzu.a(zzab1);
        m();
        D();
        zzac zzac1 = b;
        if (zzac1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (zzab1.f())
        {
            s = q().o();
        } else
        {
            s = q().p();
        }
        list = Collections.emptyList();
        try
        {
            zzac1.a(zzab1.b(), zzab1.d(), s, list);
            e();
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
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
        if (b != null)
        {
            return true;
        }
        zzac zzac1 = a.a();
        if (zzac1 != null)
        {
            b = zzac1;
            e();
            return true;
        } else
        {
            return false;
        }
    }

    public void d()
    {
        m();
        D();
        try
        {
            zzb.a().a(o(), a);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (b != null)
        {
            b = null;
            g();
        }
    }

    private class zza
        implements ServiceConnection
    {

        final zzi a;
        private volatile zzac b;
        private volatile boolean c;

        public zzac a()
        {
            Object obj;
            Context context;
            a.m();
            obj = new Intent("com.google.android.gms.analytics.service.START");
            ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
            context = a.o();
            ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
            zzb zzb1 = zzb.a();
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            b = null;
            c = true;
            flag = zzb1.a(context, ((Intent) (obj)), zzi.a(a), 129);
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
            return ((zzac) (obj));
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
            zzu.b("AnalyticsServiceConnection.onServiceConnected");
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
            ibinder = zzac.zza.a(ibinder);
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
                    zzb.a().a(a.o(), zzi.a(a));
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
                a.r().a(new Runnable(componentname) {

                    final zzac a;
                    final zza b;

                    public void run()
                    {
                        if (!b.a.b())
                        {
                            b.a.c("Connected to service after a timeout");
                            zzi.a(b.a, a);
                        }
                    }

                
                {
                    b = zza.this;
                    a = zzac1;
                    super();
                }
                });
            }
            break MISSING_BLOCK_LABEL_101;
            b = componentname;
            break MISSING_BLOCK_LABEL_101;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            zzu.b("AnalyticsServiceConnection.onServiceDisconnected");
            a.r().a(new Runnable(componentname) {

                final ComponentName a;
                final zza b;

                public void run()
                {
                    zzi.a(b.a, a);
                }

                
                {
                    b = zza.this;
                    a = componentname;
                    super();
                }
            });
        }

        protected zza()
        {
            a = zzi.this;
            super();
        }
    }

}
