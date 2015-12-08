// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            aa, a

class eption extends Thread
{

    Runnable a;

    public void run()
    {
_L2:
        if (a != null)
        {
            try
            {
                a.run();
            }
            catch (RuntimeException runtimeexception)
            {
                com.jirbo.adcolony.a.e("Exception caught in reusable thread.");
                com.jirbo.adcolony.a.e(String.valueOf(runtimeexception));
                runtimeexception.printStackTrace();
            }
            a = null;
        }
        if (aa.f)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        synchronized (aa.a)
        {
            aa.b.add(this);
        }
        try
        {
            wait();
        }
        catch (InterruptedException interruptedexception) { }
        this;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    eption()
    {
    }
}
