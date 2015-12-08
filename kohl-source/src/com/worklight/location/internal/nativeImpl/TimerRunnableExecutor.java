// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import com.worklight.location.internal.IRunnableExecutor;
import java.util.Timer;
import java.util.TimerTask;

public class TimerRunnableExecutor
    implements IRunnableExecutor
{

    private Timer timer;

    public TimerRunnableExecutor()
    {
        timer = new Timer("DwellTimer", true);
    }

    private TimerTask wrap(final Runnable r)
    {
        return new TimerTask() {

            final TimerRunnableExecutor this$0;
            final Runnable val$r;

            public void run()
            {
                r.run();
            }

            
            {
                this$0 = TimerRunnableExecutor.this;
                r = runnable;
                super();
            }
        };
    }

    public void execute(Runnable runnable)
    {
        timer.schedule(wrap(runnable), 0L);
    }

    public void execute(Runnable runnable, long l)
    {
        timer.schedule(wrap(runnable), l);
    }
}
