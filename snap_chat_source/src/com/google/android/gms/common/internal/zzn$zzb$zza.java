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
//            zzn

public class zzQn
    implements ServiceConnection
{

    final zzQn zzQn;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = zzn.zza(zzQn.);
        hashmap;
        JVM INSTR monitorenter ;
        (zzQn, ibinder);
        zzQn(zzQn, componentname);
        for (Iterator iterator = zzQn(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_80;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        d(zzQn, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = zzn.zza(zzQn.);
        hashmap;
        JVM INSTR monitorenter ;
        (zzQn, null);
        zzQn(zzQn, componentname);
        for (Iterator iterator = zzQn(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_76;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        cted(zzQn, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public ( )
    {
        zzQn = ;
        super();
    }
}
