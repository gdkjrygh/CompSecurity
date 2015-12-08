// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public class lpr
    implements jyv
{

    final ScheduledExecutorService a;
    boolean b;

    public lpr(Context context, String s, lpt lpt)
    {
        this(context, s, lpt, null, null);
    }

    lpr(Context context, String s, lpt lpt, lsy lsy1, ds ds)
    {
        a = (new lsx(this)).a();
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        c();
        a.shutdown();
        b = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            throw new IllegalStateException("called method after closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }
}
