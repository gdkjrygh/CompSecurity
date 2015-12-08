// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.internal:
//            g

final class mState
{
    public class a
        implements ServiceConnection
    {

        final g.a Mc;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = g.a(Mc.Mb);
            hashmap;
            JVM INSTR monitorenter ;
            g.a.a(Mc, ibinder);
            g.a.a(Mc, componentname);
            for (Iterator iterator = g.a.a(Mc).iterator(); iterator.hasNext(); ((e.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            g.a.a(Mc, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = g.a(Mc.Mb);
            hashmap;
            JVM INSTR monitorenter ;
            g.a.a(Mc, null);
            g.a.a(Mc, componentname);
            for (Iterator iterator = g.a.a(Mc).iterator(); iterator.hasNext(); ((e.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            g.a.a(Mc, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            Mc = g.a.this;
            super();
        }
    }


    private final String LV;
    private final a LW = new a();
    private final HashSet LX = new HashSet();
    private boolean LY;
    private IBinder LZ;
    private ComponentName Ma;
    final g Mb;
    private int mState;

    static int a(a.Mc mc, int i)
    {
        mc.mState = i;
        return i;
    }

    static ComponentName a(mState mstate, ComponentName componentname)
    {
        mstate.Ma = componentname;
        return componentname;
    }

    static IBinder a(Ma ma, IBinder ibinder)
    {
        ma.LZ = ibinder;
        return ibinder;
    }

    static HashSet a(LZ lz)
    {
        return lz.LX;
    }

    public void J(boolean flag)
    {
        LY = flag;
    }

    public void a(LY ly)
    {
        LX.add(ly);
    }

    public void b(LX lx)
    {
        LX.remove(lx);
    }

    public boolean c(LX lx)
    {
        return LX.contains(lx);
    }

    public a gW()
    {
        return LW;
    }

    public String gX()
    {
        return LV;
    }

    public boolean gY()
    {
        return LX.isEmpty();
    }

    public IBinder getBinder()
    {
        return LZ;
    }

    public ComponentName getComponentName()
    {
        return Ma;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return LY;
    }

    public a.Mc(g g1, String s)
    {
        Mb = g1;
        super();
        LV = s;
        mState = 0;
    }
}
