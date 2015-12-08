// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            ge, gd, fw

public final class gf
    implements ServiceConnection
{

    final ge a;

    public gf(ge ge1)
    {
        a = ge1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = gd.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        ge.a(a, ibinder);
        ge.a(a, componentname);
        for (Iterator iterator = ge.a(a).iterator(); iterator.hasNext(); ((fw)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_76;
        componentname;
        throw componentname;
        ge.a(a, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = gd.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        ge.a(a, null);
        ge.a(a, componentname);
        for (Iterator iterator = ge.a(a).iterator(); iterator.hasNext(); ((fw)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_72;
        componentname;
        throw componentname;
        ge.a(a, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }
}
