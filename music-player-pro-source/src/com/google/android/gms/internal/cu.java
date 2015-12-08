// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            cr, gs, ay, cq, 
//            cz, gr, cy, ct, 
//            gq, cv, av

public final class cu
    implements cv.a
{

    private final cy lA;
    private final Context mContext;
    private final Object mH = new Object();
    private final av mw;
    private final String qF;
    private final long qG;
    private final cq qH;
    private final ay qI;
    private final gs qJ;
    private cz qK;
    private int qL;

    public cu(Context context, String s, cy cy1, cr cr1, cq cq1, av av, ay ay1, 
            gs gs1)
    {
        qL = -2;
        mContext = context;
        lA = cy1;
        qH = cq1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            qF = bO();
        } else
        {
            qF = s;
        }
        if (cr1.qv != -1L)
        {
            l = cr1.qv;
        } else
        {
            l = 10000L;
        }
        qG = l;
        mw = av;
        qI = ay1;
        qJ = gs1;
    }

    static cz a(cu cu1, cz cz1)
    {
        cu1.qK = cz1;
        return cz1;
    }

    static Object a(cu cu1)
    {
        return cu1.mH;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (qL != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(ct ct1)
    {
        if (qJ.wU >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (qI.oq)
        {
            qK.a(e.k(mContext), mw, qH.qt, ct1);
            return;
        }
        try
        {
            qK.a(e.k(mContext), qI, mw, qH.qt, ct1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ct ct1)
        {
            gr.d("Could not request ad from mediation adapter.", ct1);
        }
        k(5);
        return;
        if (qI.oq)
        {
            qK.a(e.k(mContext), mw, qH.qt, qH.qn, ct1);
            return;
        }
        qK.a(e.k(mContext), qI, mw, qH.qt, qH.qn, ct1);
        return;
    }

    static void a(cu cu1, ct ct1)
    {
        cu1.a(ct1);
    }

    static int b(cu cu1)
    {
        return cu1.qL;
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            gr.U("Timed out waiting for adapter.");
            qL = 3;
            return;
        }
        try
        {
            mH.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            qL = -1;
        }
    }

    private String bO()
    {
        if (!TextUtils.isEmpty(qH.qr))
        {
            if (lA.y(qH.qr))
            {
                return "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
            } else
            {
                return "com.google.ads.mediation.customevent.CustomEventAdapter";
            }
        }
        break MISSING_BLOCK_LABEL_44;
        RemoteException remoteexception;
        remoteexception;
        gr.W("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private cz bP()
    {
        gr.U((new StringBuilder()).append("Instantiating mediation adapter: ").append(qF).toString());
        cz cz1;
        try
        {
            cz1 = lA.x(qF);
        }
        catch (RemoteException remoteexception)
        {
            gr.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(qF).toString(), remoteexception);
            return null;
        }
        return cz1;
    }

    static cz c(cu cu1)
    {
        return cu1.bP();
    }

    static cz d(cu cu1)
    {
        return cu1.qK;
    }

    public cv b(long l, long l1)
    {
        Object obj1;
        synchronized (mH)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new ct();
            gq.wR.post(new Runnable(((ct) (obj1))) {

                final ct qM;
                final cu qN;

                public void run()
                {
label0:
                    {
                        synchronized (cu.a(qN))
                        {
                            if (cu.b(qN) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    cu.a(qN, cu.c(qN));
                    if (cu.d(qN) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    qN.k(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    qM.a(qN);
                    cu.a(qN, qM);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                qN = cu.this;
                qM = ct1;
                super();
            }
            });
            a(l2, qG, l, l1);
            obj1 = new cv(qH, qK, qF, ((ct) (obj1)), qL);
        }
        return ((cv) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancel()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (qK != null)
        {
            qK.destroy();
        }
_L1:
        qL = -1;
        mH.notify();
        return;
        Object obj1;
        obj1;
        gr.d("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void k(int i)
    {
        synchronized (mH)
        {
            qL = i;
            mH.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
