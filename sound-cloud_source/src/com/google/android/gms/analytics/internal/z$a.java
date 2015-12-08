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
import com.google.android.gms.b.aj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.stats.zzb;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, v, s, Z, 
//            B, C, e

protected final class a
    implements ServiceConnection
{

    final z a;
    private volatile e b;
    private volatile boolean c;

    public final e a()
    {
        Object obj;
        Context context;
        v.g();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = ((s) (a)).i.a;
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        zzb zzb1 = zzb.zzpD();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        b = null;
        c = true;
        flag = zzb1.zza(context, ((Intent) (obj)), a.a, 129);
        a.a("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(((Long)Z.L.a()).longValue());
_L1:
        c = false;
        obj = b;
        b = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        a.f("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((e) (obj));
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
        zzx.zzch("AnalyticsServiceConnection.onServiceConnected");
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
        String s1 = ibinder.getInterfaceDescriptor();
        componentname = obj1;
        if (!"com.google.android.gms.analytics.internal.IAnalyticsService".equals(s1)) goto _L2; else goto _L1
_L1:
        componentname = obj1;
        ibinder = a(ibinder);
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
                zzb.zzpD().zza(((s) (a)).i.a, a.a);
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
        a.d("Got binder with a wrong descriptor", s1);
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
            ((s) (a)).i.b().a(new B(this, componentname));
        }
        break MISSING_BLOCK_LABEL_104;
        b = componentname;
        break MISSING_BLOCK_LABEL_104;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        zzx.zzch("AnalyticsServiceConnection.onServiceDisconnected");
        ((s) (a)).i.b().a(new C(this, componentname));
    }

    protected (z z1)
    {
        a = z1;
        super();
    }
}
