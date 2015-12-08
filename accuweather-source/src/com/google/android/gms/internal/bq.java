// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            bn, ew, am, bm, 
//            bv, ev, bu, bp, 
//            eu, br, aj

public final class bq
    implements br.a
{

    private final bu kz;
    private final aj lf;
    private final Object lq = new Object();
    private final Context mContext;
    private final String nA;
    private final long nB;
    private final bm nC;
    private final am nD;
    private final ew nE;
    private bv nF;
    private int nG;

    public bq(Context context, String s, bu bu1, bn bn1, bm bm1, aj aj, am am1, 
            ew ew1)
    {
        nG = -2;
        mContext = context;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            nA = b(bm1);
        } else
        {
            nA = s;
        }
        kz = bu1;
        if (bn1.nq != -1L)
        {
            l = bn1.nq;
        } else
        {
            l = 10000L;
        }
        nB = l;
        nC = bm1;
        lf = aj;
        nD = am1;
        nE = ew1;
    }

    static bv a(bq bq1, bv bv1)
    {
        bq1.nF = bv1;
        return bv1;
    }

    static Object a(bq bq1)
    {
        return bq1.lq;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (nG != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(bp bp1)
    {
        if (nE.sv >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (nD.md)
        {
            nF.a(e.h(mContext), lf, nC.no, bp1);
            return;
        }
        try
        {
            nF.a(e.h(mContext), nD, lf, nC.no, bp1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bp bp1)
        {
            ev.c("Could not request ad from mediation adapter.", bp1);
        }
        g(5);
        return;
        if (nD.md)
        {
            nF.a(e.h(mContext), lf, nC.no, nC.ni, bp1);
            return;
        }
        nF.a(e.h(mContext), nD, lf, nC.no, nC.ni, bp1);
        return;
    }

    static void a(bq bq1, bp bp1)
    {
        bq1.a(bp1);
    }

    private bv aK()
    {
        ev.B((new StringBuilder()).append("Instantiating mediation adapter: ").append(nA).toString());
        bv bv1;
        try
        {
            bv1 = kz.m(nA);
        }
        catch (RemoteException remoteexception)
        {
            ev.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(nA).toString(), remoteexception);
            return null;
        }
        return bv1;
    }

    static int b(bq bq1)
    {
        return bq1.nG;
    }

    private String b(bm bm1)
    {
        if (!TextUtils.isEmpty(bm1.nm) && com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(bm1.nm, false, com/google/android/gms/internal/bq.getClassLoader())))
        {
            return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        break MISSING_BLOCK_LABEL_40;
        bm1;
        ev.D("Could not create custom event adapter.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            ev.B("Timed out waiting for adapter.");
            nG = 3;
            return;
        }
        try
        {
            lq.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            nG = -1;
        }
    }

    static bv c(bq bq1)
    {
        return bq1.aK();
    }

    static bv d(bq bq1)
    {
        return bq1.nF;
    }

    public br b(long l, long l1)
    {
        Object obj1;
        synchronized (lq)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new bp();
            eu.ss.post(new Runnable(((bp) (obj1))) {

                final bp nH;
                final bq nI;

                public void run()
                {
label0:
                    {
                        synchronized (bq.a(nI))
                        {
                            if (bq.b(nI) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    bq.a(nI, bq.c(nI));
                    if (bq.d(nI) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    nI.g(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    nH.a(nI);
                    bq.a(nI, nH);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                nI = bq.this;
                nH = bp1;
                super();
            }
            });
            a(l2, nB, l, l1);
            obj1 = new br(nC, nF, nA, ((bp) (obj1)), nG);
        }
        return ((br) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancel()
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        if (nF != null)
        {
            nF.destroy();
        }
_L1:
        nG = -1;
        lq.notify();
        return;
        Object obj1;
        obj1;
        ev.c("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void g(int i)
    {
        synchronized (lq)
        {
            nG = i;
            lq.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
