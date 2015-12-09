// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class cvm
{

    private static Logger c = Logger.getLogger(cvm.getName());
    public cvn a;
    public boolean b;

    public cvm()
    {
    }

    public static void a(Runnable runnable, Executor executor)
    {
        try
        {
            executor.execute(runnable);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            Logger logger = c;
            Level level = Level.SEVERE;
            runnable = String.valueOf(String.valueOf(runnable));
            executor = String.valueOf(String.valueOf(executor));
            logger.log(level, (new StringBuilder(runnable.length() + 57 + executor.length())).append("RuntimeException while executing runnable ").append(runnable).append(" with executor ").append(executor).toString(), runtimeexception);
            return;
        }
    }

    public final void a()
    {
        cvn cvn1 = null;
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        cvn cvn2;
        b = true;
        cvn2 = a;
        a = null;
        this;
        JVM INSTR monitorexit ;
          goto _L1
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        Exception exception;
        cvn cvn3;
        do
        {
            cvn3 = cvn1;
            if (cvn2 == null)
            {
                break;
            }
            cvn3 = cvn2.c;
            cvn2.c = cvn1;
            cvn1 = cvn2;
            cvn2 = cvn3;
        } while (true);
        for (; cvn3 != null; cvn3 = cvn3.c)
        {
            a(cvn3.a, cvn3.b);
        }

        return;
    }

}
