// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.flurry.sdk:
//            he

class hd
{
    class a extends TimerTask
    {

        final hd a;

        public void run()
        {
            a.a();
            (new he()).b();
        }

        a()
        {
            a = hd.this;
            super();
        }
    }


    private Timer a;
    private a b;

    hd()
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
}
