// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

public final class jrq
    implements ServiceConnection
{

    final jro a;
    private volatile jtf b;
    private volatile boolean c;

    protected jrq(jro jro1)
    {
        a = jro1;
        super();
    }

    public final jtf a()
    {
        Object obj;
        Context context;
        obj = a;
        jrk.i();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = a.h();
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        kcz kcz1 = kcz.a();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b = null;
        c = true;
        flag = kcz1.a(context, ((Intent) (obj)), a.a, 129);
        a.a("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(((Long)jsl.B.a()).longValue());
_L1:
        c = false;
        obj = b;
        b = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        a.f("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((jtf) (obj));
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
        b.p("AnalyticsServiceConnection.onServiceConnected");
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
        ibinder = jtg.a(ibinder);
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
                kcz.a().a(a.h(), a.a);
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
            ((jrj) (a)).d.b().a(new jrr(this, componentname));
        }
        break MISSING_BLOCK_LABEL_101;
        b = componentname;
        break MISSING_BLOCK_LABEL_101;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.p("AnalyticsServiceConnection.onServiceDisconnected");
        ((jrj) (a)).d.b().a(new jrs(this, componentname));
    }
}
