// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.SkyLib;
import com.skype.android.wakeup.DreamKeeper;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            SkyLibPushMessage, DisplayResult

public final class CallPushHandler
{
    private static final class a
    {

        private static final int MAX_RETRIES = 2;
        private int pushId;
        private SkyLibPushMessage pushMessage;
        private int retryCount;

        final int getPushId()
        {
            return pushId;
        }

        final boolean retry(SkyLib skylib1, int i)
        {
            if (retryCount < 2 && i == pushId)
            {
                retryCount = retryCount + 1;
                CallPushHandler.log.info((new StringBuilder("Retry ")).append(retryCount).toString());
                pushId = pushMessage.handleInSkyLib(skylib1);
                return true;
            } else
            {
                CallPushHandler.log.info((new StringBuilder("Call retry failed ")).append(retryCount).toString());
                return false;
            }
        }

        a(int i, SkyLibPushMessage skylibpushmessage)
        {
            retryCount = 0;
            pushId = i;
            pushMessage = skylibpushmessage;
        }
    }


    private static final Logger log = Logger.getLogger("CallPushMessageListener");
    private DreamKeeper dreamKeeper;
    private Map scopes;
    private SkyLib skylib;

    public CallPushHandler(SkyLib skylib1, DreamKeeper dreamkeeper)
    {
        skylib = skylib1;
        dreamKeeper = dreamkeeper;
        scopes = new HashMap();
    }

    private void checkLeave()
    {
        if (scopes.isEmpty())
        {
            onLeave();
        }
    }

    private void onLeave()
    {
        log.info("Last scope is left, cancelling call processing");
        dreamKeeper.d();
    }

    public final void fail(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (scopes.remove(Integer.valueOf(i)) != null)
        {
            checkLeave();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void handleCall(SkyLibPushMessage skylibpushmessage)
    {
        this;
        JVM INSTR monitorenter ;
        dreamKeeper.c();
        int i = skylibpushmessage.handleInSkyLib(skylib);
        log.info((new StringBuilder("handling push type: ")).append(skylibpushmessage.getEventType()).append(" with id: ").append(i).toString());
        skylibpushmessage.onMessageConsumed(DisplayResult.SUCCESS);
        scopes.put(Integer.valueOf(i), new a(i, skylibpushmessage));
        this;
        JVM INSTR monitorexit ;
        return;
        skylibpushmessage;
        throw skylibpushmessage;
    }

    public final boolean retry(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a a1 = (a)scopes.remove(Integer.valueOf(i));
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (!a1.retry(skylib, i)) goto _L4; else goto _L3
_L3:
        scopes.put(Integer.valueOf(a1.getPushId()), a1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return false;
_L4:
        checkLeave();
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }


}
