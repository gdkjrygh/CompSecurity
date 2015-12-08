// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Timer;

class le
{

    private Timer a;
    private a b;

    le()
    {
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
        b = new a();
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

    private class a extends TimerTask
    {

        final le a;

        public void run()
        {
            a.a();
            (new lf()).b();
        }

        a()
        {
            a = le.this;
            super();
        }
    }

}
