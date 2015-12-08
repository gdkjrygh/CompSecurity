// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package javax.jmdns.impl:
//            DNSTaskStarter

public static class _cancelled extends Timer
{

    private volatile boolean _cancelled;

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        _cancelled = true;
        super.cancel();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void schedule(TimerTask timertask, long l)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.schedule(timertask, l);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public void schedule(TimerTask timertask, long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.schedule(timertask, l, l1);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public void schedule(TimerTask timertask, Date date)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.schedule(timertask, date);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public void schedule(TimerTask timertask, Date date, long l)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.schedule(timertask, date, l);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public void scheduleAtFixedRate(TimerTask timertask, long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.scheduleAtFixedRate(timertask, l, l1);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public void scheduleAtFixedRate(TimerTask timertask, Date date, long l)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = _cancelled;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        super.scheduleAtFixedRate(timertask, date, l);
        if (true) goto _L1; else goto _L3
_L3:
        timertask;
        throw timertask;
    }

    public ()
    {
        _cancelled = false;
    }

    public _cancelled(String s, boolean flag)
    {
        super(s, flag);
        _cancelled = false;
    }
}
