// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk:
//            dp, dw, cj, dt, 
//            dx, as, aq, do

public class bn extends Thread
{

    private static final String a = com/paypal/android/sdk/bn.getSimpleName();
    private dx b;
    private String c;
    private List d;
    private boolean e;
    private do f;
    private dp g;

    public bn(String s, dx dx1, do do1, dp dp1)
    {
        d = Collections.synchronizedList(new LinkedList());
        c = s;
        b = dx1;
        f = do1;
        g = dp1;
        start();
    }

    public final void a()
    {
        if (!e)
        {
            g.a();
            e = true;
            synchronized (d)
            {
                d.notifyAll();
            }
            interrupt();
            while (isAlive()) 
            {
                try
                {
                    Thread.sleep(10L);
                    (new StringBuilder("Waiting for ")).append(getClass().getSimpleName()).append(" to die");
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(dw dw1)
    {
        synchronized (d)
        {
            d.add(dw1);
            (new StringBuilder("Queued ")).append(dw1.o());
            d.notifyAll();
        }
        return;
        dw1;
        list;
        JVM INSTR monitorexit ;
        throw dw1;
    }

    public void run()
    {
        (new StringBuilder("Starting ")).append(getClass().getSimpleName());
_L3:
        if (e)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag = d.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        d.wait();
        Object obj = null;
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            try
            {
                ((dw) (obj)).a(((dw) (obj)).b());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((dw) (obj)).a(new as(aq.c.toString(), "JSON Exception in computeRequest", ((JSONException) (obj1)).getMessage()));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((dw) (obj)).a(new as(aq.c.toString(), "Unsupported encoding", ((UnsupportedEncodingException) (obj1)).getMessage()));
            }
            if (cj.a(c))
            {
                obj1 = f;
            } else
            {
                obj1 = g;
            }
            if (!((dt) (obj1)).b(((dw) (obj))))
            {
                b.a(((dw) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
          goto _L1
        obj = (dw)d.remove(0);
          goto _L1
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        (new StringBuilder()).append(getClass().getSimpleName()).append(" exiting");
        g.b();
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

}
