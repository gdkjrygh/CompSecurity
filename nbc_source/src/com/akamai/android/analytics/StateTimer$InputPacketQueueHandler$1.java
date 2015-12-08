// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.TimerTask;
import java.util.Vector;

// Referenced classes of package com.akamai.android.analytics:
//            StateTimer, StateTimerInputPacket

class this._cls1 extends TimerTask
{

    final op this$1;

    public void run()
    {
        Object obj = cess._mth0(this._cls1.this).stateTimerLock;
        obj;
        JVM INSTR monitorenter ;
_L2:
        Object obj1 = cess._mth0(this._cls1.this).inputPacketsQueueLock;
        obj1;
        JVM INSTR monitorenter ;
        StateTimerInputPacket statetimerinputpacket;
        if (cess._mth0(this._cls1.this).inputPacketsQueue.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        statetimerinputpacket = (StateTimerInputPacket)cess._mth0(this._cls1.this).inputPacketsQueue.remove(0);
_L3:
        cess._mth0(this._cls1.this).actOnTheInputPacket(statetimerinputpacket);
        if (statetimerinputpacket != null) goto _L2; else goto _L1
_L1:
        op();
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

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
