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
import android.util.Log;
import com.google.android.gms.common.internal.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ij, ii, hk, ik, 
//            it, zzlm

public final class ig
{

    private static final Object a = new Object();
    private static ig b;
    private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private ik h;

    private ig()
    {
        if (b() == ij.a)
        {
            c = Collections.EMPTY_LIST;
            d = Collections.EMPTY_LIST;
            e = Collections.EMPTY_LIST;
            f = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)ii.c.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        c = ((List) (obj));
        obj = (String)ii.d.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        d = ((List) (obj));
        obj = (String)ii.e.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        e = ((List) (obj));
        obj = (String)ii.f.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        f = ((List) (obj));
        h = new ik(((Long)com.google.android.gms.internal.ii.g.d()).longValue());
    }

    private static ServiceInfo a(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            Log.w("ConnectionTracker", (new StringBuilder("There are no handler of this intent: ")).append(intent.toUri(0)).toString());
            return null;
        }
        if (context.size() > 1)
        {
            Log.w("ConnectionTracker", (new StringBuilder("There are multiple handlers for this intent: ")).append(intent.toUri(0)).toString());
            intent = context.iterator();
            if (intent.hasNext())
            {
                Log.w("ConnectionTracker", ((ResolveInfo)intent.next()).serviceInfo.name);
                return null;
            }
        }
        return ((ResolveInfo)context.get(0)).serviceInfo;
    }

    public static ig a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new ig();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Context context, ServiceConnection serviceconnection, String s, Intent intent, String s1)
    {
        if (g.a)
        {
            long l = (long)Process.myPid() << 32 | (long)System.identityHashCode(serviceconnection);
            int i = b();
            if (i == ij.a || h == null)
            {
                i = 0;
            } else
            if (s1 == "DISCONNECT" || s1 == "UNBIND")
            {
                if (h.a(l))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            } else
            {
                obj1 = a(context, intent);
                if (obj1 == null)
                {
                    i = 0;
                } else
                {
                    serviceconnection = it.a(context);
                    obj = ((ServiceInfo) (obj1)).processName;
                    obj1 = ((ServiceInfo) (obj1)).name;
                    if (c.contains(serviceconnection) || d.contains(s) || e.contains(obj) || f.contains(obj1) || ((String) (obj)).equals(serviceconnection) && (i & ij.e) != 0)
                    {
                        i = 0;
                    } else
                    {
                        h.a(Long.valueOf(l));
                        i = 1;
                    }
                }
            }
            if (i != 0)
            {
                long l1 = System.currentTimeMillis();
                Object obj = Thread.currentThread().getStackTrace();
                Object obj1 = new StringBuffer();
                i = 3;
                while (i < 8) 
                {
                    if (i + 4 >= obj.length)
                    {
                        serviceconnection = "<bottom of call stack>";
                    } else
                    {
                        serviceconnection = obj[i + 4];
                        serviceconnection = (new StringBuilder()).append(serviceconnection.getClassName()).append(".").append(serviceconnection.getMethodName()).append(":").append(serviceconnection.getLineNumber()).toString();
                    }
                    ((StringBuffer) (obj1)).append(serviceconnection).append(" ");
                    i++;
                }
                serviceconnection = ((StringBuffer) (obj1)).toString();
                if (s1.equals("UNBIND") || s1.equals("DISCONNECT"))
                {
                    serviceconnection = new zzlm(l1, s1, null, null, null, null, serviceconnection, l);
                } else
                {
                    intent = a(context, intent);
                    serviceconnection = new zzlm(l1, s1, it.a(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, l);
                }
                context.startService((new Intent()).setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private static int b()
    {
        int i;
        try
        {
            if (g.a && hk.b() && hk.a() == Process.myUid())
            {
                return ((Integer)ii.b.d()).intValue();
            }
            i = ij.a;
        }
        catch (SecurityException securityexception)
        {
            return ij.a;
        }
        return i;
    }

    public final void a(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), "UNBIND");
        context.unbindService(serviceconnection);
    }

    public final void a(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        a(context, serviceconnection, s, intent, "CONNECT");
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int i)
    {
        return a(context, context.getClass().getName(), intent, serviceconnection, i);
    }

    public final boolean a(Context context, String s, Intent intent, ServiceConnection serviceconnection, int i)
    {
        a(context, serviceconnection, s, intent, "BIND");
        return context.bindService(intent, serviceconnection, i);
    }

    public final void b(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, ((String) (null)), ((Intent) (null)), "DISCONNECT");
    }

}
