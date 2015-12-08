// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Process;
import com.google.android.m4b.maps.cx.a;
import com.google.android.m4b.maps.j.f;
import java.util.Collections;
import java.util.List;

public final class c
{

    private static final Object a = new Object();
    private static c b;
    private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private final List c;
    private final List d;
    private final List e;
    private final List f;

    private c()
    {
        b();
        c = Collections.EMPTY_LIST;
        d = Collections.EMPTY_LIST;
        e = Collections.EMPTY_LIST;
        f = Collections.EMPTY_LIST;
    }

    public static c a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new c();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        a(serviceconnection);
        context.unbindService(serviceconnection);
    }

    public static void a(ServiceConnection serviceconnection)
    {
        if (!f.c)
        {
            return;
        } else
        {
            long l = Process.myPid();
            l = System.identityHashCode(serviceconnection);
            b();
            return;
        }
    }

    private static int b()
    {
        try
        {
            if (f.c)
            {
                com.google.android.m4b.maps.cx.a.a();
            }
        }
        catch (SecurityException securityexception)
        {
            return 0;
        }
        return 0;
    }

}
