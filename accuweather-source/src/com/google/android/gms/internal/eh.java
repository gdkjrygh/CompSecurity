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
//            ei, ej, aj

public class eh
{
    private static final class a
    {

        private long rK;
        private long rL;

        public void bA()
        {
            rL = SystemClock.elapsedRealtime();
        }

        public void bB()
        {
            rK = SystemClock.elapsedRealtime();
        }

        public long bz()
        {
            return rL;
        }

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", rK);
            bundle.putLong("tclose", rL);
            return bundle;
        }

        public a()
        {
            rK = -1L;
            rL = -1L;
        }
    }


    private final Object lq;
    private boolean qL;
    private final ei rA;
    private final LinkedList rB;
    private final String rC;
    private final String rD;
    private long rE;
    private long rF;
    private long rG;
    private long rH;
    private long rI;
    private long rJ;

    public eh(ei ei1, String s, String s1)
    {
        lq = new Object();
        rE = -1L;
        rF = -1L;
        qL = false;
        rG = -1L;
        rH = 0L;
        rI = -1L;
        rJ = -1L;
        rA = ei1;
        rC = s;
        rD = s1;
        rB = new LinkedList();
    }

    public eh(String s, String s1)
    {
        this(ei.bC(), s, s1);
    }

    public void bw()
    {
        synchronized (lq)
        {
            if (rJ != -1L && rF == -1L)
            {
                rF = SystemClock.elapsedRealtime();
                rA.a(this);
            }
            ei ei1 = rA;
            ei.bF().bw();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bx()
    {
        synchronized (lq)
        {
            if (rJ != -1L)
            {
                Object obj1 = new a();
                ((a) (obj1)).bB();
                rB.add(obj1);
                rH = rH + 1L;
                obj1 = rA;
                ei.bF().bx();
                rA.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void by()
    {
        synchronized (lq)
        {
            if (rJ != -1L && !rB.isEmpty())
            {
                a a1 = (a)rB.getLast();
                if (a1.bz() == -1L)
                {
                    a1.bA();
                    rA.a(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(aj aj)
    {
        synchronized (lq)
        {
            rI = SystemClock.elapsedRealtime();
            ei ei1 = rA;
            ei.bF().b(aj, rI);
        }
        return;
        aj;
        obj;
        JVM INSTR monitorexit ;
        throw aj;
    }

    public void j(long l)
    {
        synchronized (lq)
        {
            rJ = l;
            if (rJ != -1L)
            {
                rA.a(this);
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
        synchronized (lq)
        {
            if (rJ != -1L)
            {
                rE = l;
                rA.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void n(boolean flag)
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        if (rJ == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        rG = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        rF = rG;
        rA.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void o(boolean flag)
    {
        synchronized (lq)
        {
            if (rJ != -1L)
            {
                qL = flag;
                rA.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle toBundle()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seqnum", rC);
        ((Bundle) (obj1)).putString("slotid", rD);
        ((Bundle) (obj1)).putBoolean("ismediation", qL);
        ((Bundle) (obj1)).putLong("treq", rI);
        ((Bundle) (obj1)).putLong("tresponse", rJ);
        ((Bundle) (obj1)).putLong("timp", rF);
        ((Bundle) (obj1)).putLong("tload", rG);
        ((Bundle) (obj1)).putLong("pcc", rH);
        ((Bundle) (obj1)).putLong("tfetch", rE);
        arraylist = new ArrayList();
        for (Iterator iterator = rB.iterator(); iterator.hasNext(); arraylist.add(((a)iterator.next()).toBundle())) { }
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
}
