// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Timer;

// Referenced classes of package com.flurry.sdk:
//            kc, kl

public class kk
{

    private static final String a = com/flurry/sdk/kk.getSimpleName();
    private Timer b;
    private a c;
    private kl d;

    public kk(kl kl)
    {
        d = kl;
    }

    static kl a(kk kk1)
    {
        return kk1.d;
    }

    static String c()
    {
        return a;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.cancel();
            b = null;
            kc.a(3, a, "HttpRequestTimeoutTimer stopped.");
        }
        c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (b())
        {
            a();
        }
        b = new Timer("HttpRequestTimeoutTimer");
        c = new a(null);
        b.schedule(c, l);
        kc.a(3, a, (new StringBuilder("HttpRequestTimeoutTimer started: ")).append(l).append("MS").toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        return b != null;
    }


    private class a extends TimerTask
    {

        final kk a;

        public void run()
        {
            kc.a(3, kk.c(), "HttpRequest timed out. Cancelling.");
            kk.a(a).k();
        }

        private a()
        {
            a = kk.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }

}
