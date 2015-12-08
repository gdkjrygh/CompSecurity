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
//            cn, ap, ao, at, 
//            as, bu, cm, aw, 
//            ax

public final class an
{

    private final aw dZ;
    private final bu eI;
    private final Object eJ = new Object();
    private final ap eK;
    private boolean eL;
    private as eM;
    private final Context mContext;

    public an(Context context, bu bu1, aw aw, ap ap1)
    {
        eL = false;
        mContext = context;
        eI = bu1;
        dZ = aw;
        eK = ap1;
    }

    public at a(long l, long l1)
    {
        Iterator iterator;
        cn.m("Starting mediation.");
        iterator = eK.eU.iterator();
_L4:
        ao ao1;
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        ao1 = (ao)iterator.next();
        cn.o((new StringBuilder()).append("Trying mediation network: ").append(ao1.eP).toString());
        iterator1 = ao1.eQ.iterator();
_L2:
        String s;
label0:
        {
            if (!iterator1.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            s = (String)iterator1.next();
            at at1;
            synchronized (eJ)
            {
                if (!eL)
                {
                    break label0;
                }
                at1 = new at(-1);
            }
            return at1;
        }
        eM = new as(mContext, s, dZ, eK, ao1, eI.gB, eI.ed);
        obj;
        JVM INSTR monitorexit ;
        obj = eM.b(l, l1);
        if (((at) (obj)).fl == 0)
        {
            cn.m("Adapter succeeded.");
            return ((at) (obj));
        }
        break MISSING_BLOCK_LABEL_212;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((at) (obj)).fn != null)
        {
            cm.hO.post(new Runnable(((at) (obj))) {

                final at eN;
                final an eO;

                public void run()
                {
                    try
                    {
                        eN.fn.destroy();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        cn.b("Could not destroy mediation adapter.", remoteexception);
                    }
                }

            
            {
                eO = an.this;
                eN = at1;
                super();
            }
            });
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return new at(1);
    }

    public void cancel()
    {
        synchronized (eJ)
        {
            eL = true;
            if (eM != null)
            {
                eM.cancel();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
