// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.j:
//            o

public final class a
    implements ServiceConnection
{

    private a a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = o.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        a.a = ibinder;
        a.a = componentname;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_78;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        a.a = 1;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = o.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        a.a = null;
        a.a = componentname;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_74;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        a.a = 2;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public ( )
    {
        a = ;
        super();
    }
}
