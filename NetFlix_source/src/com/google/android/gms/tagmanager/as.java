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

    private static as Ya;
    private final LinkedBlockingQueue XZ = new LinkedBlockingQueue();
    private volatile at Yb;
    private volatile boolean mClosed;
    private final Context mContext;
    private volatile boolean tx;

    private as(Context context)
    {
        super("GAThread");
        tx = false;
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

    static as H(Context context)
    {
        if (Ya == null)
        {
            Ya = new as(context);
        }
        return Ya;
    }

    static at a(as as1)
    {
        return as1.Yb;
    }

    static at a(as as1, at at)
    {
        as1.Yb = at;
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
        XZ.add(runnable);
    }

    void b(String s, long l)
    {
        a(new Runnable(this, l, s) {

            final ar Yc;
            final long Yd;
            final String Ye;
            final as Yf;

            public void run()
            {
                if (as.a(Yf) == null)
                {
                    cx cx1 = cx.lG();
                    cx1.a(as.b(Yf), Yc);
                    as.a(Yf, cx1.lH());
                }
                as.a(Yf).e(Yd, Ye);
            }

            
            {
                Yf = as.this;
                Yc = ar1;
                Yd = l;
                Ye = s;
                super();
            }
        });
    }

    public void bC(String s)
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
        Runnable runnable = (Runnable)XZ.take();
        if (!tx)
        {
            runnable.run();
        }
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        try
        {
            bh.x(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            bh.w((new StringBuilder()).append("Error on GAThread: ").append(a(throwable)).toString());
            bh.w("Google Analytics is shutting down.");
            tx = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
