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
//            ga, gb, av

public class fz
{
    private static final class a
    {

        private long vV;
        private long vW;

        public long cZ()
        {
            return vW;
        }

        public void da()
        {
            vW = SystemClock.elapsedRealtime();
        }

        public void db()
        {
            vV = SystemClock.elapsedRealtime();
        }

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", vV);
            bundle.putLong("tclose", vW);
            return bundle;
        }

        public a()
        {
            vV = -1L;
            vW = -1L;
        }
    }


    private final Object mH;
    private boolean uQ;
    private final ga vL;
    private final LinkedList vM;
    private final String vN;
    private final String vO;
    private long vP;
    private long vQ;
    private long vR;
    private long vS;
    private long vT;
    private long vU;

    public fz(ga ga1, String s, String s1)
    {
        mH = new Object();
        vP = -1L;
        vQ = -1L;
        uQ = false;
        vR = -1L;
        vS = 0L;
        vT = -1L;
        vU = -1L;
        vL = ga1;
        vN = s;
        vO = s1;
        vM = new LinkedList();
    }

    public fz(String s, String s1)
    {
        this(ga.dc(), s, s1);
    }

    public void cW()
    {
        synchronized (mH)
        {
            if (vU != -1L && vQ == -1L)
            {
                vQ = SystemClock.elapsedRealtime();
                vL.a(this);
            }
            ga ga1 = vL;
            ga.dh().cW();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cX()
    {
        synchronized (mH)
        {
            if (vU != -1L)
            {
                Object obj1 = new a();
                ((a) (obj1)).db();
                vM.add(obj1);
                vS = vS + 1L;
                obj1 = vL;
                ga.dh().cX();
                vL.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cY()
    {
        synchronized (mH)
        {
            if (vU != -1L && !vM.isEmpty())
            {
                a a1 = (a)vM.getLast();
                if (a1.cZ() == -1L)
                {
                    a1.da();
                    vL.a(this);
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
        synchronized (mH)
        {
            vT = SystemClock.elapsedRealtime();
            ga ga1 = vL;
            ga.dh().b(av, vT);
        }
        return;
        av;
        obj;
        JVM INSTR monitorexit ;
        throw av;
    }

    public void j(long l)
    {
        synchronized (mH)
        {
            vU = l;
            if (vU != -1L)
            {
                vL.a(this);
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
        synchronized (mH)
        {
            if (vU != -1L)
            {
                vP = l;
                vL.a(this);
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", vN);
        ((Bundle) (obj1)).putString("slotid", vO);
        ((Bundle) (obj1)).putBoolean("ismediation", uQ);
        ((Bundle) (obj1)).putLong("treq", vT);
        ((Bundle) (obj1)).putLong("tresponse", vU);
        ((Bundle) (obj1)).putLong("timp", vQ);
        ((Bundle) (obj1)).putLong("tload", vR);
        ((Bundle) (obj1)).putLong("pcc", vS);
        ((Bundle) (obj1)).putLong("tfetch", vP);
        arraylist = new ArrayList();
        for (Iterator iterator = vM.iterator(); iterator.hasNext(); arraylist.add(((a)iterator.next()).toBundle())) { }
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

    public void v(boolean flag)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (vU == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        vR = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        vQ = vR;
        vL.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void w(boolean flag)
    {
        synchronized (mH)
        {
            if (vU != -1L)
            {
                uQ = flag;
                vL.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
