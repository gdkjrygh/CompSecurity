// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

final class lrq extends Thread
    implements lrp
{

    private static lrq d;
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile lrs e;
    private final Context f;

    private lrq(Context context)
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

    static lrq a(Context context)
    {
        if (d == null)
        {
            d = new lrq(context);
        }
        return d;
    }

    static lrs a(lrq lrq1)
    {
        return lrq1.e;
    }

    static lrs a(lrq lrq1, lrs lrs)
    {
        lrq1.e = lrs;
        return lrs;
    }

    static Context b(lrq lrq1)
    {
        return lrq1.f;
    }

    public final void a(Runnable runnable)
    {
        a.add(runnable);
    }

    public final void a(String s)
    {
        a(((Runnable) (new lrr(this, this, System.currentTimeMillis(), s))));
    }

    public final void run()
    {
_L2:
        boolean flag = c;
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
            lqh.c(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            StringBuilder stringbuilder = new StringBuilder("Error on Google TagManager Thread: ");
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            PrintStream printstream = new PrintStream(bytearrayoutputstream);
            throwable.printStackTrace(printstream);
            printstream.flush();
            lqh.a(stringbuilder.append(new String(bytearrayoutputstream.toByteArray())).toString());
            lqh.a("Google TagManager is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
