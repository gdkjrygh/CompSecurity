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

private final class d
{
    public class zza
        implements ServiceConnection
    {

        final zzl.zzb zzTV;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = zzl.a(zzTV.a);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.a(zzTV, ibinder);
            zzl.zzb.a(zzTV, componentname);
            for (Iterator iterator = zzl.zzb.b(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.a(zzTV, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = zzl.a(zzTV.a);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.a(zzTV, null);
            zzl.zzb.a(zzTV, componentname);
            for (Iterator iterator = zzl.zzb.b(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.a(zzTV, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zza()
        {
            zzTV = zzl.zzb.this;
            super();
        }
    }


    final zzl a;
    private final zza b = new zza();
    private final Set c = new HashSet();
    private int d;
    private boolean e;
    private IBinder f;
    private final zza g;
    private ComponentName h;

    static int a(zza.zzTV zztv, int i)
    {
        zztv.d = i;
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
        zzl.c(a).zza(zzl.b(a), serviceconnection, s, g.g());
        c.add(serviceconnection);
    }

    public void a(String s)
    {
        e = zzl.c(a).zza(zzl.b(a), s, g.g(), b, 129);
        if (e)
        {
            d = 3;
            return;
        } else
        {
            zzl.c(a).zza(zzl.b(a), b);
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
        zzl.c(a).zzb(zzl.b(a), serviceconnection);
        c.remove(serviceconnection);
    }

    public void b(String s)
    {
        zzl.c(a).zza(zzl.b(a), b);
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

    public zza.zzTV(zzl zzl1, zza.zzTV zztv)
    {
        a = zzl1;
        super();
        g = zztv;
        d = 2;
    }
}
