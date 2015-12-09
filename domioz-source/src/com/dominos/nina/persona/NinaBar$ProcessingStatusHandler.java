// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.res.Resources;
import android.widget.EditText;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

class reset
    implements Runnable
{

    private int index;
    private final int messageDelay;
    private final String messages[];
    private final AtomicBoolean running = new AtomicBoolean(false);
    final NinaBar this$0;

    void reset()
    {
        index = 0;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        int i = index;
        if (messages.length > i)
        {
            NinaBar.access$300(NinaBar.this).setHint(messages[i]);
        }
        index = index + 1;
        if (running.get() && messages.length > index)
        {
            postDelayed(this, messageDelay);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void start()
    {
        this;
        JVM INSTR monitorenter ;
        if (!running.getAndSet(true))
        {
            post(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void stop()
    {
        this;
        JVM INSTR monitorenter ;
        if (running.getAndSet(false))
        {
            removeCallbacks(this);
        }
        reset();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    ()
    {
        this$0 = NinaBar.this;
        super();
        ninabar = getResources();
        messages = getStringArray(ts);
        messageDelay = getInteger(_delay);
        reset();
    }
}
