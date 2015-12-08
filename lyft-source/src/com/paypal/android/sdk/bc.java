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
//            aY, bg, bd, bh, 
//            aB, aA, aW

public class bc extends Thread
{

    private static final String a = com/paypal/android/sdk/bc.getSimpleName();
    private bh b;
    private String c;
    private List d;
    private boolean e;
    private aW f;
    private aY g;

    public bc(String s, bh bh1, aW aw, aY ay)
    {
        d = Collections.synchronizedList(new LinkedList());
        c = s;
        b = bh1;
        f = aw;
        g = ay;
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

    public final void a(bg bg1)
    {
        synchronized (d)
        {
            d.add(bg1);
            (new StringBuilder("Queued ")).append(bg1.o());
            d.notifyAll();
        }
        return;
        bg1;
        list;
        JVM INSTR monitorexit ;
        throw bg1;
    }

    public void run()
    {
        (new StringBuilder("Starting ")).append(getClass().getSimpleName());
_L3:
        if (e)
        {
            break MISSING_BLOCK_LABEL_219;
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
                ((bg) (obj)).a(((bg) (obj)).b());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((bg) (obj)).a(new aB(aA.c.toString(), "JSON Exception in computeRequest", ((JSONException) (obj1)).getMessage()));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((bg) (obj)).a(new aB(aA.c.toString(), "Unsupported encoding", ((UnsupportedEncodingException) (obj1)).getMessage()));
            }
            if (c.equals("mock"))
            {
                obj1 = f;
            } else
            {
                obj1 = g;
            }
            if (!((bd) (obj1)).b(((bg) (obj))))
            {
                b.a(((bg) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
          goto _L1
        obj = (bg)d.remove(0);
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
