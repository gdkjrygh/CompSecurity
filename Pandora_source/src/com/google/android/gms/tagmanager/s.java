// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.tagmanager:
//            r, zzbg, t, bp

class s extends Thread
    implements r
{

    private static s d;
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private volatile boolean b;
    private volatile boolean c;
    private volatile t e;
    private final Context f;

    private s(Context context)
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

    static s a(Context context)
    {
        if (d == null)
        {
            d = new s(context);
        }
        return d;
    }

    static t a(s s1)
    {
        return s1.e;
    }

    static t a(s s1, t t)
    {
        s1.e = t;
        return t;
    }

    private String a(Throwable throwable)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        PrintStream printstream = new PrintStream(bytearrayoutputstream);
        throwable.printStackTrace(printstream);
        printstream.flush();
        return new String(bytearrayoutputstream.toByteArray());
    }

    static Context b(s s1)
    {
        return s1.f;
    }

    public void a(Runnable runnable)
    {
        a.add(runnable);
    }

    public void a(String s1)
    {
        a(s1, System.currentTimeMillis());
    }

    void a(String s1, long l)
    {
        a(new Runnable(this, l, s1) {

            final r a;
            final long b;
            final String c;
            final s d;

            public void run()
            {
                if (s.a(d) == null)
                {
                    bp bp1 = bp.a();
                    bp1.a(s.b(d), a);
                    s.a(d, bp1.b());
                }
                s.a(d).a(b, c);
            }

            
            {
                d = s.this;
                a = r1;
                b = l;
                c = s2;
                super();
            }
        });
    }

    public void run()
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
            zzbg.zzal(interruptedexception.toString());
        }
        catch (Throwable throwable)
        {
            zzbg.zzak((new StringBuilder()).append("Error on Google TagManager Thread: ").append(a(throwable)).toString());
            zzbg.zzak("Google TagManager is shutting down.");
            b = true;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }
}
