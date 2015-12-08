// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            kd

final class mState
{
    public final class a
        implements ServiceConnection
    {

        final kd.a Wq;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = kd.a(Wq.Wp);
            hashmap;
            JVM INSTR monitorenter ;
            kd.a.a(Wq, ibinder);
            kd.a.a(Wq, componentname);
            for (Iterator iterator = kd.a.a(Wq).iterator(); iterator.hasNext(); ((kb.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            kd.a.a(Wq, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = kd.a(Wq.Wp);
            hashmap;
            JVM INSTR monitorenter ;
            kd.a.a(Wq, null);
            kd.a.a(Wq, componentname);
            for (Iterator iterator = kd.a.a(Wq).iterator(); iterator.hasNext(); ((kb.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            kd.a.a(Wq, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            Wq = kd.a.this;
            super();
        }
    }


    private final String Wj;
    private final a Wk = new a();
    private final HashSet Wl = new HashSet();
    private boolean Wm;
    private IBinder Wn;
    private ComponentName Wo;
    final kd Wp;
    private int mState;

    static int a(a.Wq wq, int i)
    {
        wq.mState = i;
        return i;
    }

    static ComponentName a(mState mstate, ComponentName componentname)
    {
        mstate.Wo = componentname;
        return componentname;
    }

    static IBinder a(Wo wo, IBinder ibinder)
    {
        wo.Wn = ibinder;
        return ibinder;
    }

    static HashSet a(Wn wn)
    {
        return wn.Wl;
    }

    public final void a(Wl wl)
    {
        Wl.add(wl);
    }

    public final void b(Wl wl)
    {
        Wl.remove(wl);
    }

    public final boolean c(Wl wl)
    {
        return Wl.contains(wl);
    }

    public final IBinder getBinder()
    {
        return Wn;
    }

    public final ComponentName getComponentName()
    {
        return Wo;
    }

    public final int getState()
    {
        return mState;
    }

    public final void iT()
    {
        Intent intent = (new Intent(Wj)).setPackage("com.google.android.gms");
        Wm = kd.b(Wp).bindService(intent, Wk, 129);
        if (Wm)
        {
            mState = 3;
            return;
        } else
        {
            kd.b(Wp).unbindService(Wk);
            return;
        }
    }

    public final void iU()
    {
        kd.b(Wp).unbindService(Wk);
        Wm = false;
        mState = 2;
    }

    public final String iV()
    {
        return Wj;
    }

    public final boolean iW()
    {
        return Wl.isEmpty();
    }

    public final boolean isBound()
    {
        return Wm;
    }

    public a.Wq(kd kd1, String s)
    {
        Wp = kd1;
        super();
        Wj = s;
        mState = 2;
    }
}
