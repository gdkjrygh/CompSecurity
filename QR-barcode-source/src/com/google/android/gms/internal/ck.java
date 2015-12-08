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
//            gs, cm, cl, cq, 
//            cp, fi, gr, ct, 
//            cu

public final class ck
{

    private final ct lq;
    private final Context mContext;
    private final Object mw = new Object();
    private final fi pQ;
    private final cm pR;
    private boolean pS;
    private cp pT;

    public ck(Context context, fi fi1, ct ct, cm cm1)
    {
        pS = false;
        mContext = context;
        pQ = fi1;
        lq = ct;
        pR = cm1;
    }

    public cq a(long l, long l1)
    {
        Iterator iterator;
        gs.S("Starting mediation.");
        iterator = pR.qd.iterator();
_L4:
        cl cl1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        cl1 = (cl)iterator.next();
        gs.U((new StringBuilder()).append("Trying mediation network: ").append(cl1.pX).toString());
        iterator1 = cl1.pY.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            cq cq1;
            synchronized (mw)
            {
                if (!pS)
                {
                    break label0;
                }
                cq1 = new cq(-1);
            }
            return cq1;
        }
        pT = new cp(mContext, s, lq, pR, cl1, pQ.tx, pQ.lH, pQ.lD);
        obj;
        JVM INSTR monitorexit ;
        obj = pT.b(l, l1);
        if (((cq) (obj)).qx == 0)
        {
            gs.S("Adapter succeeded.");
            return ((cq) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((cq) (obj)).qz != null)
        {
            gr.wC.post(new Runnable(((cq) (obj))) {

                final cq pU;
                final ck pV;

                public void run()
                {
                    try
                    {
                        pU.qz.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        gs.d("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                pV = ck.this;
                pU = cq1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new cq(1);
    }

    public void cancel()
    {
        synchronized (mw)
        {
            pS = true;
            if (pT != null)
            {
                pT.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
