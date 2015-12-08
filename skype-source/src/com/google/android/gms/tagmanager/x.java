// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            w, ak, y, bz

final class x extends Thread
    implements w
{

    private static x d;
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile y e;
    private final Context f;

    private x(Context context)
    {
        super("GAThread");
        b = false;
        c = false;
        if (context != null)
        {
            f = context.getApplicationContext();
        } else
        {
            f = context;
        }
        start();
    }

    static x a(Context context)
    {
        if (d == null)
        {
            d = new x(context);
        }
        return d;
    }

    static y a(x x1)
    {
        return x1.e;
    }

    static y a(x x1, y y)
    {
        x1.e = y;
        return y;
    }

    static Context b(x x1)
    {
        return x1.f;
    }

    public final void a(Runnable runnable)
    {
        a.add(runnable);
    }

    public final void a(String s)
    {
        a(new Runnable(this, System.currentTimeMillis(), s) {

            final w a;
            final long b;
            final String c;
            final x d;

            public final void run()
            {
                if (x.a(d) == null)
                {
                    bz bz1 = bz.c();
                    bz1.a(x.b(d), a);
                    x.a(d, bz1.d());
                }
                x.a(d).a(b, c);
            }

            
            {
                d = x.this;
                a = w1;
                b = l;
                c = s;
                super();
            }
        });
    }

    public final void run()
    {
_L2:
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        Runnable runnable = (Runnable)a.take();
        if (!b)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            ak.c(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            StringBuilder stringbuilder = new StringBuilder("Error on Google TagManager Thread: ");
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            PrintStream printstream = new PrintStream(bytearrayoutputstream);
            throwable.printStackTrace(printstream);
            printstream.flush();
            ak.a(stringbuilder.append(new String(bytearrayoutputstream.toByteArray())).toString());
            ak.a("Google TagManager is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
