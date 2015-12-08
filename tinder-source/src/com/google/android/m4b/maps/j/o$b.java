// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.m4b.maps.cz.b;
import com.google.android.m4b.maps.l.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.j:
//            o, f

final class c
{
    public final class a
        implements ServiceConnection
    {

        private o.b a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = o.a(a.h);
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
            java.util.HashMap hashmap = o.a(a.h);
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
            a = o.b.this;
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
    final o h;

    public final void a()
    {
        boolean flag1 = false;
        com.google.android.m4b.maps.j.o.c(h);
        Context context = com.google.android.m4b.maps.j.o.b(h);
        Intent intent = f.a();
        a a1 = a;
        ComponentName componentname = intent.getComponent();
        boolean flag;
        if (componentname == null || com.google.android.m4b.maps.j.f.c && "com.google.android.gms".equals(componentname.getPackageName()))
        {
            flag = false;
        } else
        {
            flag = com.google.android.m4b.maps.cz.b.a(context, componentname.getPackageName());
        }
        if (flag)
        {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            flag = flag1;
        } else
        {
            com.google.android.m4b.maps.l.c.a(a1);
            flag = context.bindService(intent, a1, 129);
        }
        d = flag;
        if (d)
        {
            c = 3;
            return;
        }
        try
        {
            com.google.android.m4b.maps.j.o.c(h);
            com.google.android.m4b.maps.l.c.a(com.google.android.m4b.maps.j.o.b(h), a);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            return;
        }
    }

    public final void a(ServiceConnection serviceconnection)
    {
        com.google.android.m4b.maps.j.o.c(h);
        com.google.android.m4b.maps.j.o.b(h);
        f.a();
        com.google.android.m4b.maps.l.c.a(serviceconnection);
        b.add(serviceconnection);
    }

    public final boolean b()
    {
        return b.isEmpty();
    }

    public final boolean b(ServiceConnection serviceconnection)
    {
        return b.contains(serviceconnection);
    }

    public a.a(o o1, a.a a1)
    {
        h = o1;
        super();
        f = a1;
        c = 2;
    }
}
