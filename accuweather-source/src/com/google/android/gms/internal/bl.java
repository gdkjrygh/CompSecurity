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
//            ev, bn, bm, br, 
//            bq, dt, eu, bu, 
//            bv

public final class bl
{

    private final bu kz;
    private final Object lq = new Object();
    private final Context mContext;
    private final dt nc;
    private final bn nd;
    private boolean ne;
    private bq nf;

    public bl(Context context, dt dt1, bu bu, bn bn1)
    {
        ne = false;
        mContext = context;
        nc = dt1;
        kz = bu;
        nd = bn1;
    }

    public br a(long l, long l1)
    {
        Iterator iterator;
        ev.z("Starting mediation.");
        iterator = nd.np.iterator();
_L4:
        bm bm1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        bm1 = (bm)iterator.next();
        ev.B((new StringBuilder()).append("Trying mediation network: ").append(bm1.nj).toString());
        iterator1 = bm1.nk.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            br br1;
            synchronized (lq)
            {
                if (!ne)
                {
                    break label0;
                }
                br1 = new br(-1);
            }
            return br1;
        }
        nf = new bq(mContext, s, kz, nd, bm1, nc.pV, nc.kR, nc.kO);
        obj;
        JVM INSTR monitorexit ;
        obj = nf.b(l, l1);
        if (((br) (obj)).nJ == 0)
        {
            ev.z("Adapter succeeded.");
            return ((br) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((br) (obj)).nL != null)
        {
            eu.ss.post(new Runnable(((br) (obj))) {

                final br ng;
                final bl nh;

                public void run()
                {
                    try
                    {
                        ng.nL.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        ev.c("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                nh = bl.this;
                ng = br1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new br(1);
    }

    public void cancel()
    {
        synchronized (lq)
        {
            ne = true;
            if (nf != null)
            {
                nf.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
