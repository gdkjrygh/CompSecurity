// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.zzlo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzn

final class mState
{
    public class zza
        implements ServiceConnection
    {

        final zzn.zzb zzQn;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = zzn.zza(zzQn.zzQm);
            hashmap;
            JVM INSTR monitorenter ;
            zzn.zzb.zza(zzQn, ibinder);
            zzn.zzb.zza(zzQn, componentname);
            for (Iterator iterator = zzn.zzb.zzb(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzn.zzb.zza(zzQn, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = zzn.zza(zzQn.zzQm);
            hashmap;
            JVM INSTR monitorenter ;
            zzn.zzb.zza(zzQn, null);
            zzn.zzb.zza(zzQn, componentname);
            for (Iterator iterator = zzn.zzb.zzb(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzn.zzb.zza(zzQn, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zza()
        {
            zzQn = zzn.zzb.this;
            super();
        }
    }


    private int mState;
    private IBinder zzPp;
    private ComponentName zzQh;
    private final zza zzQi = new zza();
    private final Set zzQj = new HashSet();
    private boolean zzQk;
    private final zza zzQl;
    final zzn zzQm;

    static int zza(zza.zzQn zzqn, int i)
    {
        zzqn.mState = i;
        return i;
    }

    static ComponentName zza(mState mstate, ComponentName componentname)
    {
        mstate.zzQh = componentname;
        return componentname;
    }

    static IBinder zza(zzQh zzqh, IBinder ibinder)
    {
        zzqh.zzPp = ibinder;
        return ibinder;
    }

    static zzPp zza(zzPp zzpp)
    {
        return zzpp.zzQl;
    }

    static Set zzb(zzQl zzql)
    {
        return zzql.zzQj;
    }

    public final IBinder getBinder()
    {
        return zzPp;
    }

    public final ComponentName getComponentName()
    {
        return zzQh;
    }

    public final int getState()
    {
        return mState;
    }

    public final boolean isBound()
    {
        return zzQk;
    }

    public final void zza(ServiceConnection serviceconnection, String s)
    {
        zzn.zzc(zzQm).zza(zzn.zzb(zzQm), serviceconnection, s, zzQl.zzjj());
        zzQj.add(serviceconnection);
    }

    public final boolean zza(ServiceConnection serviceconnection)
    {
        return zzQj.contains(serviceconnection);
    }

    public final void zzb(ServiceConnection serviceconnection, String s)
    {
        zzn.zzc(zzQm).zzb(zzn.zzb(zzQm), serviceconnection);
        zzQj.remove(serviceconnection);
    }

    public final void zzbh(String s)
    {
        zzQk = zzn.zzc(zzQm).zza(zzn.zzb(zzQm), s, zzQl.zzjj(), zzQi, 129);
        if (zzQk)
        {
            mState = 3;
            return;
        } else
        {
            zzn.zzc(zzQm).zza(zzn.zzb(zzQm), zzQi);
            return;
        }
    }

    public final void zzbi(String s)
    {
        zzn.zzc(zzQm).zza(zzn.zzb(zzQm), zzQi);
        zzQk = false;
        mState = 2;
    }

    public final boolean zzjk()
    {
        return zzQj.isEmpty();
    }

    public zza.zzQn(zzn zzn1, zza.zzQn zzqn)
    {
        zzQm = zzn1;
        super();
        zzQl = zzqn;
        mState = 2;
    }
}
