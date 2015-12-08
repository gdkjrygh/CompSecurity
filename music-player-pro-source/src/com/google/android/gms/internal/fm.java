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
//            gf, fn, gn, fy, 
//            fh, fj, gh, gq, 
//            gr, u, ai

public class fm extends gf
{

    private final Object mH;
    private final fc.a tA;
    private final fy.a tB;
    private final fj tn;
    private final fn ui;
    private Future uj;

    public fm(Context context, u u, ai ai, fy.a a1, fc.a a2)
    {
        this(a1, a2, new fn(context, u, ai, new gn(), a1));
    }

    fm(fy.a a1, fc.a a2, fn fn1)
    {
        mH = new Object();
        tB = a1;
        tn = a1.vK;
        tA = a2;
        ui = fn1;
    }

    static fc.a a(fm fm1)
    {
        return fm1.tA;
    }

    private fy s(int i)
    {
        return new fy(tB.vJ.tL, null, null, i, null, null, tn.orientation, tn.qA, tB.vJ.tO, false, null, null, null, null, null, tn.tX, tB.lS, tn.tV, tB.vG, tn.ua, tn.ub, tB.vD, null);
    }

    public void cx()
    {
        synchronized (mH)
        {
            uj = gh.submit(ui);
        }
        obj = (fy)uj.get(60000L, TimeUnit.MILLISECONDS);
        byte byte0 = -2;
_L1:
        if (obj == null)
        {
            obj = s(byte0);
        }
        gq.wR.post(new Runnable(((fy) (obj))) {

            final fy tG;
            final fm uk;

            public void run()
            {
                fm.a(uk).a(tG);
            }

            
            {
                uk = fm.this;
                tG = fy1;
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
            gr.W("Timed out waiting for native ad.");
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
        synchronized (mH)
        {
            if (uj != null)
            {
                uj.cancel(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
