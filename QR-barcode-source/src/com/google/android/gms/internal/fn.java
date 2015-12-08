// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal:
//            gg, fo, go, fz, 
//            fi, fk, gi, gr, 
//            gs, u, ai

public class fn extends gg
{

    private final Object mw;
    private final fk sZ;
    private final fo tU;
    private Future tV;
    private final fd.a tm;
    private final fz.a tn;

    public fn(Context context, u u, ai ai, fz.a a1, fd.a a2)
    {
        this(a1, a2, new fo(context, u, ai, new go(), a1));
    }

    fn(fz.a a1, fd.a a2, fo fo1)
    {
        mw = new Object();
        tn = a1;
        sZ = a1.vw;
        tm = a2;
        tU = fo1;
    }

    static fd.a a(fn fn1)
    {
        return fn1.tm;
    }

    private fz r(int i)
    {
        return new fz(tn.vv.tx, null, null, i, null, null, sZ.orientation, sZ.qj, tn.vv.tA, false, null, null, null, null, null, sZ.tJ, tn.lH, sZ.tH, tn.vs, sZ.tM, sZ.tN, tn.vp, null);
    }

    public void co()
    {
        synchronized (mw)
        {
            tV = gi.submit(tU);
        }
        obj = (fz)tV.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = r(byte0);
        }
        gr.wC.post(new Runnable(((fz) (obj))) {

            final fn tW;
            final fz ts;

            public void run()
            {
                fn.a(tW).a(ts);
            }

            
            {
                tW = fn.this;
                ts = fz1;
                super();
            }
        });
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            gs.W("Timed out waiting for native ad.");
            byte0 = 2;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            byte0 = 0;
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
            byte0 = -1;
        }
          goto _L1
    }

    public void onStop()
    {
        synchronized (mw)
        {
            if (tV != null)
            {
                tV.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
