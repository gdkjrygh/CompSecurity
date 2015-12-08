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
//            dw, bj, bi, bn, 
//            bm, cx, dv, bq, 
//            br

public final class bh
{

    private final bq ky;
    private final Object li = new Object();
    private final Context mContext;
    private final cx mQ;
    private final bj mR;
    private boolean mS;
    private bm mT;

    public bh(Context context, cx cx1, bq bq, bj bj1)
    {
        mS = false;
        mContext = context;
        mQ = cx1;
        ky = bq;
        mR = bj1;
    }

    public bn a(long l, long l1)
    {
        Iterator iterator;
        dw.v("Starting mediation.");
        iterator = mR.nc.iterator();
_L4:
        bi bi1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        bi1 = (bi)iterator.next();
        dw.x((new StringBuilder()).append("Trying mediation network: ").append(bi1.mX).toString());
        iterator1 = bi1.mY.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            bn bn1;
            synchronized (li)
            {
                if (!mS)
                {
                    break label0;
                }
                bn1 = new bn(-1);
            }
            return bn1;
        }
        mT = new bm(mContext, s, ky, mR, bi1, mQ.pg, mQ.kN, mQ.kK);
        obj;
        JVM INSTR monitorexit ;
        obj = mT.b(l, l1);
        if (((bn) (obj)).nw == 0)
        {
            dw.v("Adapter succeeded.");
            return ((bn) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((bn) (obj)).ny != null)
        {
            dv.rp.post(new Runnable(((bn) (obj))) {

                final bn mU;
                final bh mV;

                public void run()
                {
                    try
                    {
                        mU.ny.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        dw.c("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                mV = bh.this;
                mU = bn1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new bn(1);
    }

    public void cancel()
    {
        synchronized (li)
        {
            mS = true;
            if (mT != null)
            {
                mT.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
