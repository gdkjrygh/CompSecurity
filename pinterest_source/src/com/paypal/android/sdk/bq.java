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
//            bk, bu, az, br, 
//            bv, aK, aL, bi

public class bq extends Thread
{

    private static final String a = com/paypal/android/sdk/bq.getSimpleName();
    private bv b;
    private String c;
    private List d;
    private boolean e;
    private bi f;
    private bk g;

    public bq(String s, bv bv1, bi bi, bk bk1)
    {
        d = Collections.synchronizedList(new LinkedList());
        c = s;
        b = bv1;
        f = bi;
        g = bk1;
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

    public final void a(bu bu1)
    {
        synchronized (d)
        {
            d.add(bu1);
            (new StringBuilder("Queued ")).append(bu1.o());
            d.notifyAll();
        }
        return;
        bu1;
        list;
        JVM INSTR monitorexit ;
        throw bu1;
    }

    public void run()
    {
        (new StringBuilder("Starting ")).append(getClass().getSimpleName());
_L3:
        if (e)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag = d.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_117;
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
                ((bu) (obj)).a(((bu) (obj)).b());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                String s = aK.c.toString();
                ((JSONException) (obj1)).getMessage();
                ((bu) (obj)).a(new aL(s, "JSON Exception in computeRequest"));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                String s1 = aK.c.toString();
                ((UnsupportedEncodingException) (obj1)).getMessage();
                ((bu) (obj)).a(new aL(s1, "Unsupported encoding"));
            }
            if (az.a(c))
            {
                obj1 = f;
            } else
            {
                obj1 = g;
            }
            if (!((br) (obj1)).b(((bu) (obj))))
            {
                b.a(((bu) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
          goto _L1
        obj = (bu)d.remove(0);
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
