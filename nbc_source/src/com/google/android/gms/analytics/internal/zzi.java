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
import java.util.Collections;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzaj, zzf, zzb, 
//            zzr, zzt, zzab, zzac

public class zzi extends zzd
{
    protected class zza
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
            ibinder = zzac.zza.zzac(ibinder);
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
                    com.google.android.gms.common.stats.zzb.zzoO().zza(zzKa.getContext(), zzi.zza(zzKa));
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
                zzKa.zzhS().zze(new Runnable(this, componentname) {

                    final zzac zzKd;
                    final zza zzKe;

                    public void run()
                    {
                        if (!zzKe.zzKa.isConnected())
                        {
                            zzKe.zzKa.zzaU("Connected to service after a timeout");
                            zzi.zza(zzKe.zzKa, zzKd);
                        }
                    }

            
            {
                zzKe = zza1;
                zzKd = zzac1;
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
            zzKa.zzhS().zze(new Runnable(this, componentname) {

                final zza zzKe;
                final ComponentName zzKf;

                public void run()
                {
                    zzi.zza(zzKe.zzKa, zzKf);
                }

            
            {
                zzKe = zza1;
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
            zzb zzb1 = com.google.android.gms.common.stats.zzb.zzoO();
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

        protected zza()
        {
            zzKa = zzi.this;
            super();
        }
    }


    private final zza zzJW = new zza();
    private zzac zzJX;
    private final zzt zzJY;
    private zzaj zzJZ;

    protected zzi(zzf zzf1)
    {
        super(zzf1);
        zzJZ = new zzaj(zzf1.zzhP());
        zzJY = new zzt(zzf1) {

            final zzi zzKa;

            public void run()
            {
                com.google.android.gms.analytics.internal.zzi.zzb(zzKa);
            }

            
            {
                zzKa = zzi.this;
                super(zzf1);
            }
        };
    }

    private void onDisconnect()
    {
        zzhl().zzhJ();
    }

    private void onServiceDisconnected(ComponentName componentname)
    {
        zzhO();
        if (zzJX != null)
        {
            zzJX = null;
            zza("Disconnected from device AnalyticsService", componentname);
            onDisconnect();
        }
    }

    static zza zza(zzi zzi1)
    {
        return zzi1.zzJW;
    }

    private void zza(zzac zzac1)
    {
        zzhO();
        zzJX = zzac1;
        zzin();
        zzhl().onServiceConnected();
    }

    static void zza(zzi zzi1, ComponentName componentname)
    {
        zzi1.onServiceDisconnected(componentname);
    }

    static void zza(zzi zzi1, zzac zzac1)
    {
        zzi1.zza(zzac1);
    }

    static void zzb(zzi zzi1)
    {
        zzi1.zzio();
    }

    private void zzin()
    {
        zzJZ.start();
        zzJY.zzt(zzhR().zzjr());
    }

    private void zzio()
    {
        zzhO();
        if (!isConnected())
        {
            return;
        } else
        {
            zzaT("Inactivity, disconnecting from device AnalyticsService");
            disconnect();
            return;
        }
    }

    public boolean connect()
    {
        zzhO();
        zzia();
        if (zzJX != null)
        {
            return true;
        }
        zzac zzac1 = zzJW.zzip();
        if (zzac1 != null)
        {
            zzJX = zzac1;
            zzin();
            return true;
        } else
        {
            return false;
        }
    }

    public void disconnect()
    {
        zzhO();
        zzia();
        try
        {
            com.google.android.gms.common.stats.zzb.zzoO().zza(getContext(), zzJW);
        }
        catch (IllegalStateException illegalstateexception) { }
        catch (IllegalArgumentException illegalargumentexception) { }
        if (zzJX != null)
        {
            zzJX = null;
            onDisconnect();
        }
    }

    public boolean isConnected()
    {
        zzhO();
        zzia();
        return zzJX != null;
    }

    public boolean zzb(zzab zzab1)
    {
        zzu.zzu(zzab1);
        zzhO();
        zzia();
        zzac zzac1 = zzJX;
        if (zzac1 == null)
        {
            return false;
        }
        String s;
        java.util.List list;
        if (zzab1.zzjY())
        {
            s = zzhR().zzjk();
        } else
        {
            s = zzhR().zzjl();
        }
        list = Collections.emptyList();
        try
        {
            zzac1.zza(zzab1.zzn(), zzab1.zzjW(), s, list);
            zzin();
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            zzaT("Failed to send hits to AnalyticsService");
            return false;
        }
        return true;
    }

    protected void zzhn()
    {
    }
}
