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
//            eu, bm, bl, bq, 
//            bp, ds, et, bt, 
//            bu

public final class bk
{

    private final bt kB;
    private final Object ls = new Object();
    private final Context mContext;
    private final ds ne;
    private final bm nf;
    private boolean ng;
    private bp nh;

    public bk(Context context, ds ds1, bt bt, bm bm1)
    {
        ng = false;
        mContext = context;
        ne = ds1;
        kB = bt;
        nf = bm1;
    }

    public bq a(long l, long l1)
    {
        Iterator iterator;
        eu.z("Starting mediation.");
        iterator = nf.nr.iterator();
_L4:
        bl bl1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        bl1 = (bl)iterator.next();
        eu.B((new StringBuilder()).append("Trying mediation network: ").append(bl1.nl).toString());
        iterator1 = bl1.nm.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            bq bq1;
            synchronized (ls)
            {
                if (!ng)
                {
                    break label0;
                }
                bq1 = new bq(-1);
            }
            return bq1;
        }
        nh = new bp(mContext, s, kB, nf, bl1, ne.pX, ne.kT, ne.kQ);
        obj;
        JVM INSTR monitorexit ;
        obj = nh.b(l, l1);
        if (((bq) (obj)).nL == 0)
        {
            eu.z("Adapter succeeded.");
            return ((bq) (obj));
        }
        break MISSING_BLOCK_LABEL_219;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((bq) (obj)).nN != null)
        {
            et.sv.post(new Runnable(((bq) (obj))) {

                final bq ni;
                final bk nj;

                public void run()
                {
                    try
                    {
                        ni.nN.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        eu.c("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                nj = bk.this;
                ni = bq1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new bq(1);
    }

    public void cancel()
    {
        synchronized (ls)
        {
            ng = true;
            if (nh != null)
            {
                nh.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
