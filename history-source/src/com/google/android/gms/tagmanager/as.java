// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ar, bh, at, cy

class as extends Thread
    implements ar
{

    private static as ary;
    private final LinkedBlockingQueue arx = new LinkedBlockingQueue();
    private volatile at arz;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean zK;

    private as(Context context)
    {
        super("GAThread");
        zK = false;
        mClosed = false;
        if (context != null)
        {
            mContext = context.getApplicationContext();
        } else
        {
            mContext = context;
        }
        start();
    }

    static as Z(Context context)
    {
        if (ary == null)
        {
            ary = new as(context);
        }
        return ary;
    }

    static at a(as as1)
    {
        return as1.arz;
    }

    static at a(as as1, at at)
    {
        as1.arz = at;
        return at;
    }

    static Context b(as as1)
    {
        return as1.mContext;
    }

    private String g(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    public void b(Runnable runnable)
    {
        arx.add(runnable);
    }

    void b(String s, long l)
    {
        b(new Runnable(this, l, s) {

            final ar arA;
            final long arB;
            final as arC;
            final String wO;

            public void run()
            {
                if (as.a(arC) == null)
                {
                    cy cy1 = cy.qN();
                    cy1.a(as.b(arC), arA);
                    as.a(arC, cy1.qO());
                }
                as.a(arC).f(arB, wO);
            }

            
            {
                arC = as.this;
                arA = ar1;
                arB = l;
                wO = s;
                super();
            }
        });
    }

    public void cE(String s)
    {
        b(s, System.currentTimeMillis());
    }

    public void run()
    {
_L2:
        if (mClosed)
        {
            break; /* Loop/switch isn't completed */
        }
        Runnable runnable = (Runnable)arx.take();
        if (!zK)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            bh.U(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            bh.T((new StringBuilder()).append("Error on Google TagManager Thread: ").append(g(throwable)).toString());
            bh.T("Google TagManager is shutting down.");
            zK = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
