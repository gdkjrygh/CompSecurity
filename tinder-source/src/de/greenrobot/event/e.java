// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

// Referenced classes of package de.greenrobot.event:
//            h, c, EventBusException

final class e extends Handler
{

    final h a = new h();
    boolean b;
    private final int c = 10;
    private final c d;

    e(c c1, Looper looper)
    {
        super(looper);
        d = c1;
    }

    public final void handleMessage(Message message)
    {
        long l = SystemClock.uptimeMillis();
_L4:
        g g = a.a();
        message = g;
        if (g != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        message = a.a();
        if (message != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        b = false;
        this;
        JVM INSTR monitorexit ;
        b = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        d.a(message);
        if (SystemClock.uptimeMillis() - l < (long)c) goto _L4; else goto _L3
_L3:
        if (!sendMessage(obtainMessage()))
        {
            throw new EventBusException("Could not send handler message");
        }
        break MISSING_BLOCK_LABEL_103;
        message;
        b = false;
        throw message;
        message;
        this;
        JVM INSTR monitorexit ;
        throw message;
        b = true;
        return;
    }
}
