// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.internal.zzhc;
import com.google.android.gms.internal.zzid;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd, zze, ConnectionEvent

public class zzb
{

    private static final Object zzTK = new Object();
    private static zzb zzVc;
    private static final ComponentName zzVh = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List zzVd;
    private final List zzVe;
    private final List zzVf;
    private final List zzVg;
    private zze zzVi;

    private zzb()
    {
        if (getLogLevel() == zzd.zzVq)
        {
            zzVd = Collections.EMPTY_LIST;
            zzVe = Collections.EMPTY_LIST;
            zzVf = Collections.EMPTY_LIST;
            zzVg = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)zzc.zza.zzVl.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzVd = ((List) (obj));
        obj = (String)zzc.zza.zzVm.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzVe = ((List) (obj));
        obj = (String)zzc.zza.zzVn.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzVf = ((List) (obj));
        obj = (String)zzc.zza.zzVo.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzVg = ((List) (obj));
        zzVi = new zze(1024, ((Long)zzc.zza.zzVp.get()).longValue());
    }

    private int getLogLevel()
    {
        int i;
        try
        {
            if (zzd.zzSV && zzhc.isInitialized() && zzhc.zzlj() == Process.myUid())
            {
                return ((Integer)zzc.zza.zzVk.get()).intValue();
            }
            i = zzd.zzVq;
        }
        catch (SecurityException securityexception)
        {
            return zzd.zzVq;
        }
        return i;
    }

    private void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent, String s1)
    {
        long l1;
        if (zzd.zzSV)
        {
            if (zza(context, s, intent, l1 = zzb(serviceconnection), s1))
            {
                long l2 = System.currentTimeMillis();
                serviceconnection = null;
                if ((getLogLevel() & zzd.zzVu) != 0)
                {
                    serviceconnection = zzid.zzj(3, 5);
                }
                long l = 0L;
                if ((getLogLevel() & zzd.zzVw) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (s1.equals("UNBIND") || s1.equals("DISCONNECT"))
                {
                    serviceconnection = new ConnectionEvent(l2, s1, null, null, null, null, serviceconnection, l1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = zzb(context, intent);
                    serviceconnection = new ConnectionEvent(l2, s1, zzid.zzW(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, l1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(zzVh).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private boolean zza(Context context, Intent intent)
    {
        return false;
    }

    private boolean zza(Context context, String s, Intent intent, long l, String s1)
    {
        int i = getLogLevel();
        if (i != zzd.zzVq && zzVi != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s1 != "DISCONNECT" && s1 != "UNBIND")
        {
            break; /* Loop/switch isn't completed */
        }
        if (zzVi.zzA(l))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1 = zzb(context, intent);
        if (s1 == null)
        {
            Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                s, intent.toUri(0)
            }));
            return false;
        }
        context = zzid.zzW(context);
        intent = ((ServiceInfo) (s1)).processName;
        s1 = ((ServiceInfo) (s1)).name;
        if (!zzVd.contains(context) && !zzVe.contains(s) && !zzVf.contains(intent) && !zzVg.contains(s1) && (!intent.equals(context) || (i & zzd.zzVv) == 0))
        {
            zzVi.zza(Long.valueOf(l));
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private long zzb(ServiceConnection serviceconnection)
    {
        return (long)Process.myPid() << 32 | (long)System.identityHashCode(serviceconnection);
    }

    private static ServiceInfo zzb(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzid.zzj(3, 20)
            }));
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzid.zzj(3, 20)
            }));
            intent = context.iterator();
            if (intent.hasNext())
            {
                Log.w("ConnectionTracker", ((ResolveInfo)intent.next()).serviceInfo.name);
                return null;
            }
        }
        return ((ResolveInfo)context.get(0)).serviceInfo;
    }

    public static zzb zznb()
    {
        synchronized (zzTK)
        {
            if (zzVc == null)
            {
                zzVc = new zzb();
            }
        }
        return zzVc;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), "UNBIND");
        context.unbindService(serviceconnection);
    }

    public void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        zza(context, serviceconnection, s, intent, "CONNECT");
    }

    public boolean zza(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        return zza(context, context.getClass().getName(), intent, serviceconnection, i);
    }

    public boolean zza(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
    {
        if (zza(context, intent))
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        } else
        {
            zza(context, serviceconnection, s, intent, "BIND");
            return context.bindService(intent, serviceconnection, i);
        }
    }

    public void zzb(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), "DISCONNECT");
    }

}
