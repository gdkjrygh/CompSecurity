// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.nuance.dragon.toolkit.d.b:
//            b

public final class a extends Handler
{

    private Handler a;
    private final ArrayList b = new ArrayList();

    public a()
    {
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = new Handler();
        if (b.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        (new StringBuilder("Attached handler to current thread, sending ")).append(b.size()).append(" queued messages");
        b b1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); a.sendMessageAtTime(b1.a, b1.b))
        {
            b1 = (b)iterator.next();
        }

        break MISSING_BLOCK_LABEL_99;
        Exception exception;
        exception;
        throw exception;
        b.clear();
        this;
        JVM INSTR monitorexit ;
    }

    public final boolean sendMessageAtTime(Message message, long l)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        b.add(new b(this, message, l));
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (a.getLooper().getThread().isAlive())
        {
            flag = a.sendMessageAtTime(message, l);
            continue; /* Loop/switch isn't completed */
        }
        (new StringBuilder("this msg [")).append(message).append("] will be ignore since the Looper Thread has been terminated already!");
        if (true) goto _L4; else goto _L3
_L3:
        message;
        throw message;
    }
}
