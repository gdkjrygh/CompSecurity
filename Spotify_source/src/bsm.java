// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class bsm
    implements android.os.Handler.Callback
{

    public final bsn a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g;
    public final Handler h;
    public final Object i = new Object();

    public bsm(Looper looper, bsn bsn1)
    {
        e = false;
        g = false;
        a = bsn1;
        h = new Handler(looper, this);
    }

    public final void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public final void a(bqx bqx)
    {
        btl.a(bqx);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(bqx))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(bqx).append(" is already registered").toString());
_L2:
        return;
        d.add(bqx);
        if (true) goto _L2; else goto _L1
_L1:
        bqx;
        obj;
        JVM INSTR monitorexit ;
        throw bqx;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            bqw bqw1 = (bqw)message.obj;
            synchronized (i)
            {
                if (e && a.k() && b.contains(bqw1))
                {
                    bqw1.a(a.l_());
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
