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
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzla;
import com.google.android.gms.internal.zzll;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            zzd, zze, ConnectionEvent

public class zzb
{

    private static final Object a = new Object();
    private static zzb b;
    private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private zze h;

    private zzb()
    {
        if (b() == zzd.a)
        {
            c = Collections.EMPTY_LIST;
            d = Collections.EMPTY_LIST;
            e = Collections.EMPTY_LIST;
            f = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)zzc.zza.b.c();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        c = ((List) (obj));
        obj = (String)zzc.zza.c.c();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        d = ((List) (obj));
        obj = (String)zzc.zza.d.c();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        e = ((List) (obj));
        obj = (String)zzc.zza.e.c();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        f = ((List) (obj));
        h = new zze(1024, ((Long)zzc.zza.f.c()).longValue());
    }

    public static zzb a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new zzb();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String a(ServiceConnection serviceconnection)
    {
        return String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceconnection));
    }

    private void a(Context context, ServiceConnection serviceconnection, String s, Intent intent, int i)
    {
        String s1;
        if (zzd.a)
        {
            if (a(context, s, intent, s1 = a(serviceconnection), i))
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = null;
                if ((b() & zzd.e) != 0)
                {
                    serviceconnection = zzll.a(3, 5);
                }
                long l = 0L;
                if ((b() & zzd.g) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (i == 1 || i == 4)
                {
                    serviceconnection = new ConnectionEvent(l1, i, null, null, null, null, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = b(context, intent);
                    serviceconnection = new ConnectionEvent(l1, i, zzll.a(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private boolean a(Context context, Intent intent)
    {
        intent = intent.getComponent();
        if (intent == null || zzd.a && "com.google.android.gms".equals(intent.getPackageName()))
        {
            return false;
        } else
        {
            return zzla.a(context, intent.getPackageName());
        }
    }

    private boolean a(Context context, String s, Intent intent, String s1, int i)
    {
        int j = b();
        if (j != zzd.a && h != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (i != 4 && i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h.b(s1))
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj = b(context, intent);
        if (obj == null)
        {
            Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                s, intent.toUri(0)
            }));
            return false;
        }
        context = zzll.a(context);
        intent = ((ServiceInfo) (obj)).processName;
        obj = ((ServiceInfo) (obj)).name;
        if (!c.contains(context) && !d.contains(s) && !e.contains(intent) && !f.contains(obj) && (!intent.equals(context) || (j & zzd.f) == 0))
        {
            h.a(s1);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private int b()
    {
        int i;
        try
        {
            if (zzla.a())
            {
                return ((Integer)zzc.zza.a.c()).intValue();
            }
            i = zzd.a;
        }
        catch (SecurityException securityexception)
        {
            return zzd.a;
        }
        return i;
    }

    private static ServiceInfo b(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzll.a(3, 20)
            }));
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), zzll.a(3, 20)
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

    public void a(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), 1);
        context.unbindService(serviceconnection);
    }

    public void a(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        a(context, serviceconnection, s, intent, 3);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        return a(context, context.getClass().getName(), intent, serviceconnection, i);
    }

    public boolean a(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
    {
        if (a(context, intent))
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        } else
        {
            a(context, serviceconnection, s, intent, 2);
            return context.bindService(intent, serviceconnection, i);
        }
    }

    public void b(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), 4);
    }

}
