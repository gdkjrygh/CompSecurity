// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;

// Referenced classes of package com.akamai.android.analytics:
//            AnalyticsPlugin, StateTimerOutputPacket, StateTimerOutputPacketType

class enable
    implements merOutputListener
{

    boolean enable;
    final AnalyticsPlugin this$0;

    public void disable()
    {
        Object obj = AnalyticsPlugin.access$1();
        obj;
        JVM INSTR monitorenter ;
        synchronized (AnalyticsPlugin.access$2(AnalyticsPlugin.this))
        {
            enable = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void event(StateTimerOutputPacket statetimeroutputpacket)
    {
        Object obj = AnalyticsPlugin.access$1();
        obj;
        JVM INSTR monitorenter ;
        synchronized (AnalyticsPlugin.access$2(AnalyticsPlugin.this))
        {
            if (enable)
            {
                break MISSING_BLOCK_LABEL_28;
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        AnalyticsPlugin.access$3(AnalyticsPlugin.this, statetimeroutputpacket);
        if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.DEBUG) goto _L2; else goto _L1
_L1:
        AnalyticsPlugin.access$4(AnalyticsPlugin.this, (String)statetimeroutputpacket.auxInfo);
_L3:
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        statetimeroutputpacket;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw statetimeroutputpacket;
        }
        // Misplaced declaration of an exception variable
        catch (StateTimerOutputPacket statetimeroutputpacket)
        {
            return;
        }
_L2:
        if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDINITLINE)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        AnalyticsPlugin.access$5(AnalyticsPlugin.this, statetimeroutputpacket);
          goto _L3
        statetimeroutputpacket;
        obj1;
        JVM INSTR monitorexit ;
        throw statetimeroutputpacket;
label0:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDFIRSTPLAYLINE)
            {
                break label0;
            }
            AnalyticsPlugin.access$6(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label1:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDPLAYLINE)
            {
                break label1;
            }
            AnalyticsPlugin.access$7(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label2:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDHEARTBEATLINE)
            {
                break label2;
            }
            AnalyticsPlugin.access$8(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label3:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDSTOPLINE)
            {
                break label3;
            }
            AnalyticsPlugin.access$9(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label4:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDERRORLINE)
            {
                break label4;
            }
            AnalyticsPlugin.access$9(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label5:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.WAITINGFORPOSTROLL)
            {
                break label5;
            }
            AnalyticsPlugin.access$10(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
label6:
        {
            if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.SENDFEEDBACKLINE)
            {
                break label6;
            }
            AnalyticsPlugin.access$11(AnalyticsPlugin.this, statetimeroutputpacket);
        }
          goto _L3
        if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.INTERNALERROR) goto _L5; else goto _L4
_L4:
        AnalyticsPlugin.access$12(AnalyticsPlugin.this, "State Timer Internal Error");
          goto _L3
_L5:
        if (statetimeroutputpacket.packetType != StateTimerOutputPacketType.TITLE_SWITCHED) goto _L3; else goto _L6
_L6:
        updateStateOnTitleSwitch((HashMap)statetimeroutputpacket.auxInfo);
          goto _L3
    }

    cket()
    {
        this$0 = AnalyticsPlugin.this;
        super();
        enable = true;
    }
}
