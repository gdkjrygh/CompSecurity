// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            m

private final class c
{
    public final class a
        implements ServiceConnection
    {

        final m.b a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = m.a(a.h);
            hashmap;
            JVM INSTR monitorenter ;
            a.e = ibinder;
            a.g = componentname;
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_78;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.c = 1;
            hashmap;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = m.a(a.h);
            hashmap;
            JVM INSTR monitorenter ;
            a.e = null;
            a.g = componentname;
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_74;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.c = 2;
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            a = m.b.this;
            super();
        }
    }


    final a a = new a();
    final Set b = new HashSet();
    int c;
    boolean d;
    IBinder e;
    final a f;
    ComponentName g;
    final m h;

    public final void a(ServiceConnection serviceconnection, String s)
    {
        b b1 = m.c(h);
        android.content.Context context = com.google.android.gms.common.internal.m.b(h);
        android.content.Intent intent = f.a();
        b1.a(context, com.google.android.gms.common.stats.b.a(serviceconnection), s, intent, 3);
        b.add(serviceconnection);
    }

    public final void a(String s)
    {
        c = 3;
        d = m.c(h).a(com.google.android.gms.common.internal.m.b(h), s, f.a(), a, 129);
        if (d)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        c = 2;
        m.c(h).a(com.google.android.gms.common.internal.m.b(h), a);
        return;
        s;
    }

    public final boolean a()
    {
        return b.isEmpty();
    }

    public final boolean a(ServiceConnection serviceconnection)
    {
        return b.contains(serviceconnection);
    }

    public a.a(m m1, a.a a1)
    {
        h = m1;
        super();
        f = a1;
        c = 2;
    }
}
