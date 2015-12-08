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
//            df

final class mState
{
    public class a
        implements ServiceConnection
    {

        final df.a lf;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = df.a(lf.le);
            hashmap;
            JVM INSTR monitorenter ;
            df.a.a(lf, ibinder);
            df.a.a(lf, componentname);
            for (Iterator iterator = df.a.a(lf).iterator(); iterator.hasNext(); ((de.e)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            df.a.a(lf, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = df.a(lf.le);
            hashmap;
            JVM INSTR monitorenter ;
            df.a.a(lf, null);
            df.a.a(lf, componentname);
            for (Iterator iterator = df.a.a(lf).iterator(); iterator.hasNext(); ((de.e)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            df.a.a(lf, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            lf = df.a.this;
            super();
        }
    }


    private final String kY;
    private final a kZ = new a();
    private final HashSet la = new HashSet();
    private boolean lb;
    private IBinder lc;
    private ComponentName ld;
    final df le;
    private int mState;

    static int a(a.lf lf, int i)
    {
        lf.mState = i;
        return i;
    }

    static ComponentName a(mState mstate, ComponentName componentname)
    {
        mstate.ld = componentname;
        return componentname;
    }

    static IBinder a(ld ld1, IBinder ibinder)
    {
        ld1.lc = ibinder;
        return ibinder;
    }

    static HashSet a(lc lc1)
    {
        return lc1.la;
    }

    public void a(la la1)
    {
        la.add(la1);
    }

    public void b(la la1)
    {
        la.remove(la1);
    }

    public a bg()
    {
        return kZ;
    }

    public String bh()
    {
        return kY;
    }

    public boolean bi()
    {
        return la.isEmpty();
    }

    public boolean c(la la1)
    {
        return la.contains(la1);
    }

    public IBinder getBinder()
    {
        return lc;
    }

    public ComponentName getComponentName()
    {
        return ld;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return lb;
    }

    public void l(boolean flag)
    {
        lb = flag;
    }

    public a.lf(df df1, String s)
    {
        le = df1;
        super();
        kY = s;
        mState = 0;
    }
}
