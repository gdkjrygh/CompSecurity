// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d.b;

import android.os.Handler;
import android.util.Log;

// Referenced classes of package com.ford.syncV4.d.b:
//            a, e

final class b
    implements Runnable
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        Object obj = com.ford.syncV4.d.b.a.a(a);
        obj;
        JVM INSTR monitorenter ;
        Log.d(com.ford.syncV4.d.b.a.e(), "run()");
        if (!com.ford.syncV4.d.b.a.b(a)) goto _L2; else goto _L1
_L1:
        Log.d(com.ford.syncV4.d.b.a.e(), "ACK has been received, sending and scheduling heartbeat");
        if (com.ford.syncV4.d.b.a.c(a) == null) goto _L4; else goto _L3
_L3:
        com.ford.syncV4.d.b.a.c(a).a();
_L7:
        com.ford.syncV4.d.b.a.a(a, false);
_L8:
        obj = com.ford.syncV4.d.b.a.d(a);
        obj;
        JVM INSTR monitorenter ;
        if (com.ford.syncV4.d.b.a.e(a) == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (Thread.interrupted()) goto _L6; else goto _L5
_L5:
        Log.d(com.ford.syncV4.d.b.a.e(), "Rescheduling run()");
        if (!com.ford.syncV4.d.b.a.e(a).postDelayed(this, com.ford.syncV4.d.b.a.f(a)))
        {
            Log.e(com.ford.syncV4.d.b.a.e(), "Couldn't reschedule run()");
        }
_L9:
        return;
_L4:
        Log.w(com.ford.syncV4.d.b.a.e(), "Delegate is not set, scheduling heartbeat anyway");
          goto _L7
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        Log.d(com.ford.syncV4.d.b.a.e(), "ACK has not been received");
        if (com.ford.syncV4.d.b.a.c(a) != null)
        {
            a.b();
            com.ford.syncV4.d.b.a.c(a).b();
        }
          goto _L8
_L6:
        Log.i(com.ford.syncV4.d.b.a.e(), "The thread is interrupted; not scheduling heartbeat");
          goto _L9
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Log.e(com.ford.syncV4.d.b.a.e(), "HeartbeatThread handler is not set; not scheduling heartbeat");
        a.b();
          goto _L9
    }
}
