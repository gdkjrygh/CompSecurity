// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;

public class buf extends Thread
{

    private static final String a = buf.getSimpleName();
    private buk b;
    private String c;
    private List d;
    private boolean e;
    private btx f;
    private btz g;

    public buf(String s, buk buk1, btx btx, btz btz1)
    {
        d = Collections.synchronizedList(new LinkedList());
        c = s;
        b = buk1;
        f = btx;
        g = btz1;
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

    public final void a(buj buj1)
    {
        synchronized (d)
        {
            d.add(buj1);
            (new StringBuilder("Queued ")).append(buj1.o());
            d.notifyAll();
        }
        return;
        buj1;
        list;
        JVM INSTR monitorexit ;
        throw buj1;
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
                ((buj) (obj)).a(((buj) (obj)).b());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                String s = brf.c.toString();
                ((JSONException) (obj1)).getMessage();
                ((buj) (obj)).a(new brg(s, "JSON Exception in computeRequest"));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                String s1 = brf.c.toString();
                ((UnsupportedEncodingException) (obj1)).getMessage();
                ((buj) (obj)).a(new brg(s1, "Unsupported encoding"));
            }
            if (bst.a(c))
            {
                obj1 = f;
            } else
            {
                obj1 = g;
            }
            if (!((bug) (obj1)).b(((buj) (obj))))
            {
                b.a(((buj) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
          goto _L1
        obj = (buj)d.remove(0);
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
