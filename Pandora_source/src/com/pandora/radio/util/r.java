// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            e, q

class r extends Thread
{

    private static final Runnable a = new Runnable() {

        public void run()
        {
        }

    };
    private e b;
    private q c;
    private long d;

    r(q q1, long l)
    {
        b = new e(false);
        c = q1;
        d = l;
        q1 = q1.getClass().getName();
        setName((new StringBuilder()).append("Worker-").append(q1.substring(q1.lastIndexOf('.') + 1)).toString());
    }

    public void a()
    {
        if (b.a())
        {
            return;
        }
        c.a(a);
        try
        {
            b.a(d);
            interrupt();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    public void run()
    {
_L1:
        Object obj;
        Runnable runnable;
        Runnable runnable1;
        try
        {
            runnable = (Runnable)c.a();
            runnable1 = a;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            b.b();
            return;
        }
        finally
        {
            b.b();
        }
        if (runnable == runnable1)
        {
            b.b();
            return;
        }
        runnable.run();
          goto _L1
        obj;
        p.df.a.b("Worker", "Worker exception", ((Throwable) (obj)));
          goto _L1
        throw obj;
    }

}
