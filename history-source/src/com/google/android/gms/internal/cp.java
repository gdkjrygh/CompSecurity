// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            gr, cr, cq, cv, 
//            cu, fh, gq, cy, 
//            cz

public final class cp
{

    private final cy lA;
    private final Context mContext;
    private final Object mH = new Object();
    private final fh qh;
    private final cr qi;
    private boolean qj;
    private cu qk;

    public cp(Context context, fh fh1, cy cy, cr cr1)
    {
        qj = false;
        mContext = context;
        qh = fh1;
        lA = cy;
        qi = cr1;
    }

    public cv a(long l, long l1)
    {
        Iterator iterator;
        gr.S("Starting mediation.");
        iterator = qi.qu.iterator();
_L4:
        cq cq1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        cq1 = (cq)iterator.next();
        gr.U((new StringBuilder()).append("Trying mediation network: ").append(cq1.qo).toString());
        iterator1 = cq1.qp.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            cv cv1;
            synchronized (mH)
            {
                if (!qj)
                {
                    break label0;
                }
                cv1 = new cv(-1);
            }
            return cv1;
        }
        qk = new cu(mContext, s, lA, qi, cq1, qh.tL, qh.lS, qh.lO);
        obj;
        JVM INSTR monitorexit ;
        obj = qk.b(l, l1);
        if (((cv) (obj)).qO == 0)
        {
            gr.S("Adapter succeeded.");
            return ((cv) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((cv) (obj)).qQ != null)
        {
            gq.wR.post(new Runnable(((cv) (obj))) {

                final cv ql;
                final cp qm;

                public void run()
                {
                    try
                    {
                        ql.qQ.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gr.d("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                qm = cp.this;
                ql = cv1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new cv(1);
    }

    public void cancel()
    {
        synchronized (mH)
        {
            qj = true;
            if (qk != null)
            {
                qk.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
