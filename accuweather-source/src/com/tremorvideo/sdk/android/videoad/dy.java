// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dw, ct

class dy extends Thread
{

    final dw a;

    dy(dw dw1)
    {
        a = dw1;
        super();
    }

    public void run()
    {
_L3:
        try
        {
            if (dw.a(a))
            {
                dw.b(a);
            }
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        this;
        JVM INSTR monitorenter ;
        if (!dw.c(a))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        this;
        JVM INSTR monitorexit ;
        ct.d("Background thread exited");
        return;
        if (dw.a(a)) goto _L2; else goto _L1
_L1:
        ct.d("Download manager stopped");
        wait();
_L5:
        this;
        JVM INSTR monitorexit ;
          goto _L3
        Exception exception1;
        exception1;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (InterruptedException interruptedexception)
        {
            ct.a(interruptedexception);
        }
          goto _L3
_L2:
        if (!dw.d(a)) goto _L5; else goto _L4
_L4:
        ct.d("Download manager will be idle until next signal");
        wait();
          goto _L5
    }
}
