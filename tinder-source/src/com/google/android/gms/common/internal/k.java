// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            u

public final class k
    implements android.os.Handler.Callback
{
    public static interface a
    {

        public abstract boolean b();
    }


    public final a a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g;
    public final Handler h;
    public final Object i = new Object();

    public k(Looper looper, a a1)
    {
        e = false;
        g = false;
        a = a1;
        h = new Handler(looper, this);
    }

    public final void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public final void a(com.google.android.gms.common.api.c.c c1)
    {
        u.a(c1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(c1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(c1).append(" is already registered").toString());
_L2:
        return;
        d.add(c1);
        if (true) goto _L2; else goto _L1
_L1:
        c1;
        obj;
        JVM INSTR monitorexit ;
        throw c1;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.c.b b1 = (com.google.android.gms.common.api.c.b)message.obj;
            synchronized (i)
            {
                if (e && a.b() && b.contains(b1))
                {
                    b1.a(null);
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", (new StringBuilder("Don't know how to handle message: ")).append(message.what).toString(), new Exception());
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
