// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

public final class bss
    implements ServiceConnection
{

    private bsr a;

    public bss(bsr bsr1)
    {
        a = bsr1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = bsp.a(a.h);
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
        java.util.HashMap hashmap = bsp.a(a.h);
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
}
