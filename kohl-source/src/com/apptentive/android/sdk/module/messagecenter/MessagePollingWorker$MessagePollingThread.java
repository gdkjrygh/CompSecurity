// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter;

import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.model.Configuration;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter:
//            MessagePollingWorker, MessageManager

private static class <init> extends Thread
{

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        Log.v("Started %s", new Object[] {
            toString()
        });
        if (MessagePollingWorker.access$100() != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        this;
        JVM INSTR monitorexit ;
        Log.v("Stopping MessagePollingThread.", new Object[0]);
        MessagePollingWorker.access$702(false);
        return;
_L2:
        long l;
        if (!MessagePollingWorker.access$200())
        {
            break MISSING_BLOCK_LABEL_146;
        }
        if (!MessagePollingWorker.access$300())
        {
            break; /* Loop/switch isn't completed */
        }
        l = MessagePollingWorker.access$400();
_L3:
        Configuration configuration = Configuration.load(MessagePollingWorker.access$100());
        if (Util.isNetworkConnectionPresent(MessagePollingWorker.access$100()) && configuration.isMessageCenterEnabled(MessagePollingWorker.access$100()))
        {
            Log.v("Checking server for new messages every %d seconds", new Object[] {
                Long.valueOf(l / 1000L)
            });
            MessageManager.fetchAndStoreMessages(MessagePollingWorker.access$100());
        }
        MessagePollingWorker.access$600(l);
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        Log.v("Stopping MessagePollingThread.", new Object[0]);
        MessagePollingWorker.access$702(false);
        throw exception;
_L1:
        l = MessagePollingWorker.access$500();
          goto _L3
        this;
        JVM INSTR monitorexit ;
        Log.v("Stopping MessagePollingThread.", new Object[0]);
        MessagePollingWorker.access$702(false);
        return;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
