// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import com.worklight.wlclient.WLRequestPiggybacker;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.util.Timer;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitter, PiggybackerFlush

final class EventTransmitterPiggybacker
    implements WLRequestPiggybacker
{

    private final long delay;
    private final EventTransmitter eventTransmitter;
    private Timer timer;

    public EventTransmitterPiggybacker(EventTransmitter eventtransmitter, long l)
    {
        eventTransmitter = eventtransmitter;
        delay = l;
    }

    public EventTransmitter getEventTransmitter()
    {
        return eventTransmitter;
    }

    public Timer getTimer()
    {
        return timer;
    }

    public void onFailure(WLFailResponse wlfailresponse)
    {
        if (wlfailresponse.getErrorCode() == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$wlclient$api$WLErrorCode[];

            static 
            {
                $SwitchMap$com$worklight$wlclient$api$WLErrorCode = new int[WLErrorCode.values().length];
                try
                {
                    $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.UNRESPONSIVE_HOST.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.REQUEST_TIMEOUT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.REQUEST_SERVICE_NOT_FOUND.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.APP_VERSION_ACCESS_DENIAL.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.worklight.wlclient.api.WLErrorCode[wlfailresponse.getErrorCode().ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 49
    //                   2 49
    //                   3 49
    //                   4 49;
           goto _L2 _L3 _L3 _L3 _L3
_L2:
        return;
_L3:
        eventTransmitter.setClientConnected(false);
        return;
    }

    public void onSuccess(WLResponse wlresponse)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        eventTransmitter.setClientConnected(true);
        flag = eventTransmitter.isTransmitting();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (timer != null)
        {
            timer.cancel();
        }
        timer = new Timer("Piggybacker timer");
        timer.schedule(new PiggybackerFlush(this), delay);
        if (true) goto _L1; else goto _L3
_L3:
        wlresponse;
        throw wlresponse;
    }

    public void processOptions(String s, WLRequestOptions wlrequestoptions)
    {
    }

    public void setTimer(Timer timer1)
    {
        timer = timer1;
    }
}
