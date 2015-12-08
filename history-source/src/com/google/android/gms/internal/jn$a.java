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
//            jn

final class mState
{
    public class a
        implements ServiceConnection
    {

        final jn.a Nn;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = jn.a(Nn.Nm);
            hashmap;
            JVM INSTR monitorenter ;
            jn.a.a(Nn, ibinder);
            jn.a.a(Nn, componentname);
            for (Iterator iterator = jn.a.a(Nn).iterator(); iterator.hasNext(); ((jl.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            jn.a.a(Nn, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = jn.a(Nn.Nm);
            hashmap;
            JVM INSTR monitorenter ;
            jn.a.a(Nn, null);
            jn.a.a(Nn, componentname);
            for (Iterator iterator = jn.a.a(Nn).iterator(); iterator.hasNext(); ((jl.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            jn.a.a(Nn, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            Nn = jn.a.this;
            super();
        }
    }


    private final String Ng;
    private final a Nh = new a();
    private final HashSet Ni = new HashSet();
    private boolean Nj;
    private IBinder Nk;
    private ComponentName Nl;
    final jn Nm;
    private int mState;

    static int a(a.Nn nn, int i)
    {
        nn.mState = i;
        return i;
    }

    static ComponentName a(mState mstate, ComponentName componentname)
    {
        mstate.Nl = componentname;
        return componentname;
    }

    static IBinder a(Nl nl, IBinder ibinder)
    {
        nl.Nk = ibinder;
        return ibinder;
    }

    static HashSet a(Nk nk)
    {
        return nk.Ni;
    }

    public void a(Ni ni)
    {
        Ni.add(ni);
    }

    public void b(Ni ni)
    {
        Ni.remove(ni);
    }

    public boolean c(Ni ni)
    {
        return Ni.contains(ni);
    }

    public IBinder getBinder()
    {
        return Nk;
    }

    public ComponentName getComponentName()
    {
        return Nl;
    }

    public int getState()
    {
        return mState;
    }

    public void hA()
    {
        Intent intent = (new Intent(Ng)).setPackage("com.google.android.gms");
        Nj = jn.b(Nm).bindService(intent, Nh, 129);
        if (Nj)
        {
            mState = 3;
            return;
        } else
        {
            jn.b(Nm).unbindService(Nh);
            return;
        }
    }

    public void hB()
    {
        jn.b(Nm).unbindService(Nh);
        Nj = false;
        mState = 2;
    }

    public String hC()
    {
        return Ng;
    }

    public boolean hD()
    {
        return Ni.isEmpty();
    }

    public boolean isBound()
    {
        return Nj;
    }

    public a.Nn(jn jn1, String s)
    {
        Nm = jn1;
        super();
        Ng = s;
        mState = 2;
    }
}
