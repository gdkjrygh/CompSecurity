// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.a;

import android.os.Handler;
import android.os.Message;
import java.util.LinkedList;

// Referenced classes of package com.facebook.common.a:
//            d, e

class g extends Handler
    implements android.os.MessageQueue.IdleHandler
{

    final d a;

    private g(d d1)
    {
        a = d1;
        super();
    }

    g(d d1, e e)
    {
        this(d1);
    }

    public void handleMessage(Message message)
    {
label0:
        {
            synchronized (d.a(a))
            {
                if (d.a(a).size() != 0)
                {
                    break label0;
                }
            }
            return;
        }
        Runnable runnable = (Runnable)d.a(a).removeFirst();
        message;
        JVM INSTR monitorexit ;
        runnable.run();
        synchronized (d.a(a))
        {
            a.a();
        }
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        message;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public boolean queueIdle()
    {
        handleMessage(null);
        return false;
    }
}
