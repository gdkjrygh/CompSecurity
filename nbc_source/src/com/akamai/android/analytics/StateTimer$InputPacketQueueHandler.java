// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

// Referenced classes of package com.akamai.android.analytics:
//            StateTimer, StateTimerInputPacket

class start extends Timer
{

    final StateTimer this$0;

    public void start()
    {
        schedule(new TimerTask() {

            final StateTimer.InputPacketQueueHandler this$1;

            public void run()
            {
                Object obj = stateTimerLock;
                obj;
                JVM INSTR monitorenter ;
_L2:
                Object obj1 = inputPacketsQueueLock;
                obj1;
                JVM INSTR monitorenter ;
                StateTimerInputPacket statetimerinputpacket;
                if (inputPacketsQueue.size() <= 0)
                {
                    break MISSING_BLOCK_LABEL_87;
                }
                statetimerinputpacket = (StateTimerInputPacket)inputPacketsQueue.remove(0);
_L3:
                actOnTheInputPacket(statetimerinputpacket);
                if (statetimerinputpacket != null) goto _L2; else goto _L1
_L1:
                stop();
                obj;
                JVM INSTR monitorexit ;
                return;
                statetimerinputpacket = null;
                  goto _L3
                Exception exception;
                exception;
                obj1;
                JVM INSTR monitorexit ;
                throw exception;
                exception;
                obj;
                JVM INSTR monitorexit ;
                try
                {
                    throw exception;
                }
                catch (Exception exception1)
                {
                    return;
                }
            }

            
            {
                this$1 = StateTimer.InputPacketQueueHandler.this;
                super();
            }
        }, 0L);
    }

    public void stop()
    {
        synchronized (inputPacketsQueueLock)
        {
            StateTimer statetimer = StateTimer.this;
            statetimer.activeQueueProcessingThreads = statetimer.activeQueueProcessingThreads - 1;
        }
        cancel();
        purge();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }


    public _cls1.this._cls1()
    {
        this$0 = StateTimer.this;
        statetimer = new StringBuilder("AkamaiStateEventHandler");
        int i = StateTimer.noOfEventHandlerIntstance;
        StateTimer.noOfEventHandlerIntstance = i + 1;
        super(append(i).toString());
        try
        {
            start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimer statetimer)
        {
            return;
        }
    }
}
