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
//            cm, gt, ay, cl, 
//            cu, gs, ct, co, 
//            gr, cq, av

public final class cp
    implements cq.a
{

    private final ct lq;
    private final Context mContext;
    private final av ml;
    private final Object mw = new Object();
    private final String qo;
    private final long qp;
    private final cl qq;
    private final ay qr;
    private final gt qs;
    private cu qt;
    private int qu;

    public cp(Context context, String s, ct ct1, cm cm1, cl cl1, av av, ay ay1, 
            gt gt1)
    {
        qu = -2;
        mContext = context;
        lq = ct1;
        qq = cl1;
        long l;
        if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(s))
        {
            qo = bE();
        } else
        {
            qo = s;
        }
        if (cm1.qe != -1L)
        {
            l = cm1.qe;
        } else
        {
            l = 10000L;
        }
        qp = l;
        ml = av;
        qr = ay1;
        qs = gt1;
    }

    static cu a(cp cp1, cu cu1)
    {
        cp1.qt = cu1;
        return cu1;
    }

    static Object a(cp cp1)
    {
        return cp1.mw;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (qu != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(co co1)
    {
        if (qs.wF >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (qr.og)
        {
            qt.a(e.k(mContext), ml, qq.qc, co1);
            return;
        }
        try
        {
            qt.a(e.k(mContext), qr, ml, qq.qc, co1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (co co1)
        {
            gs.d("Could not request ad from mediation adapter.", co1);
        }
        j(5);
        return;
        if (qr.og)
        {
            qt.a(e.k(mContext), ml, qq.qc, qq.pW, co1);
            return;
        }
        qt.a(e.k(mContext), qr, ml, qq.qc, qq.pW, co1);
        return;
    }

    static void a(cp cp1, co co1)
    {
        cp1.a(co1);
    }

    static int b(cp cp1)
    {
        return cp1.qu;
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            gs.U("Timed out waiting for adapter.");
            qu = 3;
            return;
        }
        try
        {
            mw.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            qu = -1;
        }
    }

    private String bE()
    {
        if (!TextUtils.isEmpty(qq.qa))
        {
            if (lq.y(qq.qa))
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
        gs.W("Fail to determine the custom event's version, assuming the old one.");
        return "com.google.ads.mediation.customevent.CustomEventAdapter";
    }

    private cu bF()
    {
        gs.U((new StringBuilder()).append("Instantiating mediation adapter: ").append(qo).toString());
        cu cu1;
        try
        {
            cu1 = lq.x(qo);
        }
        catch (RemoteException remoteexception)
        {
            gs.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(qo).toString(), remoteexception);
            return null;
        }
        return cu1;
    }

    static cu c(cp cp1)
    {
        return cp1.bF();
    }

    static cu d(cp cp1)
    {
        return cp1.qt;
    }

    public cq b(long l, long l1)
    {
        Object obj1;
        synchronized (mw)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new co();
            gr.wC.post(new Runnable(((co) (obj1))) {

                final co qv;
                final cp qw;

                public void run()
                {
label0:
                    {
                        synchronized (cp.a(qw))
                        {
                            if (cp.b(qw) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    cp.a(qw, cp.c(qw));
                    if (cp.d(qw) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    qw.j(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    qv.a(qw);
                    cp.a(qw, qv);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                qw = cp.this;
                qv = co1;
                super();
            }
            });
            a(l2, qp, l, l1);
            obj1 = new cq(qq, qt, qo, ((co) (obj1)), qu);
        }
        return ((cq) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancel()
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (qt != null)
        {
            qt.destroy();
        }
_L1:
        qu = -1;
        mw.notify();
        return;
        Object obj1;
        obj1;
        gs.d("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void j(int i)
    {
        synchronized (mw)
        {
            qu = i;
            mw.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
