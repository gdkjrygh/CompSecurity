// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.e;

// Referenced classes of package com.google.android.gms.internal:
//            bj, dx, ak, bi, 
//            br, dw, bq, bl, 
//            dv, bn, ah

public final class bm
    implements bn.a
{

    private final ah kX;
    private final bq ky;
    private final Object li = new Object();
    private final Context mContext;
    private final String nn;
    private final long no;
    private final bi np;
    private final ak nq;
    private final dx nr;
    private br ns;
    private int nt;

    public bm(Context context, String s, bq bq1, bj bj1, bi bi1, ah ah, ak ak1, 
            dx dx1)
    {
        nt = -2;
        mContext = context;
        nn = s;
        ky = bq1;
        long l;
        if (bj1.nd != -1L)
        {
            l = bj1.nd;
        } else
        {
            l = 10000L;
        }
        no = l;
        np = bi1;
        kX = ah;
        nq = ak1;
        nr = dx1;
    }

    static br a(bm bm1, br br1)
    {
        bm1.ns = br1;
        return br1;
    }

    static Object a(bm bm1)
    {
        return bm1.li;
    }

    private void a(long l, long l1, long l2, long l3)
    {
        do
        {
            if (nt != -2)
            {
                return;
            }
            b(l, l1, l2, l3);
        } while (true);
    }

    private void a(bl bl1)
    {
        if (nr.rs >= 0x3e8fa0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (nq.lT)
        {
            ns.a(e.h(mContext), kX, np.nb, bl1);
            return;
        }
        try
        {
            ns.a(e.h(mContext), nq, kX, np.nb, bl1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bl bl1)
        {
            dw.c("Could not request ad from mediation adapter.", bl1);
        }
        f(5);
        return;
        if (nq.lT)
        {
            ns.a(e.h(mContext), kX, np.nb, np.mW, bl1);
            return;
        }
        ns.a(e.h(mContext), nq, kX, np.nb, np.mW, bl1);
        return;
    }

    static void a(bm bm1, bl bl1)
    {
        bm1.a(bl1);
    }

    private br aJ()
    {
        dw.x((new StringBuilder()).append("Instantiating mediation adapter: ").append(nn).toString());
        br br1;
        try
        {
            br1 = ky.m(nn);
        }
        catch (RemoteException remoteexception)
        {
            dw.a((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(nn).toString(), remoteexception);
            return null;
        }
        return br1;
    }

    static int b(bm bm1)
    {
        return bm1.nt;
    }

    private void b(long l, long l1, long l2, long l3)
    {
        long l4 = SystemClock.elapsedRealtime();
        l = l1 - (l4 - l);
        l1 = l3 - (l4 - l2);
        if (l <= 0L || l1 <= 0L)
        {
            dw.x("Timed out waiting for adapter.");
            nt = 3;
            return;
        }
        try
        {
            li.wait(Math.min(l, l1));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            nt = -1;
        }
    }

    static br c(bm bm1)
    {
        return bm1.aJ();
    }

    static br d(bm bm1)
    {
        return bm1.ns;
    }

    public bn b(long l, long l1)
    {
        Object obj1;
        synchronized (li)
        {
            long l2 = SystemClock.elapsedRealtime();
            obj1 = new bl();
            dv.rp.post(new Runnable(((bl) (obj1))) {

                final bl nu;
                final bm nv;

                public void run()
                {
label0:
                    {
                        synchronized (bm.a(nv))
                        {
                            if (bm.b(nv) == -2)
                            {
                                break label0;
                            }
                        }
                        return;
                    }
                    bm.a(nv, bm.c(nv));
                    if (bm.d(nv) != null)
                    {
                        break MISSING_BLOCK_LABEL_66;
                    }
                    nv.f(4);
                    obj2;
                    JVM INSTR monitorexit ;
                    return;
                    exception1;
                    obj2;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    nu.a(nv);
                    bm.a(nv, nu);
                    obj2;
                    JVM INSTR monitorexit ;
                }

            
            {
                nv = bm.this;
                nu = bl1;
                super();
            }
            });
            a(l2, no, l, l1);
            obj1 = new bn(np, ns, nn, ((bl) (obj1)), nt);
        }
        return ((bn) (obj1));
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cancel()
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (ns != null)
        {
            ns.destroy();
        }
_L1:
        nt = -1;
        li.notify();
        return;
        Object obj1;
        obj1;
        dw.c("Could not destroy mediation adapter.", ((Throwable) (obj1)));
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public void f(int i)
    {
        synchronized (li)
        {
            nt = i;
            li.notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
