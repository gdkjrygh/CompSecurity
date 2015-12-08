// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

public abstract class b
{
    private class a extends Handler
    {

        final b a;
        private final b b;

        public void handleMessage(Message message)
        {
            message = b;
            if (message != null)
            {
                long l = b.a(message) - SystemClock.elapsedRealtime();
                if (l <= 0L)
                {
                    message.c();
                    return;
                }
                if (l < b.b(message))
                {
                    sendMessageDelayed(obtainMessage(1), l);
                    return;
                }
                long l1 = SystemClock.elapsedRealtime();
                message.a(l);
                for (l = (b.b(message) + l1) - SystemClock.elapsedRealtime(); l < 0L; l += b.b(message)) { }
                if (!b.c(message))
                {
                    sendMessageDelayed(obtainMessage(1), l);
                    return;
                }
            }
        }

        public a(b b2)
        {
            a = b.this;
            super();
            b = b2;
        }
    }


    private final long a;
    private final long b;
    private long c;
    private boolean d;
    private Handler e;

    public b(long l, long l1)
    {
        d = false;
        e = new a(this);
        a = l;
        b = l1;
    }

    static long a(b b1)
    {
        return b1.c;
    }

    static long b(b b1)
    {
        return b1.b;
    }

    static boolean c(b b1)
    {
        return b1.d;
    }

    public final void a()
    {
        e.removeMessages(1);
        d = true;
    }

    public abstract void a(long l);

    public final b b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a > 0L) goto _L2; else goto _L1
_L1:
        c();
_L4:
        this;
        JVM INSTR monitorexit ;
        return this;
_L2:
        c = SystemClock.elapsedRealtime() + a;
        e.sendMessage(e.obtainMessage(1));
        d = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public abstract void c();
}
