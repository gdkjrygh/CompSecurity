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
//            dj, dk, ah

public class di
{
    private static final class a
    {

        private long qH;
        private long qI;

        public long bn()
        {
            return qI;
        }

        public void bo()
        {
            qI = SystemClock.elapsedRealtime();
        }

        public void bp()
        {
            qH = SystemClock.elapsedRealtime();
        }

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", qH);
            bundle.putLong("tclose", qI);
            return bundle;
        }

        public a()
        {
            qH = -1L;
            qI = -1L;
        }
    }


    private final Object li;
    private boolean pV;
    private final String qA;
    private long qB;
    private long qC;
    private long qD;
    private long qE;
    private long qF;
    private long qG;
    private final dj qx;
    private final LinkedList qy;
    private final String qz;

    public di(dj dj1, String s, String s1)
    {
        li = new Object();
        qB = -1L;
        qC = -1L;
        pV = false;
        qD = -1L;
        qE = 0L;
        qF = -1L;
        qG = -1L;
        qx = dj1;
        qz = s;
        qA = s1;
        qy = new LinkedList();
    }

    public di(String s, String s1)
    {
        this(dj.bq(), s, s1);
    }

    public void bk()
    {
        synchronized (li)
        {
            if (qG != -1L && qC == -1L)
            {
                qC = SystemClock.elapsedRealtime();
                qx.a(this);
            }
            dj dj1 = qx;
            dj.bu().bk();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bl()
    {
        synchronized (li)
        {
            if (qG != -1L)
            {
                Object obj1 = new a();
                ((a) (obj1)).bp();
                qy.add(obj1);
                qE = qE + 1L;
                obj1 = qx;
                dj.bu().bl();
                qx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bm()
    {
        synchronized (li)
        {
            if (qG != -1L && !qy.isEmpty())
            {
                a a1 = (a)qy.getLast();
                if (a1.bn() == -1L)
                {
                    a1.bo();
                    qx.a(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(ah ah)
    {
        synchronized (li)
        {
            qF = SystemClock.elapsedRealtime();
            dj dj1 = qx;
            dj.bu().b(ah, qF);
        }
        return;
        ah;
        obj;
        JVM INSTR monitorexit ;
        throw ah;
    }

    public void h(long l)
    {
        synchronized (li)
        {
            qG = l;
            if (qG != -1L)
            {
                qx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void i(long l)
    {
        synchronized (li)
        {
            if (qG != -1L)
            {
                qB = l;
                qx.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void m(boolean flag)
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (qG == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        qD = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        qC = qD;
        qx.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void n(boolean flag)
    {
        synchronized (li)
        {
            if (qG != -1L)
            {
                pV = flag;
                qx.a(this);
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
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seqnum", qz);
        ((Bundle) (obj1)).putString("slotid", qA);
        ((Bundle) (obj1)).putBoolean("ismediation", pV);
        ((Bundle) (obj1)).putLong("treq", qF);
        ((Bundle) (obj1)).putLong("tresponse", qG);
        ((Bundle) (obj1)).putLong("timp", qC);
        ((Bundle) (obj1)).putLong("tload", qD);
        ((Bundle) (obj1)).putLong("pcc", qE);
        ((Bundle) (obj1)).putLong("tfetch", qB);
        arraylist = new ArrayList();
        for (Iterator iterator = qy.iterator(); iterator.hasNext(); arraylist.add(((a)iterator.next()).toBundle())) { }
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
