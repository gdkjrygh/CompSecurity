// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ar, bh, at, cx

class as extends Thread
    implements ar
{

    private static as afI;
    private final LinkedBlockingQueue afH = new LinkedBlockingQueue();
    private volatile at afJ;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean uL;

    private as(Context context)
    {
        super("GAThread");
        uL = false;
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

    static as P(Context context)
    {
        if (afI == null)
        {
            afI = new as(context);
        }
        return afI;
    }

    static at a(as as1)
    {
        return as1.afJ;
    }

    static at a(as as1, at at)
    {
        as1.afJ = at;
        return at;
    }

    private String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    static Context b(as as1)
    {
        return as1.mContext;
    }

    public void a(Runnable runnable)
    {
        afH.add(runnable);
    }

    void b(String s, long l)
    {
        a(new Runnable(this, l, s) {

            final ar afK;
            final long afL;
            final String afM;
            final as afN;

            public void run()
            {
                if (as.a(afN) == null)
                {
                    cx cx1 = cx.mQ();
                    cx1.a(as.b(afN), afK);
                    as.a(afN, cx1.mR());
                }
                as.a(afN).f(afL, afM);
            }

            
            {
                afN = as.this;
                afK = ar1;
                afL = l;
                afM = s;
                super();
            }
        });
    }

    public void bU(String s)
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
        Runnable runnable = (Runnable)afH.take();
        if (!uL)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            bh.B(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            bh.A((new StringBuilder()).append("Error on GAThread: ").append(a(throwable)).toString());
            bh.A("Google Analytics is shutting down.");
            uL = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
