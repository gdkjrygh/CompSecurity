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
import com.google.android.gms.common.internal.g;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.iu;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            d, e, ConnectionEvent

public final class b
{

    private static final Object a = new Object();
    private static b b;
    private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static Integer i;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private e h;

    private b()
    {
        if (b() == d.a)
        {
            c = Collections.EMPTY_LIST;
            d = Collections.EMPTY_LIST;
            e = Collections.EMPTY_LIST;
            f = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)c.a.b.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        c = ((List) (obj));
        obj = (String)c.a.c.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        d = ((List) (obj));
        obj = (String)c.a.d.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        e = ((List) (obj));
        obj = (String)c.a.e.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        f = ((List) (obj));
        h = new e(((Long)c.a.f.d()).longValue());
    }

    private static ServiceInfo a(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), iu.a(20)
            }));
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), iu.a(20)
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

    public static b a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new b();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Context context, ServiceConnection serviceconnection, String s, Intent intent, int j)
    {
        if (g.a)
        {
            String s1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceconnection));
            int k = b();
            if (k == d.a || h == null)
            {
                k = 0;
            } else
            if (j == 4 || j == 1)
            {
                if (h.b(s1))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
            } else
            {
                Object obj = a(context, intent);
                if (obj == null)
                {
                    Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                        s, intent.toUri(0)
                    }));
                    k = 0;
                } else
                {
                    serviceconnection = iu.a(context);
                    String s2 = ((ServiceInfo) (obj)).processName;
                    obj = ((ServiceInfo) (obj)).name;
                    if (c.contains(serviceconnection) || d.contains(s) || e.contains(s2) || f.contains(obj) || s2.equals(serviceconnection) && (k & d.f) != 0)
                    {
                        k = 0;
                    } else
                    {
                        h.a(s1);
                        k = 1;
                    }
                }
            }
            if (k != 0)
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = null;
                if ((b() & d.e) != 0)
                {
                    serviceconnection = iu.a(5);
                }
                long l = 0L;
                if ((b() & com.google.android.gms.common.stats.d.g) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (j == 1 || j == 4)
                {
                    serviceconnection = new ConnectionEvent(l1, j, null, null, null, null, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = a(context, intent);
                    serviceconnection = new ConnectionEvent(l1, j, iu.a(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private static int b()
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        if (!in.a()) goto _L4; else goto _L3
_L3:
        int j = ((Integer)c.a.a.d()).intValue();
_L5:
        i = Integer.valueOf(j);
_L2:
        return i.intValue();
_L4:
        j = d.a;
          goto _L5
        SecurityException securityexception;
        securityexception;
        i = Integer.valueOf(d.a);
          goto _L2
    }

    public final void a(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), 1);
    }

    public final void a(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        a(context, serviceconnection, s, intent, 3);
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int j)
    {
        return a(context, context.getClass().getName(), intent, serviceconnection, j);
    }

    public final boolean a(Context context, String s, Intent intent, ServiceConnection serviceconnection, int j)
    {
        ComponentName componentname = intent.getComponent();
        boolean flag;
        if (componentname == null || g.a && "com.google.android.gms".equals(componentname.getPackageName()))
        {
            flag = false;
        } else
        {
            flag = in.a(context, componentname.getPackageName());
        }
        if (flag)
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        flag = context.bindService(intent, serviceconnection, j);
        if (flag)
        {
            a(context, serviceconnection, s, intent, 2);
        }
        return flag;
    }

    public final void b(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), 4);
    }

}
