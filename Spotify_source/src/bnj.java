// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

public final class bnj
    implements ServiceConnection
{

    final bni a;
    private volatile bmk b;
    private volatile boolean c;

    protected bnj(bni bni1)
    {
        a = bni1;
        super();
    }

    public final bmk a()
    {
        Object obj;
        Context context;
        bnf.i();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = ((bnc) (a)).f.a;
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        bto.a();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b = null;
        c = true;
        flag = bto.b(context, ((Intent) (obj)), a.a, 129);
        a.a("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(((Long)bnz.B.a).longValue());
_L1:
        c = false;
        obj = b;
        b = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        a.f("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((bmk) (obj));
        Object obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        a.e("Wait for service connect was interrupted");
          goto _L1
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        btl.b("AnalyticsServiceConnection.onServiceConnected");
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
        ibinder = bml.a(ibinder);
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
                bto.a();
                bto.a(((bnc) (a)).f.a, a.a);
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
            ((bnc) (a)).f.b().a(new Runnable(componentname) {

                private bmk a;
                private bnj b;

                public final void run()
                {
                    if (!b.a.b())
                    {
                        b.a.c("Connected to service after a timeout");
                        bni bni1 = b.a;
                        bmk bmk = a;
                        bnf.i();
                        bni1.b = bmk;
                        bni1.c();
                        ((bnc) (bni1)).f.c().e();
                    }
                }

            
            {
                b = bnj.this;
                a = bmk;
                super();
            }
            });
        }
        break MISSING_BLOCK_LABEL_105;
        b = componentname;
        break MISSING_BLOCK_LABEL_105;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        btl.b("AnalyticsServiceConnection.onServiceDisconnected");
        ((bnc) (a)).f.b().a(new Runnable(componentname) {

            private ComponentName a;
            private bnj b;

            public final void run()
            {
                bni bni1 = b.a;
                ComponentName componentname1 = a;
                bnf.i();
                if (bni1.b != null)
                {
                    bni1.b = null;
                    bni1.a("Disconnected from device AnalyticsService", componentname1);
                    ((bnc) (bni1)).f.c().d();
                }
            }

            
            {
                b = bnj.this;
                a = componentname;
                super();
            }
        });
    }
}
