// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            gb, gc, av

public class ga
{
    private static final class a
    {

        private long vH;
        private long vI;

        public long cR()
        {
            return vI;
        }

        public void cS()
        {
            vI = SystemClock.elapsedRealtime();
        }

        public void cT()
        {
            vH = SystemClock.elapsedRealtime();
        }

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", vH);
            bundle.putLong("tclose", vI);
            return bundle;
        }

        public a()
        {
            vH = -1L;
            vI = -1L;
        }
    }


    private final Object mw;
    private boolean uC;
    private final String vA;
    private long vB;
    private long vC;
    private long vD;
    private long vE;
    private long vF;
    private long vG;
    private final gb vx;
    private final LinkedList vy;
    private final String vz;

    public ga(gb gb1, String s, String s1)
    {
        mw = new Object();
        vB = -1L;
        vC = -1L;
        uC = false;
        vD = -1L;
        vE = 0L;
        vF = -1L;
        vG = -1L;
        vx = gb1;
        vz = s;
        vA = s1;
        vy = new LinkedList();
    }

    public ga(String s, String s1)
    {
        this(gb.cU(), s, s1);
    }

    public void cO()
    {
        synchronized (mw)
        {
            if (vG != -1L && vC == -1L)
            {
                vC = SystemClock.elapsedRealtime();
                vx.a(this);
            }
            gb gb1 = vx;
            gb.cY().cO();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cP()
    {
        synchronized (mw)
        {
            if (vG != -1L)
            {
                Object obj1 = new a();
                ((a) (obj1)).cT();
                vy.add(obj1);
                vE = vE + 1L;
                obj1 = vx;
                gb.cY().cP();
                vx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cQ()
    {
        synchronized (mw)
        {
            if (vG != -1L && !vy.isEmpty())
            {
                a a1 = (a)vy.getLast();
                if (a1.cR() == -1L)
                {
                    a1.cS();
                    vx.a(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e(av av)
    {
        synchronized (mw)
        {
            vF = SystemClock.elapsedRealtime();
            gb gb1 = vx;
            gb.cY().b(av, vF);
        }
        return;
        av;
        obj;
        JVM INSTR monitorexit ;
        throw av;
    }

    public void j(long l)
    {
        synchronized (mw)
        {
            vG = l;
            if (vG != -1L)
            {
                vx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void k(long l)
    {
        synchronized (mw)
        {
            if (vG != -1L)
            {
                vB = l;
                vx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void t(boolean flag)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (vG == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        vD = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        vC = vD;
        vx.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle toBundle()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", vz);
        ((Bundle) (obj1)).putString("slotid", vA);
        ((Bundle) (obj1)).putBoolean("ismediation", uC);
        ((Bundle) (obj1)).putLong("treq", vF);
        ((Bundle) (obj1)).putLong("tresponse", vG);
        ((Bundle) (obj1)).putLong("timp", vC);
        ((Bundle) (obj1)).putLong("tload", vD);
        ((Bundle) (obj1)).putLong("pcc", vE);
        ((Bundle) (obj1)).putLong("tfetch", vB);
        arraylist = new ArrayList();
        for (Iterator iterator = vy.iterator(); iterator.hasNext(); arraylist.add(((a)iterator.next()).toBundle())) { }
        break MISSING_BLOCK_LABEL_158;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((Bundle) (obj1)).putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj1));
    }

    public void u(boolean flag)
    {
        synchronized (mw)
        {
            if (vG != -1L)
            {
                uC = flag;
                vx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
