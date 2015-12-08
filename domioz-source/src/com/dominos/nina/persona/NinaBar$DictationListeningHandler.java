// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.res.Resources;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.nina.persona:
//            NinaBar

class reset
    implements Runnable
{

    private int cycle;
    private final int delay;
    private final AtomicBoolean running = new AtomicBoolean(false);
    private final String text;
    final NinaBar this$0;

    void reset()
    {
        cycle = 0;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        StringBuilder stringbuilder;
        cycle = cycle & 3;
        stringbuilder = new StringBuilder(text);
        int i = 0;
_L2:
        if (i >= cycle)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append('.');
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        cycle = cycle + 1;
        NinaBar.access$800(NinaBar.this).setText(stringbuilder.toString());
        if (running.get())
        {
            postDelayed(this, delay);
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
        text = getString(text);
        delay = getInteger(_text_animation_delay);
        reset();
    }
}
