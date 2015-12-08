// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Process;
import com.google.android.gms.common.internal.zze;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzlq, zzki, zzlr, zzmf, 
//            zzlm

public class zzlo
{

    private static final Object zzQc = new Object();
    private static zzlo zzRr;
    private static final ComponentName zzRw = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List zzRs;
    private final List zzRt;
    private final List zzRu;
    private final List zzRv;
    private zzlr zzRx;

    private zzlo()
    {
        if (getLogLevel() == zzlq.zzRF)
        {
            zzRs = Collections.EMPTY_LIST;
            zzRt = Collections.EMPTY_LIST;
            zzRu = Collections.EMPTY_LIST;
            zzRv = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)zzlp.zza.zzRA.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzRs = ((List) (obj));
        obj = (String)zzlp.zza.zzRB.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzRt = ((List) (obj));
        obj = (String)zzlp.zza.zzRC.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzRu = ((List) (obj));
        obj = (String)zzlp.zza.zzRD.get();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        zzRv = ((List) (obj));
        zzRx = new zzlr(1024, ((Long)zzlp.zza.zzRE.get()).longValue());
    }

    private int getLogLevel()
    {
        int i;
        try
        {
            if (zze.zzPq && zzki.isInitialized() && zzki.zzis() == Process.myUid())
            {
                return ((Integer)zzlp.zza.zzRz.get()).intValue();
            }
            i = zzlq.zzRF;
        }
        catch (SecurityException securityexception)
        {
            return zzlq.zzRF;
        }
        return i;
    }

    private void zza(Context context, ServiceConnection serviceconnection, String s, Intent intent, String s1)
    {
        long l;
        if (zze.zzPq)
        {
            if (zza(context, s, intent, l = zzb(serviceconnection), s1))
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = zzmf.zzl(3, 5);
                if (s1.equals("UNBIND") || s1.equals("DISCONNECT"))
                {
                    serviceconnection = new zzlm(l1, s1, null, null, null, null, serviceconnection, l);
                } else
                {
                    intent = zzb(context, intent);
                    serviceconnection = new zzlm(l1, s1, zzmf.zzR(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, l);
                }
                context.startService((new Intent()).setComponent(zzRw).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private boolean zza(Context context, String s, Intent intent, long l, String s1)
    {
        int i = getLogLevel();
        if (i != zzlq.zzRF && zzRx != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (s1 != "DISCONNECT" && s1 != "UNBIND")
        {
            break; /* Loop/switch isn't completed */
        }
        if (zzRx.zzr(l))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        intent = zzb(context, intent);
        if (intent != null)
        {
            context = zzmf.zzR(context);
            s1 = ((ServiceInfo) (intent)).processName;
            intent = ((ServiceInfo) (intent)).name;
            if (!zzRs.contains(context) && !zzRt.contains(s) && !zzRu.contains(s1) && !zzRv.contains(intent) && (!s1.equals(context) || (i & zzlq.zzRJ) == 0))
            {
                zzRx.zza(Long.valueOf(l));
                return true;
            }
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
            (new StringBuilder("There are no handler of this intent: ")).append(intent.toUri(0));
            return null;
        }
        if (context.size() > 1)
        {
            (new StringBuilder("There are multiple handlers for this intent: ")).append(intent.toUri(0));
            intent = context.iterator();
            if (intent.hasNext())
            {
                context = ((ResolveInfo)intent.next()).serviceInfo.name;
                return null;
            }
        }
        return ((ResolveInfo)context.get(0)).serviceInfo;
    }

    public static zzlo zzka()
    {
        synchronized (zzQc)
        {
            if (zzRr == null)
            {
                zzRr = new zzlo();
            }
        }
        return zzRr;
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
        zza(context, serviceconnection, s, intent, "BIND");
        return context.bindService(intent, serviceconnection, i);
    }

    public void zzb(Context context, ServiceConnection serviceconnection)
    {
        zza(context, serviceconnection, ((String) (null)), ((Intent) (null)), "DISCONNECT");
    }

}
