// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl

final class d
{

    final zzl a;
    private final zza b = new zza();
    private final Set c = new HashSet();
    private int d;
    private boolean e;
    private IBinder f;
    private final zza g;
    private ComponentName h;

    static int a(d d1, int i)
    {
        d1.d = i;
        return i;
    }

    static ComponentName a(d d1, ComponentName componentname)
    {
        d1.h = componentname;
        return componentname;
    }

    static IBinder a(h h1, IBinder ibinder)
    {
        h1.f = ibinder;
        return ibinder;
    }

    static f a(f f1)
    {
        return f1.g;
    }

    static Set b(g g1)
    {
        return g1.c;
    }

    public void a(ServiceConnection serviceconnection, String s)
    {
        zzl.c(a).a(zzl.b(a), serviceconnection, s, g.a());
        c.add(serviceconnection);
    }

    public void a(String s)
    {
        e = zzl.c(a).a(zzl.b(a), s, g.a(), b, 129);
        if (e)
        {
            d = 3;
            return;
        }
        try
        {
            zzl.c(a).a(zzl.b(a), b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public boolean a()
    {
        return e;
    }

    public boolean a(ServiceConnection serviceconnection)
    {
        return c.contains(serviceconnection);
    }

    public int b()
    {
        return d;
    }

    public void b(ServiceConnection serviceconnection, String s)
    {
        zzl.c(a).b(zzl.b(a), serviceconnection);
        c.remove(serviceconnection);
    }

    public void b(String s)
    {
        zzl.c(a).a(zzl.b(a), b);
        e = false;
        d = 2;
    }

    public boolean c()
    {
        return c.isEmpty();
    }

    public IBinder d()
    {
        return f;
    }

    public ComponentName e()
    {
        return h;
    }

    public zza.a(zzl zzl1, zza zza1)
    {
        a = zzl1;
        super();
        g = zza1;
        class zza
            implements ServiceConnection
        {

            final zzl.zzb a;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                java.util.HashMap hashmap = zzl.a(a.a);
                hashmap;
                JVM INSTR monitorenter ;
                zzl.zzb.a(a, ibinder);
                zzl.zzb.a(a, componentname);
                for (Iterator iterator = zzl.zzb.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
                break MISSING_BLOCK_LABEL_80;
                componentname;
                hashmap;
                JVM INSTR monitorexit ;
                throw componentname;
                zzl.zzb.a(a, 1);
                hashmap;
                JVM INSTR monitorexit ;
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                java.util.HashMap hashmap = zzl.a(a.a);
                hashmap;
                JVM INSTR monitorenter ;
                zzl.zzb.a(a, null);
                zzl.zzb.a(a, componentname);
                for (Iterator iterator = zzl.zzb.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
                break MISSING_BLOCK_LABEL_76;
                componentname;
                hashmap;
                JVM INSTR monitorexit ;
                throw componentname;
                zzl.zzb.a(a, 2);
                hashmap;
                JVM INSTR monitorexit ;
            }

            public zza()
            {
                a = zzl.zzb.this;
                super();
            }
        }

        d = 2;
    }
}
