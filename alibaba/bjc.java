// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.concurrent.ExecutorService;

final class bjc
    implements Runnable
{

    private final bjj a = new bjj();
    private final bjd b;
    private volatile boolean c;

    bjc(bjd bjd1)
    {
        b = bjd1;
    }

    public void a(bjn bjn, Object obj)
    {
        bjn = bji.a(bjn, obj);
        this;
        JVM INSTR monitorenter ;
        a.a(bjn);
        if (!c)
        {
            c = true;
            b.b().execute(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bjn;
        this;
        JVM INSTR monitorexit ;
        throw bjn;
    }

    public void run()
    {
_L4:
        bji bji2 = a.a(1000);
        bji bji1 = bji2;
        if (bji2 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        bji1 = a.a();
        if (bji1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        c = false;
        this;
        JVM INSTR monitorexit ;
        c = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        b.a(bji1);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        Log.w("Event", (new StringBuilder()).append(Thread.currentThread().getName()).append(" was interruppted").toString(), ((Throwable) (obj)));
        c = false;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        c = false;
        throw obj;
    }
}
