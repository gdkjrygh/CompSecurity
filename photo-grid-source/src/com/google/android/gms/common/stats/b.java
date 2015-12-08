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
import android.os.Binder;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.ve;
import com.google.android.gms.internal.wf;
import com.google.android.gms.internal.wo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//            f, d, g, ConnectionEvent

public final class b
{

    private static final Object a = new Object();
    private static b b;
    private static Integer h;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private g g;
    private g i;

    private b()
    {
        if (b() == f.b)
        {
            c = Collections.EMPTY_LIST;
            d = Collections.EMPTY_LIST;
            e = Collections.EMPTY_LIST;
            f = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)d.b.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        c = ((List) (obj));
        obj = (String)d.c.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        d = ((List) (obj));
        obj = (String)d.d.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        e = ((List) (obj));
        obj = (String)d.e.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        f = ((List) (obj));
        g = new g(((Long)d.f.d()).longValue());
        i = new g(((Long)d.f.d()).longValue());
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

    private static String a(ServiceConnection serviceconnection)
    {
        return String.valueOf((long)Process.myPid() << 32 | (long)System.identityHashCode(serviceconnection));
    }

    private void a(Context context, String s, String s1, Intent intent, int j)
    {
        boolean flag;
        if (!i.a)
        {
            flag = false;
        } else
        if (b() == f.b)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (flag && g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (j != 4 && j != 1) goto _L4; else goto _L3
_L3:
        if (!g.b(s)) goto _L1; else goto _L5
_L5:
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        intent = null;
_L11:
        long l1 = System.currentTimeMillis();
        Object obj2 = null;
        String s2 = obj2;
        if ((b() & f.f) != 0)
        {
            s2 = obj2;
            if (j != 13)
            {
                s2 = wo.a(5);
            }
        }
        long l = 0L;
        if ((b() & f.h) != 0)
        {
            l = Debug.getNativeHeapAllocatedSize();
        }
        int k;
        if (j == 1 || j == 4 || j == 14)
        {
            s = new ConnectionEvent(l1, j, null, null, null, null, s2, s, SystemClock.elapsedRealtime(), l);
        } else
        {
            s = new ConnectionEvent(l1, j, intent, s1, ((String) (obj)), ((String) (obj1)), s2, s, SystemClock.elapsedRealtime(), l);
        }
        context.startService((new Intent()).setComponent(f.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", s));
        return;
_L4:
        obj = context.getPackageManager().queryIntentServices(intent, 128);
        if (obj != null && ((List) (obj)).size() != 0) goto _L7; else goto _L6
_L6:
        Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
            intent.toUri(0), wo.a(20)
        }));
        obj = null;
_L9:
        if (obj == null)
        {
            Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] {
                s1, intent.toUri(0)
            }));
            return;
        }
        break; /* Loop/switch isn't completed */
_L7:
        if (((List) (obj)).size() > 1)
        {
            Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), wo.a(20)
            }));
            obj1 = ((List) (obj)).iterator();
            if (((Iterator) (obj1)).hasNext())
            {
                Log.w("ConnectionTracker", ((ResolveInfo)((Iterator) (obj1)).next()).serviceInfo.name);
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
        }
        obj = ((ResolveInfo)((List) (obj)).get(0)).serviceInfo;
        if (true) goto _L9; else goto _L8
_L8:
        obj1 = ((ServiceInfo) (obj)).processName;
        s2 = ((ServiceInfo) (obj)).name;
        intent = wo.a(context, Binder.getCallingPid());
        k = b();
        if (c.contains(intent) || d.contains(s1) || e.contains(obj1) || f.contains(s2) || ((String) (obj1)).equals(intent) && (k & f.g) != 0)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        if (!k) goto _L1; else goto _L10
_L10:
        g.a(s);
        obj = obj1;
        obj1 = s2;
          goto _L11
    }

    private static int b()
    {
        if (h != null) goto _L2; else goto _L1
_L1:
        if (!wf.a()) goto _L4; else goto _L3
_L3:
        int j = ((Integer)d.a.d()).intValue();
_L5:
        h = Integer.valueOf(j);
_L2:
        return h.intValue();
_L4:
        j = f.b;
          goto _L5
        SecurityException securityexception;
        securityexception;
        h = Integer.valueOf(f.b);
          goto _L2
    }

    public final void a(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        a(context, a(serviceconnection), ((String) (null)), ((Intent) (null)), 1);
    }

    public final void a(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        a(context, a(serviceconnection), s, intent, 3);
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int j)
    {
        return a(context, context.getClass().getName(), intent, serviceconnection, j);
    }

    public final boolean a(Context context, String s, Intent intent, ServiceConnection serviceconnection, int j)
    {
        ComponentName componentname = intent.getComponent();
        boolean flag;
        if (componentname == null || i.a && "com.google.android.gms".equals(componentname.getPackageName()))
        {
            flag = false;
        } else
        {
            flag = wf.a(context, componentname.getPackageName());
        }
        if (flag)
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        flag = context.bindService(intent, serviceconnection, j);
        if (flag)
        {
            a(context, a(serviceconnection), s, intent, 2);
        }
        return flag;
    }

    public final void b(Context context, ServiceConnection serviceconnection)
    {
        a(context, a(serviceconnection), ((String) (null)), ((Intent) (null)), 4);
    }

}
