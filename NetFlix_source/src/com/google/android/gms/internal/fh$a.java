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
//            fh

final class mState
{
    public class a
        implements ServiceConnection
    {

        final fh.a DE;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = fh.a(DE.DD);
            hashmap;
            JVM INSTR monitorenter ;
            fh.a.a(DE, ibinder);
            fh.a.a(DE, componentname);
            for (Iterator iterator = fh.a.a(DE).iterator(); iterator.hasNext(); ((ff.f)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            fh.a.a(DE, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = fh.a(DE.DD);
            hashmap;
            JVM INSTR monitorenter ;
            fh.a.a(DE, null);
            fh.a.a(DE, componentname);
            for (Iterator iterator = fh.a.a(DE).iterator(); iterator.hasNext(); ((ff.f)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_72;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            fh.a.a(DE, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public a()
        {
            DE = fh.a.this;
            super();
        }
    }


    private boolean DA;
    private IBinder DB;
    private ComponentName DC;
    final fh DD;
    private final String Dx;
    private final a Dy = new a();
    private final HashSet Dz = new HashSet();
    private int mState;

    static int a(a.DE de, int i)
    {
        de.mState = i;
        return i;
    }

    static ComponentName a(mState mstate, ComponentName componentname)
    {
        mstate.DC = componentname;
        return componentname;
    }

    static IBinder a(DC dc, IBinder ibinder)
    {
        dc.DB = ibinder;
        return ibinder;
    }

    static HashSet a(DB db)
    {
        return db.Dz;
    }

    public void a(Dz dz)
    {
        Dz.add(dz);
    }

    public void b(Dz dz)
    {
        Dz.remove(dz);
    }

    public boolean c(Dz dz)
    {
        return Dz.contains(dz);
    }

    public a eP()
    {
        return Dy;
    }

    public String eQ()
    {
        return Dx;
    }

    public boolean eR()
    {
        return Dz.isEmpty();
    }

    public IBinder getBinder()
    {
        return DB;
    }

    public ComponentName getComponentName()
    {
        return DC;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return DA;
    }

    public void y(boolean flag)
    {
        DA = flag;
    }

    public a.DE(fh fh1, String s)
    {
        DD = fh1;
        super();
        Dx = s;
        mState = 0;
    }
}
