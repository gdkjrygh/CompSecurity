// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import com.skype.android.event.EventBus;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.inject.LoginManager;
import com.skype.android.util.PerformanceLog;
import com.skype.android.wakeup.DreamKeeper;
import java.util.EnumSet;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            PushMessageListener, CallPushHandler, PushMessage, PushServiceType, 
//            SkyLibPushMessage

public class CallPushMessageListener
    implements PushMessageListener
{

    private static final Logger log = Logger.getLogger("CallPushMessageListener");
    private CallPushHandler callHandler;
    private LoginManager loginManager;

    public CallPushMessageListener(LoginManager loginmanager, SkyLib skylib, DreamKeeper dreamkeeper, EventBus eventbus)
    {
        loginManager = loginmanager;
        callHandler = new CallPushHandler(skylib, dreamkeeper);
        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    public EnumSet getSupportedEventTypes()
    {
        return PushMessageFactory.a.CALL.supportedTypes;
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPushHandlingComplete onpushhandlingcomplete)
    {
        com.skype.SkyLib.PUSHHANDLINGRESULT pushhandlingresult = onpushhandlingcomplete.getResult();
        int i = onpushhandlingcomplete.getPushId();
        log.info(String.format("push handling complete for id %d result %s", new Object[] {
            Integer.valueOf(i), pushhandlingresult
        }));
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT = new int[com.skype.SkyLib.PUSHHANDLINGRESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_CANNOT_CONNECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_NO_SIGNALING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_PUSH_IGNORED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_ANSWERED_ELSEWHERE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_CALL_ALREADY_ENDED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_CONFLICT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_NO_COMMON_CODEC.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.CALL_SETUP_FAILED_NO_PERMISSION.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$PUSHHANDLINGRESULT[com.skype.SkyLib.PUSHHANDLINGRESULT.BAD_NOTIFICATION_PAYLOAD.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.SkyLib.PUSHHANDLINGRESULT[pushhandlingresult.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            callHandler.retry(i);
            return;

        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
            callHandler.fail(i);
            break;
        }
    }

    public void onPushMessage(PushMessage pushmessage)
    {
        log.info("handling incoming call");
        PerformanceLog.d.a();
        if (pushmessage.getServiceType() == PushServiceType.GOOGLE_GCM)
        {
            log.info((new StringBuilder("GCMCALL:inbound;")).append(System.currentTimeMillis()).toString());
        }
        if (loginManager.loginIfRequired(true))
        {
            log.info("handling incoming call while logged in");
            callHandler.handleCall((SkyLibPushMessage)pushmessage);
        }
    }

}
