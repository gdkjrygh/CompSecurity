// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bc;

import android.os.Handler;
import android.util.Log;

// Referenced classes of package p.bc:
//            a, c

class .Object
    implements Runnable
{

    final a a;

    private void a()
    {
        Object obj = p.bc.a.d(a);
        obj;
        JVM INSTR monitorenter ;
        if (p.bc.a.e(a) == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (Thread.interrupted()) goto _L2; else goto _L1
_L1:
        Log.d(p.bc.a.e(), "Rescheduling run()");
        if (!p.bc.a.e(a).postDelayed(this, p.bc.a.f(a)))
        {
            Log.e(p.bc.a.e(), "Couldn't reschedule run()");
        }
_L3:
        return;
_L2:
        Log.i(p.bc.a.e(), "The thread is interrupted; not scheduling heartbeat");
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Log.e(p.bc.a.e(), "HeartbeatThread handler is not set; not scheduling heartbeat");
        a.b();
          goto _L3
    }

    public void run()
    {
        Object obj = p.bc.a.a(a);
        obj;
        JVM INSTR monitorenter ;
        Log.d(p.bc.a.e(), "run()");
        if (!p.bc.a.b(a))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        Log.d(p.bc.a.e(), "ACK has been received, sending and scheduling heartbeat");
        if (p.bc.a.c(a) == null) goto _L2; else goto _L1
_L1:
        p.bc.a.c(a).a(a);
_L3:
        p.bc.a.a(a, false);
_L4:
        a();
        return;
_L2:
        Log.w(p.bc.a.e(), "Delegate is not set, scheduling heartbeat anyway");
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Log.d(p.bc.a.e(), "ACK has not been received");
        if (p.bc.a.c(a) != null)
        {
            a.b();
            p.bc.a.c(a).b(a);
        }
          goto _L4
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
