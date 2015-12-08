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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.stats.zzb;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzi, zzr, zzac

protected class zzKa
    implements ServiceConnection
{

    final zzi zzKa;
    private volatile zzac zzKb;
    private volatile boolean zzKc;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzu.zzbY("AnalyticsServiceConnection.onServiceConnected");
        this;
        JVM INSTR monitorenter ;
        if (ibinder != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        zzKa.zzaX("Service connected with null binder");
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
        ibinder = .zzac(ibinder);
        componentname = ibinder;
        zzKa.zzaT("Bound to IAnalyticsService interface");
        componentname = ibinder;
_L4:
        {
            if (componentname != null)
            {
                break; /* Loop/switch isn't completed */
            }
            try
            {
                zzb.zzoO().zza(zzKa.getContext(), zzi.zza(zzKa));
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
        zzKa.zze("Got binder with a wrong descriptor", s);
        componentname = obj;
        continue; /* Loop/switch isn't completed */
        ibinder;
        zzKa.zzaX("Service connect failed to get IAnalyticsService");
        if (true) goto _L4; else goto _L3
        notifyAll();
        throw componentname;
_L3:
label0:
        {
            if (zzKc)
            {
                break label0;
            }
            zzKa.zzaW("onServiceConnected received after the timeout limit");
            zzKa.zzhS().zze(new Runnable(componentname) {

                final zzac zzKd;
                final zzi.zza zzKe;

                public void run()
                {
                    if (!zzKe.zzKa.isConnected())
                    {
                        zzKe.zzKa.zzaU("Connected to service after a timeout");
                        zzi.zza(zzKe.zzKa, zzKd);
                    }
                }

            
            {
                zzKe = zzi.zza.this;
                zzKd = zzac;
                super();
            }
            });
        }
        break MISSING_BLOCK_LABEL_101;
        zzKb = componentname;
        break MISSING_BLOCK_LABEL_101;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzu.zzbY("AnalyticsServiceConnection.onServiceDisconnected");
        zzKa.zzhS().zze(new Runnable(componentname) {

            final zzi.zza zzKe;
            final ComponentName zzKf;

            public void run()
            {
                zzi.zza(zzKe.zzKa, zzKf);
            }

            
            {
                zzKe = zzi.zza.this;
                zzKf = componentname;
                super();
            }
        });
    }

    public zzac zzip()
    {
        Object obj;
        Context context;
        zzKa.zzhO();
        obj = new Intent("com.google.android.gms.analytics.service.START");
        ((Intent) (obj)).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        context = zzKa.getContext();
        ((Intent) (obj)).putExtra("app_package_name", context.getPackageName());
        zzb zzb1 = zzb.zzoO();
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        zzKb = null;
        zzKc = true;
        flag = zzb1.zza(context, ((Intent) (obj)), zzi.zza(zzKa), 129);
        zzKa.zza("Bind to service requested", Boolean.valueOf(flag));
        if (flag)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        zzKc = false;
        this;
        JVM INSTR monitorexit ;
        return null;
        wait(zzKa.zzhR().zzjs());
_L1:
        zzKc = false;
        obj = zzKb;
        zzKb = null;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        zzKa.zzaX("Successfully bound to service but never got onServiceConnected callback");
        this;
        JVM INSTR monitorexit ;
        return ((zzac) (obj));
        Object obj1;
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        zzKa.zzaW("Wait for service connect was interrupted");
          goto _L1
    }

    protected _cls2.zzKf(zzi zzi1)
    {
        zzKa = zzi1;
        super();
    }
}
