// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

final class bjg extends Handler
{

    private final bjj a = new bjj();
    private final int b;
    private final bjd c;
    private boolean d;

    bjg(bjd bjd1, Looper looper, int i)
    {
        super(looper);
        c = bjd1;
        b = i;
    }

    void a(bjn bjn, Object obj)
    {
        bjn = bji.a(bjn, obj);
        this;
        JVM INSTR monitorenter ;
        a.a(bjn);
        if (!d)
        {
            d = true;
            if (!sendMessage(obtainMessage()))
            {
                throw new bjf("Could not send handler message");
            }
        }
        break MISSING_BLOCK_LABEL_54;
        bjn;
        this;
        JVM INSTR monitorexit ;
        throw bjn;
        this;
        JVM INSTR monitorexit ;
    }

    public void handleMessage(Message message)
    {
        long l = SystemClock.uptimeMillis();
_L4:
        bji bji1 = a.a();
        message = bji1;
        if (bji1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        message = a.a();
        if (message != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        d = false;
        this;
        JVM INSTR monitorexit ;
        d = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        c.a(message);
        if (SystemClock.uptimeMillis() - l < (long)b) goto _L4; else goto _L3
_L3:
        if (!sendMessage(obtainMessage()))
        {
            throw new bjf("Could not send handler message");
        }
        break MISSING_BLOCK_LABEL_103;
        message;
        d = false;
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        d = true;
        return;
    }
}
