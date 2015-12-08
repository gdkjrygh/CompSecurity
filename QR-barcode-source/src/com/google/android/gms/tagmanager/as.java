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

    private static as app;
    private final LinkedBlockingQueue apo = new LinkedBlockingQueue();
    private volatile at apq;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean yU;

    private as(Context context)
    {
        super("GAThread");
        yU = false;
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
        if (app == null)
        {
            app = new as(context);
        }
        return app;
    }

    static at a(as as1)
    {
        return as1.apq;
    }

    static at a(as as1, at at)
    {
        as1.apq = at;
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
        apo.add(runnable);
    }

    void b(String s, long l)
    {
        b(new Runnable(this, l, s) {

            final ar apr;
            final long aps;
            final as apt;
            final String wz;

            public void run()
            {
                if (as.a(apt) == null)
                {
                    cy cy1 = cy.pw();
                    cy1.a(as.b(apt), apr);
                    as.a(apt, cy1.px());
                }
                as.a(apt).f(aps, wz);
            }

            
            {
                apt = as.this;
                apr = ar1;
                aps = l;
                wz = s;
                super();
            }
        });
    }

    public void cC(String s)
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
        Runnable runnable = (Runnable)apo.take();
        if (!yU)
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
            yU = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
