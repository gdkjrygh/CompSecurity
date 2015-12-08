// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            ap, an

public final class aq
    implements ServiceConnection
{

    final ap a;

    public aq(ap ap1)
    {
        a = ap1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = an.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        ap.a(a, ibinder);
        ap.a(a, componentname);
        for (Iterator iterator = ap.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_80;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        ap.a(a, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = an.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        ap.a(a, null);
        ap.a(a, componentname);
        for (Iterator iterator = ap.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_76;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        ap.a(a, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }
}
