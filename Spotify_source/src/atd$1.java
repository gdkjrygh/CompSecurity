// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.util.Log;

final class ang.Object
    implements Runnable
{

    private atd a;

    public final void run()
    {
        Object obj = atd.a(a);
        obj;
        JVM INSTR monitorenter ;
        Log.d(atd.e(), "run()");
        if (!atd.b(a)) goto _L2; else goto _L1
_L1:
        Log.d(atd.e(), "ACK has been received, sending and scheduling heartbeat");
        if (atd.c(a) == null) goto _L4; else goto _L3
_L3:
        atd.c(a).a();
_L7:
        atd.a(a, false);
_L8:
        obj = atd.d(a);
        obj;
        JVM INSTR monitorenter ;
        if (atd.e(a) == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (Thread.interrupted()) goto _L6; else goto _L5
_L5:
        Log.d(atd.e(), "Rescheduling run()");
        if (!atd.e(a).postDelayed(this, atd.f(a)))
        {
            Log.e(atd.e(), "Couldn't reschedule run()");
        }
_L9:
        return;
_L4:
        Log.w(atd.e(), "Delegate is not set, scheduling heartbeat anyway");
          goto _L7
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        Log.d(atd.e(), "ACK has not been received");
        if (atd.c(a) != null)
        {
            a.b();
            atd.c(a).b();
        }
          goto _L8
_L6:
        Log.i(atd.e(), "The thread is interrupted; not scheduling heartbeat");
          goto _L9
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Log.e(atd.e(), "HeartbeatThread handler is not set; not scheduling heartbeat");
        a.b();
          goto _L9
    }

    (atd atd1)
    {
        a = atd1;
        super();
    }
}
