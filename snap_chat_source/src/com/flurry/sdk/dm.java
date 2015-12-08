// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;

class dm
{
    class a extends TimerTask
    {

        final dm a;
        private b b;

        public void run()
        {
            a.a();
            if (b != null)
            {
                b.q();
            }
        }

        a(b b1)
        {
            a = dm.this;
            super();
            b = b1;
        }
    }

    public static interface b
    {

        public abstract void q();
    }


    private Timer a;
    private a b;
    private b c;

    dm(b b1)
    {
        c = b1;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.cancel();
            a = null;
        }
        b = null;
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
        a = new Timer("FlurrySessionTimer");
        b = new a(c);
        a.schedule(b, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        return a != null;
    }
}
