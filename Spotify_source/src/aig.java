// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Timer;
import java.util.TimerTask;

public final class aig extends TimerTask
{

    private aif a;

    public aig(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
label0:
        {
            synchronized (a)
            {
                if (a.N)
                {
                    break label0;
                }
            }
            return;
        }
        if (a.A != null)
        {
            a.A.cancel();
            a.A = null;
            a.e();
        }
        aif1;
        JVM INSTR monitorexit ;
        return;
        exception;
        aif1;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
